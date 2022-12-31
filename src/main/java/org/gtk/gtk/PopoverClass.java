package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PopoverClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPopoverClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("closed"),
            Interop.valueLayout.ADDRESS.withName("activate_default"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PopoverClass}
     * @return A new, uninitialized @{link PopoverClass}
     */
    public static PopoverClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PopoverClass newInstance = new PopoverClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.WidgetClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gtk.WidgetClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gtk.WidgetClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface ClosedCallback {
        void run(org.gtk.gtk.Popover popover);

        @ApiStatus.Internal default void upcall(MemoryAddress popover) {
            run((org.gtk.gtk.Popover) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(popover)), org.gtk.gtk.Popover.fromAddress).marshal(popover, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ClosedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code closed}
     * @param closed The new value of the field {@code closed}
     */
    public void setClosed(ClosedCallback closed) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("closed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closed == null ? MemoryAddress.NULL : closed.toCallback()));
    }
    
    @FunctionalInterface
    public interface ActivateDefaultCallback {
        void run(org.gtk.gtk.Popover popover);

        @ApiStatus.Internal default void upcall(MemoryAddress popover) {
            run((org.gtk.gtk.Popover) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(popover)), org.gtk.gtk.Popover.fromAddress).marshal(popover, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ActivateDefaultCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate_default}
     * @param activateDefault The new value of the field {@code activate_default}
     */
    public void setActivateDefault(ActivateDefaultCallback activateDefault) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("activate_default"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activateDefault == null ? MemoryAddress.NULL : activateDefault.toCallback()));
    }
    
    /**
     * Create a PopoverClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PopoverClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PopoverClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PopoverClass(input, ownership);
    
    /**
     * A {@link PopoverClass.Builder} object constructs a {@link PopoverClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PopoverClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PopoverClass struct;
        
        private Builder() {
            struct = PopoverClass.allocate();
        }
        
         /**
         * Finish building the {@link PopoverClass} struct.
         * @return A new instance of {@code PopoverClass} with the fields 
         *         that were set in the Builder object.
         */
        public PopoverClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gtk.WidgetClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setClosed(ClosedCallback closed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("closed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closed == null ? MemoryAddress.NULL : closed.toCallback()));
            return this;
        }
        
        public Builder setActivateDefault(ActivateDefaultCallback activateDefault) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate_default"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activateDefault == null ? MemoryAddress.NULL : activateDefault.toCallback()));
            return this;
        }
        
        public Builder setReserved(java.lang.foreign.MemoryAddress[] reserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(reserved, false)));
            return this;
        }
    }
}
