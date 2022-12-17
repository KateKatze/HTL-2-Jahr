package at.htlpinkafeld.Gehaltsberechnung;

public class TestAbstract {
    private static double calcTotalWages(Employee[] allEmp){
        double retVal = 0;

        for(Employee emp: allEmp)
            retVal += emp.getWage();

        return retVal;
    }

    public static void main(String[] args){
        Employee[] company = new Employee[6];
        company[0] = new Manager(2000.00, 20.00, 200.00, 282.00, 22.00, 1, "Smith");
        company[1] = new OfficeWorker(3000.00, 30.00, 6, "Kendra");
        company[2] = new Worker(2550.00, 30, 7, "John");
        company[3] = new Manager(1200.00, 20.00, 200, 282, 22, 4, "Kotz");
        company[4] = new OfficeWorker(1900.00, 20.00, 5, "Peter");
        company[5] = new Worker(2800.00, 40, 9, "Wahnsinn");
        double totWage;

        //populate your company with all Kind's of Employee's
        //(Worker, OfficeWorker, Manager)
        // company[0] = new Worker(...)
        // ...

        totWage = calcTotalWages(company);
        System.out.println("The overall salary for all employees is " + totWage);
    }

}
