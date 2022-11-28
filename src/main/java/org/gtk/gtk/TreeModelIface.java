package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TreeModelIface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeModelIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("row_changed"),
        Interop.valueLayout.ADDRESS.withName("row_inserted"),
        Interop.valueLayout.ADDRESS.withName("row_has_child_toggled"),
        Interop.valueLayout.ADDRESS.withName("row_deleted"),
        Interop.valueLayout.ADDRESS.withName("rows_reordered"),
        Interop.valueLayout.ADDRESS.withName("get_flags"),
        Interop.valueLayout.ADDRESS.withName("get_n_columns"),
        Interop.valueLayout.ADDRESS.withName("get_column_type"),
        Interop.valueLayout.ADDRESS.withName("get_iter"),
        Interop.valueLayout.ADDRESS.withName("get_path"),
        Interop.valueLayout.ADDRESS.withName("get_value"),
        Interop.valueLayout.ADDRESS.withName("iter_next"),
        Interop.valueLayout.ADDRESS.withName("iter_previous"),
        Interop.valueLayout.ADDRESS.withName("iter_children"),
        Interop.valueLayout.ADDRESS.withName("iter_has_child"),
        Interop.valueLayout.ADDRESS.withName("iter_n_children"),
        Interop.valueLayout.ADDRESS.withName("iter_nth_child"),
        Interop.valueLayout.ADDRESS.withName("iter_parent"),
        Interop.valueLayout.ADDRESS.withName("ref_node"),
        Interop.valueLayout.ADDRESS.withName("unref_node")
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
     * Allocate a new {@link TreeModelIface}
     * @return A new, uninitialized @{link TreeModelIface}
     */
    public static TreeModelIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TreeModelIface newInstance = new TreeModelIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TreeModelIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TreeModelIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TreeModelIface struct;
        
         /**
         * A {@link TreeModelIface.Build} object constructs a {@link TreeModelIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TreeModelIface.allocate();
        }
        
         /**
         * Finish building the {@link TreeModelIface} struct.
         * @return A new instance of {@code TreeModelIface} with the fields 
         *         that were set in the Build object.
         */
        public TreeModelIface construct() {
            return struct;
        }
        
        public Build setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Build setRowChanged(java.lang.foreign.MemoryAddress rowChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowChanged == null ? MemoryAddress.NULL : rowChanged));
            return this;
        }
        
        public Build setRowInserted(java.lang.foreign.MemoryAddress rowInserted) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_inserted"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowInserted == null ? MemoryAddress.NULL : rowInserted));
            return this;
        }
        
        public Build setRowHasChildToggled(java.lang.foreign.MemoryAddress rowHasChildToggled) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_has_child_toggled"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowHasChildToggled == null ? MemoryAddress.NULL : rowHasChildToggled));
            return this;
        }
        
        public Build setRowDeleted(java.lang.foreign.MemoryAddress rowDeleted) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_deleted"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowDeleted == null ? MemoryAddress.NULL : rowDeleted));
            return this;
        }
        
        public Build setRowsReordered(java.lang.foreign.MemoryAddress rowsReordered) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("rows_reordered"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowsReordered == null ? MemoryAddress.NULL : rowsReordered));
            return this;
        }
        
        public Build setGetFlags(java.lang.foreign.MemoryAddress getFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFlags == null ? MemoryAddress.NULL : getFlags));
            return this;
        }
        
        public Build setGetNColumns(java.lang.foreign.MemoryAddress getNColumns) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_n_columns"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getNColumns == null ? MemoryAddress.NULL : getNColumns));
            return this;
        }
        
        public Build setGetColumnType(java.lang.foreign.MemoryAddress getColumnType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_column_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getColumnType == null ? MemoryAddress.NULL : getColumnType));
            return this;
        }
        
        public Build setGetIter(java.lang.foreign.MemoryAddress getIter) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_iter"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getIter == null ? MemoryAddress.NULL : getIter));
            return this;
        }
        
        public Build setGetPath(java.lang.foreign.MemoryAddress getPath) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPath == null ? MemoryAddress.NULL : getPath));
            return this;
        }
        
        public Build setGetValue(java.lang.foreign.MemoryAddress getValue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue));
            return this;
        }
        
        public Build setIterNext(java.lang.foreign.MemoryAddress iterNext) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_next"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterNext == null ? MemoryAddress.NULL : iterNext));
            return this;
        }
        
        public Build setIterPrevious(java.lang.foreign.MemoryAddress iterPrevious) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_previous"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterPrevious == null ? MemoryAddress.NULL : iterPrevious));
            return this;
        }
        
        public Build setIterChildren(java.lang.foreign.MemoryAddress iterChildren) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_children"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterChildren == null ? MemoryAddress.NULL : iterChildren));
            return this;
        }
        
        public Build setIterHasChild(java.lang.foreign.MemoryAddress iterHasChild) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_has_child"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterHasChild == null ? MemoryAddress.NULL : iterHasChild));
            return this;
        }
        
        public Build setIterNChildren(java.lang.foreign.MemoryAddress iterNChildren) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_n_children"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterNChildren == null ? MemoryAddress.NULL : iterNChildren));
            return this;
        }
        
        public Build setIterNthChild(java.lang.foreign.MemoryAddress iterNthChild) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_nth_child"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterNthChild == null ? MemoryAddress.NULL : iterNthChild));
            return this;
        }
        
        public Build setIterParent(java.lang.foreign.MemoryAddress iterParent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterParent == null ? MemoryAddress.NULL : iterParent));
            return this;
        }
        
        public Build setRefNode(java.lang.foreign.MemoryAddress refNode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_node"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (refNode == null ? MemoryAddress.NULL : refNode));
            return this;
        }
        
        public Build setUnrefNode(java.lang.foreign.MemoryAddress unrefNode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unref_node"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unrefNode == null ? MemoryAddress.NULL : unrefNode));
            return this;
        }
    }
}
