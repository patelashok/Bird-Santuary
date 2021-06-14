package com.bridglelabz.birdsantuary;
import java.util.Objects;

enum Colour{ BLACK,WHITE,BLACK_WHITE,GREEN}
public abstract class Birds {

    String id;
    Colour colour;

    static int totalCount;
    public abstract void eat();
    public abstract void incrementCount();
    public abstract void decrementCount();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birds birds = (Birds) o;
        return Objects.equals(id, birds.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
