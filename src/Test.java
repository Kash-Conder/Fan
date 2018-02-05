/**
 *
 * @author kc1002770
 */
public class Test {
    public static void main(String[]args) {
//Declaring test fans
        Fan Fan1 = new Fan();
        Fan Fan2 = new Fan();
        //First test fan setup
        Fan1.setSpeed (Fan.FAST); //Fan1's speed
        Fan1.setRadius (10); //Fan1's fan radius
        Fan1.setColor ("Yellow"); //Fan1's color
        Fan1.setOn (true); //Turns Fan1 on
        //Second test fan setup
        Fan2.setSpeed (Fan.MEDIUM); //Fan2's speed
        Fan2.setRadius (5); //Fan2's fan radius
        Fan2.setColor ("Blue"); //Fan2's color
        Fan2.setOn (false); //Turns Fan2 off
        //Printing out results
        System.out.println(Fan1);
        System.out.println(Fan2);
}
}