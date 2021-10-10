package com.filmreview.springMVCbackend.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "actor")
public class ActorEntity {
    @Id
    private int actorId;
    @Column
    private String actorName;
    @ManyToMany(mappedBy = "actors")
    private List<MovieEntity> movies = new ArrayList<>();

    public ActorEntity() {

    }


    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public List<MovieEntity> getPosts() {
        return movies;
    }

    public void setPosts(List<MovieEntity> posts) {
        this.movies = movies;
    }


    public List<MovieEntity> getMovies() {
        return movies;
    }

    public void setMovies(List<MovieEntity> movies) {
        this.movies = movies;
    }

    public ActorEntity(String actorName) {
        this.actorName = actorName;
    }
}
