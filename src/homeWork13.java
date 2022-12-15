public class homeWork13 {
    public static void main (String [] args){

        byte a = 1;
        short b = 5;
        int c =10;
        long d = 456l;
        float e = 1.2f;
        double f = 1.26;
        char ch = 33;
        boolean ab = a < b;


        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double waight = boxer1 + boxer2;
        System.out.println("Waight of bother boxers is  " +  waight + " kg");
        double difference = boxer2 - boxer1;
        System.out.println("Difference in waight is " + difference + " kg");


        int bananas = 5 * 80;
        int milk = 200 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        double products = bananas + milk + iceCream + eggs;
        System.out.println(products);
        double productsInKg = products / 1000;
        System.out.println(productsInKg);


        int waightOut = 7000;
        int waightOut1 = 250;
        int waightOut2 = 500;
        int days1 = (7000 / 250);
        System.out.println("Need " + days1 + " days");
        int days2 = 7000 / 500;
        System.out.println("Need " + days2 + " days ");


        int salaryOfMasha = 67760;
        int salaryOfDenis = 83690;
        int salaryOfKristina = 76230;
        double salaryOfMashaInYear = salaryOfMasha * 1.1;
        double salaryOfDenisInYear = salaryOfDenis * 1.1;
        double salaryOfKristinaInYear = salaryOfKristina * 1.1;
        System.out.println(salaryOfMashaInYear + " Salary of Masha in year");
        System.out.println(salaryOfDenisInYear + " Salary of Denis in year");
        System.out.println(salaryOfKristinaInYear + " salary of Kristina in Year");
        double MashaSalaryDifference = salaryOfMashaInYear - salaryOfMasha;
        System.out.println(MashaSalaryDifference + " difference Masha salary");
        double DenisSalaryDifference = salaryOfDenisInYear - salaryOfDenis;
        System.out.println( DenisSalaryDifference + " difference Denis salary");
        double KristinaSalaryDifference = salaryOfKristinaInYear - salaryOfKristina;
        System.out.println(KristinaSalaryDifference + " difference Kristina salary" );







    }
}
