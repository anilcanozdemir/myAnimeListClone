package com.myanimelist.myAnimeListClone.Entity.Item;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    /*TODO*/
    private Item item;
    @Column(name = "user_id")
    @ManyToOne
    @JoinColumn(name = "user_id")

    private User user;
    @Column
    private String content;
    @Column
    private Integer rating;



}