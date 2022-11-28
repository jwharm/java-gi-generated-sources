package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Subclasses can override any of the available virtual methods or not, as
 * needed. At the minimum, the {@code create} method should be overridden to produce
 * buffers.
 */
public class BaseSrcClass extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBaseSrcClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ElementClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("get_caps"),
        Interop.valueLayout.ADDRESS.withName("negotiate"),
        Interop.valueLayout.ADDRESS.withName("fixate"),
        Interop.valueLayout.ADDRESS.withName("set_caps"),
        Interop.valueLayout.ADDRESS.withName("decide_allocation"),
        Interop.valueLayout.ADDRESS.withName("start"),
        Interop.valueLayout.ADDRESS.withName("stop"),
        Interop.valueLayout.ADDRESS.withName("get_times"),
        Interop.valueLayout.ADDRESS.withName("get_size"),
        Interop.valueLayout.ADDRESS.withName("is_seekable"),
        Interop.valueLayout.ADDRESS.withName("prepare_seek_segment"),
        Interop.valueLayout.ADDRESS.withName("do_seek"),
        Interop.valueLayout.ADDRESS.withName("unlock"),
        Interop.valueLayout.ADDRESS.withName("unlock_stop"),
        Interop.valueLayout.ADDRESS.withName("query"),
        Interop.valueLayout.ADDRESS.withName("event"),
        Interop.valueLayout.ADDRESS.withName("create"),
        Interop.valueLayout.ADDRESS.withName("alloc"),
        Interop.valueLayout.ADDRESS.withName("fill"),
        MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link BaseSrcClass}
     * @return A new, uninitialized @{link BaseSrcClass}
     */
    public static BaseSrcClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BaseSrcClass newInstance = new BaseSrcClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ElementClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.gst.ElementClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a BaseSrcClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BaseSrcClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private BaseSrcClass struct;
        
         /**
         * A {@link BaseSrcClass.Build} object constructs a {@link BaseSrcClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = BaseSrcClass.allocate();
        }
        
         /**
         * Finish building the {@link BaseSrcClass} struct.
         * @return A new instance of {@code BaseSrcClass} with the fields 
         *         that were set in the Build object.
         */
        public BaseSrcClass construct() {
            return struct;
        }
        
        /**
         * Element parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gstreamer.gst.ElementClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setGetCaps(java.lang.foreign.MemoryAddress getCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCaps == null ? MemoryAddress.NULL : getCaps));
            return this;
        }
        
        public Build setNegotiate(java.lang.foreign.MemoryAddress negotiate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("negotiate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (negotiate == null ? MemoryAddress.NULL : negotiate));
            return this;
        }
        
        public Build setFixate(java.lang.foreign.MemoryAddress fixate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fixate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fixate == null ? MemoryAddress.NULL : fixate));
            return this;
        }
        
        public Build setSetCaps(java.lang.foreign.MemoryAddress setCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps));
            return this;
        }
        
        public Build setDecideAllocation(java.lang.foreign.MemoryAddress decideAllocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decide_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decideAllocation == null ? MemoryAddress.NULL : decideAllocation));
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
        
        public Build setGetTimes(java.lang.foreign.MemoryAddress getTimes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_times"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getTimes == null ? MemoryAddress.NULL : getTimes));
            return this;
        }
        
        public Build setGetSize(java.lang.foreign.MemoryAddress getSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSize == null ? MemoryAddress.NULL : getSize));
            return this;
        }
        
        public Build setIsSeekable(java.lang.foreign.MemoryAddress isSeekable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_seekable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isSeekable == null ? MemoryAddress.NULL : isSeekable));
            return this;
        }
        
        public Build setPrepareSeekSegment(java.lang.foreign.MemoryAddress prepareSeekSegment) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare_seek_segment"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepareSeekSegment == null ? MemoryAddress.NULL : prepareSeekSegment));
            return this;
        }
        
        public Build setDoSeek(java.lang.foreign.MemoryAddress doSeek) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("do_seek"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (doSeek == null ? MemoryAddress.NULL : doSeek));
            return this;
        }
        
        public Build setUnlock(java.lang.foreign.MemoryAddress unlock) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unlock"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unlock == null ? MemoryAddress.NULL : unlock));
            return this;
        }
        
        public Build setUnlockStop(java.lang.foreign.MemoryAddress unlockStop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unlock_stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unlockStop == null ? MemoryAddress.NULL : unlockStop));
            return this;
        }
        
        public Build setQuery(java.lang.foreign.MemoryAddress query) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query == null ? MemoryAddress.NULL : query));
            return this;
        }
        
        public Build setEvent(java.lang.foreign.MemoryAddress event) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (event == null ? MemoryAddress.NULL : event));
            return this;
        }
        
        public Build setCreate(java.lang.foreign.MemoryAddress create) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create == null ? MemoryAddress.NULL : create));
            return this;
        }
        
        public Build setAlloc(java.lang.foreign.MemoryAddress alloc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (alloc == null ? MemoryAddress.NULL : alloc));
            return this;
        }
        
        public Build setFill(java.lang.foreign.MemoryAddress fill) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fill"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fill == null ? MemoryAddress.NULL : fill));
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
