package com.company;

public class Main {

    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(7, 25.75, 3.73);

        Gearbox.Gear first = mcLaren.new Gear(1, 3.46);
        Gearbox.Gear second = mcLaren.new Gear(2, 2.73);
        Gearbox.Gear third = mcLaren.new Gear(3, 2.14);
        Gearbox.Gear fourth = mcLaren.new Gear(4, 1.65);
        Gearbox.Gear fifth = mcLaren.new Gear(5, 1.05);
        Gearbox.Gear sixth = mcLaren.new Gear(6, 0.85);
        Gearbox.Gear seventh = mcLaren.new Gear(7, 0.78);

        System.out.println("Top speed in first gear is " + first.driveSpeed(8000) + " mph");
        System.out.println("Top speed in second gear is " + second.driveSpeed(8000) + " mph");
        System.out.println("Top speed in third gear is " + third.driveSpeed(8000) + " mph");
        System.out.println("Top speed in fourth gear is " + fourth.driveSpeed(8000) + " mph");
        System.out.println("Top speed in fifth gear is " + fifth.driveSpeed(8000) + " mph");
        System.out.println("Top speed in sixth gear is " + sixth.driveSpeed(8000) + " mph");
        System.out.println("Top speed in seventh gear is " + seventh.driveSpeed(8000) + " mph");
    }
}
