package com.sitrack.soupcreator.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ResponseStandard {

    private int status = HttpStatus.OK.value();
    private Object data = null;
    private String error = null;
    private String[] errorKeys = null;
    private long count;

    public ResponseStandard(Object data) {
        super();
        this.data = data;
    }


    public ResponseStandard() {
        super();
    }

    public ResponseStandard(String error,int status) {
        this.status=status;
        this.error=error;
    }

}
