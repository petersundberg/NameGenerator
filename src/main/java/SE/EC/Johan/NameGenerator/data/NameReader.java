package SE.EC.Johan.NameGenerator.data;

import SE.EC.Johan.NameGenerator.service.NumberGenerator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class NameReader {

    public static List<String> pojkNamn() {

        List<String> pojkNamn = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("Pojknamn.txt"))) {
            String line;
            while((line = reader.readLine()) != null){
                pojkNamn.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pojkNamn;
    }

    public static List<String> flickNamn() {

        List<String> flickNamn = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("Flicknamn.txt"))) {
            String line;
            while((line = reader.readLine()) != null){
                flickNamn.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flickNamn;
    }

    public static List<String> efterNamn() {
        List<String> efterNamn = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("Efternamn.txt"))) {
            String line;
            while((line = reader.readLine()) != null){
                efterNamn.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return efterNamn;
    }
/*
    public String getBoyName(){
        String temp = pojkNamn().get(NumberGenerator.getRandomInt(pojkNamn().size()));
        return temp.trim();
    }

    public String getGirlName(){
        String temp = flickNamn().get(NumberGenerator.getRandomInt(flickNamn().size()));
        return temp.trim();
    }

    public String getLastName(){
        String temp = efterNamn().get(NumberGenerator.getRandomInt(efterNamn().size()));
        return temp.trim();
    }

    public List<String> getMultipleBoyNames(int size){
        List<String> temp = new ArrayList<>();
        for(int i = 1; i <= size; i++){
            temp.add(getBoyName());
        }
        return temp;
    }
    public List<String> getMultipleGirlNames(int size){
        List<String> temp = new ArrayList<>();
        for(int i = 1; i <= size; i++){
            temp.add(getGirlName());
        }
        return temp;
    }
    public List<String> getMultipleLastNames(int size){
        List<String> temp = new ArrayList<>();
        for(int i = 1; i <= size; i++){
            temp.add(getLastName());
        }
        return temp;
    }

    public String getBoyFullName(){
        String temp1 = pojkNamn().get(NumberGenerator.getRandomInt(pojkNamn().size())).trim();
        String temp2 = efterNamn().get(NumberGenerator.getRandomInt(efterNamn().size())).trim();
        return temp1 + " " + temp2;
    }

    public String getGirlFullName(){
        StringBuilder sb = new StringBuilder();
        sb.append(flickNamn().get(NumberGenerator.getRandomInt(flickNamn().size())).trim());
        sb.append(" ");
        sb.append(efterNamn().get(NumberGenerator.getRandomInt(efterNamn().size())).trim());

        return sb.toString();
    }

    public String getRandomFullName(){
        String name = "";
        int randomNumber = ThreadLocalRandom.current().nextInt(0,1);
        switch (randomNumber){
            case 0:
                name = getBoyFullName();
                break;
            case 1:
                name = getGirlFullName();
                break;
        }
        return name;
    }

    public List<String> getBoyFamily(int size, String lastName){
        List<String> temp = new ArrayList<>();
        for(int i = 0; i < size; i++){
            temp.add(getBoyName() + " " + lastName);
        }
        return temp;


    }

 */
}
