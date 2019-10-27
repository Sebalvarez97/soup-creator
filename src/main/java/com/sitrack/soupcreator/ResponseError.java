package com.sitrack.soupcreator;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ResponseError extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String errorDescription;
    private int status = HttpStatus.BAD_REQUEST.ordinal();

    public ResponseError(String errorDescription) {
        super();
        this.errorDescription=errorDescription;

    }
}
