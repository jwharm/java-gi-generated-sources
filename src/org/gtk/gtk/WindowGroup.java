package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkWindowGroup` makes group of windows behave like separate applications.
 * 
 * It achieves this by limiting the effect of GTK grabs and modality
 * to windows in the same group.
 * 
 * A window can be a member in at most one window group at a time.
 * Windows that have not been explicitly assigned to a group are
 * implicitly treated like windows of the default window group.
 * 
 * `GtkWindowGroup` objects are referenced by each window in the group,
 * so once you have added all windows to a `GtkWindowGroup`, you can drop
 * the initial reference to the window group with g_object_unref(). If the
 * windows in the window group are subsequently destroyed, then they will
 * be removed from the window group and drop their references on the window
 * group; when all window have been removed, the window group will be
 * freed.
 */
public class WindowGroup extends org.gtk.gobject.Object {

    public WindowGroup(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to WindowGroup */
    public static WindowGroup castFrom(org.gtk.gobject.Object gobject) {
        return new WindowGroup(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkWindowGroup` object.
     * 
     * Modality of windows only affects windows
     * within the same `GtkWindowGroup`.
     */
    public WindowGroup() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_window_group_new(), true));
    }
    
    /**
     * Adds a window to a `GtkWindowGroup`.
     */
    public void addWindow(Window window) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_window_group_add_window(HANDLE(), window.HANDLE());
    }
    
    /**
     * Returns a list of the `GtkWindows` that belong to @window_group.
     */
    public org.gtk.glib.List listWindows() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_window_group_list_windows(HANDLE());
        return new org.gtk.glib.List(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Removes a window from a `GtkWindowGroup`.
     */
    public void removeWindow(Window window) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_window_group_remove_window(HANDLE(), window.HANDLE());
    }
    
}
