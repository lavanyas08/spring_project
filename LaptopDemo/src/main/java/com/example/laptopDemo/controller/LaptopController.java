package com.example.laptopDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.laptopDemo.model.Laptop;
import com.example.laptopDemo.service.LaptopService;
@RestController
public class LaptopController {
@Autowired
	LaptopService lapService;
	@GetMapping(value="fetchDetails") 
	public List<Laptop> getAllDetails(){
	List<Laptop> lapList=lapService.getAllDetails();
		return lapList;
}
	@PostMapping(value="/saveDetails")
	public Laptop saveDetails(@RequestBody Laptop s)
	{
		return lapService.saveLaptops(s);
	}
	@PutMapping(value="/updateDetails")
	public Laptop updateLaptop(@RequestBody Laptop s)
	{
		return lapService.saveLaptops(s);
	}
	@DeleteMapping(value="/deleteDetails/{rno}")
	public void deleteLaptop(@PathVariable("rno") int sNo) {
		lapService.deleteLaptop(sNo);
	}
	@GetMapping(value="/getLaptop/{rno}")
	public Laptop getLaptop(@PathVariable("rno") int sNo) {
		return lapService.getLaptop(sNo);
	}
	

}