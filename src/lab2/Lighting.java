package lab2;

public class Lighting extends Device implements IChange{
    private int currentBrightness;
    private String currentColor;
    public Lighting(){
        super(false);
        this.currentBrightness = 0;
        this.currentColor = null;
        System.out.println("Lighting is installed in the house");
    }

    public void turnOn(){
        this.currentBrightness = 100;
        this.currentColor = "white";
        System.out.println("Turning lighting on. Brightness: " + this.currentBrightness + ", color: " + this.currentColor);
        this.status = true;
        }
    public void turnOff(){
        System.out.println("Turning lighting off");
        this.currentBrightness = 0;
        this.currentColor = null;
        this.status = false;
    }
    public void getStatus(){
        System.out.println("Lighting status: " + this.status + ", brightness: " + this.currentBrightness + ", color: " + this.currentColor);
    }

    public void changeParam(Object param, String nameParam) {
        if (!this.status) {
            System.out.println("Cannot change parametr. Lighting is off");
            return;
        }
        if ("brightness".equals(nameParam)) {
            this.currentBrightness = (Integer) param;
        } else if ("color".equals(nameParam)) {
            this.currentColor = param.toString();
        }
        System.out.println("Changing " + nameParam + " to " + param);
    }
    
}
