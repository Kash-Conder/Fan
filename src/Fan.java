public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    private int speed; //Fan's speed between slow, medium, and fast. Default is Slow
    private boolean on; //shows if Fan is on. Default is False.
    private double radius; //specifies radius of fan. Default is 5
    private String color; //color of fan. Default is Blue
    
    public Fan(){ //The default Fan
        this.speed=SLOW;
        this.on=false;
        this.radius=5;
        this.color="blue";
    }

    public int getSpeed() { 
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if(on){
            return "Fan{" + "speed=" + speed +  ", radius=" + radius + ", color=" + color + '}';
        } else{
                return "Fan{" + "color=" + color +  ", fan is off" + ", radius=" + radius  + '}';
            }
        }
}
