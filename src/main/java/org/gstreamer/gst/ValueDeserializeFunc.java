package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used by gst_value_deserialize() to parse a non-binary form into the {@link org.gtk.gobject.Value}.
 */
@FunctionalInterface
public interface ValueDeserializeFunc {
    boolean run(org.gtk.gobject.Value dest, java.lang.String s);

    @ApiStatus.Internal default int upcall(MemoryAddress dest, MemoryAddress s) {
        var RESULT = run(org.gtk.gobject.Value.fromAddress.marshal(dest, Ownership.NONE), Marshal.addressToString.marshal(s, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ValueDeserializeFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
