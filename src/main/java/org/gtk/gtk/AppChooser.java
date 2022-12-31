package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkAppChooser} is an interface for widgets which allow the user to
 * choose an application.
 * <p>
 * The main objects that implement this interface are
 * {@link AppChooserWidget},
 * {@link AppChooserDialog}.
 * <p>
 * Applications are represented by GIO {@code GAppInfo} objects here.
 * GIO has a concept of recommended and fallback applications for a
 * given content type. Recommended applications are those that claim
 * to handle the content type itself, while fallback also includes
 * applications that handle a more generic content type. GIO also
 * knows the default and last-used application for a given content
 * type. The {@code GtkAppChooserWidget} provides detailed control over
 * whether the shown list of applications should include default,
 * recommended or fallback applications.
 * <p>
 * To obtain the application that has been selected in a {@code GtkAppChooser},
 * use {@link AppChooser#getAppInfo}.
 */
public interface AppChooser extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AppChooserImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AppChooserImpl(input, ownership);
    
    /**
     * Returns the currently selected application.
     * @return a {@code GAppInfo} for the
     *   currently selected application
     */
    default @Nullable org.gtk.gio.AppInfo getAppInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_app_chooser_get_app_info.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.AppInfo.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the content type for which the {@code GtkAppChooser}
     * shows applications.
     * @return the content type of {@code self}. Free with g_free()
     */
    default java.lang.String getContentType() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_app_chooser_get_content_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Reloads the list of applications.
     */
    default void refresh() {
        try {
            DowncallHandles.gtk_app_chooser_refresh.invokeExact(
                    handle());
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
            RESULT = (long) DowncallHandles.gtk_app_chooser_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_app_chooser_get_app_info = Interop.downcallHandle(
            "gtk_app_chooser_get_app_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_app_chooser_get_content_type = Interop.downcallHandle(
            "gtk_app_chooser_get_content_type",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_app_chooser_refresh = Interop.downcallHandle(
            "gtk_app_chooser_refresh",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_app_chooser_get_type = Interop.downcallHandle(
            "gtk_app_chooser_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class AppChooserImpl extends org.gtk.gobject.GObject implements AppChooser {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public AppChooserImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
