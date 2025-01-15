package biz.itcompany.view;

import javax.persistence.Column;
import java.util.Date;

public class OrderView {

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "worker_id")
    private Integer workerId;

    @Column(name = "worker_lastname")
    private String workerLastName;

    @Column(name = "worker_name")
    private String workerName;

    @Column(name = "worker_middlename")
    private String workerMiddleName;

    @Column(name = "order_termscontract")
    private String orderTermsContract;

    @Column(name = "order_obligationcustomer")
    private String orderObligationCustomer;

    @Column(name = "order_obligationcontractor")
    private String orderObligationContractor;

    @Column(name = "order_regulatorydocuments")
    private String orderRegulatoryDocument;

    @Column(name = "client_id")
    private Integer clientId;

    @Column(name = "client_companyname")
    private String clientCompanyName;

    @Column(name = "order_dateopen")
    private Date orderDateOpen;

    @Column(name = "order_dateclose")
    private Date orderDateClose;

    public OrderView() {
    }

    public OrderView(Integer orderId,
                     Integer workerId,
                     String orderTermsContract,
                     String orderObligationCustomer,
                     String orderObligationContractor,
                     String orderRegulatoryDocument,
                     Integer clientId,
                     Date orderDateOpen,
                     Date orderDateClose) {
        this.orderId = orderId;
        this.workerId = workerId;
        this.orderTermsContract = orderTermsContract;
        this.orderObligationCustomer = orderObligationCustomer;
        this.orderObligationContractor = orderObligationContractor;
        this.orderRegulatoryDocument = orderRegulatoryDocument;
        this.clientId = clientId;
        this.orderDateOpen = orderDateOpen;
        this.orderDateClose = orderDateClose;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
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

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
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
}