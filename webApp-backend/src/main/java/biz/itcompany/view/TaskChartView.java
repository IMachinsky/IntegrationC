package biz.itcompany.view;

import javax.persistence.Column;
import java.util.Date;

public class TaskChartView {

    @Column(name = "move_dateend")
    private Date moveDateEnd;

    @Column(name = "move_count")
    private Long moveCount;

    public TaskChartView() {
    }

    public Date getMoveDateEnd() {
        return moveDateEnd;
    }

    public void setMoveDateEnd(Date moveDateEnd) {
        this.moveDateEnd = moveDateEnd;
    }

    public Long getMoveCount() {
        return moveCount;
    }

    public void setMoveCount(Long moveCount) {
        this.moveCount = moveCount;
    }
}
