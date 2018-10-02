package org.itstep.qa.runner;

import org.itstep.qa.geometry.Rectangle;

public class Test {
        public static void main(String[] args){
            Rectangle rectangleOne = new Rectangle(6,8,5,10);
            Rectangle rectangleTwo = new Rectangle(5,10);
            Rectangle rectangleThree = new Rectangle();

            System.out.println("текущее состоние прямоугольников:");
            System.out.println(rectangleOne.rectPrint());
            System.out.println(rectangleTwo.rectPrint());
            System.out.println(rectangleThree.rectPrint());
            System.out.println("новое положение прямоугольников:");
            rectangleOne.move(3,3);
            rectangleTwo.move(3,3);
            rectangleThree.move(3,3);
        }
}

