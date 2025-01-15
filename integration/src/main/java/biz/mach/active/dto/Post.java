package biz.mach.active.dto;

public class Post {

    private Integer directionId;

    private String directionName;

    private String directionDesc;

    public Post() {
    }

    public Post(Integer directionId,
                String directionName,
                String directionDesc) {
        this.directionId = directionId;
        this.directionName = directionName;
        this.directionDesc = directionDesc;
    }

    public Integer getDirectionId() {
        return directionId;
    }

    public void setDirectionId(Integer directionId) {
        this.directionId = directionId;
    }

    public String getDirectionName() {
        return directionName;
    }

    public void setDirectionName(String directionName) {
        this.directionName = directionName;
    }

    public String getDirectionDesc() {
        return directionDesc;
    }

    public void setDirectionDesc(String directionDesc) {
        this.directionDesc = directionDesc;
    }
}
