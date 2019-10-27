package com.sitrack.soupcreator.controllers;

import com.sitrack.soupcreator.dtos.SoapDTO;
import com.sitrack.soupcreator.entities.ResponseStandard;
import com.sitrack.soupcreator.services.AlphabetSoupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alphabetSoup")
public class SoapCreatorController {

    @Autowired
    AlphabetSoupService alphabetSoupService;

    @PostMapping("/")
    public ResponseStandard create(@RequestBody SoapDTO soapDTO){
        return new ResponseStandard(alphabetSoupService.create(soapDTO));
    }
}
