package com.javatpoint.application1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;

public class ApplicationTest{

@Test(expected=ArithmeticException.class)
public void test(){

Sysout.out.println("Test");
}

@Ignore()
public void ignore(){

Sysout.out.println("ignore");
}



}

