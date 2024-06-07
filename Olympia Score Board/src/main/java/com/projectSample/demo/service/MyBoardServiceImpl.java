package com.projectSample.demo.service;

import com.projectSample.demo.model.MyBoard;
import com.projectSample.demo.repository.MyBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyBoardServiceImpl implements MyBoardService {

    @Autowired
    private MyBoardRepository myBoardRepository;

    @Override
    public MyBoard addCountryDetails(MyBoard myBoard) {
        return myBoardRepository.save(myBoard);
    }

    @Override
    public MyBoard getCountryDetailsByName(String countryName) {
        Optional<MyBoard> myBoard = myBoardRepository.findByCountryName(countryName);
        return myBoard.orElse(null);
    }

    @Override
    public List<MyBoard> getAllCountryDetails() {
        return myBoardRepository.findAll();
    }

    @Override
    public double calculateTotalExpenses(String countryName) {
        Optional<MyBoard> myBoard = myBoardRepository.findByCountryName(countryName);
        return myBoard.map(board -> board.getParticipantsMedals().size() * 1000.0).orElse(0.0);
    }
}
