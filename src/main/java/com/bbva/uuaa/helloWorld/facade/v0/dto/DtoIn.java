package com.bbva.uuaa.helloWorld.facade.v0.dto;


import lombok.Getter;
import lombok.Setter;
import javax.validation.Valid;


@Getter
@Setter

public class DtoIn {
    private String nuip;
    @Valid
    private Details details;
}
