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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_SHORT.withName("x"),
            Interop.valueLayout.C_SHORT.withName("y")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoMasteringDisplayInfoCoordinates}
     * @return A new, uninitialized @{link VideoMasteringDisplayInfoCoordinates}
     */
    public static VideoMasteringDisplayInfoCoordinates allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VideoMasteringDisplayInfoCoordinates newInstance = new VideoMasteringDisplayInfoCoordinates(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code x}
     * @return The value of the field {@code x}
     */
    public short getX() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code x}
     * @param x The new value of the field {@code x}
     */
    public void setX(short x) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), x);
        }
    }
    
    /**
     * Get the value of the field {@code y}
     * @return The value of the field {@code y}
     */
    public short getY() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code y}
     * @param y The new value of the field {@code y}
     */
    public void setY(short y) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), y);
        }
    }
    
    /**
     * Create a VideoMasteringDisplayInfoCoordinates proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoMasteringDisplayInfoCoordinates(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoMasteringDisplayInfoCoordinates> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoMasteringDisplayInfoCoordinates(input);
    
    /**
     * A {@link VideoMasteringDisplayInfoCoordinates.Builder} object constructs a {@link VideoMasteringDisplayInfoCoordinates} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoMasteringDisplayInfoCoordinates.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoMasteringDisplayInfoCoordinates struct;
        
        private Builder() {
            struct = VideoMasteringDisplayInfoCoordinates.allocate();
        }
        
        /**
         * Finish building the {@link VideoMasteringDisplayInfoCoordinates} struct.
         * @return A new instance of {@code VideoMasteringDisplayInfoCoordinates} with the fields 
         *         that were set in the Builder object.
         */
        public VideoMasteringDisplayInfoCoordinates build() {
            return struct;
        }
        
        /**
         * the x coordinate of CIE 1931 color space in unit of 0.00002.
         * @param x The value for the {@code x} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setX(short x) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("x"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), x);
                return this;
            }
        }
        
        /**
         * the y coordinate of CIE 1931 color space in unit of 0.00002.
         * @param y The value for the {@code y} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setY(short y) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("y"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), y);
                return this;
            }
        }
    }
}
