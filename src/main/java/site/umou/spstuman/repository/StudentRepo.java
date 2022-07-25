package site.umou.spstuman.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import site.umou.spstuman.entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {

}
