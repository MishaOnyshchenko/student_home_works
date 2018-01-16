package ClasWork_16_01_2018;

/**
 * Created by java on 16.01.2018.
 */
public class ClassRoom {
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
