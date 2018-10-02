package org.itstep.qa.geometry;

public class Rectangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Rectangle(int x2, int y2) {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Rectangle() {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
    }

    public int rectPrint() { //текущее состояние
        int s = x1, y1, x2, y2;
        return s;
    }

    public void move(int dx, int dy) { //новое
        this.x1 = x1 + dx;
        this.x2 = x2 + dx;
        this.y1 = y1 + dy;
        this.y2 = y2 + dy;
        System.out.println("x1 = " + x1 + ", y1 = " + y1);
        System.out.println("x2 = " + x2 + ", y2 = " + y2);
    }
}





