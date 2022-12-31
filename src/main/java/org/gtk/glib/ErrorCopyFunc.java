package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function which is called when an extended
 * error instance is copied. It is passed the pointer to the
 * destination error and source error, and should copy only the fields
 * of the private data from {@code src_error} to {@code dest_error}.
 * <p>
 * Normally, it is better to use G_DEFINE_EXTENDED_ERROR(), as it
 * already takes care of getting the private data from {@code src_error} and
 * {@code dest_error}.
 * @version 2.68
 */
@FunctionalInterface
public interface ErrorCopyFunc {
    void run(org.gtk.glib.Error srcError, org.gtk.glib.Error destError);

    @ApiStatus.Internal default void upcall(MemoryAddress srcError, MemoryAddress destError) {
        run(org.gtk.glib.Error.fromAddress.marshal(srcError, Ownership.NONE), org.gtk.glib.Error.fromAddress.marshal(destError, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ErrorCopyFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
