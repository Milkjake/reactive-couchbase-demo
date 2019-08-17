package nz.co.jacques.demo.repository;

import nz.co.jacques.demo.model.Person;
import org.springframework.data.couchbase.repository.ReactiveCouchbaseRepository;

public interface PersonRepository extends ReactiveCouchbaseRepository<Person, String> {
}
