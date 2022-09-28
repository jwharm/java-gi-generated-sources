package org.gtk.glib;

public class TestResult extends io.github.jwharm.javagi.Enumeration {

    public static final TestResult SUCCESS = new TestResult(0);
    
    public static final TestResult SKIPPED = new TestResult(1);
    
    public static final TestResult FAILURE = new TestResult(2);
    
    public static final TestResult INCOMPLETE = new TestResult(3);
    
    public TestResult(int value) {
        super(value);
    }
    
}
