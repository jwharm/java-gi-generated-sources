package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TreeDragSourceIface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeDragSourceIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("row_draggable"),
        Interop.valueLayout.ADDRESS.withName("drag_data_get"),
        Interop.valueLayout.ADDRESS.withName("drag_data_delete")
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
     * Allocate a new {@link TreeDragSourceIface}
     * @return A new, uninitialized @{link TreeDragSourceIface}
     */
    public static TreeDragSourceIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TreeDragSourceIface newInstance = new TreeDragSourceIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TreeDragSourceIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TreeDragSourceIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TreeDragSourceIface struct;
        
         /**
         * A {@link TreeDragSourceIface.Build} object constructs a {@link TreeDragSourceIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TreeDragSourceIface.allocate();
        }
        
         /**
         * Finish building the {@link TreeDragSourceIface} struct.
         * @return A new instance of {@code TreeDragSourceIface} with the fields 
         *         that were set in the Build object.
         */
        public TreeDragSourceIface construct() {
            return struct;
        }
        
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
            return this;
        }
        
        public Build setRowDraggable(java.lang.foreign.MemoryAddress row_draggable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_draggable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (row_draggable == null ? MemoryAddress.NULL : row_draggable));
            return this;
        }
        
        public Build setDragDataGet(java.lang.foreign.MemoryAddress drag_data_get) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drag_data_get"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drag_data_get == null ? MemoryAddress.NULL : drag_data_get));
            return this;
        }
        
        public Build setDragDataDelete(java.lang.foreign.MemoryAddress drag_data_delete) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drag_data_delete"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drag_data_delete == null ? MemoryAddress.NULL : drag_data_delete));
            return this;
        }
    }
}
