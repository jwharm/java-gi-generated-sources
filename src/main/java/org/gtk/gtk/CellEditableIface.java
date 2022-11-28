package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CellEditableIface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellEditableIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("editing_done"),
        Interop.valueLayout.ADDRESS.withName("remove_widget"),
        Interop.valueLayout.ADDRESS.withName("start_editing")
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
     * Allocate a new {@link CellEditableIface}
     * @return A new, uninitialized @{link CellEditableIface}
     */
    public static CellEditableIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CellEditableIface newInstance = new CellEditableIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a CellEditableIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CellEditableIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private CellEditableIface struct;
        
         /**
         * A {@link CellEditableIface.Build} object constructs a {@link CellEditableIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = CellEditableIface.allocate();
        }
        
         /**
         * Finish building the {@link CellEditableIface} struct.
         * @return A new instance of {@code CellEditableIface} with the fields 
         *         that were set in the Build object.
         */
        public CellEditableIface construct() {
            return struct;
        }
        
        public Build setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Build setEditingDone(java.lang.foreign.MemoryAddress editingDone) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("editing_done"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (editingDone == null ? MemoryAddress.NULL : editingDone));
            return this;
        }
        
        public Build setRemoveWidget(java.lang.foreign.MemoryAddress removeWidget) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remove_widget"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (removeWidget == null ? MemoryAddress.NULL : removeWidget));
            return this;
        }
        
        public Build setStartEditing(java.lang.foreign.MemoryAddress startEditing) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_editing"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startEditing == null ? MemoryAddress.NULL : startEditing));
            return this;
        }
    }
}
