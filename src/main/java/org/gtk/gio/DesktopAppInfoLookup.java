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
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DesktopAppInfoLookupImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DesktopAppInfoLookupImpl(input, ownership);
    
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
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_lookup_get_default_for_uri_scheme.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(uriScheme, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.AppInfo.fromAddress).marshal(RESULT, Ownership.FULL);
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
    
    class DesktopAppInfoLookupImpl extends org.gtk.gobject.GObject implements DesktopAppInfoLookup {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public DesktopAppInfoLookupImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
