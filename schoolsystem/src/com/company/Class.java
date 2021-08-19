package com.company;

public class Class {
    int classID;
    String className;
    int numOfStudents;

    Class(int classID, String className, int numOfStudents) {
        this.classID = classID;
        this.className = className;
        this.numOfStudents = numOfStudents;
    }

    int getClassID() {
        return classID;
    }

    void setClassID(int classID) {
        this.classID = classID;
    }


    String getClassName() {
        return className;
    }

    void setClassName(String className) {
        this.className = className;
    }

    int getNumOfStudents() {
        return numOfStudents;
    }

    void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }
}
