package by.overoneChat.repository;

import by.overoneChat.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser, Integer> {
    MyUser findByUsername(String username);

    boolean existsByUsername(String username);
}
