package university.employment.manager.entity;

import java.io.Serializable;

public class SysQiyeInfo implements Serializable {
    private Integer qyid;

    private Integer uid;

    private String qyname;

    private String businessno;

    private String nationaltaxregisnum;

    private String localtaxregisnum;

    private String bankname;

    private String bankaccount;

    private String addr;

    private String legalrepresentative;

    private String legalphone;

    private String contactname;

    private String contactphone;

    private String fax;

    private String email;

    private String type;

    private String legalform;

    private Integer numberoemployees;

    private String introduction;

    private String product;

    private static final long serialVersionUID = 1L;

    public Integer getQyid() {
        return qyid;
    }

    public void setQyid(Integer qyid) {
        this.qyid = qyid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getQyname() {
        return qyname;
    }

    public void setQyname(String qyname) {
        this.qyname = qyname == null ? null : qyname.trim();
    }

    public String getBusinessno() {
        return businessno;
    }

    public void setBusinessno(String businessno) {
        this.businessno = businessno == null ? null : businessno.trim();
    }

    public String getNationaltaxregisnum() {
        return nationaltaxregisnum;
    }

    public void setNationaltaxregisnum(String nationaltaxregisnum) {
        this.nationaltaxregisnum = nationaltaxregisnum == null ? null : nationaltaxregisnum.trim();
    }

    public String getLocaltaxregisnum() {
        return localtaxregisnum;
    }

    public void setLocaltaxregisnum(String localtaxregisnum) {
        this.localtaxregisnum = localtaxregisnum == null ? null : localtaxregisnum.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount == null ? null : bankaccount.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getLegalrepresentative() {
        return legalrepresentative;
    }

    public void setLegalrepresentative(String legalrepresentative) {
        this.legalrepresentative = legalrepresentative == null ? null : legalrepresentative.trim();
    }

    public String getLegalphone() {
        return legalphone;
    }

    public void setLegalphone(String legalphone) {
        this.legalphone = legalphone == null ? null : legalphone.trim();
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname == null ? null : contactname.trim();
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone == null ? null : contactphone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getLegalform() {
        return legalform;
    }

    public void setLegalform(String legalform) {
        this.legalform = legalform == null ? null : legalform.trim();
    }

    public Integer getNumberoemployees() {
        return numberoemployees;
    }

    public void setNumberoemployees(Integer numberoemployees) {
        this.numberoemployees = numberoemployees;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
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
        SysQiyeInfo other = (SysQiyeInfo) that;
        return (this.getQyid() == null ? other.getQyid() == null : this.getQyid().equals(other.getQyid()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getQyname() == null ? other.getQyname() == null : this.getQyname().equals(other.getQyname()))
            && (this.getBusinessno() == null ? other.getBusinessno() == null : this.getBusinessno().equals(other.getBusinessno()))
            && (this.getNationaltaxregisnum() == null ? other.getNationaltaxregisnum() == null : this.getNationaltaxregisnum().equals(other.getNationaltaxregisnum()))
            && (this.getLocaltaxregisnum() == null ? other.getLocaltaxregisnum() == null : this.getLocaltaxregisnum().equals(other.getLocaltaxregisnum()))
            && (this.getBankname() == null ? other.getBankname() == null : this.getBankname().equals(other.getBankname()))
            && (this.getBankaccount() == null ? other.getBankaccount() == null : this.getBankaccount().equals(other.getBankaccount()))
            && (this.getAddr() == null ? other.getAddr() == null : this.getAddr().equals(other.getAddr()))
            && (this.getLegalrepresentative() == null ? other.getLegalrepresentative() == null : this.getLegalrepresentative().equals(other.getLegalrepresentative()))
            && (this.getLegalphone() == null ? other.getLegalphone() == null : this.getLegalphone().equals(other.getLegalphone()))
            && (this.getContactname() == null ? other.getContactname() == null : this.getContactname().equals(other.getContactname()))
            && (this.getContactphone() == null ? other.getContactphone() == null : this.getContactphone().equals(other.getContactphone()))
            && (this.getFax() == null ? other.getFax() == null : this.getFax().equals(other.getFax()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getLegalform() == null ? other.getLegalform() == null : this.getLegalform().equals(other.getLegalform()))
            && (this.getNumberoemployees() == null ? other.getNumberoemployees() == null : this.getNumberoemployees().equals(other.getNumberoemployees()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()))
            && (this.getProduct() == null ? other.getProduct() == null : this.getProduct().equals(other.getProduct()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQyid() == null) ? 0 : getQyid().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getQyname() == null) ? 0 : getQyname().hashCode());
        result = prime * result + ((getBusinessno() == null) ? 0 : getBusinessno().hashCode());
        result = prime * result + ((getNationaltaxregisnum() == null) ? 0 : getNationaltaxregisnum().hashCode());
        result = prime * result + ((getLocaltaxregisnum() == null) ? 0 : getLocaltaxregisnum().hashCode());
        result = prime * result + ((getBankname() == null) ? 0 : getBankname().hashCode());
        result = prime * result + ((getBankaccount() == null) ? 0 : getBankaccount().hashCode());
        result = prime * result + ((getAddr() == null) ? 0 : getAddr().hashCode());
        result = prime * result + ((getLegalrepresentative() == null) ? 0 : getLegalrepresentative().hashCode());
        result = prime * result + ((getLegalphone() == null) ? 0 : getLegalphone().hashCode());
        result = prime * result + ((getContactname() == null) ? 0 : getContactname().hashCode());
        result = prime * result + ((getContactphone() == null) ? 0 : getContactphone().hashCode());
        result = prime * result + ((getFax() == null) ? 0 : getFax().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getLegalform() == null) ? 0 : getLegalform().hashCode());
        result = prime * result + ((getNumberoemployees() == null) ? 0 : getNumberoemployees().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        result = prime * result + ((getProduct() == null) ? 0 : getProduct().hashCode());
        return result;
    }
}