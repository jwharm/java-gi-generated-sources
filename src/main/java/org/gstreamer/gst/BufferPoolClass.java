package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link BufferPool} class.
 */
public class BufferPoolClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBufferPoolClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("object_class"),
        Interop.valueLayout.ADDRESS.withName("get_options"),
        Interop.valueLayout.ADDRESS.withName("set_config"),
        Interop.valueLayout.ADDRESS.withName("start"),
        Interop.valueLayout.ADDRESS.withName("stop"),
        Interop.valueLayout.ADDRESS.withName("acquire_buffer"),
        Interop.valueLayout.ADDRESS.withName("alloc_buffer"),
        Interop.valueLayout.ADDRESS.withName("reset_buffer"),
        Interop.valueLayout.ADDRESS.withName("release_buffer"),
        Interop.valueLayout.ADDRESS.withName("free_buffer"),
        Interop.valueLayout.ADDRESS.withName("flush_start"),
        Interop.valueLayout.ADDRESS.withName("flush_stop"),
        MemoryLayout.sequenceLayout(2, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link BufferPoolClass}
     * @return A new, uninitialized @{link BufferPoolClass}
     */
    public static BufferPoolClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BufferPoolClass newInstance = new BufferPoolClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code object_class}
     * @return The value of the field {@code object_class}
     */
    public org.gstreamer.gst.ObjectClass objectClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("object_class"));
        return new org.gstreamer.gst.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a BufferPoolClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BufferPoolClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private BufferPoolClass struct;
        
         /**
         * A {@link BufferPoolClass.Build} object constructs a {@link BufferPoolClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = BufferPoolClass.allocate();
        }
        
         /**
         * Finish building the {@link BufferPoolClass} struct.
         * @return A new instance of {@code BufferPoolClass} with the fields 
         *         that were set in the Build object.
         */
        public BufferPoolClass construct() {
            return struct;
        }
        
        /**
         * Object parent class
         * @param objectClass The value for the {@code objectClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setObjectClass(org.gstreamer.gst.ObjectClass objectClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("object_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (objectClass == null ? MemoryAddress.NULL : objectClass.handle()));
            return this;
        }
        
        public Build setGetOptions(java.lang.foreign.MemoryAddress getOptions) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_options"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getOptions == null ? MemoryAddress.NULL : getOptions));
            return this;
        }
        
        public Build setSetConfig(java.lang.foreign.MemoryAddress setConfig) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_config"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setConfig == null ? MemoryAddress.NULL : setConfig));
            return this;
        }
        
        public Build setStart(java.lang.foreign.MemoryAddress start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start == null ? MemoryAddress.NULL : start));
            return this;
        }
        
        public Build setStop(java.lang.foreign.MemoryAddress stop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop == null ? MemoryAddress.NULL : stop));
            return this;
        }
        
        public Build setAcquireBuffer(java.lang.foreign.MemoryAddress acquireBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("acquire_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acquireBuffer == null ? MemoryAddress.NULL : acquireBuffer));
            return this;
        }
        
        public Build setAllocBuffer(java.lang.foreign.MemoryAddress allocBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (allocBuffer == null ? MemoryAddress.NULL : allocBuffer));
            return this;
        }
        
        public Build setResetBuffer(java.lang.foreign.MemoryAddress resetBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reset_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (resetBuffer == null ? MemoryAddress.NULL : resetBuffer));
            return this;
        }
        
        public Build setReleaseBuffer(java.lang.foreign.MemoryAddress releaseBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("release_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (releaseBuffer == null ? MemoryAddress.NULL : releaseBuffer));
            return this;
        }
        
        public Build setFreeBuffer(java.lang.foreign.MemoryAddress freeBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (freeBuffer == null ? MemoryAddress.NULL : freeBuffer));
            return this;
        }
        
        public Build setFlushStart(java.lang.foreign.MemoryAddress flushStart) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flushStart == null ? MemoryAddress.NULL : flushStart));
            return this;
        }
        
        public Build setFlushStop(java.lang.foreign.MemoryAddress flushStop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush_stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flushStop == null ? MemoryAddress.NULL : flushStop));
            return this;
        }
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
