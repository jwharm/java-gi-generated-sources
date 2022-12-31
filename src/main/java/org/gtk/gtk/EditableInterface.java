package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class EditableInterface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkEditableInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("base_iface"),
            Interop.valueLayout.ADDRESS.withName("insert_text"),
            Interop.valueLayout.ADDRESS.withName("delete_text"),
            Interop.valueLayout.ADDRESS.withName("changed"),
            Interop.valueLayout.ADDRESS.withName("get_text"),
            Interop.valueLayout.ADDRESS.withName("do_insert_text"),
            Interop.valueLayout.ADDRESS.withName("do_delete_text"),
            Interop.valueLayout.ADDRESS.withName("get_selection_bounds"),
            Interop.valueLayout.ADDRESS.withName("set_selection_bounds"),
            Interop.valueLayout.ADDRESS.withName("get_delegate")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link EditableInterface}
     * @return A new, uninitialized @{link EditableInterface}
     */
    public static EditableInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        EditableInterface newInstance = new EditableInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code base_iface}
     * @return The value of the field {@code base_iface}
     */
    public org.gtk.gobject.TypeInterface getBaseIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("base_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code base_iface}
     * @param baseIface The new value of the field {@code base_iface}
     */
    public void setBaseIface(org.gtk.gobject.TypeInterface baseIface) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("base_iface"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (baseIface == null ? MemoryAddress.NULL : baseIface.handle()));
    }
    
    @FunctionalInterface
    public interface InsertTextCallback {
        void run(org.gtk.gtk.Editable editable, java.lang.String text, int length, Out<Integer> position);

        @ApiStatus.Internal default void upcall(MemoryAddress editable, MemoryAddress text, int length, MemoryAddress position) {
            Out<Integer> positionOUT = new Out<>(position.get(Interop.valueLayout.C_INT, 0));
            run((org.gtk.gtk.Editable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(editable)), org.gtk.gtk.Editable.fromAddress).marshal(editable, Ownership.NONE), Marshal.addressToString.marshal(text, null), length, positionOUT);
            position.set(Interop.valueLayout.C_INT, 0, positionOUT.get());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InsertTextCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code insert_text}
     * @param insertText The new value of the field {@code insert_text}
     */
    public void setInsertText(InsertTextCallback insertText) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("insert_text"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (insertText == null ? MemoryAddress.NULL : insertText.toCallback()));
    }
    
    @FunctionalInterface
    public interface DeleteTextCallback {
        void run(org.gtk.gtk.Editable editable, int startPos, int endPos);

        @ApiStatus.Internal default void upcall(MemoryAddress editable, int startPos, int endPos) {
            run((org.gtk.gtk.Editable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(editable)), org.gtk.gtk.Editable.fromAddress).marshal(editable, Ownership.NONE), startPos, endPos);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DeleteTextCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code delete_text}
     * @param deleteText The new value of the field {@code delete_text}
     */
    public void setDeleteText(DeleteTextCallback deleteText) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("delete_text"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deleteText == null ? MemoryAddress.NULL : deleteText.toCallback()));
    }
    
    @FunctionalInterface
    public interface ChangedCallback {
        void run(org.gtk.gtk.Editable editable);

        @ApiStatus.Internal default void upcall(MemoryAddress editable) {
            run((org.gtk.gtk.Editable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(editable)), org.gtk.gtk.Editable.fromAddress).marshal(editable, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ChangedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code changed}
     * @param changed The new value of the field {@code changed}
     */
    public void setChanged(ChangedCallback changed) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("changed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changed == null ? MemoryAddress.NULL : changed.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetTextCallback {
        java.lang.String run(org.gtk.gtk.Editable editable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress editable) {
            var RESULT = run((org.gtk.gtk.Editable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(editable)), org.gtk.gtk.Editable.fromAddress).marshal(editable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetTextCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_text}
     * @param getText The new value of the field {@code get_text}
     */
    public void setGetText(GetTextCallback getText) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_text"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getText == null ? MemoryAddress.NULL : getText.toCallback()));
    }
    
    @FunctionalInterface
    public interface DoInsertTextCallback {
        void run(org.gtk.gtk.Editable editable, java.lang.String text, int length, Out<Integer> position);

        @ApiStatus.Internal default void upcall(MemoryAddress editable, MemoryAddress text, int length, MemoryAddress position) {
            Out<Integer> positionOUT = new Out<>(position.get(Interop.valueLayout.C_INT, 0));
            run((org.gtk.gtk.Editable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(editable)), org.gtk.gtk.Editable.fromAddress).marshal(editable, Ownership.NONE), Marshal.addressToString.marshal(text, null), length, positionOUT);
            position.set(Interop.valueLayout.C_INT, 0, positionOUT.get());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DoInsertTextCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code do_insert_text}
     * @param doInsertText The new value of the field {@code do_insert_text}
     */
    public void setDoInsertText(DoInsertTextCallback doInsertText) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("do_insert_text"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (doInsertText == null ? MemoryAddress.NULL : doInsertText.toCallback()));
    }
    
    @FunctionalInterface
    public interface DoDeleteTextCallback {
        void run(org.gtk.gtk.Editable editable, int startPos, int endPos);

        @ApiStatus.Internal default void upcall(MemoryAddress editable, int startPos, int endPos) {
            run((org.gtk.gtk.Editable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(editable)), org.gtk.gtk.Editable.fromAddress).marshal(editable, Ownership.NONE), startPos, endPos);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DoDeleteTextCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code do_delete_text}
     * @param doDeleteText The new value of the field {@code do_delete_text}
     */
    public void setDoDeleteText(DoDeleteTextCallback doDeleteText) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("do_delete_text"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (doDeleteText == null ? MemoryAddress.NULL : doDeleteText.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetSelectionBoundsCallback {
        boolean run(org.gtk.gtk.Editable editable, Out<Integer> startPos, Out<Integer> endPos);

        @ApiStatus.Internal default int upcall(MemoryAddress editable, MemoryAddress startPos, MemoryAddress endPos) {
            Out<Integer> startPosOUT = new Out<>(startPos.get(Interop.valueLayout.C_INT, 0));
            Out<Integer> endPosOUT = new Out<>(endPos.get(Interop.valueLayout.C_INT, 0));
            var RESULT = run((org.gtk.gtk.Editable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(editable)), org.gtk.gtk.Editable.fromAddress).marshal(editable, Ownership.NONE), startPosOUT, endPosOUT);
            startPos.set(Interop.valueLayout.C_INT, 0, startPosOUT.get());
            endPos.set(Interop.valueLayout.C_INT, 0, endPosOUT.get());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetSelectionBoundsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_selection_bounds}
     * @param getSelectionBounds The new value of the field {@code get_selection_bounds}
     */
    public void setGetSelectionBounds(GetSelectionBoundsCallback getSelectionBounds) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_selection_bounds"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSelectionBounds == null ? MemoryAddress.NULL : getSelectionBounds.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetSelectionBoundsCallback {
        void run(org.gtk.gtk.Editable editable, int startPos, int endPos);

        @ApiStatus.Internal default void upcall(MemoryAddress editable, int startPos, int endPos) {
            run((org.gtk.gtk.Editable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(editable)), org.gtk.gtk.Editable.fromAddress).marshal(editable, Ownership.NONE), startPos, endPos);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetSelectionBoundsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_selection_bounds}
     * @param setSelectionBounds The new value of the field {@code set_selection_bounds}
     */
    public void setSetSelectionBounds(SetSelectionBoundsCallback setSelectionBounds) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_selection_bounds"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setSelectionBounds == null ? MemoryAddress.NULL : setSelectionBounds.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetDelegateCallback {
        @Nullable org.gtk.gtk.Editable run(org.gtk.gtk.Editable editable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress editable) {
            var RESULT = run((org.gtk.gtk.Editable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(editable)), org.gtk.gtk.Editable.fromAddress).marshal(editable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetDelegateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_delegate}
     * @param getDelegate The new value of the field {@code get_delegate}
     */
    public void setGetDelegate(GetDelegateCallback getDelegate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_delegate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDelegate == null ? MemoryAddress.NULL : getDelegate.toCallback()));
    }
    
    /**
     * Create a EditableInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected EditableInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, EditableInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new EditableInterface(input, ownership);
    
    /**
     * A {@link EditableInterface.Builder} object constructs a {@link EditableInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link EditableInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final EditableInterface struct;
        
        private Builder() {
            struct = EditableInterface.allocate();
        }
        
         /**
         * Finish building the {@link EditableInterface} struct.
         * @return A new instance of {@code EditableInterface} with the fields 
         *         that were set in the Builder object.
         */
        public EditableInterface build() {
            return struct;
        }
        
        public Builder setBaseIface(org.gtk.gobject.TypeInterface baseIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("base_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (baseIface == null ? MemoryAddress.NULL : baseIface.handle()));
            return this;
        }
        
        public Builder setInsertText(InsertTextCallback insertText) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("insert_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (insertText == null ? MemoryAddress.NULL : insertText.toCallback()));
            return this;
        }
        
        public Builder setDeleteText(DeleteTextCallback deleteText) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deleteText == null ? MemoryAddress.NULL : deleteText.toCallback()));
            return this;
        }
        
        public Builder setChanged(ChangedCallback changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changed == null ? MemoryAddress.NULL : changed.toCallback()));
            return this;
        }
        
        public Builder setGetText(GetTextCallback getText) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getText == null ? MemoryAddress.NULL : getText.toCallback()));
            return this;
        }
        
        public Builder setDoInsertText(DoInsertTextCallback doInsertText) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("do_insert_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (doInsertText == null ? MemoryAddress.NULL : doInsertText.toCallback()));
            return this;
        }
        
        public Builder setDoDeleteText(DoDeleteTextCallback doDeleteText) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("do_delete_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (doDeleteText == null ? MemoryAddress.NULL : doDeleteText.toCallback()));
            return this;
        }
        
        public Builder setGetSelectionBounds(GetSelectionBoundsCallback getSelectionBounds) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_selection_bounds"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSelectionBounds == null ? MemoryAddress.NULL : getSelectionBounds.toCallback()));
            return this;
        }
        
        public Builder setSetSelectionBounds(SetSelectionBoundsCallback setSelectionBounds) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_selection_bounds"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setSelectionBounds == null ? MemoryAddress.NULL : setSelectionBounds.toCallback()));
            return this;
        }
        
        public Builder setGetDelegate(GetDelegateCallback getDelegate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_delegate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDelegate == null ? MemoryAddress.NULL : getDelegate.toCallback()));
            return this;
        }
    }
}
