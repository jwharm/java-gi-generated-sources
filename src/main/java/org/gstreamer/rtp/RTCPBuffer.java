package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Note: The API in this module is not yet declared stable.
 * <p>
 * The GstRTPCBuffer helper functions makes it easy to parse and create regular
 * {@link org.gstreamer.gst.Buffer} objects that contain compound RTCP packets. These buffers are typically
 * of 'application/x-rtcp' {@link org.gstreamer.gst.Caps}.
 * <p>
 * An RTCP buffer consists of 1 or more {@link RTCPPacket} structures that you can
 * retrieve with gst_rtcp_buffer_get_first_packet(). {@link RTCPPacket} acts as a pointer
 * into the RTCP buffer; you can move to the next packet with
 * gst_rtcp_packet_move_to_next().
 */
public class RTCPBuffer extends Struct {
    
    static {
        GstRtp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTCPBuffer";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("buffer"),
        org.gstreamer.gst.MapInfo.getMemoryLayout().withName("map")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RTCPBuffer}
     * @return A new, uninitialized @{link RTCPBuffer}
     */
    public static RTCPBuffer allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTCPBuffer newInstance = new RTCPBuffer(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code buffer}
     * @return The value of the field {@code buffer}
     */
    public org.gstreamer.gst.Buffer buffer$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code buffer}
     * @param buffer The new value of the field {@code buffer}
     */
    public void buffer$set(org.gstreamer.gst.Buffer buffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), buffer.handle());
    }
    
    /**
     * Get the value of the field {@code map}
     * @return The value of the field {@code map}
     */
    public org.gstreamer.gst.MapInfo map$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("map"));
        return new org.gstreamer.gst.MapInfo(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a RTCPBuffer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RTCPBuffer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Add a new packet of {@code type} to {@code rtcp}. {@code packet} will point to the newly created
     * packet.
     * @param type the {@link RTCPType} of the new packet
     * @param packet pointer to new packet
     * @return {@code true} if the packet could be created. This function returns {@code false}
     * if the max mtu is exceeded for the buffer.
     */
    public boolean addPacket(@NotNull org.gstreamer.rtp.RTCPType type, @NotNull org.gstreamer.rtp.RTCPPacket packet) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(packet, "Parameter 'packet' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_buffer_add_packet.invokeExact(
                    handle(),
                    type.getValue(),
                    packet.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Initialize a new {@link RTCPPacket} pointer that points to the first packet in
     * {@code rtcp}.
     * @param packet a {@link RTCPPacket}
     * @return TRUE if the packet existed in {@code rtcp}.
     */
    public boolean getFirstPacket(@NotNull org.gstreamer.rtp.RTCPPacket packet) {
        java.util.Objects.requireNonNull(packet, "Parameter 'packet' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_buffer_get_first_packet.invokeExact(
                    handle(),
                    packet.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the number of RTCP packets in {@code rtcp}.
     * @return the number of RTCP packets in {@code rtcp}.
     */
    public int getPacketCount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_buffer_get_packet_count.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Finish {@code rtcp} after being constructed. This function is usually called
     * after gst_rtcp_buffer_map() and after adding the RTCP items to the new buffer.
     * <p>
     * The function adjusts the size of {@code rtcp} with the total length of all the
     * added packets.
     */
    public boolean unmap() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_buffer_unmap.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Open {@code buffer} for reading or writing, depending on {@code flags}. The resulting RTCP
     * buffer state is stored in {@code rtcp}.
     * @param buffer a buffer with an RTCP packet
     * @param flags flags for the mapping
     * @param rtcp resulting {@link RTCPBuffer}
     */
    public static boolean map(@NotNull org.gstreamer.gst.Buffer buffer, @NotNull org.gstreamer.gst.MapFlags flags, @NotNull org.gstreamer.rtp.RTCPBuffer rtcp) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(rtcp, "Parameter 'rtcp' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_buffer_map.invokeExact(
                    buffer.handle(),
                    flags.getValue(),
                    rtcp.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Create a new buffer for constructing RTCP packets. The packet will have a
     * maximum size of {@code mtu}.
     * @param mtu the maximum mtu size.
     * @return A newly allocated buffer.
     */
    public static @NotNull org.gstreamer.gst.Buffer new_(int mtu) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtcp_buffer_new.invokeExact(
                    mtu);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new buffer and set the data to a copy of {@code len}
     * bytes of {@code data} and the size to {@code len}. The data will be freed when the buffer
     * is freed.
     * @param data data for the new buffer
     * @param len the length of data
     * @return A newly allocated buffer with a copy of {@code data} and of size {@code len}.
     */
    public static @NotNull org.gstreamer.gst.Buffer newCopyData(@NotNull byte[] data, int len) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtcp_buffer_new_copy_data.invokeExact(
                    Interop.allocateNativeArray(data, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new buffer and set the data and size of the buffer to {@code data} and {@code len}
     * respectively. {@code data} will be freed when the buffer is unreffed, so this
     * function transfers ownership of {@code data} to the new buffer.
     * @param data data for the new buffer
     * @param len the length of data
     * @return A newly allocated buffer with {@code data} and of size {@code len}.
     */
    public static @NotNull org.gstreamer.gst.Buffer newTakeData(@NotNull byte[] data, int len) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtcp_buffer_new_take_data.invokeExact(
                    Interop.allocateNativeArray(data, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Check if the data pointed to by {@code buffer} is a valid RTCP packet using
     * gst_rtcp_buffer_validate_data().
     * @param buffer the buffer to validate
     * @return TRUE if {@code buffer} is a valid RTCP packet.
     */
    public static boolean validate(@NotNull org.gstreamer.gst.Buffer buffer) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_buffer_validate.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Check if the {@code data} and {@code size} point to the data of a valid compound,
     * non-reduced size RTCP packet.
     * Use this function to validate a packet before using the other functions in
     * this module.
     * @param data the data to validate
     * @param len the length of {@code data} to validate
     * @return TRUE if the data points to a valid RTCP packet.
     */
    public static boolean validateData(@NotNull byte[] data, int len) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_buffer_validate_data.invokeExact(
                    Interop.allocateNativeArray(data, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Check if the {@code data} and {@code size} point to the data of a valid RTCP packet.
     * Use this function to validate a packet before using the other functions in
     * this module.
     * <p>
     * This function is updated to support reduced size rtcp packets according to
     * RFC 5506 and will validate full compound RTCP packets as well as reduced
     * size RTCP packets.
     * @param data the data to validate
     * @param len the length of {@code data} to validate
     * @return TRUE if the data points to a valid RTCP packet.
     */
    public static boolean validateDataReduced(@NotNull byte[] data, int len) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_buffer_validate_data_reduced.invokeExact(
                    Interop.allocateNativeArray(data, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Check if the data pointed to by {@code buffer} is a valid RTCP packet using
     * gst_rtcp_buffer_validate_reduced().
     * @param buffer the buffer to validate
     * @return TRUE if {@code buffer} is a valid RTCP packet.
     */
    public static boolean validateReduced(@NotNull org.gstreamer.gst.Buffer buffer) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_buffer_validate_reduced.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_rtcp_buffer_add_packet = Interop.downcallHandle(
            "gst_rtcp_buffer_add_packet",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_buffer_get_first_packet = Interop.downcallHandle(
            "gst_rtcp_buffer_get_first_packet",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_buffer_get_packet_count = Interop.downcallHandle(
            "gst_rtcp_buffer_get_packet_count",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_buffer_unmap = Interop.downcallHandle(
            "gst_rtcp_buffer_unmap",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_buffer_map = Interop.downcallHandle(
            "gst_rtcp_buffer_map",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_buffer_new = Interop.downcallHandle(
            "gst_rtcp_buffer_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtcp_buffer_new_copy_data = Interop.downcallHandle(
            "gst_rtcp_buffer_new_copy_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtcp_buffer_new_take_data = Interop.downcallHandle(
            "gst_rtcp_buffer_new_take_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtcp_buffer_validate = Interop.downcallHandle(
            "gst_rtcp_buffer_validate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_buffer_validate_data = Interop.downcallHandle(
            "gst_rtcp_buffer_validate_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtcp_buffer_validate_data_reduced = Interop.downcallHandle(
            "gst_rtcp_buffer_validate_data_reduced",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtcp_buffer_validate_reduced = Interop.downcallHandle(
            "gst_rtcp_buffer_validate_reduced",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private RTCPBuffer struct;
        
         /**
         * A {@link RTCPBuffer.Build} object constructs a {@link RTCPBuffer} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = RTCPBuffer.allocate();
        }
        
         /**
         * Finish building the {@link RTCPBuffer} struct.
         * @return A new instance of {@code RTCPBuffer} with the fields 
         *         that were set in the Build object.
         */
        public RTCPBuffer construct() {
            return struct;
        }
        
        public Build setBuffer(org.gstreamer.gst.Buffer buffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
            return this;
        }
        
        public Build setMap(org.gstreamer.gst.MapInfo map) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (map == null ? MemoryAddress.NULL : map.handle()));
            return this;
        }
    }
}
