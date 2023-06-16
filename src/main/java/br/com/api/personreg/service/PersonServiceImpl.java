package br.com.api.personreg.service;

import br.com.api.personreg.model.PersonInput;
import br.com.api.personreg.model.PersonModel;
import br.com.api.personreg.persistence.entity.Person;
import br.com.api.personreg.persistence.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PersonServiceImpl  implements PersonService {

    private final ModelMapper mapper;
    private final PersonRepository repository;

    @Override
    public PersonModel create(PersonInput input) {

        Person person = repository.save(mapper.map(input, Person.class));

        return mapper.map(person, PersonModel.class);
    }

}
