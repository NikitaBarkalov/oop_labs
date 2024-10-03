package lab2;

public class SmartHouseMain{
    public static void main(String[] args) {
        // Creating objects
        Lighting light = new Lighting();
        Thermostat[] thermostats = {new Thermostat("kitchen"), 
                                    new Thermostat("bedroom")};
        SecurityCameras[] cameras = {new SecurityCameras("kitchen"), 
                                     new SecurityCameras("bedroom"), 
                                     new SecurityCameras("living room")};
        System.out.println("");

        // Examples of work
        light.turnOn();
        light.changeParam("cyan", "color");
        light.changeParam(70, "brightness");
        light.getStatus();
        light.turnOff();
        System.out.println("");


        thermostats[0].turnOn();
        thermostats[0].changeParam(15, "temperature");
        thermostats[0].changeParam(60, "wetness");
        thermostats[0].getStatus();
        System.out.println("");

        thermostats[1].turnOn();
        thermostats[1].changeParam(25, "temperature");
        thermostats[1].changeParam(30, "wetness");
        thermostats[1].turnOff();
        System.out.println("");

        cameras[0].turnOn();
        cameras[0].saveVideo("kitchenVideo");
        cameras[0].sendVideo("kitchenVideo");
        System.out.println("");

        cameras[2].turnOn();
        cameras[2].sendVideo("kitchenVideo");
        System.out.println("");

        light.changeParam("blue", "color");
        thermostats[1].changeParam(50, "wetness");
    }
}
