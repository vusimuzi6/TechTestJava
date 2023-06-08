package za.co.anycompany.datalayer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import za.co.anycompany.model.Customer;

@Repository
@RepositoryRestResource(exported = false)
public interface CustomerRepository extends CrudRepository<Customer,Long> {



}
