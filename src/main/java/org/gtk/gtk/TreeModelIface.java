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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TreeModelIface}
     * @return A new, uninitialized @{link TreeModelIface}
     */
    public static TreeModelIface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TreeModelIface newInstance = new TreeModelIface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code RowChangedCallback} callback.
     */
    @FunctionalInterface
    public interface RowChangedCallback {
    
        void run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreePath path, org.gtk.gtk.TreeIter iter);
        
        @ApiStatus.Internal default void upcall(MemoryAddress treeModel, MemoryAddress path, MemoryAddress iter) {
            run((org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), org.gtk.gtk.TreePath.fromAddress.marshal(path, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RowChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code row_changed}
     * @param rowChanged The new value of the field {@code row_changed}
     */
    public void setRowChanged(RowChangedCallback rowChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (rowChanged == null ? MemoryAddress.NULL : rowChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RowInsertedCallback} callback.
     */
    @FunctionalInterface
    public interface RowInsertedCallback {
    
        void run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreePath path, org.gtk.gtk.TreeIter iter);
        
        @ApiStatus.Internal default void upcall(MemoryAddress treeModel, MemoryAddress path, MemoryAddress iter) {
            run((org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), org.gtk.gtk.TreePath.fromAddress.marshal(path, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RowInsertedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code row_inserted}
     * @param rowInserted The new value of the field {@code row_inserted}
     */
    public void setRowInserted(RowInsertedCallback rowInserted) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_inserted"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (rowInserted == null ? MemoryAddress.NULL : rowInserted.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RowHasChildToggledCallback} callback.
     */
    @FunctionalInterface
    public interface RowHasChildToggledCallback {
    
        void run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreePath path, org.gtk.gtk.TreeIter iter);
        
        @ApiStatus.Internal default void upcall(MemoryAddress treeModel, MemoryAddress path, MemoryAddress iter) {
            run((org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), org.gtk.gtk.TreePath.fromAddress.marshal(path, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RowHasChildToggledCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code row_has_child_toggled}
     * @param rowHasChildToggled The new value of the field {@code row_has_child_toggled}
     */
    public void setRowHasChildToggled(RowHasChildToggledCallback rowHasChildToggled) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_has_child_toggled"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (rowHasChildToggled == null ? MemoryAddress.NULL : rowHasChildToggled.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RowDeletedCallback} callback.
     */
    @FunctionalInterface
    public interface RowDeletedCallback {
    
        void run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreePath path);
        
        @ApiStatus.Internal default void upcall(MemoryAddress treeModel, MemoryAddress path) {
            run((org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), org.gtk.gtk.TreePath.fromAddress.marshal(path, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RowDeletedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code row_deleted}
     * @param rowDeleted The new value of the field {@code row_deleted}
     */
    public void setRowDeleted(RowDeletedCallback rowDeleted) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_deleted"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (rowDeleted == null ? MemoryAddress.NULL : rowDeleted.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RowsReorderedCallback} callback.
     */
    @FunctionalInterface
    public interface RowsReorderedCallback {
    
        void run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreePath path, org.gtk.gtk.TreeIter iter, PointerInteger newOrder);
        
        @ApiStatus.Internal default void upcall(MemoryAddress treeModel, MemoryAddress path, MemoryAddress iter, MemoryAddress newOrder) {
            run((org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), org.gtk.gtk.TreePath.fromAddress.marshal(path, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null), new PointerInteger(newOrder));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RowsReorderedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code rows_reordered}
     * @param rowsReordered The new value of the field {@code rows_reordered}
     */
    public void setRowsReordered(RowsReorderedCallback rowsReordered) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("rows_reordered"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (rowsReordered == null ? MemoryAddress.NULL : rowsReordered.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetFlagsCallback} callback.
     */
    @FunctionalInterface
    public interface GetFlagsCallback {
    
        org.gtk.gtk.TreeModelFlags run(org.gtk.gtk.TreeModel treeModel);
        
        @ApiStatus.Internal default int upcall(MemoryAddress treeModel) {
            var RESULT = run((org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetFlagsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_flags}
     * @param getFlags The new value of the field {@code get_flags}
     */
    public void setGetFlags(GetFlagsCallback getFlags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFlags == null ? MemoryAddress.NULL : getFlags.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetNColumnsCallback} callback.
     */
    @FunctionalInterface
    public interface GetNColumnsCallback {
    
        int run(org.gtk.gtk.TreeModel treeModel);
        
        @ApiStatus.Internal default int upcall(MemoryAddress treeModel) {
            var RESULT = run((org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetNColumnsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_n_columns}
     * @param getNColumns The new value of the field {@code get_n_columns}
     */
    public void setGetNColumns(GetNColumnsCallback getNColumns) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_n_columns"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getNColumns == null ? MemoryAddress.NULL : getNColumns.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetColumnTypeCallback} callback.
     */
    @FunctionalInterface
    public interface GetColumnTypeCallback {
    
        org.gtk.glib.Type run(org.gtk.gtk.TreeModel treeModel, int index);
        
        @ApiStatus.Internal default long upcall(MemoryAddress treeModel, int index) {
            var RESULT = run((org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), index);
            return RESULT.getValue().longValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetColumnTypeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_column_type}
     * @param getColumnType The new value of the field {@code get_column_type}
     */
    public void setGetColumnType(GetColumnTypeCallback getColumnType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_column_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getColumnType == null ? MemoryAddress.NULL : getColumnType.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetIterCallback} callback.
     */
    @FunctionalInterface
    public interface GetIterCallback {
    
        boolean run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter, org.gtk.gtk.TreePath path);
        
        @ApiStatus.Internal default int upcall(MemoryAddress treeModel, MemoryAddress iter, MemoryAddress path) {
            var RESULT = run((org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null), org.gtk.gtk.TreePath.fromAddress.marshal(path, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetIterCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_iter}
     * @param getIter The new value of the field {@code get_iter}
     */
    public void setGetIter(GetIterCallback getIter) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_iter"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getIter == null ? MemoryAddress.NULL : getIter.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetPathCallback} callback.
     */
    @FunctionalInterface
    public interface GetPathCallback {
    
        org.gtk.gtk.TreePath run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress treeModel, MemoryAddress iter) {
            var RESULT = run((org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetPathCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_path}
     * @param getPath The new value of the field {@code get_path}
     */
    public void setGetPath(GetPathCallback getPath) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPath == null ? MemoryAddress.NULL : getPath.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetValueCallback} callback.
     */
    @FunctionalInterface
    public interface GetValueCallback {
    
        void run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter, int column, org.gtk.gobject.Value value);
        
        @ApiStatus.Internal default void upcall(MemoryAddress treeModel, MemoryAddress iter, int column, MemoryAddress value) {
            run((org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null), column, org.gtk.gobject.Value.fromAddress.marshal(value, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetValueCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_value}
     * @param getValue The new value of the field {@code get_value}
     */
    public void setGetValue(GetValueCallback getValue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IterNextCallback} callback.
     */
    @FunctionalInterface
    public interface IterNextCallback {
    
        boolean run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter);
        
        @ApiStatus.Internal default int upcall(MemoryAddress treeModel, MemoryAddress iter) {
            var RESULT = run((org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IterNextCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code iter_next}
     * @param iterNext The new value of the field {@code iter_next}
     */
    public void setIterNext(IterNextCallback iterNext) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_next"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iterNext == null ? MemoryAddress.NULL : iterNext.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IterPreviousCallback} callback.
     */
    @FunctionalInterface
    public interface IterPreviousCallback {
    
        boolean run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter);
        
        @ApiStatus.Internal default int upcall(MemoryAddress treeModel, MemoryAddress iter) {
            var RESULT = run((org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IterPreviousCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code iter_previous}
     * @param iterPrevious The new value of the field {@code iter_previous}
     */
    public void setIterPrevious(IterPreviousCallback iterPrevious) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_previous"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iterPrevious == null ? MemoryAddress.NULL : iterPrevious.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IterChildrenCallback} callback.
     */
    @FunctionalInterface
    public interface IterChildrenCallback {
    
        boolean run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter, @Nullable org.gtk.gtk.TreeIter parent);
        
        @ApiStatus.Internal default int upcall(MemoryAddress treeModel, MemoryAddress iter, MemoryAddress parent) {
            var RESULT = run((org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null), org.gtk.gtk.TreeIter.fromAddress.marshal(parent, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IterChildrenCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code iter_children}
     * @param iterChildren The new value of the field {@code iter_children}
     */
    public void setIterChildren(IterChildrenCallback iterChildren) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_children"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iterChildren == null ? MemoryAddress.NULL : iterChildren.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IterHasChildCallback} callback.
     */
    @FunctionalInterface
    public interface IterHasChildCallback {
    
        boolean run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter);
        
        @ApiStatus.Internal default int upcall(MemoryAddress treeModel, MemoryAddress iter) {
            var RESULT = run((org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IterHasChildCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code iter_has_child}
     * @param iterHasChild The new value of the field {@code iter_has_child}
     */
    public void setIterHasChild(IterHasChildCallback iterHasChild) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_has_child"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iterHasChild == null ? MemoryAddress.NULL : iterHasChild.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IterNChildrenCallback} callback.
     */
    @FunctionalInterface
    public interface IterNChildrenCallback {
    
        int run(org.gtk.gtk.TreeModel treeModel, @Nullable org.gtk.gtk.TreeIter iter);
        
        @ApiStatus.Internal default int upcall(MemoryAddress treeModel, MemoryAddress iter) {
            var RESULT = run((org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IterNChildrenCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code iter_n_children}
     * @param iterNChildren The new value of the field {@code iter_n_children}
     */
    public void setIterNChildren(IterNChildrenCallback iterNChildren) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_n_children"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iterNChildren == null ? MemoryAddress.NULL : iterNChildren.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IterNthChildCallback} callback.
     */
    @FunctionalInterface
    public interface IterNthChildCallback {
    
        boolean run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter, @Nullable org.gtk.gtk.TreeIter parent, int n);
        
        @ApiStatus.Internal default int upcall(MemoryAddress treeModel, MemoryAddress iter, MemoryAddress parent, int n) {
            var RESULT = run((org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null), org.gtk.gtk.TreeIter.fromAddress.marshal(parent, null), n);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IterNthChildCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code iter_nth_child}
     * @param iterNthChild The new value of the field {@code iter_nth_child}
     */
    public void setIterNthChild(IterNthChildCallback iterNthChild) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_nth_child"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iterNthChild == null ? MemoryAddress.NULL : iterNthChild.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IterParentCallback} callback.
     */
    @FunctionalInterface
    public interface IterParentCallback {
    
        boolean run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter, org.gtk.gtk.TreeIter child);
        
        @ApiStatus.Internal default int upcall(MemoryAddress treeModel, MemoryAddress iter, MemoryAddress child) {
            var RESULT = run((org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null), org.gtk.gtk.TreeIter.fromAddress.marshal(child, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IterParentCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code iter_parent}
     * @param iterParent The new value of the field {@code iter_parent}
     */
    public void setIterParent(IterParentCallback iterParent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iterParent == null ? MemoryAddress.NULL : iterParent.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RefNodeCallback} callback.
     */
    @FunctionalInterface
    public interface RefNodeCallback {
    
        void run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter);
        
        @ApiStatus.Internal default void upcall(MemoryAddress treeModel, MemoryAddress iter) {
            run((org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RefNodeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code ref_node}
     * @param refNode The new value of the field {@code ref_node}
     */
    public void setRefNode(RefNodeCallback refNode) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_node"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (refNode == null ? MemoryAddress.NULL : refNode.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UnrefNodeCallback} callback.
     */
    @FunctionalInterface
    public interface UnrefNodeCallback {
    
        void run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter);
        
        @ApiStatus.Internal default void upcall(MemoryAddress treeModel, MemoryAddress iter) {
            run((org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnrefNodeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unref_node}
     * @param unrefNode The new value of the field {@code unref_node}
     */
    public void setUnrefNode(UnrefNodeCallback unrefNode) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unref_node"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unrefNode == null ? MemoryAddress.NULL : unrefNode.toCallback()));
        }
    }
    
    /**
     * Create a TreeModelIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TreeModelIface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeModelIface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TreeModelIface(input);
    
    /**
     * A {@link TreeModelIface.Builder} object constructs a {@link TreeModelIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TreeModelIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TreeModelIface struct;
        
        private Builder() {
            struct = TreeModelIface.allocate();
        }
        
        /**
         * Finish building the {@link TreeModelIface} struct.
         * @return A new instance of {@code TreeModelIface} with the fields 
         *         that were set in the Builder object.
         */
        public TreeModelIface build() {
            return struct;
        }
        
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
                return this;
            }
        }
        
        public Builder setRowChanged(RowChangedCallback rowChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("row_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (rowChanged == null ? MemoryAddress.NULL : rowChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setRowInserted(RowInsertedCallback rowInserted) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("row_inserted"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (rowInserted == null ? MemoryAddress.NULL : rowInserted.toCallback()));
                return this;
            }
        }
        
        public Builder setRowHasChildToggled(RowHasChildToggledCallback rowHasChildToggled) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("row_has_child_toggled"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (rowHasChildToggled == null ? MemoryAddress.NULL : rowHasChildToggled.toCallback()));
                return this;
            }
        }
        
        public Builder setRowDeleted(RowDeletedCallback rowDeleted) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("row_deleted"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (rowDeleted == null ? MemoryAddress.NULL : rowDeleted.toCallback()));
                return this;
            }
        }
        
        public Builder setRowsReordered(RowsReorderedCallback rowsReordered) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("rows_reordered"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (rowsReordered == null ? MemoryAddress.NULL : rowsReordered.toCallback()));
                return this;
            }
        }
        
        public Builder setGetFlags(GetFlagsCallback getFlags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFlags == null ? MemoryAddress.NULL : getFlags.toCallback()));
                return this;
            }
        }
        
        public Builder setGetNColumns(GetNColumnsCallback getNColumns) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_n_columns"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getNColumns == null ? MemoryAddress.NULL : getNColumns.toCallback()));
                return this;
            }
        }
        
        public Builder setGetColumnType(GetColumnTypeCallback getColumnType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_column_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getColumnType == null ? MemoryAddress.NULL : getColumnType.toCallback()));
                return this;
            }
        }
        
        public Builder setGetIter(GetIterCallback getIter) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_iter"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getIter == null ? MemoryAddress.NULL : getIter.toCallback()));
                return this;
            }
        }
        
        public Builder setGetPath(GetPathCallback getPath) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_path"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPath == null ? MemoryAddress.NULL : getPath.toCallback()));
                return this;
            }
        }
        
        public Builder setGetValue(GetValueCallback getValue) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue.toCallback()));
                return this;
            }
        }
        
        public Builder setIterNext(IterNextCallback iterNext) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("iter_next"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iterNext == null ? MemoryAddress.NULL : iterNext.toCallback()));
                return this;
            }
        }
        
        public Builder setIterPrevious(IterPreviousCallback iterPrevious) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("iter_previous"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iterPrevious == null ? MemoryAddress.NULL : iterPrevious.toCallback()));
                return this;
            }
        }
        
        public Builder setIterChildren(IterChildrenCallback iterChildren) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("iter_children"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iterChildren == null ? MemoryAddress.NULL : iterChildren.toCallback()));
                return this;
            }
        }
        
        public Builder setIterHasChild(IterHasChildCallback iterHasChild) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("iter_has_child"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iterHasChild == null ? MemoryAddress.NULL : iterHasChild.toCallback()));
                return this;
            }
        }
        
        public Builder setIterNChildren(IterNChildrenCallback iterNChildren) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("iter_n_children"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iterNChildren == null ? MemoryAddress.NULL : iterNChildren.toCallback()));
                return this;
            }
        }
        
        public Builder setIterNthChild(IterNthChildCallback iterNthChild) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("iter_nth_child"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iterNthChild == null ? MemoryAddress.NULL : iterNthChild.toCallback()));
                return this;
            }
        }
        
        public Builder setIterParent(IterParentCallback iterParent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("iter_parent"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iterParent == null ? MemoryAddress.NULL : iterParent.toCallback()));
                return this;
            }
        }
        
        public Builder setRefNode(RefNodeCallback refNode) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("ref_node"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (refNode == null ? MemoryAddress.NULL : refNode.toCallback()));
                return this;
            }
        }
        
        public Builder setUnrefNode(UnrefNodeCallback unrefNode) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unref_node"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unrefNode == null ? MemoryAddress.NULL : unrefNode.toCallback()));
                return this;
            }
        }
    }
}
