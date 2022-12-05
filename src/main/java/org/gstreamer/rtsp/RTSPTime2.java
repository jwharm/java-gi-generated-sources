package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra fields for a time indication.
 * @version 1.2
 */
public class RTSPTime2 extends Struct {
    
    static {
        GstRtsp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPTime2";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_DOUBLE.withName("frames"),
        Interop.valueLayout.C_INT.withName("year"),
        Interop.valueLayout.C_INT.withName("month"),
        Interop.valueLayout.C_INT.withName("day")
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
     * Allocate a new {@link RTSPTime2}
     * @return A new, uninitialized @{link RTSPTime2}
     */
    public static RTSPTime2 allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTSPTime2 newInstance = new RTSPTime2(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code frames}
     * @return The value of the field {@code frames}
     */
    public double frames$get() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frames"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code frames}
     * @param frames The new value of the field {@code frames}
     */
    public void frames$set(double frames) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frames"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), frames);
    }
    
    /**
     * Get the value of the field {@code year}
     * @return The value of the field {@code year}
     */
    public int year$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("year"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code year}
     * @param year The new value of the field {@code year}
     */
    public void year$set(int year) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("year"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), year);
    }
    
    /**
     * Get the value of the field {@code month}
     * @return The value of the field {@code month}
     */
    public int month$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("month"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code month}
     * @param month The new value of the field {@code month}
     */
    public void month$set(int month) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("month"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), month);
    }
    
    /**
     * Get the value of the field {@code day}
     * @return The value of the field {@code day}
     */
    public int day$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("day"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code day}
     * @param day The new value of the field {@code day}
     */
    public void day$set(int day) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("day"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), day);
    }
    
    /**
     * Create a RTSPTime2 proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RTSPTime2(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private RTSPTime2 struct;
        
         /**
         * A {@link RTSPTime2.Build} object constructs a {@link RTSPTime2} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = RTSPTime2.allocate();
        }
        
         /**
         * Finish building the {@link RTSPTime2} struct.
         * @return A new instance of {@code RTSPTime2} with the fields 
         *         that were set in the Build object.
         */
        public RTSPTime2 construct() {
            return struct;
        }
        
        /**
         * frames and subframes when type in GstRTSPTime is
         *          GST_RTSP_TIME_FRAMES
         * @param frames The value for the {@code frames} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFrames(double frames) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("frames"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), frames);
            return this;
        }
        
        /**
         * year when type is GST_RTSP_TIME_UTC
         * @param year The value for the {@code year} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setYear(int year) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("year"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), year);
            return this;
        }
        
        /**
         * month when type is GST_RTSP_TIME_UTC
         * @param month The value for the {@code month} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMonth(int month) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("month"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), month);
            return this;
        }
        
        /**
         * day when type is GST_RTSP_TIME_UTC
         * @param day The value for the {@code day} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDay(int day) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("day"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), day);
            return this;
        }
    }
}
