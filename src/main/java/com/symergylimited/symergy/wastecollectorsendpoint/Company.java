package com.symergylimited.symergy.wastecollectorsendpoint;


import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String logoUrl;

    private String daysOfOperation;

    private LocalTime openingTime;

    private LocalTime closingTime;

    private String locationOfOperation;

    private String pricing;

    private String serviceOffered;

    public Company(){}

    public Company(String name,String logoUrl, String daysOfOperation, LocalTime openingTime, LocalTime closingTime, String locationOfOperation, String pricing,String serviceOffered){
        this.name = name;
        this.logoUrl = logoUrl;
        this.daysOfOperation = daysOfOperation;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.locationOfOperation = locationOfOperation;
        this.pricing = pricing;
        this.serviceOffered = serviceOffered;
    }

    public String getPricing() {
        return pricing;
    }

    public void setPricing(String pricing) {
        this.pricing = pricing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getDaysOfOperation() {
        return daysOfOperation;
    }

    public void setDaysOfOperation(String daysOfOperation) {
        this.daysOfOperation = daysOfOperation;
    }

    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    public String getLocationOfOperation() {
        return locationOfOperation;
    }

    public void setLocationOfOperation(String locationOfOperation) {
        this.locationOfOperation = locationOfOperation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceOffered() {
        return serviceOffered;
    }

    public void setServiceOffered(String serviceOffered) {
        this.serviceOffered = serviceOffered;
    }
}
