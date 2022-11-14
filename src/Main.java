public class Main {
    public static void main(String[] args) {
        var dog=8.0;
        System.out.println(dog);
        dog=dog+4;
        System.out.println(dog);
        dog=dog-3.5;
        System.out.println(dog);

        var cat=3.6;
        System.out.println(cat);
        cat=cat+4;
        System.out.println(cat);
        cat=cat-1.6;
        System.out.println(cat);

        var paper=763789;
        System.out.println(paper);
        paper=paper+4;
        System.out.println(paper);
        paper=paper-7639;
        System.out.println(paper);

        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);

        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

        var fierstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeightBoxers = fierstBoxer+secondBoxer;
              System.out.println("Общий вес боксеров "+totalWeightBoxers+" кг");
        var weightDifference = secondBoxer - fierstBoxer;
              System.out.println("Разница между весами боксеров "+weightDifference+" кг");
              System.out.println("второй способ вычисления разницы");
        weightDifference = secondBoxer % fierstBoxer;
              System.out.println("Разница между весами боксеров "+weightDifference+" кг");
    }
}