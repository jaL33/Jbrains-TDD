package ca.jbrains.math;

import java.awt.*;

public class Fraction {
    private final int denominator;
    private final int numerator;

    public Fraction(int integerValue) {
        this(integerValue,1);
    }

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {
        return new Fraction(this.numerator + that.numerator, denominator);
    }

    public Fraction subtract(Fraction that) {
        return new Fraction(this.numerator - that.numerator, denominator);
    }

    public int intValue() {
        return numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public boolean equals(Object other){
        if (other instanceof Fraction){
            Fraction that = (Fraction) other;
            return this.numerator == that.numerator
                    && this.denominator == that.denominator;
         }
        return super.equals(other);
    }

    @Override
    public String toString(){
        return String.format("%d/%d", numerator, denominator);
    }

}
