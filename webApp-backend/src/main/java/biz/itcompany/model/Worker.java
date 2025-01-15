package biz.itcompany.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name="worker", schema = "dbo")
public class Worker {

    @Id
    @Column(name = "worker_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer workerId;

    @Column(name = "worker_lastname", nullable = false)
    @NotNull(message = "Поле \"Фамилия сотрудника\" не может быть пустым")
    @Size(max=20, message = "Поле \"Фамилия сотрудника\" не может содержать больше {max} символов")
    private String workerLastName;

    @Column(name = "worker_name", nullable = false)
    @NotNull(message = "Поле \"Имя сотрудника\" не может быть пустым")
    @Size(max=20, message = "Поле \"Имя сотрудника\" не может содержать больше {max} символов")
    private String workerName;

    @Column(name = "worker_middlename", nullable = false)
    @NotNull(message = "Поле \"Отчество сотрудника\" не может быть пустым")
    @Size(max=20, message = "Поле \"Отчество сотрудника\" не может содержать больше {max} символов")
    private String workerMiddleName;

    @Column(name = "worker_salary", nullable = false)
    @NotNull(message = "Поле \"Заработная плата сотрудника\" не может быть пустым")
    private Integer workerSalary;

    @Column(name = "post_id", nullable = false)
    @NotNull(message = "Поле \"Должность сотрудника\" не может быть пустым")
    private Integer postId;

    @Column(name = "worker_birthday", nullable = false)
    @NotNull(message = "Поле \"Дата рождения сотрудника\" не может быть пустым")
    private Date workerBirthday;

    @Column(name = "worker_datestartjob", nullable = false)
    @NotNull(message = "Поле \"Дата начала работы в компании\" не может быть пустым")
    private Date workerDateStartJob;

    @Column(name = "worker_dateendjob", nullable = true)
    private Date workerDateEndJob;

    @Column(name = "worker_password", nullable = false)
    @NotNull(message = "Поле \"Пароль сотрудника\" не может быть пустым")
    @Size(max=10, message = "Поле \"Пароль сотрудника\" не может содержать больше {max} символов")
    private String workerPassword;

    public Worker() {
    }

    public Worker(Integer workerId,
                  String workerLastName,
                  String workerName,
                  String workerMiddleName,
                  Integer workerSalary,
                  Integer postId,
                  Date workerBirthday,
                  Date workerDateStartJob,
                  Date workerDateEndJob,
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
}
