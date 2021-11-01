package com.netcracker.domain.autumn2021;

public class Point3D {
    private double x;
    private double y;
    private double z;

    public double getX() {return x;}
    public void setX(double x) {this.x = x;}

    public double getY() {return y;}
    public void setY(double y) {this.y = y;}

    public double getZ() {return z;}
    public void setZ(double z) {this.z = z;}

    Point3D(double x, double y, double z){
        setX(x);
        setY(y);
        setZ(z);
    }

    @Override
    public String toString(){
        return ("(" + x + ", " + y + ", " + z + ")");
    }
}
