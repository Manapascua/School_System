package com.company;

public class subject {
    int subjectID;
    String subjectName;

    subject(int subjectID, String subjectName) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
    }

    String getSubjectName() {
        return subjectName;
    }

    void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    int getSubjectID() {
        return subjectID;
    }

    void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }
}
