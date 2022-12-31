package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called in gst_structure_map_in_place(). The function
 * may modify {@code value}.
 */
@FunctionalInterface
public interface StructureMapFunc {
    boolean run(org.gtk.glib.Quark fieldId, org.gtk.gobject.Value value);

    @ApiStatus.Internal default int upcall(int fieldId, MemoryAddress value, MemoryAddress userData) {
        var RESULT = run(new org.gtk.glib.Quark(fieldId), org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StructureMapFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
