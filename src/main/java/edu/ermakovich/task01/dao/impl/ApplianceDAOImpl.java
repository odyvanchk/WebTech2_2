package main.java.edu.ermakovich.task01.dao.impl;

import main.java.edu.ermakovich.task01.dao.ApplianceDAO;
import main.java.edu.ermakovich.task01.entity.Appliance;
import main.java.edu.ermakovich.task01.entity.Teapot;
import main.java.edu.ermakovich.task01.entity.criteria.Criteria;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

import java.lang.reflect.Field;
import java.util.*;

/**
 * Implementation of Appliance DAO.
 */
public class ApplianceDAOImpl implements ApplianceDAO {
	/**
	 * path to XML file.
	 */
	private static final String PATH = "src/main/resources/appliances.xml";

	/**
	 * finds all Appliance by criteria.
	 * @param criteria filters by this.
	 * @return list of Appliance.
	 */
	@Override
	public List<Appliance> find(Criteria criteria) {
		List<Appliance> appliances = new ArrayList<>();
		try{
			XMLDecoder decoder = new XMLDecoder(
					new BufferedInputStream(
							new FileInputStream(PATH)));
			Appliance result;
			do{
				result = (Appliance)decoder.readObject();

				if (hasCriteria(criteria, result)){
					appliances.add((Appliance) result);
				}
			}
			while(result != null);

			decoder.close();}
		catch (FileNotFoundException e){
			System.out.println("File not found");
		}
		catch (ArrayIndexOutOfBoundsException ignored){
			//end of file
		} catch (NoSuchFieldException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return appliances;

	}

	/**
	 * does appliance have criteria?
	 * @param criteria filters by criteria.
	 * @param appliance appliance
	 * @return true if appliance has all criteria.
	 */
	private boolean hasCriteria(Criteria criteria, Appliance appliance) throws NoSuchFieldException, IllegalAccessException {
		if (!appliance.getClass().getSimpleName().equals(criteria.getGroupSearchName())){
			return false;
		}

		Set<String> properties = criteria.getCriteria().keySet();
		Field field1 = appliance.getClass().getSuperclass().getDeclaredField("price");

		for (String prop : properties) {
			Object fieldValue;

			Field field = appliance.getClass().getDeclaredField(prop);
			field.setAccessible(true);
			fieldValue = field.get(appliance);
			if (!fieldValue.toString().equals(criteria.getCriteria().get(prop).toString())) {
				return false;
			}
		}
return true;
	}

	/**
	 * saves list of Appliance to XML file.
	 * @param list list of Appliance.
	 */
	@Override
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

	/**
	 * parses XML file to list of Appliance.
	 * @return list of Appliance.
	 */
	@Override
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
		catch (FileNotFoundException e){
			System.out.println("File not found");
		}
		catch (ArrayIndexOutOfBoundsException ignored){
			//end of file
		}
		return appliances;
	}


	@Override
	public List<Appliance> findAll(Class<? extends Enum<?>> e){
		List<Appliance> appliances = parseXML();
		List<Appliance> result = new ArrayList<>();
		for (Appliance appliance : appliances){
			if (e.getSimpleName().equals(appliance.getClass().getSimpleName())){
				result.add(appliance);
			}
		}
		return result;
	}

	/**
	 * finds all appliances with minimal price.
	 * @param appliances list of appliances.
	 * @return list of appliances.
	 */
	@Override
	public List<Appliance> findApplianceWithMinPrice() {
		List<Appliance> appliances = parseXML();
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
