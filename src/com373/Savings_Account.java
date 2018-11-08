/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com373;

/**
 *
 * @author B00731185
 */
public class Savings_Account extends Accounts
{
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
}
