package biz.itcompany.view;

import javax.persistence.Column;
import java.util.Date;

public class TaskView {

    @Column(name = "task_id")
    private Integer taskId;

    @Column(name = "project_id")
    private Integer projectId;

    @Column(name = "task_importance")
    private Integer taskImportance;

    @Column(name = "task_dateend")
    private Date taskDateEnd;

    @Column(name = "task_mission")
    private String taskMission;

    public TaskView() {
    }

    public TaskView(Integer taskId,
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

    public Integer getTaskImportance() {
        return taskImportance;
    }

    public void setTaskImportance(Integer taskImportance) {
        this.taskImportance = taskImportance;
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
}
