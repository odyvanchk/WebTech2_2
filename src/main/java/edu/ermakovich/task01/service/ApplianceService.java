package main.java.edu.ermakovich.task01.service;

import main.java.edu.ermakovich.task01.entity.Appliance;
import main.java.edu.ermakovich.task01.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {	
	
	List<Appliance> find(Criteria criteria);

	List<Appliance> findAllTeapots();

	List<Appliance> findApplianceWithMinPrice();

}
