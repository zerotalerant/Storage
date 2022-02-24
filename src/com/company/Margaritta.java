package com.company;

public class Margaritta extends Pizza {

    private boolean withMeatOrNot;

    public Margaritta() {
    }


    @Override
    public String toString() {
        return "Маргаритта: " + " Цена: " + getPrice() + " Вес: " + getWeight() + " Готовка: " + canBake();
    }

    public boolean isWithMeatOrNot() {
        return withMeatOrNot;
    }

    public void setWithMeatOrNot(boolean withMeatOrNot) {
        this.withMeatOrNot = withMeatOrNot;
    }
}
