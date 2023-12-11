package com.myanimelist.myAnimeListClone.Service.Contracts;


import com.myanimelist.myAnimeListClone.Core.Result.DataResult;
import com.myanimelist.myAnimeListClone.Core.Result.Result;

import java.util.List;

public interface CRUDService<EntityResponseDto, EntitySaveRequestDto, EntityUpdateRequestDto> {

    Result add(EntitySaveRequestDto entitySaveRequestDto);

    DataResult<EntityResponseDto> deleteByid(Long id);

    DataResult<List<EntityResponseDto>> getAll();

    DataResult<EntityResponseDto> getById(Long id);

    Result update(EntityUpdateRequestDto entityUpdateRequestDto);
}
