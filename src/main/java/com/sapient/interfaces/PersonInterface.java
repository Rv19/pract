package com.sapient.interfaces;

import java.util.List;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.sapient.bean.PersonBean;

@Service
public interface PersonInterface extends JpaRepository<PersonBean, Integer> {
//	Optional<PersonBean> findByFname(String fname);
	List<PersonBean> findByFname(String fname);
	
}
