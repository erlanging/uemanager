package university.employment.manager.entity;

import java.io.Serializable;

public class SysJiuyetongji implements Serializable {
    private Integer tjid;

    private Integer year;

    private Integer totalnum;

    private Integer employmentnum;

    private Integer salaryavg;

    private Integer postgraduatenum;

    private Integer civilservantnum;

    private Integer other;

    private static final long serialVersionUID = 1L;

    public Integer getTjid() {
        return tjid;
    }

    public void setTjid(Integer tjid) {
        this.tjid = tjid;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getTotalnum() {
        return totalnum;
    }

    public void setTotalnum(Integer totalnum) {
        this.totalnum = totalnum;
    }

    public Integer getEmploymentnum() {
        return employmentnum;
    }

    public void setEmploymentnum(Integer employmentnum) {
        this.employmentnum = employmentnum;
    }

    public Integer getSalaryavg() {
        return salaryavg;
    }

    public void setSalaryavg(Integer salaryavg) {
        this.salaryavg = salaryavg;
    }

    public Integer getPostgraduatenum() {
        return postgraduatenum;
    }

    public void setPostgraduatenum(Integer postgraduatenum) {
        this.postgraduatenum = postgraduatenum;
    }

    public Integer getCivilservantnum() {
        return civilservantnum;
    }

    public void setCivilservantnum(Integer civilservantnum) {
        this.civilservantnum = civilservantnum;
    }

    public Integer getOther() {
        return other;
    }

    public void setOther(Integer other) {
        this.other = other;
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
        SysJiuyetongji other = (SysJiuyetongji) that;
        return (this.getTjid() == null ? other.getTjid() == null : this.getTjid().equals(other.getTjid()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getTotalnum() == null ? other.getTotalnum() == null : this.getTotalnum().equals(other.getTotalnum()))
            && (this.getEmploymentnum() == null ? other.getEmploymentnum() == null : this.getEmploymentnum().equals(other.getEmploymentnum()))
            && (this.getSalaryavg() == null ? other.getSalaryavg() == null : this.getSalaryavg().equals(other.getSalaryavg()))
            && (this.getPostgraduatenum() == null ? other.getPostgraduatenum() == null : this.getPostgraduatenum().equals(other.getPostgraduatenum()))
            && (this.getCivilservantnum() == null ? other.getCivilservantnum() == null : this.getCivilservantnum().equals(other.getCivilservantnum()))
            && (this.getOther() == null ? other.getOther() == null : this.getOther().equals(other.getOther()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTjid() == null) ? 0 : getTjid().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getTotalnum() == null) ? 0 : getTotalnum().hashCode());
        result = prime * result + ((getEmploymentnum() == null) ? 0 : getEmploymentnum().hashCode());
        result = prime * result + ((getSalaryavg() == null) ? 0 : getSalaryavg().hashCode());
        result = prime * result + ((getPostgraduatenum() == null) ? 0 : getPostgraduatenum().hashCode());
        result = prime * result + ((getCivilservantnum() == null) ? 0 : getCivilservantnum().hashCode());
        result = prime * result + ((getOther() == null) ? 0 : getOther().hashCode());
        return result;
    }
}