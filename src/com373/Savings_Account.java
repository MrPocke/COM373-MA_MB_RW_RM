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
    int counter = 0;
    
    public float getAmount()
    {
        return this.accountTotal;
    }
    public float getDeposit()
    {
        return this.deposit;
    }
    public float getWithdrawal()
    {
        return this.withdrawal;
    }
    public void setAmount(float sAmount)
    {
        this.accountTotal = sAmount;
    }
    public void setDeposit(float sDeposit)
    {
        this.deposit = sDeposit;
    }
    public void setWithdrawal(float sWithdrawal)
    {
        this.withdrawal = sWithdrawal;
    }
    public void ranSavingsAccountDeposit()
    {  
        float random = ThreadLocalRandom.current().nextInt(min, max );
        createDeposit(random);
    }
    public void ranSavingsAccountWithdrawal()
    {
        float random = ThreadLocalRandom.current().nextInt(min, max );
        createWithdrawal(random);
        //come back to this, account can't go below -1000
    }
    @Override public void createAccount(float amo) 
    {               
        if(amo >= 100)
        {
            accountTotal = amo;                
        }                
        else
        {
            //gui throw up box saying "account cannot start less than 100"
            //then set text to blank  and not enter the amo to accountTotal
        }
    }
    @Override public void createWithdrawal(float wit)
    {
        while(Mounth < 13)
        {
            if(counter !=3)
            {
                if(accountTotal - wit >= 100)
                {
                    withdrawal = wit;
                    accountTotal -= withdrawal;
                    withdrawal = 0;
                    counter++;
                }
                else
                {   
                //pop-up message saying accountTotal can't go below -1000
                }
            }
            else
            {
                //pop-up no more than two withdrawals from a savings account per year
            }
        }
        counter = 0;
    }
    public void interest()
    {
        if(Mounth == 12)
        {
         accountTotal *= 1.03;
        }
    }
}
