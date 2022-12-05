package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used to represent display_primaries and white_point of
 * {@link VideoMasteringDisplayInfo} struct. See {@link VideoMasteringDisplayInfo}
 * @version 1.18
 */
public class VideoMasteringDisplayInfoCoordinates extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoMasteringDisplayInfoCoordinates";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_SHORT.withName("x"),
        Interop.valueLayout.C_SHORT.withName("y")
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
     * Allocate a new {@link VideoMasteringDisplayInfoCoordinates}
     * @return A new, uninitialized @{link VideoMasteringDisplayInfoCoordinates}
     */
    public static VideoMasteringDisplayInfoCoordinates allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoMasteringDisplayInfoCoordinates newInstance = new VideoMasteringDisplayInfoCoordinates(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code x}
     * @return The value of the field {@code x}
     */
    public short x$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code x}
     * @param x The new value of the field {@code x}
     */
    public void x$set(short x) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), x);
    }
    
    /**
     * Get the value of the field {@code y}
     * @return The value of the field {@code y}
     */
    public short y$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code y}
     * @param y The new value of the field {@code y}
     */
    public void y$set(short y) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), y);
    }
    
    /**
     * Create a VideoMasteringDisplayInfoCoordinates proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoMasteringDisplayInfoCoordinates(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoMasteringDisplayInfoCoordinates struct;
        
         /**
         * A {@link VideoMasteringDisplayInfoCoordinates.Build} object constructs a {@link VideoMasteringDisplayInfoCoordinates} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoMasteringDisplayInfoCoordinates.allocate();
        }
        
         /**
         * Finish building the {@link VideoMasteringDisplayInfoCoordinates} struct.
         * @return A new instance of {@code VideoMasteringDisplayInfoCoordinates} with the fields 
         *         that were set in the Build object.
         */
        public VideoMasteringDisplayInfoCoordinates construct() {
            return struct;
        }
        
        /**
         * the x coordinate of CIE 1931 color space in unit of 0.00002.
         * @param x The value for the {@code x} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setX(short x) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), x);
            return this;
        }
        
        /**
         * the y coordinate of CIE 1931 color space in unit of 0.00002.
         * @param y The value for the {@code y} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setY(short y) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), y);
            return this;
        }
    }
}
