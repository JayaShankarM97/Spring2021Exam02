/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeometricShapesExample;

/**
 *
 * @author JayaShankar Mangina
 */
public class Triangle extends GeometricObject{
    
    private int s1;
    private int s2;
    private int s3;
    private String color;
    private boolean filled;

    public Triangle(int s1, int s2, int s3, String color, boolean filled) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.color = color;
        this.filled = filled;
    }

    public int getS1() {
        return s1;
    }

    public void setS1(int s1) {
        this.s1 = s1;
    }

    public int getS2() {
        return s2;
    }

    public void setS2(int s2) {
        this.s2 = s2;
    }

    public int getS3() {
        return s3;
    }

    public void setS3(int s3) {
        this.s3 = s3;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public double perimeter() {
       return s1+s2+s3;
    }

    @Override
    public double Area() {
        double i,j;
        i = this.perimeter()/2;
        j = Math.sqrt(i*((i-s1)*(i-s2)*(i-s3)));
        return j;
    }
}
