package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This function will be called by gst_type_find_helper_get_range() when
 * typefinding functions request to peek at the data of a stream at certain
 * offsets. If this function returns GST_FLOW_OK, the result buffer will be
 * stored in {@code buffer}. The  contents of {@code buffer} is invalid for any other
 * return value.
 * <p>
 * This function is supposed to behave exactly like a {@link org.gstreamer.gst.PadGetRangeFunction}.
 */
/**
 * Functional interface declaration of the {@code TypeFindHelperGetRangeFunction} callback.
 */
@FunctionalInterface
public interface TypeFindHelperGetRangeFunction {

    /**
     * This function will be called by gst_type_find_helper_get_range() when
     * typefinding functions request to peek at the data of a stream at certain
     * offsets. If this function returns GST_FLOW_OK, the result buffer will be
     * stored in {@code buffer}. The  contents of {@code buffer} is invalid for any other
     * return value.
     * <p>
     * This function is supposed to behave exactly like a {@link org.gstreamer.gst.PadGetRangeFunction}.
     */
    org.gstreamer.gst.FlowReturn run(org.gstreamer.gst.GstObject obj, @Nullable org.gstreamer.gst.GstObject parent, long offset, int length, Out<org.gstreamer.gst.Buffer> buffer);
    
    @ApiStatus.Internal default int upcall(MemoryAddress obj, MemoryAddress parent, long offset, int length, MemoryAddress buffer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            Out<org.gstreamer.gst.Buffer> bufferOUT = new Out<>(org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, null));
            var RESULT = run((org.gstreamer.gst.GstObject) Interop.register(obj, org.gstreamer.gst.GstObject.fromAddress).marshal(obj, null), (org.gstreamer.gst.GstObject) Interop.register(parent, org.gstreamer.gst.GstObject.fromAddress).marshal(parent, null), offset, length, bufferOUT);
            buffer.set(Interop.valueLayout.ADDRESS, 0, bufferOUT.get().handle());
            return RESULT.getValue();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TypeFindHelperGetRangeFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
