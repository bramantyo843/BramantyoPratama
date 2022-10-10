package tugasdua;


import com.beust.ah.A;
import com.juara.coding.Account;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.expectThrows;

public class testdua {



    @Test
    public void tesinsert() {
        Account akun = new Account();

        String actual = akun.toString();
        String except = "n";

        Assert.assertEquals(actual, except);
       // System.out.println("coba");
    }

   // @Test
    //public void testdeposit(){
     //   double a = akun.display();
       // double b = "amt";

        //Assert.assertEquals(a,b);

    }



