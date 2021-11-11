package main.java.edu.ermakovich.task01.service;

import main.java.edu.ermakovich.task01.service.impl.ApplianceServiceImpl;

/**
 * The type Service factory.
 */
public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private final ApplianceService applianceService = new ApplianceServiceImpl();
	
	private ServiceFactory() {}

	/**
	 * Gets appliance service.
	 *
	 * @return the appliance service
	 */
	public ApplianceService getApplianceService() {

		return applianceService;
	}

	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static ServiceFactory getInstance() {
		return instance;
	}

}
