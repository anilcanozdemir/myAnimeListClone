package com.myanimelist.myAnimeListClone.Core.Result;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class DataResult<T> extends Result {

    private T data;

    public DataResult(boolean success, String message,T data) {
        super(success, message);
        this.data=data;
    }

}
