package biz.itcompany.view;

import javax.persistence.Column;
import java.util.Date;

public class WorkerView {

    @Column(name = "worker_id")
    private Integer workerId;

    @Column(name = "worker_lastname")
    private String workerLastName;

    @Column(name = "worker_name")
    private String workerName;

    @Column(name = "worker_middlename")
    private String workerMiddleName;

    @Column(name = "worker_salary")
    private Integer workerSalary;

    @Column(name = "post_id")
    private Integer postId;

    @Column(name = "worker_birthday")
    private Date workerBirthday;

    @Column(name = "worker_datestartjob")
    private Date workerDateStartJob;

    @Column(name = "worker_dateendjob")
    private Date workerDateEndJob;

    @Column(name = "worker_password")
    private String workerPassword;

    @Column(name = "post_name")
    private String postName;

    public WorkerView() {
    }

    public WorkerView(Integer workerId,
                  String workerLastName,
                  String workerName,
                  String workerMiddleName,
                  Integer workerSalary,
                  Integer postId,
                  Date workerBirthday,
                  Date workerDateStartJob, Date workerDateEndJob,
                  String workerPassword) {
        this.workerId = workerId;
        this.workerLastName = workerLastName;
        this.workerName = workerName;
        this.workerMiddleName = workerMiddleName;
        this.workerSalary = workerSalary;
        this.postId = postId;
        this.workerBirthday = workerBirthday;
        this.workerDateStartJob = workerDateStartJob;
        this.workerDateEndJob = workerDateEndJob;
        this.workerPassword = workerPassword;
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

    public Integer getWorkerSalary() {
        return workerSalary;
    }

    public void setWorkerSalary(Integer workerSalary) {
        this.workerSalary = workerSalary;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Date getWorkerBirthday() {
        return workerBirthday;
    }

    public void setWorkerBirthday(Date workerBirthday) {
        this.workerBirthday = workerBirthday;
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

    public String getWorkerPassword() {
        return workerPassword;
    }

    public void setWorkerPassword(String workerPassword) {
        this.workerPassword = workerPassword;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }
}
