package SE.EC.Johan.NameGenerator.data;

import SE.EC.Johan.NameGenerator.service.NameService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


public class NameServiceTest{

    NameService testObject;

    @Before
    public void setUp() {
        testObject = new NameService();
    }

    @Test
    public void file_succesfully_to_boyNameList(){

        int expected = 19499;
        int actual = testObject.getBoyNames().size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void file_succesfully_to_girlNameList(){

        int expected = 19391;
        int actual = testObject.getGirlNames().size();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void file_succesfully_to_lastNameList(){

        int expected = 100;
        int actual = testObject.getLastNames().size();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void test_get_random_boy_name(){

        String actual = testObject.getBoyName();
        System.out.println(actual);

        Assert.assertNotEquals(null,actual);
    }
    @Test
    public void test_get_random_girl_name(){

        String actual = testObject.getGirlName();
        System.out.println(actual);

        Assert.assertNotEquals(null,actual);
    }
    @Test
    public void test_get_random_last_name(){

        String actual = testObject.getLastName();
        System.out.println(actual);

        Assert.assertNotEquals(null,actual);
    }

    @Test
    public void get_several_boy_names(){
        int expectedSize = 10;
        List<String> temp =testObject.getMultipleBoyNames(expectedSize);
        int actualSize = temp.size();
        System.out.println(temp);
        Assert.assertEquals(expectedSize, actualSize);

    }
    @Test
    public void get_several_girl_names(){
        int expectedSize = 10;
        List<String> temp =testObject.getMultipleGirlNames(expectedSize);
        int actualSize = temp.size();
        System.out.println(temp);
        Assert.assertEquals(expectedSize, actualSize);
    }
    @Test
    public void get_several_last_names(){
        int expectedSize = 10;
        List<String> temp =testObject.getMultipleLastNames(expectedSize);
        int actualSize = temp.size();
        System.out.println(temp);
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void get_full_boy_name(){
        String actual = testObject.getBoyFullName();
        System.out.println(actual);
        Assert.assertNotEquals(null, actual);
    }

    @Test
    public void get_full_girl_name(){
        String actual = testObject.getGirlFullName();
        System.out.println(actual);
        Assert.assertNotEquals(null, actual);
    }

    @Test
    public void get_random_name(){
        String actual = testObject.getRandomFullName();
        System.out.println(actual);
        Assert.assertNotEquals(null, actual);
    }

    @Test
    public void test_boy_family_names(){

        int expectedNames = 5;
        int actualNames = testObject.getBoyFamily(5, "Sundberg").size();

        Assert.assertEquals(expectedNames,actualNames);
    }
    @Test
    public void test_girl_family_names(){

        int expectedNames = 5;
        int actualNames = testObject.getGirlFamily(5, "Sundberg").size();
        System.out.println(testObject.getGirlFamily(10, "Ahmadi"));
        Assert.assertEquals(expectedNames,actualNames);
    }

    @Test
    public void test_boynames_with_first_letter(){

        //List<String> test = testObject.getBoyNameWithFirstLetter('Z');
        //System.out.println(test);
        System.out.println(testObject.getBoyNameWithFirstLetter('Z'));
    }
}
