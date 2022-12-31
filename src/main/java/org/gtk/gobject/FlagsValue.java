package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A structure which contains a single flags value, its name, and its
 * nickname.
 */
public class FlagsValue extends Struct {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFlagsValue";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("value"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("value_name"),
            Interop.valueLayout.ADDRESS.withName("value_nick")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link FlagsValue}
     * @return A new, uninitialized @{link FlagsValue}
     */
    public static FlagsValue allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FlagsValue newInstance = new FlagsValue(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code value}
     * @return The value of the field {@code value}
     */
    public int getValue() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void setValue(int value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), value);
    }
    
    /**
     * Get the value of the field {@code value_name}
     * @return The value of the field {@code value_name}
     */
    public java.lang.String getValueName() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code value_name}
     * @param valueName The new value of the field {@code value_name}
     */
    public void setValueName(java.lang.String valueName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(valueName, null)));
    }
    
    /**
     * Get the value of the field {@code value_nick}
     * @return The value of the field {@code value_nick}
     */
    public java.lang.String getValueNick() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_nick"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code value_nick}
     * @param valueNick The new value of the field {@code value_nick}
     */
    public void setValueNick(java.lang.String valueNick) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_nick"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueNick == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(valueNick, null)));
    }
    
    /**
     * Create a FlagsValue proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FlagsValue(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FlagsValue> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FlagsValue(input, ownership);
    
    /**
     * A {@link FlagsValue.Builder} object constructs a {@link FlagsValue} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link FlagsValue.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final FlagsValue struct;
        
        private Builder() {
            struct = FlagsValue.allocate();
        }
        
         /**
         * Finish building the {@link FlagsValue} struct.
         * @return A new instance of {@code FlagsValue} with the fields 
         *         that were set in the Builder object.
         */
        public FlagsValue build() {
            return struct;
        }
        
        /**
         * the flags value
         * @param value The value for the {@code value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValue(int value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), value);
            return this;
        }
        
        /**
         * the name of the value
         * @param valueName The value for the {@code valueName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValueName(java.lang.String valueName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(valueName, null)));
            return this;
        }
        
        /**
         * the nickname of the value
         * @param valueNick The value for the {@code valueNick} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValueNick(java.lang.String valueNick) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_nick"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueNick == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(valueNick, null)));
            return this;
        }
    }
}
