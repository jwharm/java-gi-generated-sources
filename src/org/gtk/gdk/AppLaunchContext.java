package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GdkAppLaunchContext} handles launching an application in a graphical context.
 * <p>
 * It is an implementation of {@code GAppLaunchContext} that provides startup
 * notification and allows to launch applications on a specific workspace.
 * <p>
 * <h2>Launching an application</h2>
 * <p>
 * <pre>{@code c
 * GdkAppLaunchContext *context;
 * 
 * context = gdk_display_get_app_launch_context (display);
 * 
 * gdk_app_launch_context_set_timestamp (gdk_event_get_time (event));
 * 
 * if (!g_app_info_launch_default_for_uri ("http://www.gtk.org", context, &error))
 *   g_warning ("Launching failed: %s\\n", error->message);
 * 
 * g_object_unref (context);
 * }</pre>
 */
public class AppLaunchContext extends org.gtk.gio.AppLaunchContext {

    public AppLaunchContext(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to AppLaunchContext */
    public static AppLaunchContext castFrom(org.gtk.gobject.Object gobject) {
        return new AppLaunchContext(gobject.getReference());
    }
    
    /**
     * Gets the {@code GdkDisplay} that {@code context} is for.
     */
    public Display getDisplay() {
        var RESULT = gtk_h.gdk_app_launch_context_get_display(handle());
        return new Display(References.get(RESULT, false));
    }
    
    /**
     * Sets the workspace on which applications will be launched.
     * <p>
     * This only works when running under a window manager that
     * supports multiple workspaces, as described in the
     * <a href="http://www.freedesktop.org/Standards/wm-spec">Extended Window Manager Hints</a>.
     * Specifically this sets the {@code _NET_WM_DESKTOP} property described
     * in that spec.
     * <p>
     * This only works when using the X11 backend.
     * <p>
     * When the workspace is not specified or {@code desktop} is set to -1,
     * it is up to the window manager to pick one, typically it will
     * be the current workspace.
     */
    public void setDesktop(int desktop) {
        gtk_h.gdk_app_launch_context_set_desktop(handle(), desktop);
    }
    
    /**
     * Sets the icon for applications that are launched with this
     * context.
     * <p>
     * Window Managers can use this information when displaying startup
     * notification.
     * <p>
     * See also {@link AppLaunchContext#setIconName}.
     */
    public void setIcon(org.gtk.gio.Icon icon) {
        gtk_h.gdk_app_launch_context_set_icon(handle(), icon.handle());
    }
    
    /**
     * Sets the icon for applications that are launched with this context.
     * <p>
     * The {@code icon_name} will be interpreted in the same way as the Icon field
     * in desktop files. See also {@link AppLaunchContext#setIcon}.
     * <p>
     * If both {@code icon} and {@code icon_name} are set, the {@code icon_name} takes priority.
     * If neither {@code icon} or {@code icon_name} is set, the icon is taken from either
     * the file that is passed to launched application or from the {@code GAppInfo}
     * for the launched application itself.
     */
    public void setIconName(java.lang.String iconName) {
        gtk_h.gdk_app_launch_context_set_icon_name(handle(), Interop.allocateNativeString(iconName).handle());
    }
    
    /**
     * Sets the timestamp of {@code context}.
     * <p>
     * The timestamp should ideally be taken from the event that
     * triggered the launch.
     * <p>
     * Window managers can use this information to avoid moving the
     * focus to the newly launched application when the user is busy
     * typing in another window. This is also known as 'focus stealing
     * prevention'.
     */
    public void setTimestamp(int timestamp) {
        gtk_h.gdk_app_launch_context_set_timestamp(handle(), timestamp);
    }
    
}
