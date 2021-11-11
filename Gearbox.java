package com.company;

import java.lang.Math.*;
import java.util.ArrayList;

public class Gearbox {

    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private double tireSize;
    private double diffRatio;

    public Gearbox(int maxGears, double tireSize, double diffRatio) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
        this.tireSize = tireSize;
        this.diffRatio = diffRatio;
    }

    private double circumference(double tireSize) {
        return Math.PI * (tireSize);
    }

    public void addGear(int number, double ratio) {
        if ((number > 0) && (number <= maxGears)) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return ((revs * circumference(tireSize) * 60) / (this.ratio * diffRatio * 63360));
        }
    }
}
