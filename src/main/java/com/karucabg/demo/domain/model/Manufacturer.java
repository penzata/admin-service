package com.karucabg.demo.domain.model;

import javax.persistence.*;

@Entity
@Table(name="manufacturers")
public class Manufacturer {
    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String address;
    private String country;

    public Manufacturer() {
    }

    public Manufacturer(Integer id, String name, String address, String country) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
