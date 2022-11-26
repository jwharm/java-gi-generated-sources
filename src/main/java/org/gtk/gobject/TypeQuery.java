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
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTypeQuery";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_LONG.withName("type"),
        Interop.valueLayout.ADDRESS.withName("type_name"),
        Interop.valueLayout.C_INT.withName("class_size"),
        Interop.valueLayout.C_INT.withName("instance_size")
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
    public org.gtk.glib.Type type$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void type$set(org.gtk.glib.Type type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), type.getValue().longValue());
    }
    
    /**
     * Get the value of the field {@code type_name}
     * @return The value of the field {@code type_name}
     */
    public java.lang.String type_name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code type_name}
     * @param type_name The new value of the field {@code type_name}
     */
    public void type_name$set(java.lang.String type_name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(type_name));
    }
    
    /**
     * Get the value of the field {@code class_size}
     * @return The value of the field {@code class_size}
     */
    public int class_size$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("class_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code class_size}
     * @param class_size The new value of the field {@code class_size}
     */
    public void class_size$set(int class_size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("class_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), class_size);
    }
    
    /**
     * Get the value of the field {@code instance_size}
     * @return The value of the field {@code instance_size}
     */
    public int instance_size$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("instance_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code instance_size}
     * @param instance_size The new value of the field {@code instance_size}
     */
    public void instance_size$set(int instance_size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("instance_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), instance_size);
    }
    
    /**
     * Create a TypeQuery proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TypeQuery(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TypeQuery struct;
        
         /**
         * A {@link TypeQuery.Build} object constructs a {@link TypeQuery} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TypeQuery.allocate();
        }
        
         /**
         * Finish building the {@link TypeQuery} struct.
         * @return A new instance of {@code TypeQuery} with the fields 
         *         that were set in the Build object.
         */
        public TypeQuery construct() {
            return struct;
        }
        
        /**
         * the {@link Type} value of the type
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setType(org.gtk.glib.Type type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue().longValue()));
            return this;
        }
        
        /**
         * the name of the type
         * @param type_name The value for the {@code type_name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTypeName(java.lang.String type_name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type_name == null ? MemoryAddress.NULL : Interop.allocateNativeString(type_name)));
            return this;
        }
        
        /**
         * the size of the class structure
         * @param class_size The value for the {@code class_size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setClassSize(int class_size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("class_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), class_size);
            return this;
        }
        
        /**
         * the size of the instance structure
         * @param instance_size The value for the {@code instance_size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInstanceSize(int instance_size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("instance_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), instance_size);
            return this;
        }
    }
}
