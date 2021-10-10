package com.filmreview.springMVCbackend.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "director")
public class DirectorEntity {
    @Id
    private int directorID;
    @Column
    private String drirectorName;
    @ManyToMany(mappedBy = "directors")
    private List<MovieEntity> movies = new ArrayList<>();

    public int getDirectorID() {
        return directorID;
    }

    public void setDirectorID(int directorID) {
        this.directorID = directorID;
    }

    public String getDrirectorName() {
        return drirectorName;
    }

    public void setDrirectorName(String drirectorName) {
        this.drirectorName = drirectorName;
    }

    public List<MovieEntity> getMovies() {
        return movies;
    }

    public void setMovies(List<MovieEntity> movies) {
        this.movies = movies;
    }

    public DirectorEntity(String drirectorName) {
        this.drirectorName = drirectorName;
    }
}

