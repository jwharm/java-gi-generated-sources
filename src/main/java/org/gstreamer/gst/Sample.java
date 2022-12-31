package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link Sample} is a small object containing data, a type, timing and
 * extra arbitrary information.
 */
public class Sample extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstSample";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Sample}
     * @return A new, uninitialized @{link Sample}
     */
    public static Sample allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Sample newInstance = new Sample(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Sample proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Sample(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Sample> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Sample(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable org.gstreamer.gst.Buffer buffer, @Nullable org.gstreamer.gst.Caps caps, @Nullable org.gstreamer.gst.Segment segment, @Nullable org.gstreamer.gst.Structure info) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sample_new.invokeExact(
                    (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()),
                    (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()),
                    (Addressable) (segment == null ? MemoryAddress.NULL : segment.handle()),
                    (Addressable) (info == null ? MemoryAddress.NULL : info.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        info.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Create a new {@link Sample} with the provided details.
     * <p>
     * Free-function: gst_sample_unref
     * @param buffer a {@link Buffer}, or {@code null}
     * @param caps a {@link Caps}, or {@code null}
     * @param segment a {@link Segment}, or {@code null}
     * @param info a {@link Structure}, or {@code null}
     */
    public Sample(@Nullable org.gstreamer.gst.Buffer buffer, @Nullable org.gstreamer.gst.Caps caps, @Nullable org.gstreamer.gst.Segment segment, @Nullable org.gstreamer.gst.Structure info) {
        super(constructNew(buffer, caps, segment, info), Ownership.FULL);
    }
    
    /**
     * Get the buffer associated with {@code sample}
     * @return the buffer of {@code sample} or {@code null}
     *  when there is no buffer. The buffer remains valid as long as
     *  {@code sample} is valid.  If you need to hold on to it for longer than
     *  that, take a ref to the buffer with gst_buffer_ref().
     */
    public @Nullable org.gstreamer.gst.Buffer getBuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sample_get_buffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the buffer list associated with {@code sample}
     * @return the buffer list of {@code sample} or {@code null}
     *  when there is no buffer list. The buffer list remains valid as long as
     *  {@code sample} is valid.  If you need to hold on to it for longer than
     *  that, take a ref to the buffer list with gst_mini_object_ref ().
     */
    public @Nullable org.gstreamer.gst.BufferList getBufferList() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sample_get_buffer_list.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.BufferList.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the caps associated with {@code sample}
     * @return the caps of {@code sample} or {@code null}
     *  when there is no caps. The caps remain valid as long as {@code sample} is
     *  valid.  If you need to hold on to the caps for longer than that,
     *  take a ref to the caps with gst_caps_ref().
     */
    public @Nullable org.gstreamer.gst.Caps getCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sample_get_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get extra information associated with {@code sample}.
     * @return the extra info of {@code sample}.
     *  The info remains valid as long as {@code sample} is valid.
     */
    public @Nullable org.gstreamer.gst.Structure getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sample_get_info.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the segment associated with {@code sample}
     * @return the segment of {@code sample}.
     *  The segment remains valid as long as {@code sample} is valid.
     */
    public org.gstreamer.gst.Segment getSegment() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sample_get_segment.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Segment.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Set the buffer associated with {@code sample}. {@code sample} must be writable.
     * @param buffer A {@link Buffer}
     */
    public void setBuffer(org.gstreamer.gst.Buffer buffer) {
        try {
            DowncallHandles.gst_sample_set_buffer.invokeExact(
                    handle(),
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the buffer list associated with {@code sample}. {@code sample} must be writable.
     * @param bufferList a {@link BufferList}
     */
    public void setBufferList(org.gstreamer.gst.BufferList bufferList) {
        try {
            DowncallHandles.gst_sample_set_buffer_list.invokeExact(
                    handle(),
                    bufferList.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the caps associated with {@code sample}. {@code sample} must be writable.
     * @param caps A {@link Caps}
     */
    public void setCaps(org.gstreamer.gst.Caps caps) {
        try {
            DowncallHandles.gst_sample_set_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the info structure associated with {@code sample}. {@code sample} must be writable,
     * and {@code info} must not have a parent set already.
     * @param info A {@link Structure}
     */
    public boolean setInfo(org.gstreamer.gst.Structure info) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sample_set_info.invokeExact(
                    handle(),
                    info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        info.yieldOwnership();
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Set the segment associated with {@code sample}. {@code sample} must be writable.
     * @param segment A {@link Segment}
     */
    public void setSegment(org.gstreamer.gst.Segment segment) {
        try {
            DowncallHandles.gst_sample_set_segment.invokeExact(
                    handle(),
                    segment.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_sample_new = Interop.downcallHandle(
            "gst_sample_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sample_get_buffer = Interop.downcallHandle(
            "gst_sample_get_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sample_get_buffer_list = Interop.downcallHandle(
            "gst_sample_get_buffer_list",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sample_get_caps = Interop.downcallHandle(
            "gst_sample_get_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sample_get_info = Interop.downcallHandle(
            "gst_sample_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sample_get_segment = Interop.downcallHandle(
            "gst_sample_get_segment",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sample_set_buffer = Interop.downcallHandle(
            "gst_sample_set_buffer",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sample_set_buffer_list = Interop.downcallHandle(
            "gst_sample_set_buffer_list",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sample_set_caps = Interop.downcallHandle(
            "gst_sample_set_caps",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sample_set_info = Interop.downcallHandle(
            "gst_sample_set_info",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sample_set_segment = Interop.downcallHandle(
            "gst_sample_set_segment",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
