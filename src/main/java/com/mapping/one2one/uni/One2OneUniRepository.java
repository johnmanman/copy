package com.mapping.one2one.uni;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface One2OneUniRepository extends JpaRepository<CustomerUni, Integer>{

}
