/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com373;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author B00731185
 */
public class Savings_Account extends Accounts
{
    final int min = 100;
    final int max = 2000;
    
    public void getAmount(float gAmount)
    {
        this.accountTotal = gAmount;
    }
    public void getDeposit(float gDeposit)
    {
        this.deposit = gDeposit;
    }
    public void getWithdrawal(float gWithdrawal)
    {
        this.withdrawal = gWithdrawal;
    }
    public void ranSavingsAccountDeposit()
    {  
        float random = ThreadLocalRandom.current().nextInt(min, max );
        createDeposit(random);
    }
    public void ranSavingsAccountWithdrawal(float amount)
    {
        float random = ThreadLocalRandom.current().nextInt(min, max );
        createWithdrawal(random);
        //come back to this, account can't go below -1000
    }
}
