package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used by gst_value_serialize() to obtain a non-binary form of the {@link org.gtk.gobject.Value}.
 * <p>
 * Free-function: g_free
 */
/**
 * Functional interface declaration of the {@code ValueSerializeFunc} callback.
 */
@FunctionalInterface
public interface ValueSerializeFunc {

    /**
     * Used by gst_value_serialize() to obtain a non-binary form of the {@link org.gtk.gobject.Value}.
     * <p>
     * Free-function: g_free
     */
    java.lang.String run(org.gtk.gobject.Value value1);
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress value1) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = run(org.gtk.gobject.Value.fromAddress.marshal(value1, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ValueSerializeFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
