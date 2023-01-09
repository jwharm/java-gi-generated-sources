package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure describing the size of a queue.
 */
public class DataQueueSize extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDataQueueSize";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("visible"),
            Interop.valueLayout.C_INT.withName("bytes"),
            Interop.valueLayout.C_LONG.withName("time")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DataQueueSize}
     * @return A new, uninitialized @{link DataQueueSize}
     */
    public static DataQueueSize allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DataQueueSize newInstance = new DataQueueSize(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code visible}
     * @return The value of the field {@code visible}
     */
    public int getVisible() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("visible"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code visible}
     * @param visible The new value of the field {@code visible}
     */
    public void setVisible(int visible) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("visible"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), visible);
        }
    }
    
    /**
     * Get the value of the field {@code bytes}
     * @return The value of the field {@code bytes}
     */
    public int getBytes() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bytes"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code bytes}
     * @param bytes The new value of the field {@code bytes}
     */
    public void setBytes(int bytes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bytes"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), bytes);
        }
    }
    
    /**
     * Get the value of the field {@code time}
     * @return The value of the field {@code time}
     */
    public long getTime() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("time"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code time}
     * @param time The new value of the field {@code time}
     */
    public void setTime(long time) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("time"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), time);
        }
    }
    
    /**
     * Create a DataQueueSize proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DataQueueSize(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DataQueueSize> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DataQueueSize(input);
    
    /**
     * A {@link DataQueueSize.Builder} object constructs a {@link DataQueueSize} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DataQueueSize.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DataQueueSize struct;
        
        private Builder() {
            struct = DataQueueSize.allocate();
        }
        
        /**
         * Finish building the {@link DataQueueSize} struct.
         * @return A new instance of {@code DataQueueSize} with the fields 
         *         that were set in the Builder object.
         */
        public DataQueueSize build() {
            return struct;
        }
        
        /**
         * number of buffers
         * @param visible The value for the {@code visible} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVisible(int visible) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("visible"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), visible);
                return this;
            }
        }
        
        /**
         * number of bytes
         * @param bytes The value for the {@code bytes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBytes(int bytes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("bytes"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), bytes);
                return this;
            }
        }
        
        /**
         * amount of time
         * @param time The value for the {@code time} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTime(long time) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("time"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), time);
                return this;
            }
        }
    }
}
