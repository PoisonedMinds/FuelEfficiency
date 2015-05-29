
package fuelefficiency;

/**
 * @title Car
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 29-May-2015 11:11:33 AM
 * @purpose The purpose of this program is to display the different distances vehicles will drive
 */
public class Car extends Vehicle {
   //calculate the distance the vehicle will drive
    public double getDistance(double liters) {
        double output=(liters*100)/9.4;
        return output;
    }
    
    

}
