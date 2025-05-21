package com.javaspring.dslist.exception;

public class GameListListNotNullException extends RuntimeException{
    public GameListListNotNullException(){
        super("gameList not found");
    }
}
