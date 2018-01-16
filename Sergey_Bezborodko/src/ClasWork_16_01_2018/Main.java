package ClasWork_16_01_2018;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by java on 16.01.2018.
 */
public class Main {
//    public static void main(String[] args) {
//        int [] intMass = new int[5];
//        for(int intMas:intMass){
//            System.out.println(intMas+" ");
//        }
//
//        String [] strMass=new String[5];
//        for(String strMas:strMass){
//            System.out.println(strMas+" ");
//        }
//        System.out.println(" ");
//
//
//        Student student = new Student();
//        student.setName("Visia");
//
//        Student [] studMass = new Student[5];
//        studMass[0]=student;
//
//        for(Student strMas:studMass){
//            System.out.println(Student.getName()+" ");
//        }
//    }



    public static void main(String[] args) {

        ClassRoom classA = new ClassRoom("A",12);
        ClassRoom classB = new ClassRoom("B",15);

        System.out.println(classA.getStudMass().length+"class A");
        System.out.println(classB.getStudMass().length+"class B");

    }

    public  Student[] intStudentMass(){
        Student [] students = new Student[40];
        int min =7;
        int max = 16;
        int randomAge;

        for (int i =0 ; i<40;i++){
            randomAge= ThreadLocalRandom.current().nextInt(min,max+1);
            String studName = "A"+ randomAge+"cov";
            Student
        }
    }


}
