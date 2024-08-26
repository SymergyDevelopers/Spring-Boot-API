package com.symergylimited.symergy.wastecollectorsendpoint;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {

    //additional query methods if needed

}
