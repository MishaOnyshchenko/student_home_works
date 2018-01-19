public class Homework {
int countOfHomeworks;
int spentTimeForHomework;

public Homework(){
}
public Homework(int countOfHomeworks, int spentTimeForHomework){
    this.countOfHomeworks = countOfHomeworks;
    this.spentTimeForHomework = spentTimeForHomework;
}

public void getCountOfHomeworks(){
return countOfHomeworks;
}
public void setCountOfHomeworks(int countOfHomeworks){
this.countOfHomeworks = countOfHomeworks;
}
public void getSpentTimeForHomework(){
return spentTimeForHomwork;
}
public void setSpentTimeForHomework(int spentTimeForHomwork){
this.spentTimeForHomwork = spentTimeForHomwork;
}
}
