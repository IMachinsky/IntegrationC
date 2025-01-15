package biz.itcompany.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "order", schema = "dbo")
public class Order {

    @Id
    @Column(name = "order_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @Column(name = "worker_id", nullable = false)
    @NotNull(message = "Поле \"ID сотрудника\" не может быть пустым")
    private Integer workerId;

    @Column(name = "order_termscontract", nullable = false)
    @NotNull(message = "Поле \"Термины договора\" не может быть пустым")
    @Size(max=500, message = "Поле \"Термины договора\" не может содержать больше {max} символов")
    private String orderTermsContract;

    @Column(name = "order_obligationcustomer", nullable = false)
    @NotNull(message = "Поле \"Обязательства заказчика\" не может быть пустым")
    @Size(max=500, message = "Поле \"Обязательства заказчика\" не может содержать больше {max} символов")
    private String orderObligationCustomer;

    @Column(name = "order_obligationcontractor", nullable = false)
    @NotNull(message = "Поле \"Обязательства исполнителя\" не может быть пустым")
    @Size(max=500, message = "Поле \"Обязательства исполнителя\" не может содержать больше {max} символов")
    private String orderObligationContractor;

    @Column(name = "order_regulatorydocuments", nullable = false)
    @NotNull(message = "Поле \"Нормативные документы\" не может быть пустым")
    @Size(max=500, message = "Поле \"Нормативные документы\" не может содержать больше {max} символов")
    private String orderRegulatoryDocument;

    @Column(name = "client_id", nullable = false)
    @NotNull(message = "Поле \"ID клиента\" не может быть пустым")
    private Integer clientId;

    @Column(name = "order_dateopen", nullable = false)
    @NotNull(message = "Поле \"Дата заключения договора\" не может быть пустым")
    private Date orderDateOpen;

    @Column(name = "order_dateclose", nullable = false)
    @NotNull(message = "Поле \"Дата окончания договора\" не может быть пустым")
    private Date orderDateClose;

    public Order() {
    }

    public Order(Integer orderId,
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