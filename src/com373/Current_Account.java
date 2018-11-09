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
public class Current_Account extends Accounts
{
    final int min = 100;
    final int max = 2000;
    
    
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
    public void ranCurrentAccountDeposit()
    {  
        float random = ThreadLocalRandom.current().nextInt(min, max );
        createDeposit(random);
    }
    public void ranCurrentAccountWithdrawal()
    {
        float random = ThreadLocalRandom.current().nextInt(min, max );
        createWithdrawal(random);
        //come back to this, account can't go below -1000
    }
    @Override public void createAccount(float amo) 
    {               
        if(amo >= 1)
        {
            accountTotal = amo;                
        }                
        else
        {
            //gui throw up box saying "account cannot start less than 1"
            //then set text to blank  and not enter the amo to accountTotal
        }
    }
    @Override public void createDeposit(float dep)
    {
        if(dep >= 500)
        {
        dep += 10;
        }
        deposit = dep;
        accountTotal += deposit;
        deposit = 0;
    }
    @Override public void createWithdrawal(float wit)
    {
        //check this 
        if(accountTotal - wit >= -1000)
        {
        withdrawal = wit;
        accountTotal -= withdrawal;
        withdrawal = 0; 
        }
        else
        {
         //pop-up message saying accountTotal can't go below -1000
        }
    }
}
