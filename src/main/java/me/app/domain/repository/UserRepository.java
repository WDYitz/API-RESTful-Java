package me.app.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.app.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
