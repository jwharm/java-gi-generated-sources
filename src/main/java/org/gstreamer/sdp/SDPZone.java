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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("time"),
        Interop.valueLayout.ADDRESS.withName("typed_time")
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
    public java.lang.String time$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code time}
     * @param time The new value of the field {@code time}
     */
    public void time$set(java.lang.String time) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(time));
    }
    
    /**
     * Get the value of the field {@code typed_time}
     * @return The value of the field {@code typed_time}
     */
    public java.lang.String typedTime$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("typed_time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code typed_time}
     * @param typedTime The new value of the field {@code typed_time}
     */
    public void typedTime$set(java.lang.String typedTime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("typed_time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(typedTime));
    }
    
    /**
     * Create a SDPZone proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SDPZone(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Reset the zone information in {@code zone}.
     * @return a {@link SDPResult}.
     */
    public @NotNull org.gstreamer.sdp.SDPResult clear() {
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
    public @NotNull org.gstreamer.sdp.SDPResult set(@NotNull java.lang.String adjTime, @NotNull java.lang.String typedTime) {
        java.util.Objects.requireNonNull(adjTime, "Parameter 'adjTime' must not be null");
        java.util.Objects.requireNonNull(typedTime, "Parameter 'typedTime' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_zone_set.invokeExact(
                    handle(),
                    Interop.allocateNativeString(adjTime),
                    Interop.allocateNativeString(typedTime));
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SDPZone struct;
        
         /**
         * A {@link SDPZone.Build} object constructs a {@link SDPZone} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SDPZone.allocate();
        }
        
         /**
         * Finish building the {@link SDPZone} struct.
         * @return A new instance of {@code SDPZone} with the fields 
         *         that were set in the Build object.
         */
        public SDPZone construct() {
            return struct;
        }
        
        /**
         * the NTP time that a time zone adjustment happens
         * @param time The value for the {@code time} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTime(java.lang.String time) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (time == null ? MemoryAddress.NULL : Interop.allocateNativeString(time)));
            return this;
        }
        
        /**
         * the offset from the time when the session was first scheduled
         * @param typedTime The value for the {@code typedTime} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTypedTime(java.lang.String typedTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("typed_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (typedTime == null ? MemoryAddress.NULL : Interop.allocateNativeString(typedTime)));
            return this;
        }
    }
}
