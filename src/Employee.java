public class Employee {
    private String name;
    private String gender;
    private String birthday;

    public Employee() {
    }

    public Employee(String name, String gender, String birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "name : " + this.name
                + " ; gender : " + this.gender
                + " ; birthday : " + this.birthday;
    }
}
