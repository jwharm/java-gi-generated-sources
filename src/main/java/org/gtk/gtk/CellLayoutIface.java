package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CellLayoutIface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellLayoutIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("pack_start"),
        Interop.valueLayout.ADDRESS.withName("pack_end"),
        Interop.valueLayout.ADDRESS.withName("clear"),
        Interop.valueLayout.ADDRESS.withName("add_attribute"),
        Interop.valueLayout.ADDRESS.withName("set_cell_data_func"),
        Interop.valueLayout.ADDRESS.withName("clear_attributes"),
        Interop.valueLayout.ADDRESS.withName("reorder"),
        Interop.valueLayout.ADDRESS.withName("get_cells"),
        Interop.valueLayout.ADDRESS.withName("get_area")
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
     * Allocate a new {@link CellLayoutIface}
     * @return A new, uninitialized @{link CellLayoutIface}
     */
    public static CellLayoutIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CellLayoutIface newInstance = new CellLayoutIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a CellLayoutIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CellLayoutIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private CellLayoutIface struct;
        
         /**
         * A {@link CellLayoutIface.Build} object constructs a {@link CellLayoutIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = CellLayoutIface.allocate();
        }
        
         /**
         * Finish building the {@link CellLayoutIface} struct.
         * @return A new instance of {@code CellLayoutIface} with the fields 
         *         that were set in the Build object.
         */
        public CellLayoutIface construct() {
            return struct;
        }
        
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
            return this;
        }
        
        public Build setPackStart(java.lang.foreign.MemoryAddress pack_start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pack_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pack_start == null ? MemoryAddress.NULL : pack_start));
            return this;
        }
        
        public Build setPackEnd(java.lang.foreign.MemoryAddress pack_end) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pack_end"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pack_end == null ? MemoryAddress.NULL : pack_end));
            return this;
        }
        
        public Build setClear(java.lang.foreign.MemoryAddress clear) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("clear"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (clear == null ? MemoryAddress.NULL : clear));
            return this;
        }
        
        public Build setAddAttribute(java.lang.foreign.MemoryAddress add_attribute) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_attribute"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (add_attribute == null ? MemoryAddress.NULL : add_attribute));
            return this;
        }
        
        public Build setSetCellDataFunc(java.lang.foreign.MemoryAddress set_cell_data_func) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_cell_data_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_cell_data_func == null ? MemoryAddress.NULL : set_cell_data_func));
            return this;
        }
        
        public Build setClearAttributes(java.lang.foreign.MemoryAddress clear_attributes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("clear_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (clear_attributes == null ? MemoryAddress.NULL : clear_attributes));
            return this;
        }
        
        public Build setReorder(java.lang.foreign.MemoryAddress reorder) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reorder"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reorder == null ? MemoryAddress.NULL : reorder));
            return this;
        }
        
        public Build setGetCells(java.lang.foreign.MemoryAddress get_cells) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_cells"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_cells == null ? MemoryAddress.NULL : get_cells));
            return this;
        }
        
        public Build setGetArea(java.lang.foreign.MemoryAddress get_area) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_area"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_area == null ? MemoryAddress.NULL : get_area));
            return this;
        }
    }
}
