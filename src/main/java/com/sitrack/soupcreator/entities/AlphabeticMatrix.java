package com.sitrack.soupcreator.entities;

import com.sitrack.soupcreator.ErrorMessage;
import com.sitrack.soupcreator.exceptions.SoupInsertionError;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlphabeticMatrix {
    private char[][] matrix;

    public AlphabeticMatrix(int w, int h){
        this.matrix = new char[h][w];
    }

    public void insertWord(String word, int sr, int sc, int er, int ec, WordOrientation orientation){
        char[] wordToArray = word.toCharArray();
        switch (orientation){
            case LEFT_TO_RIGHT:
                insertWord_LTR(wordToArray, sr, sc, er, ec);
                break;
            case RIGHT_TO_LEFT:
                insertWord_RTL(wordToArray, sr, sc, er, ec);
                break;
            case TOP_TO_BOTTOM:
                insertWord_TTB(wordToArray, sr, sc, er, ec);
                break;
            case BOTTOM_TO_TOP:
                insertWord_BTT(wordToArray, sr, sc, er, ec);
                break;
            case DIAGONAL_LTR_TTB:
                insertWord_D_LTR_TB(wordToArray, sr, sc, er, ec);
                break;
            default:
                throw new SoupInsertionError(ErrorMessage.NOT_FOUND_ORIENTATION);
        }
    }

    private void insertWord_LTR(char[] word, int sr, int sc, int er, int ec){
        if (sr != er || word.length-1 != ec-sc)
            throw new SoupInsertionError(ErrorMessage.FAIL_ORIENTATION);
        int r, c;
        r = sr;
        c = sc;
        for (char l: word
             ) {
            if (matrix[r][c] != '#' || matrix[r][c] != l) throw new SoupInsertionError(ErrorMessage.NOT_EMPTY_SPACE);
            matrix[r][c] = l;
            c++;
        }
    }
    private void insertWord_RTL(char[] word, int sr, int sc, int er, int ec){
        if (sr != er || - (word.length-1) != ec-sc)
            throw new SoupInsertionError(ErrorMessage.FAIL_ORIENTATION);
        int r, c;
        r = sr;
        c = sc;
        for (char l: word
        ) {
            if (matrix[r][c] != '#' || matrix[r][c] != l) throw new SoupInsertionError(ErrorMessage.NOT_EMPTY_SPACE);
            matrix[r][c] = l;
            c--;
        }
    }
    private void insertWord_TTB(char[] word, int sr, int sc, int er, int ec){
        if (sc != ec || word.length-1 != er-sr)
            throw new SoupInsertionError(ErrorMessage.FAIL_ORIENTATION);
        int r, c;
        r = sr;
        c = sc;
        for (char l: word
        ) {
            if (matrix[r][c] != '#' || matrix[r][c] != l) throw new SoupInsertionError(ErrorMessage.NOT_EMPTY_SPACE);
            matrix[r][c] = l;
            r++;
        }
    }
    private void insertWord_BTT(char[] word, int sr, int sc, int er, int ec){
        if (sc != ec || - (word.length-1) != er-sr)
            throw new SoupInsertionError(ErrorMessage.FAIL_ORIENTATION);
        int r, c;
        r = sr;
        c = sc;
        for (char l: word
        ) {
            if (matrix[r][c] != '#' || matrix[r][c] != l) throw new SoupInsertionError(ErrorMessage.NOT_EMPTY_SPACE);
            matrix[r][c] = l;
            r++;
        }
    }
    private void insertWord_D_LTR_TB(char[] word, int sr, int sc, int er, int ec){
        
    }

}
