package Classes;

import org.testng.annotations.*;

public class Annotation {

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Before Method");
    }

    @Test
    public void beforeSuite(){
        System.out.println("Before Test");
    }


}
