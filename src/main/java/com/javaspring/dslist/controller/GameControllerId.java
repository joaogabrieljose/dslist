package com.javaspring.dslist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaspring.dslist.services.GameUseCaseGetId;


@RestController
@RequestMapping("/games")
public class GameControllerId {

    @Autowired
    private GameUseCaseGetId gameUseCaseGetId;

    @GetMapping("/{id}")
    public ResponseEntity<?> gameFindId(@PathVariable Long id){

        try {
            var resultGetId = this.gameUseCaseGetId.findByIdGame(id);
            return ResponseEntity.ok().body(resultGetId);
            
        } catch (Exception e) {
           return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
}
