package com.sitrack.soupcreator.services.impl;

import com.sitrack.soupcreator.dtos.SoapDTO;
import com.sitrack.soupcreator.entities.AlphabetSoup;
import com.sitrack.soupcreator.services.AlphabetSoupService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AlphabeticSoupServiceImpl implements AlphabetSoupService {

    @Override
    public UUID create(SoapDTO soapDTO) {
        AlphabetSoup alphabetSoup = new AlphabetSoup();
        alphabetSoup.setH(soapDTO.getH());
        alphabetSoup.setW(soapDTO.getW());
        alphabetSoup.setLtr(soapDTO.isLtr());
        alphabetSoup.setRtl(soapDTO.isRtl());
        alphabetSoup.setTtb(soapDTO.isTtb());
        alphabetSoup.setBtt(soapDTO.isBtt());
        alphabetSoup.setD(soapDTO.isD());



        return alphabetSoup.getId();
    }
}
