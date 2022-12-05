package org.gstreamer.app;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A set of callbacks that can be installed on the appsink with
 * gst_app_sink_set_callbacks().
 */
public class AppSinkCallbacks extends Struct {
    
    static {
        GstApp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAppSinkCallbacks";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("eos"),
        Interop.valueLayout.ADDRESS.withName("new_preroll"),
        Interop.valueLayout.ADDRESS.withName("new_sample"),
        Interop.valueLayout.ADDRESS.withName("new_event"),
        MemoryLayout.sequenceLayout(3, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link AppSinkCallbacks}
     * @return A new, uninitialized @{link AppSinkCallbacks}
     */
    public static AppSinkCallbacks allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AppSinkCallbacks newInstance = new AppSinkCallbacks(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AppSinkCallbacks proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AppSinkCallbacks(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AppSinkCallbacks struct;
        
         /**
         * A {@link AppSinkCallbacks.Build} object constructs a {@link AppSinkCallbacks} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AppSinkCallbacks.allocate();
        }
        
         /**
         * Finish building the {@link AppSinkCallbacks} struct.
         * @return A new instance of {@code AppSinkCallbacks} with the fields 
         *         that were set in the Build object.
         */
        public AppSinkCallbacks construct() {
            return struct;
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
        
        public Build setNewEvent(java.lang.foreign.MemoryAddress newEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("new_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (newEvent == null ? MemoryAddress.NULL : newEvent));
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
