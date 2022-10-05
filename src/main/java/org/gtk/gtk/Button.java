package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GtkButton} widget is generally used to trigger a callback function that is
 * called when the button is pressed.
 * <p>
 * <img src="./doc-files/button.png" alt="An example GtkButton">
 * <p>
 * The {@code GtkButton} widget can hold any valid child widget. That is, it can hold
 * almost any other standard {@code GtkWidget}. The most commonly used child is the
 * {@code GtkLabel}.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * {@code GtkButton} has a single CSS node with name button. The node will get the
 * style classes .image-button or .text-button, if the content is just an
 * image or label, respectively. It may also receive the .flat style class.
 * When activating a button via the keyboard, the button will temporarily
 * gain the .keyboard-activating style class.
 * <p>
 * Other style classes that are commonly used with {@code GtkButton} include
 * .suggested-action and .destructive-action. In special cases, buttons
 * can be made round by adding the .circular style class.
 * <p>
 * Button-like widgets like {@code Gtk.MenuButton},
 * {@code Gtk.ColorButton}
 * or {@link FontButton} use style classes such as .toggle, .popup, .scale,
 * .lock, .color on the button node to differentiate themselves from a plain
 * {@code GtkButton}.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkButton} uses the {@link AccessibleRole#BUTTON} role.
 */
public class Button extends Widget implements Accessible, Actionable, Buildable, ConstraintTarget {

    public Button(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Button */
    public static Button castFrom(org.gtk.gobject.Object gobject) {
        return new Button(gobject.refcounted());
    }
    
    static final MethodHandle gtk_button_new = Interop.downcallHandle(
        "gtk_button_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_button_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkButton} widget.
     * <p>
     * To add a child widget to the button, use {@link Button#setChild}.
     */
    public Button() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_button_new_from_icon_name = Interop.downcallHandle(
        "gtk_button_new_from_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromIconName(java.lang.String iconName) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_button_new_from_icon_name.invokeExact(Interop.allocateNativeString(iconName).handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new button containing an icon from the current icon theme.
     * <p>
     * If the icon name isn’t known, a “broken image” icon will be
     * displayed instead. If the current icon theme is changed, the icon
     * will be updated appropriately.
     */
    public static Button newFromIconName(java.lang.String iconName) {
        return new Button(constructNewFromIconName(iconName));
    }
    
    static final MethodHandle gtk_button_new_with_label = Interop.downcallHandle(
        "gtk_button_new_with_label",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithLabel(java.lang.String label) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_button_new_with_label.invokeExact(Interop.allocateNativeString(label).handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GtkButton} widget with a {@code GtkLabel} child.
     */
    public static Button newWithLabel(java.lang.String label) {
        return new Button(constructNewWithLabel(label));
    }
    
    static final MethodHandle gtk_button_new_with_mnemonic = Interop.downcallHandle(
        "gtk_button_new_with_mnemonic",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithMnemonic(java.lang.String label) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_button_new_with_mnemonic.invokeExact(Interop.allocateNativeString(label).handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkButton} containing a label.
     * <p>
     * If characters in {@code label} are preceded by an underscore, they are underlined.
     * If you need a literal underscore character in a label, use “__” (two
     * underscores). The first underlined character represents a keyboard
     * accelerator called a mnemonic. Pressing Alt and that key activates the button.
     */
    public static Button newWithMnemonic(java.lang.String label) {
        return new Button(constructNewWithMnemonic(label));
    }
    
    static final MethodHandle gtk_button_get_child = Interop.downcallHandle(
        "gtk_button_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget of {@code button}.
     */
    public Widget getChild() {
        try {
            var RESULT = (MemoryAddress) gtk_button_get_child.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_button_get_has_frame = Interop.downcallHandle(
        "gtk_button_get_has_frame",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the button has a frame.
     */
    public boolean getHasFrame() {
        try {
            var RESULT = (int) gtk_button_get_has_frame.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_button_get_icon_name = Interop.downcallHandle(
        "gtk_button_get_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the icon name of the button.
     * <p>
     * If the icon name has not been set with {@link Button#setIconName}
     * the return value will be {@code null}. This will be the case if you create
     * an empty button with {@link Button#Button} to use as a container.
     */
    public java.lang.String getIconName() {
        try {
            var RESULT = (MemoryAddress) gtk_button_get_icon_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_button_get_label = Interop.downcallHandle(
        "gtk_button_get_label",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the text from the label of the button.
     * <p>
     * If the label text has not been set with {@link Button#setLabel}
     * the return value will be {@code null}. This will be the case if you create
     * an empty button with {@link Button#Button} to use as a container.
     */
    public java.lang.String getLabel() {
        try {
            var RESULT = (MemoryAddress) gtk_button_get_label.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_button_get_use_underline = Interop.downcallHandle(
        "gtk_button_get_use_underline",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * gets whether underlines are interpreted as mnemonics.
     * <p>
     * See {@link Button#setUseUnderline}.
     */
    public boolean getUseUnderline() {
        try {
            var RESULT = (int) gtk_button_get_use_underline.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_button_set_child = Interop.downcallHandle(
        "gtk_button_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child widget of {@code button}.
     * <p>
     * Note that by using this API, you take full responsibility for setting
     * up the proper accessibility label and description information for {@code button}.
     * Most likely, you'll either set the accessibility label or description
     * for {@code button} explicitly, or you'll set a labelled-by or described-by
     * relations from {@code child} to {@code button}.
     */
    public void setChild(Widget child) {
        try {
            gtk_button_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_button_set_has_frame = Interop.downcallHandle(
        "gtk_button_set_has_frame",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the style of the button.
     * <p>
     * Buttons can has a flat appearance or have a frame drawn around them.
     */
    public void setHasFrame(boolean hasFrame) {
        try {
            gtk_button_set_has_frame.invokeExact(handle(), hasFrame ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_button_set_icon_name = Interop.downcallHandle(
        "gtk_button_set_icon_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a {@code GtkImage} with the given icon name as a child.
     * <p>
     * If {@code button} already contains a child widget, that child widget will
     * be removed and replaced with the image.
     */
    public void setIconName(java.lang.String iconName) {
        try {
            gtk_button_set_icon_name.invokeExact(handle(), Interop.allocateNativeString(iconName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_button_set_label = Interop.downcallHandle(
        "gtk_button_set_label",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the text of the label of the button to {@code label}.
     * <p>
     * This will also clear any previously set labels.
     */
    public void setLabel(java.lang.String label) {
        try {
            gtk_button_set_label.invokeExact(handle(), Interop.allocateNativeString(label).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_button_set_use_underline = Interop.downcallHandle(
        "gtk_button_set_use_underline",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether to use underlines as mnemonics.
     * <p>
     * If true, an underline in the text of the button label indicates
     * the next character should be used for the mnemonic accelerator key.
     */
    public void setUseUnderline(boolean useUnderline) {
        try {
            gtk_button_set_use_underline.invokeExact(handle(), useUnderline ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(Button source);
    }
    
    /**
     * Emitted to animate press then release.
     * <p>
     * This is an action signal. Applications should never connect
     * to this signal, but use the {@code Gtk.Button::clicked} signal.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Button.Callbacks.class, "signalButtonActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ClickedHandler {
        void signalReceived(Button source);
    }
    
    /**
     * Emitted when the button has been activated (pressed and released).
     */
    public SignalHandle onClicked(ClickedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("clicked").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Button.Callbacks.class, "signalButtonClicked",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalButtonActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Button.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Button(Refcounted.get(source)));
        }
        
        public static void signalButtonClicked(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Button.ClickedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Button(Refcounted.get(source)));
        }
        
    }
}
