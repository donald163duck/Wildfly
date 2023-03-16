package com.alexpodrolla.Wildfly.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "distance")
public class Distance {
    private int id;
    private String from_city;
    private String to_city;
    private Double distance;

    public Distance() {
    }

    public Distance (int id, String from_city, String to_city) {
        this.id;
        this.from_city;
        this.to_city;
        this.distance;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFrom_city() {
        return from_city;
    }
    public void setFrom_city(String from_city) {
        this.from_city = from_city;
    }

    public String getTo_city() {
        return to_city;
    }
    public void setTo_city(String to_city) {
        this.to_city = to_city;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }
}
