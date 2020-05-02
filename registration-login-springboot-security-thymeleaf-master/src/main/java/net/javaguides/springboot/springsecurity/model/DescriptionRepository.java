package net.javaguides.springboot.springsecurity.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DescriptionRepository extends JpaRepository<Description, Long> {

    List<Description> findByDescription(String description);
}
