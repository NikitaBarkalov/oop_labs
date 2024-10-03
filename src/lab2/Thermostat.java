package lab2;

public class Thermostat extends Device implements IChange{
    private int currentTemp;
    private int currentWetness;
    private String currentRoom;
    public Thermostat(String room) {
        super(false);
        this.currentTemp = 20;
        this.currentWetness = 40;
        this.currentRoom = room;
        System.out.println("Thermostat is installed in the " + room);
    }
    public void turnOn(){
        System.out.println("Turning thermostat in " + this.currentRoom + " on. Temperature: " + this.currentTemp + ", wetness: " + this.currentWetness);
        this.status = true;
    }
    public void turnOff(){
        System.out.println("Turning thermostat in " + this.currentRoom + " off");
        this.status = false;
    }
    public void getStatus(){
        System.out.println("Thermostat in " + this.currentRoom + " status: " 
                           + this.status + ", temperature: " + this.currentTemp + ", wetness: " + this.currentWetness);
    }

    public void changeParam(Object param, String nameParam) {
        if (!this.status) {
            System.out.println("Cannot change parametr. Lighting is off");
            return;
        }
        if ("temperature".equals(nameParam)) {
            this.currentTemp = (Integer) param;
        } else if ("wetness".equals(nameParam)) {
            this.currentWetness = (Integer) param;
        }
        System.out.println("Changing " + nameParam + " to " + param);
    }
}
