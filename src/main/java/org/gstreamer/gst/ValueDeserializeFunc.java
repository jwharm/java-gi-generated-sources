package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used by gst_value_deserialize() to parse a non-binary form into the {@link org.gtk.gobject.Value}.
 */
/**
 * Functional interface declaration of the {@code ValueDeserializeFunc} callback.
 */
@FunctionalInterface
public interface ValueDeserializeFunc {

    /**
     * Used by gst_value_deserialize() to parse a non-binary form into the {@link org.gtk.gobject.Value}.
     */
    boolean run(org.gtk.gobject.Value dest, java.lang.String s);
    
    @ApiStatus.Internal default int upcall(MemoryAddress dest, MemoryAddress s) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = run(org.gtk.gobject.Value.fromAddress.marshal(dest, null), Marshal.addressToString.marshal(s, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ValueDeserializeFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
