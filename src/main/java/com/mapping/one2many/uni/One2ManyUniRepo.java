package com.mapping.one2many.uni;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository 
public interface One2ManyUniRepo extends JpaRepository<Author, Integer> {

}
