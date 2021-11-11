package main.java.edu.ermakovich.task01.entity;

/**
 * The type Appliance factory.
 */
public class ApplianceFactory {
    /**
     * The constant instance.
     */
    public static final ApplianceFactory instance = new ApplianceFactory();

    /**
     * Instantiates a new Appliance factory.
     */
    public ApplianceFactory(){
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public ApplianceFactory getInstance() {
        return instance;
    }

    /**
     * Get appliance appliance.
     *
     * @param type the type
     * @return the appliance
     */
    public Appliance getAppliance(ApplianceType type){
        switch (type){
            case OVEN -> new Oven();
            case LAPTOP -> new Laptop();
            case SPEAKERS -> new Speakers();
            case TABLETPC -> new TabletPC();
            case REFRIGERATOR -> new Refrigerator();
            case VACUUMCLEANER -> new VacuumCleaner();
            case TEAPOT -> new Teapot();
        }
        return null;
    }
}
