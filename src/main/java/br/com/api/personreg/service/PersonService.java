package br.com.api.personreg.service;

import br.com.api.personreg.model.PersonInput;
import br.com.api.personreg.model.PersonModel;

public interface PersonService {
    PersonModel create(PersonInput input);

}
