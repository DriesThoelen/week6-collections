package be.pxl.collections.opdracht2;

public class Main {
    public static void main(String[] args) {
        Robot awesomo = new Robot("AWESOM-O");
        Robot xatm092 = new Robot("X-ATM092");
        Robot bgh251f2 = new Robot("BGH251F2");

        awesomo.addCommand(Action.MOVELEFTFOOTFORWARD, "1");
        awesomo.addCommand(Action.MOVERIGHTFOOTFORWARD, "1");
        awesomo.addCommand(Action.MOVELEFTFOOTBACKWARDS, "1");
        awesomo.addCommand(Action.MOVERIGHTFOOTBACKWARDS, "1");
        awesomo.addCommand(Action.RAISELEFTARM, "1");
        awesomo.addCommand(Action.RAISERIGHTARM, "1");
        awesomo.addCommand(Action.LOWERLEFTARM, "1");
        awesomo.addCommand(Action.LOWERRIGHTARM, "1");
        awesomo.addCommand(Action.TURNLEFT, "1");
        awesomo.addCommand(Action.TURNRIGHT, "1");
        awesomo.addCommand(Action.TURNHEADLEFT, "0.5");
        awesomo.addCommand(Action.TURNHEADRIGHT, "0.5");
        awesomo.addCommand(Action.TURNHEADTOMIDDLE, "0.5");
        awesomo.addCommand(Action.GRABITEM, "1");
        awesomo.addCommand(Action.DROPITEM, "1");
        awesomo.addCommand(Action.POWERDOWN, "1");
        awesomo.addCommand(Action.POWERUP, "1");
        awesomo.addCommand(Action.SYSTEMCHECK, "1");

        xatm092.addCommand(Action.MOVELEFTFOOTFORWARD, "1");
        xatm092.addCommand(Action.MOVERIGHTFOOTFORWARD, "1");
        xatm092.addCommand(Action.MOVELEFTFOOTBACKWARDS, "1");
        xatm092.addCommand(Action.MOVERIGHTFOOTBACKWARDS, "1");
        xatm092.addCommand(Action.RAISELEFTARM, "1");
        xatm092.addCommand(Action.RAISERIGHTARM, "1");
        xatm092.addCommand(Action.LOWERLEFTARM, "1");
        xatm092.addCommand(Action.LOWERRIGHTARM, "1");
        xatm092.addCommand(Action.TURNLEFT, "1");
        xatm092.addCommand(Action.TURNRIGHT, "1");

        bgh251f2.addCommand(Action.TURNLEFT, "1");
        bgh251f2.addCommand(Action.TURNRIGHT, "1");

        while (awesomo.getCommandCount() > 0) {
            awesomo.executeNext();
        }

        awesomo.executeNext();
        System.out.println();

        while (xatm092.getCommandCount() > 0) {
            xatm092.executeNext();
        }

        xatm092.executeNext();
        System.out.println();

        while (bgh251f2.getCommandCount() > 0) {
            bgh251f2.executeNext();
        }

        bgh251f2.executeNext();
        System.out.println();
    }
}
