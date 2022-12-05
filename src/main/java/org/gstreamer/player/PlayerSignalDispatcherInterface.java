package org.gstreamer.player;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlayerSignalDispatcherInterface extends Struct {
    
    static {
        GstPlayer.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayerSignalDispatcherInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent_iface"),
        Interop.valueLayout.ADDRESS.withName("dispatch")
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
     * Allocate a new {@link PlayerSignalDispatcherInterface}
     * @return A new, uninitialized @{link PlayerSignalDispatcherInterface}
     */
    public static PlayerSignalDispatcherInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PlayerSignalDispatcherInterface newInstance = new PlayerSignalDispatcherInterface(segment.address(), Ownership.NONE);
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
     * Create a PlayerSignalDispatcherInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PlayerSignalDispatcherInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PlayerSignalDispatcherInterface struct;
        
         /**
         * A {@link PlayerSignalDispatcherInterface.Build} object constructs a {@link PlayerSignalDispatcherInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PlayerSignalDispatcherInterface.allocate();
        }
        
         /**
         * Finish building the {@link PlayerSignalDispatcherInterface} struct.
         * @return A new instance of {@code PlayerSignalDispatcherInterface} with the fields 
         *         that were set in the Build object.
         */
        public PlayerSignalDispatcherInterface construct() {
            return struct;
        }
        
        public Build setParentIface(org.gtk.gobject.TypeInterface parentIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentIface == null ? MemoryAddress.NULL : parentIface.handle()));
            return this;
        }
        
        public Build setDispatch(java.lang.foreign.MemoryAddress dispatch) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dispatch"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dispatch == null ? MemoryAddress.NULL : dispatch));
            return this;
        }
    }
}
