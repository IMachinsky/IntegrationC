package biz.itcompany.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="movestatus", schema = "dbo")
public class MoveStatus {

    @Id
    @Column(name = "movestatus_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer moveStatusId;

    @Column(name = "movestatus_name", nullable = false)
    @NotNull(message = "Поле \"Наименование статуса движения\" не может быть пустым")
    @Size(max=20, message = "Поле \"Наименование статусадвижения\" не может содержать больше {max} символов")
    private String moveStatusName;

    public MoveStatus() {
    }

    public MoveStatus(Integer moveStatusId, String moveStatusName) {
        this.moveStatusId = moveStatusId;
        this.moveStatusName = moveStatusName;
    }

    public Integer getMoveStatusId() {
        return moveStatusId;
    }

    public void setMoveStatusId(Integer moveStatusId) {
        this.moveStatusId = moveStatusId;
    }

    public String getMoveStatusName() {
        return moveStatusName;
    }

    public void setMoveName(String moveStatusName) {
        this.moveStatusName = moveStatusName;
    }
}
