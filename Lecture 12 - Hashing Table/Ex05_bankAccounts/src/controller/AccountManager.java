package controller;

import linkedlist.model.LinkedList;
import model.Account;

public class AccountManager {

    LinkedList<Account>[] accountList;
    int size = 10000;

    public AccountManager() {
        accountList = new LinkedList[size];

        for (int i = 0; i < size; i++) {
            accountList[i] = new LinkedList<>();
        }
    }

    private int computeHash(int number) {
        return number;
    }

    public String addAccount(int idAccount, String nameAccount, Double amountAccount) {
        if (!accountList[computeHash(idAccount)].isEmpty()) {
            return "Account number in use";
        }

        try {
            Account account = new Account(idAccount, nameAccount, amountAccount);
            accountList[computeHash(idAccount)].addLast(account);
            return "Account created";
        } catch (Exception errAdd) {
            System.err.println(errAdd);
        }

        return "Account not created";
    }

    public String removeAccount(int idAccount) {
        if (accountList[computeHash(idAccount)].isEmpty()) {
            return "Account number is empty";
        }

        try {
            accountList[computeHash(idAccount)].removeFirst();
            return "Account removed";
        } catch (Exception errRemove) {
            System.err.println(errRemove);
        }

        return "Account not removed";
    }

    public Object findAccount(int idAccount) {
        if (accountList[computeHash(idAccount)].isEmpty()) {
            return "Account number is empty";
        }

        try {
            return accountList[computeHash(idAccount)].get(0).toString();
        } catch (Exception errRemove) {
            System.err.println(errRemove);
        }

        return "Account not found";
    }
}
