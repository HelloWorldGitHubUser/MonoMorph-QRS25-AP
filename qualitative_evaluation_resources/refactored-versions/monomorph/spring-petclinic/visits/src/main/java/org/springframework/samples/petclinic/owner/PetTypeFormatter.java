/* Copyright 2012-2019 the original author or authors.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package org.springframework.samples.petclinic.owner;
import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;
/**
 * Instructs Spring MVC on how to parse and print elements of type 'PetType'. Starting
 * from Spring 3.0, Formatters have come as an improvement in comparison to legacy
 * PropertyEditors. See the following links for more details: - The Spring ref doc:
 * https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#format
 *
 * @author Mark Fisher
 * @author Juergen Hoeller
 * @author Michael Isvy
 */
@Component
public class PetTypeFormatter implements Formatter<org.springframework.samples.petclinic.monomorph.dto.generated.client.PetType> {
    private final org.springframework.samples.petclinic.monomorph.id.generated.client.OwnerRepository owners;

    @Autowired
    public PetTypeFormatter(org.springframework.samples.petclinic.monomorph.id.generated.client.OwnerRepository owners) {
        this.owners = owners;
    }

    @Override
    public String print(org.springframework.samples.petclinic.monomorph.dto.generated.client.PetType petType, Locale locale) {
        return petType.getName();
    }

    @Override
    public org.springframework.samples.petclinic.monomorph.dto.generated.client.PetType parse(String text, Locale locale) throws ParseException {
        Collection<org.springframework.samples.petclinic.monomorph.dto.generated.client.PetType> findPetTypes = this.owners.findPetTypes();
        for (org.springframework.samples.petclinic.monomorph.dto.generated.client.PetType type : findPetTypes) {
            if (type.getName().equals(text)) {
                return type;
            }
        }
        throw new ParseException("type not found: " + text, 0);
    }
}