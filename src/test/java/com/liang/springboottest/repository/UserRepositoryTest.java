package com.liang.springboottest.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootTest

class UserRepositoryTest {
    @Autowired
    private FirstCaseRepository userRepository;

    @Test
    void findAll(){
        System.out.println(userRepository.findAll().size());
    }
}