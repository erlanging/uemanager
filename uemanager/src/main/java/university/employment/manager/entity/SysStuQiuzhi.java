package university.employment.manager.entity;

import java.io.Serializable;

public class SysStuQiuzhi implements Serializable {
    private Integer qzid;

    private Integer stuid;

    private Integer zpid;

    private static final long serialVersionUID = 1L;

    public Integer getQzid() {
        return qzid;
    }

    public void setQzid(Integer qzid) {
        this.qzid = qzid;
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
        SysStuQiuzhi other = (SysStuQiuzhi) that;
        return (this.getQzid() == null ? other.getQzid() == null : this.getQzid().equals(other.getQzid()))
            && (this.getStuid() == null ? other.getStuid() == null : this.getStuid().equals(other.getStuid()))
            && (this.getZpid() == null ? other.getZpid() == null : this.getZpid().equals(other.getZpid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQzid() == null) ? 0 : getQzid().hashCode());
        result = prime * result + ((getStuid() == null) ? 0 : getStuid().hashCode());
        result = prime * result + ((getZpid() == null) ? 0 : getZpid().hashCode());
        return result;
    }
}