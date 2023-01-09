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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("content_nibble_1"),
            Interop.valueLayout.C_BYTE.withName("content_nibble_2"),
            Interop.valueLayout.C_BYTE.withName("user_byte")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Content}
     * @return A new, uninitialized @{link Content}
     */
    public static Content allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Content newInstance = new Content(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code content_nibble_1}
     * @return The value of the field {@code content_nibble_1}
     */
    public org.gstreamer.mpegts.ContentNibbleHi getContentNibble1() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("content_nibble_1"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.mpegts.ContentNibbleHi.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code content_nibble_1}
     * @param contentNibble1 The new value of the field {@code content_nibble_1}
     */
    public void setContentNibble1(org.gstreamer.mpegts.ContentNibbleHi contentNibble1) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("content_nibble_1"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (contentNibble1 == null ? MemoryAddress.NULL : contentNibble1.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code content_nibble_2}
     * @return The value of the field {@code content_nibble_2}
     */
    public byte getContentNibble2() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("content_nibble_2"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code content_nibble_2}
     * @param contentNibble2 The new value of the field {@code content_nibble_2}
     */
    public void setContentNibble2(byte contentNibble2) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("content_nibble_2"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), contentNibble2);
        }
    }
    
    /**
     * Get the value of the field {@code user_byte}
     * @return The value of the field {@code user_byte}
     */
    public byte getUserByte() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_byte"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code user_byte}
     * @param userByte The new value of the field {@code user_byte}
     */
    public void setUserByte(byte userByte) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_byte"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), userByte);
        }
    }
    
    /**
     * Create a Content proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Content(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Content> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Content(input);
    
    /**
     * A {@link Content.Builder} object constructs a {@link Content} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Content.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Content struct;
        
        private Builder() {
            struct = Content.allocate();
        }
        
        /**
         * Finish building the {@link Content} struct.
         * @return A new instance of {@code Content} with the fields 
         *         that were set in the Builder object.
         */
        public Content build() {
            return struct;
        }
        
        public Builder setContentNibble1(org.gstreamer.mpegts.ContentNibbleHi contentNibble1) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("content_nibble_1"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (contentNibble1 == null ? MemoryAddress.NULL : contentNibble1.getValue()));
                return this;
            }
        }
        
        public Builder setContentNibble2(byte contentNibble2) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("content_nibble_2"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), contentNibble2);
                return this;
            }
        }
        
        public Builder setUserByte(byte userByte) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("user_byte"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), userByte);
                return this;
            }
        }
    }
}
