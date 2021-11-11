package main.java.edu.ermakovich.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Criteria.
 */
public class Criteria {

	private String groupSearchName;

	/**
	 * Gets criteria.
	 *
	 * @return the criteria
	 */
	public Map<String, Object> getCriteria() {
		return criteria;
	}

	private Map<String, Object> criteria = new HashMap<String, Object>();

	/**
	 * Instantiates a new Criteria.
	 *
	 * @param groupSearchName the group search name
	 */
	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	/**
	 * Gets group search name.
	 *
	 * @return the group search name
	 */
	public String getGroupSearchName() {
		return groupSearchName;
	}

	/**
	 * Adds criteria with value to list.
	 *
	 * @param searchCriteria the search criteria
	 * @param value          the value
	 */
	public void add(String searchCriteria, Object value) {

		criteria.put(searchCriteria, value);
	}


}
