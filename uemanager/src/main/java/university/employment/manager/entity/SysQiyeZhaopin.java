package university.employment.manager.entity;

import java.io.Serializable;
import java.util.Date;

public class SysQiyeZhaopin implements Serializable {
    private Integer zpid;

    private Integer qyid;

    private String name;

    private String salary;

    private String workplace;

    private Date publishtime;

    private String workexperience;

    private Integer recruitnum;

    private String type;

    private String jobdescription;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getZpid() {
        return zpid;
    }

    public void setZpid(Integer zpid) {
        this.zpid = zpid;
    }

    public Integer getQyid() {
        return qyid;
    }

    public void setQyid(Integer qyid) {
        this.qyid = qyid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace == null ? null : workplace.trim();
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public String getWorkexperience() {
        return workexperience;
    }

    public void setWorkexperience(String workexperience) {
        this.workexperience = workexperience == null ? null : workexperience.trim();
    }

    public Integer getRecruitnum() {
        return recruitnum;
    }

    public void setRecruitnum(Integer recruitnum) {
        this.recruitnum = recruitnum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getJobdescription() {
        return jobdescription;
    }

    public void setJobdescription(String jobdescription) {
        this.jobdescription = jobdescription == null ? null : jobdescription.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        SysQiyeZhaopin other = (SysQiyeZhaopin) that;
        return (this.getZpid() == null ? other.getZpid() == null : this.getZpid().equals(other.getZpid()))
            && (this.getQyid() == null ? other.getQyid() == null : this.getQyid().equals(other.getQyid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSalary() == null ? other.getSalary() == null : this.getSalary().equals(other.getSalary()))
            && (this.getWorkplace() == null ? other.getWorkplace() == null : this.getWorkplace().equals(other.getWorkplace()))
            && (this.getPublishtime() == null ? other.getPublishtime() == null : this.getPublishtime().equals(other.getPublishtime()))
            && (this.getWorkexperience() == null ? other.getWorkexperience() == null : this.getWorkexperience().equals(other.getWorkexperience()))
            && (this.getRecruitnum() == null ? other.getRecruitnum() == null : this.getRecruitnum().equals(other.getRecruitnum()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getJobdescription() == null ? other.getJobdescription() == null : this.getJobdescription().equals(other.getJobdescription()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getZpid() == null) ? 0 : getZpid().hashCode());
        result = prime * result + ((getQyid() == null) ? 0 : getQyid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSalary() == null) ? 0 : getSalary().hashCode());
        result = prime * result + ((getWorkplace() == null) ? 0 : getWorkplace().hashCode());
        result = prime * result + ((getPublishtime() == null) ? 0 : getPublishtime().hashCode());
        result = prime * result + ((getWorkexperience() == null) ? 0 : getWorkexperience().hashCode());
        result = prime * result + ((getRecruitnum() == null) ? 0 : getRecruitnum().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getJobdescription() == null) ? 0 : getJobdescription().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}