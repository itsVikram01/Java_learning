package designPattern.creationalDesignPattern.Builder;

import lombok.Data;

// Product
@Data
class House {
    private String foundation;
    private String structure;
    private String roof;
}

// Builder
interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    House getHouse();
}

// Concrete Builder
class ConcreteHouseBuilder implements HouseBuilder {
    private House house = new House();

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete Foundation");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Concrete Structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Concrete Roof");
    }

    @Override
    public House getHouse() {
        return house;
    }
}

// Director
class ConstructionEngineer {
    private HouseBuilder houseBuilder;

    public ConstructionEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        houseBuilder.buildFoundation();
        houseBuilder.buildStructure();
        houseBuilder.buildRoof();
        return houseBuilder.getHouse();
    }
}

// Client
public class BuilderExample {
    public static void main(String[] args) {
        HouseBuilder builder = new ConcreteHouseBuilder();
        ConstructionEngineer engineer = new ConstructionEngineer(builder);
        House house = engineer.constructHouse();
        System.out.println(house);
    }
}
