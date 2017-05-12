package university.employment.manager.entity;

import java.io.Serializable;

public class SysStuDangan implements Serializable {
    private Integer did;

    private Integer stuid;

    private String name;

    private String gender;

    private String nation;

    private String xingzhengbanji;

    private String birthday;

    private String zhengzhimianmao;

    private String rutuandate;

    private String identityid;

    private String phone;

    private String mail;

    private String homeaddr;

    private String zipcode;

    private String contactphone;

    private String guanxi;

    private String xuexijingli;

    private String awards;

    private String punish;

    private String studentid;

    private String jiguan;

    private String beizhu;

    private static final long serialVersionUID = 1L;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getXingzhengbanji() {
        return xingzhengbanji;
    }

    public void setXingzhengbanji(String xingzhengbanji) {
        this.xingzhengbanji = xingzhengbanji == null ? null : xingzhengbanji.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getZhengzhimianmao() {
        return zhengzhimianmao;
    }

    public void setZhengzhimianmao(String zhengzhimianmao) {
        this.zhengzhimianmao = zhengzhimianmao == null ? null : zhengzhimianmao.trim();
    }

    public String getRutuandate() {
        return rutuandate;
    }

    public void setRutuandate(String rutuandate) {
        this.rutuandate = rutuandate == null ? null : rutuandate.trim();
    }

    public String getIdentityid() {
        return identityid;
    }

    public void setIdentityid(String identityid) {
        this.identityid = identityid == null ? null : identityid.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getHomeaddr() {
        return homeaddr;
    }

    public void setHomeaddr(String homeaddr) {
        this.homeaddr = homeaddr == null ? null : homeaddr.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone == null ? null : contactphone.trim();
    }

    public String getGuanxi() {
        return guanxi;
    }

    public void setGuanxi(String guanxi) {
        this.guanxi = guanxi == null ? null : guanxi.trim();
    }

    public String getXuexijingli() {
        return xuexijingli;
    }

    public void setXuexijingli(String xuexijingli) {
        this.xuexijingli = xuexijingli == null ? null : xuexijingli.trim();
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards == null ? null : awards.trim();
    }

    public String getPunish() {
        return punish;
    }

    public void setPunish(String punish) {
        this.punish = punish == null ? null : punish.trim();
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    public String getJiguan() {
        return jiguan;
    }

    public void setJiguan(String jiguan) {
        this.jiguan = jiguan == null ? null : jiguan.trim();
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
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
        SysStuDangan other = (SysStuDangan) that;
        return (this.getDid() == null ? other.getDid() == null : this.getDid().equals(other.getDid()))
            && (this.getStuid() == null ? other.getStuid() == null : this.getStuid().equals(other.getStuid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getXingzhengbanji() == null ? other.getXingzhengbanji() == null : this.getXingzhengbanji().equals(other.getXingzhengbanji()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getZhengzhimianmao() == null ? other.getZhengzhimianmao() == null : this.getZhengzhimianmao().equals(other.getZhengzhimianmao()))
            && (this.getRutuandate() == null ? other.getRutuandate() == null : this.getRutuandate().equals(other.getRutuandate()))
            && (this.getIdentityid() == null ? other.getIdentityid() == null : this.getIdentityid().equals(other.getIdentityid()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getMail() == null ? other.getMail() == null : this.getMail().equals(other.getMail()))
            && (this.getHomeaddr() == null ? other.getHomeaddr() == null : this.getHomeaddr().equals(other.getHomeaddr()))
            && (this.getZipcode() == null ? other.getZipcode() == null : this.getZipcode().equals(other.getZipcode()))
            && (this.getContactphone() == null ? other.getContactphone() == null : this.getContactphone().equals(other.getContactphone()))
            && (this.getGuanxi() == null ? other.getGuanxi() == null : this.getGuanxi().equals(other.getGuanxi()))
            && (this.getXuexijingli() == null ? other.getXuexijingli() == null : this.getXuexijingli().equals(other.getXuexijingli()))
            && (this.getAwards() == null ? other.getAwards() == null : this.getAwards().equals(other.getAwards()))
            && (this.getPunish() == null ? other.getPunish() == null : this.getPunish().equals(other.getPunish()))
            && (this.getStudentid() == null ? other.getStudentid() == null : this.getStudentid().equals(other.getStudentid()))
            && (this.getJiguan() == null ? other.getJiguan() == null : this.getJiguan().equals(other.getJiguan()))
            && (this.getBeizhu() == null ? other.getBeizhu() == null : this.getBeizhu().equals(other.getBeizhu()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDid() == null) ? 0 : getDid().hashCode());
        result = prime * result + ((getStuid() == null) ? 0 : getStuid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getXingzhengbanji() == null) ? 0 : getXingzhengbanji().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getZhengzhimianmao() == null) ? 0 : getZhengzhimianmao().hashCode());
        result = prime * result + ((getRutuandate() == null) ? 0 : getRutuandate().hashCode());
        result = prime * result + ((getIdentityid() == null) ? 0 : getIdentityid().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getMail() == null) ? 0 : getMail().hashCode());
        result = prime * result + ((getHomeaddr() == null) ? 0 : getHomeaddr().hashCode());
        result = prime * result + ((getZipcode() == null) ? 0 : getZipcode().hashCode());
        result = prime * result + ((getContactphone() == null) ? 0 : getContactphone().hashCode());
        result = prime * result + ((getGuanxi() == null) ? 0 : getGuanxi().hashCode());
        result = prime * result + ((getXuexijingli() == null) ? 0 : getXuexijingli().hashCode());
        result = prime * result + ((getAwards() == null) ? 0 : getAwards().hashCode());
        result = prime * result + ((getPunish() == null) ? 0 : getPunish().hashCode());
        result = prime * result + ((getStudentid() == null) ? 0 : getStudentid().hashCode());
        result = prime * result + ((getJiguan() == null) ? 0 : getJiguan().hashCode());
        result = prime * result + ((getBeizhu() == null) ? 0 : getBeizhu().hashCode());
        return result;
    }
}