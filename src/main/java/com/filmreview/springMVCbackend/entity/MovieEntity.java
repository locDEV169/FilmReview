package com.filmreview.springMVCbackend.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movies")
public class MovieEntity implements Serializable {
    @Id
    private int movieID;
    @Column
    private String title;
    @Column
    private int userRate;
    @Column
    private double imdbRate;
    @Column
    private int years;
    @Column
    private String imgURL;
    @Column
    private String plot;
    @Column
    private int runtime;

    @ManyToMany
    @JoinTable(name = "movie_actor",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id")
    )
    private List<ActorEntity> actors = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "movie_director",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "director_id")
    )
    private List<DirectorEntity> directors = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "movie_genre",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private List<GenreEntity> genres = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<ReviewEntity> users;


    public List<ActorEntity> getActors() {
        return actors;
    }

    public void setActors(List<ActorEntity> actors) {
        this.actors = actors;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserRate() {
        return userRate;
    }

    public void setUserRate(int userRate) {
        this.userRate = userRate;
    }

    public double getImdbRate() {
        return imdbRate;
    }

    public void setImdbRate(double imdbRate) {
        this.imdbRate = imdbRate;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public List<DirectorEntity> getDirectors() {
        return directors;
    }

    public void setDirectors(List<DirectorEntity> directors) {
        this.directors = directors;
    }

    public List<GenreEntity> getGenres() {
        return genres;
    }

    public void setGenres(List<GenreEntity> genres) {
        this.genres = genres;
    }

    public MovieEntity(String title, int userRate, double imdbRate, int years, String imgURL, String plot, int runtime) {
        this.title = title;
        this.userRate = userRate;
        this.imdbRate = imdbRate;
        this.years = years;
        this.imgURL = imgURL;
        this.plot = plot;
        this.runtime = runtime;
    }
}
