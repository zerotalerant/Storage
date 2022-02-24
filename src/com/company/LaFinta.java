package com.company;

public class LaFinta extends Pizza {

    private boolean withMushrooms;

    public LaFinta() {
    }

    @Override
    public String toString() {
            return "ЛяФинта: " + " Цена: " + getPrice() + " Вес: " + getWeight() + " Готовка: " + canBake();
    }

    public boolean withMushrooms() {
        return withMushrooms;
    }

    public static void setWithMushrooms(boolean withMushrooms) {
        this.withMushrooms = withMushrooms;
    }
}
