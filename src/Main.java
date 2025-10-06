public class Main{
    public static void main(String[] args){
        System.out.println("Никта Табулин");
        int age = 32;
        System.out.println("мой возраст " + age);
        FormulaCalculator();
    }

    public static void FormulaCalculator() {
        int c = 2;
        int b = 3;
        int a = 4*(b+c-1)/2;
        System.out.println("a="+a);

        Calculator();
    }

    public static void Calculator() {
        double n = 54d;
        double one = n / 10;
        double oneS = Math.floor(one);
        double second = n % 10;
        double sum = oneS + second;
        System.out.println("Сумма=" + sum);

        CalculatorTwo();
    }
    public static void CalculatorTwo() {
        int n = 573;
        int a = n / 100;
        int b = n % 10;
        int c = n / 10;
        int cS = c % 10;
        int nS = a + b + cS;
        System.out.println("сумма=" + nS);
    }
    }
