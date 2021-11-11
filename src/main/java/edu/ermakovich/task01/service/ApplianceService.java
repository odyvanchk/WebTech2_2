package main.java.edu.ermakovich.task01.service;

import main.java.edu.ermakovich.task01.entity.Appliance;
import main.java.edu.ermakovich.task01.entity.criteria.Criteria;

import java.util.List;

/**
 * The interface Appliance service.
 */
public interface ApplianceService {

	/**
	 * Find appliance by criteria.
	 *
	 * @param criteria the criteria
	 * @return the list
	 */
	List<Appliance> find(Criteria criteria);

	/**
	 * Find all teapots list.
	 *
	 * @return the list
	 */
	List<Appliance> findAllTeapots();

	/**
	 * Find appliance with min price list.
	 *
	 * @return the list
	 */
	List<Appliance> findApplianceWithMinPrice();

}
