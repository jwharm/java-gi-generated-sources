package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual function table for {@link RemoteActionGroup}.
 * @version 2.32
 */
public class RemoteActionGroupInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GRemoteActionGroupInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("activate_action_full"),
        Interop.valueLayout.ADDRESS.withName("change_action_state_full")
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
     * Allocate a new {@link RemoteActionGroupInterface}
     * @return A new, uninitialized @{link RemoteActionGroupInterface}
     */
    public static RemoteActionGroupInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RemoteActionGroupInterface newInstance = new RemoteActionGroupInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface gIface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a RemoteActionGroupInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RemoteActionGroupInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private RemoteActionGroupInterface struct;
        
         /**
         * A {@link RemoteActionGroupInterface.Build} object constructs a {@link RemoteActionGroupInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = RemoteActionGroupInterface.allocate();
        }
        
         /**
         * Finish building the {@link RemoteActionGroupInterface} struct.
         * @return A new instance of {@code RemoteActionGroupInterface} with the fields 
         *         that were set in the Build object.
         */
        public RemoteActionGroupInterface construct() {
            return struct;
        }
        
        public Build setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Build setActivateActionFull(java.lang.foreign.MemoryAddress activateActionFull) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate_action_full"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activateActionFull == null ? MemoryAddress.NULL : activateActionFull));
            return this;
        }
        
        public Build setChangeActionStateFull(java.lang.foreign.MemoryAddress changeActionStateFull) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("change_action_state_full"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changeActionStateFull == null ? MemoryAddress.NULL : changeActionStateFull));
            return this;
        }
    }
}
