package com.example.modelMapper.demo.modelMapper.controllers;

import com.example.modelMapper.demo.modelMapper.models.Params;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@RestController
public class SettingsController {

    @GetMapping(value = "/{id}/settings/")
    public ResponseEntity<String> getSettings(
            @RequestHeader(value = "Authorization", required = true) String token,
            @PathVariable(value = "id", required = true) Long id,
            @RequestHeader Map<String, String> headers,
            // en caso de que el header devuelve varios valores para 1 misma key, necesitamos usar MultiValueMap !!!
            @Valid @ModelAttribute Params params) {

        // Solo para demostración, imprimimos los valores
        String result =  // "Bearer Token: " + token + "\n" +
                "ID: " + id + "\n" +
                "Headers: " + headers + "\n" + // headers.get("authorization")
                "Params: " + params.getEffectFromDate() + " / " + params.getEffectToDate()
                        + " / " +  params.getOffset() + " / " +  params.getLimit();

        return ResponseEntity.ok(result);
    }

//    @GetMapping("/hola")
//    public ResponseEntity<String> getHola (
//            @RequestHeader Map<String, String> headers)
//    {
//        System.out.println(headers);
//        return ResponseEntity.ok("hola");
//    }
}
