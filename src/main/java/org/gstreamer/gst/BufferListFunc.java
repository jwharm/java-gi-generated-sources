package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called from gst_buffer_list_foreach(). The {@code buffer}
 * field will point to a the reference of the buffer at {@code idx}.
 * <p>
 * When this function returns {@code true}, the next buffer will be
 * returned. When {@code false} is returned, gst_buffer_list_foreach() will return.
 * <p>
 * When {@code buffer} is set to {@code null}, the item will be removed from the bufferlist.
 * When {@code buffer} has been made writable, the new buffer reference can be assigned
 * to {@code buffer}. This function is responsible for unreffing the old buffer when
 * removing or modifying.
 */
@FunctionalInterface
public interface BufferListFunc {
    boolean run(@Nullable Out<org.gstreamer.gst.Buffer> buffer, int idx);

    @ApiStatus.Internal default int upcall(MemoryAddress buffer, int idx, MemoryAddress userData) {
        Out<org.gstreamer.gst.Buffer> bufferOUT = new Out<>(org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.FULL));
        var RESULT = run(bufferOUT, idx);
        buffer.set(Interop.valueLayout.ADDRESS, 0, bufferOUT.get().handle());
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(BufferListFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
