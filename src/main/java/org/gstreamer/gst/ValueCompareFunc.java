package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used together with gst_value_compare() to compare {@link org.gtk.gobject.Value} items.
 */
/**
 * Functional interface declaration of the {@code ValueCompareFunc} callback.
 */
@FunctionalInterface
public interface ValueCompareFunc {

    /**
     * Used together with gst_value_compare() to compare {@link org.gtk.gobject.Value} items.
     */
    int run(org.gtk.gobject.Value value1, org.gtk.gobject.Value value2);
    
    @ApiStatus.Internal default int upcall(MemoryAddress value1, MemoryAddress value2) {
        var RESULT = run(org.gtk.gobject.Value.fromAddress.marshal(value1, null), org.gtk.gobject.Value.fromAddress.marshal(value2, null));
        return RESULT;
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ValueCompareFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
