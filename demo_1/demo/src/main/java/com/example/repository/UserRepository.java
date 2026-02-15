package com.exemple.prototype.repository;

import com.exemple.prototype.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Hérite de méthodes comme save(), findAll(), delete(), etc.
}