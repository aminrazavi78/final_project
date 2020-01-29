package com.company;

public abstract class MovingThing extends Thing {
    double direction;
    float velocity;
    float angularVelocity;

    public MovingThing(int x, int y, float v, float aV, double d) {
        super(x, y);
        this.direction = d;
        this.velocity = v;
        this.angularVelocity = aV;
    }

    private void changeDirection(double amount) {
        this.direction = (this.direction + amount) % (2 * Math.PI);
    }


    private void turnRight() {
        this.changeDirection(-this.angularVelocity);
    }

    private void turnLeft() {
        this.changeDirection(this.angularVelocity);
    }

    void step() {
        this.x += Math.round(this.velocity * Math.sin(this.direction));
        this.y += Math.round(this.velocity * Math.cos(this.direction));
    }
}
