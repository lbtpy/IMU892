package Imu892_2022;

import java.util.Random;

public class RandomArray {
    public static void entrance(){
        int[] weight = {1,2,3,4};
        //String[] elements = {"A","B","C","D"};
        System.out.println(getRandomIndex(weight));
    }
    public static int getRandomIndex(int[] weight){
        int total = 0;
        for (int i = 0; i < weight.length; i++) {
            total += weight[i];
        }
        Random r = new Random();
        int randomIndex = -1;
        int randomWeight = r.nextInt(total);
        for (int i = 0; i < weight.length; i++) {
            if (randomWeight < weight[i]) {
                randomIndex = i;
                break;
            }
            randomWeight -= weight[i];
        }
        return randomIndex;
    }
}
