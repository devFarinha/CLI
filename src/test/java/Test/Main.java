package Test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main
{

    public static void main(String[] args)
    {
        Result test = JUnitCore.runClasses(Test.class);
        for (Failure failure : test.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}
