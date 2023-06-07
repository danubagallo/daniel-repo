package org.academiadecodigo.bootcamp;

public class Lamp {

    private int maxGenies;
    private int geniesCount;
    private int rechargedTimes;
    private static int totalGeniesCount = 0;
    public static Genie[] totalGeniesArray = new Genie[100];

    public Lamp(int maxGenies) {
        this.maxGenies = maxGenies;
        this.geniesCount = 0;
        this.rechargedTimes = 0;
        System.out.println("New lamp created with a total of " + this.maxGenies + " genies.");
    }

    public int getMaxGenies() {
        return maxGenies;
    }

    public int getRechargedTimes() {
        System.out.println("This lamp has beeen recharged " + rechargedTimes + " times.");
        return 0;
    }

    public void setRechargedTimes() {
        rechargedTimes++;
    }

    public int getGeniesCount() {
        return geniesCount;
    }

    public void setGeniesCountZero() {
        geniesCount = 0;
    }

    public void setGeniesCount() {
        geniesCount++;
    }

    public void rubLamp() {
        if (this.geniesCount < maxGenies) {
            this.geniesCount++;
            totalGeniesCount++;
            System.out.println("Genie summoned. You can still summon " + (maxGenies - this.geniesCount) + " genies.");
            if (this.geniesCount % 2 == 0) {
                totalGeniesArray[totalGeniesCount] = new FriendlyGenie();
                System.out.println("I am a friendly Genie. You have " + totalGeniesArray[totalGeniesCount].getMaxWishes() + " wishes left.");
            } else {
                totalGeniesArray[totalGeniesCount] = new GrumpyGenie();
                System.out.println("I am a GRUMPY Genie. You have " + totalGeniesArray[totalGeniesCount].getMaxWishes() + " wishes left.");
            }
        } else {
            this.geniesCount++;
            totalGeniesCount++;
            totalGeniesArray[totalGeniesCount] = new DemonGenie();
            System.out.println("YOU DON'T HAVE GENIES LEFT. DEMON HAS BEEN SUMMONED. It can grant you " + totalGeniesArray[totalGeniesCount].getMaxWishes() + " wishes.");
        }
    }
}