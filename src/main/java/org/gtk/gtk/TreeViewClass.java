package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TreeViewClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeViewClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("row_activated"),
        Interop.valueLayout.ADDRESS.withName("test_expand_row"),
        Interop.valueLayout.ADDRESS.withName("test_collapse_row"),
        Interop.valueLayout.ADDRESS.withName("row_expanded"),
        Interop.valueLayout.ADDRESS.withName("row_collapsed"),
        Interop.valueLayout.ADDRESS.withName("columns_changed"),
        Interop.valueLayout.ADDRESS.withName("cursor_changed"),
        Interop.valueLayout.ADDRESS.withName("move_cursor"),
        Interop.valueLayout.ADDRESS.withName("select_all"),
        Interop.valueLayout.ADDRESS.withName("unselect_all"),
        Interop.valueLayout.ADDRESS.withName("select_cursor_row"),
        Interop.valueLayout.ADDRESS.withName("toggle_cursor_row"),
        Interop.valueLayout.ADDRESS.withName("expand_collapse_cursor_row"),
        Interop.valueLayout.ADDRESS.withName("select_cursor_parent"),
        Interop.valueLayout.ADDRESS.withName("start_interactive_search"),
        MemoryLayout.sequenceLayout(16, Interop.valueLayout.ADDRESS).withName("_reserved")
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
     * Allocate a new {@link TreeViewClass}
     * @return A new, uninitialized @{link TreeViewClass}
     */
    public static TreeViewClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TreeViewClass newInstance = new TreeViewClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.WidgetClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gtk.WidgetClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a TreeViewClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TreeViewClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TreeViewClass struct;
        
         /**
         * A {@link TreeViewClass.Build} object constructs a {@link TreeViewClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TreeViewClass.allocate();
        }
        
         /**
         * Finish building the {@link TreeViewClass} struct.
         * @return A new instance of {@code TreeViewClass} with the fields 
         *         that were set in the Build object.
         */
        public TreeViewClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gtk.WidgetClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setRowActivated(java.lang.foreign.MemoryAddress row_activated) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_activated"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (row_activated == null ? MemoryAddress.NULL : row_activated));
            return this;
        }
        
        public Build setTestExpandRow(java.lang.foreign.MemoryAddress test_expand_row) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("test_expand_row"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (test_expand_row == null ? MemoryAddress.NULL : test_expand_row));
            return this;
        }
        
        public Build setTestCollapseRow(java.lang.foreign.MemoryAddress test_collapse_row) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("test_collapse_row"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (test_collapse_row == null ? MemoryAddress.NULL : test_collapse_row));
            return this;
        }
        
        public Build setRowExpanded(java.lang.foreign.MemoryAddress row_expanded) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_expanded"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (row_expanded == null ? MemoryAddress.NULL : row_expanded));
            return this;
        }
        
        public Build setRowCollapsed(java.lang.foreign.MemoryAddress row_collapsed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_collapsed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (row_collapsed == null ? MemoryAddress.NULL : row_collapsed));
            return this;
        }
        
        public Build setColumnsChanged(java.lang.foreign.MemoryAddress columns_changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("columns_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (columns_changed == null ? MemoryAddress.NULL : columns_changed));
            return this;
        }
        
        public Build setCursorChanged(java.lang.foreign.MemoryAddress cursor_changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cursor_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cursor_changed == null ? MemoryAddress.NULL : cursor_changed));
            return this;
        }
        
        public Build setMoveCursor(java.lang.foreign.MemoryAddress move_cursor) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move_cursor"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (move_cursor == null ? MemoryAddress.NULL : move_cursor));
            return this;
        }
        
        public Build setSelectAll(java.lang.foreign.MemoryAddress select_all) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("select_all"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (select_all == null ? MemoryAddress.NULL : select_all));
            return this;
        }
        
        public Build setUnselectAll(java.lang.foreign.MemoryAddress unselect_all) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unselect_all"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unselect_all == null ? MemoryAddress.NULL : unselect_all));
            return this;
        }
        
        public Build setSelectCursorRow(java.lang.foreign.MemoryAddress select_cursor_row) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("select_cursor_row"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (select_cursor_row == null ? MemoryAddress.NULL : select_cursor_row));
            return this;
        }
        
        public Build setToggleCursorRow(java.lang.foreign.MemoryAddress toggle_cursor_row) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("toggle_cursor_row"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (toggle_cursor_row == null ? MemoryAddress.NULL : toggle_cursor_row));
            return this;
        }
        
        public Build setExpandCollapseCursorRow(java.lang.foreign.MemoryAddress expand_collapse_cursor_row) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("expand_collapse_cursor_row"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (expand_collapse_cursor_row == null ? MemoryAddress.NULL : expand_collapse_cursor_row));
            return this;
        }
        
        public Build setSelectCursorParent(java.lang.foreign.MemoryAddress select_cursor_parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("select_cursor_parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (select_cursor_parent == null ? MemoryAddress.NULL : select_cursor_parent));
            return this;
        }
        
        public Build setStartInteractiveSearch(java.lang.foreign.MemoryAddress start_interactive_search) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_interactive_search"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start_interactive_search == null ? MemoryAddress.NULL : start_interactive_search));
            return this;
        }
        
        public Build setReserved(java.lang.foreign.MemoryAddress[] _reserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(_reserved, false)));
            return this;
        }
    }
}
