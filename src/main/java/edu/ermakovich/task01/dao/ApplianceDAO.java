package main.java.edu.ermakovich.task01.dao;

import main.java.edu.ermakovich.task01.entity.Appliance;
import main.java.edu.ermakovich.task01.entity.criteria.Criteria;

import java.util.List;

/**
 * Interface for Appliance DAO.
 */
public interface ApplianceDAO {
	/**
	 * finds all appliances by criteria.
	 * @param criteria filters by this.
	 * @return list of Appliance.
	 */
	List<Appliance> find(Criteria criteria);

	/**
	 * saves list of Appliance to XML file.
	 * @param list list of Appliance.
	 */
	void saveXML(List<Appliance> list);

	/**
	 * parses XML file to list of Appliance.
	 * @return list of Appliance.
	 */
	List<Appliance> parseXML();

	/**
	 * finds all teapots from list of appliances.
	 * @param list list of appliances.
	 * @return list of Teapots.
	 */
	List<Appliance> findAllTeapots(List<Appliance> list);

	/**
	 * finds all appliances with minimal price.
	 * @param appliances list of appliances.
	 * @return list of appliances.
	 */
	List<Appliance> findApplianceWithMinPrice(List<Appliance> appliances);
}
