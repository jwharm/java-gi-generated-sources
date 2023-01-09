package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DesktopAppInfoLookup} is an opaque data structure and can only be accessed
 * using the following functions.
 */
public interface DesktopAppInfoLookup extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DesktopAppInfoLookupImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DesktopAppInfoLookupImpl(input);
    
    /**
     * Gets the default application for launching applications
     * using this URI scheme for a particular {@link DesktopAppInfoLookup}
     * implementation.
     * <p>
     * The {@link DesktopAppInfoLookup} interface and this function is used
     * to implement g_app_info_get_default_for_uri_scheme() backends
     * in a GIO module. There is no reason for applications to use it
     * directly. Applications should use g_app_info_get_default_for_uri_scheme().
     * @param uriScheme a string containing a URI scheme.
     * @return {@link AppInfo} for given {@code uri_scheme} or
     *    {@code null} on error.
     * @deprecated The {@link DesktopAppInfoLookup} interface is deprecated and
     *    unused by GIO.
     */
    @Deprecated
    default @Nullable org.gtk.gio.AppInfo getDefaultForUriScheme(java.lang.String uriScheme) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_lookup_get_default_for_uri_scheme.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uriScheme, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = (org.gtk.gio.AppInfo) Interop.register(RESULT, org.gtk.gio.AppInfo.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_desktop_app_info_lookup_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_desktop_app_info_lookup_get_default_for_uri_scheme = Interop.downcallHandle(
                "g_desktop_app_info_lookup_get_default_for_uri_scheme",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_desktop_app_info_lookup_get_type = Interop.downcallHandle(
                "g_desktop_app_info_lookup_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The DesktopAppInfoLookupImpl type represents a native instance of the DesktopAppInfoLookup interface.
     */
    class DesktopAppInfoLookupImpl extends org.gtk.gobject.GObject implements DesktopAppInfoLookup {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of DesktopAppInfoLookup for the provided memory address.
         * @param address the memory address of the instance
         */
        public DesktopAppInfoLookupImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_desktop_app_info_lookup_get_type != null;
    }
}
