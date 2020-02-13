/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author sunbe
 */
public class Loan extends Account {

    public Loan(Money principle) {//principles will be negative 
        super(principle);

    }

    double interestRate = 1.1;
/**
 * multiplies interest rate by the loan balance and sets balance to the result
 */
    public void accrue() {

        setBalance(new Money(new Currency("dollars", "$"), getBalance().multiply(this.interestRate)));
    }
/**
 * removes passed in money value from loan balance, if the loan is now <0 (paid off) then it will return an appropriate string
 * @param moneyPaid 
 */
    public void pay(Money moneyPaid) {
        setBalance(new Money(new Currency("dollars", "$"), getBalance().getAmount() + moneyPaid.getAmount()));
        accrue();
        if (getBalance().getAmount() >= 0) {
            System.out.println("Your loan has been paid off");
        } else {
            System.out.println("You paid " + moneyPaid.toString() + " on your loan. It is now " + getBalance().toString());
        }

    }
}
