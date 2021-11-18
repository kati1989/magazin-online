import model.Cosmetice;
import model.Televizor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevizorTest {
    @Test

    public  void descriere(){
        Televizor televizor=new Televizor(1,"Hd",2000,2,"127inch","android");
        System.out.println(televizor.descriere());

    }
    @Test
    public void toSave(){
        Televizor televizor=new Televizor(1,"Hd",2000,2,"127inch","android");
        System.out.println(televizor.toSave());
    }

}