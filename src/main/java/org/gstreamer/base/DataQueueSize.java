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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("visible"),
        Interop.valueLayout.C_INT.withName("bytes"),
        Interop.valueLayout.C_LONG.withName("time")
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
     * Allocate a new {@link DataQueueSize}
     * @return A new, uninitialized @{link DataQueueSize}
     */
    public static DataQueueSize allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DataQueueSize newInstance = new DataQueueSize(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code visible}
     * @return The value of the field {@code visible}
     */
    public int visible$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("visible"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code visible}
     * @param visible The new value of the field {@code visible}
     */
    public void visible$set(int visible) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("visible"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), visible);
    }
    
    /**
     * Get the value of the field {@code bytes}
     * @return The value of the field {@code bytes}
     */
    public int bytes$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bytes"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bytes}
     * @param bytes The new value of the field {@code bytes}
     */
    public void bytes$set(int bytes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bytes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), bytes);
    }
    
    /**
     * Get the value of the field {@code time}
     * @return The value of the field {@code time}
     */
    public long time$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code time}
     * @param time The new value of the field {@code time}
     */
    public void time$set(long time) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), time);
    }
    
    /**
     * Create a DataQueueSize proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DataQueueSize(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DataQueueSize struct;
        
         /**
         * A {@link DataQueueSize.Build} object constructs a {@link DataQueueSize} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DataQueueSize.allocate();
        }
        
         /**
         * Finish building the {@link DataQueueSize} struct.
         * @return A new instance of {@code DataQueueSize} with the fields 
         *         that were set in the Build object.
         */
        public DataQueueSize construct() {
            return struct;
        }
        
        /**
         * number of buffers
         * @param visible The value for the {@code visible} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setVisible(int visible) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("visible"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), visible);
            return this;
        }
        
        /**
         * number of bytes
         * @param bytes The value for the {@code bytes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBytes(int bytes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bytes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bytes);
            return this;
        }
        
        /**
         * amount of time
         * @param time The value for the {@code time} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTime(long time) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), time);
            return this;
        }
    }
}
