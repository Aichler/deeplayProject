

public class Main {

    public static void main(String[] args) {
    Main main = new Main();

    main.firstExample();
    System.out.println("=======================");
    main.secondExample();

    }

    public void firstExample(){
        int number = 125;
        int summ = 0;

        do{
            summ += number%10;
            number /= 10;
        }
        while (number!=0);

        System.out.println("Сумма чисел целого числа = " + summ);
    }

    public void secondExample(){
        int min = 0;
        int max = 20;
        int numberArray = 10;
        int x;

        int number[] = new int[numberArray];
        System.out.println("Значения заполненного массива ");
        for(int i = 0; i< number.length; i++)
        {
            x = min + (int)(Math.random() * ((max - min) + 1));
            number[i] = x;
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.print("Три наибольших числа в массиве = ");
        for(int j = 0; j < 3; j ++)
        {
            int iteration = 0;
            int nullInArray = 0;

            x = number[0];

            do {
                if (x < number[iteration + 1])
                {
                    x = number[iteration + 1];
                    nullInArray = iteration + 1;
                }
                iteration++;
            }while ( iteration < number.length - 1);
            System.out.print(x + " ");
            number[nullInArray] = 0;
        }
    }
}
