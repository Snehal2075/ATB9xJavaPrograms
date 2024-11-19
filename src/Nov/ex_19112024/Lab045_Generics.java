package Nov.ex_19112024;

public class Lab045_Generics {
    public static void main(String[] args) {

        temp_sum(23,78);
        temp_sum("Snehal","Sawant");
        temp_sum(3.14f,8.99f);
    }




    public static <T> T temp_sum(T a , T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }


}
