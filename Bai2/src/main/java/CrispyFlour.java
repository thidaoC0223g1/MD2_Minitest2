import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CrispyFlour extends Material implements Discount, InOut {
    private int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * this.getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusMonths(12);
    }


    @Override
    public String toString() {
        return super.toString() +
                ",quantity= " + quantity
                ;
    }

    @Override
    public double getRealMoney(double pt) {
        return getQuantity() * (getCost() - getCost() * pt);
    }

    public void addItem() {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao id san pham");
        String id = input.nextLine();
        setId(id);
        System.out.println("nhap vao ten san pham");
        String name = input.nextLine();
        setName(name);
        System.out.println("nhap vao ngay san xuat");
        String inputdate = input.nextLine();
        LocalDate date = LocalDate.parse(inputdate, DateTimeFormatter.ISO_DATE);
        setManufacturingDate(date);
        System.out.println("nhap vao gia san pham");
        String inputcost = input.nextLine();
        int cost = Integer.parseInt(inputcost);
        setCost(cost);
        System.out.println("nhap vao sl san pham");
        String inputquantity = input.nextLine();
        int quantity = Integer.parseInt(inputquantity);
        setQuantity(quantity);
    }
}
