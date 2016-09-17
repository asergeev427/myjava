public class Candidate {
    private String firstName;
    private String surName;
    private String patronimicName;
    private int age;
    private char sex;
    private String vacation;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }

    public void setPatronimicName(String patronimicName) {
        this.patronimicName = patronimicName;
    }

    public String getPatronimicName() {
        return patronimicName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public void setVacation(String vacation) {
        this.vacation = vacation;
    }

    public String getVacation() {
        return vacation;
    }

    public String toString() {
        return firstName + " " + surName + " " + patronimicName + " " + age + " " + sex +
                " " + vacation;
    }

    public static void main(String[] args) {
        Candidate first = new Candidate();
        first.setFirstName("Andrey");
        first.setSurName("Sergeev");
        first.setPatronimicName("Valeryevich");
        first.setAge(37);
        first.setSex('m');
        first.setVacation("manager");
        System.out.println(first.toString());
    }
}
