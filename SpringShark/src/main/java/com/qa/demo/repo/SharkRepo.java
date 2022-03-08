package com.qa.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.qa.demo.entity.Shark;

public interface SharkRepo extends JpaRepository<Shark, Long>{

}
