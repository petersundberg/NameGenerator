package SE.EC.Johan.NameGenerator.service;


import java.util.concurrent.ThreadLocalRandom;

public class NumberGenerator  {
    public static int getRandomInt(int size){
        int randomNumber = ThreadLocalRandom.current().nextInt(size);
        return randomNumber;
    }
}
