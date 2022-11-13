package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Contains information found when looking up an icon in {@code GtkIconTheme}.
 * <p>
 * {@code GtkIconPaintable} implements {@code GdkPaintable}.
 */
public class IconPaintable extends org.gtk.gobject.Object implements org.gtk.gdk.Paintable, org.gtk.gtk.SymbolicPaintable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkIconPaintable";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a IconPaintable proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public IconPaintable(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to IconPaintable if its GType is a (or inherits from) "GtkIconPaintable".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code IconPaintable} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkIconPaintable", a ClassCastException will be thrown.
     */
    public static IconPaintable castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkIconPaintable"))) {
            return new IconPaintable(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkIconPaintable");
        }
    }
    
    private static Addressable constructNewForFile(@NotNull org.gtk.gio.File file, int size, int scale) {
        java.util.Objects.requireNonNull(file, "Parameter 'file' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_paintable_new_for_file.invokeExact(
                    file.handle(),
                    size,
                    scale);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkIconPaintable} for a file with a given size and scale.
     * <p>
     * The icon can then be rendered by using it as a {@code GdkPaintable}.
     * @param file a {@code GFile}
     * @param size desired icon size
     * @param scale the desired scale
     * @return a {@code GtkIconPaintable} containing
     *   for the icon. Unref with g_object_unref()
     */
    public static IconPaintable newForFile(@NotNull org.gtk.gio.File file, int size, int scale) {
        return new IconPaintable(constructNewForFile(file, size, scale), Ownership.FULL);
    }
    
    /**
     * Gets the {@code GFile} that was used to load the icon.
     * <p>
     * Returns {@code null} if the icon was not loaded from a file.
     * @return the {@code GFile} for the icon
     */
    public @Nullable org.gtk.gio.File getFile() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_paintable_get_file.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the icon name being used for this icon.
     * <p>
     * When an icon looked up in the icon theme was not available, the
     * icon theme may use fallback icons - either those specified to
     * gtk_icon_theme_lookup_icon() or the always-available
     * "image-missing". The icon chosen is returned by this function.
     * <p>
     * If the icon was created without an icon theme, this function
     * returns {@code null}.
     * @return the themed icon-name for the
     *   icon, or {@code null} if its not a themed icon.
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_paintable_get_icon_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Checks if the icon is symbolic or not.
     * <p>
     * This currently uses only the file name and not the file contents
     * for determining this. This behaviour may change in the future.
     * <p>
     * Note that to render a symbolic {@code GtkIconPaintable} properly (with
     * recoloring), you have to set its icon name on a {@code GtkImage}.
     * @return {@code true} if the icon is symbolic, {@code false} otherwise
     */
    public boolean isSymbolic() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_paintable_is_symbolic.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_icon_paintable_new_for_file = Interop.downcallHandle(
            "gtk_icon_paintable_new_for_file",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_paintable_get_file = Interop.downcallHandle(
            "gtk_icon_paintable_get_file",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_paintable_get_icon_name = Interop.downcallHandle(
            "gtk_icon_paintable_get_icon_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_paintable_is_symbolic = Interop.downcallHandle(
            "gtk_icon_paintable_is_symbolic",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
    }
}
