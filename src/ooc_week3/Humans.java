package ooc_week3;

public class Humans {

    private int age = 8;
    private String fullName = "Bekezhan";

    public Humans(String fullName, int age){
        System.out.println(fullName + " " + age);

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isAnAdult(int age){
        System.out.println("How old are you?");
        if(age > this.age){
            return true;
        }else{
            return false;
        }
    }
}
