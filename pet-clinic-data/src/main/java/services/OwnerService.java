package services;

import com.gaurav.mypetclinic.model.Owner;
import com.gaurav.mypetclinic.model.Vet;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
