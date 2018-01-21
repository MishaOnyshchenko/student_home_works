package hw_12_01_18;


public class ClassRoom {
    private String classWord;
    private int classLimit;
    Student[] studMass;

    public ClassRoom(String classWord, int classLimit) {
        this.classWord = classWord;
        this.classLimit = classLimit;
        studMass = new Student[classLimit];
    }

    public int getClassCount() {
        return studMass.length;
    }

    public void getClassList(){
        for (Student mass : studMass) {
            System.out.println(mass.getName() + " в возрасте - " + mass.getAge()+" лет");

        }

    }

    public void getShortClassList(){
        for (Student mass : studMass) {
            System.out.println(mass.getName());

        }
    }

    public void ageSort() {
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (studMass[j].getAge() > studMass[j + 1].getAge()) {
                    Student tmp = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = tmp;
                }
            }
        }
    }
    public void ageReverseSort() {
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (studMass[j].getAge() < studMass[j + 1].getAge()) {
                    Student tmp = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = tmp;
                }
            }
        }
    }

    public void nameSort() {
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (studMass[j].getName().compareTo(studMass[j + 1].getName()) > 0) {
                    Student tmp = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = tmp;
                }
            }
        }
    }
    public void nameRevSort() {
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (studMass[j].getName().compareTo(studMass[j + 1].getName()) < 0) {
                    Student tmp = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = tmp;
                }
            }
        }
    }
    public void findStudent(String name){
        for (int i = 0; i < studMass.length; i++){
            if (studMass[i].getName().equals(name)){
                System.out.println(studMass[i].getName() + " " + studMass[i].getAge());
            }
        }
    }

    // Todo в массиве студентов ищешь букву класса? Исправил
    public String existingStudentNameInClass(Student st){
        for (int i = 0; i < studMass.length; i++){
            if (studMass[i].getName().equals(st.getName())){
                return classWord;
            }
        }
        return "Не найдены в " + classWord;
    }
    private int studCount = 0;

    public int getStudCount() {
        return studCount;
    }

    public void setStudCount(int studCount) {
        this.studCount = studCount;
    }


    public void setStudentToClass(Student st){
        if(studCount<studMass.length) {
            for (int i = 0; i < studMass.length; i++) {
                if (studMass[i] == null) {
                    studMass[i] = st;
                    studCount++;
                    break;
                }
            }

        }else{
            System.out.println("Места на всех не хватило");
        }
    }
}
