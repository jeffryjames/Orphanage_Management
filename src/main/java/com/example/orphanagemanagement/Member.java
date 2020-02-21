package com.example.orphanagemanagement;

public class Member {

    private String Name;
    private Long Address;
    private Integer Contact;
    private Integer Age;
    private String Guardian;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getAddress() {
        return Address;
    }

    public void setAddress(Long address) {
        Address = address;
    }

    public Integer getContact() {
        return Contact;
    }

    public void setContact(Integer contact) {
        Contact = contact;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getGuardian() {
        return Guardian;
    }

    public void setGuardian(String guardian) {
        Guardian = guardian;
    }

    public Member(){

         }


}
