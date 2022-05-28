package cacttus.education.generics_interfaces.models;

import java.time.LocalDateTime;

// kush e inserton -> String, Int
public abstract class BaseObject<T> {
    private T insertBy; //createdBy ose addedBy
    private LocalDateTime insertDate; //createdAt
    private T updateBy; //modifiedBy
    private LocalDateTime updateDate; //modifiedAt
    private int updateNo; // modifiedNo

    public BaseObject() {
    }

    public BaseObject(T insertBy, LocalDateTime insertDate) {
        this.insertBy = insertBy;
        this.insertDate = insertDate;
    }

    public BaseObject(T updateBy, LocalDateTime updateDate, int updateNo) {
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.updateNo = updateNo;
    }

    public BaseObject(T insertBy, LocalDateTime insertDate, T updateBy, LocalDateTime updateDate, int updateNo) {
        this.insertBy = insertBy;
        this.insertDate = insertDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.updateNo = updateNo;
    }

    public T getInsertBy() {
        return insertBy;
    }

    public void setInsertBy(T insertBy) {
        this.insertBy = insertBy;
    }

    public LocalDateTime getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(LocalDateTime insertDate) {
        this.insertDate = insertDate;
    }

    public T getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(T updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public int getUpdateNo() {
        return updateNo;
    }

    public void setUpdateNo(int updateNo) {
        this.updateNo = updateNo;
    }
}
