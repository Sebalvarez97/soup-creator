package com.sitrack.soupcreator.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class SoupInsertionError extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String errorDescription;
    private int status = HttpStatus.NOT_FOUND.ordinal();

    public SoupInsertionError(String errorDescription) {
        super();
        this.errorDescription=errorDescription;

    }
}
