package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used together with gst_value_compare() to compare {@link org.gtk.gobject.Value} items.
 */
@FunctionalInterface
public interface ValueCompareFunc {
    int run(org.gtk.gobject.Value value1, org.gtk.gobject.Value value2);

    @ApiStatus.Internal default int upcall(MemoryAddress value1, MemoryAddress value2) {
        var RESULT = run(org.gtk.gobject.Value.fromAddress.marshal(value1, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(value2, Ownership.NONE));
        return RESULT;
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ValueCompareFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
