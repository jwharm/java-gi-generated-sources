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
    default @Nullable org.gtk.gio.AppInfo getDefaultForUriScheme(@NotNull java.lang.String uriScheme) {
        java.util.Objects.requireNonNull(uriScheme, "Parameter 'uriScheme' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_lookup_get_default_for_uri_scheme.invokeExact(handle(), Interop.allocateNativeString(uriScheme));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.AppInfo.AppInfoImpl(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_desktop_app_info_lookup_get_default_for_uri_scheme = Interop.downcallHandle(
            "g_desktop_app_info_lookup_get_default_for_uri_scheme",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    class DesktopAppInfoLookupImpl extends org.gtk.gobject.Object implements DesktopAppInfoLookup {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public DesktopAppInfoLookupImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
