package studentsRegistrationSystem.studentsRegistrationSystem.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import studentsRegistrationSystem.studentsRegistrationSystem.entity.Students;

public interface StudentsRepository extends JpaRepository<Students,Integer> {
}
