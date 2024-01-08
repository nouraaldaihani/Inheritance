public class SalesPerson extends Employee {
    private int salesTarget;
    public int getSalesTarget(){
        return salesTarget;
    }

    public void setSalesTarget(int salesTarget){
        this.salesTarget = salesTarget;

    }

    public SalesPerson(String name, String department, double salary, int salesTarget){
        super(name, department, salary);
        this.salesTarget = salesTarget;
    }
}
