package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A structure holding information for a specific type.
 * <p>
 * See also: g_type_query()
 */
public class TypeQuery extends Struct {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTypeQuery";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_LONG.withName("type"),
            Interop.valueLayout.ADDRESS.withName("type_name"),
            Interop.valueLayout.C_INT.withName("class_size"),
            Interop.valueLayout.C_INT.withName("instance_size")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TypeQuery}
     * @return A new, uninitialized @{link TypeQuery}
     */
    public static TypeQuery allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TypeQuery newInstance = new TypeQuery(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gtk.glib.Type getType() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void setType(org.gtk.glib.Type type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue().longValue()));
    }
    
    /**
     * Get the value of the field {@code type_name}
     * @return The value of the field {@code type_name}
     */
    public java.lang.String getTypeName() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code type_name}
     * @param typeName The new value of the field {@code type_name}
     */
    public void setTypeName(java.lang.String typeName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (typeName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(typeName, null)));
    }
    
    /**
     * Get the value of the field {@code class_size}
     * @return The value of the field {@code class_size}
     */
    public int getClassSize() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("class_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code class_size}
     * @param classSize The new value of the field {@code class_size}
     */
    public void setClassSize(int classSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("class_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), classSize);
    }
    
    /**
     * Get the value of the field {@code instance_size}
     * @return The value of the field {@code instance_size}
     */
    public int getInstanceSize() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("instance_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code instance_size}
     * @param instanceSize The new value of the field {@code instance_size}
     */
    public void setInstanceSize(int instanceSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("instance_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), instanceSize);
    }
    
    /**
     * Create a TypeQuery proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TypeQuery(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TypeQuery> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TypeQuery(input, ownership);
    
    /**
     * A {@link TypeQuery.Builder} object constructs a {@link TypeQuery} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TypeQuery.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TypeQuery struct;
        
        private Builder() {
            struct = TypeQuery.allocate();
        }
        
         /**
         * Finish building the {@link TypeQuery} struct.
         * @return A new instance of {@code TypeQuery} with the fields 
         *         that were set in the Builder object.
         */
        public TypeQuery build() {
            return struct;
        }
        
        /**
         * the {@link org.gtk.glib.Type} value of the type
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setType(org.gtk.glib.Type type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue().longValue()));
            return this;
        }
        
        /**
         * the name of the type
         * @param typeName The value for the {@code typeName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTypeName(java.lang.String typeName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (typeName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(typeName, null)));
            return this;
        }
        
        /**
         * the size of the class structure
         * @param classSize The value for the {@code classSize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setClassSize(int classSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("class_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), classSize);
            return this;
        }
        
        /**
         * the size of the instance structure
         * @param instanceSize The value for the {@code instanceSize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInstanceSize(int instanceSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("instance_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), instanceSize);
            return this;
        }
    }
}
