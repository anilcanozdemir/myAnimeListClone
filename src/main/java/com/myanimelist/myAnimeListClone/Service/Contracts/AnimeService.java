package com.myanimelist.myAnimeListClone.Service.Contracts;

import com.myanimelist.myAnimeListClone.DTOs.AnimeResponseDto;
import com.myanimelist.myAnimeListClone.DTOs.AnimeSaveRequestDto;
import com.myanimelist.myAnimeListClone.DTOs.AnimeUpdateRequestDto;

public interface AnimeService extends CRUDService<AnimeResponseDto, AnimeSaveRequestDto, AnimeUpdateRequestDto> {
}
