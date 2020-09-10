package com.tomaszfigat.politicsForDummies.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name="user")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name="userName")
    private String userName;

    @Column(name="name")
    private String name;

    @Column(name="password")
    private String password;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @OneToMany
    @JoinColumn(name="user_id")
    private List<Post> posts = new ArrayList<>();


//
//    public User(String password, String name, String lastName, String email) {
//        this.password = password;
//        this.name = name;
//        this.lastName = lastName;
//        this.email = email;
//    }


}
