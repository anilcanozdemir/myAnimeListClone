package com.myanimelist.myAnimeListClone.Entity;

import com.myanimelist.myAnimeListClone.Enums.Recommend;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "review")
public class Review {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "anime_id")
    private Anime anime;
    @Column
    private String reviewText;
    @Column
    private Integer rating;
    @Column
    @Enumerated(EnumType.STRING)
    private Recommend recommend;
    @Column
    private boolean containSpoiler;


}