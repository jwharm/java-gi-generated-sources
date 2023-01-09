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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        FlagsValue newInstance = new FlagsValue(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code value}
     * @return The value of the field {@code value}
     */
    public int getValue() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void setValue(int value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), value);
        }
    }
    
    /**
     * Get the value of the field {@code value_name}
     * @return The value of the field {@code value_name}
     */
    public java.lang.String getValueName() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_name"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code value_name}
     * @param valueName The new value of the field {@code value_name}
     */
    public void setValueName(java.lang.String valueName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (valueName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(valueName, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code value_nick}
     * @return The value of the field {@code value_nick}
     */
    public java.lang.String getValueNick() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_nick"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code value_nick}
     * @param valueNick The new value of the field {@code value_nick}
     */
    public void setValueNick(java.lang.String valueNick) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_nick"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (valueNick == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(valueNick, SCOPE)));
        }
    }
    
    /**
     * Create a FlagsValue proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FlagsValue(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FlagsValue> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FlagsValue(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("value"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), value);
                return this;
            }
        }
        
        /**
         * the name of the value
         * @param valueName The value for the {@code valueName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValueName(java.lang.String valueName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("value_name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (valueName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(valueName, SCOPE)));
                return this;
            }
        }
        
        /**
         * the nickname of the value
         * @param valueNick The value for the {@code valueNick} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValueNick(java.lang.String valueNick) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("value_nick"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (valueNick == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(valueNick, SCOPE)));
                return this;
            }
        }
    }
}
