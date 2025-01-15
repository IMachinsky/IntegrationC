package biz.itcompany.view;

import javax.persistence.Column;
import java.util.Date;

public class MoveView {

    @Column(name = "move_id")
    private Integer moveId;

    @Column(name = "task_id")
    private Integer taskId;

    @Column(name  = "task_mission")
    private String taskMission;

    @Column(name = "sender_id")
    private Integer senderId;

    @Column(name = "sender_lastname")
    private String senderLastName;

    @Column(name = "sender_name")
    private String senderName;

    @Column(name = "sender_middlename")
    private String senderMiddleName;

    @Column(name = "recipient_id")
    private Integer recipientId;

    @Column(name = "recipient_lastname")
    private String recipientLastName;

    @Column(name = "sender_name")
    private String recipientName;

    @Column(name = "recipient_middlename")
    private String recipientMiddleName;

    @Column(name = "movestatus_id")
    private Integer moveStatusId;

    @Column(name = "movestatus_name")
    private String moveStatusName;

    @Column(name = "move_datestart")
    private Date moveDateStart;

    @Column(name = "move_dateend")
    private Date moveDateEnd;

    @Column(name = "move_desc")
    private String moveDesc;

    public MoveView() {
    }

    public MoveView(Integer moveId,
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

    public String getSenderLastName() {
        return senderLastName;
    }

    public void setSenderLastName(String senderLastName) {
        this.senderLastName = senderLastName;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderMiddleName() {
        return senderMiddleName;
    }

    public void setSenderMiddleName(String senderMiddleName) {
        this.senderMiddleName = senderMiddleName;
    }

    public Integer getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Integer recipientId) {
        this.recipientId = recipientId;
    }

    public String getRecipientLastName() {
        return recipientLastName;
    }

    public void setRecipientLastName(String recipientLastName) {
        this.recipientLastName = recipientLastName;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientMiddleName() {
        return recipientMiddleName;
    }

    public void setRecipientMiddleName(String recipientMiddleName) {
        this.recipientMiddleName = recipientMiddleName;
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

    public void setMoveStatusName(String moveStatusName) {
        this.moveStatusName = moveStatusName;
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

    public String getTaskMission() {
        return taskMission;
    }

    public void setTaskMission(String taskMission) {
        this.taskMission = taskMission;
    }
}
