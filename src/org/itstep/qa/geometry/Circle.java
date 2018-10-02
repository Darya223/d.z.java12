package org.itstep.qa.geometry;
//Для класса Circle создать конструкторы, позволяющие задавать параметры объектов класса при создании. Проверить работу конструкторов.

public class Circle {
    private int circleRadius;

    public Circle(int circleRadius){
        this.circleRadius = circleRadius;
    }

    public int getValueOfRadius() {
        return circleRadius;
    }

    public double getAreaOfCircle() {
        return Math.PI * circleRadius * circleRadius;
    }
}
