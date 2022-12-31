package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DialogClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkDialogClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.WindowClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("response"),
            Interop.valueLayout.ADDRESS.withName("close"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DialogClass}
     * @return A new, uninitialized @{link DialogClass}
     */
    public static DialogClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DialogClass newInstance = new DialogClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.WindowClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gtk.WindowClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gtk.WindowClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface ResponseCallback {
        void run(org.gtk.gtk.Dialog dialog, int responseId);

        @ApiStatus.Internal default void upcall(MemoryAddress dialog, int responseId) {
            run((org.gtk.gtk.Dialog) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(dialog)), org.gtk.gtk.Dialog.fromAddress).marshal(dialog, Ownership.NONE), responseId);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ResponseCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code response}
     * @param response The new value of the field {@code response}
     */
    public void setResponse(ResponseCallback response) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("response"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (response == null ? MemoryAddress.NULL : response.toCallback()));
    }
    
    @FunctionalInterface
    public interface CloseCallback {
        void run(org.gtk.gtk.Dialog dialog);

        @ApiStatus.Internal default void upcall(MemoryAddress dialog) {
            run((org.gtk.gtk.Dialog) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(dialog)), org.gtk.gtk.Dialog.fromAddress).marshal(dialog, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CloseCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code close}
     * @param close The new value of the field {@code close}
     */
    public void setClose(CloseCallback close) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("close"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close == null ? MemoryAddress.NULL : close.toCallback()));
    }
    
    /**
     * Create a DialogClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DialogClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DialogClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DialogClass(input, ownership);
    
    /**
     * A {@link DialogClass.Builder} object constructs a {@link DialogClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DialogClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DialogClass struct;
        
        private Builder() {
            struct = DialogClass.allocate();
        }
        
         /**
         * Finish building the {@link DialogClass} struct.
         * @return A new instance of {@code DialogClass} with the fields 
         *         that were set in the Builder object.
         */
        public DialogClass build() {
            return struct;
        }
        
        /**
         * The parent class.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gtk.gtk.WindowClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setResponse(ResponseCallback response) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("response"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (response == null ? MemoryAddress.NULL : response.toCallback()));
            return this;
        }
        
        public Builder setClose(CloseCallback close) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close == null ? MemoryAddress.NULL : close.toCallback()));
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
