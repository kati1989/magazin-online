import model.Cosmetice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CosmeticeTest {

    @Test

    public  void descriere(){
        Cosmetice cosmetice=new Cosmetice("1,ruj,40,2,roz,16");
        System.out.println(cosmetice.descriere());

    }
    @Test
    public void toSave(){
        Cosmetice cosmetice=new Cosmetice("1,ruj,40,2,roz,16");
        System.out.println(cosmetice.toSave());
    }


}