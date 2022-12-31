package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function called for each {@code meta} in {@code buffer} as a result of performing a
 * transformation that yields {@code transbuf}. Additional {@code type} specific transform
 * data is passed to the function as {@code data}.
 * <p>
 * Implementations should check the {@code type} of the transform and parse
 * additional type specific fields in {@code data} that should be used to update
 * the metadata on {@code transbuf}.
 * @version 1.20
 */
@FunctionalInterface
public interface CustomMetaTransformFunction {
    boolean run(org.gstreamer.gst.Buffer transbuf, org.gstreamer.gst.CustomMeta meta, org.gstreamer.gst.Buffer buffer, org.gtk.glib.Quark type);

    @ApiStatus.Internal default int upcall(MemoryAddress transbuf, MemoryAddress meta, MemoryAddress buffer, int type, MemoryAddress data, MemoryAddress userData) {
        var RESULT = run(org.gstreamer.gst.Buffer.fromAddress.marshal(transbuf, Ownership.NONE), org.gstreamer.gst.CustomMeta.fromAddress.marshal(meta, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE), new org.gtk.glib.Quark(type));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CustomMetaTransformFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
