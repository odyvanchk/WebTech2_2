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
	 * Find appliance with min price list.
	 *
	 * @return the list
	 */
	List<Appliance> findApplianceWithMinPrice();

	/**
	 * Find all appliance by type list.
	 *
	 * @param e the enum
	 * @return the list of appliances
	 */
	List<Appliance> findAll(Class<? extends Enum<?>> e);

}
