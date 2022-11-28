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
    public org.gtk.gtk.WidgetClass parentClass$get() {
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
        
        public Build setParentClass(org.gtk.gtk.WidgetClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setRowActivated(java.lang.foreign.MemoryAddress rowActivated) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_activated"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowActivated == null ? MemoryAddress.NULL : rowActivated));
            return this;
        }
        
        public Build setTestExpandRow(java.lang.foreign.MemoryAddress testExpandRow) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("test_expand_row"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (testExpandRow == null ? MemoryAddress.NULL : testExpandRow));
            return this;
        }
        
        public Build setTestCollapseRow(java.lang.foreign.MemoryAddress testCollapseRow) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("test_collapse_row"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (testCollapseRow == null ? MemoryAddress.NULL : testCollapseRow));
            return this;
        }
        
        public Build setRowExpanded(java.lang.foreign.MemoryAddress rowExpanded) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_expanded"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowExpanded == null ? MemoryAddress.NULL : rowExpanded));
            return this;
        }
        
        public Build setRowCollapsed(java.lang.foreign.MemoryAddress rowCollapsed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_collapsed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowCollapsed == null ? MemoryAddress.NULL : rowCollapsed));
            return this;
        }
        
        public Build setColumnsChanged(java.lang.foreign.MemoryAddress columnsChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("columns_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (columnsChanged == null ? MemoryAddress.NULL : columnsChanged));
            return this;
        }
        
        public Build setCursorChanged(java.lang.foreign.MemoryAddress cursorChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cursor_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cursorChanged == null ? MemoryAddress.NULL : cursorChanged));
            return this;
        }
        
        public Build setMoveCursor(java.lang.foreign.MemoryAddress moveCursor) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move_cursor"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (moveCursor == null ? MemoryAddress.NULL : moveCursor));
            return this;
        }
        
        public Build setSelectAll(java.lang.foreign.MemoryAddress selectAll) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("select_all"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (selectAll == null ? MemoryAddress.NULL : selectAll));
            return this;
        }
        
        public Build setUnselectAll(java.lang.foreign.MemoryAddress unselectAll) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unselect_all"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unselectAll == null ? MemoryAddress.NULL : unselectAll));
            return this;
        }
        
        public Build setSelectCursorRow(java.lang.foreign.MemoryAddress selectCursorRow) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("select_cursor_row"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (selectCursorRow == null ? MemoryAddress.NULL : selectCursorRow));
            return this;
        }
        
        public Build setToggleCursorRow(java.lang.foreign.MemoryAddress toggleCursorRow) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("toggle_cursor_row"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (toggleCursorRow == null ? MemoryAddress.NULL : toggleCursorRow));
            return this;
        }
        
        public Build setExpandCollapseCursorRow(java.lang.foreign.MemoryAddress expandCollapseCursorRow) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("expand_collapse_cursor_row"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (expandCollapseCursorRow == null ? MemoryAddress.NULL : expandCollapseCursorRow));
            return this;
        }
        
        public Build setSelectCursorParent(java.lang.foreign.MemoryAddress selectCursorParent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("select_cursor_parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (selectCursorParent == null ? MemoryAddress.NULL : selectCursorParent));
            return this;
        }
        
        public Build setStartInteractiveSearch(java.lang.foreign.MemoryAddress startInteractiveSearch) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_interactive_search"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startInteractiveSearch == null ? MemoryAddress.NULL : startInteractiveSearch));
            return this;
        }
        
        public Build setReserved(java.lang.foreign.MemoryAddress[] Reserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Reserved, false)));
            return this;
        }
    }
}
