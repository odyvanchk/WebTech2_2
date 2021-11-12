package main.java.edu.ermakovich.task01.entity.criteria;

/**
 * The type Search criteria.
 */
public final class SearchCriteria {

	/**
	 * The enum Oven.
	 */
	public static enum Oven{
		/**
		 * Power consumption oven.
		 */
		POWER_CONSUMPTION("PowerConsumption"),
		/**
		 * Weight oven.
		 */
		WEIGHT("weight"),
		/**
		 * Capacity oven.
		 */
		CAPACITY("capacity"),
		/**
		 * Depth oven.
		 */
		DEPTH ("depth"),
		/**
		 * Height oven.
		 */
		HEIGHT ("height"),
		/**
		 * Width oven.
		 */
		WIDTH("width"),
		/**
		 * Price oven.
		 */
		PRICE("price");

		private final String value;

		Oven(String value) {
			this.value = value;
		}

		@Override
		public String toString() { return value; }
	}

	/**
	 * The enum Laptop.
	 */
	public static enum Laptop{
		/**
		 * Battery capacity laptop.
		 */
		BATTERY_CAPACITY("batteryCapacity"),
		/**
		 * Os laptop.
		 */
		OS("os"),
		/**
		 * Memory rom laptop.
		 */
		MEMORY_ROM("memoryRom"),
		/**
		 * System memory laptop.
		 */
		SYSTEM_MEMORY("systemMemory"),
		/**
		 * Cpu laptop.
		 */
		CPU("cpu"),
		/**
		 * Display inches laptop.
		 */
		DISPLAY_INCHES("displayInches"),
		/**
		 * Price oven.
		 */
		PRICE("price");

		private final String value;

		Laptop(String value){
			this.value = value;
		}

		@Override
		public String toString(){
			return value;
		}
	}

	/**
	 * The enum Refrigerator.
	 */
	public static enum Refrigerator{
		/**
		 * Power consumption refrigerator.
		 */
		POWER_CONSUMPTION("powerConsumption"),
		/**
		 * Weight refrigerator.
		 */
		WEIGHT("weight"),
		/**
		 * Freezer capacity refrigerator.
		 */
		FREEZER_CAPACITY("freezerCapacity"),
		/**
		 * Overall capacity refrigerator.
		 */
		OVERALL_CAPACITY("overallCapacity"),
		/**
		 * Height refrigerator.
		 */
		HEIGHT("height"),
		/**
		 * Width refrigerator.
		 */
		WIDTH("width"),
		/**
		 * Price oven.
		 */
		PRICE("price");

		private final String value;

		Refrigerator(String value){
			this.value = value;
		}

		@Override
		public String toString(){
			return  value;
		}
	}

	/**
	 * The enum Vacuum cleaner.
	 */
	public static enum VacuumCleaner{
		/**
		 * Power consumption vacuum cleaner.
		 */
		POWER_CONSUMPTION("powerConsumption"),
		/**
		 * Filter type vacuum cleaner.
		 */
		FILTER_TYPE("filterType"),
		/**
		 * Bag type vacuum cleaner.
		 */
		BAG_TYPE("bagType"),
		/**
		 * Wand type vacuum cleaner.
		 */
		WAND_TYPE("wandType"),
		/**
		 * Motor speed regulation vacuum cleaner.
		 */
		MOTOR_SPEED_REGULATION("motorSpeedRegulation"),
		/**
		 * Cleaning width vacuum cleaner.
		 */
		CLEANING_WIDTH("cleaningWidth"),
		/**
		 * Price oven.
		 */
		PRICE("price");

		private final String value;

		VacuumCleaner(String value){
			this.value = value;
		}

		@Override
		public String toString(){
			return  value;
		}
	}

	/**
	 * The enum Tablet pc.
	 */
	public static enum TabletPC{
		/**
		 * Battery capacity tablet pc.
		 */
		BATTERY_CAPACITY("batteryCapacity"),
		/**
		 * Display inches tablet pc.
		 */
		DISPLAY_INCHES("displayInches"),
		/**
		 * Memory rom tablet pc.
		 */
		MEMORY_ROM("memoryRom"),
		/**
		 * Flash memory capacity tablet pc.
		 */
		FLASH_MEMORY_CAPACITY("flashMemoryCapacity"),
		/**
		 * Color tablet pc.
		 */
		COLOR("Color"),
		/**
		 * Price oven.
		 */
		PRICE("price");

		private final String value;

		TabletPC(String value){
			this.value = value;
		}

		@Override
		public String toString(){
			return  value;
		}
	}

	/**
	 * The enum Speakers.
	 */
	public static enum Speakers{
		/**
		 * Power consumption speakers.
		 */
		POWER_CONSUMPTION("powerConsumption"),
		/**
		 * Number of speakers speakers.
		 */
		NUMBER_OF_SPEAKERS("numberOfSpeakers"),
		/**
		 * Frequency range min speakers.
		 */
		FREQUENCY_RANGE_MIN("frequencyRangeMin"),
		/**
		 * Frequency range max speakers.
		 */
		FREQUENCY_RANGE_MAX("frequencyRangeMax"),
		/**
		 * Cord length speakers.
		 */
		CORD_LENGTH("cordLength"),
		/**
		 * Price oven.
		 */
		PRICE("price");

		private final String value;

		Speakers(String value){
			this.value = value;
		}

		@Override
		public String toString(){
			return  value;
		}
	}

	/**
	 * The enum Teapot.
	 */
	public static enum Teapot {
		/**
		 * Color teapot.
		 */
		COLOR("color"),
		/**
		 * Volume teapot.
		 */
		VOLUME("volume"),
		/**
		 * Has whistle teapot.
		 */
		HAS_WHISTLE("hasWhistle"),
		/**
		 * Price oven.
		 */
		PRICE("price");

		private final String value;

		Teapot(String value){
			this.value = value;
		}
	}
	
	private SearchCriteria() {}
}

