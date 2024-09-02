package com.symergylimited.symergy.wastecollectorsendpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getAllCompanies(){
        return companyRepository.findAll();
    }

    public Optional<Company> getCompanyById(Long id){
        return companyRepository.findById(id);
    }

    public Company addCompany(Company company){
        return companyRepository.save(company);
    }

    public Company updateCompany(Long id, Company companyDetail){
        Company company = companyRepository.findById(id).orElseThrow(()->new RuntimeException("Company not found"));
        company.setName(companyDetail.getName());
        company.setLogoUrl(companyDetail.getLogoUrl());
        company.setDaysOfOperation(companyDetail.getDaysOfOperation());
        company.setOpeningTime(companyDetail.getOpeningTime());
        company.setClosingTime(companyDetail.getClosingTime());
        company.setLocationOfOperation(companyDetail.getLocationOfOperation());
        company.setServiceOffered(company.getServiceOffered());
        return companyRepository.save(company);
    }

    public void deleteCompany(Long id){
        companyRepository.deleteById(id);
    }

    public void deleteAllCompanies(){
        companyRepository.deleteAll();
    }

}
