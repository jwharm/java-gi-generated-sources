package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkColorChooser} is an interface that is implemented by widgets
 * for choosing colors.
 * <p>
 * Depending on the situation, colors may be allowed to have alpha (translucency).
 * <p>
 * In GTK, the main widgets that implement this interface are
 * {@link ColorChooserWidget} and
 * {@link ColorButton}.
 */
public interface ColorChooser extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to ColorChooser if its GType is a (or inherits from) "GtkColorChooser".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ColorChooser} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkColorChooser", a ClassCastException will be thrown.
     */
    public static ColorChooser castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ColorChooser.getType())) {
            return new ColorChooserImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkColorChooser");
        }
    }
    
    /**
     * Adds a palette to the color chooser.
     * <p>
     * If {@code orientation} is horizontal, the colors are grouped in rows,
     * with {@code colors_per_line} colors in each row. If {@code horizontal} is {@code false},
     * the colors are grouped in columns instead.
     * <p>
     * The default color palette of {@link ColorChooserWidget} has
     * 45 colors, organized in columns of 5 colors (this includes some
     * grays).
     * <p>
     * The layout of the color chooser widget works best when the
     * palettes have 9-10 columns.
     * <p>
     * Calling this function for the first time has the side effect
     * of removing the default color palette from the color chooser.
     * <p>
     * If {@code colors} is {@code null}, removes all previously added palettes.
     * @param orientation {@link Orientation#HORIZONTAL} if the palette should
     *   be displayed in rows, {@link Orientation#VERTICAL} for columns
     * @param colorsPerLine the number of colors to show in each row/column
     * @param nColors the total number of elements in {@code colors}
     * @param colors the colors of the palette
     */
    default void addPalette(@NotNull org.gtk.gtk.Orientation orientation, int colorsPerLine, int nColors, @Nullable org.gtk.gdk.RGBA[] colors) {
        java.util.Objects.requireNonNull(orientation, "Parameter 'orientation' must not be null");
        try {
            DowncallHandles.gtk_color_chooser_add_palette.invokeExact(
                    handle(),
                    orientation.getValue(),
                    colorsPerLine,
                    nColors,
                    (Addressable) (colors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(colors, org.gtk.gdk.RGBA.getMemoryLayout(), false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the currently-selected color.
     * @param color a {@code GdkRGBA} to fill in with the current color
     */
    default void getRgba(@NotNull org.gtk.gdk.RGBA color) {
        java.util.Objects.requireNonNull(color, "Parameter 'color' must not be null");
        try {
            DowncallHandles.gtk_color_chooser_get_rgba.invokeExact(
                    handle(),
                    color.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns whether the color chooser shows the alpha channel.
     * @return {@code true} if the color chooser uses the alpha channel,
     *   {@code false} if not
     */
    default boolean getUseAlpha() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_color_chooser_get_use_alpha.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the color.
     * @param color the new color
     */
    default void setRgba(@NotNull org.gtk.gdk.RGBA color) {
        java.util.Objects.requireNonNull(color, "Parameter 'color' must not be null");
        try {
            DowncallHandles.gtk_color_chooser_set_rgba.invokeExact(
                    handle(),
                    color.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether or not the color chooser should use the alpha channel.
     * @param useAlpha {@code true} if color chooser should use alpha channel, {@code false} if not
     */
    default void setUseAlpha(boolean useAlpha) {
        try {
            DowncallHandles.gtk_color_chooser_set_use_alpha.invokeExact(
                    handle(),
                    useAlpha ? 1 : 0);
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
            RESULT = (long) DowncallHandles.gtk_color_chooser_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface ColorActivated {
        void signalReceived(ColorChooser source, @NotNull org.gtk.gdk.RGBA color);
    }
    
    /**
     * Emitted when a color is activated from the color chooser.
     * <p>
     * This usually happens when the user clicks a color swatch,
     * or a color is selected and the user presses one of the keys
     * Space, Shift+Space, Return or Enter.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<ColorChooser.ColorActivated> onColorActivated(ColorChooser.ColorActivated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("color-activated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ColorChooser.Callbacks.class, "signalColorChooserColorActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ColorChooser.ColorActivated>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_color_chooser_add_palette = Interop.downcallHandle(
            "gtk_color_chooser_add_palette",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_color_chooser_get_rgba = Interop.downcallHandle(
            "gtk_color_chooser_get_rgba",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_color_chooser_get_use_alpha = Interop.downcallHandle(
            "gtk_color_chooser_get_use_alpha",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_color_chooser_set_rgba = Interop.downcallHandle(
            "gtk_color_chooser_set_rgba",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_color_chooser_set_use_alpha = Interop.downcallHandle(
            "gtk_color_chooser_set_use_alpha",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_color_chooser_get_type = Interop.downcallHandle(
            "gtk_color_chooser_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    @ApiStatus.Internal
    static class Callbacks {
        
        public static void signalColorChooserColorActivated(MemoryAddress source, MemoryAddress color, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ColorChooser.ColorActivated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ColorChooser.ColorChooserImpl(source, Ownership.NONE), new org.gtk.gdk.RGBA(color, Ownership.NONE));
        }
    }
    
    class ColorChooserImpl extends org.gtk.gobject.Object implements ColorChooser {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public ColorChooserImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
