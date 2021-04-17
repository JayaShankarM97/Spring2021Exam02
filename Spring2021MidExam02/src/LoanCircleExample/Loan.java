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
public class Loan {
    private int amount;
    private String type;

    public Loan() {
    }

    public Loan(int amount, String type) {
        this.amount = amount;
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Loan Amount: "+"$"+amount+"\n"
                +"Loan Type: "+type;
    }
}
