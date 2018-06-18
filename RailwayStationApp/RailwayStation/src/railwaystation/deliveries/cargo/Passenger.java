package railwaystation.deliveries.cargo;


public class Passenger extends Cargo {
    private int age;
    private String sex;
    private int countPass;
    private String typeOfPass;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setCountPass(int countPass) {
        this.countPass = countPass;
    }

    public int getCountPass() {
        return countPass;
    }

    public void setTypeOfPass(String typeOfPass) {
        this.typeOfPass = typeOfPass;
    }

    public String getTypeOfPass() {
        return typeOfPass;
    }
}
