package university.employment.manager.entity;

import java.io.Serializable;

public class SysStuJianli extends SysStuJianliKey implements Serializable {
    private Integer stuid;

    private String realname;

    private String yingwenname;

    private String birthday;

    private String mail;

    private String mibilephone;

    private String qq;

    private String qiuzhiyixiang;

    private String jineng;

    private String workexperience;

    private String awards;

    private String lastmodify;

    private static final long serialVersionUID = 1L;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getYingwenname() {
        return yingwenname;
    }

    public void setYingwenname(String yingwenname) {
        this.yingwenname = yingwenname == null ? null : yingwenname.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getMibilephone() {
        return mibilephone;
    }

    public void setMibilephone(String mibilephone) {
        this.mibilephone = mibilephone == null ? null : mibilephone.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getQiuzhiyixiang() {
        return qiuzhiyixiang;
    }

    public void setQiuzhiyixiang(String qiuzhiyixiang) {
        this.qiuzhiyixiang = qiuzhiyixiang == null ? null : qiuzhiyixiang.trim();
    }

    public String getJineng() {
        return jineng;
    }

    public void setJineng(String jineng) {
        this.jineng = jineng == null ? null : jineng.trim();
    }

    public String getWorkexperience() {
        return workexperience;
    }

    public void setWorkexperience(String workexperience) {
        this.workexperience = workexperience == null ? null : workexperience.trim();
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards == null ? null : awards.trim();
    }

    public String getLastmodify() {
        return lastmodify;
    }

    public void setLastmodify(String lastmodify) {
        this.lastmodify = lastmodify == null ? null : lastmodify.trim();
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
        SysStuJianli other = (SysStuJianli) that;
        return (this.getHomepage() == null ? other.getHomepage() == null : this.getHomepage().equals(other.getHomepage()))
            && (this.getJlid() == null ? other.getJlid() == null : this.getJlid().equals(other.getJlid()))
            && (this.getStuid() == null ? other.getStuid() == null : this.getStuid().equals(other.getStuid()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getYingwenname() == null ? other.getYingwenname() == null : this.getYingwenname().equals(other.getYingwenname()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getMail() == null ? other.getMail() == null : this.getMail().equals(other.getMail()))
            && (this.getMibilephone() == null ? other.getMibilephone() == null : this.getMibilephone().equals(other.getMibilephone()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getQiuzhiyixiang() == null ? other.getQiuzhiyixiang() == null : this.getQiuzhiyixiang().equals(other.getQiuzhiyixiang()))
            && (this.getJineng() == null ? other.getJineng() == null : this.getJineng().equals(other.getJineng()))
            && (this.getWorkexperience() == null ? other.getWorkexperience() == null : this.getWorkexperience().equals(other.getWorkexperience()))
            && (this.getAwards() == null ? other.getAwards() == null : this.getAwards().equals(other.getAwards()))
            && (this.getLastmodify() == null ? other.getLastmodify() == null : this.getLastmodify().equals(other.getLastmodify()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHomepage() == null) ? 0 : getHomepage().hashCode());
        result = prime * result + ((getJlid() == null) ? 0 : getJlid().hashCode());
        result = prime * result + ((getStuid() == null) ? 0 : getStuid().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getYingwenname() == null) ? 0 : getYingwenname().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getMail() == null) ? 0 : getMail().hashCode());
        result = prime * result + ((getMibilephone() == null) ? 0 : getMibilephone().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getQiuzhiyixiang() == null) ? 0 : getQiuzhiyixiang().hashCode());
        result = prime * result + ((getJineng() == null) ? 0 : getJineng().hashCode());
        result = prime * result + ((getWorkexperience() == null) ? 0 : getWorkexperience().hashCode());
        result = prime * result + ((getAwards() == null) ? 0 : getAwards().hashCode());
        result = prime * result + ((getLastmodify() == null) ? 0 : getLastmodify().hashCode());
        return result;
    }
}