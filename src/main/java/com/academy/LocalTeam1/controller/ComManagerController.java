package com.academy.LocalTeam1.controller;

import com.academy.LocalTeam1.exception.InvalidStringFormatException;
import com.academy.LocalTeam1.exception.RecordNotFoundException;
import com.academy.LocalTeam1.model.ComManager;
import com.academy.LocalTeam1.service.ComManagerService;
import com.academy.LocalTeam1.service.ComManagerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ComManager")
public class ComManagerController {
    @Autowired
    private ComManagerService comManagerService;

    @PutMapping("/save/{id}")
    private ComManager updateComManager(@RequestBody ComManager comManager, @PathVariable Long id) throws RecordNotFoundException, InvalidStringFormatException{
        return comManagerService.updateComManager(comManager,id);
    }
}
