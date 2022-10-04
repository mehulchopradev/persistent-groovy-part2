package com.rise1116.banking.domain

import com.rise1116.banking.exceptions.MinBalNotMaintainedException

class Account {

    String name
    Integer number
    Double balance
    List<String> contactNos
    static Double minBalance = 1000

    Double deposit(Double amt) {
        this.balance += amt
    }

    Double withdraw(Double amt) {
        println "*********About to start withdrawl from ur account ${this.number}************"

        try {
            if (amt <= 0) {
                throw new IllegalArgumentException("Cannot pass withdrawl amount that is 0 or less")
            }
            if (this.balance - amt < Account.minBalance) {
                throw new MinBalNotMaintainedException("Min balance cannot go below $Account.minBalance")
            }
            this.balance -= amt
        } finally {
            // will always execute irrespective of whatever happens in the corresponding try block
            println "**********Transaction ends****************"
        }
    }

    Double minus(Double amt) {
        this.withdraw(amt)
    }

    Double plus(Double amt) {
        this.deposit(amt)
    }

    Account leftShift(String contact) {
        if (!this.contactNos) {
            this.contactNos = []
        }

        this.contactNos << contact
        return this
    }

    def printContacts() {
        // safe navigation operator ?.
        println this.contactNos?.size()
        this.contactNos?.each {println(it)}
    }


    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                ", contactNos=" + contactNos +
                '}';
    }
}
