package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DiscovererClass extends Struct {
    
    static {
        GstPbutils.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDiscovererClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parentclass"),
        Interop.valueLayout.ADDRESS.withName("finished"),
        Interop.valueLayout.ADDRESS.withName("starting"),
        Interop.valueLayout.ADDRESS.withName("discovered"),
        Interop.valueLayout.ADDRESS.withName("source_setup"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
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
     * Allocate a new {@link DiscovererClass}
     * @return A new, uninitialized @{link DiscovererClass}
     */
    public static DiscovererClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DiscovererClass newInstance = new DiscovererClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parentclass}
     * @return The value of the field {@code parentclass}
     */
    public org.gtk.gobject.ObjectClass parentclass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parentclass"));
        return new org.gtk.gobject.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a DiscovererClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DiscovererClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DiscovererClass struct;
        
         /**
         * A {@link DiscovererClass.Build} object constructs a {@link DiscovererClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DiscovererClass.allocate();
        }
        
         /**
         * Finish building the {@link DiscovererClass} struct.
         * @return A new instance of {@code DiscovererClass} with the fields 
         *         that were set in the Build object.
         */
        public DiscovererClass construct() {
            return struct;
        }
        
        public Build setParentclass(org.gtk.gobject.ObjectClass parentclass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parentclass"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentclass == null ? MemoryAddress.NULL : parentclass.handle()));
            return this;
        }
        
        public Build setFinished(java.lang.foreign.MemoryAddress finished) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finished"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finished == null ? MemoryAddress.NULL : finished));
            return this;
        }
        
        public Build setStarting(java.lang.foreign.MemoryAddress starting) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("starting"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (starting == null ? MemoryAddress.NULL : starting));
            return this;
        }
        
        public Build setDiscovered(java.lang.foreign.MemoryAddress discovered) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("discovered"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (discovered == null ? MemoryAddress.NULL : discovered));
            return this;
        }
        
        public Build setSourceSetup(java.lang.foreign.MemoryAddress sourceSetup) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("source_setup"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sourceSetup == null ? MemoryAddress.NULL : sourceSetup));
            return this;
        }
        
        public Build setReserved(java.lang.foreign.MemoryAddress[] Reserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Reserved, false)));
            return this;
        }
    }
}
