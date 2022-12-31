package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called from gst_buffer_foreach_meta(). The {@code meta}
 * field will point to a the reference of the meta.
 * <p>
 * {@code buffer} should not be modified from this callback.
 * <p>
 * When this function returns {@code true}, the next meta will be
 * returned. When {@code false} is returned, gst_buffer_foreach_meta() will return.
 * <p>
 * When {@code meta} is set to {@code null}, the item will be removed from the buffer.
 */
@FunctionalInterface
public interface BufferForeachMetaFunc {
    boolean run(org.gstreamer.gst.Buffer buffer, @Nullable Out<org.gstreamer.gst.Meta> meta);

    @ApiStatus.Internal default int upcall(MemoryAddress buffer, MemoryAddress meta, MemoryAddress userData) {
        Out<org.gstreamer.gst.Meta> metaOUT = new Out<>(org.gstreamer.gst.Meta.fromAddress.marshal(meta, Ownership.FULL));
        var RESULT = run(org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE), metaOUT);
        meta.set(Interop.valueLayout.ADDRESS, 0, metaOUT.get().handle());
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(BufferForeachMetaFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
