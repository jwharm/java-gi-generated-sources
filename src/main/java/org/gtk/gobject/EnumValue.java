package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A structure which contains a single enum value, its name, and its
 * nickname.
 */
public class EnumValue extends Struct {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GEnumValue";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("value"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("value_name"),
        Interop.valueLayout.ADDRESS.withName("value_nick")
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
     * Allocate a new {@link EnumValue}
     * @return A new, uninitialized @{link EnumValue}
     */
    public static EnumValue allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        EnumValue newInstance = new EnumValue(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code value}
     * @return The value of the field {@code value}
     */
    public int value$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void value$set(int value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), value);
    }
    
    /**
     * Get the value of the field {@code value_name}
     * @return The value of the field {@code value_name}
     */
    public java.lang.String value_name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code value_name}
     * @param value_name The new value of the field {@code value_name}
     */
    public void value_name$set(java.lang.String value_name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(value_name));
    }
    
    /**
     * Get the value of the field {@code value_nick}
     * @return The value of the field {@code value_nick}
     */
    public java.lang.String value_nick$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_nick"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code value_nick}
     * @param value_nick The new value of the field {@code value_nick}
     */
    public void value_nick$set(java.lang.String value_nick) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_nick"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(value_nick));
    }
    
    /**
     * Create a EnumValue proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EnumValue(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private EnumValue struct;
        
         /**
         * A {@link EnumValue.Build} object constructs a {@link EnumValue} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = EnumValue.allocate();
        }
        
         /**
         * Finish building the {@link EnumValue} struct.
         * @return A new instance of {@code EnumValue} with the fields 
         *         that were set in the Build object.
         */
        public EnumValue construct() {
            return struct;
        }
        
        /**
         * the enum value
         * @param value The value for the {@code value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setValue(int value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), value);
            return this;
        }
        
        /**
         * the name of the value
         * @param value_name The value for the {@code value_name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setValueName(java.lang.String value_name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value_name == null ? MemoryAddress.NULL : Interop.allocateNativeString(value_name)));
            return this;
        }
        
        /**
         * the nickname of the value
         * @param value_nick The value for the {@code value_nick} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setValueNick(java.lang.String value_nick) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_nick"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value_nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(value_nick)));
            return this;
        }
    }
}
