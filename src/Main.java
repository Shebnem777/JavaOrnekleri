import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  Scanner sc= new Scanner(System.in);
//        System.out.println("1ci sayi gir");
//        int toplam1= sc.nextInt();
//        System.out.println("2ci sayi gir");
//        int toplam2=sc.nextInt();
//        int toplam=toplam1+toplam2;
//        System.out.println("cemi:" + toplam );
//        Scanner sc = new Scanner(System.in);
//        System.out.println("ededi daxil edin");
//        float number;
//        number = sc.nextInt();
//        if (number > 0.0)
//            System.out.println(number + " uygundur");
//        if (number == 5.5)
//            System.out.println(number + " beraberdir");
//        else if (number < 0.0)
//
//
//        Scanner reader = new Scanner(System.in);
//
//        System.out.print("Bir Sayı Girin: ");
//
//        // nextInt() metodu ile tam sayı türünde değer okuması yapılır.
//        int num = reader.nextInt();
//
//        int adet = 0, toplam = 0;
//
//        while (num != 0) {
//            toplam = (num % 10) + toplam;
//            num /= 10;
//            ++adet;
//
//    System.out.println("Basamak Toplamı: " + toplam);
      // Scanner sc=new Scanner(System.in);
        System.out.println("reqem daxil edin");
       // int number=sc.nextInt();
        int number=1111,cem=0;
        while (number!=0){
            cem=(number%10)+cem;
            number/=10;
           // number++;

        }
        int minimum, a,b;
        a=3;
        b = ++a;
        minimum=7;
        String dosvan="hayvan";
        String it="HAYVAN";
        System.out.println(dosvan.toUpperCase());
        System.out.println(it.toLowerCase());
        System.out.println(it.equals(dosvan));
        System.out.println(it==dosvan);
        System.out.println(it.equalsIgnoreCase(dosvan)+"bu");
        int uzunluq=it.length();
        System.out.println(uzunluq==minimum);
        System.out.println("axtariram"+it.contains("hayvan"));
        System.out.println("axtariram"+it.contains("HAYVAN"));
        System.out.println("axtariram" +it.indexOf("VAN"));
        System.out.println(b);
        System.out.println(++b + b);


   }

    private static class JavaOrnekleri {
        
    }
}

