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
     * Cast object to DesktopAppInfoLookup if its GType is a (or inherits from) "GDesktopAppInfoLookup".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "DesktopAppInfoLookup" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDesktopAppInfoLookup", a ClassCastException will be thrown.
     */
    public static DesktopAppInfoLookup castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GDesktopAppInfoLookup"))) {
            return new DesktopAppInfoLookupImpl(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GDesktopAppInfoLookup");
        }
    }
    
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
            RESULT = (MemoryAddress) DowncallHandles.g_desktop_app_info_lookup_get_default_for_uri_scheme.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uriScheme));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.AppInfo.AppInfoImpl(RESULT, Ownership.FULL);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_desktop_app_info_lookup_get_default_for_uri_scheme = Interop.downcallHandle(
            "g_desktop_app_info_lookup_get_default_for_uri_scheme",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    class DesktopAppInfoLookupImpl extends org.gtk.gobject.Object implements DesktopAppInfoLookup {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public DesktopAppInfoLookupImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
