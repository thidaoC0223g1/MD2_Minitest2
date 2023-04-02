import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Meat extends Material {
    private double weight;

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return this.getCost() * this.weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusDays(7);
    }

    @Override
    public String toString() {
        return super.toString() +
                "weight=, " + weight
                ;
    }
    public void addItem() {
        Scanner minput = new Scanner(System.in);
        System.out.println("nhap vao id thit");
        String mid = minput.nextLine();
        setId(mid);
        System.out.println("nhap vao ten thit");
        String mname = minput.nextLine();
        setName(mname);
        System.out.println("nhap vao ngay san xuat");
        String minputdate = minput.nextLine();
        LocalDate mdate = LocalDate.parse(minputdate, DateTimeFormatter.ISO_DATE);
        setManufacturingDate(mdate);
        System.out.println("nhap vao gia thit");
        String minputcost = minput.nextLine();
        int mcost = Integer.parseInt(minputcost);
        setCost(mcost);
        System.out.println("nhap vao khoi luong thit");
        String inputweight = minput.nextLine();
        int weight = Integer.parseInt(inputweight);
        setWeight(weight);
    }
}
