package hw_12_01_18;

import java.util.concurrent.ThreadLocalRandom;

public class Student {
    private String name;
    private int age;

    public Student() {
        generateAge();
        generateName();
    }

    public String getName() {
        return name;
    }
    // Todo update - done!
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
    public void generateName(){
        String [] str = new String [20];
        str[0] = "Лютик";
        str[1] = "Геральт";
        str[2] = "Вениамин";
        str[3] = "Эктор";
        str[4] = "Маркус";
        str[5] = "Джаред";
        str[6] = "Джоел";
        str[7] = "Ашот";
        str[8] = "Сашя";
        str[9] = "Сережа";
        str[10] = "Джин";
        str[11] = "Люси";
        str[12] = "Элли";
        str[13] = "Стася";
        str[14] = "Катерина";
        str[15] = "Даша";
        str[16] = "Гея";
        str[17] = "Мари";
        str[18] = "Светлана";
        str[19] = "Лера";
        this.name = str[ThreadLocalRandom.current().nextInt(0, 19 + 1) ];
    }
    public void generateAge(){
        int randomNum = ThreadLocalRandom.current().nextInt(7, 16 + 1) ;
        this.age = randomNum;
    }
}
