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
public class BuilderListItemFactory extends ListItemFactory {

    public BuilderListItemFactory(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to BuilderListItemFactory */
    public static BuilderListItemFactory castFrom(org.gtk.gobject.Object gobject) {
        return new BuilderListItemFactory(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_builder_list_item_factory_new_from_bytes = Interop.downcallHandle(
        "gtk_builder_list_item_factory_new_from_bytes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromBytes(@Nullable BuilderScope scope, @NotNull org.gtk.glib.Bytes bytes) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_builder_list_item_factory_new_from_bytes.invokeExact(scope.handle(), bytes.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkBuilderListItemFactory} that instantiates widgets
     * using {@code bytes} as the data to pass to {@code GtkBuilder}.
     */
    public static BuilderListItemFactory newFromBytes(@Nullable BuilderScope scope, @NotNull org.gtk.glib.Bytes bytes) {
        return new BuilderListItemFactory(constructNewFromBytes(scope, bytes));
    }
    
    private static final MethodHandle gtk_builder_list_item_factory_new_from_resource = Interop.downcallHandle(
        "gtk_builder_list_item_factory_new_from_resource",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromResource(@Nullable BuilderScope scope, @NotNull java.lang.String resourcePath) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_builder_list_item_factory_new_from_resource.invokeExact(scope.handle(), Interop.allocateNativeString(resourcePath)), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkBuilderListItemFactory} that instantiates widgets
     * using data read from the given {@code resource_path} to pass to {@code GtkBuilder}.
     */
    public static BuilderListItemFactory newFromResource(@Nullable BuilderScope scope, @NotNull java.lang.String resourcePath) {
        return new BuilderListItemFactory(constructNewFromResource(scope, resourcePath));
    }
    
    private static final MethodHandle gtk_builder_list_item_factory_get_bytes = Interop.downcallHandle(
        "gtk_builder_list_item_factory_get_bytes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the data used as the {@code GtkBuilder} UI template for constructing
     * listitems.
     */
    public @NotNull org.gtk.glib.Bytes getBytes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_builder_list_item_factory_get_bytes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Bytes(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_builder_list_item_factory_get_resource = Interop.downcallHandle(
        "gtk_builder_list_item_factory_get_resource",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * If the data references a resource, gets the path of that resource.
     */
    public @Nullable java.lang.String getResource() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_builder_list_item_factory_get_resource.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_builder_list_item_factory_get_scope = Interop.downcallHandle(
        "gtk_builder_list_item_factory_get_scope",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the scope used when constructing listitems.
     */
    public @Nullable BuilderScope getScope() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_builder_list_item_factory_get_scope.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BuilderScope.BuilderScopeImpl(Refcounted.get(RESULT, false));
    }
    
}
