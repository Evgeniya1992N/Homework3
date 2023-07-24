public class Main {
    public static void main(String[] args) {
        //Task 1 and 2
        int a = 123456789;
        byte b = -127;
        float firstVar = 27.12f;
        long secondVar = 987678965549L;
        double thirdVar = 2.786;
        short fourthVar = 569;
        short fifthVar = -159;
        short sixthVar = 27897;
        byte seventhVar = 67;

        //Task 3
        byte classLuPav = 23;
        byte classAnSer = 27;
        byte classEkAnd = 30;
        int overallStudents = (classLuPav + classAnSer + classEkAnd);

        short sheetsOverall = 480;
        short sheet4each = (short) (sheetsOverall / overallStudents);

        System.out.println( sheet4each );

        // Task 4
        short A = 16;
        short T = 2;
        int P = (short) (A/T);

        int A_for20min = (20 * A)/2;
        int A_for24hours = (24 * 60 * A)/2;
        int A_for3days = (3 * 24 * 60 * A)/2;
        int A_forOneMonth = (30 * 24 * 60 * A)/2;

        System.out.println( "За 20 минут " + " машина произвела " + A_for20min + " штук бутылок");
        System.out.println( "За день " + " машина произвела " + A_for24hours + " штук бутылок");
        System.out.println( "За 3 дня  " + " машина произвела " + A_for3days + " штук бутылок");
        System.out.println( "За месяц " + " машина произвела " + A_forOneMonth  + " штук бутылок");

        // Task 5
        byte ColorCansOverall = 120;
        byte numberOfClasses= 120/6;
        byte brownCans = (byte) (numberOfClasses * 4);
        byte whiteCans = (byte) (numberOfClasses * 2);
        System.out.println( "В школе, где " + numberOfClasses + " классов, " + " нужно " + whiteCans + " банок белой краски и " + brownCans +" банок коричневой.");

        // Task 6
        short bananas = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;

        short sportBreakfastGram = (short) (bananas + milk + iceCream + eggs);
        double sportBreakfastKg  = sportBreakfastGram / 1000;
        System.out.println( sportBreakfastGram );
        System.out.println( sportBreakfastKg );

        // Task 7
        short WeightToLoose = 7000;
        short LoosePerDayMin = 250;
        short LoosePerDayMax = 500;
        float daysNeededMin = WeightToLoose / LoosePerDayMin;
        float daysNeededMax = WeightToLoose / LoosePerDayMax;
        System.out.println( daysNeededMin );
        System.out.println( daysNeededMax );

        // Task 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        int salaryMashaUp = salaryMasha * 110 /100;
        int salaryDenisUp = salaryDenis * 110 /100;
        int salaryKristinaUp = salaryKristina * 110 /100;

        int yearDifferenceMasha = 12 * (salaryMashaUp - salaryMasha);
        int yearDifferenceDenis = 12 * (salaryDenisUp - salaryDenis);
        int yearDifferenceKristina = 12 * (salaryKristinaUp - salaryKristina);

        System.out.println( "Маша теперь получает " + salaryMashaUp + " рублей. Годовой доход вырос на " + yearDifferenceMasha + " рублей.");
        System.out.println( "Denis теперь получает " + salaryDenisUp + " рублей. Годовой доход вырос на " + yearDifferenceDenis + " рублей." );
        System.out.println( "Kristina теперь получает " + salaryKristinaUp + " рублей. Годовой доход вырос на " + yearDifferenceKristina + " рублей.");
    }
}