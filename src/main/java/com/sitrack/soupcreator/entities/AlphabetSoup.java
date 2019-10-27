package com.sitrack.soupcreator.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

@Getter
@Setter
public class AlphabetSoup {

    @Id
    private UUID id;

    private int w;
    private int h;
    private boolean ltr;
    private boolean rtl;
    private boolean ttb;
    private boolean btt;
    private boolean d;

    private List<String> words;

    private AlphabeticMatrix matrix;

    public AlphabetSoup() {
        this.id = UUID.randomUUID();
    }

    public void printValue(){
        Stream.of(matrix.getMatrix()).forEach(chars -> {
            System.out.println(chars);
        });
    }
}
