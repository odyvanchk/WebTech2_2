package main.java.edu.ermakovich.task01.service.validation;

import main.java.edu.ermakovich.task01.entity.Appliance;
import main.java.edu.ermakovich.task01.entity.ApplianceType;
import main.java.edu.ermakovich.task01.entity.criteria.Criteria;
import main.java.edu.ermakovich.task01.entity.criteria.SearchCriteria;

import java.util.*;
import java.util.stream.Collectors;

/**
 * The type Validator.
 */
public class Validator {

	/**
	 * Criteria validator boolean.
	 *
	 * @param criteria the criteria
	 * @return the boolean
	 */
	public static boolean criteriaValidator(Criteria criteria) {
		return switch (criteria.getGroupSearchName()) {
			case "Laptop" ->  isCriteriaExists(criteria, SearchCriteria.Laptop.class);
			case "Oven" -> isCriteriaExists(criteria, SearchCriteria.Oven.class);
			case "Refrigerator" -> isCriteriaExists(criteria, SearchCriteria.Refrigerator.class);
			case "Speakers" -> isCriteriaExists(criteria, SearchCriteria.Speakers.class);
			case "TabletPC" -> isCriteriaExists(criteria, SearchCriteria.TabletPC.class);
			case "Teapot" -> isCriteriaExists(criteria, SearchCriteria.Teapot.class);
			case "VacuumCleaner" -> isCriteriaExists(criteria, SearchCriteria.VacuumCleaner.class);
			default -> false;
		};
	}

	/**
	 * Is criteria exists boolean.
	 *
	 * @param criteria the criteria
	 * @param e        the enum type of appliance
	 * @return the boolean
	 */
	public static boolean isCriteriaExists(Criteria criteria, Class<? extends Enum<?>> e){
		Set<String> properties = criteria.getCriteria().keySet();
		String[] arr = Arrays.stream(e.getEnumConstants()).map(Enum::toString).toArray(String[]::new);

		return Arrays.asList(arr).containsAll(properties);
	}
}
