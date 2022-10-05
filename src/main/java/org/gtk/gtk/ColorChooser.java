package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkColorChooser} is an interface that is implemented by widgets
 * for choosing colors.
 * <p>
 * Depending on the situation, colors may be allowed to have alpha (translucency).
 * <p>
 * In GTK, the main widgets that implement this interface are
 * {@code Gtk.ColorChooserDialog} and
 * {@link ColorButton}.
 */
public interface ColorChooser extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle gtk_color_chooser_add_palette = Interop.downcallHandle(
        "gtk_color_chooser_add_palette",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
     */
    public default void addPalette(Orientation orientation, int colorsPerLine, int nColors, org.gtk.gdk.RGBA[] colors) {
        try {
            gtk_color_chooser_add_palette.invokeExact(handle(), orientation.getValue(), colorsPerLine, nColors, Interop.allocateNativeArray(colors).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_color_chooser_get_rgba = Interop.downcallHandle(
        "gtk_color_chooser_get_rgba",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the currently-selected color.
     */
    public default void getRgba(org.gtk.gdk.RGBA color) {
        try {
            gtk_color_chooser_get_rgba.invokeExact(handle(), color.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_color_chooser_get_use_alpha = Interop.downcallHandle(
        "gtk_color_chooser_get_use_alpha",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the color chooser shows the alpha channel.
     */
    public default boolean getUseAlpha() {
        try {
            var RESULT = (int) gtk_color_chooser_get_use_alpha.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_color_chooser_set_rgba = Interop.downcallHandle(
        "gtk_color_chooser_set_rgba",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the color.
     */
    public default void setRgba(org.gtk.gdk.RGBA color) {
        try {
            gtk_color_chooser_set_rgba.invokeExact(handle(), color.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_color_chooser_set_use_alpha = Interop.downcallHandle(
        "gtk_color_chooser_set_use_alpha",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether or not the color chooser should use the alpha channel.
     */
    public default void setUseAlpha(boolean useAlpha) {
        try {
            gtk_color_chooser_set_use_alpha.invokeExact(handle(), useAlpha ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ColorActivatedHandler {
        void signalReceived(ColorChooser source, org.gtk.gdk.RGBA color);
    }
    
    /**
     * Emitted when a color is activated from the color chooser.
     * <p>
     * This usually happens when the user clicks a color swatch,
     * or a color is selected and the user presses one of the keys
     * Space, Shift+Space, Return or Enter.
     */
    public default SignalHandle onColorActivated(ColorActivatedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("color-activated").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ColorChooser.Callbacks.class, "signalColorChooserColorActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalColorChooserColorActivated(MemoryAddress source, MemoryAddress color, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ColorChooser.ColorActivatedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ColorChooser.ColorChooserImpl(Refcounted.get(source)), new org.gtk.gdk.RGBA(Refcounted.get(color, false)));
        }
        
    }
    
    class ColorChooserImpl extends org.gtk.gobject.Object implements ColorChooser {
        public ColorChooserImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
