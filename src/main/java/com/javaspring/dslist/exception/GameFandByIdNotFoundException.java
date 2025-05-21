package com.javaspring.dslist.exception;

public class GameFandByIdNotFoundException extends RuntimeException{

    public GameFandByIdNotFoundException(){
        super("game id nout found");
    }
    
}
