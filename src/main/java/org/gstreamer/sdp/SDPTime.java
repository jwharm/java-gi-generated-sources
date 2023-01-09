package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The contents of the SDP "t=" field which specify the start and stop times for
 * a conference session.
 */
public class SDPTime extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstSDPTime";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("start"),
            Interop.valueLayout.ADDRESS.withName("stop"),
            Interop.valueLayout.ADDRESS.withName("repeat")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SDPTime}
     * @return A new, uninitialized @{link SDPTime}
     */
    public static SDPTime allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SDPTime newInstance = new SDPTime(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code start}
     * @return The value of the field {@code start}
     */
    public java.lang.String getStart() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code start}
     * @param start The new value of the field {@code start}
     */
    public void setStart(java.lang.String start) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (start == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(start, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code stop}
     * @return The value of the field {@code stop}
     */
    public java.lang.String getStop() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code stop}
     * @param stop The new value of the field {@code stop}
     */
    public void setStop(java.lang.String stop) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stop == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(stop, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code repeat}
     * @return The value of the field {@code repeat}
     */
    public PointerAddress getRepeat() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("repeat"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerAddress(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code repeat}
     * @param repeat The new value of the field {@code repeat}
     */
    public void setRepeat(java.lang.foreign.MemoryAddress[] repeat) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("repeat"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (repeat == null ? MemoryAddress.NULL : Interop.allocateNativeArray(repeat, false, SCOPE)));
        }
    }
    
    /**
     * Create a SDPTime proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SDPTime(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SDPTime> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SDPTime(input);
    
    /**
     * Reset the time information in {@code t}.
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult clear() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_time_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Set time information {@code start}, {@code stop} and {@code repeat} in {@code t}.
     * @param start the start time
     * @param stop the stop time
     * @param repeat the repeat times
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult set(java.lang.String start, java.lang.String stop, java.lang.String[] repeat) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_sdp_time_set.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(start, SCOPE),
                        Marshal.stringToAddress.marshal(stop, SCOPE),
                        Interop.allocateNativeArray(repeat, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.sdp.SDPResult.of(RESULT);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_sdp_time_clear = Interop.downcallHandle(
                "gst_sdp_time_clear",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_time_set = Interop.downcallHandle(
                "gst_sdp_time_set",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link SDPTime.Builder} object constructs a {@link SDPTime} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SDPTime.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SDPTime struct;
        
        private Builder() {
            struct = SDPTime.allocate();
        }
        
        /**
         * Finish building the {@link SDPTime} struct.
         * @return A new instance of {@code SDPTime} with the fields 
         *         that were set in the Builder object.
         */
        public SDPTime build() {
            return struct;
        }
        
        /**
         * start time for the conference. The value is the decimal
         *     representation of Network Time Protocol (NTP) time values in seconds
         * @param start The value for the {@code start} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStart(java.lang.String start) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("start"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (start == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(start, SCOPE)));
                return this;
            }
        }
        
        /**
         * stop time for the conference. The value is the decimal
         *     representation of Network Time Protocol (NTP) time values in seconds
         * @param stop The value for the {@code stop} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStop(java.lang.String stop) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stop == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(stop, SCOPE)));
                return this;
            }
        }
        
        /**
         * repeat times for a session
         * @param repeat The value for the {@code repeat} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRepeat(java.lang.foreign.MemoryAddress[] repeat) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("repeat"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (repeat == null ? MemoryAddress.NULL : Interop.allocateNativeArray(repeat, false, SCOPE)));
                return this;
            }
        }
    }
}
