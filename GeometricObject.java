/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancepolymorphism;

/**
 *
 * @author pasha
 */
public class GeometricObject {
    
     private String color = "white";
    private boolean filled;
      
    public GeometricObject(){
        this.color = "white";
        this.filled = false;
    }
    
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    @Override
    public String toString(){
        return "GeometricObject[color=" + color +", filled=" + filled + "]";
    } 
    
}
