package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link TypePlugin} interface is used by the type system in order to handle
 * the lifecycle of dynamically loaded types.
 */
public class TypePluginClass extends Struct {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTypePluginClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("base_iface"),
        Interop.valueLayout.ADDRESS.withName("use_plugin"),
        Interop.valueLayout.ADDRESS.withName("unuse_plugin"),
        Interop.valueLayout.ADDRESS.withName("complete_type_info"),
        Interop.valueLayout.ADDRESS.withName("complete_interface_info")
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
     * Allocate a new {@link TypePluginClass}
     * @return A new, uninitialized @{link TypePluginClass}
     */
    public static TypePluginClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TypePluginClass newInstance = new TypePluginClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code use_plugin}
     * @return The value of the field {@code use_plugin}
     */
    public org.gtk.gobject.TypePluginUse usePlugin$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("use_plugin"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code unuse_plugin}
     * @return The value of the field {@code unuse_plugin}
     */
    public org.gtk.gobject.TypePluginUnuse unusePlugin$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unuse_plugin"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code complete_type_info}
     * @return The value of the field {@code complete_type_info}
     */
    public org.gtk.gobject.TypePluginCompleteTypeInfo completeTypeInfo$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("complete_type_info"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code complete_interface_info}
     * @return The value of the field {@code complete_interface_info}
     */
    public org.gtk.gobject.TypePluginCompleteInterfaceInfo completeInterfaceInfo$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("complete_interface_info"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Create a TypePluginClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TypePluginClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TypePluginClass struct;
        
         /**
         * A {@link TypePluginClass.Build} object constructs a {@link TypePluginClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TypePluginClass.allocate();
        }
        
         /**
         * Finish building the {@link TypePluginClass} struct.
         * @return A new instance of {@code TypePluginClass} with the fields 
         *         that were set in the Build object.
         */
        public TypePluginClass construct() {
            return struct;
        }
        
        public Build setBaseIface(org.gtk.gobject.TypeInterface baseIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("base_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (baseIface == null ? MemoryAddress.NULL : baseIface.handle()));
            return this;
        }
        
        /**
         * Increases the use count of the plugin.
         * @param usePlugin The value for the {@code usePlugin} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUsePlugin(java.lang.foreign.MemoryAddress usePlugin) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("use_plugin"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (usePlugin == null ? MemoryAddress.NULL : usePlugin));
            return this;
        }
        
        /**
         * Decreases the use count of the plugin.
         * @param unusePlugin The value for the {@code unusePlugin} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUnusePlugin(java.lang.foreign.MemoryAddress unusePlugin) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unuse_plugin"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unusePlugin == null ? MemoryAddress.NULL : unusePlugin));
            return this;
        }
        
        /**
         * Fills in the {@link TypeInfo} and
         *  {@link TypeValueTable} structs for the type. The structs are initialized
         *  with {@code memset(s, 0, sizeof (s))} before calling this function.
         * @param completeTypeInfo The value for the {@code completeTypeInfo} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCompleteTypeInfo(java.lang.foreign.MemoryAddress completeTypeInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("complete_type_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (completeTypeInfo == null ? MemoryAddress.NULL : completeTypeInfo));
            return this;
        }
        
        /**
         * Fills in missing parts of the {@link InterfaceInfo}
         *  for the interface. The structs is initialized with
         *  {@code memset(s, 0, sizeof (s))} before calling this function.
         * @param completeInterfaceInfo The value for the {@code completeInterfaceInfo} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCompleteInterfaceInfo(java.lang.foreign.MemoryAddress completeInterfaceInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("complete_interface_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (completeInterfaceInfo == null ? MemoryAddress.NULL : completeInterfaceInfo));
            return this;
        }
    }
}
