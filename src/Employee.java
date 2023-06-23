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
    public String getFullNameWithDesc(){
        return "full name " + fullName;
    }
    public String getFullName() {
        return fullName;
    }
    public String toString() {
        return "Id - " + this.id + " Full name - " + this.fullName + " Department " + this.department + " Salary " + this.salaryOfStaff;
    }


    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalaryOfStaff() {
        return salaryOfStaff;
    }

    public void setSalaryOfStaff(int salaryOfStaff) {
        this.salaryOfStaff = salaryOfStaff;
    }

    public int getId() {
        return id;
    }

}

