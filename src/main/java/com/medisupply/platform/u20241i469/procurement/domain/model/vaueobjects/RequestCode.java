package com.medisupply.platform.u20241i469.procurement.domain.model.vaueobjects;

public record RequestCode(String code) {

    public RequestCode{
        if(code==null || code.isBlank()){
            throw new IllegalArgumentException("Request code cannot be null or blank");
        }
    }
}
