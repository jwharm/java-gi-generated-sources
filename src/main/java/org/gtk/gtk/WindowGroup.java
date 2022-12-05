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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a WindowGroup proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public WindowGroup(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to WindowGroup if its GType is a (or inherits from) "GtkWindowGroup".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code WindowGroup} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkWindowGroup", a ClassCastException will be thrown.
     */
    public static WindowGroup castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), WindowGroup.getType())) {
            return new WindowGroup(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkWindowGroup");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_window_group_new.invokeExact();
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
        super(constructNew(), Ownership.FULL);
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
        return new org.gtk.glib.List(RESULT, Ownership.CONTAINER);
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_window_group_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link WindowGroup.Build} object constructs a {@link WindowGroup} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link WindowGroup} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link WindowGroup} using {@link WindowGroup#castFrom}.
         * @return A new instance of {@code WindowGroup} with the properties 
         *         that were set in the Build object.
         */
        public WindowGroup construct() {
            return WindowGroup.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    WindowGroup.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_window_group_new = Interop.downcallHandle(
            "gtk_window_group_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_group_add_window = Interop.downcallHandle(
            "gtk_window_group_add_window",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_group_list_windows = Interop.downcallHandle(
            "gtk_window_group_list_windows",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_group_remove_window = Interop.downcallHandle(
            "gtk_window_group_remove_window",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_group_get_type = Interop.downcallHandle(
            "gtk_window_group_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
