package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ScaleClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkScaleClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.RangeClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("get_layout_offsets"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ScaleClass}
     * @return A new, uninitialized @{link ScaleClass}
     */
    public static ScaleClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ScaleClass newInstance = new ScaleClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.RangeClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gtk.RangeClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gtk.RangeClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface GetLayoutOffsetsCallback {
        void run(org.gtk.gtk.Scale scale, Out<Integer> x, Out<Integer> y);

        @ApiStatus.Internal default void upcall(MemoryAddress scale, MemoryAddress x, MemoryAddress y) {
            Out<Integer> xOUT = new Out<>(x.get(Interop.valueLayout.C_INT, 0));
            Out<Integer> yOUT = new Out<>(y.get(Interop.valueLayout.C_INT, 0));
            run((org.gtk.gtk.Scale) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(scale)), org.gtk.gtk.Scale.fromAddress).marshal(scale, Ownership.NONE), xOUT, yOUT);
            x.set(Interop.valueLayout.C_INT, 0, xOUT.get());
            y.set(Interop.valueLayout.C_INT, 0, yOUT.get());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetLayoutOffsetsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_layout_offsets}
     * @param getLayoutOffsets The new value of the field {@code get_layout_offsets}
     */
    public void setGetLayoutOffsets(GetLayoutOffsetsCallback getLayoutOffsets) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_layout_offsets"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getLayoutOffsets == null ? MemoryAddress.NULL : getLayoutOffsets.toCallback()));
    }
    
    /**
     * Create a ScaleClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ScaleClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ScaleClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ScaleClass(input, ownership);
    
    /**
     * A {@link ScaleClass.Builder} object constructs a {@link ScaleClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ScaleClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ScaleClass struct;
        
        private Builder() {
            struct = ScaleClass.allocate();
        }
        
         /**
         * Finish building the {@link ScaleClass} struct.
         * @return A new instance of {@code ScaleClass} with the fields 
         *         that were set in the Builder object.
         */
        public ScaleClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gtk.RangeClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setGetLayoutOffsets(GetLayoutOffsetsCallback getLayoutOffsets) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_layout_offsets"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getLayoutOffsets == null ? MemoryAddress.NULL : getLayoutOffsets.toCallback()));
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
