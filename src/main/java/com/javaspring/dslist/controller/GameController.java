package com.javaspring.dslist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaspring.dslist.services.GameUseCase;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameUseCase gameUseCase;

    @GetMapping
    public ResponseEntity<?> findAllGame(){

        try {
            var recursoResult = this.gameUseCase.getGame();
            return ResponseEntity.ok().body(recursoResult);
            
        } catch (Exception e) {
           return ResponseEntity.badRequest().body(e.getMessage());
        }
        
    }
}
