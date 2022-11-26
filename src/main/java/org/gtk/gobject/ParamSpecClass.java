package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class structure for the GParamSpec type.
 * Normally, GParamSpec classes are filled by
 * g_param_type_register_static().
 */
public class ParamSpecClass extends Struct {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpecClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeClass.getMemoryLayout().withName("g_type_class"),
        Interop.valueLayout.C_LONG.withName("value_type"),
        Interop.valueLayout.ADDRESS.withName("finalize"),
        Interop.valueLayout.ADDRESS.withName("value_set_default"),
        Interop.valueLayout.ADDRESS.withName("value_validate"),
        Interop.valueLayout.ADDRESS.withName("values_cmp"),
        Interop.valueLayout.ADDRESS.withName("value_is_valid"),
        MemoryLayout.sequenceLayout(3, Interop.valueLayout.ADDRESS).withName("dummy")
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
     * Allocate a new {@link ParamSpecClass}
     * @return A new, uninitialized @{link ParamSpecClass}
     */
    public static ParamSpecClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ParamSpecClass newInstance = new ParamSpecClass(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code value_type}
     * @return The value of the field {@code value_type}
     */
    public org.gtk.glib.Type value_type$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Change the value of the field {@code value_type}
     * @param value_type The new value of the field {@code value_type}
     */
    public void value_type$set(org.gtk.glib.Type value_type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), value_type.getValue().longValue());
    }
    
    /**
     * Create a ParamSpecClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ParamSpecClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ParamSpecClass struct;
        
         /**
         * A {@link ParamSpecClass.Build} object constructs a {@link ParamSpecClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ParamSpecClass.allocate();
        }
        
         /**
         * Finish building the {@link ParamSpecClass} struct.
         * @return A new instance of {@code ParamSpecClass} with the fields 
         *         that were set in the Build object.
         */
        public ParamSpecClass construct() {
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
         * the {@link Value} type for this parameter
         * @param value_type The value for the {@code value_type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setValueType(org.gtk.glib.Type value_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value_type == null ? MemoryAddress.NULL : value_type.getValue().longValue()));
            return this;
        }
        
        public Build setFinalize(java.lang.foreign.MemoryAddress finalize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finalize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finalize == null ? MemoryAddress.NULL : finalize));
            return this;
        }
        
        public Build setValueSetDefault(java.lang.foreign.MemoryAddress value_set_default) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_set_default"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value_set_default == null ? MemoryAddress.NULL : value_set_default));
            return this;
        }
        
        public Build setValueValidate(java.lang.foreign.MemoryAddress value_validate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_validate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value_validate == null ? MemoryAddress.NULL : value_validate));
            return this;
        }
        
        public Build setValuesCmp(java.lang.foreign.MemoryAddress values_cmp) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("values_cmp"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (values_cmp == null ? MemoryAddress.NULL : values_cmp));
            return this;
        }
        
        public Build setValueIsValid(java.lang.foreign.MemoryAddress value_is_valid) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_is_valid"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value_is_valid == null ? MemoryAddress.NULL : value_is_valid));
            return this;
        }
        
        public Build setDummy(java.lang.foreign.MemoryAddress[] dummy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dummy == null ? MemoryAddress.NULL : Interop.allocateNativeArray(dummy, false)));
            return this;
        }
    }
}
