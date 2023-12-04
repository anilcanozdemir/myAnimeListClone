package com.myanimelist.myAnimeListClone.Core.ModelMapper;

import com.myanimelist.myAnimeListClone.DTOs.AnimeResponseDto;
import com.myanimelist.myAnimeListClone.DTOs.AnimeSaveRequestDto;
import com.myanimelist.myAnimeListClone.DTOs.AnimeUpdateRequestDto;
import com.myanimelist.myAnimeListClone.Entity.Item.Anime;

public class AnimeMapper implements MapperProfile<AnimeResponseDto, AnimeSaveRequestDto, AnimeUpdateRequestDto, Anime> {
    /*TODO

     */
    @Override
    public AnimeResponseDto entitytoResponseDto(Anime anime) {
        return null;
    }

    @Override
    public Anime saveRequestDtoToEntity(AnimeSaveRequestDto animeSaveRequestDto) {
        return null;
    }

    @Override
    public Anime updateRequestDtoEntity(AnimeUpdateRequestDto animeUpdateRequestDto) {
        return null;
    }
}
