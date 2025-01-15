package biz.itcompany.view;

import javax.persistence.Column;

public class CompanyView {

    @Column(name = "company_id")
    private Integer companyId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "company_legalcity")
    private String companyLegalCity;

    @Column(name = "company_legalstreet")
    private String companyLegalStreet;

    @Column(name = "company_legalhouse")
    private String companyLegalHouse;

    @Column(name = "company_actualcity")
    private String companyFactCity;

    @Column(name = "company_actualstreet")
    private String companyFactStreet;

    @Column(name = "company_actualhouse")
    private String companyFactHouse;

    @Column(name = "worker_id")
    private Integer workerId;

    @Column(name = "worker_name")
    private String workerName;

    @Column(name = "worker_middlename")
    private String workerMiddleName;

    @Column(name = "worker_lastname")
    private String workerLastName;

    @Column(name = "company_phonenumber")
    private String companyPhoneNumber;

    public CompanyView() {
    }

    public CompanyView(Integer companyId,
                       String companyName,
                       String companyLegalCity,
                       String companyLegalStreet,
                       String companyLegalHouse,
                       String companyFactCity,
                       String companyFactStreet,
                       String companyFactHouse,
                       Integer workerId,
                       String companyPhoneNumber) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.companyLegalCity = companyLegalCity;
        this.companyLegalStreet = companyLegalStreet;
        this.companyLegalHouse = companyLegalHouse;
        this.companyFactCity = companyFactCity;
        this.companyFactStreet = companyFactStreet;
        this.companyFactHouse = companyFactHouse;
        this.workerId = workerId;
        this.companyPhoneNumber = companyPhoneNumber;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyLegalCity() {
        return companyLegalCity;
    }

    public void setCompanyLegalCity(String companyLegalCity) {
        this.companyLegalCity = companyLegalCity;
    }

    public String getCompanyLegalStreet() {
        return companyLegalStreet;
    }

    public void setCompanyLegalStreet(String companyLegalStreet) {
        this.companyLegalStreet = companyLegalStreet;
    }

    public String getCompanyLegalHouse() {
        return companyLegalHouse;
    }

    public void setCompanyLegalHouse(String companyLegalHouse) {
        this.companyLegalHouse = companyLegalHouse;
    }

    public String getCompanyFactCity() {
        return companyFactCity;
    }

    public void setCompanyFactCity(String companyFactCity) {
        this.companyFactCity = companyFactCity;
    }

    public String getCompanyFactStreet() {
        return companyFactStreet;
    }

    public void setCompanyFactStreet(String companyFactStreet) {
        this.companyFactStreet = companyFactStreet;
    }

    public String getCompanyFactHouse() {
        return companyFactHouse;
    }

    public void setCompanyFactHouse(String companyFactHouse) {
        this.companyFactHouse = companyFactHouse;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerMiddleName() {
        return workerMiddleName;
    }

    public void setWorkerMiddleName(String workerMiddleName) {
        this.workerMiddleName = workerMiddleName;
    }

    public String getWorkerLastName() {
        return workerLastName;
    }

    public void setWorkerLastName(String workerLastName) {
        this.workerLastName = workerLastName;
    }

    public String getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    public void setCompanyPhoneNumber(String companyPhoneNumber) {
        this.companyPhoneNumber = companyPhoneNumber;
    }
}
