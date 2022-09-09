package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GtkColorButton` allows to open a color chooser dialog to change
 * the color.
 * 
 * ![An example GtkColorButton](color-button.png)
 * 
 * It is suitable widget for selecting a color in a preference dialog.
 * 
 * # CSS nodes
 * 
 * ```
 * colorbutton
 * ╰── button.color
 *     ╰── [content]
 * ```
 * 
 * `GtkColorButton` has a single CSS node with name colorbutton which
 * contains a button node. To differentiate it from a plain `GtkButton`,
 * it gets the .color style class.
 */
public class ColorButton extends Widget implements Accessible, Buildable, ColorChooser, ConstraintTarget {

    public ColorButton(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ColorButton */
    public static ColorButton castFrom(org.gtk.gobject.Object gobject) {
        return new ColorButton(gobject.getReference());
    }
    
    /**
     * Creates a new color button.
     * 
     * This returns a widget in the form of a small button containing
     * a swatch representing the current selected color. When the button
     * is clicked, a color chooser dialog will open, allowing the user
     * to select a color. The swatch will be updated to reflect the new
     * color when the user finishes.
     */
    public ColorButton() {
        super(References.get(gtk_h.gtk_color_button_new(), false));
    }
    
    /**
     * Creates a new color button showing the given color.
     */
    public static ColorButton newWithRgba(org.gtk.gdk.RGBA rgba) {
        return new ColorButton(References.get(gtk_h.gtk_color_button_new_with_rgba(rgba.handle()), false));
    }
    
    /**
     * Gets whether the dialog is modal.
     */
    public boolean getModal() {
        var RESULT = gtk_h.gtk_color_button_get_modal(handle());
        return (RESULT != 0);
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
     * 
     * The `::activate` signal on `GtkMenuButton` is an action signal and
     * emitting it causes the button to pop up its dialog.
     */
    public void onActivate(ActivateHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalColorButtonActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ColorSetHandler {
        void signalReceived(ColorButton source);
    }
    
    /**
     * Emitted when the user selects a color.
     * 
     * When handling this signal, use [method@Gtk.ColorChooser.get_rgba]
     * to find out which color was just selected.
     * 
     * Note that this signal is only emitted when the user changes the color.
     * If you need to react to programmatic color changes as well, use
     * the notify::rgba signal.
     */
    public void onColorSet(ColorSetHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalColorButtonColorSet", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("color-set").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
