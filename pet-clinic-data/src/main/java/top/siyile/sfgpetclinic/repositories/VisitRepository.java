package top.siyile.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import top.siyile.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
