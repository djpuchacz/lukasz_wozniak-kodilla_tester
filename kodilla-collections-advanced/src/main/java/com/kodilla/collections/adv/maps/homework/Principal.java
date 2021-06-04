package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String firstname;
    private String lastname;
    private String schoolname;

    public Principal(String firstname, String lastname, String schoolname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.schoolname = schoolname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSchoolName() {return schoolname;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(firstname, principal.firstname) && Objects.equals(lastname, principal.lastname) && Objects.equals(schoolname, principal.schoolname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, schoolname);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", schoolname='" + schoolname + '\'' +
                '}';
    }
}
