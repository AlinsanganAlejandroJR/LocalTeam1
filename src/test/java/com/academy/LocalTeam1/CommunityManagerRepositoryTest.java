package com.academy.LocalTeam1;

import com.academy.LocalTeam1.model.ComManager;
import com.academy.LocalTeam1.repository.ComManagerRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static java.lang.Boolean.FALSE;
import static org.junit.jupiter.api.Assertions.*;
import static java.lang.Boolean.TRUE;

@DataJpaTest
public class CommunityManagerRepositoryTest {
    @Autowired
    private ComManagerRepository comManagerRepository;

    @Test
    @DisplayName("Given Interface Community Manager Repository" +
            "When is executed, Community manager should be save to Database " +
            "Then result return ComManager")

    public void testSave() {
        //Arrange
        ComManager expected = new ComManager(1L, "ComFirstName1", "ComMiddleName1", "ComLastName1", TRUE);
        //Act
        ComManager result = comManagerRepository.save(expected);
        //Assert
        assertEquals(expected, result);
    }
}
