package es.bbva.model;

public class CreditCard {
    private String holderName;
    private int cardNumber;
    private double spendingLimit;

    public CreditCard(String holderName, int cardNumber, double spendingLimit) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.spendingLimit = spendingLimit;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getSpendingLimit() {
        return spendingLimit;
    }

    public void setSpendingLimit(double spendingLimit) {
        this.spendingLimit = spendingLimit;
    }
}
