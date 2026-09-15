package com.neusoft.tijiancms.po;

import java.util.Date;

public class Patient {
    private Long patient_id;
    private Integer patient_no;
    private String name;
    private String gender;
    private Date birth_date;
    private String phone;
    private String id_card;
    private String address;
    private Date created_at;
    private Date updated_at;

    public Patient() {
    }

    public Patient(Date updated_at, Date created_at, String address, String id_card, String phone, Date birth_date, String gender, String name, Integer patient_no, Long patient_id) {
        this.updated_at = updated_at;
        this.created_at = created_at;
        this.address = address;
        this.id_card = id_card;
        this.phone = phone;
        this.birth_date = birth_date;
        this.gender = gender;
        this.name = name;
        this.patient_no = patient_no;
        this.patient_id = patient_id;
    }

    public Long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Long patient_id) {
        this.patient_id = patient_id;
    }

    public Integer getPatient_no() {
        return patient_no;
    }

    public void setPatient_no(Integer patient_no) {
        this.patient_no = patient_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patient_id=" + patient_id +
                ", patient_no=" + patient_no +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birth_date=" + birth_date +
                ", phone='" + phone + '\'' +
                ", id_card='" + id_card + '\'' +
                ", address='" + address + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
