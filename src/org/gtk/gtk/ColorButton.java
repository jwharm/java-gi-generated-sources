package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GtkColorButton} allows to open a color chooser dialog to change
 * the color.
 * <p>
 * <img src="./doc-files/color-button.png" alt="An example GtkColorButton">
 * <p>
 * It is suitable widget for selecting a color in a preference dialog.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * colorbutton
 * ╰── button.color
 *     ╰── [content]
 * }</pre>
 * <p>
 * {@code GtkColorButton} has a single CSS node with name colorbutton which
 * contains a button node. To differentiate it from a plain {@code GtkButton},
 * it gets the .color style class.
 */
public class ColorButton extends Widget implements Accessible, Buildable, ColorChooser, ConstraintTarget {

    public ColorButton(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ColorButton */
    public static ColorButton castFrom(org.gtk.gobject.Object gobject) {
        return new ColorButton(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_color_button_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new color button.
     * <p>
     * This returns a widget in the form of a small button containing
     * a swatch representing the current selected color. When the button
     * is clicked, a color chooser dialog will open, allowing the user
     * to select a color. The swatch will be updated to reflect the new
     * color when the user finishes.
     */
    public ColorButton() {
        super(constructNew());
    }
    
    private static Reference constructNewWithRgba(org.gtk.gdk.RGBA rgba) {
        Reference RESULT = References.get(gtk_h.gtk_color_button_new_with_rgba(rgba.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new color button showing the given color.
     */
    public static ColorButton newWithRgba(org.gtk.gdk.RGBA rgba) {
        return new ColorButton(constructNewWithRgba(rgba));
    }
    
    /**
     * Gets whether the dialog is modal.
     */
    public boolean getModal() {
        var RESULT = gtk_h.gtk_color_button_get_modal(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the title of the color chooser dialog.
     */
    public java.lang.String getTitle() {
        var RESULT = gtk_h.gtk_color_button_get_title(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets whether the dialog should be modal.
     */
    public void setModal(boolean modal) {
        gtk_h.gtk_color_button_set_modal(handle(), modal ? 1 : 0);
    }
    
    /**
     * Sets the title for the color chooser dialog.
     */
    public void setTitle(java.lang.String title) {
        gtk_h.gtk_color_button_set_title(handle(), Interop.allocateNativeString(title).handle());
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(ColorButton source);
    }
    
    /**
     * Emitted to when the color button is activated.
     * <p>
     * The {@code ::activate} signal on {@code GtkMenuButton} is an action signal and
     * emitting it causes the button to pop up its dialog.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("activate").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ColorButton.Callbacks.class, "signalColorButtonActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ColorSetHandler {
        void signalReceived(ColorButton source);
    }
    
    /**
     * Emitted when the user selects a color.
     * <p>
     * When handling this signal, use {@link ColorChooser#getRgba}
     * to find out which color was just selected.
     * <p>
     * Note that this signal is only emitted when the user changes the color.
     * If you need to react to programmatic color changes as well, use
     * the notify::rgba signal.
     */
    public SignalHandle onColorSet(ColorSetHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("color-set").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ColorButton.Callbacks.class, "signalColorButtonColorSet",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalColorButtonActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ColorButton.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ColorButton(References.get(source)));
        }
        
        public static void signalColorButtonColorSet(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ColorButton.ColorSetHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ColorButton(References.get(source)));
        }
        
    }
}
