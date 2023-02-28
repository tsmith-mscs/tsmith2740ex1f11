package main;
import java.time.LocalDateTime;
public class SensorReading {
    private int sensorReadingId;
    private int sensorId;
    private LocalDateTime readingDatetime;
    private float temperature;

    public SensorReading(){
        this.sensorReadingId = 0;
        this.sensorId = 0;
        this.readingDatetime = LocalDateTime.now();
        this.temperature = 0.0F;


    }

    public SensorReading(int sensorReadingId, int sensorId, float temperature) {
        this.sensorReadingId = sensorReadingId;
        this.sensorId = sensorId;
        this.readingDatetime = LocalDateTime.now();
        this.temperature = temperature;
    }

//    public Person(){
//        this.personId = 0;
//        this.firstName = "";
//        this.lastName = "";
//        this.userName = "";
//        this.updated = LocalDateTime.now();
//
//    }
//    public Person(int personId, String firstName, String lastName, String userName) {
//        this.personId = personId;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.userName = userName;
//        this.updated = LocalDateTime.now();
//
//    }


    public int getSensorReadingId() {
        return sensorReadingId;
    }

    public void setSensorReadingId(int sensorReadingId) {
        this.sensorReadingId = sensorReadingId;
    }

    public int getSensorId() {
        return sensorId;
    }

    public void setSensorId(int sensorId) {
        this.sensorId = sensorId;
    }

    public LocalDateTime getReadingDatetime() {
        return readingDatetime;
    }

    public void setReadingDatetime() {
        this.readingDatetime = readingDatetime;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "SensorReadingId: = " + sensorReadingId +
                " Sensor ID: " + sensorId +
                " Date updated: " + readingDatetime +
                " Temperature: = " + temperature ;

    }
}
