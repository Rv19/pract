package com.sapient.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.bean.PersonBean;
import com.sapient.interfaces.PersonInterface;

@RestController
public class PersonController {
	
	@Autowired
	PersonInterface pi;
	
	@GetMapping(value="/welcome")
	public String test() {
		return "welcome to rest service";
	}
	
	@GetMapping(value="/person/{id}")
	public PersonBean getPerson(@PathVariable Integer id) {
		Optional<PersonBean> pb = pi.findById(id);
		
		try {
			return pb.get();
		}catch(NoSuchElementException e) {
			return new PersonBean();
		}
	}
	
	@GetMapping(value="/person")
	public List<PersonBean> getPersonList() {
		List<PersonBean> pb = pi.findAll();
		
		return pb;
	}
	@GetMapping(value="/personname/{pname}")
	//@RequestMapping(method=RequestMethod.GET,path="/personname/{pname}")
	public List<PersonBean> getPersonList(@PathVariable String pname) {
		List<PersonBean> pb = pi.findByFname(pname);
		
		return pb;
	}
	
	@PostMapping(value="/pinsert")
	public String insertValue(@RequestBody PersonBean pb)
	{
		try {
			pi.save(pb);
			return "true";
		}
		catch(Exception e)
{
	return e.getMessage();
}
}
	
	@PostMapping(value="/piupdate")
	public String UpdateValue(@RequestBody PersonBean pb)
	{
		try {
			pi.save(pb);
			return "true";
		}
		catch(Exception e)
{
	return e.getMessage();
}
}
	
	@PostMapping(value="/pdelet")
	public String deleteValue(@RequestBody PersonBean pb)
	{
		try {
			pi.deleteById(pb.getId());
			return "true";
		}
		catch(Exception e)
{
	return e.getMessage();
}
}
}

