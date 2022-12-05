package org.gstreamer.player;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlayerVideoRendererInterface extends Struct {
    
    static {
        GstPlayer.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayerVideoRendererInterface";
    
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
     * Allocate a new {@link PlayerVideoRendererInterface}
     * @return A new, uninitialized @{link PlayerVideoRendererInterface}
     */
    public static PlayerVideoRendererInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PlayerVideoRendererInterface newInstance = new PlayerVideoRendererInterface(segment.address(), Ownership.NONE);
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
     * Create a PlayerVideoRendererInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PlayerVideoRendererInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PlayerVideoRendererInterface struct;
        
         /**
         * A {@link PlayerVideoRendererInterface.Build} object constructs a {@link PlayerVideoRendererInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PlayerVideoRendererInterface.allocate();
        }
        
         /**
         * Finish building the {@link PlayerVideoRendererInterface} struct.
         * @return A new instance of {@code PlayerVideoRendererInterface} with the fields 
         *         that were set in the Build object.
         */
        public PlayerVideoRendererInterface construct() {
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
