package com.qa.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.Ducks.entity.Duck;

@Repository
public interface DuckRepo extends JpaRepository<Duck, Long>{
	
}
