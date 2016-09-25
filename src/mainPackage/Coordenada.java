/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;

import java.awt.geom.Point2D;

/**
 *
 * @author Albertyson
 */
public class Coordenada extends Point2D{
    public int x;
    public int y;

    public Coordenada() {
    }

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordenada{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setLocation(double x, double y) {
        this.x=Integer.parseInt(""+x);
        this.y=Integer.parseInt(""+y);
    }
}
