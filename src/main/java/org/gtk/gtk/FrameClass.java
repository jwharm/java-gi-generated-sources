package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FrameClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFrameClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("compute_child_allocation"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link FrameClass}
     * @return A new, uninitialized @{link FrameClass}
     */
    public static FrameClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FrameClass newInstance = new FrameClass(segment.address(), Ownership.NONE);
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
    public interface ComputeChildAllocationCallback {
        void run(org.gtk.gtk.Frame frame, org.gtk.gtk.Allocation allocation);

        @ApiStatus.Internal default void upcall(MemoryAddress frame, MemoryAddress allocation) {
            run((org.gtk.gtk.Frame) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(frame)), org.gtk.gtk.Frame.fromAddress).marshal(frame, Ownership.NONE), (org.gtk.gtk.Allocation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(allocation)), org.gtk.gtk.Allocation.fromAddress).marshal(allocation, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ComputeChildAllocationCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code compute_child_allocation}
     * @param computeChildAllocation The new value of the field {@code compute_child_allocation}
     */
    public void setComputeChildAllocation(ComputeChildAllocationCallback computeChildAllocation) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("compute_child_allocation"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (computeChildAllocation == null ? MemoryAddress.NULL : computeChildAllocation.toCallback()));
    }
    
    /**
     * Create a FrameClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FrameClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FrameClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FrameClass(input, ownership);
    
    /**
     * A {@link FrameClass.Builder} object constructs a {@link FrameClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link FrameClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final FrameClass struct;
        
        private Builder() {
            struct = FrameClass.allocate();
        }
        
         /**
         * Finish building the {@link FrameClass} struct.
         * @return A new instance of {@code FrameClass} with the fields 
         *         that were set in the Builder object.
         */
        public FrameClass build() {
            return struct;
        }
        
        /**
         * The parent class.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gtk.gtk.WidgetClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setComputeChildAllocation(ComputeChildAllocationCallback computeChildAllocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("compute_child_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (computeChildAllocation == null ? MemoryAddress.NULL : computeChildAllocation.toCallback()));
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
