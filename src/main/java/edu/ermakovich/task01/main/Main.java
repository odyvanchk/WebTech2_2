package main.java.edu.ermakovich.task01.main;

import main.java.edu.ermakovich.task01.entity.*;
import main.java.edu.ermakovich.task01.entity.criteria.Criteria;
import main.java.edu.ermakovich.task01.entity.criteria.SearchCriteria;
import main.java.edu.ermakovich.task01.service.ApplianceService;
import main.java.edu.ermakovich.task01.service.ServiceFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		service.findAllTeapots();

		List<Appliance> appliances = new ArrayList<>();
		System.out.println(service.findApplianceWithMinPrice());

		Criteria criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());//"Oven"
     	criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 1200);
		criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());
		criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 30.0);
		criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 60);


		System.out.println(service.find(criteriaOven));
//		//////////////////////////////////////////////////////////////////
//
//
//		appliance = service.find(criteriaOven);
//
//		PrintApplianceInfo.print(appliance);
//
//		//////////////////////////////////////////////////////////////////
//
//		criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());
//		criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 200);
//		criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 300);
//
//		appliance = service.find(criteriaOven);
//
//		PrintApplianceInfo.print(appliance);
//
//		//////////////////////////////////////////////////////////////////
//
//		Criteria criteriaTabletPC = new Criteria(SearchCriteria.TabletPC.class.getSimpleName());
//		criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "BLUE");
//		criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
//		criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 4);
//
//		appliance = service.find(criteriaOven);// find(Object...obj)
//
//		PrintApplianceInfo.print(appliance);

	}


}
