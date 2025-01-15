package biz.itcompany.view;

import javax.persistence.Column;
import java.util.Date;

public class ContractWorkerView {

    @Column(name = "worker_lastname")
    private String workerLastName;

    @Column(name = "worker_name")
    private String workerName;

    @Column(name = "worker_middlename")
    private String workerMiddleName;

    @Column(name = "post_name")
    private String postName;

    @Column(name = "dir_lastname")
    private String dirLastName;

    @Column(name = "dir_name")
    private String dirName;

    @Column(name = "dir_middlename")
    private String dirMiddleName;

    @Column(name = "worker_datestartjob")
    private Date workerDateStartJob;

    @Column(name = "worker_dateendjob")
    private Date workerDateEndJob;

    @Column(name = "company_legalcity")
    private String companyLegalCity;

    @Column(name = "company_legalstreet")
    private String companyLegalStreet;

    @Column(name = "company_legalhouse")
    private String companyLegalHouse;

    @Column(name = "company_phonenumber")
    private String companyPhoneNumber;

    @Column(name = "worker_birthday")
    private Date workerBirthday;

    public ContractWorkerView() {
    }

    public String getWorkerLastName() {
        return workerLastName;
    }

    public void setWorkerLastName(String workerLastName) {
        this.workerLastName = workerLastName;
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

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getDirLastName() {
        return dirLastName;
    }

    public void setDirLastName(String dirLastName) {
        this.dirLastName = dirLastName;
    }

    public String getDirName() {
        return dirName;
    }

    public void setDirName(String dirName) {
        this.dirName = dirName;
    }

    public String getDirMiddleName() {
        return dirMiddleName;
    }

    public void setDirMiddleName(String dirMiddleName) {
        this.dirMiddleName = dirMiddleName;
    }

    public Date getWorkerDateStartJob() {
        return workerDateStartJob;
    }

    public void setWorkerDateStartJob(Date workerDateStartJob) {
        this.workerDateStartJob = workerDateStartJob;
    }

    public Date getWorkerDateEndJob() {
        return workerDateEndJob;
    }

    public void setWorkerDateEndJob(Date workerDateEndJob) {
        this.workerDateEndJob = workerDateEndJob;
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

    public String getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    public void setCompanyPhoneNumber(String companyPhoneNumber) {
        this.companyPhoneNumber = companyPhoneNumber;
    }

    public Date getWorkerBirthday() {
        return workerBirthday;
    }

    public void setWorkerBirthday(Date workerBirthday) {
        this.workerBirthday = workerBirthday;
    }
}
