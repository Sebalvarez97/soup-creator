package com.sitrack.soupcreator.services.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DictionaryService {

    private List<String> words;

    public Optional<String> getRandomWord(int length) {
        String word = null;
        for (String element : words) {
            int min = 0;
            int max = words.size();
            int randomNumber = min + (int) (Math.random() * ((max - min) + 1));
            if (words.get(randomNumber).length() == length) {
                word = words.get(randomNumber);
                break;
            }
        }
        return Optional.of(word);
    }
}
