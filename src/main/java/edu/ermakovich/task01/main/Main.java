package main.java.edu.ermakovich.task01.main;

import main.java.edu.ermakovich.task01.entity.*;
import main.java.edu.ermakovich.task01.entity.criteria.Criteria;
import main.java.edu.ermakovich.task01.entity.criteria.SearchCriteria;
import main.java.edu.ermakovich.task01.service.ApplianceService;
import main.java.edu.ermakovich.task01.service.ServiceFactory;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		List<Appliance> appliances = new ArrayList<>();
		System.out.println("Appliance with min price:");
		PrintApplianceInfo.print(service.findApplianceWithMinPrice());

		Criteria criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 30.0);
		criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 60);

		System.out.println("Appliance by criteria:");
		PrintApplianceInfo.print(service.find(criteriaOven));
	}
}