package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A time indication.
 */
public class RTSPTime extends Struct {
    
    static {
        GstRtsp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPTime";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.C_DOUBLE.withName("seconds")
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
     * Allocate a new {@link RTSPTime}
     * @return A new, uninitialized @{link RTSPTime}
     */
    public static RTSPTime allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTSPTime newInstance = new RTSPTime(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gstreamer.rtsp.RTSPTimeType type$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.rtsp.RTSPTimeType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void type$set(org.gstreamer.rtsp.RTSPTimeType type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), type.getValue());
    }
    
    /**
     * Get the value of the field {@code seconds}
     * @return The value of the field {@code seconds}
     */
    public double seconds$get() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("seconds"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code seconds}
     * @param seconds The new value of the field {@code seconds}
     */
    public void seconds$set(double seconds) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("seconds"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), seconds);
    }
    
    /**
     * Create a RTSPTime proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RTSPTime(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private RTSPTime struct;
        
         /**
         * A {@link RTSPTime.Build} object constructs a {@link RTSPTime} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = RTSPTime.allocate();
        }
        
         /**
         * Finish building the {@link RTSPTime} struct.
         * @return A new instance of {@code RTSPTime} with the fields 
         *         that were set in the Build object.
         */
        public RTSPTime construct() {
            return struct;
        }
        
        /**
         * the time of the time
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setType(org.gstreamer.rtsp.RTSPTimeType type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
            return this;
        }
        
        /**
         * seconds when {@code type} is GST_RTSP_TIME_SECONDS,
         *           GST_RTSP_TIME_UTC and GST_RTSP_TIME_FRAMES
         * @param seconds The value for the {@code seconds} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSeconds(double seconds) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seconds"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), seconds);
            return this;
        }
    }
}
