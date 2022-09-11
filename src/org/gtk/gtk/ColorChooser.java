package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkColorChooser` is an interface that is implemented by widgets
 * for choosing colors.
 * 
 * Depending on the situation, colors may be allowed to have alpha (translucency).
 * 
 * In GTK, the main widgets that implement this interface are
 * [class@Gtk.ColorChooserWidget], [class@Gtk.ColorChooserDialog] and
 * [class@Gtk.ColorButton].
 */
public interface ColorChooser extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Adds a palette to the color chooser.
     * 
     * If @orientation is horizontal, the colors are grouped in rows,
     * with @colors_per_line colors in each row. If @horizontal is %FALSE,
     * the colors are grouped in columns instead.
     * 
     * The default color palette of [class@Gtk.ColorChooserWidget] has
     * 45 colors, organized in columns of 5 colors (this includes some
     * grays).
     * 
     * The layout of the color chooser widget works best when the
     * palettes have 9-10 columns.
     * 
     * Calling this function for the first time has the side effect
     * of removing the default color palette from the color chooser.
     * 
     * If @colors is %NULL, removes all previously added palettes.
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
        return (RESULT != 0);
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
     * 
     * This usually happens when the user clicks a color swatch,
     * or a color is selected and the user presses one of the keys
     * Space, Shift+Space, Return or Enter.
     */
    public default void onColorActivated(ColorActivatedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalColorChooserColorActivated", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("color-activated").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class ColorChooserImpl extends org.gtk.gobject.Object implements ColorChooser {
        public ColorChooserImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
