package WooJ.Gogo.repository;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

import WooJ.Gogo.entity.TestDB;

public interface TestRepository extends CrudRepository<TestDB, Id>{
}



