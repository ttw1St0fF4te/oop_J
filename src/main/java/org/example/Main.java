package org.example;

public class Main {
    public static void main(String[] args) {
        Car.manufacture("Toyota Camry");
        CarDealer carDealer = new CarDealer();
        carDealer.sell("Toyota Camry", 50);
        carDealer.calculateMaintenanceCost("Toyota Camry");

        Car toyotaCamry = new Car("Toyota Camry");
        toyotaCamry.setModelName("Toyota Camry");
        toyotaCamry.drive();
        toyotaCamry.repair();
        toyotaCamry.refuel();

        Car.manufactureCustom("Custom Model");
        carDealer.lease("Custom Model", 5);
        carDealer.lease(true);
        toyotaCamry.Rawr();
    }
}

class Car extends Ferrari {

    public Car(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    private String modelName;

    public void drive() {
        System.out.println("Поездка на автомобиле: " + modelName);
    }

    public void repair() {
        System.out.println("Ремонт автомобиля: " + modelName);
    }

    public void refuel() {
        System.out.println("Заправка автомобиля: " + modelName);
    }

    public static void manufacture(String modelName) {
        System.out.println("Производство автомобиля: " + modelName);
    }

    public static void manufactureCustom(String modelName) {
        System.out.println("Производство индивидуального автомобиля: " + modelName);
    }

    @Override
    public void Rawr() {
        System.out.println("RrrrrrrrrrrrrrRRoROROROrorr");
    }
}

abstract class Ferrari {
    public abstract void Rawr();
}

class CarDealer {
    public void sell(String modelName, int quantity) {
        System.out.println("Продажа автомобиля: " + modelName + ", количество: " + quantity);
    }

    public void lease(String modelName, int quantity) {
        System.out.println("Аренда автомобиля: " + modelName + ", количество: " + quantity);
    }

    public void lease(boolean A) {
        if (A) {
            System.out.println("Аренда прошла успешно!");
        }
        else {
            System.out.println("Аренда прошла неудачно(");
        }
    }

    public void calculateMaintenanceCost(String modelName) {
        System.out.println("Расчет затрат на обслуживание автомобиля: " + modelName);
    }
}