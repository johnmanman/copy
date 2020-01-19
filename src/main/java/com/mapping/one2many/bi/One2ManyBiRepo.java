package com.mapping.one2many.bi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface One2ManyBiRepo extends JpaRepository <AuthorBi, Integer> {

}
