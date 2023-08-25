public class Controller {

    static int temp, number1, number2;

    public static void countFibo()
    {
        temp = number2 + number1;
        number2 = number1;
        number1 = temp;
    }

    public static void resetNumber(){
        number1 = 0;
        number2 = 1;
    }

    public static void printSeparator()
    {
        System.out.println("=====================");
        System.out.println();
    }

    public static void printFiboA(int n)
    {
        System.out.println("========= A =========");

        number1 = 0;
        number2 = 1;
        for (int i = 0; i < n; i++) {
            countFibo();

            System.out.print(temp + " ");
        }

        System.out.println();
        printSeparator();
    }

    public static void printFiboB(int n)
    {
        System.out.println("========= B =========");

        for (int i = 0; i < n; i++) {

            resetNumber();

            for (int j = 0; j < n; j++) {
                countFibo();

                System.out.print(temp + " ");
            }
            System.out.println();
        }

        printSeparator();
    }

    public static void printFiboC(int n)
    {
        System.out.println("========= C =========");

        for (int i = 0; i < n; i++) {

            resetNumber();

            for (int j = 0; j < n; j++) {
                countFibo();

                System.out.print(temp + " ");
            }
            System.out.println();
        }

        printSeparator();
    }

    public static void printFiboD(int n)
    {
        System.out.println("========= D =========");

        for (int i = 0; i < n; i++) {

            resetNumber();

            for (int j = 0; j < n; j++){
                countFibo();

                if (i == j || (i + j) == n - 1)
                {
                    System.out.print(temp);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        printSeparator();
    }

    public static void printFiboE(int n)
    {
        System.out.println("========= E =========");

        for (int i = 0; i < n; i++) {

            resetNumber();

            for (int j = 0; j < n; j++){
                countFibo();

                if (j < n - i)
                {
                    System.out.print(temp + " ");
                }
                else if (j < i)
                {
                    System.out.print("  ");
                }
                else if (j <= i)
                {
                    System.out.print(temp + " ");
                }
                else
                {
                    System.out.print(temp + " ");
                }

            }
            System.out.println();
        }

        printSeparator();
    }
}
