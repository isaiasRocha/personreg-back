package br.com.api.personreg.controller;

import br.com.api.personreg.model.PersonInput;
import br.com.api.personreg.model.PersonModel;
import br.com.api.personreg.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class PersonController {

    private final PersonService service;

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping
    public ResponseEntity<PersonModel> create(@RequestBody PersonInput input) {
        PersonModel model = service.create(input);
        return ResponseEntity.ok(model);
    }

}
