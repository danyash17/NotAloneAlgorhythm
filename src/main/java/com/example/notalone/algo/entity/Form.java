package com.example.notalone.algo.entity;

public class Form {
    private int id;
    private String email;
    private String name;
    private String reference;
    private String gender;
    private String aim;
    private String music;
    private String hobbies;
    private String faculty;
    private String extraverse;
    private String height;
    private String location;
    private String zodiac;
    private String photoReference;
    private String partnerGender;
    private String alchoholOpinion;
    private String smokingOpinion;
    private String ownNegatives;
    private String partnerNegatives;
    private String ownPositives;
    private boolean blindDate;
    private String message;
    private String comment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getPhotoReference() {
        return photoReference;
    }

    public void setPhotoReference(String photoReference) {
        this.photoReference = photoReference;
    }

    public String getPartnerGender() {
        return partnerGender;
    }

    public void setPartnerGender(String partnerGender) {
        this.partnerGender = partnerGender;
    }

    public boolean isBlindDate() {
        return blindDate;
    }

    public void setBlindDate(boolean blindDate) {
        this.blindDate = blindDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getLocation() {return location;}

    public void setLocation(String location) {this.location = location;}

    public String getExtraverse() {return extraverse;}

    public void setExtraverse(String extraverse) {this.extraverse = extraverse;}

    public String getZodiac() {return zodiac;}

    public void setZodiac(String zodiac) {this.zodiac = zodiac;}

    public String getHeight() {return height;}

    public void setHeight(String height) {this.height = height;}

    public String getMusic() {return music;}

    public void setMusic(String music) {this.music = music;}

    public String getHobbies() {return hobbies;}

    public void setHobbies(String hobbies) {this.hobbies = hobbies;}

    public String getAlchoholOpinion() {return alchoholOpinion;}

    public void setAlchoholOpinion(String alchoholOpinion) {this.alchoholOpinion = alchoholOpinion;}

    public String getSmokingOpinion() {return smokingOpinion;}

    public void setSmokingOpinion(String smokingOpinion) {this.smokingOpinion = smokingOpinion;}

    public String getOwnNegatives() {return ownNegatives;}

    public void setOwnNegatives(String ownNegatives) {this.ownNegatives = ownNegatives;}

    public String getPartnerNegatives() {return partnerNegatives;}

    public void setPartnerNegatives(String partnerNegatives) {this.partnerNegatives = partnerNegatives;}

    public String getOwnPositives() {return ownPositives;}

    public void setOwnPositives(String ownPositives) {this.ownPositives = ownPositives;}

    @Override
    public String toString() {
        return "Form{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", reference='" + reference + '\'' +
                ", gender='" + gender + '\'' +
                ", aim='" + aim + '\'' +
                ", music='" + music + '\'' +
                ", hobbies='" + hobbies + '\'' +
                ", faculty='" + faculty + '\'' +
                ", extraverse='" + extraverse + '\'' +
                ", height='" + height + '\'' +
                ", location='" + location + '\'' +
                ", zodiac='" + zodiac + '\'' +
                ", photoReference='" + photoReference + '\'' +
                ", partnerGender='" + partnerGender + '\'' +
                ", alchoholOpinion='" + alchoholOpinion + '\'' +
                ", smokingOpinion='" + smokingOpinion + '\'' +
                ", ownNegatives='" + ownNegatives + '\'' +
                ", partnerNegatives='" + partnerNegatives + '\'' +
                ", ownPositives='" + ownPositives + '\'' +
                ", blindDate=" + blindDate +
                ", message='" + message + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
