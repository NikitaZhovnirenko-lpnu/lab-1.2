package com.company;

/*Створити клас Квадрат з полями у закритій частині:
         x1,
        112
         y1,
         x2,
         y2 – координати головної діагоналі.
        Методи обчислюють:
         довжину сторони квадрата,
         площу,
         периметр,
         встановлюють значення полів і
         повертають їх значення.
        Методи встановлення полів класу мають перевіряти коректність параметрів, що задаються.*/

public class Main {

    public static void main(String[] args) {
    Square square1 = new Square(1, 8, 5, 6, 0);
    square1.calculateVectorLength(square1);
    square1.calculateSideLength(square1);
    square1.calculateArea(square1);
    square1.calculatePerimeter(square1);

    System.out.println("Довжина сторони: " + square1.getSideLength());
    System.out.println("Площа: " + square1.getArea());
    System.out.println("Периметр: " + square1.getPerimeter());


    }
}
