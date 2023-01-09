package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The list of virtual functions for the {@code GtkSelectionModel} interface.
 * No function must be implemented, but unless {@code GtkSelectionModel::is_selected()}
 * is implemented, it will not be possible to select items in the set.
 * <p>
 * The model does not need to implement any functions to support either
 * selecting or unselecting items. Of course, if the model does not do that,
 * it means that users cannot select or unselect items in a list widget
 * using the model.
 * <p>
 * All selection functions fall back to {@code GtkSelectionModel::set_selection()}
 * so it is sufficient to implement just that function for full selection
 * support.
 */
public class SelectionModelInterface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSelectionModelInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("is_selected"),
            Interop.valueLayout.ADDRESS.withName("get_selection_in_range"),
            Interop.valueLayout.ADDRESS.withName("select_item"),
            Interop.valueLayout.ADDRESS.withName("unselect_item"),
            Interop.valueLayout.ADDRESS.withName("select_range"),
            Interop.valueLayout.ADDRESS.withName("unselect_range"),
            Interop.valueLayout.ADDRESS.withName("select_all"),
            Interop.valueLayout.ADDRESS.withName("unselect_all"),
            Interop.valueLayout.ADDRESS.withName("set_selection")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SelectionModelInterface}
     * @return A new, uninitialized @{link SelectionModelInterface}
     */
    public static SelectionModelInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SelectionModelInterface newInstance = new SelectionModelInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code IsSelectedCallback} callback.
     */
    @FunctionalInterface
    public interface IsSelectedCallback {
    
        boolean run(org.gtk.gtk.SelectionModel model, int position);
        
        @ApiStatus.Internal default int upcall(MemoryAddress model, int position) {
            var RESULT = run((org.gtk.gtk.SelectionModel) Interop.register(model, org.gtk.gtk.SelectionModel.fromAddress).marshal(model, null), position);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IsSelectedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_selected}
     * @param isSelected The new value of the field {@code is_selected}
     */
    public void setIsSelected(IsSelectedCallback isSelected) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_selected"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isSelected == null ? MemoryAddress.NULL : isSelected.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetSelectionInRangeCallback} callback.
     */
    @FunctionalInterface
    public interface GetSelectionInRangeCallback {
    
        org.gtk.gtk.Bitset run(org.gtk.gtk.SelectionModel model, int position, int nItems);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress model, int position, int nItems) {
            var RESULT = run((org.gtk.gtk.SelectionModel) Interop.register(model, org.gtk.gtk.SelectionModel.fromAddress).marshal(model, null), position, nItems);
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetSelectionInRangeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_selection_in_range}
     * @param getSelectionInRange The new value of the field {@code get_selection_in_range}
     */
    public void setGetSelectionInRange(GetSelectionInRangeCallback getSelectionInRange) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_selection_in_range"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSelectionInRange == null ? MemoryAddress.NULL : getSelectionInRange.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SelectItemCallback} callback.
     */
    @FunctionalInterface
    public interface SelectItemCallback {
    
        boolean run(org.gtk.gtk.SelectionModel model, int position, boolean unselectRest);
        
        @ApiStatus.Internal default int upcall(MemoryAddress model, int position, int unselectRest) {
            var RESULT = run((org.gtk.gtk.SelectionModel) Interop.register(model, org.gtk.gtk.SelectionModel.fromAddress).marshal(model, null), position, Marshal.integerToBoolean.marshal(unselectRest, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SelectItemCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code select_item}
     * @param selectItem The new value of the field {@code select_item}
     */
    public void setSelectItem(SelectItemCallback selectItem) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("select_item"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (selectItem == null ? MemoryAddress.NULL : selectItem.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UnselectItemCallback} callback.
     */
    @FunctionalInterface
    public interface UnselectItemCallback {
    
        boolean run(org.gtk.gtk.SelectionModel model, int position);
        
        @ApiStatus.Internal default int upcall(MemoryAddress model, int position) {
            var RESULT = run((org.gtk.gtk.SelectionModel) Interop.register(model, org.gtk.gtk.SelectionModel.fromAddress).marshal(model, null), position);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnselectItemCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unselect_item}
     * @param unselectItem The new value of the field {@code unselect_item}
     */
    public void setUnselectItem(UnselectItemCallback unselectItem) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unselect_item"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unselectItem == null ? MemoryAddress.NULL : unselectItem.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SelectRangeCallback} callback.
     */
    @FunctionalInterface
    public interface SelectRangeCallback {
    
        boolean run(org.gtk.gtk.SelectionModel model, int position, int nItems, boolean unselectRest);
        
        @ApiStatus.Internal default int upcall(MemoryAddress model, int position, int nItems, int unselectRest) {
            var RESULT = run((org.gtk.gtk.SelectionModel) Interop.register(model, org.gtk.gtk.SelectionModel.fromAddress).marshal(model, null), position, nItems, Marshal.integerToBoolean.marshal(unselectRest, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SelectRangeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code select_range}
     * @param selectRange The new value of the field {@code select_range}
     */
    public void setSelectRange(SelectRangeCallback selectRange) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("select_range"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (selectRange == null ? MemoryAddress.NULL : selectRange.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UnselectRangeCallback} callback.
     */
    @FunctionalInterface
    public interface UnselectRangeCallback {
    
        boolean run(org.gtk.gtk.SelectionModel model, int position, int nItems);
        
        @ApiStatus.Internal default int upcall(MemoryAddress model, int position, int nItems) {
            var RESULT = run((org.gtk.gtk.SelectionModel) Interop.register(model, org.gtk.gtk.SelectionModel.fromAddress).marshal(model, null), position, nItems);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnselectRangeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unselect_range}
     * @param unselectRange The new value of the field {@code unselect_range}
     */
    public void setUnselectRange(UnselectRangeCallback unselectRange) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unselect_range"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unselectRange == null ? MemoryAddress.NULL : unselectRange.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SelectAllCallback} callback.
     */
    @FunctionalInterface
    public interface SelectAllCallback {
    
        boolean run(org.gtk.gtk.SelectionModel model);
        
        @ApiStatus.Internal default int upcall(MemoryAddress model) {
            var RESULT = run((org.gtk.gtk.SelectionModel) Interop.register(model, org.gtk.gtk.SelectionModel.fromAddress).marshal(model, null));
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
    
        boolean run(org.gtk.gtk.SelectionModel model);
        
        @ApiStatus.Internal default int upcall(MemoryAddress model) {
            var RESULT = run((org.gtk.gtk.SelectionModel) Interop.register(model, org.gtk.gtk.SelectionModel.fromAddress).marshal(model, null));
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
     * Functional interface declaration of the {@code SetSelectionCallback} callback.
     */
    @FunctionalInterface
    public interface SetSelectionCallback {
    
        boolean run(org.gtk.gtk.SelectionModel model, org.gtk.gtk.Bitset selected, org.gtk.gtk.Bitset mask);
        
        @ApiStatus.Internal default int upcall(MemoryAddress model, MemoryAddress selected, MemoryAddress mask) {
            var RESULT = run((org.gtk.gtk.SelectionModel) Interop.register(model, org.gtk.gtk.SelectionModel.fromAddress).marshal(model, null), org.gtk.gtk.Bitset.fromAddress.marshal(selected, null), org.gtk.gtk.Bitset.fromAddress.marshal(mask, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetSelectionCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_selection}
     * @param setSelection The new value of the field {@code set_selection}
     */
    public void setSetSelection(SetSelectionCallback setSelection) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_selection"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setSelection == null ? MemoryAddress.NULL : setSelection.toCallback()));
        }
    }
    
    /**
     * Create a SelectionModelInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SelectionModelInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SelectionModelInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SelectionModelInterface(input);
    
    /**
     * A {@link SelectionModelInterface.Builder} object constructs a {@link SelectionModelInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SelectionModelInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SelectionModelInterface struct;
        
        private Builder() {
            struct = SelectionModelInterface.allocate();
        }
        
        /**
         * Finish building the {@link SelectionModelInterface} struct.
         * @return A new instance of {@code SelectionModelInterface} with the fields 
         *         that were set in the Builder object.
         */
        public SelectionModelInterface build() {
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
        
        public Builder setIsSelected(IsSelectedCallback isSelected) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_selected"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isSelected == null ? MemoryAddress.NULL : isSelected.toCallback()));
                return this;
            }
        }
        
        public Builder setGetSelectionInRange(GetSelectionInRangeCallback getSelectionInRange) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_selection_in_range"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSelectionInRange == null ? MemoryAddress.NULL : getSelectionInRange.toCallback()));
                return this;
            }
        }
        
        public Builder setSelectItem(SelectItemCallback selectItem) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("select_item"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (selectItem == null ? MemoryAddress.NULL : selectItem.toCallback()));
                return this;
            }
        }
        
        public Builder setUnselectItem(UnselectItemCallback unselectItem) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unselect_item"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unselectItem == null ? MemoryAddress.NULL : unselectItem.toCallback()));
                return this;
            }
        }
        
        public Builder setSelectRange(SelectRangeCallback selectRange) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("select_range"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (selectRange == null ? MemoryAddress.NULL : selectRange.toCallback()));
                return this;
            }
        }
        
        public Builder setUnselectRange(UnselectRangeCallback unselectRange) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unselect_range"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unselectRange == null ? MemoryAddress.NULL : unselectRange.toCallback()));
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
        
        public Builder setSetSelection(SetSelectionCallback setSelection) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_selection"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setSelection == null ? MemoryAddress.NULL : setSelection.toCallback()));
                return this;
            }
        }
    }
}
