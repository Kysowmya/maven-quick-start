package com.javatpoint.application1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;

public class ApplicationTest{

@Test()
public void test(){

System.out.println("Test");
}

@Ignore()
public void ignore(){

System.out.println("ignore");
}

@Before
public void before() {
	System.out.println("Before");
}

}
