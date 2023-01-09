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
/**
 * Functional interface declaration of the {@code ErrorCopyFunc} callback.
 */
@FunctionalInterface
public interface ErrorCopyFunc {

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
    void run(org.gtk.glib.Error srcError, org.gtk.glib.Error destError);
    
    @ApiStatus.Internal default void upcall(MemoryAddress srcError, MemoryAddress destError) {
        run(org.gtk.glib.Error.fromAddress.marshal(srcError, null), org.gtk.glib.Error.fromAddress.marshal(destError, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ErrorCopyFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
