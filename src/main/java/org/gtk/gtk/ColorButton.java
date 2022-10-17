package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkColorButton} allows to open a color chooser dialog to change
 * the color.
 * <p>
 * <img src="./doc-files/color-button.png" alt="An example GtkColorButton">
 * <p>
 * It is suitable widget for selecting a color in a preference dialog.
 * 
 * <h1>CSS nodes</h1>
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

    public ColorButton(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ColorButton */
    public static ColorButton castFrom(org.gtk.gobject.Object gobject) {
        return new ColorButton(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_color_button_new = Interop.downcallHandle(
        "gtk_color_button_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_color_button_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    
    private static final MethodHandle gtk_color_button_new_with_rgba = Interop.downcallHandle(
        "gtk_color_button_new_with_rgba",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithRgba(@NotNull org.gtk.gdk.RGBA rgba) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_color_button_new_with_rgba.invokeExact(rgba.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new color button showing the given color.
     */
    public static ColorButton newWithRgba(@NotNull org.gtk.gdk.RGBA rgba) {
        return new ColorButton(constructNewWithRgba(rgba));
    }
    
    private static final MethodHandle gtk_color_button_get_modal = Interop.downcallHandle(
        "gtk_color_button_get_modal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the dialog is modal.
     */
    public boolean getModal() {
        int RESULT;
        try {
            RESULT = (int) gtk_color_button_get_modal.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_color_button_get_title = Interop.downcallHandle(
        "gtk_color_button_get_title",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the title of the color chooser dialog.
     */
    public @NotNull java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_color_button_get_title.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_color_button_set_modal = Interop.downcallHandle(
        "gtk_color_button_set_modal",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the dialog should be modal.
     */
    public @NotNull void setModal(@NotNull boolean modal) {
        try {
            gtk_color_button_set_modal.invokeExact(handle(), modal ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_color_button_set_title = Interop.downcallHandle(
        "gtk_color_button_set_title",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the title for the color chooser dialog.
     */
    public @NotNull void setTitle(@NotNull java.lang.String title) {
        try {
            gtk_color_button_set_title.invokeExact(handle(), Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ColorButton.Callbacks.class, "signalColorButtonActivate",
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("color-set"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ColorButton.Callbacks.class, "signalColorButtonColorSet",
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
    
        public static void signalColorButtonActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ColorButton.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ColorButton(Refcounted.get(source)));
        }
        
        public static void signalColorButtonColorSet(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ColorButton.ColorSetHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ColorButton(Refcounted.get(source)));
        }
        
    }
}
