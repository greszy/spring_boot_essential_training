package com.gregoryszymanski.roomwebapp.models;

import javax.persistence.*;

/*
Entities in JPA are nothing but POJOs representing data that can be persisted to the database.
An entity represents a table stored in a database. Every instance of an entity represents a row in the table.

To define a class as an entity we should make use of the @Entity annotation.
We must specify this annotation at the class level. We must also ensure that the entity has a no-arg constructor and a primary key.
 */
@Entity
/*
In most cases, the name of the table in the database and the name of the entity will not be the same.
In these cases, we can specify the table name using the @Table annotation.
*/
@Table(name="ROOM")
public class Room {
    //The @Id annotation defines the primary key.
    @Id
    //We can use the @Column annotation to mention the details of a column in the table. In this case we are specifying the name of the column.
    @Column(name="ROOM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="ROOM_NUMBER")
    private String number;
    @Column(name="NAME")
    private String name;
    @Column(name="BED_INFO")
    private String info;

    public Room() {
    }

    public Room(long id, String number, String name, String info) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.info = info;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }
}
