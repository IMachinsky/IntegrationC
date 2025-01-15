package biz.itcompany.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "move", schema = "dbo")
public class Move {

    @Id
    @Column(name = "move_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer moveId;

    @Column(name = "task_id", nullable = false)
    @NotNull(message = "Поле \"ID задания\" не может быть пустым")
    private Integer taskId;

    @Column(name = "sender_id", nullable = false)
    @NotNull(message = "Поле \"ID отправителя\" не может быть пустым")
    private Integer senderId;

    @Column(name = "recipient_id", nullable = false)
    @NotNull(message = "Поле \"ID получателя\" не может быть пустым")
    private Integer recipientId;

    @Column(name = "movestatus_id", nullable = false)
    @NotNull(message = "Поле \"ID статуса движения\" не может быть пустым")
    private Integer moveStatusId;

    @Column(name = "move_datestart", nullable = false)
    @NotNull(message = "Поле \"Дата начала\" не может быть пустым")
    private Date moveDateStart;

    @Column(name = "move_dateend", nullable = true)
    private Date moveDateEnd;

    @Column(name = "move_desc", nullable = false)
    @NotNull(message = "Поле \"Описание\" не может быть пустым")
    @Size(max=100, message = "Поле \"Описание\" не может содержать больше {max} символов")
    private String moveDesc;

    public Move() {
    }

    public Move(Integer moveId,
                Integer taskId,
                Integer senderId,
                Integer recipientId,
                Integer moveStatusId,
                Date moveDateStart,
                Date moveDateEnd,
                String moveDesc) {
        this.moveId = moveId;
        this.taskId = taskId;
        this.senderId = senderId;
        this.recipientId = recipientId;
        this.moveStatusId = moveStatusId;
        this.moveDateStart = moveDateStart;
        this.moveDateEnd = moveDateEnd;
        this.moveDesc = moveDesc;
    }

    public Integer getMoveId() {
        return moveId;
    }

    public void setMoveId(Integer moveId) {
        this.moveId = moveId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public Integer getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Integer recipientId) {
        this.recipientId = recipientId;
    }

    public Integer getMoveStatusId() {
        return moveStatusId;
    }

    public void setMoveStatusId(Integer moveStatusId) {
        this.moveStatusId = moveStatusId;
    }

    public Date getMoveDateStart() {
        return moveDateStart;
    }

    public void setMoveDateStart(Date moveDateStart) {
        this.moveDateStart = moveDateStart;
    }

    public Date getMoveDateEnd() {
        return moveDateEnd;
    }

    public void setMoveDateEnd(Date moveDateEnd) {
        this.moveDateEnd = moveDateEnd;
    }

    public String getMoveDesc() {
        return moveDesc;
    }

    public void setMoveDesc(String moveDesc) {
        this.moveDesc = moveDesc;
    }
}
