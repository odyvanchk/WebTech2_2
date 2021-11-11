package main.java.edu.ermakovich.task01.entity;

public class ApplianceFactory {
    public static final ApplianceFactory instance = new ApplianceFactory();

    public ApplianceFactory(){
    }

    public ApplianceFactory getInstance() {
        return instance;
    }
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
