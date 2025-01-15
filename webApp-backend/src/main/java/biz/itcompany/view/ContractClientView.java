package biz.itcompany.view;

import javax.persistence.Column;
import java.util.Date;

public class ContractClientView {

    @Column(name = "order_termscontract")
    private String orderTermsContract;

    @Column(name = "order_obligationcustomer")
    private String orderObligationCustomer;

    @Column(name = "order_obligationcontractor")
    private String orderObligationContractor;

    @Column(name = "order_regulatorydocuments")
    private String orderRegulatoryDocument;

    @Column(name = "client_companyname")
    private String clientCompanyName;

    @Column(name = "client_city")
    private String clientCity;

    @Column(name = "client_street")
    private String clientStreet;

    @Column(name = "client_house")
    private String clientHouse;

    @Column(name = "client_phonenumber")
    private String clientPhoneNumber;

    @Column(name = "order_dateopen")
    private Date orderDateOpen;

    @Column(name = "order_dateclose")
    private Date orderDateClose;

    @Column(name = "worker_lastname")
    private String workerLastName;

    @Column(name = "worker_name")
    private String workerName;

    @Column(name = "worker_middlename")
    private String workerMiddleName;

    @Column(name = "company_legalcity")
    private String companyLegalCity;

    @Column(name = "company_legalstreet")
    private String companyLegalStreet;

    @Column(name = "company_legalhouse")
    private String companyLegalHouse;

    @Column(name = "company_phonenumber")
    private String companyPhoneNumber;

    @Column(name = "client_lastname")
    private String clientLastName;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_middlename")
    private String clientMiddleName;

    public ContractClientView() {
    }

    public String getOrderTermsContract() {
        return orderTermsContract;
    }

    public void setOrderTermsContract(String orderTermsContract) {
        this.orderTermsContract = orderTermsContract;
    }

    public String getOrderObligationCustomer() {
        return orderObligationCustomer;
    }

    public void setOrderObligationCustomer(String orderObligationCustomer) {
        this.orderObligationCustomer = orderObligationCustomer;
    }

    public String getOrderObligationContractor() {
        return orderObligationContractor;
    }

    public void setOrderObligationContractor(String orderObligationContractor) {
        this.orderObligationContractor = orderObligationContractor;
    }

    public String getOrderRegulatoryDocument() {
        return orderRegulatoryDocument;
    }

    public void setOrderRegulatoryDocument(String orderRegulatoryDocument) {
        this.orderRegulatoryDocument = orderRegulatoryDocument;
    }

    public String getClientCompanyName() {
        return clientCompanyName;
    }

    public void setClientCompanyName(String clientCompanyName) {
        this.clientCompanyName = clientCompanyName;
    }

    public Date getOrderDateOpen() {
        return orderDateOpen;
    }

    public void setOrderDateOpen(Date orderDateOpen) {
        this.orderDateOpen = orderDateOpen;
    }

    public Date getOrderDateClose() {
        return orderDateClose;
    }

    public void setOrderDateClose(Date orderDateClose) {
        this.orderDateClose = orderDateClose;
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

    public String getClientCity() {
        return clientCity;
    }

    public void setClientCity(String clientCity) {
        this.clientCity = clientCity;
    }

    public String getClientStreet() {
        return clientStreet;
    }

    public void setClientStreet(String clientStreet) {
        this.clientStreet = clientStreet;
    }

    public String getClientHouse() {
        return clientHouse;
    }

    public void setClientHouse(String clientHouse) {
        this.clientHouse = clientHouse;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
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

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientMiddleName() {
        return clientMiddleName;
    }

    public void setClientMiddleName(String clientMiddleName) {
        this.clientMiddleName = clientMiddleName;
    }
}
