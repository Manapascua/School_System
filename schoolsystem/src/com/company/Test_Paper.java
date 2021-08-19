package com.company;

public class Test_Paper {
    int testID;
    String testName;
    float duration;

    Test_Paper(int testID, String testName, float duration) {
        this.testID = testID;
        this.testName = testName;
        this.duration = duration;
    }

    String getTestName() {
        return testName;
    }

    void setTestName(String testName) {
        this.testName = testName;
    }

    float getDuration() {
        return duration;
    }

    void setDuration(float duration) {
        this.duration = duration;
    }

    int getTestID() {
        return testID;
    }

    void setTestID(int testID) {
        this.testID = testID;
    }
}
