package main.java.edu.ermakovich.task01.service.impl;

import main.java.edu.ermakovich.task01.dao.ApplianceDAO;
import main.java.edu.ermakovich.task01.dao.DAOFactory;
import main.java.edu.ermakovich.task01.entity.Appliance;
import main.java.edu.ermakovich.task01.entity.criteria.Criteria;
import main.java.edu.ermakovich.task01.service.ApplianceService;
import main.java.edu.ermakovich.task01.service.validation.Validator;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Appliance service.
 */
public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public List<Appliance> find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		return applianceDAO.find(criteria);
	}


	@Override
	public List<Appliance> findApplianceWithMinPrice() {
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		return applianceDAO.findApplianceWithMinPrice();
	}

	/**
	 * Find all appliance by type list.
	 *
	 * @param e the enum
	 * @return the list of appliances
	 */
	@Override
	public List<Appliance> findAll(Class<? extends Enum<?>> e) {
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		return applianceDAO.findAll(e);
	}
}


