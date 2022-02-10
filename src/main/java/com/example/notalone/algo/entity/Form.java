package com.example.notalone.algo.entity;

public class Form {
    private int ID;
    private String name;
    private String link;
    private String gender;
    private String purpose;
    private String faculty;
    private String photo_link;
    private String partner_gender;
    private boolean blind_date;
    private String aboutme;
    private String ordercomment;
    private int compatibility;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getPhoto_link() {
        return photo_link;
    }

    public void setPhoto_link(String photo_link) {
        this.photo_link = photo_link;
    }

    public String getPartner_gender() {
        return partner_gender;
    }

    public void setPartner_gender(String partner_gender) {
        this.partner_gender = partner_gender;
    }

    public boolean isBlind_date() {
        return blind_date;
    }

    public void setBlind_date(boolean blind_date) {
        this.blind_date = blind_date;
    }

    public String getAboutme() {
        return aboutme;
    }

    public void setAboutme(String aboutme) {
        this.aboutme = aboutme;
    }

    public String getOrdercomment() {
        return ordercomment;
    }

    public void setOrdercomment(String ordercomment) {
        this.ordercomment = ordercomment;
    }

    public int getCompatibility() {
        return compatibility;
    }

    public void setCompatibility(int compatibility) {
        this.compatibility = compatibility;
    }
}
