package com.sitrack.soupcreator.services;

import com.sitrack.soupcreator.dtos.SoapDTO;

import java.util.UUID;

public interface AlphabetSoupService {

    UUID create(SoapDTO soapDTO);

}
