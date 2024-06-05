package programmerzamannow.springdata.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import programmerzamannow.springdata.jpa.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    
} 