package org.itstep.qa.runner;

import org.itstep.qa.geometry.Circle;

public class RunnerCircle {
        public static void main(String[] args) {
            Circle cr = new Circle(10);
            System.out.println("было:" + cr.getValueOfRadius());
            System.out.println("плоощадь:" + cr.getAreaOfCircle());

        }
    }
