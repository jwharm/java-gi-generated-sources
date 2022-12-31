package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class RangeClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkRangeClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("value_changed"),
            Interop.valueLayout.ADDRESS.withName("adjust_bounds"),
            Interop.valueLayout.ADDRESS.withName("move_slider"),
            Interop.valueLayout.ADDRESS.withName("get_range_border"),
            Interop.valueLayout.ADDRESS.withName("change_value"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RangeClass}
     * @return A new, uninitialized @{link RangeClass}
     */
    public static RangeClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RangeClass newInstance = new RangeClass(segment.address(), Ownership.NONE);
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
    public interface ValueChangedCallback {
        void run(org.gtk.gtk.Range range);

        @ApiStatus.Internal default void upcall(MemoryAddress range) {
            run((org.gtk.gtk.Range) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(range)), org.gtk.gtk.Range.fromAddress).marshal(range, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ValueChangedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code value_changed}
     * @param valueChanged The new value of the field {@code value_changed}
     */
    public void setValueChanged(ValueChangedCallback valueChanged) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_changed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueChanged == null ? MemoryAddress.NULL : valueChanged.toCallback()));
    }
    
    @FunctionalInterface
    public interface AdjustBoundsCallback {
        void run(org.gtk.gtk.Range range, double newValue);

        @ApiStatus.Internal default void upcall(MemoryAddress range, double newValue) {
            run((org.gtk.gtk.Range) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(range)), org.gtk.gtk.Range.fromAddress).marshal(range, Ownership.NONE), newValue);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AdjustBoundsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code adjust_bounds}
     * @param adjustBounds The new value of the field {@code adjust_bounds}
     */
    public void setAdjustBounds(AdjustBoundsCallback adjustBounds) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("adjust_bounds"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (adjustBounds == null ? MemoryAddress.NULL : adjustBounds.toCallback()));
    }
    
    @FunctionalInterface
    public interface MoveSliderCallback {
        void run(org.gtk.gtk.Range range, org.gtk.gtk.ScrollType scroll);

        @ApiStatus.Internal default void upcall(MemoryAddress range, int scroll) {
            run((org.gtk.gtk.Range) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(range)), org.gtk.gtk.Range.fromAddress).marshal(range, Ownership.NONE), org.gtk.gtk.ScrollType.of(scroll));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MoveSliderCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code move_slider}
     * @param moveSlider The new value of the field {@code move_slider}
     */
    public void setMoveSlider(MoveSliderCallback moveSlider) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("move_slider"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (moveSlider == null ? MemoryAddress.NULL : moveSlider.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetRangeBorderCallback {
        void run(org.gtk.gtk.Range range, org.gtk.gtk.Border border);

        @ApiStatus.Internal default void upcall(MemoryAddress range, MemoryAddress border) {
            run((org.gtk.gtk.Range) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(range)), org.gtk.gtk.Range.fromAddress).marshal(range, Ownership.NONE), org.gtk.gtk.Border.fromAddress.marshal(border, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetRangeBorderCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_range_border}
     * @param getRangeBorder The new value of the field {@code get_range_border}
     */
    public void setGetRangeBorder(GetRangeBorderCallback getRangeBorder) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_range_border"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getRangeBorder == null ? MemoryAddress.NULL : getRangeBorder.toCallback()));
    }
    
    @FunctionalInterface
    public interface ChangeValueCallback {
        boolean run(org.gtk.gtk.Range range, org.gtk.gtk.ScrollType scroll, double newValue);

        @ApiStatus.Internal default int upcall(MemoryAddress range, int scroll, double newValue) {
            var RESULT = run((org.gtk.gtk.Range) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(range)), org.gtk.gtk.Range.fromAddress).marshal(range, Ownership.NONE), org.gtk.gtk.ScrollType.of(scroll), newValue);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ChangeValueCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code change_value}
     * @param changeValue The new value of the field {@code change_value}
     */
    public void setChangeValue(ChangeValueCallback changeValue) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("change_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changeValue == null ? MemoryAddress.NULL : changeValue.toCallback()));
    }
    
    /**
     * Create a RangeClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RangeClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RangeClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RangeClass(input, ownership);
    
    /**
     * A {@link RangeClass.Builder} object constructs a {@link RangeClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RangeClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RangeClass struct;
        
        private Builder() {
            struct = RangeClass.allocate();
        }
        
         /**
         * Finish building the {@link RangeClass} struct.
         * @return A new instance of {@code RangeClass} with the fields 
         *         that were set in the Builder object.
         */
        public RangeClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gtk.WidgetClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setValueChanged(ValueChangedCallback valueChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueChanged == null ? MemoryAddress.NULL : valueChanged.toCallback()));
            return this;
        }
        
        public Builder setAdjustBounds(AdjustBoundsCallback adjustBounds) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("adjust_bounds"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (adjustBounds == null ? MemoryAddress.NULL : adjustBounds.toCallback()));
            return this;
        }
        
        public Builder setMoveSlider(MoveSliderCallback moveSlider) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move_slider"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (moveSlider == null ? MemoryAddress.NULL : moveSlider.toCallback()));
            return this;
        }
        
        public Builder setGetRangeBorder(GetRangeBorderCallback getRangeBorder) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_range_border"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getRangeBorder == null ? MemoryAddress.NULL : getRangeBorder.toCallback()));
            return this;
        }
        
        public Builder setChangeValue(ChangeValueCallback changeValue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("change_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changeValue == null ? MemoryAddress.NULL : changeValue.toCallback()));
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
