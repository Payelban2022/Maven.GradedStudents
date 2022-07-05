package io.zipcoder;

import java.util.ArrayList;

public class Student {




    String firstName;
    String lastName;

    Double[] examScores;


    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfExamsTaken(){
        return examScores.length;
    }


    public String getExamScores() {
        String examScoresdata="";
        int len=examScores.length;
        for(int i=0; i<len;i++){
            examScoresdata+="Exam "+(i+1)+" -> "+examScores[i].toString()+"\n";
        }

        return examScoresdata;
    }

    public void setExamScores(Double[] examScores) {
        this.examScores = examScores;
    }
}
