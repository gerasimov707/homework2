package compass;

public class Main {

    public static void main(String[] args) {
        // задание №1
        int snake = 5;
        byte tiger = 1;
        short cow = 3;
        long lion = 100L;
        double saltWeight = 3.5;
        float sugarWeight = 7.5f;
        boolean snakeIsAdult = snake > 7;
        char bar = 43;


        //задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес" + weightOfAllBoxers);
        System.out.println("Разница в весе" + weightDifference);

        //задание 3
        int ice = 2;
        int milk = 200;
        int egg = 4;
        int banana = 5;
        int weightOfAllEggs = egg * 70;
        System.out.println("общий вес яиц" + weightOfAllEggs);
        int weightOfAllBananas = banana * 80;
        System.out.println("общий вес бананов" + weightOfAllBananas);
        int weightOfAllIce = ice * 100;
        System.out.println("общий вес мороженного" + weightOfAllIce);
        int weightOfAllMilk = milk / 100 * 105;
        System.out.println("общий вес молока" + weightOfAllMilk);
        System.out.println("общий вес завтрака" + (weightOfAllMilk + weightOfAllIce + weightOfAllBananas + weightOfAllEggs));




        //задание 4
        int a = 7;
        float b = 0.25f;
        float weightOfAllA = a / b;
        System.out.println("нужно дней"+ weightOfAllA);
        float c = 0.5f;
        float weightOfAllC = a / c;
        System.out.println("нужно дней"+ weightOfAllC);
        float d = (a / c + a / b)/2;
        System.out.println("нужно дней"+ d);


        // задание 5

int M = 67760;
int D = 83690;
int K = 76230;
float salaryM = 67760 + 67760* 0.10f;
System.out.println("Маша получает"+ salaryM);
float salaryD = 83690 + 83690* 0.10f;
System.out.println("Денис получает"+ salaryD);
float salaryK = 76230 + 76230* 0.10f;
System.out.println("Кристина получает"+ salaryK);

float zarplataM1 = M *12;
System.out.println("Маша получает до"+ zarplataM1);
float zarplataD1 = D *12;
System.out.println("Денис получает до"+ zarplataD1);
float zarplataK1 = K *12;
System.out.println("Кристина получает до"+ zarplataK1);

float zarplataM = salaryM * 12;
System.out.println("Маша получает после повышения"+ zarplataM);
float zarplataD = salaryD * 12;
System.out.println("Денис получает после повышения"+ zarplataD);
float zarplataK = salaryK * 12;
System.out.println("Кристина получает после повышения"+ zarplataK);

float raznitcaM2 = zarplataM - zarplataM1;
System.out.println("Маша получает после повышения"+ raznitcaM2);
float raznitcaD2 = zarplataD - zarplataD1;
System.out.println("Денис получает после повышения"+ raznitcaD2);
float raznitcaK2 = zarplataK - zarplataK1;
System.out.println("Кристина получает после повышения"+ raznitcaK2);


        System.out.println("Теперь Маша получает "+ zarplataM + "годовой доход вырос"+ raznitcaM2);
        System.out.println("Теперь Денис получает "+ zarplataD + "годовой доход вырос"+ raznitcaD2);
        System.out.println("Теперь Кристина получает "+ zarplataK + "годовой доход вырос"+ raznitcaK2);






    }
}