package com.hihw.web.controllers;

import com.hihw.web.domains.PlayerDTO;
import com.hihw.web.services.PlayerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="http://localhost:8080", allowedHeaders = "*")
@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired PlayerService playerService;
    @Autowired PlayerDTO player;
    @GetMapping("")
    public List<PlayerDTO> list(){
        return playerService.retrieve();
    }
    @PostMapping("/{playerId}/access")
    public PlayerDTO login(
            @PathVariable String  playerId,
            @RequestBody PlayerDTO player
    ){
        System.out.println("뷰와 연결이 성공 !!! 아이디는 "+ playerId);
        return player;
    }
}