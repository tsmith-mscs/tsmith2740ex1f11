package main;
import javax.swing.*;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

      Building building1 = new Building();
       building1.setBuildingId(101);
        building1.setAddress("4412 highway 61 w");
        building1.setCity("Red Wing");
        building1.setState("MN");
        building1.setZip("55066");
        building1.setUnits(1);
        building1.setUpdated();

        Building building2 = new Building(102, "106th North St", "Hager City", "WI", "54014", 4);

        SensorReading sensor1 = new SensorReading();
        sensor1.setSensorReadingId(1);
        sensor1.setSensorId(2001);
        sensor1.setReadingDatetime();
        sensor1.setTemperature(74);

        SensorReading sensor2 = new SensorReading(2, 2002, 79);
        SensorReading sensor3 = new SensorReading(3, 2003, 69);
        SensorReading sensor4 = new SensorReading(4, 2004, 73);
        SensorReading sensor5 = new SensorReading(5, 2005, 75);
        SensorReading sensor6 = new SensorReading(6, 2006, 62);
        SensorReading sensor7 = new SensorReading(7, 2007, 83);

        System.out.println(building1.toString());
        System.out.println(building2.toString());

     System.out.print("SensorReadingId: = " + sensor1.getSensorReadingId());
     System.out.print(" Sensor ID: " + sensor1.getSensorId());
     System.out.print(" Date updated: " + sensor1.getReadingDatetime());
     System.out.print(" Temperature: = " + sensor1.getTemperature());
     System.out.println();

     System.out.println(sensor2.toString());
     System.out.println(sensor3.toString());
     System.out.println(sensor4.toString());
     System.out.println(sensor5.toString());
     System.out.println(sensor6.toString());
     System.out.println(sensor7.toString());



     

        

    }
}