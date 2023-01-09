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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        RangeClass newInstance = new RangeClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.WidgetClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gtk.WidgetClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gtk.WidgetClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ValueChangedCallback} callback.
     */
    @FunctionalInterface
    public interface ValueChangedCallback {
    
        void run(org.gtk.gtk.Range range);
        
        @ApiStatus.Internal default void upcall(MemoryAddress range) {
            run((org.gtk.gtk.Range) Interop.register(range, org.gtk.gtk.Range.fromAddress).marshal(range, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ValueChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code value_changed}
     * @param valueChanged The new value of the field {@code value_changed}
     */
    public void setValueChanged(ValueChangedCallback valueChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (valueChanged == null ? MemoryAddress.NULL : valueChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AdjustBoundsCallback} callback.
     */
    @FunctionalInterface
    public interface AdjustBoundsCallback {
    
        void run(org.gtk.gtk.Range range, double newValue);
        
        @ApiStatus.Internal default void upcall(MemoryAddress range, double newValue) {
            run((org.gtk.gtk.Range) Interop.register(range, org.gtk.gtk.Range.fromAddress).marshal(range, null), newValue);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AdjustBoundsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code adjust_bounds}
     * @param adjustBounds The new value of the field {@code adjust_bounds}
     */
    public void setAdjustBounds(AdjustBoundsCallback adjustBounds) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("adjust_bounds"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (adjustBounds == null ? MemoryAddress.NULL : adjustBounds.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MoveSliderCallback} callback.
     */
    @FunctionalInterface
    public interface MoveSliderCallback {
    
        void run(org.gtk.gtk.Range range, org.gtk.gtk.ScrollType scroll);
        
        @ApiStatus.Internal default void upcall(MemoryAddress range, int scroll) {
            run((org.gtk.gtk.Range) Interop.register(range, org.gtk.gtk.Range.fromAddress).marshal(range, null), org.gtk.gtk.ScrollType.of(scroll));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MoveSliderCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code move_slider}
     * @param moveSlider The new value of the field {@code move_slider}
     */
    public void setMoveSlider(MoveSliderCallback moveSlider) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move_slider"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (moveSlider == null ? MemoryAddress.NULL : moveSlider.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetRangeBorderCallback} callback.
     */
    @FunctionalInterface
    public interface GetRangeBorderCallback {
    
        void run(org.gtk.gtk.Range range, org.gtk.gtk.Border border);
        
        @ApiStatus.Internal default void upcall(MemoryAddress range, MemoryAddress border) {
            run((org.gtk.gtk.Range) Interop.register(range, org.gtk.gtk.Range.fromAddress).marshal(range, null), org.gtk.gtk.Border.fromAddress.marshal(border, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetRangeBorderCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_range_border}
     * @param getRangeBorder The new value of the field {@code get_range_border}
     */
    public void setGetRangeBorder(GetRangeBorderCallback getRangeBorder) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_range_border"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getRangeBorder == null ? MemoryAddress.NULL : getRangeBorder.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ChangeValueCallback} callback.
     */
    @FunctionalInterface
    public interface ChangeValueCallback {
    
        boolean run(org.gtk.gtk.Range range, org.gtk.gtk.ScrollType scroll, double newValue);
        
        @ApiStatus.Internal default int upcall(MemoryAddress range, int scroll, double newValue) {
            var RESULT = run((org.gtk.gtk.Range) Interop.register(range, org.gtk.gtk.Range.fromAddress).marshal(range, null), org.gtk.gtk.ScrollType.of(scroll), newValue);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ChangeValueCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code change_value}
     * @param changeValue The new value of the field {@code change_value}
     */
    public void setChangeValue(ChangeValueCallback changeValue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("change_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (changeValue == null ? MemoryAddress.NULL : changeValue.toCallback()));
        }
    }
    
    /**
     * Create a RangeClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RangeClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RangeClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RangeClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setValueChanged(ValueChangedCallback valueChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("value_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (valueChanged == null ? MemoryAddress.NULL : valueChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setAdjustBounds(AdjustBoundsCallback adjustBounds) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("adjust_bounds"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (adjustBounds == null ? MemoryAddress.NULL : adjustBounds.toCallback()));
                return this;
            }
        }
        
        public Builder setMoveSlider(MoveSliderCallback moveSlider) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("move_slider"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (moveSlider == null ? MemoryAddress.NULL : moveSlider.toCallback()));
                return this;
            }
        }
        
        public Builder setGetRangeBorder(GetRangeBorderCallback getRangeBorder) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_range_border"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getRangeBorder == null ? MemoryAddress.NULL : getRangeBorder.toCallback()));
                return this;
            }
        }
        
        public Builder setChangeValue(ChangeValueCallback changeValue) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("change_value"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (changeValue == null ? MemoryAddress.NULL : changeValue.toCallback()));
                return this;
            }
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false, SCOPE)));
                return this;
            }
        }
    }
}
