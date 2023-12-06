package com.example.modelMapper.demo.modelMapper.models;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Params {

    private LocalDateTime effectFromDate;
    @NotNull(message = "Debe ser no nulo")
    private LocalDateTime effectToDate;
    @Max(value = 50, message = "The offset value should be less or equal to 50 ")
    @Min(15)
    private Integer offset;
    @NotNull
    private Integer limit;
    @Size(min = 10, max = 100)
    private List<String> sort;
}
