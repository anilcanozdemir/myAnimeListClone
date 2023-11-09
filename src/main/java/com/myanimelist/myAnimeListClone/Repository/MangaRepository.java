package com.myanimelist.myAnimeListClone.Repository;

import com.myanimelist.myAnimeListClone.Entity.Manga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MangaRepository extends JpaRepository<Manga, Long> {
}