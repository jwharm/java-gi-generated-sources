package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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

    public WindowGroup(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to WindowGroup */
    public static WindowGroup castFrom(org.gtk.gobject.Object gobject) {
        return new WindowGroup(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_window_group_new = Interop.downcallHandle(
        "gtk_window_group_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_window_group_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    
    private static final MethodHandle gtk_window_group_add_window = Interop.downcallHandle(
        "gtk_window_group_add_window",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a window to a {@code GtkWindowGroup}.
     */
    public @NotNull void addWindow(@NotNull Window window) {
        try {
            gtk_window_group_add_window.invokeExact(handle(), window.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_window_group_list_windows = Interop.downcallHandle(
        "gtk_window_group_list_windows",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a list of the {@code GtkWindows} that belong to {@code window_group}.
     */
    public @NotNull org.gtk.glib.List listWindows() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_window_group_list_windows.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_window_group_remove_window = Interop.downcallHandle(
        "gtk_window_group_remove_window",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a window from a {@code GtkWindowGroup}.
     */
    public @NotNull void removeWindow(@NotNull Window window) {
        try {
            gtk_window_group_remove_window.invokeExact(handle(), window.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
