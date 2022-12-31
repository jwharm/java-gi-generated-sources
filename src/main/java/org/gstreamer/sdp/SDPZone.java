package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The contents of the SDP "z=" field which allows the sender to
 * specify a list of time zone adjustments and offsets from the base
 * time.
 */
public class SDPZone extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstSDPZone";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("time"),
            Interop.valueLayout.ADDRESS.withName("typed_time")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SDPZone}
     * @return A new, uninitialized @{link SDPZone}
     */
    public static SDPZone allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SDPZone newInstance = new SDPZone(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code time}
     * @return The value of the field {@code time}
     */
    public java.lang.String getTime() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code time}
     * @param time The new value of the field {@code time}
     */
    public void setTime(java.lang.String time) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (time == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(time, null)));
    }
    
    /**
     * Get the value of the field {@code typed_time}
     * @return The value of the field {@code typed_time}
     */
    public java.lang.String getTypedTime() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("typed_time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code typed_time}
     * @param typedTime The new value of the field {@code typed_time}
     */
    public void setTypedTime(java.lang.String typedTime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("typed_time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (typedTime == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(typedTime, null)));
    }
    
    /**
     * Create a SDPZone proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SDPZone(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SDPZone> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SDPZone(input, ownership);
    
    /**
     * Reset the zone information in {@code zone}.
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult clear() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_zone_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Set zone information in {@code zone}.
     * @param adjTime the NTP time that a time zone adjustment happens
     * @param typedTime the offset from the time when the session was first scheduled
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult set(java.lang.String adjTime, java.lang.String typedTime) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_zone_set.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(adjTime, null),
                    Marshal.stringToAddress.marshal(typedTime, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_sdp_zone_clear = Interop.downcallHandle(
            "gst_sdp_zone_clear",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_zone_set = Interop.downcallHandle(
            "gst_sdp_zone_set",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link SDPZone.Builder} object constructs a {@link SDPZone} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SDPZone.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SDPZone struct;
        
        private Builder() {
            struct = SDPZone.allocate();
        }
        
         /**
         * Finish building the {@link SDPZone} struct.
         * @return A new instance of {@code SDPZone} with the fields 
         *         that were set in the Builder object.
         */
        public SDPZone build() {
            return struct;
        }
        
        /**
         * the NTP time that a time zone adjustment happens
         * @param time The value for the {@code time} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTime(java.lang.String time) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (time == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(time, null)));
            return this;
        }
        
        /**
         * the offset from the time when the session was first scheduled
         * @param typedTime The value for the {@code typedTime} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTypedTime(java.lang.String typedTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("typed_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (typedTime == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(typedTime, null)));
            return this;
        }
    }
}
