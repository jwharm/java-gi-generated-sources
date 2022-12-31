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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TreeModelIface newInstance = new TreeModelIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface RowChangedCallback {
        void run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreePath path, org.gtk.gtk.TreeIter iter);

        @ApiStatus.Internal default void upcall(MemoryAddress treeModel, MemoryAddress path, MemoryAddress iter) {
            run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RowChangedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code row_changed}
     * @param rowChanged The new value of the field {@code row_changed}
     */
    public void setRowChanged(RowChangedCallback rowChanged) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("row_changed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowChanged == null ? MemoryAddress.NULL : rowChanged.toCallback()));
    }
    
    @FunctionalInterface
    public interface RowInsertedCallback {
        void run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreePath path, org.gtk.gtk.TreeIter iter);

        @ApiStatus.Internal default void upcall(MemoryAddress treeModel, MemoryAddress path, MemoryAddress iter) {
            run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RowInsertedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code row_inserted}
     * @param rowInserted The new value of the field {@code row_inserted}
     */
    public void setRowInserted(RowInsertedCallback rowInserted) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("row_inserted"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowInserted == null ? MemoryAddress.NULL : rowInserted.toCallback()));
    }
    
    @FunctionalInterface
    public interface RowHasChildToggledCallback {
        void run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreePath path, org.gtk.gtk.TreeIter iter);

        @ApiStatus.Internal default void upcall(MemoryAddress treeModel, MemoryAddress path, MemoryAddress iter) {
            run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RowHasChildToggledCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code row_has_child_toggled}
     * @param rowHasChildToggled The new value of the field {@code row_has_child_toggled}
     */
    public void setRowHasChildToggled(RowHasChildToggledCallback rowHasChildToggled) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("row_has_child_toggled"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowHasChildToggled == null ? MemoryAddress.NULL : rowHasChildToggled.toCallback()));
    }
    
    @FunctionalInterface
    public interface RowDeletedCallback {
        void run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreePath path);

        @ApiStatus.Internal default void upcall(MemoryAddress treeModel, MemoryAddress path) {
            run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RowDeletedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code row_deleted}
     * @param rowDeleted The new value of the field {@code row_deleted}
     */
    public void setRowDeleted(RowDeletedCallback rowDeleted) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("row_deleted"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowDeleted == null ? MemoryAddress.NULL : rowDeleted.toCallback()));
    }
    
    @FunctionalInterface
    public interface RowsReorderedCallback {
        void run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreePath path, org.gtk.gtk.TreeIter iter, PointerInteger newOrder);

        @ApiStatus.Internal default void upcall(MemoryAddress treeModel, MemoryAddress path, MemoryAddress iter, MemoryAddress newOrder) {
            run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE), new PointerInteger(newOrder));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RowsReorderedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code rows_reordered}
     * @param rowsReordered The new value of the field {@code rows_reordered}
     */
    public void setRowsReordered(RowsReorderedCallback rowsReordered) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("rows_reordered"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowsReordered == null ? MemoryAddress.NULL : rowsReordered.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetFlagsCallback {
        org.gtk.gtk.TreeModelFlags run(org.gtk.gtk.TreeModel treeModel);

        @ApiStatus.Internal default int upcall(MemoryAddress treeModel) {
            var RESULT = run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetFlagsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_flags}
     * @param getFlags The new value of the field {@code get_flags}
     */
    public void setGetFlags(GetFlagsCallback getFlags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFlags == null ? MemoryAddress.NULL : getFlags.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetNColumnsCallback {
        int run(org.gtk.gtk.TreeModel treeModel);

        @ApiStatus.Internal default int upcall(MemoryAddress treeModel) {
            var RESULT = run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetNColumnsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_n_columns}
     * @param getNColumns The new value of the field {@code get_n_columns}
     */
    public void setGetNColumns(GetNColumnsCallback getNColumns) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_n_columns"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getNColumns == null ? MemoryAddress.NULL : getNColumns.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetColumnTypeCallback {
        org.gtk.glib.Type run(org.gtk.gtk.TreeModel treeModel, int index);

        @ApiStatus.Internal default long upcall(MemoryAddress treeModel, int index) {
            var RESULT = run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), index);
            return RESULT.getValue().longValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetColumnTypeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_column_type}
     * @param getColumnType The new value of the field {@code get_column_type}
     */
    public void setGetColumnType(GetColumnTypeCallback getColumnType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_column_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getColumnType == null ? MemoryAddress.NULL : getColumnType.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetIterCallback {
        boolean run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter, org.gtk.gtk.TreePath path);

        @ApiStatus.Internal default int upcall(MemoryAddress treeModel, MemoryAddress iter, MemoryAddress path) {
            var RESULT = run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetIterCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_iter}
     * @param getIter The new value of the field {@code get_iter}
     */
    public void setGetIter(GetIterCallback getIter) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_iter"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getIter == null ? MemoryAddress.NULL : getIter.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetPathCallback {
        org.gtk.gtk.TreePath run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress treeModel, MemoryAddress iter) {
            var RESULT = run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetPathCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_path}
     * @param getPath The new value of the field {@code get_path}
     */
    public void setGetPath(GetPathCallback getPath) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_path"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPath == null ? MemoryAddress.NULL : getPath.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetValueCallback {
        void run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter, int column, org.gtk.gobject.Value value);

        @ApiStatus.Internal default void upcall(MemoryAddress treeModel, MemoryAddress iter, int column, MemoryAddress value) {
            run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE), column, org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetValueCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_value}
     * @param getValue The new value of the field {@code get_value}
     */
    public void setGetValue(GetValueCallback getValue) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue.toCallback()));
    }
    
    @FunctionalInterface
    public interface IterNextCallback {
        boolean run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter);

        @ApiStatus.Internal default int upcall(MemoryAddress treeModel, MemoryAddress iter) {
            var RESULT = run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IterNextCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code iter_next}
     * @param iterNext The new value of the field {@code iter_next}
     */
    public void setIterNext(IterNextCallback iterNext) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("iter_next"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterNext == null ? MemoryAddress.NULL : iterNext.toCallback()));
    }
    
    @FunctionalInterface
    public interface IterPreviousCallback {
        boolean run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter);

        @ApiStatus.Internal default int upcall(MemoryAddress treeModel, MemoryAddress iter) {
            var RESULT = run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IterPreviousCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code iter_previous}
     * @param iterPrevious The new value of the field {@code iter_previous}
     */
    public void setIterPrevious(IterPreviousCallback iterPrevious) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("iter_previous"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterPrevious == null ? MemoryAddress.NULL : iterPrevious.toCallback()));
    }
    
    @FunctionalInterface
    public interface IterChildrenCallback {
        boolean run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter, @Nullable org.gtk.gtk.TreeIter parent);

        @ApiStatus.Internal default int upcall(MemoryAddress treeModel, MemoryAddress iter, MemoryAddress parent) {
            var RESULT = run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(parent, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IterChildrenCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code iter_children}
     * @param iterChildren The new value of the field {@code iter_children}
     */
    public void setIterChildren(IterChildrenCallback iterChildren) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("iter_children"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterChildren == null ? MemoryAddress.NULL : iterChildren.toCallback()));
    }
    
    @FunctionalInterface
    public interface IterHasChildCallback {
        boolean run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter);

        @ApiStatus.Internal default int upcall(MemoryAddress treeModel, MemoryAddress iter) {
            var RESULT = run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IterHasChildCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code iter_has_child}
     * @param iterHasChild The new value of the field {@code iter_has_child}
     */
    public void setIterHasChild(IterHasChildCallback iterHasChild) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("iter_has_child"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterHasChild == null ? MemoryAddress.NULL : iterHasChild.toCallback()));
    }
    
    @FunctionalInterface
    public interface IterNChildrenCallback {
        int run(org.gtk.gtk.TreeModel treeModel, @Nullable org.gtk.gtk.TreeIter iter);

        @ApiStatus.Internal default int upcall(MemoryAddress treeModel, MemoryAddress iter) {
            var RESULT = run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IterNChildrenCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code iter_n_children}
     * @param iterNChildren The new value of the field {@code iter_n_children}
     */
    public void setIterNChildren(IterNChildrenCallback iterNChildren) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("iter_n_children"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterNChildren == null ? MemoryAddress.NULL : iterNChildren.toCallback()));
    }
    
    @FunctionalInterface
    public interface IterNthChildCallback {
        boolean run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter, @Nullable org.gtk.gtk.TreeIter parent, int n);

        @ApiStatus.Internal default int upcall(MemoryAddress treeModel, MemoryAddress iter, MemoryAddress parent, int n) {
            var RESULT = run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(parent, Ownership.NONE), n);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IterNthChildCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code iter_nth_child}
     * @param iterNthChild The new value of the field {@code iter_nth_child}
     */
    public void setIterNthChild(IterNthChildCallback iterNthChild) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("iter_nth_child"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterNthChild == null ? MemoryAddress.NULL : iterNthChild.toCallback()));
    }
    
    @FunctionalInterface
    public interface IterParentCallback {
        boolean run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter, org.gtk.gtk.TreeIter child);

        @ApiStatus.Internal default int upcall(MemoryAddress treeModel, MemoryAddress iter, MemoryAddress child) {
            var RESULT = run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(child, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IterParentCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code iter_parent}
     * @param iterParent The new value of the field {@code iter_parent}
     */
    public void setIterParent(IterParentCallback iterParent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("iter_parent"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterParent == null ? MemoryAddress.NULL : iterParent.toCallback()));
    }
    
    @FunctionalInterface
    public interface RefNodeCallback {
        void run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter);

        @ApiStatus.Internal default void upcall(MemoryAddress treeModel, MemoryAddress iter) {
            run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RefNodeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code ref_node}
     * @param refNode The new value of the field {@code ref_node}
     */
    public void setRefNode(RefNodeCallback refNode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ref_node"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (refNode == null ? MemoryAddress.NULL : refNode.toCallback()));
    }
    
    @FunctionalInterface
    public interface UnrefNodeCallback {
        void run(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter);

        @ApiStatus.Internal default void upcall(MemoryAddress treeModel, MemoryAddress iter) {
            run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnrefNodeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unref_node}
     * @param unrefNode The new value of the field {@code unref_node}
     */
    public void setUnrefNode(UnrefNodeCallback unrefNode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unref_node"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unrefNode == null ? MemoryAddress.NULL : unrefNode.toCallback()));
    }
    
    /**
     * Create a TreeModelIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TreeModelIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeModelIface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TreeModelIface(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setRowChanged(RowChangedCallback rowChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowChanged == null ? MemoryAddress.NULL : rowChanged.toCallback()));
            return this;
        }
        
        public Builder setRowInserted(RowInsertedCallback rowInserted) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_inserted"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowInserted == null ? MemoryAddress.NULL : rowInserted.toCallback()));
            return this;
        }
        
        public Builder setRowHasChildToggled(RowHasChildToggledCallback rowHasChildToggled) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_has_child_toggled"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowHasChildToggled == null ? MemoryAddress.NULL : rowHasChildToggled.toCallback()));
            return this;
        }
        
        public Builder setRowDeleted(RowDeletedCallback rowDeleted) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_deleted"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowDeleted == null ? MemoryAddress.NULL : rowDeleted.toCallback()));
            return this;
        }
        
        public Builder setRowsReordered(RowsReorderedCallback rowsReordered) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("rows_reordered"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowsReordered == null ? MemoryAddress.NULL : rowsReordered.toCallback()));
            return this;
        }
        
        public Builder setGetFlags(GetFlagsCallback getFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFlags == null ? MemoryAddress.NULL : getFlags.toCallback()));
            return this;
        }
        
        public Builder setGetNColumns(GetNColumnsCallback getNColumns) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_n_columns"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getNColumns == null ? MemoryAddress.NULL : getNColumns.toCallback()));
            return this;
        }
        
        public Builder setGetColumnType(GetColumnTypeCallback getColumnType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_column_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getColumnType == null ? MemoryAddress.NULL : getColumnType.toCallback()));
            return this;
        }
        
        public Builder setGetIter(GetIterCallback getIter) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_iter"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getIter == null ? MemoryAddress.NULL : getIter.toCallback()));
            return this;
        }
        
        public Builder setGetPath(GetPathCallback getPath) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPath == null ? MemoryAddress.NULL : getPath.toCallback()));
            return this;
        }
        
        public Builder setGetValue(GetValueCallback getValue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue.toCallback()));
            return this;
        }
        
        public Builder setIterNext(IterNextCallback iterNext) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_next"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterNext == null ? MemoryAddress.NULL : iterNext.toCallback()));
            return this;
        }
        
        public Builder setIterPrevious(IterPreviousCallback iterPrevious) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_previous"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterPrevious == null ? MemoryAddress.NULL : iterPrevious.toCallback()));
            return this;
        }
        
        public Builder setIterChildren(IterChildrenCallback iterChildren) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_children"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterChildren == null ? MemoryAddress.NULL : iterChildren.toCallback()));
            return this;
        }
        
        public Builder setIterHasChild(IterHasChildCallback iterHasChild) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_has_child"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterHasChild == null ? MemoryAddress.NULL : iterHasChild.toCallback()));
            return this;
        }
        
        public Builder setIterNChildren(IterNChildrenCallback iterNChildren) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_n_children"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterNChildren == null ? MemoryAddress.NULL : iterNChildren.toCallback()));
            return this;
        }
        
        public Builder setIterNthChild(IterNthChildCallback iterNthChild) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_nth_child"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterNthChild == null ? MemoryAddress.NULL : iterNthChild.toCallback()));
            return this;
        }
        
        public Builder setIterParent(IterParentCallback iterParent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iter_parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterParent == null ? MemoryAddress.NULL : iterParent.toCallback()));
            return this;
        }
        
        public Builder setRefNode(RefNodeCallback refNode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_node"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (refNode == null ? MemoryAddress.NULL : refNode.toCallback()));
            return this;
        }
        
        public Builder setUnrefNode(UnrefNodeCallback unrefNode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unref_node"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unrefNode == null ? MemoryAddress.NULL : unrefNode.toCallback()));
            return this;
        }
    }
}
