package DiagramaUno;
import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Employee> listEmployees;
    private int numberEmployee;

    public Company(String name, int size) {
        this.name = name;
        this.listEmployees = new ArrayList<>(size);
        this.numberEmployee = 0;
    }

    public void displayAll() {
        for (Employee e : listEmployees) {
            e.display();
        }
    }

    public void addEmployee(Employee e) {
        listEmployees.add(e);
        numberEmployee++;
    }

    public int searchEmployeeByName(String name) {
        for (int i = 0; i < listEmployees.size(); i++) {
            if (listEmployees.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void deleteEmployeeByName(String name) {
        int index = searchEmployeeByName(name);
        if (index != -1) {
            listEmployees.remove(index);
            numberEmployee--;
        }
    }

    public double getYearlyPayOfEmployee(String name) {
        int index = searchEmployeeByName(name);
        if (index != -1) {
            return listEmployees.get(index).calculatePay() * 12;
        }
        return 0.0;
    }

    public double calAvgPayForPartTime() {
        int partTimeCount = 0;
        double totalPay = 0.0;

        for (Employee e : listEmployees) {
            if (e instanceof PartTimeEmp) {
                totalPay += e.calculatePay();
                partTimeCount++;
            }
        }

        if (partTimeCount == 0) {
            return 0.0;
        }

        return totalPay / partTimeCount;
    }
}

