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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SelectionModelInterface newInstance = new SelectionModelInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface IsSelectedCallback {
        boolean run(org.gtk.gtk.SelectionModel model, int position);

        @ApiStatus.Internal default int upcall(MemoryAddress model, int position) {
            var RESULT = run((org.gtk.gtk.SelectionModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(model)), org.gtk.gtk.SelectionModel.fromAddress).marshal(model, Ownership.NONE), position);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IsSelectedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_selected}
     * @param isSelected The new value of the field {@code is_selected}
     */
    public void setIsSelected(IsSelectedCallback isSelected) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_selected"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isSelected == null ? MemoryAddress.NULL : isSelected.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetSelectionInRangeCallback {
        org.gtk.gtk.Bitset run(org.gtk.gtk.SelectionModel model, int position, int nItems);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress model, int position, int nItems) {
            var RESULT = run((org.gtk.gtk.SelectionModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(model)), org.gtk.gtk.SelectionModel.fromAddress).marshal(model, Ownership.NONE), position, nItems);
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetSelectionInRangeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_selection_in_range}
     * @param getSelectionInRange The new value of the field {@code get_selection_in_range}
     */
    public void setGetSelectionInRange(GetSelectionInRangeCallback getSelectionInRange) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_selection_in_range"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSelectionInRange == null ? MemoryAddress.NULL : getSelectionInRange.toCallback()));
    }
    
    @FunctionalInterface
    public interface SelectItemCallback {
        boolean run(org.gtk.gtk.SelectionModel model, int position, boolean unselectRest);

        @ApiStatus.Internal default int upcall(MemoryAddress model, int position, int unselectRest) {
            var RESULT = run((org.gtk.gtk.SelectionModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(model)), org.gtk.gtk.SelectionModel.fromAddress).marshal(model, Ownership.NONE), position, Marshal.integerToBoolean.marshal(unselectRest, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SelectItemCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code select_item}
     * @param selectItem The new value of the field {@code select_item}
     */
    public void setSelectItem(SelectItemCallback selectItem) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("select_item"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (selectItem == null ? MemoryAddress.NULL : selectItem.toCallback()));
    }
    
    @FunctionalInterface
    public interface UnselectItemCallback {
        boolean run(org.gtk.gtk.SelectionModel model, int position);

        @ApiStatus.Internal default int upcall(MemoryAddress model, int position) {
            var RESULT = run((org.gtk.gtk.SelectionModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(model)), org.gtk.gtk.SelectionModel.fromAddress).marshal(model, Ownership.NONE), position);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnselectItemCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unselect_item}
     * @param unselectItem The new value of the field {@code unselect_item}
     */
    public void setUnselectItem(UnselectItemCallback unselectItem) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unselect_item"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unselectItem == null ? MemoryAddress.NULL : unselectItem.toCallback()));
    }
    
    @FunctionalInterface
    public interface SelectRangeCallback {
        boolean run(org.gtk.gtk.SelectionModel model, int position, int nItems, boolean unselectRest);

        @ApiStatus.Internal default int upcall(MemoryAddress model, int position, int nItems, int unselectRest) {
            var RESULT = run((org.gtk.gtk.SelectionModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(model)), org.gtk.gtk.SelectionModel.fromAddress).marshal(model, Ownership.NONE), position, nItems, Marshal.integerToBoolean.marshal(unselectRest, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SelectRangeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code select_range}
     * @param selectRange The new value of the field {@code select_range}
     */
    public void setSelectRange(SelectRangeCallback selectRange) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("select_range"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (selectRange == null ? MemoryAddress.NULL : selectRange.toCallback()));
    }
    
    @FunctionalInterface
    public interface UnselectRangeCallback {
        boolean run(org.gtk.gtk.SelectionModel model, int position, int nItems);

        @ApiStatus.Internal default int upcall(MemoryAddress model, int position, int nItems) {
            var RESULT = run((org.gtk.gtk.SelectionModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(model)), org.gtk.gtk.SelectionModel.fromAddress).marshal(model, Ownership.NONE), position, nItems);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnselectRangeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unselect_range}
     * @param unselectRange The new value of the field {@code unselect_range}
     */
    public void setUnselectRange(UnselectRangeCallback unselectRange) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unselect_range"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unselectRange == null ? MemoryAddress.NULL : unselectRange.toCallback()));
    }
    
    @FunctionalInterface
    public interface SelectAllCallback {
        boolean run(org.gtk.gtk.SelectionModel model);

        @ApiStatus.Internal default int upcall(MemoryAddress model) {
            var RESULT = run((org.gtk.gtk.SelectionModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(model)), org.gtk.gtk.SelectionModel.fromAddress).marshal(model, Ownership.NONE));
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
        boolean run(org.gtk.gtk.SelectionModel model);

        @ApiStatus.Internal default int upcall(MemoryAddress model) {
            var RESULT = run((org.gtk.gtk.SelectionModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(model)), org.gtk.gtk.SelectionModel.fromAddress).marshal(model, Ownership.NONE));
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
    public interface SetSelectionCallback {
        boolean run(org.gtk.gtk.SelectionModel model, org.gtk.gtk.Bitset selected, org.gtk.gtk.Bitset mask);

        @ApiStatus.Internal default int upcall(MemoryAddress model, MemoryAddress selected, MemoryAddress mask) {
            var RESULT = run((org.gtk.gtk.SelectionModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(model)), org.gtk.gtk.SelectionModel.fromAddress).marshal(model, Ownership.NONE), org.gtk.gtk.Bitset.fromAddress.marshal(selected, Ownership.NONE), org.gtk.gtk.Bitset.fromAddress.marshal(mask, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetSelectionCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_selection}
     * @param setSelection The new value of the field {@code set_selection}
     */
    public void setSetSelection(SetSelectionCallback setSelection) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_selection"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setSelection == null ? MemoryAddress.NULL : setSelection.toCallback()));
    }
    
    /**
     * Create a SelectionModelInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SelectionModelInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SelectionModelInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SelectionModelInterface(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setIsSelected(IsSelectedCallback isSelected) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_selected"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isSelected == null ? MemoryAddress.NULL : isSelected.toCallback()));
            return this;
        }
        
        public Builder setGetSelectionInRange(GetSelectionInRangeCallback getSelectionInRange) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_selection_in_range"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSelectionInRange == null ? MemoryAddress.NULL : getSelectionInRange.toCallback()));
            return this;
        }
        
        public Builder setSelectItem(SelectItemCallback selectItem) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("select_item"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (selectItem == null ? MemoryAddress.NULL : selectItem.toCallback()));
            return this;
        }
        
        public Builder setUnselectItem(UnselectItemCallback unselectItem) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unselect_item"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unselectItem == null ? MemoryAddress.NULL : unselectItem.toCallback()));
            return this;
        }
        
        public Builder setSelectRange(SelectRangeCallback selectRange) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("select_range"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (selectRange == null ? MemoryAddress.NULL : selectRange.toCallback()));
            return this;
        }
        
        public Builder setUnselectRange(UnselectRangeCallback unselectRange) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unselect_range"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unselectRange == null ? MemoryAddress.NULL : unselectRange.toCallback()));
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
        
        public Builder setSetSelection(SetSelectionCallback setSelection) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_selection"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setSelection == null ? MemoryAddress.NULL : setSelection.toCallback()));
            return this;
        }
    }
}
