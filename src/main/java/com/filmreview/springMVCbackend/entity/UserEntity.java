package com.filmreview.springMVCbackend.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;
    @Column
    private String password;
    @Column
    private String username;
    @OneToMany(mappedBy = "movie")
    private List<ReviewEntity> movies;

    public int getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserEntity() {
    }

    public UserEntity(String password, String username) {
        this.password = password;
        this.username = username;
    }
}
