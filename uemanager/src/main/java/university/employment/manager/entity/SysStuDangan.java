package university.employment.manager.entity;

import java.io.Serializable;
import java.util.Date;

public class SysStuDangan implements Serializable {
    private Integer did;

    private Integer stuid;

    private String name;

    private Integer gender;

    private String nation;

    private Date birthday;

    private String zhengzhimianmao;

    private Date rutuandate;

    private String identityid;

    private String phone;

    private String mail;

    private String smallschool;

    private String smallschooldate;

    private String smallschoolmaster;

    private String midschool;

    private String midschooldate;

    private String highschool;

    private String midschoolmaster;

    private String highschoolmaster;

    private String highschooldate;

    private String universer;

    private String academy;

    private String speciality;

    private String awards;

    private String punish;

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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getZhengzhimianmao() {
        return zhengzhimianmao;
    }

    public void setZhengzhimianmao(String zhengzhimianmao) {
        this.zhengzhimianmao = zhengzhimianmao == null ? null : zhengzhimianmao.trim();
    }

    public Date getRutuandate() {
        return rutuandate;
    }

    public void setRutuandate(Date rutuandate) {
        this.rutuandate = rutuandate;
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

    public String getSmallschool() {
        return smallschool;
    }

    public void setSmallschool(String smallschool) {
        this.smallschool = smallschool == null ? null : smallschool.trim();
    }

    public String getSmallschooldate() {
        return smallschooldate;
    }

    public void setSmallschooldate(String smallschooldate) {
        this.smallschooldate = smallschooldate == null ? null : smallschooldate.trim();
    }

    public String getSmallschoolmaster() {
        return smallschoolmaster;
    }

    public void setSmallschoolmaster(String smallschoolmaster) {
        this.smallschoolmaster = smallschoolmaster == null ? null : smallschoolmaster.trim();
    }

    public String getMidschool() {
        return midschool;
    }

    public void setMidschool(String midschool) {
        this.midschool = midschool == null ? null : midschool.trim();
    }

    public String getMidschooldate() {
        return midschooldate;
    }

    public void setMidschooldate(String midschooldate) {
        this.midschooldate = midschooldate == null ? null : midschooldate.trim();
    }

    public String getHighschool() {
        return highschool;
    }

    public void setHighschool(String highschool) {
        this.highschool = highschool == null ? null : highschool.trim();
    }

    public String getMidschoolmaster() {
        return midschoolmaster;
    }

    public void setMidschoolmaster(String midschoolmaster) {
        this.midschoolmaster = midschoolmaster == null ? null : midschoolmaster.trim();
    }

    public String getHighschoolmaster() {
        return highschoolmaster;
    }

    public void setHighschoolmaster(String highschoolmaster) {
        this.highschoolmaster = highschoolmaster == null ? null : highschoolmaster.trim();
    }

    public String getHighschooldate() {
        return highschooldate;
    }

    public void setHighschooldate(String highschooldate) {
        this.highschooldate = highschooldate == null ? null : highschooldate.trim();
    }

    public String getUniverser() {
        return universer;
    }

    public void setUniverser(String universer) {
        this.universer = universer == null ? null : universer.trim();
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy == null ? null : academy.trim();
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality == null ? null : speciality.trim();
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
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getZhengzhimianmao() == null ? other.getZhengzhimianmao() == null : this.getZhengzhimianmao().equals(other.getZhengzhimianmao()))
            && (this.getRutuandate() == null ? other.getRutuandate() == null : this.getRutuandate().equals(other.getRutuandate()))
            && (this.getIdentityid() == null ? other.getIdentityid() == null : this.getIdentityid().equals(other.getIdentityid()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getMail() == null ? other.getMail() == null : this.getMail().equals(other.getMail()))
            && (this.getSmallschool() == null ? other.getSmallschool() == null : this.getSmallschool().equals(other.getSmallschool()))
            && (this.getSmallschooldate() == null ? other.getSmallschooldate() == null : this.getSmallschooldate().equals(other.getSmallschooldate()))
            && (this.getSmallschoolmaster() == null ? other.getSmallschoolmaster() == null : this.getSmallschoolmaster().equals(other.getSmallschoolmaster()))
            && (this.getMidschool() == null ? other.getMidschool() == null : this.getMidschool().equals(other.getMidschool()))
            && (this.getMidschooldate() == null ? other.getMidschooldate() == null : this.getMidschooldate().equals(other.getMidschooldate()))
            && (this.getHighschool() == null ? other.getHighschool() == null : this.getHighschool().equals(other.getHighschool()))
            && (this.getMidschoolmaster() == null ? other.getMidschoolmaster() == null : this.getMidschoolmaster().equals(other.getMidschoolmaster()))
            && (this.getHighschoolmaster() == null ? other.getHighschoolmaster() == null : this.getHighschoolmaster().equals(other.getHighschoolmaster()))
            && (this.getHighschooldate() == null ? other.getHighschooldate() == null : this.getHighschooldate().equals(other.getHighschooldate()))
            && (this.getUniverser() == null ? other.getUniverser() == null : this.getUniverser().equals(other.getUniverser()))
            && (this.getAcademy() == null ? other.getAcademy() == null : this.getAcademy().equals(other.getAcademy()))
            && (this.getSpeciality() == null ? other.getSpeciality() == null : this.getSpeciality().equals(other.getSpeciality()))
            && (this.getAwards() == null ? other.getAwards() == null : this.getAwards().equals(other.getAwards()))
            && (this.getPunish() == null ? other.getPunish() == null : this.getPunish().equals(other.getPunish()));
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
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getZhengzhimianmao() == null) ? 0 : getZhengzhimianmao().hashCode());
        result = prime * result + ((getRutuandate() == null) ? 0 : getRutuandate().hashCode());
        result = prime * result + ((getIdentityid() == null) ? 0 : getIdentityid().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getMail() == null) ? 0 : getMail().hashCode());
        result = prime * result + ((getSmallschool() == null) ? 0 : getSmallschool().hashCode());
        result = prime * result + ((getSmallschooldate() == null) ? 0 : getSmallschooldate().hashCode());
        result = prime * result + ((getSmallschoolmaster() == null) ? 0 : getSmallschoolmaster().hashCode());
        result = prime * result + ((getMidschool() == null) ? 0 : getMidschool().hashCode());
        result = prime * result + ((getMidschooldate() == null) ? 0 : getMidschooldate().hashCode());
        result = prime * result + ((getHighschool() == null) ? 0 : getHighschool().hashCode());
        result = prime * result + ((getMidschoolmaster() == null) ? 0 : getMidschoolmaster().hashCode());
        result = prime * result + ((getHighschoolmaster() == null) ? 0 : getHighschoolmaster().hashCode());
        result = prime * result + ((getHighschooldate() == null) ? 0 : getHighschooldate().hashCode());
        result = prime * result + ((getUniverser() == null) ? 0 : getUniverser().hashCode());
        result = prime * result + ((getAcademy() == null) ? 0 : getAcademy().hashCode());
        result = prime * result + ((getSpeciality() == null) ? 0 : getSpeciality().hashCode());
        result = prime * result + ((getAwards() == null) ? 0 : getAwards().hashCode());
        result = prime * result + ((getPunish() == null) ? 0 : getPunish().hashCode());
        return result;
    }
}