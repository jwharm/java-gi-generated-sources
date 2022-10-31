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
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public BuilderListItemFactory(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to BuilderListItemFactory if its GType is a (or inherits from) "GtkBuilderListItemFactory".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "BuilderListItemFactory" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkBuilderListItemFactory", a ClassCastException will be thrown.
     */
    public static BuilderListItemFactory castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkBuilderListItemFactory"))) {
            return new BuilderListItemFactory(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkBuilderListItemFactory");
        }
    }
    
    private static Refcounted constructNewFromBytes(@Nullable org.gtk.gtk.BuilderScope scope, @NotNull org.gtk.glib.Bytes bytes) {
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_builder_list_item_factory_new_from_bytes.invokeExact(
                    (Addressable) (scope == null ? MemoryAddress.NULL : scope.handle()),
                    bytes.handle()), true);
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
        return new BuilderListItemFactory(constructNewFromBytes(scope, bytes));
    }
    
    private static Refcounted constructNewFromResource(@Nullable org.gtk.gtk.BuilderScope scope, @NotNull java.lang.String resourcePath) {
        java.util.Objects.requireNonNull(resourcePath, "Parameter 'resourcePath' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_builder_list_item_factory_new_from_resource.invokeExact(
                    (Addressable) (scope == null ? MemoryAddress.NULL : scope.handle()),
                    Interop.allocateNativeString(resourcePath)), true);
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
        return new BuilderListItemFactory(constructNewFromResource(scope, resourcePath));
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
        return new org.gtk.glib.Bytes(Refcounted.get(RESULT, false));
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
        return new org.gtk.gtk.BuilderScope.BuilderScopeImpl(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_builder_list_item_factory_new_from_bytes = Interop.downcallHandle(
            "gtk_builder_list_item_factory_new_from_bytes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_builder_list_item_factory_new_from_resource = Interop.downcallHandle(
            "gtk_builder_list_item_factory_new_from_resource",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_builder_list_item_factory_get_bytes = Interop.downcallHandle(
            "gtk_builder_list_item_factory_get_bytes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_builder_list_item_factory_get_resource = Interop.downcallHandle(
            "gtk_builder_list_item_factory_get_resource",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_builder_list_item_factory_get_scope = Interop.downcallHandle(
            "gtk_builder_list_item_factory_get_scope",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
