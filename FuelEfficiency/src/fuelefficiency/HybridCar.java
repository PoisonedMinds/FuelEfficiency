
package fuelefficiency;

/**
 * @title HybridCar
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 29-May-2015 11:11:48 AM
 * @purpose The purpose of this program is to display the different distances vehicles will drive
 */
public class HybridCar extends Vehicle {
  //calculate the distance the vehicle will drive
    public double getDistance(double liters) {
        double output=(liters*100)/3.8;
        return output;
    }
    
    

}
