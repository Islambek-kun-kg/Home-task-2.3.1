package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        System.out.println("Счет на карте = " + bankAccount.getAmount());
        while (true) {
            try {
                bankAccount.withDraw(6000);
                System.out.println("Минус - 6000");
                System.out.println("На карте осталось = " + bankAccount.getAmount());
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                System.out.println("Минус - " + bankAccount.getAmount());
                bankAccount.withDraw((int) bankAccount.getAmount());
            } finally {
                if (bankAccount.getAmount() == 0) {
                    break;
                }
            }
        }
    }
}
