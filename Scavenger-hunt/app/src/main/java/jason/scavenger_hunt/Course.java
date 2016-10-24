package jason.scavenger_hunt;

import java.util.ArrayList;

/**
 * Created by mafaldaborges on 10/17/16.
 */
public class Course {
    private String name;
    private int numOfPoints;
    private int yourTime;
    private ArrayList<Latitude> latitude;
    private ArrayList<Longitude> longitude;
    private long id;

    public Course(String name, int yourTime, int numOfPoints, ArrayList<Latitude> latitude, ArrayList<Longitude> longitude){
        this.name = name;
        this.numOfPoints = numOfPoints;
        this.yourTime = yourTime;
        this.latitude = latitude;
        this.longitude = longitude;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfPoints() {
        return numOfPoints;
    }

    public void setNumOfPoints(int distance) {
        this.numOfPoints = numOfPoints;
    }

    public int getYourTime() {
        return yourTime;
    }

    public void setYourTime(int yourTime) {
        this.yourTime = yourTime;
    }

    public ArrayList<Latitude> getLatitude() {
        return latitude;
    }

    public void setLatitude(ArrayList<Latitude> latitude) {
        this.latitude = latitude;
    }

    public ArrayList<Longitude> getLongitude() {
        return longitude;
    }

    public void setLongitude(ArrayList<Longitude> longitude) {
        this.longitude = longitude;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
