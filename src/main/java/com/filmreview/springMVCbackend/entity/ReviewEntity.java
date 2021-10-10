package com.filmreview.springMVCbackend.entity;

import javax.persistence.*;

@Entity
@Table(name = "review")
public class ReviewEntity {
    @EmbeddedId
    private  ReviewID reviewID;
    @ManyToOne
    @MapsId("userID")
    private UserEntity user;

    @ManyToOne
    @MapsId("movieID")
    private MovieEntity movie;

    @Column(name = "review")
    private String review;
    @Column
    private int rating;

}
