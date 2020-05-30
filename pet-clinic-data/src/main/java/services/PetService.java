package services;

import com.gaurav.mypetclinic.model.Pet;
import com.gaurav.mypetclinic.model.Vet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet vet);
    Set<Pet> findAll();
}
