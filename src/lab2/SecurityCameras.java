package lab2;

import java.util.ArrayList;

public class SecurityCameras extends Device{
    private String room;
    private ArrayList<String> videonames;

    public SecurityCameras(String room){
        super(false);
        this.room = room;
        this.videonames = new ArrayList<String>();
        System.out.println("Cameras is installed in the " + room);
    }
    public void turnOn(){
        System.out.println("Turning camera in " + this.room + " on");
        this.status = true;
    }
    public void turnOff(){
        System.out.println("Turning cameras in " + this.room + " off");
        this.status = false;
    }

    public void getStatus(){
        System.out.println("Camera's in " + this.room + " status: " + this.status);
    }

    public void saveVideo(String videoname){
        if (!videonames.contains(videoname)){
            (this.videonames).add(videoname);
            System.out.println("Video saved: " + videoname);
            return;
        }
        System.out.println("It's already saved: " + videoname);
    }

    public void sendVideo(String nameVideo) {
        if (!this.status) {
            System.out.println("Camera in " + this.room + " are turned off. Cannot send video.");
        } else if (!this.videonames.contains(nameVideo)) {
            System.out.println("Video " + nameVideo + " is not found in saved videos for camera in " + this.room);
        } else {
            System.out.println("Sending video " + nameVideo + " to security office");
        }
    }
}
