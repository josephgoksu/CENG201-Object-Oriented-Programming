/**
 * Developer: y7usuf
 * Created Date:  8.12.2017
 */
public class LAB8 {

    static class Employee {
        String first_name;
        String last_name;
        int Salary;
        int yearly_salary;

        Employee(String first_name, String last_name, int salary) {
            this.first_name = first_name;
            this.last_name = last_name;

            if (salary < 0) {
                Salary = 0;
            } else {
                Salary = salary;
            }
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public int getSalary() {
            return Salary;
        }

        public void setSalary(int salary) {
            if (salary < 0) {
                Salary = 0;
            } else {
                Salary = salary;
            }
        }
    }

    public static void main(String args[]) {
        Employee employee = new Employee("Yusuf", "Göksu", 4300);
        Employee employee2 = new Employee("Emre", "Göksu", 3650);

        yearly_salary(employee);
        yearly_salary(employee2);

        System.out.println("Number of employees: 2");

        System.out.println("Normal Salary");

        printEmployees(employee);
        printEmployees(employee2);

        System.out.println("After %10 raise");
        ten_percent(employee);
        ten_percent(employee2);

        yearly_salary(employee);
        yearly_salary(employee2);

        printEmployees(employee);
        printEmployees(employee2);

    }

    private static void ten_percent(Employee employee){
        int tenpercent = employee.Salary / 10;
        employee.Salary = employee.Salary + tenpercent;
    }


    private static void yearly_salary(Employee employee){
        employee.yearly_salary = employee.Salary * 12;
    }


    private static void printEmployees(Employee employee){
        System.out.println(" --------------------------------- ");
        System.out.println("First Name: " + employee.first_name);
        System.out.println("Last Name: " + employee.last_name);
        System.out.println("Monthly Salary: " + employee.Salary);
        System.out.println("Yearly Salary: " + employee.yearly_salary);
        System.out.println(" --------------------------------- ");
    }


}
