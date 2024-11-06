package Nov.ex_05112024Oops;

public class Lab024 {

    public static void main(String[] args) {
        Dog a1 = new Dog(); // object creation
        //Assigning values
        a1.name = "Lucy";
        a1.breed = "Labrador Retriever";
        a1.age = 5;
        a1.food = "Dog food";

        // Calling get details to display dog details
        a1.Details();

        a1.Sleeps();
        a1.Eats();


        Dog b1 = new Dog();

        b1.name = "Muffin";
        b1.breed = "German Shephard";
        b1.age = 7;
        b1.food = "Dog Food";

        b1.Details();
        b1.Sleeps();
        b1.Eats();


        Dog c1 = new Dog();

        c1.name = "Juliey";
        c1.breed = "American Bulldog";
        c1.age = 10;
        c1.food = "Dog food";

        c1.Details();
        c1.Sleeps();
        c1.Eats();



        Dog d1 = new Dog();

        d1.name = "Rosey";
        d1.breed = "Rottweiler";
        d1.age = 15;
        d1.food = "Dog Food";

        d1.Details();
        d1.Sleeps();
        d1.Eats();


        Dog e1 = new Dog();

        e1.name = "Seoul";
        e1.breed = "Poodle";
        e1.age = 6;
        e1.food = "Dog Food";


        e1.Details();
        e1.Sleeps();
        e1.Eats();







    }
}
