package main.java.edu.ermakovich.task01.dao;

import main.java.edu.ermakovich.task01.dao.impl.ApplianceDAOImpl;

/**
 * Factory for Appliance DAO.
 */
public final class DAOFactory {
	/**
	 * instance of factory.
	 */
	private static final DAOFactory instance = new DAOFactory();

	/**
	 * Appliance DAO.
	 */
	private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

	/**
	 * constructor.
	 */
	private DAOFactory() {}

	/**
	 * retrieves Appliance DAO.
	 * @return Appliance DAO.
	 */
	public ApplianceDAO getApplianceDAO() {
		return applianceDAO;
	}

	/**
	 * retrieves instance of factory.
	 * @return instance.
	 */
	public static DAOFactory getInstance() {
		return instance;
	}
}
