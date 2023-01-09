package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkBuilderListItemFactory} is a {@code GtkListItemFactory} that creates
 * widgets by instantiating {@code GtkBuilder} UI templates.
 * <p>
 * The templates must be extending {@code GtkListItem}, and typically use
 * {@code GtkExpression}s to obtain data from the items in the model.
 * <p>
 * Example:
 * <pre>{@code xml
 *   <interface>
 *     <template class="GtkListItem">
 *       <property name="child">
 *         <object class="GtkLabel">
 *           <property name="xalign">0</property>
 *           <binding name="label">
 *             <lookup name="name" type="SettingsKey">
 *               <lookup name="item">GtkListItem</lookup>
 *             </lookup>
 *           </binding>
 *         </object>
 *       </property>
 *     </template>
 *   </interface>
 * }</pre>
 */
public class BuilderListItemFactory extends org.gtk.gtk.ListItemFactory {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBuilderListItemFactory";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a BuilderListItemFactory proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected BuilderListItemFactory(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BuilderListItemFactory> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BuilderListItemFactory(input);
    
    private static MemoryAddress constructNewFromBytes(@Nullable org.gtk.gtk.BuilderScope scope, org.gtk.glib.Bytes bytes) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_builder_list_item_factory_new_from_bytes.invokeExact(
                    (Addressable) (scope == null ? MemoryAddress.NULL : scope.handle()),
                    bytes.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@code GtkBuilderListItemFactory} that instantiates widgets
     * using {@code bytes} as the data to pass to {@code GtkBuilder}.
     * @param scope A scope to use when instantiating
     * @param bytes the {@code GBytes} containing the ui file to instantiate
     * @return a new {@code GtkBuilderListItemFactory}
     */
    public static BuilderListItemFactory newFromBytes(@Nullable org.gtk.gtk.BuilderScope scope, org.gtk.glib.Bytes bytes) {
        var RESULT = constructNewFromBytes(scope, bytes);
        var OBJECT = (org.gtk.gtk.BuilderListItemFactory) Interop.register(RESULT, org.gtk.gtk.BuilderListItemFactory.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromResource(@Nullable org.gtk.gtk.BuilderScope scope, java.lang.String resourcePath) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_builder_list_item_factory_new_from_resource.invokeExact(
                        (Addressable) (scope == null ? MemoryAddress.NULL : scope.handle()),
                        Marshal.stringToAddress.marshal(resourcePath, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new {@code GtkBuilderListItemFactory} that instantiates widgets
     * using data read from the given {@code resource_path} to pass to {@code GtkBuilder}.
     * @param scope A scope to use when instantiating
     * @param resourcePath valid path to a resource that contains the data
     * @return a new {@code GtkBuilderListItemFactory}
     */
    public static BuilderListItemFactory newFromResource(@Nullable org.gtk.gtk.BuilderScope scope, java.lang.String resourcePath) {
        var RESULT = constructNewFromResource(scope, resourcePath);
        var OBJECT = (org.gtk.gtk.BuilderListItemFactory) Interop.register(RESULT, org.gtk.gtk.BuilderListItemFactory.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the data used as the {@code GtkBuilder} UI template for constructing
     * listitems.
     * @return The {@code GtkBuilder} data
     */
    public org.gtk.glib.Bytes getBytes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_builder_list_item_factory_get_bytes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Bytes.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * If the data references a resource, gets the path of that resource.
     * @return The path to the resource
     */
    public @Nullable java.lang.String getResource() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_builder_list_item_factory_get_resource.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the scope used when constructing listitems.
     * @return The scope used when constructing listitems
     */
    public @Nullable org.gtk.gtk.BuilderScope getScope() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_builder_list_item_factory_get_scope.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.BuilderScope) Interop.register(RESULT, org.gtk.gtk.BuilderScope.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_builder_list_item_factory_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link BuilderListItemFactory.Builder} object constructs a {@link BuilderListItemFactory} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link BuilderListItemFactory.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.ListItemFactory.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link BuilderListItemFactory} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link BuilderListItemFactory}.
         * @return A new instance of {@code BuilderListItemFactory} with the properties 
         *         that were set in the Builder object.
         */
        public BuilderListItemFactory build() {
            return (BuilderListItemFactory) org.gtk.gobject.GObject.newWithProperties(
                BuilderListItemFactory.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * {@code GBytes} containing the UI definition.
         * @param bytes The value for the {@code bytes} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBytes(org.gtk.glib.Bytes bytes) {
            names.add("bytes");
            values.add(org.gtk.gobject.Value.create(bytes));
            return this;
        }
        
        /**
         * Path of the resource containing the UI definition.
         * @param resource The value for the {@code resource} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setResource(java.lang.String resource) {
            names.add("resource");
            values.add(org.gtk.gobject.Value.create(resource));
            return this;
        }
        
        /**
         * {@code GtkBuilderScope} to use when instantiating listitems
         * @param scope The value for the {@code scope} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScope(org.gtk.gtk.BuilderScope scope) {
            names.add("scope");
            values.add(org.gtk.gobject.Value.create(scope));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_builder_list_item_factory_new_from_bytes = Interop.downcallHandle(
                "gtk_builder_list_item_factory_new_from_bytes",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_builder_list_item_factory_new_from_resource = Interop.downcallHandle(
                "gtk_builder_list_item_factory_new_from_resource",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_builder_list_item_factory_get_bytes = Interop.downcallHandle(
                "gtk_builder_list_item_factory_get_bytes",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_builder_list_item_factory_get_resource = Interop.downcallHandle(
                "gtk_builder_list_item_factory_get_resource",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_builder_list_item_factory_get_scope = Interop.downcallHandle(
                "gtk_builder_list_item_factory_get_scope",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_builder_list_item_factory_get_type = Interop.downcallHandle(
                "gtk_builder_list_item_factory_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_builder_list_item_factory_get_type != null;
    }
}
