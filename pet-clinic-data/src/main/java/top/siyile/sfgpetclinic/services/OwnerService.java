package top.siyile.sfgpetclinic.services;

import top.siyile.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
