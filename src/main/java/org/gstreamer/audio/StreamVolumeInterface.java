package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class StreamVolumeInterface extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstStreamVolumeInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("iface")
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
     * Allocate a new {@link StreamVolumeInterface}
     * @return A new, uninitialized @{link StreamVolumeInterface}
     */
    public static StreamVolumeInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        StreamVolumeInterface newInstance = new StreamVolumeInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code iface}
     * @return The value of the field {@code iface}
     */
    public org.gtk.gobject.TypeInterface iface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a StreamVolumeInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public StreamVolumeInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private StreamVolumeInterface struct;
        
         /**
         * A {@link StreamVolumeInterface.Build} object constructs a {@link StreamVolumeInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = StreamVolumeInterface.allocate();
        }
        
         /**
         * Finish building the {@link StreamVolumeInterface} struct.
         * @return A new instance of {@code StreamVolumeInterface} with the fields 
         *         that were set in the Build object.
         */
        public StreamVolumeInterface construct() {
            return struct;
        }
        
        public Build setIface(org.gtk.gobject.TypeInterface iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iface == null ? MemoryAddress.NULL : iface.handle()));
            return this;
        }
    }
}
