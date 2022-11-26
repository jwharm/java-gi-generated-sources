package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class of a flags type holds information about its
 * possible values.
 */
public class FlagsClass extends Struct {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFlagsClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeClass.getMemoryLayout().withName("g_type_class"),
        Interop.valueLayout.C_INT.withName("mask"),
        Interop.valueLayout.C_INT.withName("n_values"),
        Interop.valueLayout.ADDRESS.withName("values")
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
     * Allocate a new {@link FlagsClass}
     * @return A new, uninitialized @{link FlagsClass}
     */
    public static FlagsClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FlagsClass newInstance = new FlagsClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_type_class}
     * @return The value of the field {@code g_type_class}
     */
    public org.gtk.gobject.TypeClass g_type_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_type_class"));
        return new org.gtk.gobject.TypeClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code mask}
     * @return The value of the field {@code mask}
     */
    public int mask$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mask"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code mask}
     * @param mask The new value of the field {@code mask}
     */
    public void mask$set(int mask) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mask"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), mask);
    }
    
    /**
     * Get the value of the field {@code n_values}
     * @return The value of the field {@code n_values}
     */
    public int n_values$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_values"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_values}
     * @param n_values The new value of the field {@code n_values}
     */
    public void n_values$set(int n_values) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_values"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), n_values);
    }
    
    /**
     * Get the value of the field {@code values}
     * @return The value of the field {@code values}
     */
    public org.gtk.gobject.FlagsValue values$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("values"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gobject.FlagsValue(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code values}
     * @param values The new value of the field {@code values}
     */
    public void values$set(org.gtk.gobject.FlagsValue values) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("values"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), values.handle());
    }
    
    /**
     * Create a FlagsClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FlagsClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private FlagsClass struct;
        
         /**
         * A {@link FlagsClass.Build} object constructs a {@link FlagsClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = FlagsClass.allocate();
        }
        
         /**
         * Finish building the {@link FlagsClass} struct.
         * @return A new instance of {@code FlagsClass} with the fields 
         *         that were set in the Build object.
         */
        public FlagsClass construct() {
            return struct;
        }
        
        /**
         * the parent class
         * @param g_type_class The value for the {@code g_type_class} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGTypeClass(org.gtk.gobject.TypeClass g_type_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_type_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_type_class == null ? MemoryAddress.NULL : g_type_class.handle()));
            return this;
        }
        
        /**
         * a mask covering all possible values.
         * @param mask The value for the {@code mask} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMask(int mask) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mask"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), mask);
            return this;
        }
        
        /**
         * the number of possible values.
         * @param n_values The value for the {@code n_values} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNValues(int n_values) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_values"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), n_values);
            return this;
        }
        
        /**
         * an array of {@link FlagsValue} structs describing the
         *  individual values.
         * @param values The value for the {@code values} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setValues(org.gtk.gobject.FlagsValue values) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("values"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (values == null ? MemoryAddress.NULL : values.handle()));
            return this;
        }
    }
}
