package com.gregoryszymanski.roomwebapp.models;

public class StaffMember {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String position;

    public StaffMember() {
    }

    public StaffMember(String employeeId, String firstName, String lastName, String position) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public void setId(String employeeId) {
        this.employeeId  = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getId() { return employeeId; }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }
}
