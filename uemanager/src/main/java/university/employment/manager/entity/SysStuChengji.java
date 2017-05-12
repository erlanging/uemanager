package university.employment.manager.entity;

import java.io.Serializable;

public class SysStuChengji implements Serializable {
    private Integer chjid;

    private Integer stuid;

    private String coursename;

    private String type;

    private Integer point;

    private Integer credit;

    private String term;

    private String examtime;

    private String studentid;

    private static final long serialVersionUID = 1L;

    public Integer getChjid() {
        return chjid;
    }

    public void setChjid(Integer chjid) {
        this.chjid = chjid;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    public String getExamtime() {
        return examtime;
    }

    public void setExamtime(String examtime) {
        this.examtime = examtime == null ? null : examtime.trim();
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
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
        SysStuChengji other = (SysStuChengji) that;
        return (this.getChjid() == null ? other.getChjid() == null : this.getChjid().equals(other.getChjid()))
            && (this.getStuid() == null ? other.getStuid() == null : this.getStuid().equals(other.getStuid()))
            && (this.getCoursename() == null ? other.getCoursename() == null : this.getCoursename().equals(other.getCoursename()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getPoint() == null ? other.getPoint() == null : this.getPoint().equals(other.getPoint()))
            && (this.getCredit() == null ? other.getCredit() == null : this.getCredit().equals(other.getCredit()))
            && (this.getTerm() == null ? other.getTerm() == null : this.getTerm().equals(other.getTerm()))
            && (this.getExamtime() == null ? other.getExamtime() == null : this.getExamtime().equals(other.getExamtime()))
            && (this.getStudentid() == null ? other.getStudentid() == null : this.getStudentid().equals(other.getStudentid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChjid() == null) ? 0 : getChjid().hashCode());
        result = prime * result + ((getStuid() == null) ? 0 : getStuid().hashCode());
        result = prime * result + ((getCoursename() == null) ? 0 : getCoursename().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getPoint() == null) ? 0 : getPoint().hashCode());
        result = prime * result + ((getCredit() == null) ? 0 : getCredit().hashCode());
        result = prime * result + ((getTerm() == null) ? 0 : getTerm().hashCode());
        result = prime * result + ((getExamtime() == null) ? 0 : getExamtime().hashCode());
        result = prime * result + ((getStudentid() == null) ? 0 : getStudentid().hashCode());
        return result;
    }
}