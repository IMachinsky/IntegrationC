package biz.itcompany.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "projectstatus", schema = "dbo")
public class ProjectStatus {

    @Id
    @Column(name = "projectstatus_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer projectStatusId;

    @Column(name = "projectstatus_name", nullable = false)
    @NotNull(message = "Поле \"Наименование статуса проекта\" не может быть пустым")
    @Size(max=20, message = "Поле \"Наименование статуса проекта\" не может содержать больше {max} символов")
    private String projectStatusName;

    public ProjectStatus() {
    }

    public ProjectStatus(Integer projectStatusId, String projectStatusName) {
        this.projectStatusId = projectStatusId;
        this.projectStatusName = projectStatusName;
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
