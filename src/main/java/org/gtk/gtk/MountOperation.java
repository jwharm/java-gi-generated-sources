package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.MountOperation.getMemoryLayout().withName("parent_instance"),
        org.gtk.gtk.MountOperationPrivate.getMemoryLayout().withName("priv")
    ).withName("GtkMountOperation");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public MountOperation(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MountOperation */
    public static MountOperation castFrom(org.gtk.gobject.Object gobject) {
        return new MountOperation(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gtk.Window parent) {
        java.util.Objects.requireNonNullElse(parent, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_mount_operation_new.invokeExact(parent.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkMountOperation}.
     * @param parent transient parent of the window
     */
    public MountOperation(@Nullable org.gtk.gtk.Window parent) {
        super(constructNew(parent));
    }
    
    /**
     * Gets the display on which windows of the {@code GtkMountOperation}
     * will be shown.
     * @return the display on which windows of {@code op} are shown
     */
    public @NotNull org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_mount_operation_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Display(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the transient parent used by the {@code GtkMountOperation}.
     * @return the transient parent for windows shown by {@code op}
     */
    public @Nullable org.gtk.gtk.Window getParent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_mount_operation_get_parent.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Window(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns whether the {@code GtkMountOperation} is currently displaying
     * a window.
     * @return {@code true} if {@code op} is currently displaying a window
     */
    public boolean isShowing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_mount_operation_is_showing.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the display to show windows of the {@code GtkMountOperation} on.
     * @param display a {@code GdkDisplay}
     */
    public void setDisplay(@NotNull org.gtk.gdk.Display display) {
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        try {
            DowncallHandles.gtk_mount_operation_set_display.invokeExact(handle(), display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the transient parent for windows shown by the
     * {@code GtkMountOperation}.
     * @param parent transient parent of the window
     */
    public void setParent(@Nullable org.gtk.gtk.Window parent) {
        java.util.Objects.requireNonNullElse(parent, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_mount_operation_set_parent.invokeExact(handle(), parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_mount_operation_new = Interop.downcallHandle(
            "gtk_mount_operation_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_mount_operation_get_display = Interop.downcallHandle(
            "gtk_mount_operation_get_display",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_mount_operation_get_parent = Interop.downcallHandle(
            "gtk_mount_operation_get_parent",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_mount_operation_is_showing = Interop.downcallHandle(
            "gtk_mount_operation_is_showing",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_mount_operation_set_display = Interop.downcallHandle(
            "gtk_mount_operation_set_display",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_mount_operation_set_parent = Interop.downcallHandle(
            "gtk_mount_operation_set_parent",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
