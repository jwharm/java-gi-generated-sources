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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkWindowGroup";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public WindowGroup(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to WindowGroup if its GType is a (or inherits from) "GtkWindowGroup".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "WindowGroup" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkWindowGroup", a ClassCastException will be thrown.
     */
    public static WindowGroup castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkWindowGroup"))) {
            return new WindowGroup(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkWindowGroup");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_window_group_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param window the {@code GtkWindow} to add
     */
    public void addWindow(@NotNull org.gtk.gtk.Window window) {
        java.util.Objects.requireNonNull(window, "Parameter 'window' must not be null");
        try {
            DowncallHandles.gtk_window_group_add_window.invokeExact(
                    handle(),
                    window.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns a list of the {@code GtkWindows} that belong to {@code window_group}.
     * @return A
     *   newly-allocated list of windows inside the group.
     */
    public @NotNull org.gtk.glib.List listWindows() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_window_group_list_windows.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, false));
    }
    
    /**
     * Removes a window from a {@code GtkWindowGroup}.
     * @param window the {@code GtkWindow} to remove
     */
    public void removeWindow(@NotNull org.gtk.gtk.Window window) {
        java.util.Objects.requireNonNull(window, "Parameter 'window' must not be null");
        try {
            DowncallHandles.gtk_window_group_remove_window.invokeExact(
                    handle(),
                    window.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_window_group_new = Interop.downcallHandle(
            "gtk_window_group_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_window_group_add_window = Interop.downcallHandle(
            "gtk_window_group_add_window",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_window_group_list_windows = Interop.downcallHandle(
            "gtk_window_group_list_windows",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_window_group_remove_window = Interop.downcallHandle(
            "gtk_window_group_remove_window",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
