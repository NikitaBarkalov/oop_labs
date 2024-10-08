package lab2;

import java.util.ArrayList;
import java.util.Arrays;

public class Tone {
    private ArrayList<String> tones;
    private String currentColor;
    
    public Tone(){
        this.tones = new ArrayList<String>(Arrays.asList("white", "blue", "green", "red", "yellow", "black"));
        // start value
        this.currentColor = "white";
    }

    public String getColor(){
        return this.currentColor;
    }

    public String changeColor(String new_tone){
        if (this.tones.contains(new_tone)){
            this.currentColor = new_tone;
            System.out.println("Tone has changed to " + new_tone);
        } else {
            System.out.println("There is no this tone in a palette");
        }
        return this.currentColor;
    }
}
