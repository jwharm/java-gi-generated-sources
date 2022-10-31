package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TestResult extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GTestResult";
    
    public static final TestResult SUCCESS = new TestResult(0);
    
    public static final TestResult SKIPPED = new TestResult(1);
    
    public static final TestResult FAILURE = new TestResult(2);
    
    public static final TestResult INCOMPLETE = new TestResult(3);
    
    public TestResult(int value) {
        super(value);
    }
}
