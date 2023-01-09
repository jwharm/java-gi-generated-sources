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
     */
    protected IOModule(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, IOModule> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new IOModule(input);
    
    private static MemoryAddress constructNew(java.lang.String filename) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_io_module_new.invokeExact(Marshal.stringToAddress.marshal(filename, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new GIOModule that will load the specific
     * shared library when in use.
     * @param filename filename of the shared library module.
     */
    public IOModule(java.lang.String filename) {
        super(constructNew(filename));
        this.takeOwnership();
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
            DowncallHandles.g_io_module_load.invokeExact(handle());
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
            DowncallHandles.g_io_module_unload.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
    public static PointerString query() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_io_module_query.invokeExact();
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * A {@link IOModule.Builder} object constructs a {@link IOModule} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link IOModule.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.TypeModule.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link IOModule} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link IOModule}.
         * @return A new instance of {@code IOModule} with the properties 
         *         that were set in the Builder object.
         */
        public IOModule build() {
            return (IOModule) org.gtk.gobject.GObject.newWithProperties(
                IOModule.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_io_module_get_type != null;
    }
}
