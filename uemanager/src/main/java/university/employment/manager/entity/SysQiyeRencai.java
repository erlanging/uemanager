package university.employment.manager.entity;

import java.io.Serializable;

public class SysQiyeRencai implements Serializable {
    private Integer rcid;

    private Integer qyid;

    private Integer stuid;

    private Integer zpid;

    private static final long serialVersionUID = 1L;

    public Integer getRcid() {
        return rcid;
    }

    public void setRcid(Integer rcid) {
        this.rcid = rcid;
    }

    public Integer getQyid() {
        return qyid;
    }

    public void setQyid(Integer qyid) {
        this.qyid = qyid;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Integer getZpid() {
        return zpid;
    }

    public void setZpid(Integer zpid) {
        this.zpid = zpid;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysQiyeRencai other = (SysQiyeRencai) that;
        return (this.getRcid() == null ? other.getRcid() == null : this.getRcid().equals(other.getRcid()))
            && (this.getQyid() == null ? other.getQyid() == null : this.getQyid().equals(other.getQyid()))
            && (this.getStuid() == null ? other.getStuid() == null : this.getStuid().equals(other.getStuid()))
            && (this.getZpid() == null ? other.getZpid() == null : this.getZpid().equals(other.getZpid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRcid() == null) ? 0 : getRcid().hashCode());
        result = prime * result + ((getQyid() == null) ? 0 : getQyid().hashCode());
        result = prime * result + ((getStuid() == null) ? 0 : getStuid().hashCode());
        result = prime * result + ((getZpid() == null) ? 0 : getZpid().hashCode());
        return result;
    }
}