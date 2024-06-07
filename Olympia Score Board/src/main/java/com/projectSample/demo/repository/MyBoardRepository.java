package com.projectSample.demo.repository;

import com.projectSample.demo.model.MyBoard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MyBoardRepository extends MongoRepository<MyBoard, String> {
    Optional<MyBoard> findByCountryName(String countryName);
}
