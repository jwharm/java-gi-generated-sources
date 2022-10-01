package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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

    public Button(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Button */
    public static Button castFrom(org.gtk.gobject.Object gobject) {
        return new Button(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_button_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkButton} widget.
     * <p>
     * To add a child widget to the button, use {@link Button#setChild}.
     */
    public Button() {
        super(constructNew());
    }
    
    private static Reference constructNewFromIconName(java.lang.String iconName) {
        Reference RESULT = References.get(gtk_h.gtk_button_new_from_icon_name(Interop.allocateNativeString(iconName).handle()), false);
        return RESULT;
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
    
    private static Reference constructNewWithLabel(java.lang.String label) {
        Reference RESULT = References.get(gtk_h.gtk_button_new_with_label(Interop.allocateNativeString(label).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkButton} widget with a {@code GtkLabel} child.
     */
    public static Button newWithLabel(java.lang.String label) {
        return new Button(constructNewWithLabel(label));
    }
    
    private static Reference constructNewWithMnemonic(java.lang.String label) {
        Reference RESULT = References.get(gtk_h.gtk_button_new_with_mnemonic(Interop.allocateNativeString(label).handle()), false);
        return RESULT;
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
    
    /**
     * Gets the child widget of {@code button}.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_button_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the button has a frame.
     */
    public boolean getHasFrame() {
        var RESULT = gtk_h.gtk_button_get_has_frame(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the icon name of the button.
     * <p>
     * If the icon name has not been set with {@link Button#setIconName}
     * the return value will be {@code null}. This will be the case if you create
     * an empty button with {@link Button#Button} to use as a container.
     */
    public java.lang.String getIconName() {
        var RESULT = gtk_h.gtk_button_get_icon_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Fetches the text from the label of the button.
     * <p>
     * If the label text has not been set with {@link Button#setLabel}
     * the return value will be {@code null}. This will be the case if you create
     * an empty button with {@link Button#Button} to use as a container.
     */
    public java.lang.String getLabel() {
        var RESULT = gtk_h.gtk_button_get_label(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * gets whether underlines are interpreted as mnemonics.
     * <p>
     * See {@link Button#setUseUnderline}.
     */
    public boolean getUseUnderline() {
        var RESULT = gtk_h.gtk_button_get_use_underline(handle());
        return RESULT != 0;
    }
    
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
        gtk_h.gtk_button_set_child(handle(), child.handle());
    }
    
    /**
     * Sets the style of the button.
     * <p>
     * Buttons can has a flat appearance or have a frame drawn around them.
     */
    public void setHasFrame(boolean hasFrame) {
        gtk_h.gtk_button_set_has_frame(handle(), hasFrame ? 1 : 0);
    }
    
    /**
     * Adds a {@code GtkImage} with the given icon name as a child.
     * <p>
     * If {@code button} already contains a child widget, that child widget will
     * be removed and replaced with the image.
     */
    public void setIconName(java.lang.String iconName) {
        gtk_h.gtk_button_set_icon_name(handle(), Interop.allocateNativeString(iconName).handle());
    }
    
    /**
     * Sets the text of the label of the button to {@code label}.
     * <p>
     * This will also clear any previously set labels.
     */
    public void setLabel(java.lang.String label) {
        gtk_h.gtk_button_set_label(handle(), Interop.allocateNativeString(label).handle());
    }
    
    /**
     * Sets whether to use underlines as mnemonics.
     * <p>
     * If true, an underline in the text of the button label indicates
     * the next character should be used for the mnemonic accelerator key.
     */
    public void setUseUnderline(boolean useUnderline) {
        gtk_h.gtk_button_set_use_underline(handle(), useUnderline ? 1 : 0);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("activate").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Button.Callbacks.class, "signalButtonActivate",
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
    public interface ClickedHandler {
        void signalReceived(Button source);
    }
    
    /**
     * Emitted when the button has been activated (pressed and released).
     */
    public SignalHandle onClicked(ClickedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("clicked").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Button.Callbacks.class, "signalButtonClicked",
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
    
        public static void signalButtonActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Button.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Button(References.get(source)));
        }
        
        public static void signalButtonClicked(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Button.ClickedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Button(References.get(source)));
        }
        
    }
}
