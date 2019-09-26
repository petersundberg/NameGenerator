package SE.EC.Johan.NameGenerator.service;

import SE.EC.Johan.NameGenerator.data.NameReader;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class NameService {

    private List<String> boyNames;
    private List<String> girlNames;
    private List<String> lastNames;

    public NameService() {
        boyNames = NameReader.pojkNamn();
        girlNames = NameReader.flickNamn();
        lastNames = NameReader.efterNamn();
    }

    public List<String> getBoyNames() {
        return boyNames;
    }
    public void setBoyNames(List<String> boyNames) {
        this.boyNames = boyNames;
    }
    public List<String> getGirlNames() {
        return girlNames;
    }
    public void setGirlNames(List<String> girlNames) {
        this.girlNames = girlNames;
    }
    public List<String> getLastNames() {
        return lastNames;
    }
    public void setLastNames(List<String> lastNames) {
        this.lastNames = lastNames;
    }

    public String getBoyName(){
        String temp = getBoyNames().get(NumberGenerator.getRandomInt(getBoyNames().size()));
        return temp.trim();
    }

    public String getGirlName(){
        String temp = getGirlNames().get(NumberGenerator.getRandomInt(getGirlNames().size()));
        return temp.trim();
    }

    public String getLastName(){
        String temp = getLastNames().get(NumberGenerator.getRandomInt(getLastNames().size()));
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
        String temp1 = getBoyNames().get(NumberGenerator.getRandomInt(getBoyNames().size())).trim();
        String temp2 = getLastNames().get(NumberGenerator.getRandomInt(getLastNames().size())).trim();
        return temp1 + " " + temp2;
    }

    public String getGirlFullName(){
        StringBuilder sb = new StringBuilder();
        sb.append(getGirlNames().get(NumberGenerator.getRandomInt(getGirlNames().size())).trim());
        sb.append(" ");
        sb.append(getLastNames().get(NumberGenerator.getRandomInt(getLastNames().size())).trim());

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

    public List<String> getGirlFamily(int size, String lastName){
        List<String> temp = new ArrayList<>();
        for(int i = 0; i < size; i++){
            temp.add(getGirlName() + " " + lastName);
        }
        return temp;
    }

    public List<String> getBoyNameWithFirstLetter(char c){
        List<String> temp = new ArrayList<>();
        char x = Character.toLowerCase(c);
        for(String test : getBoyNames()){
            if(test.toLowerCase().charAt(0) == x){
                temp.add(test);
            }
        }
        return temp;
    }
}
