
package fuelefficiency;

/**
 * @title Truck
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 29-May-2015 11:11:15 AM
 * @purpose The purpose of this program is to display the different distances vehicles will drive
 */
public class Truck extends Vehicle {
  //calculate the distance the vehicle will drive
    public double getDistance(double liters) {
    double output=(liters*100)/14.1;
        return output;
    }
    
    
}
