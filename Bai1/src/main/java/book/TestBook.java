package book;

import java.util.ArrayList;


public class TestBook {
    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList<>();
        list.add(new ProgrammingBook("1", "javabook", 2000,
                "alan", "java", "api"));
        list.add(new ProgrammingBook("2", "cbook", 1000,
                "tom", "c", "capi"));
        list.add(new ProgrammingBook("3", "pascalbook", 3000,
                "helen", "pascal", "pascalapi"));
        list.add(new ProgrammingBook("4", "jsbook", 2500,
                "christ", "js", "jsapi"));
        list.add(new ProgrammingBook("5", "C#book", 4000,
                "bale", "c#", "C#api"));

        list.add(new FictionBook("6", "tam cam", 1500,
                "viet", "vien tuong 1"));
        list.add(new FictionBook("7", "thanh giong", 2500,
                "ly", "vien tuong 2"));
        list.add(new FictionBook("8", "so dua", 3500,
                "tran", "vien tuong 1"));
        list.add(new FictionBook("9", "cay khe", 4500,
                "tam", "vien tuong 3"));
        list.add(new FictionBook("10", "ly thong", 5500,
                "dinh", "vien tuong 1"));

        checkAmountAndFind(list);
    }

    public static void checkAmountAndFind(ArrayList<Book> list) {
        double sum = 0;
        int count = 0;
        int countprice = 0;
        for (Book x : list) {
            System.out.println(x + "\n");
            sum += x.getPrice();
            if (x instanceof FictionBook) {
                if (((FictionBook) x).getCategory().equals("vien tuong 1")) {
                    count++;
                }
            }
            if (x.getPrice() < 2000) {
                countprice++;
            }
        }
        System.out.println("tong tien cua 10 cuon sach la " + sum);
        System.out.println("so sach co category: vien tuong 1 = " + count);
        System.out.println("so sach co gia duoi 2000 = " + countprice);
    }
}


