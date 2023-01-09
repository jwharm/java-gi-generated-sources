package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GParameter struct is an auxiliary structure used
 * to hand parameter name/value pairs to g_object_newv().
 */
public class Parameter extends Struct {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParameter";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("name"),
            org.gtk.gobject.Value.getMemoryLayout().withName("value")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Parameter}
     * @return A new, uninitialized @{link Parameter}
     */
    public static Parameter allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Parameter newInstance = new Parameter(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String getName() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void setName(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code value}
     * @return The value of the field {@code value}
     */
    public org.gtk.gobject.Value getValue() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("value"));
        return org.gtk.gobject.Value.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void setValue(org.gtk.gobject.Value value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (value == null ? MemoryAddress.NULL : value.handle()));
        }
    }
    
    /**
     * Create a Parameter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Parameter(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Parameter> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Parameter(input);
    
    /**
     * A {@link Parameter.Builder} object constructs a {@link Parameter} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Parameter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Parameter struct;
        
        private Builder() {
            struct = Parameter.allocate();
        }
        
        /**
         * Finish building the {@link Parameter} struct.
         * @return A new instance of {@code Parameter} with the fields 
         *         that were set in the Builder object.
         */
        public Parameter build() {
            return struct;
        }
        
        /**
         * the parameter name
         * @param name The value for the {@code name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setName(java.lang.String name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
                return this;
            }
        }
        
        /**
         * the parameter value
         * @param value The value for the {@code value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValue(org.gtk.gobject.Value value) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("value"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (value == null ? MemoryAddress.NULL : value.handle()));
                return this;
            }
        }
    }
}
