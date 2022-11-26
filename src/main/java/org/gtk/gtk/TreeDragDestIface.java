package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TreeDragDestIface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeDragDestIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("drag_data_received"),
        Interop.valueLayout.ADDRESS.withName("row_drop_possible")
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
     * Allocate a new {@link TreeDragDestIface}
     * @return A new, uninitialized @{link TreeDragDestIface}
     */
    public static TreeDragDestIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TreeDragDestIface newInstance = new TreeDragDestIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TreeDragDestIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TreeDragDestIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TreeDragDestIface struct;
        
         /**
         * A {@link TreeDragDestIface.Build} object constructs a {@link TreeDragDestIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TreeDragDestIface.allocate();
        }
        
         /**
         * Finish building the {@link TreeDragDestIface} struct.
         * @return A new instance of {@code TreeDragDestIface} with the fields 
         *         that were set in the Build object.
         */
        public TreeDragDestIface construct() {
            return struct;
        }
        
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
            return this;
        }
        
        public Build setDragDataReceived(java.lang.foreign.MemoryAddress drag_data_received) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drag_data_received"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drag_data_received == null ? MemoryAddress.NULL : drag_data_received));
            return this;
        }
        
        public Build setRowDropPossible(java.lang.foreign.MemoryAddress row_drop_possible) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_drop_possible"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (row_drop_possible == null ? MemoryAddress.NULL : row_drop_possible));
            return this;
        }
    }
}
