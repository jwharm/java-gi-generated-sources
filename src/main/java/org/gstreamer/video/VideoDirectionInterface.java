package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link VideoDirectionInterface} interface.
 * @version 1.10
 */
public class VideoDirectionInterface extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoDirectionInterface";
    
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
     * Allocate a new {@link VideoDirectionInterface}
     * @return A new, uninitialized @{link VideoDirectionInterface}
     */
    public static VideoDirectionInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoDirectionInterface newInstance = new VideoDirectionInterface(segment.address(), Ownership.NONE);
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
     * Create a VideoDirectionInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoDirectionInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoDirectionInterface struct;
        
         /**
         * A {@link VideoDirectionInterface.Build} object constructs a {@link VideoDirectionInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoDirectionInterface.allocate();
        }
        
         /**
         * Finish building the {@link VideoDirectionInterface} struct.
         * @return A new instance of {@code VideoDirectionInterface} with the fields 
         *         that were set in the Build object.
         */
        public VideoDirectionInterface construct() {
            return struct;
        }
        
        /**
         * parent interface type.
         * @param iface The value for the {@code iface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIface(org.gtk.gobject.TypeInterface iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iface == null ? MemoryAddress.NULL : iface.handle()));
            return this;
        }
    }
}
