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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    public org.gtk.gtk.WidgetClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gtk.WidgetClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gtk.WidgetClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface RowActivatedCallback {
        void run(org.gtk.gtk.TreeView treeView, org.gtk.gtk.TreePath path, @Nullable org.gtk.gtk.TreeViewColumn column);

        @ApiStatus.Internal default void upcall(MemoryAddress treeView, MemoryAddress path, MemoryAddress column) {
            run((org.gtk.gtk.TreeView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeView)), org.gtk.gtk.TreeView.fromAddress).marshal(treeView, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE), (org.gtk.gtk.TreeViewColumn) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(column)), org.gtk.gtk.TreeViewColumn.fromAddress).marshal(column, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RowActivatedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code row_activated}
     * @param rowActivated The new value of the field {@code row_activated}
     */
    public void setRowActivated(RowActivatedCallback rowActivated) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("row_activated"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowActivated == null ? MemoryAddress.NULL : rowActivated.toCallback()));
    }
    
    @FunctionalInterface
    public interface TestExpandRowCallback {
        boolean run(org.gtk.gtk.TreeView treeView, org.gtk.gtk.TreeIter iter, org.gtk.gtk.TreePath path);

        @ApiStatus.Internal default int upcall(MemoryAddress treeView, MemoryAddress iter, MemoryAddress path) {
            var RESULT = run((org.gtk.gtk.TreeView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeView)), org.gtk.gtk.TreeView.fromAddress).marshal(treeView, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TestExpandRowCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code test_expand_row}
     * @param testExpandRow The new value of the field {@code test_expand_row}
     */
    public void setTestExpandRow(TestExpandRowCallback testExpandRow) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_expand_row"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (testExpandRow == null ? MemoryAddress.NULL : testExpandRow.toCallback()));
    }
    
    @FunctionalInterface
    public interface TestCollapseRowCallback {
        boolean run(org.gtk.gtk.TreeView treeView, org.gtk.gtk.TreeIter iter, org.gtk.gtk.TreePath path);

        @ApiStatus.Internal default int upcall(MemoryAddress treeView, MemoryAddress iter, MemoryAddress path) {
            var RESULT = run((org.gtk.gtk.TreeView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeView)), org.gtk.gtk.TreeView.fromAddress).marshal(treeView, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TestCollapseRowCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code test_collapse_row}
     * @param testCollapseRow The new value of the field {@code test_collapse_row}
     */
    public void setTestCollapseRow(TestCollapseRowCallback testCollapseRow) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_collapse_row"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (testCollapseRow == null ? MemoryAddress.NULL : testCollapseRow.toCallback()));
    }
    
    @FunctionalInterface
    public interface RowExpandedCallback {
        void run(org.gtk.gtk.TreeView treeView, org.gtk.gtk.TreeIter iter, org.gtk.gtk.TreePath path);

        @ApiStatus.Internal default void upcall(MemoryAddress treeView, MemoryAddress iter, MemoryAddress path) {
            run((org.gtk.gtk.TreeView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeView)), org.gtk.gtk.TreeView.fromAddress).marshal(treeView, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RowExpandedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code row_expanded}
     * @param rowExpanded The new value of the field {@code row_expanded}
     */
    public void setRowExpanded(RowExpandedCallback rowExpanded) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("row_expanded"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowExpanded == null ? MemoryAddress.NULL : rowExpanded.toCallback()));
    }
    
    @FunctionalInterface
    public interface RowCollapsedCallback {
        void run(org.gtk.gtk.TreeView treeView, org.gtk.gtk.TreeIter iter, org.gtk.gtk.TreePath path);

        @ApiStatus.Internal default void upcall(MemoryAddress treeView, MemoryAddress iter, MemoryAddress path) {
            run((org.gtk.gtk.TreeView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeView)), org.gtk.gtk.TreeView.fromAddress).marshal(treeView, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RowCollapsedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code row_collapsed}
     * @param rowCollapsed The new value of the field {@code row_collapsed}
     */
    public void setRowCollapsed(RowCollapsedCallback rowCollapsed) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("row_collapsed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowCollapsed == null ? MemoryAddress.NULL : rowCollapsed.toCallback()));
    }
    
    @FunctionalInterface
    public interface ColumnsChangedCallback {
        void run(org.gtk.gtk.TreeView treeView);

        @ApiStatus.Internal default void upcall(MemoryAddress treeView) {
            run((org.gtk.gtk.TreeView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeView)), org.gtk.gtk.TreeView.fromAddress).marshal(treeView, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ColumnsChangedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code columns_changed}
     * @param columnsChanged The new value of the field {@code columns_changed}
     */
    public void setColumnsChanged(ColumnsChangedCallback columnsChanged) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("columns_changed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (columnsChanged == null ? MemoryAddress.NULL : columnsChanged.toCallback()));
    }
    
    @FunctionalInterface
    public interface CursorChangedCallback {
        void run(org.gtk.gtk.TreeView treeView);

        @ApiStatus.Internal default void upcall(MemoryAddress treeView) {
            run((org.gtk.gtk.TreeView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeView)), org.gtk.gtk.TreeView.fromAddress).marshal(treeView, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CursorChangedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code cursor_changed}
     * @param cursorChanged The new value of the field {@code cursor_changed}
     */
    public void setCursorChanged(CursorChangedCallback cursorChanged) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cursor_changed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cursorChanged == null ? MemoryAddress.NULL : cursorChanged.toCallback()));
    }
    
    @FunctionalInterface
    public interface MoveCursorCallback {
        boolean run(org.gtk.gtk.TreeView treeView, org.gtk.gtk.MovementStep step, int count, boolean extend, boolean modify);

        @ApiStatus.Internal default int upcall(MemoryAddress treeView, int step, int count, int extend, int modify) {
            var RESULT = run((org.gtk.gtk.TreeView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeView)), org.gtk.gtk.TreeView.fromAddress).marshal(treeView, Ownership.NONE), org.gtk.gtk.MovementStep.of(step), count, Marshal.integerToBoolean.marshal(extend, null).booleanValue(), Marshal.integerToBoolean.marshal(modify, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MoveCursorCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code move_cursor}
     * @param moveCursor The new value of the field {@code move_cursor}
     */
    public void setMoveCursor(MoveCursorCallback moveCursor) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("move_cursor"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (moveCursor == null ? MemoryAddress.NULL : moveCursor.toCallback()));
    }
    
    @FunctionalInterface
    public interface SelectAllCallback {
        boolean run(org.gtk.gtk.TreeView treeView);

        @ApiStatus.Internal default int upcall(MemoryAddress treeView) {
            var RESULT = run((org.gtk.gtk.TreeView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeView)), org.gtk.gtk.TreeView.fromAddress).marshal(treeView, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SelectAllCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code select_all}
     * @param selectAll The new value of the field {@code select_all}
     */
    public void setSelectAll(SelectAllCallback selectAll) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("select_all"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (selectAll == null ? MemoryAddress.NULL : selectAll.toCallback()));
    }
    
    @FunctionalInterface
    public interface UnselectAllCallback {
        boolean run(org.gtk.gtk.TreeView treeView);

        @ApiStatus.Internal default int upcall(MemoryAddress treeView) {
            var RESULT = run((org.gtk.gtk.TreeView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeView)), org.gtk.gtk.TreeView.fromAddress).marshal(treeView, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnselectAllCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unselect_all}
     * @param unselectAll The new value of the field {@code unselect_all}
     */
    public void setUnselectAll(UnselectAllCallback unselectAll) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unselect_all"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unselectAll == null ? MemoryAddress.NULL : unselectAll.toCallback()));
    }
    
    @FunctionalInterface
    public interface SelectCursorRowCallback {
        boolean run(org.gtk.gtk.TreeView treeView, boolean startEditing);

        @ApiStatus.Internal default int upcall(MemoryAddress treeView, int startEditing) {
            var RESULT = run((org.gtk.gtk.TreeView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeView)), org.gtk.gtk.TreeView.fromAddress).marshal(treeView, Ownership.NONE), Marshal.integerToBoolean.marshal(startEditing, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SelectCursorRowCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code select_cursor_row}
     * @param selectCursorRow The new value of the field {@code select_cursor_row}
     */
    public void setSelectCursorRow(SelectCursorRowCallback selectCursorRow) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("select_cursor_row"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (selectCursorRow == null ? MemoryAddress.NULL : selectCursorRow.toCallback()));
    }
    
    @FunctionalInterface
    public interface ToggleCursorRowCallback {
        boolean run(org.gtk.gtk.TreeView treeView);

        @ApiStatus.Internal default int upcall(MemoryAddress treeView) {
            var RESULT = run((org.gtk.gtk.TreeView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeView)), org.gtk.gtk.TreeView.fromAddress).marshal(treeView, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ToggleCursorRowCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code toggle_cursor_row}
     * @param toggleCursorRow The new value of the field {@code toggle_cursor_row}
     */
    public void setToggleCursorRow(ToggleCursorRowCallback toggleCursorRow) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("toggle_cursor_row"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (toggleCursorRow == null ? MemoryAddress.NULL : toggleCursorRow.toCallback()));
    }
    
    @FunctionalInterface
    public interface ExpandCollapseCursorRowCallback {
        boolean run(org.gtk.gtk.TreeView treeView, boolean logical, boolean expand, boolean openAll);

        @ApiStatus.Internal default int upcall(MemoryAddress treeView, int logical, int expand, int openAll) {
            var RESULT = run((org.gtk.gtk.TreeView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeView)), org.gtk.gtk.TreeView.fromAddress).marshal(treeView, Ownership.NONE), Marshal.integerToBoolean.marshal(logical, null).booleanValue(), Marshal.integerToBoolean.marshal(expand, null).booleanValue(), Marshal.integerToBoolean.marshal(openAll, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ExpandCollapseCursorRowCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code expand_collapse_cursor_row}
     * @param expandCollapseCursorRow The new value of the field {@code expand_collapse_cursor_row}
     */
    public void setExpandCollapseCursorRow(ExpandCollapseCursorRowCallback expandCollapseCursorRow) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("expand_collapse_cursor_row"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (expandCollapseCursorRow == null ? MemoryAddress.NULL : expandCollapseCursorRow.toCallback()));
    }
    
    @FunctionalInterface
    public interface SelectCursorParentCallback {
        boolean run(org.gtk.gtk.TreeView treeView);

        @ApiStatus.Internal default int upcall(MemoryAddress treeView) {
            var RESULT = run((org.gtk.gtk.TreeView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeView)), org.gtk.gtk.TreeView.fromAddress).marshal(treeView, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SelectCursorParentCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code select_cursor_parent}
     * @param selectCursorParent The new value of the field {@code select_cursor_parent}
     */
    public void setSelectCursorParent(SelectCursorParentCallback selectCursorParent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("select_cursor_parent"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (selectCursorParent == null ? MemoryAddress.NULL : selectCursorParent.toCallback()));
    }
    
    @FunctionalInterface
    public interface StartInteractiveSearchCallback {
        boolean run(org.gtk.gtk.TreeView treeView);

        @ApiStatus.Internal default int upcall(MemoryAddress treeView) {
            var RESULT = run((org.gtk.gtk.TreeView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeView)), org.gtk.gtk.TreeView.fromAddress).marshal(treeView, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StartInteractiveSearchCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start_interactive_search}
     * @param startInteractiveSearch The new value of the field {@code start_interactive_search}
     */
    public void setStartInteractiveSearch(StartInteractiveSearchCallback startInteractiveSearch) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_interactive_search"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startInteractiveSearch == null ? MemoryAddress.NULL : startInteractiveSearch.toCallback()));
    }
    
    /**
     * Create a TreeViewClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TreeViewClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeViewClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TreeViewClass(input, ownership);
    
    /**
     * A {@link TreeViewClass.Builder} object constructs a {@link TreeViewClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TreeViewClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TreeViewClass struct;
        
        private Builder() {
            struct = TreeViewClass.allocate();
        }
        
         /**
         * Finish building the {@link TreeViewClass} struct.
         * @return A new instance of {@code TreeViewClass} with the fields 
         *         that were set in the Builder object.
         */
        public TreeViewClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gtk.WidgetClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setRowActivated(RowActivatedCallback rowActivated) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_activated"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowActivated == null ? MemoryAddress.NULL : rowActivated.toCallback()));
            return this;
        }
        
        public Builder setTestExpandRow(TestExpandRowCallback testExpandRow) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("test_expand_row"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (testExpandRow == null ? MemoryAddress.NULL : testExpandRow.toCallback()));
            return this;
        }
        
        public Builder setTestCollapseRow(TestCollapseRowCallback testCollapseRow) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("test_collapse_row"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (testCollapseRow == null ? MemoryAddress.NULL : testCollapseRow.toCallback()));
            return this;
        }
        
        public Builder setRowExpanded(RowExpandedCallback rowExpanded) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_expanded"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowExpanded == null ? MemoryAddress.NULL : rowExpanded.toCallback()));
            return this;
        }
        
        public Builder setRowCollapsed(RowCollapsedCallback rowCollapsed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_collapsed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowCollapsed == null ? MemoryAddress.NULL : rowCollapsed.toCallback()));
            return this;
        }
        
        public Builder setColumnsChanged(ColumnsChangedCallback columnsChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("columns_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (columnsChanged == null ? MemoryAddress.NULL : columnsChanged.toCallback()));
            return this;
        }
        
        public Builder setCursorChanged(CursorChangedCallback cursorChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cursor_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cursorChanged == null ? MemoryAddress.NULL : cursorChanged.toCallback()));
            return this;
        }
        
        public Builder setMoveCursor(MoveCursorCallback moveCursor) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move_cursor"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (moveCursor == null ? MemoryAddress.NULL : moveCursor.toCallback()));
            return this;
        }
        
        public Builder setSelectAll(SelectAllCallback selectAll) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("select_all"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (selectAll == null ? MemoryAddress.NULL : selectAll.toCallback()));
            return this;
        }
        
        public Builder setUnselectAll(UnselectAllCallback unselectAll) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unselect_all"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unselectAll == null ? MemoryAddress.NULL : unselectAll.toCallback()));
            return this;
        }
        
        public Builder setSelectCursorRow(SelectCursorRowCallback selectCursorRow) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("select_cursor_row"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (selectCursorRow == null ? MemoryAddress.NULL : selectCursorRow.toCallback()));
            return this;
        }
        
        public Builder setToggleCursorRow(ToggleCursorRowCallback toggleCursorRow) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("toggle_cursor_row"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (toggleCursorRow == null ? MemoryAddress.NULL : toggleCursorRow.toCallback()));
            return this;
        }
        
        public Builder setExpandCollapseCursorRow(ExpandCollapseCursorRowCallback expandCollapseCursorRow) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("expand_collapse_cursor_row"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (expandCollapseCursorRow == null ? MemoryAddress.NULL : expandCollapseCursorRow.toCallback()));
            return this;
        }
        
        public Builder setSelectCursorParent(SelectCursorParentCallback selectCursorParent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("select_cursor_parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (selectCursorParent == null ? MemoryAddress.NULL : selectCursorParent.toCallback()));
            return this;
        }
        
        public Builder setStartInteractiveSearch(StartInteractiveSearchCallback startInteractiveSearch) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_interactive_search"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startInteractiveSearch == null ? MemoryAddress.NULL : startInteractiveSearch.toCallback()));
            return this;
        }
        
        public Builder setReserved(java.lang.foreign.MemoryAddress[] Reserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Reserved, false)));
            return this;
        }
    }
}
