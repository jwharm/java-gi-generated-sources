package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This function will be called on source pads when a peer element
 * request a buffer at the specified {@code offset} and {@code length}. If this function
 * returns {@code GST_FLOW_OK}, the result buffer will be stored in {@code buffer}. The
 * contents of {@code buffer} is invalid for any other return value.
 * <p>
 * This function is installed on a source pad with
 * gst_pad_set_getrange_function() and can only be called on source pads after
 * they are successfully activated with gst_pad_activate_mode() with the
 * {@code GST_PAD_MODE_PULL}.
 * <p>
 * {@code offset} and {@code length} are always given in byte units. {@code offset} must normally be a value
 * between 0 and the length in bytes of the data available on {@code pad}. The
 * length (duration in bytes) can be retrieved with a {@code GST_QUERY_DURATION} or with a
 * {@code GST_QUERY_SEEKING}.
 * <p>
 * Any {@code offset} larger or equal than the length will make the function return
 * {@code GST_FLOW_EOS}, which corresponds to EOS. In this case {@code buffer} does not
 * contain a valid buffer.
 * <p>
 * The buffer size of {@code buffer} will only be smaller than {@code length} when {@code offset} is
 * near the end of the stream. In all other cases, the size of {@code buffer} must be
 * exactly the requested size.
 * <p>
 * It is allowed to call this function with a 0 {@code length} and valid {@code offset}, in
 * which case {@code buffer} will contain a 0-sized buffer and the function returns
 * {@code GST_FLOW_OK}.
 * <p>
 * When this function is called with a -1 {@code offset}, the sequentially next buffer
 * of length {@code length} in the stream is returned.
 * <p>
 * When this function is called with a -1 {@code length}, a buffer with a default
 * optimal length is returned in {@code buffer}. The length might depend on the value
 * of {@code offset}.
 */
@FunctionalInterface
public interface PadGetRangeFunction {
    org.gstreamer.gst.FlowReturn run(org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.GstObject parent, long offset, int length, PointerProxy<org.gstreamer.gst.Buffer> buffer);

    @ApiStatus.Internal default int upcall(MemoryAddress pad, MemoryAddress parent, long offset, int length, MemoryAddress buffer) {
        var RESULT = run((org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.gst.Pad.fromAddress).marshal(pad, Ownership.NONE), (org.gstreamer.gst.GstObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parent)), org.gstreamer.gst.GstObject.fromAddress).marshal(parent, Ownership.NONE), offset, length, new PointerProxy<org.gstreamer.gst.Buffer>(buffer, org.gstreamer.gst.Buffer.fromAddress));
        return RESULT.getValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PadGetRangeFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
