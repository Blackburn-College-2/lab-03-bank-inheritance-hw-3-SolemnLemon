/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 * keeps track of a savings account with interest
 *
 * @author sunbe
 */
public class SavingsAccount extends Account {

    Double interestRate = 1.0009;// googled average savings account interest and used result

    public SavingsAccount(Money balance) {
        super(balance);
    }

    /**
     * gets the balance of the account and multiplies it by the interest rate
     * then sets the balance to the result
     */
    public void accrue() {

        setBalance(new Money(new Currency("dollars", "$"), getBalance().multiply(this.interestRate)));
    }

    @Override
    public void withdrawl(Money ammount) {
        getHistory().add(new Money(ammount.getCurrency(), -1 * ammount.getAmount()));
        System.out.println(toString());
        accrue();
    }
}
