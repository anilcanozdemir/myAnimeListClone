package com.myanimelist.myAnimeListClone.Core.Result;

public class ErrorResult extends Result {

    public ErrorResult(
            String message) {
        super(false, message);
    }
}
