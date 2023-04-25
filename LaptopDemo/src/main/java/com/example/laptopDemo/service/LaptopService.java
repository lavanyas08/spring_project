package com.example.laptopDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.laptopDemo.dao.LaptopRepository;
import com.example.laptopDemo.model.Laptop;



@Service
public class LaptopService {
@Autowired
	LaptopRepository lapRepository;
	public List <Laptop> getAllDetails(){
		List<Laptop>lapList=lapRepository.findAll();
		return lapList;
	}
	public Laptop saveLaptops(Laptop s) {
		Laptop obj=lapRepository.save(s);
		return obj;
		//return studRepository.save(S);
	}
	public Laptop updateLaptop(Laptop s)
	{
		Laptop obj=lapRepository.save(s);
		return obj;
	}
	public void deleteLaptop(int sNo)
	{
		lapRepository.deleteById(sNo);
	}
	public Laptop getLaptop(int sNo)
	{
		Laptop s=lapRepository.findById(sNo).get();
		return s;
	}
	

}
