package Assignment2.Ex34;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
class PeopleTest {

    @Test
    void removeName() {
        ArrayList<String> names=new ArrayList();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");
        People p = new People();
        boolean b= p.removeName(names,"Chris Jones");

        Assertions.assertEquals(true,b);


    }
    @Test
    void removeName2() {
        ArrayList<String> names=new ArrayList();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");
        People p = new People();
        boolean b= p.removeName(names,"John Smith");

        Assertions.assertEquals(true,b);


    }
    @Test
    void removeName3() {
        ArrayList<String> names=new ArrayList();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");
        People p = new People();
        boolean b= p.removeName(names,"Amanda Cullen");

        Assertions.assertEquals(true,b);


    }
    @Test
    void removeName4() {
        ArrayList<String> names=new ArrayList();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");
        People p = new People();
        boolean b= p.removeName(names,"George Lopez");

        Assertions.assertEquals(false,b);


    }
    @Test
    void removeName5() {
        ArrayList<String> names=new ArrayList();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");
        People p = new People();
        boolean b= p.removeName(names,"Jeremy Goodwin");

        Assertions.assertEquals(true,b);


    }
}