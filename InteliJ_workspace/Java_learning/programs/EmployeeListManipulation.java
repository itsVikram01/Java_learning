import java.util.*;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Employee {
    private String firstName;
    private String lastName;
    private String gender;
    private int salary;
    private int exp;
    private int bonus;
    private String city;
    private int age;
}

public class EmployeeListManipulation {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Luffy","SunGodNika", "Male", 45000, 30, 500, "Red",20));
        employees.add(new Employee("Zoro","KingOfHell", "Male", 40000, 25, 500,  "Red", 20));
        employees.add(new Employee("Nami", "CatBurglar", "Female", 15000, 15, 200, "Blue", 20));
        employees.add(new Employee("Brook","Musician", "Male", 30000, 10, 400, "Blue", 30));
        employees.add(new Employee("Sanji","Cook", "Male", 30000, 20, 150, "Blue", 15));

        /* min salary */
        /*employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted() //ascending order
                .skip(0)
                .findFirst()
                .ifPresent(sal -> System.out.println("Min salary : "+ sal));*/

        /* sec min salary */
        /*employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted() //ascending order
                .skip(1)
                .findFirst()
                .ifPresent(sal -> System.out.println("Second Min salary : "+ sal));*/


        /* max salary */
        /*employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())            // Sort in descending order
                .skip(0)
                .findFirst()
                .ifPresent(sal -> System.out.println("Max salary : "+ sal));*/

        /* sec max salary */
        /*employees.stream()
                .map(Employee::getSalary)                     // Extract salaries
                .distinct()
                .sorted(Comparator.reverseOrder())            // Sort in descending order
                .skip(1)
                .findFirst()
                .ifPresent(sal -> System.out.println("Second Max salary : "+ sal));*/



        /* ******************************************************************************************** */

        /* filter EmployeesByExp */
        /*employees.stream()
                .filter(employee -> employee.getExp() > 10).forEach(System.out::println);*/

        /* min exp emp */
        /*employees.stream()
                .map(Employee::getExp)
                .distinct()
                .sorted()
                .skip(0)
                .findFirst()
                .ifPresent(exp -> System.out.println("Min exp : "+ exp));*/

        /* secMin exp emp */
        /*employees.stream()
                .map(Employee::getExp)
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .ifPresent(secMinExp -> System.out.println("Second min exp : "+ secMinExp));*/

        /* max exp emp */
        /*employees.stream()
                .map(Employee::getExp)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(0)
                .findFirst()
                .ifPresent(exp -> System.out.println("Max exp : "+ exp));*/

        /* secMax exp emp */
        /*employees.stream()
                .map(Employee::getExp)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresent(secMaxExp -> System.out.println("Second Max Exp : "+ secMaxExp));*/


        /* ******************************************************************************************** */

        /* add bonus to filtered salary  */
        /*employees.stream().filter(emp -> emp.getSalary() > 20000).forEach(emp -> {
            emp.setSalary(emp.getSalary() + emp.getBonus());
            System.out.println(emp);
        });*/
        /* filter Employees By salary, exp, age */
        /*employees.stream()
                .filter(employee -> employee.getSalary() > 20000
                        && employee.getExp() > 10
                        && employee.getAge() > 15)
                //.forEach(emp -> System.out.println("Salary : " + emp.getSalary()+ ", Exp : " + emp.getExp() + ", Age : " + emp.getAge()));
                .forEach(emp -> {
                    System.out.println("Salary : " + emp.getSalary());
                    System.out.println("Exp : " + emp.getExp());
                    System.out.println("Age : " + emp.getAge());
                });*/

        /* ******************************************************************************************** */

        /* employee data */
        employees.stream()
                .filter(emp -> emp.getFirstName().matches("Luffy")
                                || emp.getLastName().matches("Cook")
                                || emp.getFirstName().startsWith("Z")
                                || emp.getFirstName().endsWith("y")
                                || emp.getLastName().startsWith("M")
                                || emp.getLastName().endsWith("l")
                                || emp.getGender().equals("Female")
                                || emp.getAge() >= 15
                                && emp.getSalary() > 10000
                                && emp.getExp() > 20
                )
                //.map(emp -> emp.getFirstName() + " " + emp.getLastName())
                //.map(Employee::getFirstName)
                .forEach(System.out::println);

        /* ******************************************************************************************** */

        /* all employee data by gender*/
        /*employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender))
                .forEach((gender, empList) -> {
                    System.out.println("Gender : " + gender + " : " + empList.size());
                    empList.forEach(System.out::println);
                });*/

        /* ******************************************************************************************** */

        /* all employee data by City */
        /*employees.stream()
                .collect(Collectors.groupingBy(Employee::getCity))
                .forEach((city, empList) -> {
                    System.out.println("City: " + city + " : " + empList.size());
                    empList.forEach(System.out::println);
                });*/

        /* ******************************************************************************************** */

        /* get name of Employees */
        /*employees.stream()
                .map(Employee::getFirstName)
                .forEach(System.out::println);*/

        /* ******************************************************************************************** */

        /* select firstName and lastName as fullName */
        /*System.out.println("Full name : ");
        employees.stream()
                .filter(emp -> emp.getSalary() > 20000)
                .map(emp -> emp.getFirstName() + " " + emp.getLastName())
                .forEach(System.out::println);*/

    }
}