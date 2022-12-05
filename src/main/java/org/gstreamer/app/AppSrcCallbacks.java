package org.gstreamer.app;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A set of callbacks that can be installed on the appsrc with
 * gst_app_src_set_callbacks().
 */
public class AppSrcCallbacks extends Struct {
    
    static {
        GstApp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAppSrcCallbacks";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("need_data"),
        Interop.valueLayout.ADDRESS.withName("enough_data"),
        Interop.valueLayout.ADDRESS.withName("seek_data"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link AppSrcCallbacks}
     * @return A new, uninitialized @{link AppSrcCallbacks}
     */
    public static AppSrcCallbacks allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AppSrcCallbacks newInstance = new AppSrcCallbacks(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AppSrcCallbacks proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AppSrcCallbacks(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AppSrcCallbacks struct;
        
         /**
         * A {@link AppSrcCallbacks.Build} object constructs a {@link AppSrcCallbacks} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AppSrcCallbacks.allocate();
        }
        
         /**
         * Finish building the {@link AppSrcCallbacks} struct.
         * @return A new instance of {@code AppSrcCallbacks} with the fields 
         *         that were set in the Build object.
         */
        public AppSrcCallbacks construct() {
            return struct;
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
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
