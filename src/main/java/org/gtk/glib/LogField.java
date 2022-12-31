package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure representing a single field in a structured log entry. See
 * g_log_structured() for details.
 * <p>
 * Log fields may contain arbitrary values, including binary with embedded nul
 * bytes. If the field contains a string, the string must be UTF-8 encoded and
 * have a trailing nul byte. Otherwise, {@code length} must be set to a non-negative
 * value.
 * @version 2.50
 */
public class LogField extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GLogField";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("key"),
            Interop.valueLayout.ADDRESS.withName("value"),
            Interop.valueLayout.C_LONG.withName("length")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link LogField}
     * @return A new, uninitialized @{link LogField}
     */
    public static LogField allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        LogField newInstance = new LogField(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code key}
     * @return The value of the field {@code key}
     */
    public java.lang.String getKey() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("key"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code key}
     * @param key The new value of the field {@code key}
     */
    public void setKey(java.lang.String key) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("key"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (key == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(key, null)));
    }
    
    /**
     * Get the value of the field {@code value}
     * @return The value of the field {@code value}
     */
    public java.lang.foreign.MemoryAddress getValue() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void setValue(java.lang.foreign.MemoryAddress value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) value));
    }
    
    /**
     * Get the value of the field {@code length}
     * @return The value of the field {@code length}
     */
    public long getLength() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("length"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code length}
     * @param length The new value of the field {@code length}
     */
    public void setLength(long length) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("length"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), length);
    }
    
    /**
     * Create a LogField proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected LogField(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, LogField> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new LogField(input, ownership);
    
    /**
     * A {@link LogField.Builder} object constructs a {@link LogField} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link LogField.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final LogField struct;
        
        private Builder() {
            struct = LogField.allocate();
        }
        
         /**
         * Finish building the {@link LogField} struct.
         * @return A new instance of {@code LogField} with the fields 
         *         that were set in the Builder object.
         */
        public LogField build() {
            return struct;
        }
        
        /**
         * field name (UTF-8 string)
         * @param key The value for the {@code key} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKey(java.lang.String key) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("key"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (key == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(key, null)));
            return this;
        }
        
        /**
         * field value (arbitrary bytes)
         * @param value The value for the {@code value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValue(java.lang.foreign.MemoryAddress value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) value));
            return this;
        }
        
        /**
         * length of {@code value}, in bytes, or -1 if it is nul-terminated
         * @param length The value for the {@code length} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLength(long length) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("length"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), length);
            return this;
        }
    }
}
