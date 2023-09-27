package com.example.easyblood;

public class UserHelperClass {
    String name,email,pass,phone,blood,area;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public UserHelperClass(String name, String email, String pass, String phone, String blood, String area) {
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.phone = phone;
        this.blood = blood;
        this.area = area;
    }

    public UserHelperClass() {

    }


}
