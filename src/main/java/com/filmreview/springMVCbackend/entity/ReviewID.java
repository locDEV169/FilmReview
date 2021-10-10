package com.filmreview.springMVCbackend.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class ReviewID implements Serializable {
    @Column(name = "user_id")
    private int userID;
    @Column(name = "movie_id")
    private int movieID;
}

