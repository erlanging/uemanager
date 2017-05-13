package university.employment.manager.entity;

import java.io.Serializable;

public class SysStuJianliKey implements Serializable {
    private String homepage;

    private Integer jlid;

    private static final long serialVersionUID = 1L;

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage == null ? null : homepage.trim();
    }

    public Integer getJlid() {
        return jlid;
    }

    public void setJlid(Integer jlid) {
        this.jlid = jlid;
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
        SysStuJianliKey other = (SysStuJianliKey) that;
        return (this.getHomepage() == null ? other.getHomepage() == null : this.getHomepage().equals(other.getHomepage()))
            && (this.getJlid() == null ? other.getJlid() == null : this.getJlid().equals(other.getJlid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHomepage() == null) ? 0 : getHomepage().hashCode());
        result = prime * result + ((getJlid() == null) ? 0 : getJlid().hashCode());
        return result;
    }
}