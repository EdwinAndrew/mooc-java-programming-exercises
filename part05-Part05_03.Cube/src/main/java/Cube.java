/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edwinandrew
 */
public class Cube {
private int edgeLength;

    public Cube (int edgeLength){
        this.edgeLength = edgeLength;
    }

    public int getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume(){
        return edgeLength * edgeLength * edgeLength;
    }

    @Override
    public String toString() {
        return "The length of the edge is " + edgeLength + " and the volume " + volume();
    }
}