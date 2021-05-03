package net.javagudies.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javagudies.springboot.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
