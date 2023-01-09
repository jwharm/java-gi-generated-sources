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
/**
 * Functional interface declaration of the {@code BufferForeachMetaFunc} callback.
 */
@FunctionalInterface
public interface BufferForeachMetaFunc {

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
    boolean run(org.gstreamer.gst.Buffer buffer, @Nullable Out<org.gstreamer.gst.Meta> meta);
    
    @ApiStatus.Internal default int upcall(MemoryAddress buffer, MemoryAddress meta, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            Out<org.gstreamer.gst.Meta> metaOUT = new Out<>(org.gstreamer.gst.Meta.fromAddress.marshal(meta, null));
            var RESULT = run(org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, null), metaOUT);
            meta.set(Interop.valueLayout.ADDRESS, 0, metaOUT.get().handle());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), BufferForeachMetaFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
