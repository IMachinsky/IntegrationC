package biz.itcompany.model;

import javax.validation.constraints.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "task", schema = "dbo")
public class Task {

    @Id
    @Column(name = "task_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer taskId;

    @Column(name = "project_id", nullable = false)
    @NotNull(message = "Поле \"ID заказа\" не может быть пустым")
    private Integer projectId;

    @Column(name = "task_importance", nullable = false)
    @NotNull(message = "Поле \"Важность(приоритет)\" не может быть пустым")
    private Integer taskImportance;

    @Column(name = "task_dateend", nullable = false)
    @NotNull(message = "Поле \"Выполнить до:\" не может быть пустым")
    private Date taskDateEnd;

    @Column(name = "task_mission", nullable = false)
    @NotNull(message = "Поле \"Задание\" не может быть пустым")
    @Size(max=100, message = "Поле \"Задание\" не может содержать больше {max} символов")
    private String taskMission;

    public Task() {
    }

    public Task(Integer taskId,
                Integer projectId,
                Integer taskImportance,
                Date taskDateEnd,
                String taskMission) {
        this.taskId = taskId;
        this.projectId = projectId;
        this.taskImportance = taskImportance;
        this.taskDateEnd = taskDateEnd;
        this.taskMission = taskMission;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Date getTaskDateEnd() {
        return taskDateEnd;
    }

    public void setTaskDateEnd(Date taskDateEnd) {
        this.taskDateEnd = taskDateEnd;
    }

    public String getTaskMission() {
        return taskMission;
    }

    public void setTaskMission(String taskMission) {
        this.taskMission = taskMission;
    }

    public Integer getTaskImportance() {
        return taskImportance;
    }

    public void setTaskImportance(Integer taskImportance) {
        this.taskImportance = taskImportance;
    }
}
