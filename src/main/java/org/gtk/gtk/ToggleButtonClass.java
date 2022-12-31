package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ToggleButtonClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkToggleButtonClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.ButtonClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("toggled"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ToggleButtonClass}
     * @return A new, uninitialized @{link ToggleButtonClass}
     */
    public static ToggleButtonClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ToggleButtonClass newInstance = new ToggleButtonClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.ButtonClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gtk.ButtonClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gtk.ButtonClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface ToggledCallback {
        void run(org.gtk.gtk.ToggleButton toggleButton);

        @ApiStatus.Internal default void upcall(MemoryAddress toggleButton) {
            run((org.gtk.gtk.ToggleButton) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(toggleButton)), org.gtk.gtk.ToggleButton.fromAddress).marshal(toggleButton, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ToggledCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code toggled}
     * @param toggled The new value of the field {@code toggled}
     */
    public void setToggled(ToggledCallback toggled) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("toggled"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (toggled == null ? MemoryAddress.NULL : toggled.toCallback()));
    }
    
    /**
     * Create a ToggleButtonClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ToggleButtonClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ToggleButtonClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ToggleButtonClass(input, ownership);
    
    /**
     * A {@link ToggleButtonClass.Builder} object constructs a {@link ToggleButtonClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ToggleButtonClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ToggleButtonClass struct;
        
        private Builder() {
            struct = ToggleButtonClass.allocate();
        }
        
         /**
         * Finish building the {@link ToggleButtonClass} struct.
         * @return A new instance of {@code ToggleButtonClass} with the fields 
         *         that were set in the Builder object.
         */
        public ToggleButtonClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gtk.ButtonClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setToggled(ToggledCallback toggled) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("toggled"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (toggled == null ? MemoryAddress.NULL : toggled.toCallback()));
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
