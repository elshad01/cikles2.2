public class Main {
    public static void main(String[] args){

        System.out.println("task 1");
        int desirredSum= 2_459_000;
        int sum=0;
        int amount = 15000;
        double percent= 1D /100;
        int month= 0;
        while (sum<desirredSum){
            sum= sum+amount;
            sum= (int) (sum*(1 + percent));
            month++;
            System.out.println("Месяц "+ month+ " , сумма накоплений равна"+ sum+ " рублей" );

        }
        System.out.println(" task 2");
        int nomber = 0;
        while (nomber< 10){
            nomber++;
            System.out.println(nomber);
        }
        for (; nomber>=1; nomber--){
            System.out.println(nomber);
        }
        System.out.println(" task 3");
        int population= 12_000_000;
        int fertilitiPerThousand= 17;
        int mortalitiPerThousand= 8;
        int currentYear= 2024;
        for (int year= currentYear; year< currentYear +10; year++){
            population+= population *fertilitiPerThousand/ 1000 -population*mortalitiPerThousand/ 1000;
            System.out.println("Год"+ year+ ", численность населения"+ population);
        }
        System.out.println("task 4");

        percent= 7D/100;
        desirredSum =12_000_000;
        sum= amount;
        month= 0;
        while (sum< desirredSum){
            sum=(int) (sum*(1 + percent));
            month++;
            System.out.println("Месяц "+ month+ " , сумма накоплений равна"+ sum+ " рублей");
        }
        System.out.println("task 5");

        sum= amount;
        month= 0;
        while (sum< desirredSum){
            sum=(int) (sum*(1 + percent));
            month++;
            if (month % 6 ==0)
                System.out.println("Месяц "+ month+ " , сумма накоплений равна"+ sum+ " рублей");
        }
        System.out.println("task 6");

        sum= amount;
        month= 0;
        int months = 12*9;
        while (month< months){
            sum=(int) (sum*(1 + percent));
            month++;
            if (month % 6 ==0)
                System.out.println("Месяц "+ month+ " , сумма накоплений равна"+ sum+ " рублей");
        }
        System.out.println("task 7");
        int firstFriday= 3;
        for (int day = firstFriday; day<= 31; day+= 7){
            System.out.println("Сегодня пятница, "+day+" -е число необходимо преготовить отчет");
        }
        System.out.println("task 8");
        int period= 79;
        int startSeeing =0;
        int start= currentYear -200;
        int end = currentYear+ 100;
        for (int year= startSeeing; year< end;year+= period){
            if (year> start){
                System.out.println(year);
            }
        }

    }
}