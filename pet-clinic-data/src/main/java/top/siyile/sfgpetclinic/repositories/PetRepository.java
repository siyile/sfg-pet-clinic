package top.siyile.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import top.siyile.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
