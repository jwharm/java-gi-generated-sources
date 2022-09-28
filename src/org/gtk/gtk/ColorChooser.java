package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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
        gtk_h.gtk_color_chooser_add_palette(handle(), orientation.getValue(), colorsPerLine, nColors, Interop.allocateNativeArray(colors).handle());
    }
    
    /**
     * Gets the currently-selected color.
     */
    public default void getRgba(org.gtk.gdk.RGBA color) {
        gtk_h.gtk_color_chooser_get_rgba(handle(), color.handle());
    }
    
    /**
     * Returns whether the color chooser shows the alpha channel.
     */
    public default boolean getUseAlpha() {
        var RESULT = gtk_h.gtk_color_chooser_get_use_alpha(handle());
        return RESULT != 0;
    }
    
    /**
     * Sets the color.
     */
    public default void setRgba(org.gtk.gdk.RGBA color) {
        gtk_h.gtk_color_chooser_set_rgba(handle(), color.handle());
    }
    
    /**
     * Sets whether or not the color chooser should use the alpha channel.
     */
    public default void setUseAlpha(boolean useAlpha) {
        gtk_h.gtk_color_chooser_set_use_alpha(handle(), useAlpha ? 1 : 0);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("color-activated").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ColorChooser.Callbacks.class, "signalColorChooserColorActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalColorChooserColorActivated(MemoryAddress source, MemoryAddress color, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ColorChooser.ColorActivatedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ColorChooser.ColorChooserImpl(References.get(source)), new org.gtk.gdk.RGBA(References.get(color, false)));
        }
        
    }
    
    class ColorChooserImpl extends org.gtk.gobject.Object implements ColorChooser {
        public ColorChooserImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
