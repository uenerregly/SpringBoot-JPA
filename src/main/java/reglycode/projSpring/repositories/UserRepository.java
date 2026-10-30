package reglycode.projSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import reglycode.projSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
