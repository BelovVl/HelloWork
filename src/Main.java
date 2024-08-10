public class Main {
    public static void main(String[] args) {

        //homeWork 1
        System.out.println("привет, друг!");

        //homeWork 2.1
        var dog = 8.0;
        System.out.println("собака " + dog);
        var cat = 3.6;
        System.out.println("кошка " + cat);
        var paper = 763789;
        System.out.println("бумага " + paper);
        dog = dog + 4;
        System.out.println("собака " + dog);
        cat = cat + 4;
        System.out.println("кошка " + cat);
        paper = paper + 4;
        System.out.println("бумага " + paper);
        dog = dog - 3.5;
        System.out.println("собака " + dog);
        cat = cat - 1.6;
        System.out.println("кошка " + cat);
        paper = paper - 7639;
        System.out.println("бумага " + paper);

        var friend = 19;
        System.out.println("друг " + friend);
        friend = friend + 2;
        System.out.println("друг " + friend);
        friend = friend / 7;
        System.out.println("друг " + friend);

        var frog = 3.5;
        System.out.println("лягушка " + frog);
        frog = frog * 10;
        System.out.println("лягушка " + frog);
        frog = frog / 3.5;
        System.out.println("лягушка " + frog);
        frog = frog + 4;
        System.out.println("лягушка " + frog);

        var boxer1 = 78.2;
        System.out.println("боксёр1- " + boxer1 + " килограмм");
        var boxer2 = 82.7;
        System.out.println("боксёр2- " + boxer2 + " килограмм");
        var totalWeighBoxers = boxer1 + boxer2;
        System.out.println("общая масса боксёров= " + totalWeighBoxers + " килограмм ");
        var differenceMassBoxers = boxer2 - boxer1;
        System.out.println("разница масс боксёров= " + differenceMassBoxers + " килограмма ");
        var remains = boxer2 % boxer1;
        System.out.println("остаток= " + remains + " килограмма ");

        var x = 640;
        var y = 8;
        var result = x / y;
        System.out.println("Всего работников в компании - " + result + " человек");

        var a = 80;
        var b = 94;
        var result1 = a + b;
        System.out.println("Если в компании работает " + result1 + " человек, то всего  640 часов работы может быть поделено между сотрудниками");

        //homeWork 2.2
        byte nomberOne = 120;
        short nomberTwo = 24956;
        int nomberThree = 133530;
        long nomberFour = 544144144L;
        float nomberFive = 1.14f;
        double nomberSix = 1.1465498;
        System.out.println("значение переменной nomberOne с типом byte целочисленное равна " + nomberOne);
        System.out.println("значение переменной nomberTwo с типом short целочисленное равна " + nomberTwo);
        System.out.println("значение переменной nomberThree с типом int целочисленное равна " + nomberThree);
        System.out.println("значение переменной nomberFour с типом long целочисленное равна " + nomberFour);
        System.out.println("значение переменной nomberFive с типом float плавающей точкой равна " + nomberFive);
        System.out.println("значение переменной nomberSix с типом double плавающей точкой равна " + nomberSix);

        float sandwiches = 27.12f;
        long stars = 987678965549L;
        double meters = 2.786;
        short pigs = 569;
        short degrees = -159;
        short friends = 27897;
        byte socets = 67;
        System.out.println("Значение переменной sandwiches с типом float равна " + sandwiches);
        System.out.println("Значение переменной meters с типом double равна " + meters);
        System.out.println("Значение переменной stars с типом long равна " + stars);
        System.out.println("Значение переменной pigs с типом short равна " + pigs);
        System.out.println("Значение переменной degrees с типом short равна " + degrees);
        System.out.println("Значение переменной friends с типом short равна " + friends);
        System.out.println("Значение переменной socets с типом byte равна " + socets);

        byte teacheLudmilaPavlovna = 23;
        byte teacherAnnaSergeevna = 27;
        byte teacherEkaterinaAndreevna = 30;
        short totalPaper = 480;
        double paperOneStudent = (double) totalPaper / (teacheLudmilaPavlovna + teacherAnnaSergeevna + teacherEkaterinaAndreevna);
        System.out.println("на каждого ученика расчитано " + paperOneStudent + " листов бумаги");

        byte productivityIn2Minutes = 16;
        short productivityIn20Minutes = (short) (productivityIn2Minutes * 10);
        long productivityPerDay = productivityIn20Minutes * 72;
        long productivityIn3Days = productivityPerDay * 2;
        long productivityPerMonth = productivityIn3Days * 10;
        System.out.println("За 20 минут машина произвела " + productivityIn20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + productivityPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivityIn3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + productivityPerMonth + " штук бутылок");

        byte need = 120;
        byte classWhite = 2;
        byte classBrown = 4;
        byte numberClass = (byte) ((need / (classWhite + classBrown)));
        byte whitePaint = (byte) (numberClass * classWhite);
        byte browPaint = (byte) (numberClass * classBrown);
        System.out.println("В школе, где " + numberClass + " классов, нужно " + whitePaint + " банок белой краски и " + browPaint + " банок коричневой краски");

        byte oneBananes = 80;
        byte oneHandredGransMilk = 105;
        byte iceCreamOneBriquette = 100;
        byte oneEggs = 70;
        short fiveBananes = (short) (oneBananes * 5);
        short twoHandredGtamsMilk = (short) (oneHandredGransMilk * 2);
        short iceCreamTwoBriquette = (short) (iceCreamOneBriquette * 2);
        short fourEggs = (short) (oneEggs * 4);
        short totalGramms = (short) (fiveBananes + twoHandredGtamsMilk + iceCreamTwoBriquette + fourEggs);
        System.out.println("Всего съедает один спортсмен на завтрак " + totalGramms + " грамм");
        short oneKg = 1000;
        double totalKg = (double) totalGramms / oneKg;
        System.out.println("Всего съедает один спортсмен на завтрак " + totalKg + " килограмм");

        byte needReset = 7;
        short oneKgWeight = 1000;
        short sevenKg = (short) (needReset * oneKgWeight);
        short diet1 = 250;
        short diet2 = 500;
        byte numberDiet1 = (byte) (sevenKg / diet1);
        byte numberDiet2 = (byte) (sevenKg / diet2);
        System.out.println(numberDiet1 + " дней потребуется чтобы похудеть на " + needReset + " кг ");
        System.out.println(numberDiet2 + " дней потребуется чтобы похудеть на " + needReset + " кг ");
        byte average = (byte) ((numberDiet1 + numberDiet2) / 2);
        System.out.println("В среднем может потребоваться " + average + " день, чтобы добиться результата в " + needReset + " кг");

        int employeeMasha = 67760;
        int employeeDenis = 83690;
        int employeeKristina = 76230;
        double percent10 = 0.1;
        int percent10Masha = (int) (employeeMasha * percent10);
        int percent10Denis = (int) (employeeDenis * percent10);
        int percent10Kristina = (int) (employeeKristina * percent10);
        int raising10Masha = employeeMasha + percent10Masha;
        int raising10Denis = employeeDenis + percent10Denis;
        int raising10Kristina = employeeKristina + percent10Kristina;
        System.out.println(" После повышения на 10 % сотрудники будут получать в месяц : Маша - " + raising10Masha + "руб.; Денис - " + raising10Denis + "руб.; Кристина - " + raising10Kristina + "руб.");
        byte yearMonths = 12;
        int incomeYearBeforeMasha = employeeMasha * yearMonths;
        int incomeYearBeforeDenis = employeeDenis * yearMonths;
        int incomeYearBeforeKristina = employeeKristina * yearMonths;
        System.out.println("Годовой доход сотрудников до повышения : Маша - " + incomeYearBeforeMasha + "руб.; Денис - " + incomeYearBeforeDenis + "руб.; Кристина - " + incomeYearBeforeKristina + "руб.");
        int incomeYearAfterMasha = raising10Masha * yearMonths;
        int incomeYearAfterDenis = raising10Denis * yearMonths;
        int incomeYearAfterKristina = raising10Kristina * yearMonths;
        System.out.println("Годовой доход сотрудников после повышения : Маша - " + incomeYearAfterMasha + "руб.; Денис - " + incomeYearAfterDenis + "руб.; Кристина - " + incomeYearAfterKristina + "руб.");
        int incomeDifferenceMasha = incomeYearAfterMasha - incomeYearBeforeMasha;
        int incomeDifferenceDenis = incomeYearAfterDenis - incomeYearBeforeDenis;
        int incomeDifferenceKristina = incomeYearAfterKristina - incomeYearBeforeKristina;
        System.out.println("Маша теперь получает " + raising10Masha + " рублей. Годовой доход вырос на " + incomeDifferenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + raising10Denis + " рублей. Годовой доход вырос на " + incomeDifferenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + raising10Kristina + " рублей. Годовой доход вырос на " + incomeDifferenceKristina + " рублей.");

        //homeWork 3.1
        //задача 1
        System.out.println("\nЗадача1");
        int age = 15;
        if (age >= 18) {
            System.out.println("если возраст человека равен " + age + " он совершеннолетнй ");
        } else {
            System.out.println("если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать ");
        }
        //задача 2
        System.out.println("\nЗадача2");
        int airTemperature = 10;
        if (airTemperature <= 5) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку ");
        } else {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки ");
        }
        //задача 3
        System.out.println("\nЗадача3");
        int speed = 100;
        if (speed >= 60) {
            System.out.println("если скорость " + speed + " , то придется заплатить штраф ");
        } else {
            System.out.println("если скорость " + speed + " , то можно ездить спокойно");
        }
        //задача 4
        System.out.println("\nЗадача4");
        int agePeople = 30;
        if (agePeople >= 2 && agePeople <= 6) {
            System.out.println("если человеку  " + agePeople + " , то ему нужно ходить в детский сад ");
        }else if (agePeople >= 7 && agePeople <= 17) {
            System.out.println("если человеку  " + agePeople + " , то ему нужно ходить в школу");
        }else if (agePeople >= 18 && agePeople <= 24) {
            System.out.println("если человеку  " + agePeople + " , то его место в университете");
        }else{
            System.out.println("если человеку  " + agePeople + " , то ему пора на работу");
        }
        //задача 5
        System.out.println("\nЗадача5");
        int ageChild = 20;
        if (ageChild < 5) {
            System.out.println("если возраст ребёнка равен  " + ageChild + " , то ему нельзя кататься на аттракционах ");
        }else if (ageChild >= 5 && ageChild <= 14) {
            System.out.println("если возраст ребёнка равен   " + ageChild + " , то ему можно кататься на аттракционах в сопровождении родителей ");
        }else{
            System.out.println("если возраст ребёнка равен   " + ageChild + " , то ему можно кататься на аттракционах без сопровождения взрослых ");
        }
        //задача 6
        System.out.println("\nЗадача6");
        int places = 150;
        if (places <= 60) {
            System.out.println("в вагоне есть мест: сидячих - " + (60 - places) + "; стоячих - " + (102 - 60));
        }else if (places >= 60 && places <= 102) {
            System.out.println("в вагоне нет сидячих мест и осталось стоячих - " + (102 - places));
        }else{
            System.out.println("вагон переполнен на - " + (places - 102) + " мест ");
        }
        //задача 7
        System.out.println("\nЗадача7");
        int one = 10;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("большее - " + one);
        } else if (two > one && two > three) {
            System.out.println("большее - " + two);
        } else {
            System.out.println("большее - " + three);
        }
    }
}