public class Employee {
    String firstname;
    String lastname;
    int ID;
    int salary;

    public Employee(String firstname1, String lastname1, int ID1, int salary1) {
        firstname = firstname1;
        lastname = lastname1;
        ID = ID1;
        salary = salary1;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFullName() {
        return firstname + " " + lastname;
    }

    public int getID() {
        return ID;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(int percent) {
        salary += (salary * (percent / 100));
    }
}