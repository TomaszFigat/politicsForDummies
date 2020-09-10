package com.tomaszfigat.politicsForDummies.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name="post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "text")
    private String text;

    @Column(name = "title")
    private String title;

    @Column(name = "date")
    private LocalDateTime date;

    @OneToMany
    @JoinColumn(name="post_id")
    private List<Comment> comments;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;





}
