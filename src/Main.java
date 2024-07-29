public class Main {
    public static void main(String[] args) {
        System.out.println("привет, друг!");

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

    }
}