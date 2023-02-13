public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 87.7;
        var boxerWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("общий вес двух боксеров " + boxerWeight);
        var differenceBoxerWeight= secondBoxerWeight - firstBoxerWeight;
        System.out.println("разница между весами боксеров " + differenceBoxerWeight);

        var firstSportsmanWeight = 78.2;
        var secondSportsmanWeight = 87.7;
        var differenceSportsmanWeight = secondSportsmanWeight - firstSportsmanWeight;
        System.out.println("вычесление разницу весов спортсменов первым способом " + differenceSportsmanWeight);
        var defferenceSportsmenWaight = secondSportsmanWeight % firstSportsmanWeight;
        System.out.println("вычесление разницу весов спортсменов вторым способом " + defferenceSportsmenWaight);

        var totalTime = 640;
        var time = 8;
        var worker = totalTime / time;
        System.out.println("Всего работников в компании " + worker + " человек");
        var otherWorker = 94;
        var workerOtherCompany = otherWorker + worker;
        System.out.println("Количество сотрудников в другой компании " + workerOtherCompany + " человек");
        var totalTimeOtherCompany = workerOtherCompany * time;
        System.out.println("чсы работы поделено между сотрудниками " + totalTimeOtherCompany);



    }
}
