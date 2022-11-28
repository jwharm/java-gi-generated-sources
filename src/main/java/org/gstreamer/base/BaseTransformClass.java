package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Subclasses can override any of the available virtual methods or not, as
 * needed. At minimum either {@code transform} or {@code transform_ip} need to be overridden.
 * If the element can overwrite the input data with the results (data is of the
 * same type and quantity) it should provide {@code transform_ip}.
 */
public class BaseTransformClass extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBaseTransformClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ElementClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.C_INT.withName("passthrough_on_same_caps"),
        Interop.valueLayout.C_INT.withName("transform_ip_on_passthrough"),
        Interop.valueLayout.ADDRESS.withName("transform_caps"),
        Interop.valueLayout.ADDRESS.withName("fixate_caps"),
        Interop.valueLayout.ADDRESS.withName("accept_caps"),
        Interop.valueLayout.ADDRESS.withName("set_caps"),
        Interop.valueLayout.ADDRESS.withName("query"),
        Interop.valueLayout.ADDRESS.withName("decide_allocation"),
        Interop.valueLayout.ADDRESS.withName("filter_meta"),
        Interop.valueLayout.ADDRESS.withName("propose_allocation"),
        Interop.valueLayout.ADDRESS.withName("transform_size"),
        Interop.valueLayout.ADDRESS.withName("get_unit_size"),
        Interop.valueLayout.ADDRESS.withName("start"),
        Interop.valueLayout.ADDRESS.withName("stop"),
        Interop.valueLayout.ADDRESS.withName("sink_event"),
        Interop.valueLayout.ADDRESS.withName("src_event"),
        Interop.valueLayout.ADDRESS.withName("prepare_output_buffer"),
        Interop.valueLayout.ADDRESS.withName("copy_metadata"),
        Interop.valueLayout.ADDRESS.withName("transform_meta"),
        Interop.valueLayout.ADDRESS.withName("before_transform"),
        Interop.valueLayout.ADDRESS.withName("transform"),
        Interop.valueLayout.ADDRESS.withName("transform_ip"),
        Interop.valueLayout.ADDRESS.withName("submit_input_buffer"),
        Interop.valueLayout.ADDRESS.withName("generate_output"),
        MemoryLayout.sequenceLayout(18, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link BaseTransformClass}
     * @return A new, uninitialized @{link BaseTransformClass}
     */
    public static BaseTransformClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BaseTransformClass newInstance = new BaseTransformClass(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code passthrough_on_same_caps}
     * @return The value of the field {@code passthrough_on_same_caps}
     */
    public boolean passthroughOnSameCaps$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("passthrough_on_same_caps"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code passthrough_on_same_caps}
     * @param passthroughOnSameCaps The new value of the field {@code passthrough_on_same_caps}
     */
    public void passthroughOnSameCaps$set(boolean passthroughOnSameCaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("passthrough_on_same_caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), passthroughOnSameCaps ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code transform_ip_on_passthrough}
     * @return The value of the field {@code transform_ip_on_passthrough}
     */
    public boolean transformIpOnPassthrough$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transform_ip_on_passthrough"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code transform_ip_on_passthrough}
     * @param transformIpOnPassthrough The new value of the field {@code transform_ip_on_passthrough}
     */
    public void transformIpOnPassthrough$set(boolean transformIpOnPassthrough) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transform_ip_on_passthrough"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), transformIpOnPassthrough ? 1 : 0);
    }
    
    /**
     * Create a BaseTransformClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BaseTransformClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private BaseTransformClass struct;
        
         /**
         * A {@link BaseTransformClass.Build} object constructs a {@link BaseTransformClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = BaseTransformClass.allocate();
        }
        
         /**
         * Finish building the {@link BaseTransformClass} struct.
         * @return A new instance of {@code BaseTransformClass} with the fields 
         *         that were set in the Build object.
         */
        public BaseTransformClass construct() {
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
        
        /**
         * If set to {@code true}, passthrough mode will be
         *                            automatically enabled if the caps are the same.
         *                            Set to {@code false} by default.
         * @param passthroughOnSameCaps The value for the {@code passthroughOnSameCaps} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPassthroughOnSameCaps(boolean passthroughOnSameCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("passthrough_on_same_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), passthroughOnSameCaps ? 1 : 0);
            return this;
        }
        
        /**
         * If set to {@code true}, {@code transform_ip} will be called in
         *                           passthrough mode. The passed buffer might not be
         *                           writable. When {@code false}, neither {@code transform} nor
         *                           {@code transform_ip} will be called in passthrough mode.
         *                           Set to {@code true} by default.
         * @param transformIpOnPassthrough The value for the {@code transformIpOnPassthrough} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTransformIpOnPassthrough(boolean transformIpOnPassthrough) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_ip_on_passthrough"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), transformIpOnPassthrough ? 1 : 0);
            return this;
        }
        
        public Build setTransformCaps(java.lang.foreign.MemoryAddress transformCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformCaps == null ? MemoryAddress.NULL : transformCaps));
            return this;
        }
        
        public Build setFixateCaps(java.lang.foreign.MemoryAddress fixateCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fixate_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fixateCaps == null ? MemoryAddress.NULL : fixateCaps));
            return this;
        }
        
        public Build setAcceptCaps(java.lang.foreign.MemoryAddress acceptCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("accept_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acceptCaps == null ? MemoryAddress.NULL : acceptCaps));
            return this;
        }
        
        public Build setSetCaps(java.lang.foreign.MemoryAddress setCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps));
            return this;
        }
        
        public Build setQuery(java.lang.foreign.MemoryAddress query) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query == null ? MemoryAddress.NULL : query));
            return this;
        }
        
        public Build setDecideAllocation(java.lang.foreign.MemoryAddress decideAllocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decide_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decideAllocation == null ? MemoryAddress.NULL : decideAllocation));
            return this;
        }
        
        public Build setFilterMeta(java.lang.foreign.MemoryAddress filterMeta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("filter_meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (filterMeta == null ? MemoryAddress.NULL : filterMeta));
            return this;
        }
        
        public Build setProposeAllocation(java.lang.foreign.MemoryAddress proposeAllocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("propose_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (proposeAllocation == null ? MemoryAddress.NULL : proposeAllocation));
            return this;
        }
        
        public Build setTransformSize(java.lang.foreign.MemoryAddress transformSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformSize == null ? MemoryAddress.NULL : transformSize));
            return this;
        }
        
        public Build setGetUnitSize(java.lang.foreign.MemoryAddress getUnitSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_unit_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getUnitSize == null ? MemoryAddress.NULL : getUnitSize));
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
        
        public Build setSinkEvent(java.lang.foreign.MemoryAddress sinkEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sink_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkEvent == null ? MemoryAddress.NULL : sinkEvent));
            return this;
        }
        
        public Build setSrcEvent(java.lang.foreign.MemoryAddress srcEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("src_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcEvent == null ? MemoryAddress.NULL : srcEvent));
            return this;
        }
        
        public Build setPrepareOutputBuffer(java.lang.foreign.MemoryAddress prepareOutputBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare_output_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepareOutputBuffer == null ? MemoryAddress.NULL : prepareOutputBuffer));
            return this;
        }
        
        public Build setCopyMetadata(java.lang.foreign.MemoryAddress copyMetadata) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_metadata"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copyMetadata == null ? MemoryAddress.NULL : copyMetadata));
            return this;
        }
        
        public Build setTransformMeta(java.lang.foreign.MemoryAddress transformMeta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformMeta == null ? MemoryAddress.NULL : transformMeta));
            return this;
        }
        
        public Build setBeforeTransform(java.lang.foreign.MemoryAddress beforeTransform) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("before_transform"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (beforeTransform == null ? MemoryAddress.NULL : beforeTransform));
            return this;
        }
        
        public Build setTransform(java.lang.foreign.MemoryAddress transform) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transform == null ? MemoryAddress.NULL : transform));
            return this;
        }
        
        public Build setTransformIp(java.lang.foreign.MemoryAddress transformIp) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_ip"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformIp == null ? MemoryAddress.NULL : transformIp));
            return this;
        }
        
        public Build setSubmitInputBuffer(java.lang.foreign.MemoryAddress submitInputBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("submit_input_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (submitInputBuffer == null ? MemoryAddress.NULL : submitInputBuffer));
            return this;
        }
        
        public Build setGenerateOutput(java.lang.foreign.MemoryAddress generateOutput) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("generate_output"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (generateOutput == null ? MemoryAddress.NULL : generateOutput));
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
