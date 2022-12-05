package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Content extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsContent";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("content_nibble_1"),
        Interop.valueLayout.C_BYTE.withName("content_nibble_2"),
        Interop.valueLayout.C_BYTE.withName("user_byte")
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
     * Allocate a new {@link Content}
     * @return A new, uninitialized @{link Content}
     */
    public static Content allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Content newInstance = new Content(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code content_nibble_1}
     * @return The value of the field {@code content_nibble_1}
     */
    public org.gstreamer.mpegts.ContentNibbleHi contentNibble1$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("content_nibble_1"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.ContentNibbleHi.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code content_nibble_1}
     * @param contentNibble1 The new value of the field {@code content_nibble_1}
     */
    public void contentNibble1$set(org.gstreamer.mpegts.ContentNibbleHi contentNibble1) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("content_nibble_1"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), contentNibble1.getValue());
    }
    
    /**
     * Get the value of the field {@code content_nibble_2}
     * @return The value of the field {@code content_nibble_2}
     */
    public byte contentNibble2$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("content_nibble_2"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code content_nibble_2}
     * @param contentNibble2 The new value of the field {@code content_nibble_2}
     */
    public void contentNibble2$set(byte contentNibble2) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("content_nibble_2"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), contentNibble2);
    }
    
    /**
     * Get the value of the field {@code user_byte}
     * @return The value of the field {@code user_byte}
     */
    public byte userByte$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_byte"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code user_byte}
     * @param userByte The new value of the field {@code user_byte}
     */
    public void userByte$set(byte userByte) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_byte"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), userByte);
    }
    
    /**
     * Create a Content proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Content(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Content struct;
        
         /**
         * A {@link Content.Build} object constructs a {@link Content} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Content.allocate();
        }
        
         /**
         * Finish building the {@link Content} struct.
         * @return A new instance of {@code Content} with the fields 
         *         that were set in the Build object.
         */
        public Content construct() {
            return struct;
        }
        
        public Build setContentNibble1(org.gstreamer.mpegts.ContentNibbleHi contentNibble1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("content_nibble_1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (contentNibble1 == null ? MemoryAddress.NULL : contentNibble1.getValue()));
            return this;
        }
        
        public Build setContentNibble2(byte contentNibble2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("content_nibble_2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), contentNibble2);
            return this;
        }
        
        public Build setUserByte(byte userByte) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_byte"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), userByte);
            return this;
        }
    }
}
