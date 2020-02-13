/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import java.util.Calendar;

/**
 *
 * @author paul.kline
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account a = new CheckingAccount(new Money(new Currency("dollars", "$"), 10.0));

        a.deposit(new Money(new Currency("dollars", "$"), 10.0));
        a.withdrawl(new Money(new Currency("dollars", "$"), 200.0));
        a.withdrawl(new Money(new Currency("dollars", "$"), 250.0));
        a.withdrawl(new Money(new Currency("dollars", "$"), 2.0));
        a.withdrawl(new Money(new Currency("dollars", "$"), 34.0));
        a.deposit(new Money(new Currency("dollars", "$"), 50.0));
        a.deposit(new Money(new Currency("dollars", "$"), 70.0));
        a.deposit(new Money(new Currency("dollars", "$"), 110.0));
        a.deposit(new Money(new Currency("dollars", "$"), 60.0));
        a.deposit(new Money(new Currency("dollars", "$"), 43.0));

        a.printHistory();
        Account savings = new SavingsAccount(new Money(new Currency("dollars", "$"), 1000.0));
        savings.withdrawl(new Money(new Currency("dollars", "$"), 200.0));
        savings.withdrawl(new Money(new Currency("dollars", "$"), 30.0));
        savings.printHistory();

        Loan loan = new Loan(new Money(new Currency("dollars", "$"), -500.0));
        loan.pay(new Money(new Currency("dollars", "$"), 100.0));

        Transaction t = new Transaction((new Money(new Currency("dollars", "$"), 20.0)),
                new CheckingAccount(new Money(new Currency("dollars", "$"), 100.0)),
                new CheckingAccount((new Money(new Currency("dollars", "$"), 43.0)))
        );
        System.out.println(t.showTransaction());

    }

}
