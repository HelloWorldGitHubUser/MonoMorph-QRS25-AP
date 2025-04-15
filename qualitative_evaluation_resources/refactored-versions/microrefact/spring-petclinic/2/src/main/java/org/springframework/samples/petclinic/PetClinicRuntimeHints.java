package org.springframework.samples.petclinic;
 import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
public class PetClinicRuntimeHints implements RuntimeHintsRegistrar{


@Override
public void registerHints(RuntimeHints hints,ClassLoader classLoader){
    // https://github.com/spring-projects/spring-boot/issues/32654
    hints.resources().registerPattern("db/*");
    hints.resources().registerPattern("META-INF/resources/webjars/*");
}


}