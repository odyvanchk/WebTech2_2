package main.java.edu.ermakovich.task01.dao.impl;

import main.java.edu.ermakovich.task01.dao.ApplianceDAO;
import main.java.edu.ermakovich.task01.entity.Appliance;
import main.java.edu.ermakovich.task01.entity.ApplianceType;
import main.java.edu.ermakovich.task01.entity.Teapot;
import main.java.edu.ermakovich.task01.entity.criteria.Criteria;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {
	private static final String PATH = "src/main/resources/appliances.xml";

	@Override
	public Appliance find(Criteria criteria) {

		return null;
	}


	public void saveXML (List<Appliance> list) {
		try {
			XMLEncoder encoder = new XMLEncoder(
					new BufferedOutputStream(
							new FileOutputStream(PATH)));
			for (Appliance appliance : list) {
				encoder.writeObject(appliance);
			}
			encoder.close();
		}
		 catch (ArrayIndexOutOfBoundsException | FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public List<Appliance> parseXML() {
		List<Appliance> appliances = new ArrayList<>();
		try{
			XMLDecoder decoder = new XMLDecoder(
				new BufferedInputStream(
						new FileInputStream(PATH)));
			Object result;
			do{
				result = decoder.readObject();
				appliances.add((Appliance) result);
			}
			while(result != null);

			decoder.close();}
		catch (FileNotFoundException ignored){ }
		catch (ArrayIndexOutOfBoundsException ignored){
			//end of file
		}
		return appliances;
	}

	@Override
	public List<Appliance> findAllTeapots(List<Appliance> list) {
		List<Appliance> result = new ArrayList<>();
		for (Appliance el:
			 list) {
			if (el.getClass().getSimpleName().equals("Teapot")){
				result.add(el);
			}
		}
		return result;
	}

	@Override
	public List<Appliance> findApplianceWithMinPrice(List<Appliance> appliances) {
		appliances.sort(Comparator.comparing(Appliance::getPrice));
		List<Appliance> result = new ArrayList<>();

		double minPrice = appliances.get(0).getPrice();
		int i =0;

		while (appliances.get(i).getPrice() == minPrice){
			result.add(appliances.get(i));
			i++;
		}

		return result;
	}




}
