package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkMountOperation` is an implementation of `GMountOperation`.
 * 
 * The functions and objects described here make working with GTK and
 * GIO more convenient.
 * 
 * `GtkMountOperation` is needed when mounting volumes:
 * It is an implementation of `GMountOperation` that can be used with
 * GIO functions for mounting volumes such as
 * g_file_mount_enclosing_volume(), g_file_mount_mountable(),
 * g_volume_mount(), g_mount_unmount_with_operation() and others.
 * 
 * When necessary, `GtkMountOperation` shows dialogs to let the user
 * enter passwords, ask questions or show processes blocking unmount.
 */
public class MountOperation extends org.gtk.gio.MountOperation {

    public MountOperation(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to MountOperation */
    public static MountOperation castFrom(org.gtk.gobject.Object gobject) {
        return new MountOperation(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkMountOperation`.
     */
    public MountOperation(Window parent) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_mount_operation_new(parent.HANDLE()), true));
    }
    
    /**
     * Gets the display on which windows of the `GtkMountOperation`
     * will be shown.
     */
    public org.gtk.gdk.Display getDisplay() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_mount_operation_get_display(HANDLE());
        return new org.gtk.gdk.Display(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the transient parent used by the `GtkMountOperation`.
     */
    public Window getParent() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_mount_operation_get_parent(HANDLE());
        return new Window(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns whether the `GtkMountOperation` is currently displaying
     * a window.
     */
    public boolean isShowing() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_mount_operation_is_showing(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets the display to show windows of the `GtkMountOperation` on.
     */
    public void setDisplay(org.gtk.gdk.Display display) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_mount_operation_set_display(HANDLE(), display.HANDLE());
    }
    
    /**
     * Sets the transient parent for windows shown by the
     * `GtkMountOperation`.
     */
    public void setParent(Window parent) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_mount_operation_set_parent(HANDLE(), parent.HANDLE());
    }
    
}
