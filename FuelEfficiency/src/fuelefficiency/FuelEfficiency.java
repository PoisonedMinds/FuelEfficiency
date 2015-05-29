package fuelefficiency;

import javax.swing.*;

/**
 * @title FuelEfficiency
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 29-May-2015 11:03:53 AM
 * @purpose The purpose of this program is to display the different distances vehicles will drive
 */
public class FuelEfficiency {

    public static void main(String[] args) {
        //get the amount of liters
        double liters = Double.parseDouble(JOptionPane.showInputDialog("How"
                + " many liters of fule would you like to use to compare the"
                + " distances between vehicles?"));
        //create one of each object
        Truck truck = new Truck();
        Car car = new Car();
        HybridCar hybrid = new HybridCar();
        Motorcycle motorcycle = new Motorcycle();
        //output their distances
        JOptionPane.showMessageDialog(null, "The vehicles would drive:\nTruck: "
                + truck.getDistance(liters) + "\nCar: " + car.getDistance(liters)
                + "\nHybrid Car: " + hybrid.getDistance(liters) + "\nMotorcycle: "
                + motorcycle.getDistance(liters));
    }

}
