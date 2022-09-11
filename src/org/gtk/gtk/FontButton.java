package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GtkFontButton` allows to open a font chooser dialog to change
 * the font.
 * 
 * ![An example GtkFontButton](font-button.png)
 * 
 * It is suitable widget for selecting a font in a preference dialog.
 * 
 * # CSS nodes
 * 
 * ```
 * fontbutton
 * ╰── button.font
 *     ╰── [content]
 * ```
 * 
 * `GtkFontButton` has a single CSS node with name fontbutton which
 * contains a button node with the .font style class.
 */
public class FontButton extends Widget implements Accessible, Buildable, ConstraintTarget, FontChooser {

    public FontButton(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FontButton */
    public static FontButton castFrom(org.gtk.gobject.Object gobject) {
        return new FontButton(gobject.getReference());
    }
    
    /**
     * Creates a new font picker widget.
     */
    public FontButton() {
        super(References.get(gtk_h.gtk_font_button_new(), false));
    }
    
    /**
     * Creates a new font picker widget showing the given font.
     */
    public static FontButton newWithFont(java.lang.String fontname) {
        return new FontButton(References.get(gtk_h.gtk_font_button_new_with_font(Interop.allocateNativeString(fontname).handle()), false));
    }
    
    /**
     * Gets whether the dialog is modal.
     */
    public boolean getModal() {
        var RESULT = gtk_h.gtk_font_button_get_modal(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the title of the font chooser dialog.
     */
    public java.lang.String getTitle() {
        var RESULT = gtk_h.gtk_font_button_get_title(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether the selected font is used in the label.
     */
    public boolean getUseFont() {
        var RESULT = gtk_h.gtk_font_button_get_use_font(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the selected size is used in the label.
     */
    public boolean getUseSize() {
        var RESULT = gtk_h.gtk_font_button_get_use_size(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets whether the dialog should be modal.
     */
    public void setModal(boolean modal) {
        gtk_h.gtk_font_button_set_modal(handle(), modal ? 1 : 0);
    }
    
    /**
     * Sets the title for the font chooser dialog.
     */
    public void setTitle(java.lang.String title) {
        gtk_h.gtk_font_button_set_title(handle(), Interop.allocateNativeString(title).handle());
    }
    
    /**
     * If @use_font is %TRUE, the font name will be written
     * using the selected font.
     */
    public void setUseFont(boolean useFont) {
        gtk_h.gtk_font_button_set_use_font(handle(), useFont ? 1 : 0);
    }
    
    /**
     * If @use_size is %TRUE, the font name will be written using
     * the selected size.
     */
    public void setUseSize(boolean useSize) {
        gtk_h.gtk_font_button_set_use_size(handle(), useSize ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(FontButton source);
    }
    
    /**
     * Emitted to when the font button is activated.
     * 
     * The `::activate` signal on `GtkFontButton` is an action signal and
     * emitting it causes the button to present its dialog.
     */
    public void onActivate(ActivateHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFontButtonActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface FontSetHandler {
        void signalReceived(FontButton source);
    }
    
    /**
     * Emitted when the user selects a font.
     * 
     * When handling this signal, use [method@Gtk.FontChooser.get_font]
     * to find out which font was just selected.
     * 
     * Note that this signal is only emitted when the user changes the font.
     * If you need to react to programmatic font changes as well, use
     * the notify::font signal.
     */
    public void onFontSet(FontSetHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFontButtonFontSet", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("font-set").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
