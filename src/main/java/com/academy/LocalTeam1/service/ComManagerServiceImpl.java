package com.academy.LocalTeam1.service;

import com.academy.LocalTeam1.exception.InvalidStringFormatException;
import com.academy.LocalTeam1.exception.RecordNotFoundException;
import com.academy.LocalTeam1.model.ComManager;
import com.academy.LocalTeam1.repository.ComManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComManagerServiceImpl implements ComManagerService{

    @Autowired
    private ComManagerRepository repository;

    private static final String FIRST_AND_LAST_NAME =  "[a-zA-Z-,.Ññ]{2,20}";
    private static final String MIDDLE_NAME =  "[a-zA-Z-,.Ññ]{0,20}";

    @Override
    public ComManager updateComManager(ComManager updateComManager, Long id) throws InvalidStringFormatException, RecordNotFoundException {
        ComManager comManager = repository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("This community manager is not in the record!"));
        if(!updateComManager.getFirstName().matches(FIRST_AND_LAST_NAME)
                || !updateComManager.getLastName().matches(FIRST_AND_LAST_NAME)
                || !updateComManager.getMiddleName().matches(MIDDLE_NAME)) {
            throw new InvalidStringFormatException("Invalid format for name");
        }
        comManager.setFirstName(updateComManager.getFirstName());
        comManager.setLastName(updateComManager.getLastName());
        comManager.setMiddleName(updateComManager.getMiddleName());
        return repository.save(comManager);
    }
}
