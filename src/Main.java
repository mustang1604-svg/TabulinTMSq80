public class Main{
    public static void main(String[] args){
        System.out.println("Никта Табулин");
        int age = 32;
        System.out.println("мой возраст " + age);
        formulaCalculator();
    }

    public static void formulaCalculator() {
        double c = 2;
        double b = 3;
        double a = 4*(b+c-1)/2;
        System.out.println("ответ на задание 1= "+a);

        calculator();
    }

    public static void calculator() {
        int n = 55;
        int one = n / 10;
        int second = n % 10;
        int sum = one + second;
        System.out.println("ответ на задание 2= " + sum);

        calculatorTwo();
    }
    public static void calculatorTwo() {
        int n = 573;
        int a = n / 100;
        int b = n % 10;
        int c = n / 10;
        int cS = c % 10;
        int nS = a + b + cS;
        System.out.println("ответ на задание 3= " + nS);

        calculatorFour();
    }
    public static void calculatorFour() {
        double a = 8.6;
        double b = a - (int)a;
        int c;
        if (b >= 0.5) {
            c = (int)a + 1 ;
        }
        else {
            c = (int) a;
        }
        System.out.println("ответ на задние 4 ");
        System.out.println("Исходное число: " + a);
        System.out.println("Округление: " + c);
        calculatorFive();
    }
    public static void calculatorFive(){
        int q = 22;
        int w = 5;
        int c = q / w;
        int a = q % w;
        System.out.println("22/5= " +c+ " и " + a +" в остатке ");
        replacing();

    }
            public static void replacing() {
                int a = 5;
                int b = 9;
                System.out.println("До: a = " + a + ", b = " + b);

                int c = a;
                a = b;
                b = c;

                System.out.println("После: a = " + a + ", b = " + b);
            }

    }
