/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab02;
//Home Task 04
    class Color{
        int red;
        int blue;
        int green;
        
        //Constructor
        Color(int red, int blue, int green){
           this.red = red;
           this.blue = blue;
           this.green = green;
        }
        public int getRed(){
            return red;
        }
        public int getBlue(){
            return blue;
        }
        public int getGreen(){
            return green;
        }
        @Override
        public boolean equals(Object obj){
            //Checking if both references are referring to the
            //same object
            if(this == obj)
                return true;
            if(obj == null || obj.getClass() != this.getClass())
                return false;
            //typecasting of the argument
            Color color = (Color) obj;
            //comparing the state of the argument with
            // the state of the id
            return red == color.red && blue == color.blue && green == color.green;
        }
        @Override
        public String toString(){
            return "Color [red " + red + " blue " + blue + " green " + green + "]";
        }
    }
public class Colors{
    public static void main(String[] args){
        //creating objects
        Color c1 = new Color(255, 0, 0);
        Color c2 = new Color(255, 0, 0);
        Color c3 = new Color(0, 225, 0);
        
        //Print the color objects
        System.out.println("Color 1: " + c1);
        System.out.println("Color 2: " + c2);
        System.out.println("Color 3: " + c3);
        
        //compare the color objects
        System.out.println("Color 1 is equal to Color 2: " + c1.equals(c2));
        System.out.println("Color 1 is equal to Color 3: " + c1.equals(c3));
        
        
    }
}