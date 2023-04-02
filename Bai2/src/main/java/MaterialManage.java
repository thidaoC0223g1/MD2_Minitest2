import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class MaterialManage {
    public static void main(String[] args) {
//        LocalDate local = LocalDate.now();
//        LocalDate local1 = LocalDate.parse("2022-05-10", DateTimeFormatter.ISO_DATE);
//        CrispyFlour c1 = new CrispyFlour("1", "chien tom", local1, 12, 10);
//
//        System.out.println(c1);
//        double months = ChronoUnit.MONTHS.between(local1, local);
//        System.out.println(months);
//        if(months<=12&&months>8){
//            System.out.println(c1.getRealMoney(0.2));
//
//        }
        ArrayList<Material> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            CrispyFlour c = new CrispyFlour();
            Meat m = new Meat();
            int n = input.nextInt();
            if (n == 1) {
                c.addItem();
                list.add(c);
            }
            if (n == 2) {
                m.addItem();
                list.add(m);
            }
            if (n == 3) {
                break;
            }
        }
        for (Material x : list) {
            System.out.println(x);
        }
        System.out.println("press any key to continue");
        input.next();
    }

}


