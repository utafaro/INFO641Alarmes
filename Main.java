import src.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Salut");

        ArrayList<Building> buildingsList = new ArrayList<Building>();
        buildingsList.add(new Building(new GazSensor("gaz1", null), new RadiationSensor("rad1", null), new FireSensor("fire1", null), "bat A"));
        buildingsList.add(new Building(new GazSensor("gaz2", null), new RadiationSensor("rad2", null), new FireSensor("fire2", null), "bat B"));
        buildingsList.add(new Building(new GazSensor("gaz3", null), new RadiationSensor("rad3", null), new FireSensor("fire3", null), "bat C"));
        ControlRoom controlRoom = new ControlRoom(null, buildingsList);
        GenerateHazardWindow window = new GenerateHazardWindow(controlRoom);

    }
}
