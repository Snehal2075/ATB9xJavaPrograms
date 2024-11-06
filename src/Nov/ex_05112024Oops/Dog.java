package Nov.ex_05112024Oops;

public class Dog {

    String name;
    String breed;
    int age;
    String food;

    void Details(){
        System.out.println("Name: " + name);
        System.out.println("Breed: "+ breed);
        System.out.println("Age: "+ age);
        System.out.println("food:"+ food);


    }

    void Sleeps (){
        System.out.println(name + " " + "Sleeps");

    }

    void Eats () {
        System.out.println(name + " "  +  "Eats");
    }

}
