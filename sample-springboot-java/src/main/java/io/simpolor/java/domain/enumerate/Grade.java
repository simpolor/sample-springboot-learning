package io.simpolor.java.domain.enumerate;

import java.util.Arrays;
import java.util.List;

public enum Grade {

    ONE("1학년", Arrays.asList(Class.A, Class.B, Class.C, Class.D, Class.E)),
    TWO("2학년", Arrays.asList(Class.A, Class.B, Class.C)),
    THREE("3학년", Arrays.asList(Class.A, Class.B, Class.C, Class.D));

    private String title;
    private List<Class> classes;

    Grade(String title, List<Class> classes){
        this.title = title;
        this.classes = classes;
    }

    public List<Class> getClasses(){
        return classes;
    }

    public String getTitle(){
        return title;
    }
}
