package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function which is called when an extended
 * error instance is freed. It is passed the error pointer about to be
 * freed, and should free the error's private data fields.
 * <p>
 * Normally, it is better to use G_DEFINE_EXTENDED_ERROR(), as it
 * already takes care of getting the private data from {@code error}.
 * @version 2.68
 */
@FunctionalInterface
public interface ErrorClearFunc {
    void run(org.gtk.glib.Error error);

    @ApiStatus.Internal default void upcall(MemoryAddress error) {
        run(org.gtk.glib.Error.fromAddress.marshal(error, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ErrorClearFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
