package com.company;

public class Molecule {

    //0 left,1 up ,2 right ,3 down

    public int inUp,inLeft,inDown,inRight;
    public int outUp,outLeft,outDown,outRight;
    //0 empty 1 molecule 2 wall
    public int state;

    public int getInUp() {
        return inUp;
    }

    public void setInUp(int inUp) {
        this.inUp = inUp;
    }

    public int getInLeft() {
        return inLeft;
    }

    public void setInLeft(int inLeft) {
        this.inLeft = inLeft;
    }

    public int getInDown() {
        return inDown;
    }

    public void setInDown(int inDown) {
        this.inDown = inDown;
    }

    public int getInRight() {
        return inRight;
    }

    public void setInRight(int inRight) {
        this.inRight = inRight;
    }

    public int getOutUp() {
        return outUp;
    }

    public void setOutUp(int outUp) {
        this.outUp = outUp;
    }

    public int getOutLeft() {
        return outLeft;
    }

    public void setOutLeft(int outLeft) {
        this.outLeft = outLeft;
    }

    public int getOutDown() {
        return outDown;
    }

    public void setOutDown(int outDown) {
        this.outDown = outDown;
    }

    public int getOutRight() {
        return outRight;
    }

    public void setOutRight(int outRight) {
        this.outRight = outRight;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }




}
