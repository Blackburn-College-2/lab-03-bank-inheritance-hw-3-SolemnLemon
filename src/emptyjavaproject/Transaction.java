/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import java.util.Calendar;

/**
 *
 * @author sunbe
 */
public class Transaction {

    public Transaction( Money change, Account from, Account to) {
       
        this.change = change;
        this.from=from;
        this.to=to;
        this.oldB=from.getBalance();
        calculateTransaction();
        

    }

    Money oldB;
    Money newB;
    Money change;
    Account from;
    Account to;
    Calendar rightNow = Calendar.getInstance();

    /**
     * subtracts change from account "from" and adds it to account "to" 
     */
    public void calculateTransaction() {
        
        setNewB((new Money(new Currency("dollars", "$"),
                from.getBalance().getAmount()- getChange().getAmount())));
        from.setBalance(newB);
        to.setBalance((new Money(new Currency("dollars", "$"),
                to.getBalance().getAmount() + getChange().getAmount())));

    }

    /**
     *
     * @return a string that shows old and new values of the transaction along
     * with the date of the transaction
     */
    public String showTransaction() {

        return "Old Balance     New Balance     Date " + "\n" + getOldB().toString()
                + "      " + getNewB().toString() + "        " + rightNow.getTime().toString();

    }

    //getters and setters
    public Money getOldB() {
        return oldB;
    }

    public Money getNewB() {
        return newB;
    }

    public Money getChange() {
        return change;
    }

    public void setOldB(Money oldB) {
        this.oldB = oldB;
    }

    public void setNewB(Money newB) {
        this.newB = newB;
    }

    public void setChange(Money change) {
        this.change = change;
    }

}
