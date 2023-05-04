package com.example.demo.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.onemodel.Question;

import jakarta.transaction.Transactional;


@Repository
public interface Questionrepo extends JpaRepository<Question, Integer>
{
	
@Query(value="select * from Question" , nativeQuery = true) 
	public List<Question> getAllData();


@Query(value="select * from Question where qno = ?1", nativeQuery = true)

public List<Question> getD(@Param("qno") int qno);



@Modifying

@Transactional

@Query(value="update Question set qno =:qno where qname =:qname",nativeQuery=true)

public void  update(@Param("qno") int qno,@Param("qname") String qname);





@Modifying

@Transactional

@Query(value="delete from Question where qno=:qno",nativeQuery=true)

Integer delete1(@Param("qno") int qno);





//jpql



@Query(value="select c from Question c where qno =?1",nativeQuery = false)
public List<Question> getDetails(@Param("qno") int qno);

@Modifying
@Transactional
@Query(value= "update Question c set qname=?1 where qno=?2")
public void jpqlupdate(String qname,int qno );

@Modifying
@Transactional
@Query(value="delete from Question c where qno=?1")
public void jpqldelete(String qno);


@Query(value="select c from Question c where qno between ?1 and ?2")
public List<Question>between(int one,int two);

}
