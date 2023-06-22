public class Main {

    private static Employee[] employee = new Employee[10];

    public static void main(String[] args) {

        Employee staff1 = new Employee("Smirnov I.S", 1, 10);
        System.out.println("Full name - " + staff1.getFullName());
        System.out.println("Original department - " + staff1.getDepartment());
        staff1.setDepartment(1);
        System.out.println("Actual department - " + staff1.getDepartment());
        System.out.println("Employee salary - " + staff1.getSalaryOfStaff());
        staff1.setSalaryOfStaff(10);
        System.out.println("Actual salary - " + staff1.getSalaryOfStaff());
        System.out.println("-------------------------");

        Employee staff2 = new Employee("Pilitckiy S.O", 1, 20);
        System.out.println("Full name - " + staff2.getFullName());
        System.out.println("Original department - " + staff2.getDepartment());
        staff1.setDepartment(1);
        System.out.println("Actual department - " + staff2.getDepartment());
        System.out.println("Employee salary - " + staff2.getSalaryOfStaff());
        staff1.setSalaryOfStaff(10);
        System.out.println("Actual salary - " + staff2.getSalaryOfStaff());
        System.out.println("-------------------------");

        Employee staff3 = new Employee("Arhipenkova D.S", 2, 30);
        System.out.println("Full name - " + staff3.getFullName());
        System.out.println("Original department - " + staff3.getDepartment());
        staff1.setDepartment(1);
        System.out.println("Actual department - " + staff3.getDepartment());
        System.out.println("Employee salary - " + staff3.getSalaryOfStaff());
        staff1.setSalaryOfStaff(10);
        System.out.println("Actual salary - " + staff3.getSalaryOfStaff());
        System.out.println("-------------------------");

        Employee staff4 = new Employee("Losev M.M", 2, 40);
        System.out.println("Full name - " + staff4.getFullName());
        System.out.println("Original department - " + staff4.getDepartment());
        staff1.setDepartment(1);
        System.out.println("Actual department - " + staff4.getDepartment());
        System.out.println("Employee salary - " + staff4.getSalaryOfStaff());
        staff1.setSalaryOfStaff(10);
        System.out.println("Actual salary - " + staff4.getSalaryOfStaff());
        System.out.println("-------------------------");

        Employee staff5 = new Employee("Averin S.P", 3, 50);
        System.out.println("Full name - " + staff5.getFullName());
        System.out.println("Original department - " + staff5.getDepartment());
        staff1.setDepartment(1);
        System.out.println("Actual department - " + staff5.getDepartment());
        System.out.println("Employee salary - " + staff5.getSalaryOfStaff());
        staff1.setSalaryOfStaff(10);
        System.out.println("Actual salary - " + staff5.getSalaryOfStaff());
        System.out.println("-------------------------");

        Employee staff6 = new Employee("Vialko A.I", 3, 60);
        System.out.println("Full name - " + staff6.getFullName());
        System.out.println("Original department - " + staff6.getDepartment());
        staff1.setDepartment(1);
        System.out.println("Actual department - " + staff6.getDepartment());
        System.out.println("Employee salary - " + staff6.getSalaryOfStaff());
        staff1.setSalaryOfStaff(10);
        System.out.println("Actual salary - " + staff6.getSalaryOfStaff());
        System.out.println("-------------------------");

        Employee staff7 = new Employee("Suchkov A.V", 4, 70);
        System.out.println("Full name - " + staff7.getFullName());
        System.out.println("Original department - " + staff7.getDepartment());
        staff1.setDepartment(1);
        System.out.println("Actual department - " + staff7.getDepartment());
        System.out.println("Employee salary - " + staff7.getSalaryOfStaff());
        staff1.setSalaryOfStaff(10);
        System.out.println("Actual salary - " + staff7.getSalaryOfStaff());
        System.out.println("-------------------------");

        Employee staff8 = new Employee("Zaikin F.E", 4, 80);
        System.out.println("Full name - " + staff8.getFullName());
        System.out.println("Original department - " + staff8.getDepartment());
        staff1.setDepartment(1);
        System.out.println("Actual department - " + staff8.getDepartment());
        System.out.println("Employee salary - " + staff8.getSalaryOfStaff());
        staff1.setSalaryOfStaff(10);
        System.out.println("Actual salary - " + staff8.getSalaryOfStaff());
        System.out.println("-------------------------");

        Employee staff9 = new Employee("Platonov S.G", 5, 90);
        System.out.println("Full name - " + staff9.getFullName());
        System.out.println("Original department - " + staff9.getDepartment());
        staff1.setDepartment(1);
        System.out.println("Actual department - " + staff9.getDepartment());
        System.out.println("Employee salary - " + staff9.getSalaryOfStaff());
        staff1.setSalaryOfStaff(10);
        System.out.println("Actual salary - " + staff9.getSalaryOfStaff());
        System.out.println("-------------------------");

        Employee staff10 = new Employee("Shtraiher G.O", 5, 100);
        System.out.println("Full name - " + staff10.getFullName());
        System.out.println("Original department - " + staff10.getDepartment());
        staff1.setDepartment(1);
        System.out.println("Actual department - " + staff10.getDepartment());
        System.out.println("Employee salary - " + staff10.getSalaryOfStaff());
        staff1.setSalaryOfStaff(10);
        System.out.println("Actual salary - " + staff10.getSalaryOfStaff());
        System.out.println("-------------------------");

        System.out.println(staff1);
        System.out.println(staff2);
        System.out.println(staff3);
        System.out.println(staff4);
        System.out.println(staff5);
        System.out.println(staff6);
        System.out.println(staff7);
        System.out.println(staff8);
        System.out.println(staff9);
        System.out.println(staff10);

        employee[0] = staff1;
        employee[1] = staff2;
        employee[2] = staff3;
        employee[3] = staff4;
        employee[4] = staff5;
        employee[5] = staff6;
        employee[6] = staff7;
        employee[7] = staff8;
        employee[8] = staff9;
        employee[9] = staff10;

    }

}