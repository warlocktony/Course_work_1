public class Employee {
    private String fullName;
    private int department;
    private int salaryOfStaff;
    private int id;
    private static int idCounter = 1;


    public Employee(String fullName, int department, int salaryOfStaff) {
        this.fullName = fullName;
        this.department = department;
        this.salaryOfStaff = salaryOfStaff;
        this.id = idCounter++;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalaryOfStaff() {
        return this.salaryOfStaff;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalaryOfStaff(int salaryOfStaff) {
        this.salaryOfStaff = salaryOfStaff;
    }

    public String toString(){
        return "Id - " + this.id + " Full name - " + this.fullName + " Department - " + this.department + " Salary - " + this.salaryOfStaff;
    }
    public int getAllSalaryOfStaff(Employee[] employee) {
        Employee all = employee[0];
        for (int i = 0; i < employee.length; i++) {
            all += employee[i].getSalaryOfStaff();
        }

    return all;


    }
    public int getMinSalaryOfStaff(Employee[] employee) {
        Employee min = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalaryOfStaff() < min.getSalaryOfStaff()) {
                min = employee[i];
            }
        }

        return min;
    }
    @Override
    public String toString() {
        return "Id - " + this.id + " Full name - " + this.fullName;
    }

}

