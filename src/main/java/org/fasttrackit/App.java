package org.fasttrackit;

import java.time.Month;
import static java.time.Month.DECEMBER;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
            {
                System.out.println("Welcome to racing game!");

                Car carReference = new Car ();
                carReference.name = "Audi";
                carReference.racingNumber = 12345;
                carReference.color = "red";
                carReference.maxSpeed = 260;
                carReference.mileage = 6.2;
                carReference.fuelLevel = 3.2;
                carReference.damaged = true;

                carReference.productionYear = java.time.LocalDate.of (2018, Month.JANUARY, 1);
                carReference.model = "SuperCar";
                carReference.navigation = true;
                carReference.tyreWear = 8;
                carReference.weight = 1600;

                Engine engine1 = new Engine();
                engine1.manufacturer =  "VW";
                engine1.capacity = 2000;

                engine1.emissionCertificateLevel = "Euro 7";
                engine1.fuel = "Diesel";
                engine1.productionYear = java.time.LocalDate.of (2015, DECEMBER, 1);

                carReference.engine = engine1;

                System.out.println("Properties of " + carReference.name);
                System.out.println("racing number: " + carReference.racingNumber);
                System.out.println("color: " + carReference.color);
                System.out.println("max speed: " + carReference.maxSpeed);
                System.out.println("mileage: " + carReference.mileage);
                System.out.println("fuel level: " + carReference.fuelLevel);
                System.out.println("racing number: " + carReference.racingNumber);
                System.out.println("damaged: " + carReference.damaged);
                System.out.println("production year: " + carReference.productionYear);
                System.out.println("model: " + carReference.model);
                System.out.println("navigation: " + carReference.navigation);
                System.out.println("tyre wear: " + carReference.tyreWear);
                System.out.println("weight: " + carReference.weight);

                System.out.println("Engine details");
                System.out.println("capacity: "+ engine1.capacity);
                System.out.println("manufacturer: " + engine1.manufacturer);
                System.out.println("emissionCertificateLevel: " + engine1.emissionCertificateLevel);
                System.out.println("fuel type: "+ engine1.fuel);
                System.out.println("production year: " + engine1.productionYear);





            }



















}
