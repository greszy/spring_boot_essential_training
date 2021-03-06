package com.gregoryszymanski.roomwebapp.models;

import javax.persistence.*;
import java.util.UUID;

/*
This class is one of the JPA Entities implemented for this demo project.
To review the meaning of specific annotations present in this class, please check the Room class for additional comments.
 */

@Entity
@Table(name = "Employee")
public class StaffMember {
    @Id
    @Column(name="EMPLOYEE_ID")
    private String employeeId;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="POSITION")
    /*
    Sometimes, we may want to persist a Java enum type.
    We can use the @Enumerated annotation to specify whether the enum should be persisted by name or by ordinal.
     */
    @Enumerated(EnumType.STRING)
    private Position position;

    public StaffMember() {
        this.employeeId = UUID.randomUUID().toString();
    }

    public StaffMember(String employeeId, String firstName, String lastName, Position position) {
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

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getId() { return employeeId; }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Position getPosition() {
        return position;
    }
}
