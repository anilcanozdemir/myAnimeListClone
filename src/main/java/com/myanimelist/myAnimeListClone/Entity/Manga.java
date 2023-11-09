package com.myanimelist.myAnimeListClone.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "manga")
public class Manga {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}