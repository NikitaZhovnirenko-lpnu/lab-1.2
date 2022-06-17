package com.company;


public class Square {


    //– координати головної діагоналі.
    private int y2;
    private int x1;
    private int y1;
    private int x2;
    private double diagonal;

    private double area;
    private double sideLength;
    private double perimeter;

    public Square(int y2, int x1, int y1, int x2, double diagonal) {
        this.y2 = y2;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;

    }


    public double calculateVectorLength(Square square) {
        this.diagonal = Math.sqrt(Math.pow(square.getX2() - square.getX1(), 2) + Math.pow(square.getY2() - square.getY1(), 2));
        return diagonal;
    }

    public double calculateSideLength(Square square) {
        this.sideLength = getDiagonal() / Math.sqrt(2);
        return sideLength;
    }

    public double calculateArea(Square square) {
        this.area = Math.pow(getSideLength(), 2);
        return area;
    }

    public double calculatePerimeter(Square square) {
        this.perimeter = getSideLength() * 4;
        return perimeter;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        if (x1 < 0)
            this.x1 *= -1;
        else
            this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        if (y1 < 0)
            this.y1 *= -1;
        else
            this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        if (x2 < 0)
            this.x2 *= -1;
        else
            this.x2 = x2;
    }

    public double getDiagonal() {
        return diagonal;
    }
        public double getArea () {
            return area;
        }


        public double getSideLength () {
            return sideLength;
        }


        public double getPerimeter () {
            return perimeter;
        }
    }