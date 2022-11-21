package com.academy.LocalTeam1.service;

import com.academy.LocalTeam1.exception.InvalidStringFormatException;
import com.academy.LocalTeam1.exception.RecordNotFoundException;
import com.academy.LocalTeam1.model.ComManager;

public interface ComManagerService {
    public ComManager updateComManager(ComManager comManager, Long id) throws RecordNotFoundException, InvalidStringFormatException;
}
