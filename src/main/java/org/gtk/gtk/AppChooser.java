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
    
    /**
     * Cast object to AppChooser if its GType is a (or inherits from) "GtkAppChooser".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "AppChooser" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkAppChooser", a ClassCastException will be thrown.
     */
    public static AppChooser castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkAppChooser"))) {
            return new AppChooserImpl(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkAppChooser");
        }
    }
    
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
        return new org.gtk.gio.AppInfo.AppInfoImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Returns the content type for which the {@code GtkAppChooser}
     * shows applications.
     * @return the content type of {@code self}. Free with g_free()
     */
    default @NotNull java.lang.String getContentType() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_app_chooser_get_content_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_app_chooser_get_app_info = Interop.downcallHandle(
            "gtk_app_chooser_get_app_info",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_app_chooser_get_content_type = Interop.downcallHandle(
            "gtk_app_chooser_get_content_type",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_app_chooser_refresh = Interop.downcallHandle(
            "gtk_app_chooser_refresh",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
    
    class AppChooserImpl extends org.gtk.gobject.Object implements AppChooser {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public AppChooserImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
