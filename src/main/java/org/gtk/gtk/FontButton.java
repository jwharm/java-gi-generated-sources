package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkFontButton} allows to open a font chooser dialog to change
 * the font.
 * <p>
 * <img src="./doc-files/font-button.png" alt="An example GtkFontButton">
 * <p>
 * It is suitable widget for selecting a font in a preference dialog.
 * 
 * <h1>CSS nodes</h1>
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

    public FontButton(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FontButton */
    public static FontButton castFrom(org.gtk.gobject.Object gobject) {
        return new FontButton(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_font_button_new = Interop.downcallHandle(
        "gtk_font_button_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_font_button_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new font picker widget.
     */
    public FontButton() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_font_button_new_with_font = Interop.downcallHandle(
        "gtk_font_button_new_with_font",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithFont(@NotNull java.lang.String fontname) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_font_button_new_with_font.invokeExact(Interop.allocateNativeString(fontname)), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new font picker widget showing the given font.
     */
    public static FontButton newWithFont(@NotNull java.lang.String fontname) {
        return new FontButton(constructNewWithFont(fontname));
    }
    
    private static final MethodHandle gtk_font_button_get_modal = Interop.downcallHandle(
        "gtk_font_button_get_modal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the dialog is modal.
     */
    public boolean getModal() {
        int RESULT;
        try {
            RESULT = (int) gtk_font_button_get_modal.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_font_button_get_title = Interop.downcallHandle(
        "gtk_font_button_get_title",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the title of the font chooser dialog.
     */
    public @NotNull java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_font_button_get_title.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_font_button_get_use_font = Interop.downcallHandle(
        "gtk_font_button_get_use_font",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the selected font is used in the label.
     */
    public boolean getUseFont() {
        int RESULT;
        try {
            RESULT = (int) gtk_font_button_get_use_font.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_font_button_get_use_size = Interop.downcallHandle(
        "gtk_font_button_get_use_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the selected size is used in the label.
     */
    public boolean getUseSize() {
        int RESULT;
        try {
            RESULT = (int) gtk_font_button_get_use_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_font_button_set_modal = Interop.downcallHandle(
        "gtk_font_button_set_modal",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the dialog should be modal.
     */
    public @NotNull void setModal(@NotNull boolean modal) {
        try {
            gtk_font_button_set_modal.invokeExact(handle(), modal ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_font_button_set_title = Interop.downcallHandle(
        "gtk_font_button_set_title",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the title for the font chooser dialog.
     */
    public @NotNull void setTitle(@NotNull java.lang.String title) {
        try {
            gtk_font_button_set_title.invokeExact(handle(), Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_font_button_set_use_font = Interop.downcallHandle(
        "gtk_font_button_set_use_font",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If {@code use_font} is {@code true}, the font name will be written
     * using the selected font.
     */
    public @NotNull void setUseFont(@NotNull boolean useFont) {
        try {
            gtk_font_button_set_use_font.invokeExact(handle(), useFont ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_font_button_set_use_size = Interop.downcallHandle(
        "gtk_font_button_set_use_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If {@code use_size} is {@code true}, the font name will be written using
     * the selected size.
     */
    public @NotNull void setUseSize(@NotNull boolean useSize) {
        try {
            gtk_font_button_set_use_size.invokeExact(handle(), useSize ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FontButton.Callbacks.class, "signalFontButtonActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("font-set"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FontButton.Callbacks.class, "signalFontButtonFontSet",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalFontButtonActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FontButton.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FontButton(Refcounted.get(source)));
        }
        
        public static void signalFontButtonFontSet(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FontButton.FontSetHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FontButton(Refcounted.get(source)));
        }
        
    }
}
