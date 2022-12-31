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
@FunctionalInterface
public interface ValueSerializeFunc {
    java.lang.String run(org.gtk.gobject.Value value1);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress value1) {
        var RESULT = run(org.gtk.gobject.Value.fromAddress.marshal(value1, Ownership.NONE));
        return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ValueSerializeFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
