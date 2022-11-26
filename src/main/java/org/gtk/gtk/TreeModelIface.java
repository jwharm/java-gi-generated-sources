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
        
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
            return this;
        }
        
        public Build setRowChanged(java.lang.foreign.MemoryAddress row_changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (row_changed == null ? MemoryAddress.NULL : row_changed));
            return this;
        }
        
        public Build setRowInserted(java.lang.foreign.MemoryAddress row_inserted) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_inserted"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (row_inserted == null ? MemoryAddress.NULL : row_inserted));
            return this;
        }
        
        public Build setRowHasChildToggled(java.lang.foreign.MemoryAddress row_has_child_toggled) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_has_child_toggled"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (row_has_child_toggled == null ? MemoryAddress.NULL : row_has_child_toggled));
            return this;
        }
        
        public Build setRowDeleted(java.lang.foreign.MemoryAddress row_deleted) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_deleted"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (row_deleted == null ? MemoryAddress.NULL : row_deleted));
            return this;
        }
        
        public Build setRowsReordered(java.lang.foreign.MemoryAddress rows_reordered) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("rows_reordered"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rows_reordered == null ? MemoryAddress.NULL : rows_reordered));
            return this;
        }
        
        public Build setGetFlags(java.lang.foreign.MemoryAddress get_flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_flags == null ? MemoryAddress.NULL : get_flags));
            return this;
        }
        
        public Build setGetNColumns(java.lang.foreign.MemoryAddress get_n_columns) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_n_columns"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_n_columns == null ? MemoryAddress.NULL : get_n_columns));
            return this;
        }
        
        public Build setGetColumnType(java.lang.foreign.MemoryAddress get_column_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_column_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_column_type == null ? MemoryAddress.NULL : get_column_type));
            return this;
        }
        
        public Build setGetIter(java.lang.foreign.MemoryAddress get_iter) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_iter"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_iter == null ? MemoryAddress.NULL : get_iter));
            return this;
        }
        
        public Build setGetPath(java.lang.foreign.MemoryAddress get_path) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_path == null ? MemoryAddress.NULL : get_path));
            return this;
        }
        
        public Build setGetValue(java.lang.foreign.MemoryAddress get_value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_value == null ? MemoryAddress.NULL : get_value));
            return this;
        }
        
        public Build setIterNext(java.lang.foreign.MemoryAddress iter_next) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_next"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iter_next == null ? MemoryAddress.NULL : iter_next));
            return this;
        }
        
        public Build setIterPrevious(java.lang.foreign.MemoryAddress iter_previous) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_previous"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iter_previous == null ? MemoryAddress.NULL : iter_previous));
            return this;
        }
        
        public Build setIterChildren(java.lang.foreign.MemoryAddress iter_children) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_children"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iter_children == null ? MemoryAddress.NULL : iter_children));
            return this;
        }
        
        public Build setIterHasChild(java.lang.foreign.MemoryAddress iter_has_child) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_has_child"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iter_has_child == null ? MemoryAddress.NULL : iter_has_child));
            return this;
        }
        
        public Build setIterNChildren(java.lang.foreign.MemoryAddress iter_n_children) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_n_children"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iter_n_children == null ? MemoryAddress.NULL : iter_n_children));
            return this;
        }
        
        public Build setIterNthChild(java.lang.foreign.MemoryAddress iter_nth_child) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_nth_child"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iter_nth_child == null ? MemoryAddress.NULL : iter_nth_child));
            return this;
        }
        
        public Build setIterParent(java.lang.foreign.MemoryAddress iter_parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iter_parent == null ? MemoryAddress.NULL : iter_parent));
            return this;
        }
        
        public Build setRefNode(java.lang.foreign.MemoryAddress ref_node) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_node"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ref_node == null ? MemoryAddress.NULL : ref_node));
            return this;
        }
        
        public Build setUnrefNode(java.lang.foreign.MemoryAddress unref_node) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unref_node"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unref_node == null ? MemoryAddress.NULL : unref_node));
            return this;
        }
    }
}
