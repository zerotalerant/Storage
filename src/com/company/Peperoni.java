package com.company;

public class Peperoni extends Pizza {

    private boolean spicy;

    public Peperoni() {

    }

    @Override
    public String toString() {
            return "Пеперони: " + " Цена: " + getPrice() + " Вес: " + getWeight() + " Готовка: " + canBake();
    }

    public boolean isSpicy() {
        return spicy;
    }

    public void setSpicy(boolean spicy) {
        this.spicy = spicy;
    }
}