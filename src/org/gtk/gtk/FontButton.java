package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GtkFontButton} allows to open a font chooser dialog to change
 * the font.
 * <p>
 * <img src="./doc-files/font-button.png" alt="An example GtkFontButton">
 * <p>
 * It is suitable widget for selecting a font in a preference dialog.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * fontbutton
 * ╰── button.font
 *     ╰── [content]
 * }</pre>
 * <p>
 * {@code GtkFontButton} has a single CSS node with name fontbutton which
 * contains a button node with the .font style class.
 */
public class FontButton extends Widget implements Accessible, Buildable, ConstraintTarget, FontChooser {

    public FontButton(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FontButton */
    public static FontButton castFrom(org.gtk.gobject.Object gobject) {
        return new FontButton(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_font_button_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new font picker widget.
     */
    public FontButton() {
        super(constructNew());
    }
    
    private static Reference constructNewWithFont(java.lang.String fontname) {
        Reference RESULT = References.get(gtk_h.gtk_font_button_new_with_font(Interop.allocateNativeString(fontname).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new font picker widget showing the given font.
     */
    public static FontButton newWithFont(java.lang.String fontname) {
        return new FontButton(constructNewWithFont(fontname));
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
     * If {@code use_font} is {@code true}, the font name will be written
     * using the selected font.
     */
    public void setUseFont(boolean useFont) {
        gtk_h.gtk_font_button_set_use_font(handle(), useFont ? 1 : 0);
    }
    
    /**
     * If {@code use_size} is {@code true}, the font name will be written using
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
     * <p>
     * The {@code ::activate} signal on {@code GtkFontButton} is an action signal and
     * emitting it causes the button to present its dialog.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("activate").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FontButton.class, "__signalFontButtonActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalFontButtonActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FontButton.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FontButton(References.get(source)));
    }
    
    @FunctionalInterface
    public interface FontSetHandler {
        void signalReceived(FontButton source);
    }
    
    /**
     * Emitted when the user selects a font.
     * <p>
     * When handling this signal, use {@link FontChooser#getFont}
     * to find out which font was just selected.
     * <p>
     * Note that this signal is only emitted when the user changes the font.
     * If you need to react to programmatic font changes as well, use
     * the notify::font signal.
     */
    public SignalHandle onFontSet(FontSetHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("font-set").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FontButton.class, "__signalFontButtonFontSet",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalFontButtonFontSet(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FontButton.FontSetHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FontButton(References.get(source)));
    }
    
}
