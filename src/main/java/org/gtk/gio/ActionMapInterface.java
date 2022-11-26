package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual function table for {@link ActionMap}.
 * @version 2.32
 */
public class ActionMapInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GActionMapInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("lookup_action"),
        Interop.valueLayout.ADDRESS.withName("add_action"),
        Interop.valueLayout.ADDRESS.withName("remove_action")
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
     * Allocate a new {@link ActionMapInterface}
     * @return A new, uninitialized @{link ActionMapInterface}
     */
    public static ActionMapInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ActionMapInterface newInstance = new ActionMapInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface g_iface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a ActionMapInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ActionMapInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ActionMapInterface struct;
        
         /**
         * A {@link ActionMapInterface.Build} object constructs a {@link ActionMapInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ActionMapInterface.allocate();
        }
        
         /**
         * Finish building the {@link ActionMapInterface} struct.
         * @return A new instance of {@code ActionMapInterface} with the fields 
         *         that were set in the Build object.
         */
        public ActionMapInterface construct() {
            return struct;
        }
        
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
            return this;
        }
        
        public Build setLookupAction(java.lang.foreign.MemoryAddress lookup_action) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookup_action == null ? MemoryAddress.NULL : lookup_action));
            return this;
        }
        
        public Build setAddAction(java.lang.foreign.MemoryAddress add_action) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (add_action == null ? MemoryAddress.NULL : add_action));
            return this;
        }
        
        public Build setRemoveAction(java.lang.foreign.MemoryAddress remove_action) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remove_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (remove_action == null ? MemoryAddress.NULL : remove_action));
            return this;
        }
    }
}
