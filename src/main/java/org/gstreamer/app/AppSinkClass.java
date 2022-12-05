package org.gstreamer.app;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AppSinkClass extends Struct {
    
    static {
        GstApp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAppSinkClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.BaseSinkClass.getMemoryLayout().withName("basesink_class"),
        Interop.valueLayout.ADDRESS.withName("eos"),
        Interop.valueLayout.ADDRESS.withName("new_preroll"),
        Interop.valueLayout.ADDRESS.withName("new_sample"),
        Interop.valueLayout.ADDRESS.withName("pull_preroll"),
        Interop.valueLayout.ADDRESS.withName("pull_sample"),
        Interop.valueLayout.ADDRESS.withName("try_pull_preroll"),
        Interop.valueLayout.ADDRESS.withName("try_pull_sample"),
        Interop.valueLayout.ADDRESS.withName("try_pull_object"),
        MemoryLayout.sequenceLayout(1, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link AppSinkClass}
     * @return A new, uninitialized @{link AppSinkClass}
     */
    public static AppSinkClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AppSinkClass newInstance = new AppSinkClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code basesink_class}
     * @return The value of the field {@code basesink_class}
     */
    public org.gstreamer.base.BaseSinkClass basesinkClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("basesink_class"));
        return new org.gstreamer.base.BaseSinkClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a AppSinkClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AppSinkClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AppSinkClass struct;
        
         /**
         * A {@link AppSinkClass.Build} object constructs a {@link AppSinkClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AppSinkClass.allocate();
        }
        
         /**
         * Finish building the {@link AppSinkClass} struct.
         * @return A new instance of {@code AppSinkClass} with the fields 
         *         that were set in the Build object.
         */
        public AppSinkClass construct() {
            return struct;
        }
        
        public Build setBasesinkClass(org.gstreamer.base.BaseSinkClass basesinkClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("basesink_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (basesinkClass == null ? MemoryAddress.NULL : basesinkClass.handle()));
            return this;
        }
        
        public Build setEos(java.lang.foreign.MemoryAddress eos) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eos"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (eos == null ? MemoryAddress.NULL : eos));
            return this;
        }
        
        public Build setNewPreroll(java.lang.foreign.MemoryAddress newPreroll) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("new_preroll"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (newPreroll == null ? MemoryAddress.NULL : newPreroll));
            return this;
        }
        
        public Build setNewSample(java.lang.foreign.MemoryAddress newSample) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("new_sample"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (newSample == null ? MemoryAddress.NULL : newSample));
            return this;
        }
        
        public Build setPullPreroll(java.lang.foreign.MemoryAddress pullPreroll) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pull_preroll"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pullPreroll == null ? MemoryAddress.NULL : pullPreroll));
            return this;
        }
        
        public Build setPullSample(java.lang.foreign.MemoryAddress pullSample) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pull_sample"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pullSample == null ? MemoryAddress.NULL : pullSample));
            return this;
        }
        
        public Build setTryPullPreroll(java.lang.foreign.MemoryAddress tryPullPreroll) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("try_pull_preroll"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tryPullPreroll == null ? MemoryAddress.NULL : tryPullPreroll));
            return this;
        }
        
        public Build setTryPullSample(java.lang.foreign.MemoryAddress tryPullSample) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("try_pull_sample"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tryPullSample == null ? MemoryAddress.NULL : tryPullSample));
            return this;
        }
        
        public Build setTryPullObject(java.lang.foreign.MemoryAddress tryPullObject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("try_pull_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tryPullObject == null ? MemoryAddress.NULL : tryPullObject));
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
