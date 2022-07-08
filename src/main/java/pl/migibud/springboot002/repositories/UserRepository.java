package pl.migibud.springboot002.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.migibud.springboot002.domain.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
