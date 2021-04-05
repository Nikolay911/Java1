package com.alterr;

public abstract class Shape{
    protected Point point;
    public Shape(double x, double y){
        point = new Point(x,y);
    }

    public void MoveBy(double dx, double dy){
        point.translate(dx, dy);
    }

    public abstract Point getCenter();
}
