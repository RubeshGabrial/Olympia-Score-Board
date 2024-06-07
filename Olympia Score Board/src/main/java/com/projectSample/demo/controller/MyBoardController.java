package com.projectSample.demo.controller;

import com.projectSample.demo.model.MyBoard;
import com.projectSample.demo.service.MyBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/myboard")
public class MyBoardController {


    @Autowired
    private MyBoardService myBoardService;

    @PostMapping("/addCountry")
    public MyBoard addCountryDetails(@RequestBody MyBoard myBoard) {
        return myBoardService.addCountryDetails(myBoard);
    }

    @GetMapping("/getCountryDetails/{countryName}")
    public MyBoard getCountryDetailsByName(@PathVariable String countryName) {
        return myBoardService.getCountryDetailsByName(countryName);
    }

    @GetMapping("/getAllCountryDetails")
    public List<MyBoard> getAllCountryDetails() {
        return myBoardService.getAllCountryDetails();
    }

    @GetMapping("/calculateTotalExpenses/{countryName}")
    public Map<String, Double> calculateTotalExpenses(@PathVariable String countryName) {
        double totalExpenses = myBoardService.calculateTotalExpenses(countryName);
        Map<String, Double> response = new HashMap<>();
        response.put("totalExpenses", totalExpenses);
        return response;
    }
}
