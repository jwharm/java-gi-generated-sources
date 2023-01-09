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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TreeViewClass newInstance = new TreeViewClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.WidgetClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gtk.WidgetClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gtk.WidgetClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RowActivatedCallback} callback.
     */
    @FunctionalInterface
    public interface RowActivatedCallback {
    
        void run(org.gtk.gtk.TreeView treeView, org.gtk.gtk.TreePath path, @Nullable org.gtk.gtk.TreeViewColumn column);
        
        @ApiStatus.Internal default void upcall(MemoryAddress treeView, MemoryAddress path, MemoryAddress column) {
            run((org.gtk.gtk.TreeView) Interop.register(treeView, org.gtk.gtk.TreeView.fromAddress).marshal(treeView, null), org.gtk.gtk.TreePath.fromAddress.marshal(path, null), (org.gtk.gtk.TreeViewColumn) Interop.register(column, org.gtk.gtk.TreeViewColumn.fromAddress).marshal(column, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RowActivatedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code row_activated}
     * @param rowActivated The new value of the field {@code row_activated}
     */
    public void setRowActivated(RowActivatedCallback rowActivated) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_activated"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (rowActivated == null ? MemoryAddress.NULL : rowActivated.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TestExpandRowCallback} callback.
     */
    @FunctionalInterface
    public interface TestExpandRowCallback {
    
        boolean run(org.gtk.gtk.TreeView treeView, org.gtk.gtk.TreeIter iter, org.gtk.gtk.TreePath path);
        
        @ApiStatus.Internal default int upcall(MemoryAddress treeView, MemoryAddress iter, MemoryAddress path) {
            var RESULT = run((org.gtk.gtk.TreeView) Interop.register(treeView, org.gtk.gtk.TreeView.fromAddress).marshal(treeView, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null), org.gtk.gtk.TreePath.fromAddress.marshal(path, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TestExpandRowCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code test_expand_row}
     * @param testExpandRow The new value of the field {@code test_expand_row}
     */
    public void setTestExpandRow(TestExpandRowCallback testExpandRow) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("test_expand_row"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (testExpandRow == null ? MemoryAddress.NULL : testExpandRow.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TestCollapseRowCallback} callback.
     */
    @FunctionalInterface
    public interface TestCollapseRowCallback {
    
        boolean run(org.gtk.gtk.TreeView treeView, org.gtk.gtk.TreeIter iter, org.gtk.gtk.TreePath path);
        
        @ApiStatus.Internal default int upcall(MemoryAddress treeView, MemoryAddress iter, MemoryAddress path) {
            var RESULT = run((org.gtk.gtk.TreeView) Interop.register(treeView, org.gtk.gtk.TreeView.fromAddress).marshal(treeView, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null), org.gtk.gtk.TreePath.fromAddress.marshal(path, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TestCollapseRowCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code test_collapse_row}
     * @param testCollapseRow The new value of the field {@code test_collapse_row}
     */
    public void setTestCollapseRow(TestCollapseRowCallback testCollapseRow) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("test_collapse_row"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (testCollapseRow == null ? MemoryAddress.NULL : testCollapseRow.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RowExpandedCallback} callback.
     */
    @FunctionalInterface
    public interface RowExpandedCallback {
    
        void run(org.gtk.gtk.TreeView treeView, org.gtk.gtk.TreeIter iter, org.gtk.gtk.TreePath path);
        
        @ApiStatus.Internal default void upcall(MemoryAddress treeView, MemoryAddress iter, MemoryAddress path) {
            run((org.gtk.gtk.TreeView) Interop.register(treeView, org.gtk.gtk.TreeView.fromAddress).marshal(treeView, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null), org.gtk.gtk.TreePath.fromAddress.marshal(path, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RowExpandedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code row_expanded}
     * @param rowExpanded The new value of the field {@code row_expanded}
     */
    public void setRowExpanded(RowExpandedCallback rowExpanded) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_expanded"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (rowExpanded == null ? MemoryAddress.NULL : rowExpanded.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RowCollapsedCallback} callback.
     */
    @FunctionalInterface
    public interface RowCollapsedCallback {
    
        void run(org.gtk.gtk.TreeView treeView, org.gtk.gtk.TreeIter iter, org.gtk.gtk.TreePath path);
        
        @ApiStatus.Internal default void upcall(MemoryAddress treeView, MemoryAddress iter, MemoryAddress path) {
            run((org.gtk.gtk.TreeView) Interop.register(treeView, org.gtk.gtk.TreeView.fromAddress).marshal(treeView, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null), org.gtk.gtk.TreePath.fromAddress.marshal(path, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RowCollapsedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code row_collapsed}
     * @param rowCollapsed The new value of the field {@code row_collapsed}
     */
    public void setRowCollapsed(RowCollapsedCallback rowCollapsed) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_collapsed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (rowCollapsed == null ? MemoryAddress.NULL : rowCollapsed.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ColumnsChangedCallback} callback.
     */
    @FunctionalInterface
    public interface ColumnsChangedCallback {
    
        void run(org.gtk.gtk.TreeView treeView);
        
        @ApiStatus.Internal default void upcall(MemoryAddress treeView) {
            run((org.gtk.gtk.TreeView) Interop.register(treeView, org.gtk.gtk.TreeView.fromAddress).marshal(treeView, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ColumnsChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code columns_changed}
     * @param columnsChanged The new value of the field {@code columns_changed}
     */
    public void setColumnsChanged(ColumnsChangedCallback columnsChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("columns_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (columnsChanged == null ? MemoryAddress.NULL : columnsChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CursorChangedCallback} callback.
     */
    @FunctionalInterface
    public interface CursorChangedCallback {
    
        void run(org.gtk.gtk.TreeView treeView);
        
        @ApiStatus.Internal default void upcall(MemoryAddress treeView) {
            run((org.gtk.gtk.TreeView) Interop.register(treeView, org.gtk.gtk.TreeView.fromAddress).marshal(treeView, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CursorChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code cursor_changed}
     * @param cursorChanged The new value of the field {@code cursor_changed}
     */
    public void setCursorChanged(CursorChangedCallback cursorChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cursor_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (cursorChanged == null ? MemoryAddress.NULL : cursorChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MoveCursorCallback} callback.
     */
    @FunctionalInterface
    public interface MoveCursorCallback {
    
        boolean run(org.gtk.gtk.TreeView treeView, org.gtk.gtk.MovementStep step, int count, boolean extend, boolean modify);
        
        @ApiStatus.Internal default int upcall(MemoryAddress treeView, int step, int count, int extend, int modify) {
            var RESULT = run((org.gtk.gtk.TreeView) Interop.register(treeView, org.gtk.gtk.TreeView.fromAddress).marshal(treeView, null), org.gtk.gtk.MovementStep.of(step), count, Marshal.integerToBoolean.marshal(extend, null).booleanValue(), Marshal.integerToBoolean.marshal(modify, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MoveCursorCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code move_cursor}
     * @param moveCursor The new value of the field {@code move_cursor}
     */
    public void setMoveCursor(MoveCursorCallback moveCursor) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move_cursor"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (moveCursor == null ? MemoryAddress.NULL : moveCursor.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SelectAllCallback} callback.
     */
    @FunctionalInterface
    public interface SelectAllCallback {
    
        boolean run(org.gtk.gtk.TreeView treeView);
        
        @ApiStatus.Internal default int upcall(MemoryAddress treeView) {
            var RESULT = run((org.gtk.gtk.TreeView) Interop.register(treeView, org.gtk.gtk.TreeView.fromAddress).marshal(treeView, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SelectAllCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code select_all}
     * @param selectAll The new value of the field {@code select_all}
     */
    public void setSelectAll(SelectAllCallback selectAll) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("select_all"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (selectAll == null ? MemoryAddress.NULL : selectAll.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UnselectAllCallback} callback.
     */
    @FunctionalInterface
    public interface UnselectAllCallback {
    
        boolean run(org.gtk.gtk.TreeView treeView);
        
        @ApiStatus.Internal default int upcall(MemoryAddress treeView) {
            var RESULT = run((org.gtk.gtk.TreeView) Interop.register(treeView, org.gtk.gtk.TreeView.fromAddress).marshal(treeView, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnselectAllCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unselect_all}
     * @param unselectAll The new value of the field {@code unselect_all}
     */
    public void setUnselectAll(UnselectAllCallback unselectAll) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unselect_all"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unselectAll == null ? MemoryAddress.NULL : unselectAll.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SelectCursorRowCallback} callback.
     */
    @FunctionalInterface
    public interface SelectCursorRowCallback {
    
        boolean run(org.gtk.gtk.TreeView treeView, boolean startEditing);
        
        @ApiStatus.Internal default int upcall(MemoryAddress treeView, int startEditing) {
            var RESULT = run((org.gtk.gtk.TreeView) Interop.register(treeView, org.gtk.gtk.TreeView.fromAddress).marshal(treeView, null), Marshal.integerToBoolean.marshal(startEditing, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SelectCursorRowCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code select_cursor_row}
     * @param selectCursorRow The new value of the field {@code select_cursor_row}
     */
    public void setSelectCursorRow(SelectCursorRowCallback selectCursorRow) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("select_cursor_row"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (selectCursorRow == null ? MemoryAddress.NULL : selectCursorRow.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ToggleCursorRowCallback} callback.
     */
    @FunctionalInterface
    public interface ToggleCursorRowCallback {
    
        boolean run(org.gtk.gtk.TreeView treeView);
        
        @ApiStatus.Internal default int upcall(MemoryAddress treeView) {
            var RESULT = run((org.gtk.gtk.TreeView) Interop.register(treeView, org.gtk.gtk.TreeView.fromAddress).marshal(treeView, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ToggleCursorRowCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code toggle_cursor_row}
     * @param toggleCursorRow The new value of the field {@code toggle_cursor_row}
     */
    public void setToggleCursorRow(ToggleCursorRowCallback toggleCursorRow) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("toggle_cursor_row"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (toggleCursorRow == null ? MemoryAddress.NULL : toggleCursorRow.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ExpandCollapseCursorRowCallback} callback.
     */
    @FunctionalInterface
    public interface ExpandCollapseCursorRowCallback {
    
        boolean run(org.gtk.gtk.TreeView treeView, boolean logical, boolean expand, boolean openAll);
        
        @ApiStatus.Internal default int upcall(MemoryAddress treeView, int logical, int expand, int openAll) {
            var RESULT = run((org.gtk.gtk.TreeView) Interop.register(treeView, org.gtk.gtk.TreeView.fromAddress).marshal(treeView, null), Marshal.integerToBoolean.marshal(logical, null).booleanValue(), Marshal.integerToBoolean.marshal(expand, null).booleanValue(), Marshal.integerToBoolean.marshal(openAll, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ExpandCollapseCursorRowCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code expand_collapse_cursor_row}
     * @param expandCollapseCursorRow The new value of the field {@code expand_collapse_cursor_row}
     */
    public void setExpandCollapseCursorRow(ExpandCollapseCursorRowCallback expandCollapseCursorRow) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("expand_collapse_cursor_row"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (expandCollapseCursorRow == null ? MemoryAddress.NULL : expandCollapseCursorRow.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SelectCursorParentCallback} callback.
     */
    @FunctionalInterface
    public interface SelectCursorParentCallback {
    
        boolean run(org.gtk.gtk.TreeView treeView);
        
        @ApiStatus.Internal default int upcall(MemoryAddress treeView) {
            var RESULT = run((org.gtk.gtk.TreeView) Interop.register(treeView, org.gtk.gtk.TreeView.fromAddress).marshal(treeView, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SelectCursorParentCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code select_cursor_parent}
     * @param selectCursorParent The new value of the field {@code select_cursor_parent}
     */
    public void setSelectCursorParent(SelectCursorParentCallback selectCursorParent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("select_cursor_parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (selectCursorParent == null ? MemoryAddress.NULL : selectCursorParent.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StartInteractiveSearchCallback} callback.
     */
    @FunctionalInterface
    public interface StartInteractiveSearchCallback {
    
        boolean run(org.gtk.gtk.TreeView treeView);
        
        @ApiStatus.Internal default int upcall(MemoryAddress treeView) {
            var RESULT = run((org.gtk.gtk.TreeView) Interop.register(treeView, org.gtk.gtk.TreeView.fromAddress).marshal(treeView, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StartInteractiveSearchCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start_interactive_search}
     * @param startInteractiveSearch The new value of the field {@code start_interactive_search}
     */
    public void setStartInteractiveSearch(StartInteractiveSearchCallback startInteractiveSearch) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_interactive_search"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (startInteractiveSearch == null ? MemoryAddress.NULL : startInteractiveSearch.toCallback()));
        }
    }
    
    /**
     * Create a TreeViewClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TreeViewClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeViewClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TreeViewClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setRowActivated(RowActivatedCallback rowActivated) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("row_activated"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (rowActivated == null ? MemoryAddress.NULL : rowActivated.toCallback()));
                return this;
            }
        }
        
        public Builder setTestExpandRow(TestExpandRowCallback testExpandRow) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("test_expand_row"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (testExpandRow == null ? MemoryAddress.NULL : testExpandRow.toCallback()));
                return this;
            }
        }
        
        public Builder setTestCollapseRow(TestCollapseRowCallback testCollapseRow) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("test_collapse_row"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (testCollapseRow == null ? MemoryAddress.NULL : testCollapseRow.toCallback()));
                return this;
            }
        }
        
        public Builder setRowExpanded(RowExpandedCallback rowExpanded) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("row_expanded"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (rowExpanded == null ? MemoryAddress.NULL : rowExpanded.toCallback()));
                return this;
            }
        }
        
        public Builder setRowCollapsed(RowCollapsedCallback rowCollapsed) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("row_collapsed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (rowCollapsed == null ? MemoryAddress.NULL : rowCollapsed.toCallback()));
                return this;
            }
        }
        
        public Builder setColumnsChanged(ColumnsChangedCallback columnsChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("columns_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (columnsChanged == null ? MemoryAddress.NULL : columnsChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setCursorChanged(CursorChangedCallback cursorChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("cursor_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (cursorChanged == null ? MemoryAddress.NULL : cursorChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setMoveCursor(MoveCursorCallback moveCursor) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("move_cursor"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (moveCursor == null ? MemoryAddress.NULL : moveCursor.toCallback()));
                return this;
            }
        }
        
        public Builder setSelectAll(SelectAllCallback selectAll) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("select_all"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (selectAll == null ? MemoryAddress.NULL : selectAll.toCallback()));
                return this;
            }
        }
        
        public Builder setUnselectAll(UnselectAllCallback unselectAll) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unselect_all"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unselectAll == null ? MemoryAddress.NULL : unselectAll.toCallback()));
                return this;
            }
        }
        
        public Builder setSelectCursorRow(SelectCursorRowCallback selectCursorRow) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("select_cursor_row"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (selectCursorRow == null ? MemoryAddress.NULL : selectCursorRow.toCallback()));
                return this;
            }
        }
        
        public Builder setToggleCursorRow(ToggleCursorRowCallback toggleCursorRow) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("toggle_cursor_row"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (toggleCursorRow == null ? MemoryAddress.NULL : toggleCursorRow.toCallback()));
                return this;
            }
        }
        
        public Builder setExpandCollapseCursorRow(ExpandCollapseCursorRowCallback expandCollapseCursorRow) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("expand_collapse_cursor_row"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (expandCollapseCursorRow == null ? MemoryAddress.NULL : expandCollapseCursorRow.toCallback()));
                return this;
            }
        }
        
        public Builder setSelectCursorParent(SelectCursorParentCallback selectCursorParent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("select_cursor_parent"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (selectCursorParent == null ? MemoryAddress.NULL : selectCursorParent.toCallback()));
                return this;
            }
        }
        
        public Builder setStartInteractiveSearch(StartInteractiveSearchCallback startInteractiveSearch) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("start_interactive_search"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (startInteractiveSearch == null ? MemoryAddress.NULL : startInteractiveSearch.toCallback()));
                return this;
            }
        }
        
        public Builder setReserved(java.lang.foreign.MemoryAddress[] Reserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (Reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Reserved, false, SCOPE)));
                return this;
            }
        }
    }
}
