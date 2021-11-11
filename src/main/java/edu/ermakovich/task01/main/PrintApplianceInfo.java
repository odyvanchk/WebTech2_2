package main.java.edu.ermakovich.task01.main;

import main.java.edu.ermakovich.task01.entity.Appliance;

import java.util.List;

/**
 * The type Print appliance info.
 */
public class PrintApplianceInfo {

	/**
	 * Print info about appliances.
	 *
	 * @param appliances the list of appliances
	 */
	public static void print(List<Appliance> appliances) {
		for (Appliance appliance:
			 appliances) {
			System.out.println(appliance.toString());
		}

	}


}
