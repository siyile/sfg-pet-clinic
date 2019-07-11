package top.siyile.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import top.siyile.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
