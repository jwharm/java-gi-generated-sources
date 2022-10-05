package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkMountOperation} is an implementation of {@code GMountOperation}.
 * <p>
 * The functions and objects described here make working with GTK and
 * GIO more convenient.
 * <p>
 * {@code GtkMountOperation} is needed when mounting volumes:
 * It is an implementation of {@code GMountOperation} that can be used with
 * GIO functions for mounting volumes such as
 * g_file_mount_enclosing_volume(), g_file_mount_mountable(),
 * g_volume_mount(), g_mount_unmount_with_operation() and others.
 * <p>
 * When necessary, {@code GtkMountOperation} shows dialogs to let the user
 * enter passwords, ask questions or show processes blocking unmount.
 */
public class MountOperation extends org.gtk.gio.MountOperation {

    public MountOperation(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MountOperation */
    public static MountOperation castFrom(org.gtk.gobject.Object gobject) {
        return new MountOperation(gobject.refcounted());
    }
    
    static final MethodHandle gtk_mount_operation_new = Interop.downcallHandle(
        "gtk_mount_operation_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(Window parent) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_mount_operation_new.invokeExact(parent.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkMountOperation}.
     */
    public MountOperation(Window parent) {
        super(constructNew(parent));
    }
    
    static final MethodHandle gtk_mount_operation_get_display = Interop.downcallHandle(
        "gtk_mount_operation_get_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the display on which windows of the {@code GtkMountOperation}
     * will be shown.
     */
    public org.gtk.gdk.Display getDisplay() {
        try {
            var RESULT = (MemoryAddress) gtk_mount_operation_get_display.invokeExact(handle());
            return new org.gtk.gdk.Display(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_mount_operation_get_parent = Interop.downcallHandle(
        "gtk_mount_operation_get_parent",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the transient parent used by the {@code GtkMountOperation}.
     */
    public Window getParent() {
        try {
            var RESULT = (MemoryAddress) gtk_mount_operation_get_parent.invokeExact(handle());
            return new Window(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_mount_operation_is_showing = Interop.downcallHandle(
        "gtk_mount_operation_is_showing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the {@code GtkMountOperation} is currently displaying
     * a window.
     */
    public boolean isShowing() {
        try {
            var RESULT = (int) gtk_mount_operation_is_showing.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_mount_operation_set_display = Interop.downcallHandle(
        "gtk_mount_operation_set_display",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the display to show windows of the {@code GtkMountOperation} on.
     */
    public void setDisplay(org.gtk.gdk.Display display) {
        try {
            gtk_mount_operation_set_display.invokeExact(handle(), display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_mount_operation_set_parent = Interop.downcallHandle(
        "gtk_mount_operation_set_parent",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the transient parent for windows shown by the
     * {@code GtkMountOperation}.
     */
    public void setParent(Window parent) {
        try {
            gtk_mount_operation_set_parent.invokeExact(handle(), parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
