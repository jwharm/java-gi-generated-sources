package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class MessageDialogClass extends Struct {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwMessageDialogClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.WindowClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("response"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MessageDialogClass}
     * @return A new, uninitialized @{link MessageDialogClass}
     */
    public static MessageDialogClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MessageDialogClass newInstance = new MessageDialogClass(segment.address(), Ownership.NONE);
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
        void run(org.gnome.adw.MessageDialog self, java.lang.String response);

        @ApiStatus.Internal default void upcall(MemoryAddress self, MemoryAddress response) {
            run((org.gnome.adw.MessageDialog) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gnome.adw.MessageDialog.fromAddress).marshal(self, Ownership.NONE), Marshal.addressToString.marshal(response, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
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
    
    /**
     * Create a MessageDialogClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MessageDialogClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MessageDialogClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MessageDialogClass(input, ownership);
    
    /**
     * A {@link MessageDialogClass.Builder} object constructs a {@link MessageDialogClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MessageDialogClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MessageDialogClass struct;
        
        private Builder() {
            struct = MessageDialogClass.allocate();
        }
        
         /**
         * Finish building the {@link MessageDialogClass} struct.
         * @return A new instance of {@code MessageDialogClass} with the fields 
         *         that were set in the Builder object.
         */
        public MessageDialogClass build() {
            return struct;
        }
        
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
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
