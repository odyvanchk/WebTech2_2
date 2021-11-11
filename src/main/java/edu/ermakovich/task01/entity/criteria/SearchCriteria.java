package main.java.edu.ermakovich.task01.entity.criteria;

public final class SearchCriteria {
	
	public static enum Oven{
		POWER_CONSUMPTION("PowerConsumption"),
		WEIGHT("weight"),
		CAPACITY("capacity"),
		DEPTH ("depth"),
		HEIGHT ("height"),
		WIDTH("width");

		private final String value;

		Oven(String value) {
			this.value = value;
		}

		@Override
		public String toString() { return value; }
	}
	
	public static enum Laptop{
		BATTERY_CAPACITY("batteryCapacity"),
		OS("os"),
		MEMORY_ROM("memoryRom"),
		SYSTEM_MEMORY("systemMemory"),
		CPU("cpu"),
		DISPLAY_INCHES("displayInches");

		private final String value;

		Laptop(String value){
			this.value = value;
		}

		@Override
		public String toString(){
			return value;
		}
	}
	
	public static enum Refrigerator{
		POWER_CONSUMPTION("powerConsumption"),
		WEIGHT("weight"),
		FREEZER_CAPACITY("freezerCapacity"),
		OVERALL_CAPACITY("overallCapacity"),
		HEIGHT("height"),
		WIDTH("width");

		private final String value;

		Refrigerator(String value){
			this.value = value;
		}

		@Override
		public String toString(){
			return  value;
		}
	}
	
	public static enum VacuumCleaner{
		POWER_CONSUMPTION("powerConsumption"),
		FILTER_TYPE("filterType"),
		BAG_TYPE("bagType"),
		WAND_TYPE("wandType"),
		MOTOR_SPEED_REGULATION("motorSpeedRegulation"),
		CLEANING_WIDTH("cleaningWidth");

		private final String value;

		VacuumCleaner(String value){
			this.value = value;
		}

		@Override
		public String toString(){
			return  value;
		}
	}
	
	public static enum TabletPC{
		BATTERY_CAPACITY("batteryCapacity"),
		DISPLAY_INCHES("displayInches"),
		MEMORY_ROM("memoryRom"),
		FLASH_MEMORY_CAPACITY("flashMemoryCapacity"),
		COLOR("Color");

		private final String value;

		TabletPC(String value){
			this.value = value;
		}

		@Override
		public String toString(){
			return  value;
		}
	}
	
	public static enum Speakers{
		POWER_CONSUMPTION("powerConsumption"),
		NUMBER_OF_SPEAKERS("numberOfSpeakers"),
		FREQUENCY_RANGE_MIN("frequencyRangeMin"),
		FREQUENCY_RANGE_MAX("frequencyRangeMax"),
		CORD_LENGTH("cordLength");

		private final String value;

		Speakers(String value){
			this.value = value;
		}

		@Override
		public String toString(){
			return  value;
		}
	}

	public static enum Teapot {
		COLOR("color"),
		VOLUME("volume"),
		HAS_WHISTLE("hasWhistle");

		private final String value;

		Teapot(String value){
			this.value = value;
		}
	}
	
	private SearchCriteria() {}
}

