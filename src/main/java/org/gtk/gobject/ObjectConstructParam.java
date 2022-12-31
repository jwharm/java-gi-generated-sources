package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GObjectConstructParam struct is an auxiliary structure used to hand
 * {@link ParamSpec}/{@link Value} pairs to the {@code constructor} of a {@link ObjectClass}.
 */
public class ObjectConstructParam extends Struct {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GObjectConstructParam";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("pspec"),
            Interop.valueLayout.ADDRESS.withName("value")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ObjectConstructParam}
     * @return A new, uninitialized @{link ObjectConstructParam}
     */
    public static ObjectConstructParam allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ObjectConstructParam newInstance = new ObjectConstructParam(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code pspec}
     * @return The value of the field {@code pspec}
     */
    public org.gtk.gobject.ParamSpec getPspec() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pspec"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return (org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gobject.ParamSpec.fromAddress).marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code pspec}
     * @param pspec The new value of the field {@code pspec}
     */
    public void setPspec(org.gtk.gobject.ParamSpec pspec) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pspec"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pspec == null ? MemoryAddress.NULL : pspec.handle()));
    }
    
    /**
     * Get the value of the field {@code value}
     * @return The value of the field {@code value}
     */
    public org.gtk.gobject.Value getValue() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.gobject.Value.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void setValue(org.gtk.gobject.Value value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value == null ? MemoryAddress.NULL : value.handle()));
    }
    
    /**
     * Create a ObjectConstructParam proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ObjectConstructParam(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ObjectConstructParam> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ObjectConstructParam(input, ownership);
    
    /**
     * A {@link ObjectConstructParam.Builder} object constructs a {@link ObjectConstructParam} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ObjectConstructParam.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ObjectConstructParam struct;
        
        private Builder() {
            struct = ObjectConstructParam.allocate();
        }
        
         /**
         * Finish building the {@link ObjectConstructParam} struct.
         * @return A new instance of {@code ObjectConstructParam} with the fields 
         *         that were set in the Builder object.
         */
        public ObjectConstructParam build() {
            return struct;
        }
        
        /**
         * the {@link ParamSpec} of the construct parameter
         * @param pspec The value for the {@code pspec} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPspec(org.gtk.gobject.ParamSpec pspec) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pspec"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pspec == null ? MemoryAddress.NULL : pspec.handle()));
            return this;
        }
        
        /**
         * the value to set the parameter to
         * @param value The value for the {@code value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValue(org.gtk.gobject.Value value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value == null ? MemoryAddress.NULL : value.handle()));
            return this;
        }
    }
}
