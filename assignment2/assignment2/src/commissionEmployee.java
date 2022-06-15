public class commissionEmployee extends employee
{
    public commissionEmployee(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
        //TODO Auto-generated constructor stub
    }

    double rate;//a percentage between 0.5 and 20
    double sales;//total sales a positive number

    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSales() {
        return sales;
    }
    public void setSales(double sales) {
        this.sales = sales;
    }

    //Overrides the calculatePay method
    public double calculatePay(){

        return sales * rate/100;
    }
}
