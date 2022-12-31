package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used by gst_value_deserialize_with_pspec() to parse a non-binary form into the {@link org.gtk.gobject.Value}.
 * @version 1.20
 */
@FunctionalInterface
public interface ValueDeserializeWithPSpecFunc {
    boolean run(org.gtk.gobject.Value dest, java.lang.String s, org.gtk.gobject.ParamSpec pspec);

    @ApiStatus.Internal default int upcall(MemoryAddress dest, MemoryAddress s, MemoryAddress pspec) {
        var RESULT = run(org.gtk.gobject.Value.fromAddress.marshal(dest, Ownership.NONE), Marshal.addressToString.marshal(s, null), (org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pspec)), org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ValueDeserializeWithPSpecFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
