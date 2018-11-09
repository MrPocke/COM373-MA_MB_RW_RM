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
    
}
