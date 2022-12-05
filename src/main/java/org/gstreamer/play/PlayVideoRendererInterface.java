package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlayVideoRendererInterface extends Struct {
    
    static {
        GstPlay.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayVideoRendererInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent_iface"),
        Interop.valueLayout.ADDRESS.withName("create_video_sink")
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
     * Allocate a new {@link PlayVideoRendererInterface}
     * @return A new, uninitialized @{link PlayVideoRendererInterface}
     */
    public static PlayVideoRendererInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PlayVideoRendererInterface newInstance = new PlayVideoRendererInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_iface}
     * @return The value of the field {@code parent_iface}
     */
    public org.gtk.gobject.TypeInterface parentIface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a PlayVideoRendererInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PlayVideoRendererInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PlayVideoRendererInterface struct;
        
         /**
         * A {@link PlayVideoRendererInterface.Build} object constructs a {@link PlayVideoRendererInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PlayVideoRendererInterface.allocate();
        }
        
         /**
         * Finish building the {@link PlayVideoRendererInterface} struct.
         * @return A new instance of {@code PlayVideoRendererInterface} with the fields 
         *         that were set in the Build object.
         */
        public PlayVideoRendererInterface construct() {
            return struct;
        }
        
        public Build setParentIface(org.gtk.gobject.TypeInterface parentIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentIface == null ? MemoryAddress.NULL : parentIface.handle()));
            return this;
        }
        
        public Build setCreateVideoSink(java.lang.foreign.MemoryAddress createVideoSink) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_video_sink"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createVideoSink == null ? MemoryAddress.NULL : createVideoSink));
            return this;
        }
    }
}
