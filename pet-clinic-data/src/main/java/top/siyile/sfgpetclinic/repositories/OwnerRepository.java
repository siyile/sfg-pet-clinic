package top.siyile.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import top.siyile.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
