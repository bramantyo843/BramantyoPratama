package tugasdua;


import com.juara.coding.Account;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testdua {
    Account account;
    int a;
    String n;
    double amt;
    @BeforeMethod
    public void setUp(){
        account = new Account();
        a =300494;
        n = "bram";
        amt = 200000;
    }

    @Test
    public void tesinsert() {
        String actual = account.insert(a,n,amt);
        String except = "bram";

        Assert.assertEquals(actual, except);
        System.out.println("variable 'n'"+n);
    }

    @Test
    public void testDeposit(){

        double amount = amt;
        double amount2 = amount + amt;
        System.out.println(amount2 + " deposited");

    }

    @Test
    public void testwithdraw(){
        double amount = amt;
        double amount5 = 100000;
        if (amount < amount5) {
            System.out.println("Insufficient Balance");
            assertTrue(false);
        } else {
            double amount3 = amount - amount5;
            System.out.println(amount3 + " withdrawn");
            assertTrue(true);
        }
        System.out.println(amt + " sisa");
//        return null;
    }

   @Test
   public void display() {

        System.out.println(a + "no akun " + n + " nama " + amt);


    }

    @Test
    public void checkBalance() {

        System.out.println("Balance is: " + amt);
    }
}



