package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This structure is used to provide the type system with the information
 * required to initialize and destruct (finalize) a type's class and
 * its instances.
 * <p>
 * The initialized structure is passed to the g_type_register_static() function
 * (or is copied into the provided {@link TypeInfo} structure in the
 * g_type_plugin_complete_type_info()). The type system will perform a deep
 * copy of this structure, so its memory does not need to be persistent
 * across invocation of g_type_register_static().
 */
public class TypeInfo extends Struct {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTypeInfo";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_SHORT.withName("class_size"),
            MemoryLayout.paddingLayout(48),
            Interop.valueLayout.ADDRESS.withName("base_init"),
            Interop.valueLayout.ADDRESS.withName("base_finalize"),
            Interop.valueLayout.ADDRESS.withName("class_init"),
            Interop.valueLayout.ADDRESS.withName("class_finalize"),
            Interop.valueLayout.ADDRESS.withName("class_data"),
            Interop.valueLayout.C_SHORT.withName("instance_size"),
            Interop.valueLayout.C_SHORT.withName("n_preallocs"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("instance_init"),
            Interop.valueLayout.ADDRESS.withName("value_table")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TypeInfo}
     * @return A new, uninitialized @{link TypeInfo}
     */
    public static TypeInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TypeInfo newInstance = new TypeInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code class_size}
     * @return The value of the field {@code class_size}
     */
    public short getClassSize() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("class_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code class_size}
     * @param classSize The new value of the field {@code class_size}
     */
    public void setClassSize(short classSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("class_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), classSize);
    }
    
    /**
     * Get the value of the field {@code base_init}
     * @return The value of the field {@code base_init}
     */
    public org.gtk.gobject.BaseInitFunc getBaseInit() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("base_init"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code base_init}
     * @param baseInit The new value of the field {@code base_init}
     */
    public void setBaseInit(org.gtk.gobject.BaseInitFunc baseInit) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("base_init"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (baseInit == null ? MemoryAddress.NULL : (Addressable) baseInit.toCallback()));
    }
    
    /**
     * Get the value of the field {@code base_finalize}
     * @return The value of the field {@code base_finalize}
     */
    public org.gtk.gobject.BaseFinalizeFunc getBaseFinalize() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("base_finalize"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code base_finalize}
     * @param baseFinalize The new value of the field {@code base_finalize}
     */
    public void setBaseFinalize(org.gtk.gobject.BaseFinalizeFunc baseFinalize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("base_finalize"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (baseFinalize == null ? MemoryAddress.NULL : (Addressable) baseFinalize.toCallback()));
    }
    
    /**
     * Get the value of the field {@code class_init}
     * @return The value of the field {@code class_init}
     */
    public org.gtk.gobject.ClassInitFunc getClassInit() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("class_init"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code class_init}
     * @param classInit The new value of the field {@code class_init}
     */
    public void setClassInit(org.gtk.gobject.ClassInitFunc classInit) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("class_init"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (classInit == null ? MemoryAddress.NULL : (Addressable) classInit.toCallback()));
    }
    
    /**
     * Get the value of the field {@code class_finalize}
     * @return The value of the field {@code class_finalize}
     */
    public org.gtk.gobject.ClassFinalizeFunc getClassFinalize() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("class_finalize"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code class_finalize}
     * @param classFinalize The new value of the field {@code class_finalize}
     */
    public void setClassFinalize(org.gtk.gobject.ClassFinalizeFunc classFinalize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("class_finalize"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (classFinalize == null ? MemoryAddress.NULL : (Addressable) classFinalize.toCallback()));
    }
    
    /**
     * Get the value of the field {@code class_data}
     * @return The value of the field {@code class_data}
     */
    public java.lang.foreign.MemoryAddress getClassData() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("class_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code class_data}
     * @param classData The new value of the field {@code class_data}
     */
    public void setClassData(java.lang.foreign.MemoryAddress classData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("class_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (classData == null ? MemoryAddress.NULL : (Addressable) classData));
    }
    
    /**
     * Get the value of the field {@code instance_size}
     * @return The value of the field {@code instance_size}
     */
    public short getInstanceSize() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("instance_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code instance_size}
     * @param instanceSize The new value of the field {@code instance_size}
     */
    public void setInstanceSize(short instanceSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("instance_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), instanceSize);
    }
    
    /**
     * Get the value of the field {@code n_preallocs}
     * @return The value of the field {@code n_preallocs}
     */
    public short getNPreallocs() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_preallocs"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_preallocs}
     * @param nPreallocs The new value of the field {@code n_preallocs}
     */
    public void setNPreallocs(short nPreallocs) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_preallocs"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nPreallocs);
    }
    
    /**
     * Get the value of the field {@code instance_init}
     * @return The value of the field {@code instance_init}
     */
    public org.gtk.gobject.InstanceInitFunc getInstanceInit() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("instance_init"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code instance_init}
     * @param instanceInit The new value of the field {@code instance_init}
     */
    public void setInstanceInit(org.gtk.gobject.InstanceInitFunc instanceInit) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("instance_init"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (instanceInit == null ? MemoryAddress.NULL : (Addressable) instanceInit.toCallback()));
    }
    
    /**
     * Get the value of the field {@code value_table}
     * @return The value of the field {@code value_table}
     */
    public org.gtk.gobject.TypeValueTable getValueTable() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_table"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.gobject.TypeValueTable.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code value_table}
     * @param valueTable The new value of the field {@code value_table}
     */
    public void setValueTable(org.gtk.gobject.TypeValueTable valueTable) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_table"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueTable == null ? MemoryAddress.NULL : valueTable.handle()));
    }
    
    /**
     * Create a TypeInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TypeInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TypeInfo> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TypeInfo(input, ownership);
    
    /**
     * A {@link TypeInfo.Builder} object constructs a {@link TypeInfo} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TypeInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TypeInfo struct;
        
        private Builder() {
            struct = TypeInfo.allocate();
        }
        
         /**
         * Finish building the {@link TypeInfo} struct.
         * @return A new instance of {@code TypeInfo} with the fields 
         *         that were set in the Builder object.
         */
        public TypeInfo build() {
            return struct;
        }
        
        /**
         * Size of the class structure (required for interface, classed and instantiatable types)
         * @param classSize The value for the {@code classSize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setClassSize(short classSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("class_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), classSize);
            return this;
        }
        
        /**
         * Location of the base initialization function (optional)
         * @param baseInit The value for the {@code baseInit} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBaseInit(org.gtk.gobject.BaseInitFunc baseInit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("base_init"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (baseInit == null ? MemoryAddress.NULL : (Addressable) baseInit.toCallback()));
            return this;
        }
        
        /**
         * Location of the base finalization function (optional)
         * @param baseFinalize The value for the {@code baseFinalize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBaseFinalize(org.gtk.gobject.BaseFinalizeFunc baseFinalize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("base_finalize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (baseFinalize == null ? MemoryAddress.NULL : (Addressable) baseFinalize.toCallback()));
            return this;
        }
        
        /**
         * Location of the class initialization function for
         *  classed and instantiatable types. Location of the default vtable
         *  inititalization function for interface types. (optional) This function
         *  is used both to fill in virtual functions in the class or default vtable,
         *  and to do type-specific setup such as registering signals and object
         *  properties.
         * @param classInit The value for the {@code classInit} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setClassInit(org.gtk.gobject.ClassInitFunc classInit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("class_init"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (classInit == null ? MemoryAddress.NULL : (Addressable) classInit.toCallback()));
            return this;
        }
        
        /**
         * Location of the class finalization function for
         *  classed and instantiatable types. Location of the default vtable
         *  finalization function for interface types. (optional)
         * @param classFinalize The value for the {@code classFinalize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setClassFinalize(org.gtk.gobject.ClassFinalizeFunc classFinalize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("class_finalize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (classFinalize == null ? MemoryAddress.NULL : (Addressable) classFinalize.toCallback()));
            return this;
        }
        
        /**
         * User-supplied data passed to the class init/finalize functions
         * @param classData The value for the {@code classData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setClassData(java.lang.foreign.MemoryAddress classData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("class_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (classData == null ? MemoryAddress.NULL : (Addressable) classData));
            return this;
        }
        
        /**
         * Size of the instance (object) structure (required for instantiatable types only)
         * @param instanceSize The value for the {@code instanceSize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInstanceSize(short instanceSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("instance_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), instanceSize);
            return this;
        }
        
        /**
         * Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve memory for (0 indicates no caching). Since GLib 2.10, it is ignored, since instances are allocated with the [slice allocator][glib-Memory-Slices] now.
         * @param nPreallocs The value for the {@code nPreallocs} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNPreallocs(short nPreallocs) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_preallocs"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nPreallocs);
            return this;
        }
        
        /**
         * Location of the instance initialization function (optional, for instantiatable types only)
         * @param instanceInit The value for the {@code instanceInit} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInstanceInit(org.gtk.gobject.InstanceInitFunc instanceInit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("instance_init"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (instanceInit == null ? MemoryAddress.NULL : (Addressable) instanceInit.toCallback()));
            return this;
        }
        
        /**
         * A {@link TypeValueTable} function table for generic handling of GValues
         *  of this type (usually only useful for fundamental types)
         * @param valueTable The value for the {@code valueTable} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValueTable(org.gtk.gobject.TypeValueTable valueTable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_table"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueTable == null ? MemoryAddress.NULL : valueTable.handle()));
            return this;
        }
    }
}
