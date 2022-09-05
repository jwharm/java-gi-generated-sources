package org.gtk.glib;

@FunctionalInterface
public interface TestDataFunc {

    /**
     * The type used for test case functions that take an extra pointer
     * argument.
     */
    public void onTestDataFunc(jdk.incubator.foreign.MemoryAddress userData);
}
