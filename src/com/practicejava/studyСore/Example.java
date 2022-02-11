package com.practicejava.studyСore;

public class Example {
    public float kmHour;
    public float time;
    public String str;

    public Example(float kmHour, float time) {
        this.kmHour = kmHour;
        this.time = time;
    }

    public float distans() {
        float min = kmHour /  60;
        float dist = min * time;
        return dist;
    }

    public String reternString() {
        str = "hui";
        return str;
    }
}
