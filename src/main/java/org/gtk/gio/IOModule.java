package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides an interface and default functions for loading and unloading
 * modules. This is used internally to make GIO extensible, but can also
 * be used by others to implement module loading.
 */
public class IOModule extends org.gtk.gobject.TypeModule implements org.gtk.gobject.TypePlugin {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GIOModule";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a IOModule proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public IOModule(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to IOModule if its GType is a (or inherits from) "GIOModule".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code IOModule} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GIOModule", a ClassCastException will be thrown.
     */
    public static IOModule castFrom(org.gtk.gobject.Object gobject) {
            return new IOModule(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@NotNull java.lang.String filename) {
        java.util.Objects.requireNonNull(filename, "Parameter 'filename' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_io_module_new.invokeExact(
                    Interop.allocateNativeString(filename));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new GIOModule that will load the specific
     * shared library when in use.
     * @param filename filename of the shared library module.
     */
    public IOModule(@NotNull java.lang.String filename) {
        super(constructNew(filename), Ownership.FULL);
    }
    
    /**
     * Required API for GIO modules to implement.
     * <p>
     * This function is run after the module has been loaded into GIO,
     * to initialize the module. Typically, this function will call
     * g_io_extension_point_implement().
     * <p>
     * Since 2.56, this function should be named {@code g_io_<modulename>_load}, where
     * {@code modulename} is the plugin’s filename with the {@code lib} or {@code libgio} prefix and
     * everything after the first dot removed, and with {@code -} replaced with {@code _}
     * throughout. For example, {@code libgiognutls-helper.so} becomes {@code gnutls_helper}.
     * Using the new symbol names avoids name clashes when building modules
     * statically. The old symbol names continue to be supported, but cannot be used
     * for static builds.
     */
    public void load() {
        try {
            DowncallHandles.g_io_module_load.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Required API for GIO modules to implement.
     * <p>
     * This function is run when the module is being unloaded from GIO,
     * to finalize the module.
     * <p>
     * Since 2.56, this function should be named {@code g_io_<modulename>_unload}, where
     * {@code modulename} is the plugin’s filename with the {@code lib} or {@code libgio} prefix and
     * everything after the first dot removed, and with {@code -} replaced with {@code _}
     * throughout. For example, {@code libgiognutls-helper.so} becomes {@code gnutls_helper}.
     * Using the new symbol names avoids name clashes when building modules
     * statically. The old symbol names continue to be supported, but cannot be used
     * for static builds.
     */
    public void unload() {
        try {
            DowncallHandles.g_io_module_unload.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_io_module_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Optional API for GIO modules to implement.
     * <p>
     * Should return a list of all the extension points that may be
     * implemented in this module.
     * <p>
     * This method will not be called in normal use, however it may be
     * called when probing existing modules and recording which extension
     * points that this model is used for. This means we won't have to
     * load and initialize this module unless its needed.
     * <p>
     * If this function is not implemented by the module the module will
     * always be loaded, initialized and then unloaded on application
     * startup so that it can register its extension points during init.
     * <p>
     * Note that a module need not actually implement all the extension
     * points that g_io_module_query() returns, since the exact list of
     * extension may depend on runtime issues. However all extension
     * points actually implemented must be returned by g_io_module_query()
     * (if defined).
     * <p>
     * When installing a module that implements g_io_module_query() you must
     * run gio-querymodules in order to build the cache files required for
     * lazy loading.
     * <p>
     * Since 2.56, this function should be named {@code g_io_<modulename>_query}, where
     * {@code modulename} is the plugin’s filename with the {@code lib} or {@code libgio} prefix and
     * everything after the first dot removed, and with {@code -} replaced with {@code _}
     * throughout. For example, {@code libgiognutls-helper.so} becomes {@code gnutls_helper}.
     * Using the new symbol names avoids name clashes when building modules
     * statically. The old symbol names continue to be supported, but cannot be used
     * for static builds.
     * @return A {@code null}-terminated array of strings,
     *     listing the supported extension points of the module. The array
     *     must be suitable for freeing with g_strfreev().
     */
    public static @NotNull PointerString query() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_io_module_query.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.TypeModule.Build {
        
         /**
         * A {@link IOModule.Build} object constructs a {@link IOModule} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link IOModule} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link IOModule} using {@link IOModule#castFrom}.
         * @return A new instance of {@code IOModule} with the properties 
         *         that were set in the Build object.
         */
        public IOModule construct() {
            return IOModule.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    IOModule.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_io_module_new = Interop.downcallHandle(
            "g_io_module_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_module_load = Interop.downcallHandle(
            "g_io_module_load",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_module_unload = Interop.downcallHandle(
            "g_io_module_unload",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_module_get_type = Interop.downcallHandle(
            "g_io_module_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_io_module_query = Interop.downcallHandle(
            "g_io_module_query",
            FunctionDescriptor.ofVoid(),
            false
        );
    }
}
