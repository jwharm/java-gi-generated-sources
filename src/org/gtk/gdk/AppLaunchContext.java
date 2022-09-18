package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GdkAppLaunchContext</code> handles launching an application in a graphical context.
 * <p>
 * It is an implementation of <code>GAppLaunchContext</code> that provides startup
 * notification and allows to launch applications on a specific workspace.
 * <p>
 * <h2>Launching an application</h2>
 * <p><pre>c
 * GdkAppLaunchContext *context;
 * 
 * context = gdk_display_get_app_launch_context (display);
 * 
 * gdk_app_launch_context_set_timestamp (gdk_event_get_time (event));
 * 
 * if (!g_app_info_launch_default_for_uri (&<code>#34</code> http://www.gtk.org&<code>#34</code> , context, &<code>#38</code> error))
 *   g_warning (&<code>#34</code> Launching failed: <code>s</code> n&<code>#34</code> , error-&<code>#62</code> message);
 * 
 * g_object_unref (context);
 * </pre>
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
     * Gets the <code>GdkDisplay</code> that @context is for.
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
     * {@link [Extended Window Manager Hints]}(http://www.freedesktop.org/Standards/wm-spec).
     * Specifically this sets the <code>_NET_WM_DESKTOP</code> property described
     * in that spec.
     * 
     * This only works when using the X11 backend.
     * 
     * When the workspace is not specified or @desktop is set to -1,
     * it is up to the window manager to pick one, typically it will
     * be the current workspace.
     */
    public void setDesktop(int desktop) {
        gtk_h.gdk_app_launch_context_set_desktop(handle(), desktop);
    }
    
    /**
     * Sets the icon for applications that are launched with this
     * context.
     * 
     * Window Managers can use this information when displaying startup
     * notification.
     * 
     * See also {@link org.gtk.gdk.AppLaunchContext<code>#setIconName</code> .
     */
    public void setIcon(org.gtk.gio.Icon icon) {
        gtk_h.gdk_app_launch_context_set_icon(handle(), icon.handle());
    }
    
    /**
     * Sets the icon for applications that are launched with this context.
     * <p>
     * The @icon_name will be interpreted in the same way as the Icon field
     * in desktop files. See also {@link org.gtk.gdk.AppLaunchContext<code>#setIcon</code> .
     * <p>
     * If both @icon and @icon_name are set, the @icon_name takes priority.
     * If neither @icon or @icon_name is set, the icon is taken from either
     * the file that is passed to launched application or from the <code>GAppInfo</code>
     * for the launched application itself.
     */
    public void setIconName(java.lang.String iconName) {
        gtk_h.gdk_app_launch_context_set_icon_name(handle(), Interop.allocateNativeString(iconName).handle());
    }
    
    /**
     * Sets the timestamp of @context.
     * 
     * The timestamp should ideally be taken from the event that
     * triggered the launch.
     * 
     * Window managers can use this information to avoid moving the
     * focus to the newly launched application when the user is busy
     * typing in another window. This is also known as &<code>#39</code> focus stealing
     * prevention&<code>#39</code> .
     */
    public void setTimestamp(int timestamp) {
        gtk_h.gdk_app_launch_context_set_timestamp(handle(), timestamp);
    }
    
}
