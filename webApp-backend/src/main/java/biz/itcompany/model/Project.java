package biz.itcompany.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "project", schema = "dbo")
public class Project {

    @Id
    @Column(name = "project_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer projectId;

    @Column(name = "order_id", nullable = false)
    @NotNull(message = "Поле \"ID заказа\" не может быть пустым")
    private Integer orderId;

    @Column(name = "worker_id", nullable = false)
    @NotNull(message = "Поле \"ID сотрудника\" не может быть пустым")
    private Integer workerId;

    @Column(name = "projectstatus_id", nullable = false)
    @NotNull(message = "Поле \"ID статуса проекта\" не может быть пустым")
    private Integer projectStatusId;

    public Project() {
    }

    public Project(Integer projectId,
                   Integer orderId,
                   Integer workerId,
                   Integer projectStatusId) {
        this.projectId = projectId;
        this.orderId = orderId;
        this.workerId = workerId;
        this.projectStatusId = projectStatusId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
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

    public Integer getProjectStatusId() {
        return projectStatusId;
    }

    public void setProjectStatusId(Integer projectStatusId) {
        this.projectStatusId = projectStatusId;
    }
}
