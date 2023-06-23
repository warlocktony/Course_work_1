public class Main {

    public static Employee[] employee = new Employee[10];
    public static double indexPercent = 1.57d;

    public static void main(String[] args) {
        employee[0] = new Employee("Smirnov I.S", 1, 10);
        employee[1] = new Employee("Pilitckiy S.O", 1, 20);
        employee[2] = new Employee("Arhipenkova D.S", 2, 30);
        employee[3] = new Employee("Platonov I.V", 2, 40);
        employee[4] = new Employee("Heruvimov A.A", 3, 50);
        employee[5] = new Employee("Dronova D.A", 3, 60);
        employee[6] = new Employee("Ciplienko F.G", 4, 70);
        employee[7] = new Employee("Ryginina D.L", 4, 80);
        employee[8] = new Employee("Shtraiher F.G", 5, 90);
        employee[9] = new Employee("Kirilinko F.D", 5, 100);
        printAllEmployees();
        System.out.println("month sum salary " + monthSumSalary());
        System.out.println("min salary staff " + minSalary());
        System.out.println("max salary staff " + maxSalary());
        System.out.println("average salary " + averageSalary());
        printAllFullName();
        System.out.println("index salary work");
        indexAllSalary();
        //after index
        printAllEmployees();
    }
    public static void indexAllSalary() {
        for (int i = 0; i < employee.length; i++){
            int currentSalary = employee[i].getSalaryOfStaff();
            double indexSalary;
            indexSalary= currentSalary * indexPercent;
            employee[i].setSalaryOfStaff((int) indexSalary);
        }
    }

    public static void printAllFullName() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getFullNameWithDesc());
        }

    }

    private static int averageSalary() {
        int average;
        int allCash = monthSumSalary();
        average = allCash / employee.length;
        return average;
    }

    private static int maxSalary() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (max < employee[i].getSalaryOfStaff()) {
                max = employee[i].getSalaryOfStaff();
            }
        }
        return max;
    }

    private static int minSalary() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (min > employee[i].getSalaryOfStaff()) {
                min = employee[i].getSalaryOfStaff();
            }
        }
        return min;
    }

    public static int monthSumSalary() {
        int allCash = 0;
        for (int i = 0; i < employee.length; i++) {
            allCash += employee[i].getSalaryOfStaff();
        }
        return allCash;
    }

    public static void printAllEmployees() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].toString());


        }
    }
}