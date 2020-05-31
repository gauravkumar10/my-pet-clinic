package services;

import com.gaurav.mypetclinic.model.Owner;
import com.gaurav.mypetclinic.model.Vet;

import java.util.Set;

public interface OwnerService extends CrudService {
    Owner findByLastName(String lastName);
}
