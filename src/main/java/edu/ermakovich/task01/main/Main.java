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

		System.out.println("Appliance with min price:");
		PrintApplianceInfo.print(service.findApplianceWithMinPrice());
		
		System.out.println("All teapots:");
		PrintApplianceInfo.print(service.findAll(SearchCriteria.Teapot.class));
	}
}