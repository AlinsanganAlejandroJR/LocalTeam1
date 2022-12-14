package com.academy.LocalTeam1.controller;

import com.academy.LocalTeam1.exception.InvalidStringFormatException;
import com.academy.LocalTeam1.exception.RecordNotFoundException;
import com.academy.LocalTeam1.model.ComManager;
import com.academy.LocalTeam1.service.ComManagerService;
import com.academy.LocalTeam1.service.ComManagerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/community/manager")
public class ComManagerController {
    @Autowired
    private ComManagerService comManagerService;

    @PutMapping("{id}")
    private ComManager updateComManager(@RequestBody ComManager comManager, @PathVariable Long id) throws RecordNotFoundException, InvalidStringFormatException{
        return comManagerService.updateComManager(comManager,id);
    }
    @PostMapping
    public ComManager addComManager(@RequestBody ComManager comManager) throws InvalidStringFormatException {
        return comManagerService.addComManager(comManager);
    }
}
