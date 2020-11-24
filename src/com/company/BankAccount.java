package com.company;

public class BankAccount {
    private double amount;


    public void deposit(double sum) {
        setAmount(getAmount() + sum);
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > getAmount()) {
            throw new LimitException("Остаток на счету меньше чем запрашиваемая сумма!", getAmount());
        } else {
            setAmount(getAmount() - sum);
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
