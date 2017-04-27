package com.sampletest;
import org.junit.Assert;
import org.junit.Test;

import com.sample.Library;

public class LibraryTest {
    @Test 
    public void testSomeLibraryMethod() {

    	Library lib = new Library();
    	String msg = lib.someLibraryMethod();
    	Assert.assertEquals("Hello Gradle", msg);
    }
}
