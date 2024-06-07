package com.projectSample.demo.service;

import com.projectSample.demo.model.MyBoard;

import java.util.List;

public interface MyBoardService {
    MyBoard addCountryDetails(MyBoard myBoard);
    MyBoard getCountryDetailsByName(String countryName);
    List<MyBoard> getAllCountryDetails();
    double calculateTotalExpenses(String countryName);
}
