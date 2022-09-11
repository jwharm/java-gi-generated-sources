package org.gtk.glib;

/**
 * The type used for functions that operate on test fixtures.  This is
 * used for the fixture setup and teardown functions as well as for the
 * testcases themselves.
 * 
 * @user_data is a pointer to the data that was given when registering
 * the test case.
 * 
 * @fixture will be a pointer to the area of memory allocated by the
 * test framework, of the size requested.  If the requested size was
 * zero then @fixture will be equal to @user_data.
 */
@FunctionalInterface
public interface TestFixtureFunc {
        void onTestFixtureFunc(jdk.incubator.foreign.MemoryAddress fixture);
}
