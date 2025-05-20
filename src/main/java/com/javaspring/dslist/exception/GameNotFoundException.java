package com.javaspring.dslist.exception;

public class GameNotFoundException extends RuntimeException{
    public GameNotFoundException(){
        super("game not found");
    }
}
