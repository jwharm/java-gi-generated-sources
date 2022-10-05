package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Contains information found when looking up an icon in {@code GtkIconTheme}.
 * <p>
 * {@code GtkIconPaintable} implements {@code GdkPaintable}.
 */
public class IconPaintable extends org.gtk.gobject.Object implements org.gtk.gdk.Paintable, SymbolicPaintable {

    public IconPaintable(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to IconPaintable */
    public static IconPaintable castFrom(org.gtk.gobject.Object gobject) {
        return new IconPaintable(gobject.refcounted());
    }
    
    static final MethodHandle gtk_icon_paintable_new_for_file = Interop.downcallHandle(
        "gtk_icon_paintable_new_for_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewForFile(org.gtk.gio.File file, int size, int scale) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_icon_paintable_new_for_file.invokeExact(file.handle(), size, scale), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GtkIconPaintable} for a file with a given size and scale.
     * <p>
     * The icon can then be rendered by using it as a {@code GdkPaintable}.
     */
    public static IconPaintable newForFile(org.gtk.gio.File file, int size, int scale) {
        return new IconPaintable(constructNewForFile(file, size, scale));
    }
    
    static final MethodHandle gtk_icon_paintable_get_file = Interop.downcallHandle(
        "gtk_icon_paintable_get_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GFile} that was used to load the icon.
     * <p>
     * Returns {@code null} if the icon was not loaded from a file.
     */
    public org.gtk.gio.File getFile() {
        try {
            var RESULT = (MemoryAddress) gtk_icon_paintable_get_file.invokeExact(handle());
            return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_paintable_get_icon_name = Interop.downcallHandle(
        "gtk_icon_paintable_get_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public java.lang.String getIconName() {
        try {
            var RESULT = (MemoryAddress) gtk_icon_paintable_get_icon_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_paintable_is_symbolic = Interop.downcallHandle(
        "gtk_icon_paintable_is_symbolic",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the icon is symbolic or not.
     * <p>
     * This currently uses only the file name and not the file contents
     * for determining this. This behaviour may change in the future.
     * <p>
     * Note that to render a symbolic {@code GtkIconPaintable} properly (with
     * recoloring), you have to set its icon name on a {@code GtkImage}.
     */
    public boolean isSymbolic() {
        try {
            var RESULT = (int) gtk_icon_paintable_is_symbolic.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}