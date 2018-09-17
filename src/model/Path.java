package model;

public class Path {

    private String pathId;
    private String pathTime;
    private int pathTicket;
    private float pathPrice;


    public String getPathId() {
        return pathId;
    }

    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    public String getPathTime() {
        return pathTime;
    }

    public void setPathTime(String pathTime) {
        this.pathTime = pathTime;
    }

    public int getPathTicket() {
        return pathTicket;
    }

    public void setPathTicket(int pathTicket) {
        this.pathTicket = pathTicket;
    }

    public float getPathPrice() {
        return pathPrice;
    }

    public void setPathPrice(float pathPrice) {
        this.pathPrice = pathPrice;
    }

}
