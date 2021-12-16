import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestNGAnnotations {

    @BeforeSuite
    public void AD(){
        System.out.println("BeforeSuite");
    }

    @BeforeClass
    public void C(){
        System.out.println("Before class ");
    }

    @BeforeMethod
    public void F(){
        System.out.println("Before Method");
    }

    @BeforeGroups
    public void G(){
        System.out.println("Before Groups");
    }

    @BeforeTest
    public void I(){
        System.out.println("Before Test");
    }

    @Test(invocationCount=7)
    public void A(){
        System.out.println("Test A");
    }

    @Test
    public void B(){
        System.out.println("Test B");
    }

    @AfterGroups
    public void H(){
        System.out.println("After Groups");
    }

    @AfterClass
    public void D(){
        System.out.println("After Class");
    }

    @AfterMethod
    public void E() {
        System.out.println("After Method");
    }

    @AfterSuite
    public void CD(){
        System.out.println("AfterSuite");
    }

    @AfterTest
    public void K(){
        System.out.println("After Test");
    }
}
