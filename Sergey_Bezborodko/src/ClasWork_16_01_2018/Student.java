package ClasWork_16_01_2018;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by java on 16.01.2018.
 */
public class Student {
//    private  String name;
//    private int age;
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setRandomAge(int age){
//        int randomNum = ThreadLocalRandom.current().nextInt(7,16);
//        this.age=age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
   //====================================================

    private  String classRoom;
    private  int classLimit;
    private Student [] studMass;

    public Student() {
    }




    public int getClassLimit() {
        return classLimit;
    }

    public void setClassLimit(int classLimit) {
        this.classLimit = classLimit;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public Student[] getStudMass() {
        return studMass;
    }

    public void setStudMass(Student[] studMass) {
        this.studMass = studMass;
    }
}
