package hw_12_01_18;


//Todo  разбить код на методы, вынести логику из мейна, убрать свитчи.

public class Main {


    public static void main(String[] args) {
        ClassRoom class_A = new ClassRoom("A",12);
        ClassRoom class_B = new ClassRoom("B",15);
        program(class_A, class_B);

    }

public static void program(ClassRoom class_A, ClassRoom class_B){
        generatingStudents(40, class_A, class_B);

    System.out.println();
    System.out.println("-------------");
    System.out.println(class_B.getClassCount());


}

public static void generatingStudents(int countOfStudents, ClassRoom class_A, ClassRoom class_B){

    Student [] studMass= new Student[countOfStudents];

    for(int i = 0; i<studMass.length; i++){
        Student student = new Student();
        if(student.getAge()<13){
            class_A.setStudentToClass(student);
        }
        else if(student.getAge()>13){
            class_B.setStudentToClass(student);
        }
    }
}






//    int k = 0;
//        if (countClass_B < 15) {
//        k = countClass_B;
//    }
//        else {
//        k = 15;
//    }
//    Student [] students_B = new Student[k];
//    int k1 = 0;
//        for (int i = 0; i < k; i++){
//        for (int j = k1; j < studMass.length; j++){
//            if (studMass[j].getAge() >= 12) {
//                students_B[i] = studMass[j];
//                k1 = j + 1;
//                break;
//            }
//        }
//    }
//
//
//        System.out.println("Все ученики");
//        for (Student student : studMass) {
//        System.out.println(student.getName() +" в возрасте: "+ student.getAge()+" лет");
//    }
//
//        System.out.println("В класс А попали:");
//        for (Student student : students_A) {
//        System.out.println(student.getName() +" в возрасте: "+ student.getAge()+" лет");
//    }
//
//        System.out.println("В класс В попали: ");
//        for (Student student : students_B) {
//        System.out.println(student.getName() +" в возрасте: "+ student.getAge()+" лет");
//    }
//
//    int countMissed_A = 0;
//        System.out.println("В класс А не хватило места:");
//        for (int j = m; j < studMass.length; j++){
//        if (studMass[j].getAge() < 12) {
//            System.out.println(studMass[j].getName() +" "+ studMass[j].getAge());
//            countMissed_A ++;
//        }
//    }
//        System.out.println("В целом не попали в А:" + countMissed_A+" учеников");
//
//    int countMissed_B = 0;
//        System.out.println("В класс В не хватило места");
//        for (int j = k1; j < studMass.length; j++){
//        if (studMass[j].getAge() >= 12) {
//            System.out.println(studMass[j].getName() +" "+ studMass[j].getAge());
//            countMissed_B ++;
//        }
//    }
//        System.out.println("В целом не попали в B:" + countMissed_B+" учеников");
//
//
//




    }
