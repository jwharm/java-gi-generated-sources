package org.gstreamer.app;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AppSrcClass extends Struct {
    
    static {
        GstApp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAppSrcClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.BaseSrcClass.getMemoryLayout().withName("basesrc_class"),
        Interop.valueLayout.ADDRESS.withName("need_data"),
        Interop.valueLayout.ADDRESS.withName("enough_data"),
        Interop.valueLayout.ADDRESS.withName("seek_data"),
        Interop.valueLayout.ADDRESS.withName("push_buffer"),
        Interop.valueLayout.ADDRESS.withName("end_of_stream"),
        Interop.valueLayout.ADDRESS.withName("push_sample"),
        Interop.valueLayout.ADDRESS.withName("push_buffer_list"),
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
     * Allocate a new {@link AppSrcClass}
     * @return A new, uninitialized @{link AppSrcClass}
     */
    public static AppSrcClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AppSrcClass newInstance = new AppSrcClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code basesrc_class}
     * @return The value of the field {@code basesrc_class}
     */
    public org.gstreamer.base.BaseSrcClass basesrcClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("basesrc_class"));
        return new org.gstreamer.base.BaseSrcClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a AppSrcClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AppSrcClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AppSrcClass struct;
        
         /**
         * A {@link AppSrcClass.Build} object constructs a {@link AppSrcClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AppSrcClass.allocate();
        }
        
         /**
         * Finish building the {@link AppSrcClass} struct.
         * @return A new instance of {@code AppSrcClass} with the fields 
         *         that were set in the Build object.
         */
        public AppSrcClass construct() {
            return struct;
        }
        
        public Build setBasesrcClass(org.gstreamer.base.BaseSrcClass basesrcClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("basesrc_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (basesrcClass == null ? MemoryAddress.NULL : basesrcClass.handle()));
            return this;
        }
        
        public Build setNeedData(java.lang.foreign.MemoryAddress needData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("need_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (needData == null ? MemoryAddress.NULL : needData));
            return this;
        }
        
        public Build setEnoughData(java.lang.foreign.MemoryAddress enoughData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enough_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enoughData == null ? MemoryAddress.NULL : enoughData));
            return this;
        }
        
        public Build setSeekData(java.lang.foreign.MemoryAddress seekData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seek_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (seekData == null ? MemoryAddress.NULL : seekData));
            return this;
        }
        
        public Build setPushBuffer(java.lang.foreign.MemoryAddress pushBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("push_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pushBuffer == null ? MemoryAddress.NULL : pushBuffer));
            return this;
        }
        
        public Build setEndOfStream(java.lang.foreign.MemoryAddress endOfStream) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_of_stream"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (endOfStream == null ? MemoryAddress.NULL : endOfStream));
            return this;
        }
        
        public Build setPushSample(java.lang.foreign.MemoryAddress pushSample) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("push_sample"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pushSample == null ? MemoryAddress.NULL : pushSample));
            return this;
        }
        
        public Build setPushBufferList(java.lang.foreign.MemoryAddress pushBufferList) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("push_buffer_list"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pushBufferList == null ? MemoryAddress.NULL : pushBufferList));
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
