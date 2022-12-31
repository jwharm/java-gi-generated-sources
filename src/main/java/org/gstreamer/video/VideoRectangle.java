package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Helper structure representing a rectangular area.
 */
public class VideoRectangle extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoRectangle";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("x"),
            Interop.valueLayout.C_INT.withName("y"),
            Interop.valueLayout.C_INT.withName("w"),
            Interop.valueLayout.C_INT.withName("h")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoRectangle}
     * @return A new, uninitialized @{link VideoRectangle}
     */
    public static VideoRectangle allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoRectangle newInstance = new VideoRectangle(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code x}
     * @return The value of the field {@code x}
     */
    public int getX() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code x}
     * @param x The new value of the field {@code x}
     */
    public void setX(int x) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), x);
    }
    
    /**
     * Get the value of the field {@code y}
     * @return The value of the field {@code y}
     */
    public int getY() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code y}
     * @param y The new value of the field {@code y}
     */
    public void setY(int y) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), y);
    }
    
    /**
     * Get the value of the field {@code w}
     * @return The value of the field {@code w}
     */
    public int getW() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("w"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code w}
     * @param w The new value of the field {@code w}
     */
    public void setW(int w) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("w"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), w);
    }
    
    /**
     * Get the value of the field {@code h}
     * @return The value of the field {@code h}
     */
    public int getH() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("h"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code h}
     * @param h The new value of the field {@code h}
     */
    public void setH(int h) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("h"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), h);
    }
    
    /**
     * Create a VideoRectangle proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VideoRectangle(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoRectangle> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VideoRectangle(input, ownership);
    
    /**
     * A {@link VideoRectangle.Builder} object constructs a {@link VideoRectangle} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoRectangle.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoRectangle struct;
        
        private Builder() {
            struct = VideoRectangle.allocate();
        }
        
         /**
         * Finish building the {@link VideoRectangle} struct.
         * @return A new instance of {@code VideoRectangle} with the fields 
         *         that were set in the Builder object.
         */
        public VideoRectangle build() {
            return struct;
        }
        
        /**
         * X coordinate of rectangle's top-left point
         * @param x The value for the {@code x} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setX(int x) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), x);
            return this;
        }
        
        /**
         * Y coordinate of rectangle's top-left point
         * @param y The value for the {@code y} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setY(int y) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), y);
            return this;
        }
        
        /**
         * width of the rectangle
         * @param w The value for the {@code w} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setW(int w) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("w"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), w);
            return this;
        }
        
        /**
         * height of the rectangle
         * @param h The value for the {@code h} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setH(int h) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("h"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), h);
            return this;
        }
    }
}
