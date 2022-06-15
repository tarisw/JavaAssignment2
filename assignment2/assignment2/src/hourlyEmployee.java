public class hourlyEmployee extends employee{

    public hourlyEmployee(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
        //TODO Auto-generated constructor stub
    }

    double numHours;//number of hours worked
    double hourlyRate;//rate per hour

    public double getNumHours() {
        return numHours;
    }
    public void setNumHours(double numHours) {
        this.numHours = numHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    //Overrides the calculatePay method
    public double calculatePay(){

        return numHours * hourlyRate;
    }
}
