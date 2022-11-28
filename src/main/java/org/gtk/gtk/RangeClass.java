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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("value_changed"),
        Interop.valueLayout.ADDRESS.withName("adjust_bounds"),
        Interop.valueLayout.ADDRESS.withName("move_slider"),
        Interop.valueLayout.ADDRESS.withName("get_range_border"),
        Interop.valueLayout.ADDRESS.withName("change_value"),
        MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
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
    public org.gtk.gtk.WidgetClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gtk.WidgetClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a RangeClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RangeClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private RangeClass struct;
        
         /**
         * A {@link RangeClass.Build} object constructs a {@link RangeClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = RangeClass.allocate();
        }
        
         /**
         * Finish building the {@link RangeClass} struct.
         * @return A new instance of {@code RangeClass} with the fields 
         *         that were set in the Build object.
         */
        public RangeClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gtk.WidgetClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setValueChanged(java.lang.foreign.MemoryAddress valueChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueChanged == null ? MemoryAddress.NULL : valueChanged));
            return this;
        }
        
        public Build setAdjustBounds(java.lang.foreign.MemoryAddress adjustBounds) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("adjust_bounds"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (adjustBounds == null ? MemoryAddress.NULL : adjustBounds));
            return this;
        }
        
        public Build setMoveSlider(java.lang.foreign.MemoryAddress moveSlider) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move_slider"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (moveSlider == null ? MemoryAddress.NULL : moveSlider));
            return this;
        }
        
        public Build setGetRangeBorder(java.lang.foreign.MemoryAddress getRangeBorder) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_range_border"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getRangeBorder == null ? MemoryAddress.NULL : getRangeBorder));
            return this;
        }
        
        public Build setChangeValue(java.lang.foreign.MemoryAddress changeValue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("change_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changeValue == null ? MemoryAddress.NULL : changeValue));
            return this;
        }
        
        public Build setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
