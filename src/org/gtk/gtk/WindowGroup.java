package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkWindowGroup} makes group of windows behave like separate applications.
 * <p>
 * It achieves this by limiting the effect of GTK grabs and modality
 * to windows in the same group.
 * <p>
 * A window can be a member in at most one window group at a time.
 * Windows that have not been explicitly assigned to a group are
 * implicitly treated like windows of the default window group.
 * <p>
 * {@code GtkWindowGroup} objects are referenced by each window in the group,
 * so once you have added all windows to a {@code GtkWindowGroup}, you can drop
 * the initial reference to the window group with g_object_unref(). If the
 * windows in the window group are subsequently destroyed, then they will
 * be removed from the window group and drop their references on the window
 * group; when all window have been removed, the window group will be
 * freed.
 */
public class WindowGroup extends org.gtk.gobject.Object {

    public WindowGroup(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to WindowGroup */
    public static WindowGroup castFrom(org.gtk.gobject.Object gobject) {
        return new WindowGroup(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_window_group_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkWindowGroup} object.
     * <p>
     * Modality of windows only affects windows
     * within the same {@code GtkWindowGroup}.
     */
    public WindowGroup() {
        super(constructNew());
    }
    
    /**
     * Adds a window to a {@code GtkWindowGroup}.
     */
    public void addWindow(Window window) {
        gtk_h.gtk_window_group_add_window(handle(), window.handle());
    }
    
    /**
     * Returns a list of the {@code GtkWindows} that belong to {@code window_group}.
     */
    public org.gtk.glib.List listWindows() {
        var RESULT = gtk_h.gtk_window_group_list_windows(handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Removes a window from a {@code GtkWindowGroup}.
     */
    public void removeWindow(Window window) {
        gtk_h.gtk_window_group_remove_window(handle(), window.handle());
    }
    
}
