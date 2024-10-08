package lab2;

public class Lighting extends Device implements IChange{
    private int currentBrightness;
    private Tone currentTone;
    public Lighting(){
        super(false);
        this.currentBrightness = 0;
        this.currentTone = null;
        System.out.println("Lighting is installed in the house");
    }

    public void turnOn(){
        this.currentBrightness = 100;
        this.currentTone = new Tone();
        System.out.println("Turning lighting on. Brightness: " + this.currentBrightness + ", color: " + this.currentTone.getColor());
        this.status = true;
        }
    public void turnOff(){
        System.out.println("Turning lighting off");
        this.currentBrightness = 0;
        this.currentTone = null;
        this.status = false;
    }
    public void getStatus(){
        System.out.println("Lighting status: " + this.status + ", brightness: " + this.currentBrightness + ", color: " + this.currentTone.getColor());
    }

    public void changeParam(Object param, String nameParam) {
        if (!this.status) {
            System.out.println("Cannot change parametr. Lighting is off");
            return;
        }
        if ("brightness".equals(nameParam)) {
            this.currentBrightness = (Integer) param;
        } else if ("color".equals(nameParam)) {
            this.currentTone.changeColor(param.toString());
        }
    }
}
