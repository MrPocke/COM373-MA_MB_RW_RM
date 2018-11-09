/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com373;


/**
 *
 * @author Mac
 */
public abstract class Accounts extends COM373
{
    float accountTotal;
    float deposit;
    float withdrawal;
    
    public void createDeposit(float dep)
    {
        deposit = dep;
        accountTotal += deposit;
        deposit = 0;
    }
    public void createWithdrawal(float wit)
    {
        withdrawal = wit;
        accountTotal -= withdrawal;
        withdrawal = 0;
    }
    public void createAccount(float amo)
    {     
            accountTotal = amo;    
            //gui throw up box saying "account cannot start on 0"       
    }   
}

