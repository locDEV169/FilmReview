package com.filmreview.springMVCbackend.entity;

import javax.persistence.*;

@Entity
@Table(name = "review")
public class ReviewEntity {
    @EmbeddedId
    private ReviewID reviewID;
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

    public ReviewEntity() {

    }

    public ReviewEntity(UserEntity user, MovieEntity movie) {

        this.user = user;
        this.movie = movie;
        this.reviewID = new ReviewID(movie.getMovieID(), user.getUserID());
    }


}
