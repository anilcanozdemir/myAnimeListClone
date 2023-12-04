package com.myanimelist.myAnimeListClone.Core.Result;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Result {
    private boolean success;
    private String message;

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }


}
