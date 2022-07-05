package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentTest {
    private String expectedFirstname;
    private String expectedLastname;
    private Double[] expectedexamScores;
    Student student;

    @Before
    public void setUp(){
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores={ 100.0, 95.0, 123.0, 96.0 };
        student = new Student(firstName, lastName, examScores);

        this.expectedFirstname=firstName;
        this.expectedLastname=lastName;
        this.expectedexamScores=examScores;

    }

    @Test
    public void testGetFirstName() {

        String actualFirstName = student.getFirstName();
        System.out.println(expectedFirstname+actualFirstName);
        Assert.assertEquals(expectedFirstname,actualFirstName);



    }



   @Test
    public void testGetLastName() {
       String actualLastName = student.getLastName();
       System.out.println(expectedLastname+actualLastName);
       Assert.assertEquals(expectedLastname,actualLastName);
    }


@Test
    public void testGetNumberOfExamsTaken() {
        int expectedExamCount=4;
        int actualExamCount=student.getNumberOfExamsTaken();
    System.out.println(expectedExamCount+" "+actualExamCount);
        Assert.assertEquals(expectedExamCount,actualExamCount);
    }
    @Test
    public void testGetexamScore(){
        String output = student.getExamScores();
        System.out.println(output);

    }


}