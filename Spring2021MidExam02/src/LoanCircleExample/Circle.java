/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoanCircleExample;

/**
 *
 * @author JayaShankar Mangina
 */
public class Circle {
    
    private int number;

    public Circle() {
    }

    public Circle(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Circle Number: "+number;
    }
}
