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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        EditableInterface newInstance = new EditableInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code base_iface}
     * @return The value of the field {@code base_iface}
     */
    public org.gtk.gobject.TypeInterface getBaseIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("base_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code base_iface}
     * @param baseIface The new value of the field {@code base_iface}
     */
    public void setBaseIface(org.gtk.gobject.TypeInterface baseIface) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("base_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (baseIface == null ? MemoryAddress.NULL : baseIface.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code InsertTextCallback} callback.
     */
    @FunctionalInterface
    public interface InsertTextCallback {
    
        void run(org.gtk.gtk.Editable editable, java.lang.String text, int length, Out<Integer> position);
        
        @ApiStatus.Internal default void upcall(MemoryAddress editable, MemoryAddress text, int length, MemoryAddress position) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> positionOUT = new Out<>(position.get(Interop.valueLayout.C_INT, 0));
                run((org.gtk.gtk.Editable) Interop.register(editable, org.gtk.gtk.Editable.fromAddress).marshal(editable, null), Marshal.addressToString.marshal(text, null), length, positionOUT);
                position.set(Interop.valueLayout.C_INT, 0, positionOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InsertTextCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code insert_text}
     * @param insertText The new value of the field {@code insert_text}
     */
    public void setInsertText(InsertTextCallback insertText) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("insert_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (insertText == null ? MemoryAddress.NULL : insertText.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DeleteTextCallback} callback.
     */
    @FunctionalInterface
    public interface DeleteTextCallback {
    
        void run(org.gtk.gtk.Editable editable, int startPos, int endPos);
        
        @ApiStatus.Internal default void upcall(MemoryAddress editable, int startPos, int endPos) {
            run((org.gtk.gtk.Editable) Interop.register(editable, org.gtk.gtk.Editable.fromAddress).marshal(editable, null), startPos, endPos);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DeleteTextCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code delete_text}
     * @param deleteText The new value of the field {@code delete_text}
     */
    public void setDeleteText(DeleteTextCallback deleteText) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deleteText == null ? MemoryAddress.NULL : deleteText.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ChangedCallback} callback.
     */
    @FunctionalInterface
    public interface ChangedCallback {
    
        void run(org.gtk.gtk.Editable editable);
        
        @ApiStatus.Internal default void upcall(MemoryAddress editable) {
            run((org.gtk.gtk.Editable) Interop.register(editable, org.gtk.gtk.Editable.fromAddress).marshal(editable, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code changed}
     * @param changed The new value of the field {@code changed}
     */
    public void setChanged(ChangedCallback changed) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (changed == null ? MemoryAddress.NULL : changed.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetTextCallback} callback.
     */
    @FunctionalInterface
    public interface GetTextCallback {
    
        java.lang.String run(org.gtk.gtk.Editable editable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress editable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gtk.Editable) Interop.register(editable, org.gtk.gtk.Editable.fromAddress).marshal(editable, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetTextCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_text}
     * @param getText The new value of the field {@code get_text}
     */
    public void setGetText(GetTextCallback getText) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getText == null ? MemoryAddress.NULL : getText.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DoInsertTextCallback} callback.
     */
    @FunctionalInterface
    public interface DoInsertTextCallback {
    
        void run(org.gtk.gtk.Editable editable, java.lang.String text, int length, Out<Integer> position);
        
        @ApiStatus.Internal default void upcall(MemoryAddress editable, MemoryAddress text, int length, MemoryAddress position) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> positionOUT = new Out<>(position.get(Interop.valueLayout.C_INT, 0));
                run((org.gtk.gtk.Editable) Interop.register(editable, org.gtk.gtk.Editable.fromAddress).marshal(editable, null), Marshal.addressToString.marshal(text, null), length, positionOUT);
                position.set(Interop.valueLayout.C_INT, 0, positionOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DoInsertTextCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code do_insert_text}
     * @param doInsertText The new value of the field {@code do_insert_text}
     */
    public void setDoInsertText(DoInsertTextCallback doInsertText) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("do_insert_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (doInsertText == null ? MemoryAddress.NULL : doInsertText.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DoDeleteTextCallback} callback.
     */
    @FunctionalInterface
    public interface DoDeleteTextCallback {
    
        void run(org.gtk.gtk.Editable editable, int startPos, int endPos);
        
        @ApiStatus.Internal default void upcall(MemoryAddress editable, int startPos, int endPos) {
            run((org.gtk.gtk.Editable) Interop.register(editable, org.gtk.gtk.Editable.fromAddress).marshal(editable, null), startPos, endPos);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DoDeleteTextCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code do_delete_text}
     * @param doDeleteText The new value of the field {@code do_delete_text}
     */
    public void setDoDeleteText(DoDeleteTextCallback doDeleteText) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("do_delete_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (doDeleteText == null ? MemoryAddress.NULL : doDeleteText.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetSelectionBoundsCallback} callback.
     */
    @FunctionalInterface
    public interface GetSelectionBoundsCallback {
    
        boolean run(org.gtk.gtk.Editable editable, Out<Integer> startPos, Out<Integer> endPos);
        
        @ApiStatus.Internal default int upcall(MemoryAddress editable, MemoryAddress startPos, MemoryAddress endPos) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> startPosOUT = new Out<>(startPos.get(Interop.valueLayout.C_INT, 0));
                Out<Integer> endPosOUT = new Out<>(endPos.get(Interop.valueLayout.C_INT, 0));
                var RESULT = run((org.gtk.gtk.Editable) Interop.register(editable, org.gtk.gtk.Editable.fromAddress).marshal(editable, null), startPosOUT, endPosOUT);
                startPos.set(Interop.valueLayout.C_INT, 0, startPosOUT.get());
                endPos.set(Interop.valueLayout.C_INT, 0, endPosOUT.get());
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetSelectionBoundsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_selection_bounds}
     * @param getSelectionBounds The new value of the field {@code get_selection_bounds}
     */
    public void setGetSelectionBounds(GetSelectionBoundsCallback getSelectionBounds) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_selection_bounds"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSelectionBounds == null ? MemoryAddress.NULL : getSelectionBounds.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetSelectionBoundsCallback} callback.
     */
    @FunctionalInterface
    public interface SetSelectionBoundsCallback {
    
        void run(org.gtk.gtk.Editable editable, int startPos, int endPos);
        
        @ApiStatus.Internal default void upcall(MemoryAddress editable, int startPos, int endPos) {
            run((org.gtk.gtk.Editable) Interop.register(editable, org.gtk.gtk.Editable.fromAddress).marshal(editable, null), startPos, endPos);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetSelectionBoundsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_selection_bounds}
     * @param setSelectionBounds The new value of the field {@code set_selection_bounds}
     */
    public void setSetSelectionBounds(SetSelectionBoundsCallback setSelectionBounds) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_selection_bounds"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setSelectionBounds == null ? MemoryAddress.NULL : setSelectionBounds.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetDelegateCallback} callback.
     */
    @FunctionalInterface
    public interface GetDelegateCallback {
    
        @Nullable org.gtk.gtk.Editable run(org.gtk.gtk.Editable editable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress editable) {
            var RESULT = run((org.gtk.gtk.Editable) Interop.register(editable, org.gtk.gtk.Editable.fromAddress).marshal(editable, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetDelegateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_delegate}
     * @param getDelegate The new value of the field {@code get_delegate}
     */
    public void setGetDelegate(GetDelegateCallback getDelegate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_delegate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getDelegate == null ? MemoryAddress.NULL : getDelegate.toCallback()));
        }
    }
    
    /**
     * Create a EditableInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected EditableInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, EditableInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new EditableInterface(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("base_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (baseIface == null ? MemoryAddress.NULL : baseIface.handle()));
                return this;
            }
        }
        
        public Builder setInsertText(InsertTextCallback insertText) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("insert_text"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (insertText == null ? MemoryAddress.NULL : insertText.toCallback()));
                return this;
            }
        }
        
        public Builder setDeleteText(DeleteTextCallback deleteText) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("delete_text"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deleteText == null ? MemoryAddress.NULL : deleteText.toCallback()));
                return this;
            }
        }
        
        public Builder setChanged(ChangedCallback changed) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (changed == null ? MemoryAddress.NULL : changed.toCallback()));
                return this;
            }
        }
        
        public Builder setGetText(GetTextCallback getText) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_text"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getText == null ? MemoryAddress.NULL : getText.toCallback()));
                return this;
            }
        }
        
        public Builder setDoInsertText(DoInsertTextCallback doInsertText) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("do_insert_text"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (doInsertText == null ? MemoryAddress.NULL : doInsertText.toCallback()));
                return this;
            }
        }
        
        public Builder setDoDeleteText(DoDeleteTextCallback doDeleteText) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("do_delete_text"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (doDeleteText == null ? MemoryAddress.NULL : doDeleteText.toCallback()));
                return this;
            }
        }
        
        public Builder setGetSelectionBounds(GetSelectionBoundsCallback getSelectionBounds) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_selection_bounds"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSelectionBounds == null ? MemoryAddress.NULL : getSelectionBounds.toCallback()));
                return this;
            }
        }
        
        public Builder setSetSelectionBounds(SetSelectionBoundsCallback setSelectionBounds) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_selection_bounds"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setSelectionBounds == null ? MemoryAddress.NULL : setSelectionBounds.toCallback()));
                return this;
            }
        }
        
        public Builder setGetDelegate(GetDelegateCallback getDelegate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_delegate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getDelegate == null ? MemoryAddress.NULL : getDelegate.toCallback()));
                return this;
            }
        }
    }
}
