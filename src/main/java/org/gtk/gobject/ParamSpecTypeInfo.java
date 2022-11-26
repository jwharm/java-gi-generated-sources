package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This structure is used to provide the type system with the information
 * required to initialize and destruct (finalize) a parameter's class and
 * instances thereof.
 * <p>
 * The initialized structure is passed to the g_param_type_register_static()
 * The type system will perform a deep copy of this structure, so its memory
 * does not need to be persistent across invocation of
 * g_param_type_register_static().
 */
public class ParamSpecTypeInfo extends Struct {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpecTypeInfo";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_SHORT.withName("instance_size"),
        Interop.valueLayout.C_SHORT.withName("n_preallocs"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("instance_init"),
        Interop.valueLayout.C_LONG.withName("value_type"),
        Interop.valueLayout.ADDRESS.withName("finalize"),
        Interop.valueLayout.ADDRESS.withName("value_set_default"),
        Interop.valueLayout.ADDRESS.withName("value_validate"),
        Interop.valueLayout.ADDRESS.withName("values_cmp")
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
     * Allocate a new {@link ParamSpecTypeInfo}
     * @return A new, uninitialized @{link ParamSpecTypeInfo}
     */
    public static ParamSpecTypeInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ParamSpecTypeInfo newInstance = new ParamSpecTypeInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code instance_size}
     * @return The value of the field {@code instance_size}
     */
    public short instance_size$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("instance_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code instance_size}
     * @param instance_size The new value of the field {@code instance_size}
     */
    public void instance_size$set(short instance_size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("instance_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), instance_size);
    }
    
    /**
     * Get the value of the field {@code n_preallocs}
     * @return The value of the field {@code n_preallocs}
     */
    public short n_preallocs$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_preallocs"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_preallocs}
     * @param n_preallocs The new value of the field {@code n_preallocs}
     */
    public void n_preallocs$set(short n_preallocs) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_preallocs"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), n_preallocs);
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
     * Create a ParamSpecTypeInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ParamSpecTypeInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ParamSpecTypeInfo struct;
        
         /**
         * A {@link ParamSpecTypeInfo.Build} object constructs a {@link ParamSpecTypeInfo} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ParamSpecTypeInfo.allocate();
        }
        
         /**
         * Finish building the {@link ParamSpecTypeInfo} struct.
         * @return A new instance of {@code ParamSpecTypeInfo} with the fields 
         *         that were set in the Build object.
         */
        public ParamSpecTypeInfo construct() {
            return struct;
        }
        
        /**
         * Size of the instance (object) structure.
         * @param instance_size The value for the {@code instance_size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInstanceSize(short instance_size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("instance_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), instance_size);
            return this;
        }
        
        /**
         * Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve memory for (0 indicates no caching). Since GLib 2.10, it is ignored, since instances are allocated with the [slice allocator][glib-Memory-Slices] now.
         * @param n_preallocs The value for the {@code n_preallocs} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNPreallocs(short n_preallocs) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_preallocs"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), n_preallocs);
            return this;
        }
        
        public Build setInstanceInit(java.lang.foreign.MemoryAddress instance_init) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("instance_init"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (instance_init == null ? MemoryAddress.NULL : instance_init));
            return this;
        }
        
        /**
         * The {@link Type} of values conforming to this {@link ParamSpec}
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
    }
}
