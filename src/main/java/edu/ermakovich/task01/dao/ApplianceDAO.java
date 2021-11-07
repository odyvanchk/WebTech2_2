package main.java.edu.ermakovich.task01.dao;

import main.java.edu.ermakovich.task01.entity.Appliance;
import main.java.edu.ermakovich.task01.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {
	Appliance find(Criteria criteria);

	void saveXML(List<Appliance> list);

	List<Appliance> parseXML();

	public List<Appliance> findAllTeapots(List<Appliance> list);

	List<Appliance> findApplianceWithMinPrice(List<Appliance> appliances);
}
