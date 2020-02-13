/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import java.util.ArrayList;

/**
 *
 * @author sunbe
 */
public class Account {

    ArrayList<Money> history = new ArrayList<Money>();

    Money balance;

    public void deposit(Money ammount) {
        getHistory().add(ammount);
        System.out.println(toString());
    }

    public void withdrawl(Money ammount) {
        getHistory().add(new Money(ammount.getCurrency(), -1 * ammount.getAmount()));
        System.out.println(toString());

    }

    public ArrayList<Money> getHistory() {
        return history;
    }

    public void printHistory() {
        for (int i = 0; i < getHistory().size(); i++) {
            System.out.println(printTransaction(getHistory().get(i)));
        }

    }

    public String printTransaction(Money m) {
        if (m.getAmount() >= 0) {
            return "The transaction was a deposit and was " + m.toString();
        } else {
            return "The transaction was a withdrawl and was " + m.toString();
        }
    }

    public String toString() {
        return getBalance().toString();

    }

    public Money getBalance() {
        return balance;
    }

    public void setBalance(Money balance) {
        this.balance = balance;
    }
}
