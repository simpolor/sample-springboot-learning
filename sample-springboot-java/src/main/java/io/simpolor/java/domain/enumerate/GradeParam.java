package io.simpolor.java.domain.enumerate;

public enum GradeParam {

    JUNIOR(Grade.ONE),
    MIDDLE_LEVEL(Grade.TWO),
    SENIOR(Grade.THREE);

    private Grade grade;

    GradeParam(Grade grade){
        this.grade = grade;
    }

    public Grade getValue(){
        return grade;
    }
}
