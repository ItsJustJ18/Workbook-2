package com.pluralsight.WeightClass;

public class GymMember {

    public static void main(String[] args) {

        GymMember b = new GymMember();
        b.description = "Young black male in his 20s with high athletic ability.";
        b.weight = 192;
        b.height = 5.10;
        b.musclemass = 9.4;

        GymMember b2 = new GymMember();
                b.description = "Elderly woman that likes to run.";
        b2.weight = 115;
        b2.height = 5.2;
        b2.musclemass = 24.1;

        GymMember b3 = new GymMember();
        b3.description = "Middle aged father who's tired after work with barely anytime for the gym.";
        b3.weight = 240;
        b3.height = 6.4;
        b3.musclemass = 25.3;

        printGymMember(b);
        printGymMember(b2);
        printGymMember(b3);
    }

    public static void printGymMember(GymMember b) {

        System.out.println(b.description);

    }

}
