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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BuilderListItemFactory(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to BuilderListItemFactory if its GType is a (or inherits from) "GtkBuilderListItemFactory".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code BuilderListItemFactory} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkBuilderListItemFactory", a ClassCastException will be thrown.
     */
    public static BuilderListItemFactory castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), BuilderListItemFactory.getType())) {
            return new BuilderListItemFactory(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkBuilderListItemFactory");
        }
    }
    
    private static Addressable constructNewFromBytes(@Nullable org.gtk.gtk.BuilderScope scope, @NotNull org.gtk.glib.Bytes bytes) {
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        Addressable RESULT;
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
    public static BuilderListItemFactory newFromBytes(@Nullable org.gtk.gtk.BuilderScope scope, @NotNull org.gtk.glib.Bytes bytes) {
        return new BuilderListItemFactory(constructNewFromBytes(scope, bytes), Ownership.FULL);
    }
    
    private static Addressable constructNewFromResource(@Nullable org.gtk.gtk.BuilderScope scope, @NotNull java.lang.String resourcePath) {
        java.util.Objects.requireNonNull(resourcePath, "Parameter 'resourcePath' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_builder_list_item_factory_new_from_resource.invokeExact(
                    (Addressable) (scope == null ? MemoryAddress.NULL : scope.handle()),
                    Interop.allocateNativeString(resourcePath));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkBuilderListItemFactory} that instantiates widgets
     * using data read from the given {@code resource_path} to pass to {@code GtkBuilder}.
     * @param scope A scope to use when instantiating
     * @param resourcePath valid path to a resource that contains the data
     * @return a new {@code GtkBuilderListItemFactory}
     */
    public static BuilderListItemFactory newFromResource(@Nullable org.gtk.gtk.BuilderScope scope, @NotNull java.lang.String resourcePath) {
        return new BuilderListItemFactory(constructNewFromResource(scope, resourcePath), Ownership.FULL);
    }
    
    /**
     * Gets the data used as the {@code GtkBuilder} UI template for constructing
     * listitems.
     * @return The {@code GtkBuilder} data
     */
    public @NotNull org.gtk.glib.Bytes getBytes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_builder_list_item_factory_get_bytes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Bytes(RESULT, Ownership.NONE);
    }
    
    /**
     * If the data references a resource, gets the path of that resource.
     * @return The path to the resource
     */
    public @Nullable java.lang.String getResource() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_builder_list_item_factory_get_resource.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the scope used when constructing listitems.
     * @return The scope used when constructing listitems
     */
    public @Nullable org.gtk.gtk.BuilderScope getScope() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_builder_list_item_factory_get_scope.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.BuilderScope.BuilderScopeImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_builder_list_item_factory_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.ListItemFactory.Build {
        
         /**
         * A {@link BuilderListItemFactory.Build} object constructs a {@link BuilderListItemFactory} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link BuilderListItemFactory} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link BuilderListItemFactory} using {@link BuilderListItemFactory#castFrom}.
         * @return A new instance of {@code BuilderListItemFactory} with the properties 
         *         that were set in the Build object.
         */
        public BuilderListItemFactory construct() {
            return BuilderListItemFactory.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    BuilderListItemFactory.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * {@code GBytes} containing the UI definition.
         * @param bytes The value for the {@code bytes} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBytes(org.gtk.glib.Bytes bytes) {
            names.add("bytes");
            values.add(org.gtk.gobject.Value.create(bytes));
            return this;
        }
        
        /**
         * Path of the resource containing the UI definition.
         * @param resource The value for the {@code resource} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setResource(java.lang.String resource) {
            names.add("resource");
            values.add(org.gtk.gobject.Value.create(resource));
            return this;
        }
        
        /**
         * {@code GtkBuilderScope} to use when instantiating listitems
         * @param scope The value for the {@code scope} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScope(org.gtk.gtk.BuilderScope scope) {
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
}
