package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Type of callback that is called when an error occurs
 * during node deserialization.
 */
/**
 * Functional interface declaration of the {@code ParseErrorFunc} callback.
 */
@FunctionalInterface
public interface ParseErrorFunc {

    /**
     * Type of callback that is called when an error occurs
     * during node deserialization.
     */
    void run(org.gtk.gsk.ParseLocation start, org.gtk.gsk.ParseLocation end, org.gtk.glib.Error error);
    
    @ApiStatus.Internal default void upcall(MemoryAddress start, MemoryAddress end, MemoryAddress error, MemoryAddress userData) {
        run(org.gtk.gsk.ParseLocation.fromAddress.marshal(start, null), org.gtk.gsk.ParseLocation.fromAddress.marshal(end, null), org.gtk.glib.Error.fromAddress.marshal(error, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ParseErrorFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
