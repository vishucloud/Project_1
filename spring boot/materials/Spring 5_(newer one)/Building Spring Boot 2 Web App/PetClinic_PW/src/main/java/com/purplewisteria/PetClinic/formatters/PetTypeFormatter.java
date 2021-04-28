package com.purplewisteria.PetClinic.formatters;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.purplewisteria.PetClinic.model.PetType;
import com.purplewisteria.PetClinic.services.PetTypeService;

import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;


@Component
public class PetTypeFormatter implements Formatter<PetType> {

    private final PetTypeService petTypeService;

    public PetTypeFormatter(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }

    @Override
    public String print(PetType petType, Locale locale) {
        return petType.getName();
    }

    @Override
    public PetType parse(String text, Locale locale) throws ParseException {
        Collection<PetType> findPetTypes = petTypeService.findAll();

        for (PetType type : findPetTypes) {
            if (type.getName().equals(text)) {
                return type;
            }
        }

        throw new ParseException("type not found: " + text, 0);
    }
}