package com.sapient.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.sapient.bean.EmployeeBean;
import com.sapient.bean.PersonBean;

@Service
public interface EmployeeInterface extends JpaRepository<EmployeeBean, Integer>
{
//	@Query("Select u.fname from student u join employee a on u.id=a.idl where u.lname=:user")
//	public String getUser1(@Param("user") String user);
////	public String getUser1();
}

