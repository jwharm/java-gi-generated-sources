package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkMountOperation</code> is an implementation of <code>GMountOperation</code>.
 * <p>
 * The functions and objects described here make working with GTK and
 * GIO more convenient.
 * <p><code>GtkMountOperation</code> is needed when mounting volumes:
 * It is an implementation of <code>GMountOperation</code> that can be used with
 * GIO functions for mounting volumes such as
 * g_file_mount_enclosing_volume(), g_file_mount_mountable(),
 * g_volume_mount(), g_mount_unmount_with_operation() and others.
 * <p>
 * When necessary, <code>GtkMountOperation</code> shows dialogs to let the user
 * enter passwords, ask questions or show processes blocking unmount.
 */
public class MountOperation extends org.gtk.gio.MountOperation {

    public MountOperation(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MountOperation */
    public static MountOperation castFrom(org.gtk.gobject.Object gobject) {
        return new MountOperation(gobject.getReference());
    }
    
    private static Reference constructNew(Window parent) {
        Reference RESULT = References.get(gtk_h.gtk_mount_operation_new(parent.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkMountOperation</code>.
     */
    public MountOperation(Window parent) {
        super(constructNew(parent));
    }
    
    /**
     * Gets the display on which windows of the <code>GtkMountOperation</code>
     * will be shown.
     */
    public org.gtk.gdk.Display getDisplay() {
        var RESULT = gtk_h.gtk_mount_operation_get_display(handle());
        return new org.gtk.gdk.Display(References.get(RESULT, false));
    }
    
    /**
     * Gets the transient parent used by the <code>GtkMountOperation</code>.
     */
    public Window getParent() {
        var RESULT = gtk_h.gtk_mount_operation_get_parent(handle());
        return new Window(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the <code>GtkMountOperation</code> is currently displaying
     * a window.
     */
    public boolean isShowing() {
        var RESULT = gtk_h.gtk_mount_operation_is_showing(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the display to show windows of the <code>GtkMountOperation</code> on.
     */
    public void setDisplay(org.gtk.gdk.Display display) {
        gtk_h.gtk_mount_operation_set_display(handle(), display.handle());
    }
    
    /**
     * Sets the transient parent for windows shown by the<code>GtkMountOperation</code>.
     */
    public void setParent(Window parent) {
        gtk_h.gtk_mount_operation_set_parent(handle(), parent.handle());
    }
    
}
