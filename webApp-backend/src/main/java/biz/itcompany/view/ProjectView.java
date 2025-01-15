package biz.itcompany.view;

import javax.persistence.Column;

public class ProjectView {

    @Column(name = "project_id")
    private Integer projectId;

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

    @Column(name = "projectstatus_id")
    private Integer projectStatusId;

    @Column(name = "projectstatus_name")
    private String projectStatusName;

    public ProjectView() {
    }

    public ProjectView(Integer projectId,
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

    public Integer getProjectStatusId() {
        return projectStatusId;
    }

    public void setProjectStatusId(Integer projectStatusId) {
        this.projectStatusId = projectStatusId;
    }

    public String getProjectStatusName() {
        return projectStatusName;
    }

    public void setProjectStatusName(String projectStatusName) {
        this.projectStatusName = projectStatusName;
    }
}
