package com.myanimelist.myAnimeListClone.Controller;


import com.myanimelist.myAnimeListClone.Core.Result.DataResult;
import com.myanimelist.myAnimeListClone.Core.Result.Result;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CRUDController<EntityResponseDto, EntitySaveRequestDto, EntityUpdateRequestDto> {
    ResponseEntity<Result> add(EntitySaveRequestDto entitySaveRequestDto);

    ResponseEntity<DataResult<List<EntityResponseDto>>> getAll();

    ResponseEntity<DataResult<EntityResponseDto>> getById(Long id);

    ResponseEntity<Result> updateById(EntityUpdateRequestDto entityUpdateRequestDto, Long id);

    ResponseEntity<DataResult<EntityResponseDto>> deleteById(Long id);
}
