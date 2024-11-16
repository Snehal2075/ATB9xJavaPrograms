package Nov.ex_11112024_Access_Modifier.Police;

public class Cop {

    private int gun;
    String icard;

    public Cop(int gun) {
        this.gun = gun;
    }
    //Protected is allowed within the package only
    protected void CanIShoot (){
        System.out.println("Yes, You can !!");

    }
}
