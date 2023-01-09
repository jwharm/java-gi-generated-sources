package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TreeSortableIface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeSortableIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("sort_column_changed"),
            Interop.valueLayout.ADDRESS.withName("get_sort_column_id"),
            Interop.valueLayout.ADDRESS.withName("set_sort_column_id"),
            Interop.valueLayout.ADDRESS.withName("set_sort_func"),
            Interop.valueLayout.ADDRESS.withName("set_default_sort_func"),
            Interop.valueLayout.ADDRESS.withName("has_default_sort_func")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TreeSortableIface}
     * @return A new, uninitialized @{link TreeSortableIface}
     */
    public static TreeSortableIface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TreeSortableIface newInstance = new TreeSortableIface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code SortColumnChangedCallback} callback.
     */
    @FunctionalInterface
    public interface SortColumnChangedCallback {
    
        void run(org.gtk.gtk.TreeSortable sortable);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sortable) {
            run((org.gtk.gtk.TreeSortable) Interop.register(sortable, org.gtk.gtk.TreeSortable.fromAddress).marshal(sortable, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SortColumnChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code sort_column_changed}
     * @param sortColumnChanged The new value of the field {@code sort_column_changed}
     */
    public void setSortColumnChanged(SortColumnChangedCallback sortColumnChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sort_column_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sortColumnChanged == null ? MemoryAddress.NULL : sortColumnChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetSortColumnIdCallback} callback.
     */
    @FunctionalInterface
    public interface GetSortColumnIdCallback {
    
        boolean run(org.gtk.gtk.TreeSortable sortable, Out<Integer> sortColumnId, Out<org.gtk.gtk.SortType> order);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sortable, MemoryAddress sortColumnId, MemoryAddress order) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> sortColumnIdOUT = new Out<>(sortColumnId.get(Interop.valueLayout.C_INT, 0));
                Out<org.gtk.gtk.SortType> orderOUT = new Out<>(org.gtk.gtk.SortType.of(order.get(Interop.valueLayout.C_INT, 0)));
                var RESULT = run((org.gtk.gtk.TreeSortable) Interop.register(sortable, org.gtk.gtk.TreeSortable.fromAddress).marshal(sortable, null), sortColumnIdOUT, orderOUT);
                sortColumnId.set(Interop.valueLayout.C_INT, 0, sortColumnIdOUT.get());
                order.set(Interop.valueLayout.C_INT, 0, orderOUT.get().getValue());
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetSortColumnIdCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_sort_column_id}
     * @param getSortColumnId The new value of the field {@code get_sort_column_id}
     */
    public void setGetSortColumnId(GetSortColumnIdCallback getSortColumnId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_sort_column_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSortColumnId == null ? MemoryAddress.NULL : getSortColumnId.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetSortColumnIdCallback} callback.
     */
    @FunctionalInterface
    public interface SetSortColumnIdCallback {
    
        void run(org.gtk.gtk.TreeSortable sortable, int sortColumnId, org.gtk.gtk.SortType order);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sortable, int sortColumnId, int order) {
            run((org.gtk.gtk.TreeSortable) Interop.register(sortable, org.gtk.gtk.TreeSortable.fromAddress).marshal(sortable, null), sortColumnId, org.gtk.gtk.SortType.of(order));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetSortColumnIdCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_sort_column_id}
     * @param setSortColumnId The new value of the field {@code set_sort_column_id}
     */
    public void setSetSortColumnId(SetSortColumnIdCallback setSortColumnId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_sort_column_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setSortColumnId == null ? MemoryAddress.NULL : setSortColumnId.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetSortFuncCallback} callback.
     */
    @FunctionalInterface
    public interface SetSortFuncCallback {
    
        void run(org.gtk.gtk.TreeSortable sortable, int sortColumnId, org.gtk.gtk.TreeIterCompareFunc sortFunc, @Nullable org.gtk.glib.DestroyNotify destroy);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sortable, int sortColumnId, MemoryAddress sortFunc, MemoryAddress userData, MemoryAddress destroy) {
            run((org.gtk.gtk.TreeSortable) Interop.register(sortable, org.gtk.gtk.TreeSortable.fromAddress).marshal(sortable, null), sortColumnId, null /* Unsupported parameter type */, null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetSortFuncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_sort_func}
     * @param setSortFunc The new value of the field {@code set_sort_func}
     */
    public void setSetSortFunc(SetSortFuncCallback setSortFunc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_sort_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setSortFunc == null ? MemoryAddress.NULL : setSortFunc.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetDefaultSortFuncCallback} callback.
     */
    @FunctionalInterface
    public interface SetDefaultSortFuncCallback {
    
        void run(org.gtk.gtk.TreeSortable sortable, org.gtk.gtk.TreeIterCompareFunc sortFunc, @Nullable org.gtk.glib.DestroyNotify destroy);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sortable, MemoryAddress sortFunc, MemoryAddress userData, MemoryAddress destroy) {
            run((org.gtk.gtk.TreeSortable) Interop.register(sortable, org.gtk.gtk.TreeSortable.fromAddress).marshal(sortable, null), null /* Unsupported parameter type */, null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetDefaultSortFuncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_default_sort_func}
     * @param setDefaultSortFunc The new value of the field {@code set_default_sort_func}
     */
    public void setSetDefaultSortFunc(SetDefaultSortFuncCallback setDefaultSortFunc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_default_sort_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setDefaultSortFunc == null ? MemoryAddress.NULL : setDefaultSortFunc.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code HasDefaultSortFuncCallback} callback.
     */
    @FunctionalInterface
    public interface HasDefaultSortFuncCallback {
    
        boolean run(org.gtk.gtk.TreeSortable sortable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sortable) {
            var RESULT = run((org.gtk.gtk.TreeSortable) Interop.register(sortable, org.gtk.gtk.TreeSortable.fromAddress).marshal(sortable, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HasDefaultSortFuncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code has_default_sort_func}
     * @param hasDefaultSortFunc The new value of the field {@code has_default_sort_func}
     */
    public void setHasDefaultSortFunc(HasDefaultSortFuncCallback hasDefaultSortFunc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("has_default_sort_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hasDefaultSortFunc == null ? MemoryAddress.NULL : hasDefaultSortFunc.toCallback()));
        }
    }
    
    /**
     * Create a TreeSortableIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TreeSortableIface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeSortableIface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TreeSortableIface(input);
    
    /**
     * A {@link TreeSortableIface.Builder} object constructs a {@link TreeSortableIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TreeSortableIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TreeSortableIface struct;
        
        private Builder() {
            struct = TreeSortableIface.allocate();
        }
        
        /**
         * Finish building the {@link TreeSortableIface} struct.
         * @return A new instance of {@code TreeSortableIface} with the fields 
         *         that were set in the Builder object.
         */
        public TreeSortableIface build() {
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
        
        public Builder setSortColumnChanged(SortColumnChangedCallback sortColumnChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("sort_column_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sortColumnChanged == null ? MemoryAddress.NULL : sortColumnChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setGetSortColumnId(GetSortColumnIdCallback getSortColumnId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_sort_column_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSortColumnId == null ? MemoryAddress.NULL : getSortColumnId.toCallback()));
                return this;
            }
        }
        
        public Builder setSetSortColumnId(SetSortColumnIdCallback setSortColumnId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_sort_column_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setSortColumnId == null ? MemoryAddress.NULL : setSortColumnId.toCallback()));
                return this;
            }
        }
        
        public Builder setSetSortFunc(SetSortFuncCallback setSortFunc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_sort_func"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setSortFunc == null ? MemoryAddress.NULL : setSortFunc.toCallback()));
                return this;
            }
        }
        
        public Builder setSetDefaultSortFunc(SetDefaultSortFuncCallback setDefaultSortFunc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_default_sort_func"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setDefaultSortFunc == null ? MemoryAddress.NULL : setDefaultSortFunc.toCallback()));
                return this;
            }
        }
        
        public Builder setHasDefaultSortFunc(HasDefaultSortFuncCallback hasDefaultSortFunc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("has_default_sort_func"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hasDefaultSortFunc == null ? MemoryAddress.NULL : hasDefaultSortFunc.toCallback()));
                return this;
            }
        }
    }
}
