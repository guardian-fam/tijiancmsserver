package com.neusoft.tijiancms.po;

import java.util.Date;

public class Patient {
    private String patientId;
    private String password;
    private String realName;
    private int sex;
    private String identityCard;
    private Date birthday;
    private int userType;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId='" + patientId + '\'' +
                ", password='" + password + '\'' +
                ", realName='" + realName + '\'' +
                ", sex=" + sex +
                ", identityCard='" + identityCard + '\'' +
                ", birthday=" + birthday +
                ", userType=" + userType +
                '}';
    }
}
