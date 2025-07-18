package com.example.Assignment3.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "movies")
@Data
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String studio;
    private String genre;
    private String director;
    private String writers;
    private String actors;
    private int year;
    private int length;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(name = "mpa_rating")
    private String mpaRating;

    @Column(name = "poster_link")
    private String posterLink;

    @Column(name = "critics_rating")
    private double criticsRating;
}
