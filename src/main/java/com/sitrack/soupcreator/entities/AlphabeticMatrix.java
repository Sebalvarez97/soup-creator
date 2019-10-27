package com.sitrack.soupcreator.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
public class AlphabeticMatrix {
    private char[][] matrix;

    public AlphabeticMatrix(int w, int h){
        this.matrix = new char[h][w];
    }
}
