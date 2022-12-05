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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("start"),
        Interop.valueLayout.ADDRESS.withName("stop"),
        Interop.valueLayout.ADDRESS.withName("repeat")
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
     * Allocate a new {@link SDPTime}
     * @return A new, uninitialized @{link SDPTime}
     */
    public static SDPTime allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SDPTime newInstance = new SDPTime(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code start}
     * @return The value of the field {@code start}
     */
    public java.lang.String start$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code start}
     * @param start The new value of the field {@code start}
     */
    public void start$set(java.lang.String start) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(start));
    }
    
    /**
     * Get the value of the field {@code stop}
     * @return The value of the field {@code stop}
     */
    public java.lang.String stop$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stop"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code stop}
     * @param stop The new value of the field {@code stop}
     */
    public void stop$set(java.lang.String stop) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stop"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(stop));
    }
    
    /**
     * Create a SDPTime proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SDPTime(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Reset the time information in {@code t}.
     * @return a {@link SDPResult}.
     */
    public @NotNull org.gstreamer.sdp.SDPResult clear() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_time_clear.invokeExact(
                    handle());
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
    public @NotNull org.gstreamer.sdp.SDPResult set(@NotNull java.lang.String start, @NotNull java.lang.String stop, @NotNull java.lang.String[] repeat) {
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(stop, "Parameter 'stop' must not be null");
        java.util.Objects.requireNonNull(repeat, "Parameter 'repeat' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_time_set.invokeExact(
                    handle(),
                    Interop.allocateNativeString(start),
                    Interop.allocateNativeString(stop),
                    Interop.allocateNativeArray(repeat, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SDPTime struct;
        
         /**
         * A {@link SDPTime.Build} object constructs a {@link SDPTime} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SDPTime.allocate();
        }
        
         /**
         * Finish building the {@link SDPTime} struct.
         * @return A new instance of {@code SDPTime} with the fields 
         *         that were set in the Build object.
         */
        public SDPTime construct() {
            return struct;
        }
        
        /**
         * start time for the conference. The value is the decimal
         *     representation of Network Time Protocol (NTP) time values in seconds
         * @param start The value for the {@code start} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStart(java.lang.String start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start == null ? MemoryAddress.NULL : Interop.allocateNativeString(start)));
            return this;
        }
        
        /**
         * stop time for the conference. The value is the decimal
         *     representation of Network Time Protocol (NTP) time values in seconds
         * @param stop The value for the {@code stop} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStop(java.lang.String stop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop == null ? MemoryAddress.NULL : Interop.allocateNativeString(stop)));
            return this;
        }
        
        /**
         * repeat times for a session
         * @param repeat The value for the {@code repeat} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRepeat(java.lang.foreign.MemoryAddress[] repeat) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("repeat"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (repeat == null ? MemoryAddress.NULL : Interop.allocateNativeArray(repeat, false)));
            return this;
        }
    }
}
