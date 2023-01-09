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
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTypePluginClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("base_iface"),
            Interop.valueLayout.ADDRESS.withName("use_plugin"),
            Interop.valueLayout.ADDRESS.withName("unuse_plugin"),
            Interop.valueLayout.ADDRESS.withName("complete_type_info"),
            Interop.valueLayout.ADDRESS.withName("complete_interface_info")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TypePluginClass}
     * @return A new, uninitialized @{link TypePluginClass}
     */
    public static TypePluginClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TypePluginClass newInstance = new TypePluginClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code use_plugin}
     * @return The value of the field {@code use_plugin}
     */
    public org.gtk.gobject.TypePluginUse getUsePlugin() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("use_plugin"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code use_plugin}
     * @param usePlugin The new value of the field {@code use_plugin}
     */
    public void setUsePlugin(org.gtk.gobject.TypePluginUse usePlugin) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("use_plugin"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (usePlugin == null ? MemoryAddress.NULL : (Addressable) usePlugin.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code unuse_plugin}
     * @return The value of the field {@code unuse_plugin}
     */
    public org.gtk.gobject.TypePluginUnuse getUnusePlugin() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unuse_plugin"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code unuse_plugin}
     * @param unusePlugin The new value of the field {@code unuse_plugin}
     */
    public void setUnusePlugin(org.gtk.gobject.TypePluginUnuse unusePlugin) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unuse_plugin"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unusePlugin == null ? MemoryAddress.NULL : (Addressable) unusePlugin.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code complete_type_info}
     * @return The value of the field {@code complete_type_info}
     */
    public org.gtk.gobject.TypePluginCompleteTypeInfo getCompleteTypeInfo() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("complete_type_info"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code complete_type_info}
     * @param completeTypeInfo The new value of the field {@code complete_type_info}
     */
    public void setCompleteTypeInfo(org.gtk.gobject.TypePluginCompleteTypeInfo completeTypeInfo) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("complete_type_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (completeTypeInfo == null ? MemoryAddress.NULL : (Addressable) completeTypeInfo.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code complete_interface_info}
     * @return The value of the field {@code complete_interface_info}
     */
    public org.gtk.gobject.TypePluginCompleteInterfaceInfo getCompleteInterfaceInfo() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("complete_interface_info"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code complete_interface_info}
     * @param completeInterfaceInfo The new value of the field {@code complete_interface_info}
     */
    public void setCompleteInterfaceInfo(org.gtk.gobject.TypePluginCompleteInterfaceInfo completeInterfaceInfo) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("complete_interface_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (completeInterfaceInfo == null ? MemoryAddress.NULL : (Addressable) completeInterfaceInfo.toCallback()));
        }
    }
    
    /**
     * Create a TypePluginClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TypePluginClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TypePluginClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TypePluginClass(input);
    
    /**
     * A {@link TypePluginClass.Builder} object constructs a {@link TypePluginClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TypePluginClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TypePluginClass struct;
        
        private Builder() {
            struct = TypePluginClass.allocate();
        }
        
        /**
         * Finish building the {@link TypePluginClass} struct.
         * @return A new instance of {@code TypePluginClass} with the fields 
         *         that were set in the Builder object.
         */
        public TypePluginClass build() {
            return struct;
        }
        
        public Builder setBaseIface(org.gtk.gobject.TypeInterface baseIface) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("base_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (baseIface == null ? MemoryAddress.NULL : baseIface.handle()));
                return this;
            }
        }
        
        /**
         * Increases the use count of the plugin.
         * @param usePlugin The value for the {@code usePlugin} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUsePlugin(org.gtk.gobject.TypePluginUse usePlugin) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("use_plugin"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (usePlugin == null ? MemoryAddress.NULL : (Addressable) usePlugin.toCallback()));
                return this;
            }
        }
        
        /**
         * Decreases the use count of the plugin.
         * @param unusePlugin The value for the {@code unusePlugin} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUnusePlugin(org.gtk.gobject.TypePluginUnuse unusePlugin) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unuse_plugin"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unusePlugin == null ? MemoryAddress.NULL : (Addressable) unusePlugin.toCallback()));
                return this;
            }
        }
        
        /**
         * Fills in the {@link TypeInfo} and
         *  {@link TypeValueTable} structs for the type. The structs are initialized
         *  with {@code memset(s, 0, sizeof (s))} before calling this function.
         * @param completeTypeInfo The value for the {@code completeTypeInfo} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCompleteTypeInfo(org.gtk.gobject.TypePluginCompleteTypeInfo completeTypeInfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("complete_type_info"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (completeTypeInfo == null ? MemoryAddress.NULL : (Addressable) completeTypeInfo.toCallback()));
                return this;
            }
        }
        
        /**
         * Fills in missing parts of the {@link InterfaceInfo}
         *  for the interface. The structs is initialized with
         *  {@code memset(s, 0, sizeof (s))} before calling this function.
         * @param completeInterfaceInfo The value for the {@code completeInterfaceInfo} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCompleteInterfaceInfo(org.gtk.gobject.TypePluginCompleteInterfaceInfo completeInterfaceInfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("complete_interface_info"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (completeInterfaceInfo == null ? MemoryAddress.NULL : (Addressable) completeInterfaceInfo.toCallback()));
                return this;
            }
        }
    }
}
