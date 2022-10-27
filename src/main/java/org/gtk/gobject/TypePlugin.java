package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An interface that handles the lifecycle of dynamically loaded types.
 * <p>
 * The GObject type system supports dynamic loading of types.
 * It goes as follows:
 * <p>
 * 1. The type is initially introduced (usually upon loading the module
 *    the first time, or by your main application that knows what modules
 *    introduces what types), like this:
 *    <pre>{@code <!-- language="C" -->
 *    new_type_id = g_type_register_dynamic (parent_type_id,
 *                                           "TypeName",
 *                                           new_type_plugin,
 *                                           type_flags);
 *    }</pre>
 *    where {@code new_type_plugin} is an implementation of the
 *    {@link TypePlugin} interface.
 * <p>
 * 2. The type's implementation is referenced, e.g. through
 *    g_type_class_ref() or through g_type_create_instance() (this is
 *    being called by g_object_new()) or through one of the above done on
 *    a type derived from {@code new_type_id}.
 * <p>
 * 3. This causes the type system to load the type's implementation by
 *    calling g_type_plugin_use() and g_type_plugin_complete_type_info()
 *    on {@code new_type_plugin}.
 * <p>
 * 4. At some point the type's implementation isn't required anymore,
 *    e.g. after g_type_class_unref() or g_type_free_instance() (called
 *    when the reference count of an instance drops to zero).
 * <p>
 * 5. This causes the type system to throw away the information retrieved
 *    from g_type_plugin_complete_type_info() and then it calls
 *    g_type_plugin_unuse() on {@code new_type_plugin}.
 * <p>
 * 6. Things may repeat from the second step.
 * <p>
 * So basically, you need to implement a {@link TypePlugin} type that
 * carries a use_count, once use_count goes from zero to one, you need
 * to load the implementation to successfully handle the upcoming
 * g_type_plugin_complete_type_info() call. Later, maybe after
 * succeeding use/unuse calls, once use_count drops to zero, you can
 * unload the implementation again. The type system makes sure to call
 * g_type_plugin_use() and g_type_plugin_complete_type_info() again
 * when the type is needed again.
 * <p>
 * {@link TypeModule} is an implementation of {@link TypePlugin} that already
 * implements most of this except for the actual module loading and
 * unloading. It even handles multiple registered types per module.
 */
public interface TypePlugin extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Calls the {@code complete_interface_info} function from the
     * {@link TypePluginClass} of {@code plugin}. There should be no need to use this
     * function outside of the GObject type system itself.
     * @param instanceType the {@link Type} of an instantiatable type to which the interface
     *  is added
     * @param interfaceType the {@link Type} of the interface whose info is completed
     * @param info the {@link InterfaceInfo} to fill in
     */
    default void completeInterfaceInfo(@NotNull org.gtk.glib.Type instanceType, @NotNull org.gtk.glib.Type interfaceType, @NotNull org.gtk.gobject.InterfaceInfo info) {
        java.util.Objects.requireNonNull(instanceType, "Parameter 'instanceType' must not be null");
        java.util.Objects.requireNonNull(interfaceType, "Parameter 'interfaceType' must not be null");
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        try {
            DowncallHandles.g_type_plugin_complete_interface_info.invokeExact(handle(), instanceType.getValue(), interfaceType.getValue(), info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls the {@code complete_type_info} function from the {@link TypePluginClass} of {@code plugin}.
     * There should be no need to use this function outside of the GObject
     * type system itself.
     * @param gType the {@link Type} whose info is completed
     * @param info the {@link TypeInfo} struct to fill in
     * @param valueTable the {@link TypeValueTable} to fill in
     */
    default void completeTypeInfo(@NotNull org.gtk.glib.Type gType, @NotNull org.gtk.gobject.TypeInfo info, @NotNull org.gtk.gobject.TypeValueTable valueTable) {
        java.util.Objects.requireNonNull(gType, "Parameter 'gType' must not be null");
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        java.util.Objects.requireNonNull(valueTable, "Parameter 'valueTable' must not be null");
        try {
            DowncallHandles.g_type_plugin_complete_type_info.invokeExact(handle(), gType.getValue(), info.handle(), valueTable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls the {@code unuse_plugin} function from the {@link TypePluginClass} of
     * {@code plugin}.  There should be no need to use this function outside of
     * the GObject type system itself.
     */
    default void unuse() {
        try {
            DowncallHandles.g_type_plugin_unuse.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls the {@code use_plugin} function from the {@link TypePluginClass} of
     * {@code plugin}.  There should be no need to use this function outside of
     * the GObject type system itself.
     */
    default void use() {
        try {
            DowncallHandles.g_type_plugin_use.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_type_plugin_complete_interface_info = Interop.downcallHandle(
            "g_type_plugin_complete_interface_info",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_type_plugin_complete_type_info = Interop.downcallHandle(
            "g_type_plugin_complete_type_info",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_type_plugin_unuse = Interop.downcallHandle(
            "g_type_plugin_unuse",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_type_plugin_use = Interop.downcallHandle(
            "g_type_plugin_use",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
    
    class TypePluginImpl extends org.gtk.gobject.Object implements TypePlugin {
        
        static {
            GObject.javagi$ensureInitialized();
        }
        
        public TypePluginImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
