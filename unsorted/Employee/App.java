public class App {


    public static void main(String[] args) throws Exception {
        Employee employee = new Employee("Vincent", "Anzelmo", 1, 1);
        System.out.println(employee.getFirstname());
        System.out.println(employee.getLastname());
        Employee employee2 = new Employee("Matteo", "Isabella", 0, 0);
        System.out.println(employee2.getFullName());
        System.out.println(employee2.getClass());
}
    
}
