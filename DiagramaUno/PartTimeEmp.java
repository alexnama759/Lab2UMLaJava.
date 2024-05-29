package DiagramaUno;
public class PartTimeEmp extends Employee {
    private int numberWorkHours;
    private int rate;

    public PartTimeEmp(String name, int id, int numberWorkHours, int rate) {
        super(name, id);
        this.numberWorkHours = numberWorkHours;
        this.rate = rate;
    }

    public PartTimeEmp(PartTimeEmp p) {
        super(p);
        this.numberWorkHours = p.numberWorkHours;
        this.rate = p.rate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Working Hours: " + numberWorkHours + ", Rate: " + rate);
    }

    @Override
    public double calculatePay() {
        return numberWorkHours * rate;
    }

    public int getRate() {
        return rate;
    }

    public int getNbWorkHours() {
        return numberWorkHours;
    }
}
