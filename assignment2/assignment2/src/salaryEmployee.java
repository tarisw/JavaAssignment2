public class salaryEmployee extends employee {

    public salaryEmployee(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
        //TODO Auto-generated constructor stub
    }

    double salary;//yearly salary > 0

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Overrides the calculatePay method
    public double calculatePay(){

        return salary / 52;
    }
}
