package main.java.edu.ermakovich.task01.service.impl;

import main.java.edu.ermakovich.task01.dao.ApplianceDAO;
import main.java.edu.ermakovich.task01.dao.DAOFactory;
import main.java.edu.ermakovich.task01.entity.Appliance;
import main.java.edu.ermakovich.task01.entity.criteria.Criteria;
import main.java.edu.ermakovich.task01.service.ApplianceService;
import main.java.edu.ermakovich.task01.service.validation.Validator;

import java.util.ArrayList;
import java.util.List;

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
	public List<Appliance> findAllTeapots(){
		List<Appliance> appliances;
		List<Appliance> allTeapots;

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		appliances = applianceDAO.parseXML();
		allTeapots = applianceDAO.findAllTeapots(appliances);
		return allTeapots;
	}

	@Override
	public List<Appliance> findApplianceWithMinPrice() {
		List<Appliance> appliances;
		List<Appliance> appliancesWithMinPrice;

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		appliances = applianceDAO.parseXML();
		appliancesWithMinPrice = applianceDAO.findApplianceWithMinPrice(appliances);
		return appliancesWithMinPrice;
	}
}


