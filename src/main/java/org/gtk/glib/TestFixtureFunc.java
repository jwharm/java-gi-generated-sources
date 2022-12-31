package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type used for functions that operate on test fixtures.  This is
 * used for the fixture setup and teardown functions as well as for the
 * testcases themselves.
 * <p>
 * {@code user_data} is a pointer to the data that was given when registering
 * the test case.
 * <p>
 * {@code fixture} will be a pointer to the area of memory allocated by the
 * test framework, of the size requested.  If the requested size was
 * zero then {@code fixture} will be equal to {@code user_data}.
 * @version 2.28
 */
@FunctionalInterface
public interface TestFixtureFunc {
    void run(java.lang.foreign.MemoryAddress fixture);

    @ApiStatus.Internal default void upcall(MemoryAddress fixture, MemoryAddress userData) {
        run(fixture);
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TestFixtureFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
