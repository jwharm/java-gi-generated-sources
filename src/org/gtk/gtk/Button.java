package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GtkButton` widget is generally used to trigger a callback function that is
 * called when the button is pressed.
 * 
 * ![An example GtkButton](button.png)
 * 
 * The `GtkButton` widget can hold any valid child widget. That is, it can hold
 * almost any other standard `GtkWidget`. The most commonly used child is the
 * `GtkLabel`.
 * 
 * # CSS nodes
 * 
 * `GtkButton` has a single CSS node with name button. The node will get the
 * style classes .image-button or .text-button, if the content is just an
 * image or label, respectively. It may also receive the .flat style class.
 * When activating a button via the keyboard, the button will temporarily
 * gain the .keyboard-activating style class.
 * 
 * Other style classes that are commonly used with `GtkButton` include
 * .suggested-action and .destructive-action. In special cases, buttons
 * can be made round by adding the .circular style class.
 * 
 * Button-like widgets like [class@Gtk.ToggleButton], [class@Gtk.MenuButton],
 * [class@Gtk.VolumeButton], [class@Gtk.LockButton], [class@Gtk.ColorButton]
 * or [class@Gtk.FontButton] use style classes such as .toggle, .popup, .scale,
 * .lock, .color on the button node to differentiate themselves from a plain
 * `GtkButton`.
 * 
 * # Accessibility
 * 
 * `GtkButton` uses the %GTK_ACCESSIBLE_ROLE_BUTTON role.
 */
public class Button extends Widget implements Accessible, Actionable, Buildable, ConstraintTarget {

    public Button(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Button */
    public static Button castFrom(org.gtk.gobject.Object gobject) {
        return new Button(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkButton` widget.
     * 
     * To add a child widget to the button, use [method@Gtk.Button.set_child].
     */
    public Button() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_button_new(), false));
    }
    
    /**
     * Creates a new button containing an icon from the current icon theme.
     * 
     * If the icon name isn’t known, a “broken image” icon will be
     * displayed instead. If the current icon theme is changed, the icon
     * will be updated appropriately.
     */
    public static Button newFromIconName(java.lang.String iconName) {
        return new Button(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_button_new_from_icon_name(Interop.getAllocator().allocateUtf8String(iconName)), false));
    }
    
    /**
     * Creates a `GtkButton` widget with a `GtkLabel` child.
     */
    public static Button newWithLabel(java.lang.String label) {
        return new Button(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_button_new_with_label(Interop.getAllocator().allocateUtf8String(label)), false));
    }
    
    /**
     * Creates a new `GtkButton` containing a label.
     * 
     * If characters in @label are preceded by an underscore, they are underlined.
     * If you need a literal underscore character in a label, use “__” (two
     * underscores). The first underlined character represents a keyboard
     * accelerator called a mnemonic. Pressing Alt and that key activates the button.
     */
    public static Button newWithMnemonic(java.lang.String label) {
        return new Button(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_button_new_with_mnemonic(Interop.getAllocator().allocateUtf8String(label)), false));
    }
    
    /**
     * Gets the child widget of @button.
     */
    public Widget getChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_button_get_child(HANDLE());
        return new Widget(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns whether the button has a frame.
     */
    public boolean getHasFrame() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_button_get_has_frame(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the icon name of the button.
     * 
     * If the icon name has not been set with [method@Gtk.Button.set_icon_name]
     * the return value will be %NULL. This will be the case if you create
     * an empty button with [ctor@Gtk.Button.new] to use as a container.
     */
    public java.lang.String getIconName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_button_get_icon_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Fetches the text from the label of the button.
     * 
     * If the label text has not been set with [method@Gtk.Button.set_label]
     * the return value will be %NULL. This will be the case if you create
     * an empty button with [ctor@Gtk.Button.new] to use as a container.
     */
    public java.lang.String getLabel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_button_get_label(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * gets whether underlines are interpreted as mnemonics.
     * 
     * See [method@Gtk.Button.set_use_underline].
     */
    public boolean getUseUnderline() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_button_get_use_underline(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets the child widget of @button.
     * 
     * Note that by using this API, you take full responsibility for setting
     * up the proper accessibility label and description information for @button.
     * Most likely, you'll either set the accessibility label or description
     * for @button explicitly, or you'll set a labelled-by or described-by
     * relations from @child to @button.
     */
    public void setChild(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_button_set_child(HANDLE(), child.HANDLE());
    }
    
    /**
     * Sets the style of the button.
     * 
     * Buttons can has a flat appearance or have a frame drawn around them.
     */
    public void setHasFrame(boolean hasFrame) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_button_set_has_frame(HANDLE(), hasFrame ? 1 : 0);
    }
    
    /**
     * Adds a `GtkImage` with the given icon name as a child.
     * 
     * If @button already contains a child widget, that child widget will
     * be removed and replaced with the image.
     */
    public void setIconName(java.lang.String iconName) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_button_set_icon_name(HANDLE(), Interop.getAllocator().allocateUtf8String(iconName));
    }
    
    /**
     * Sets the text of the label of the button to @label.
     * 
     * This will also clear any previously set labels.
     */
    public void setLabel(java.lang.String label) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_button_set_label(HANDLE(), Interop.getAllocator().allocateUtf8String(label));
    }
    
    /**
     * Sets whether to use underlines as mnemonics.
     * 
     * If true, an underline in the text of the button label indicates
     * the next character should be used for the mnemonic accelerator key.
     */
    public void setUseUnderline(boolean useUnderline) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_button_set_use_underline(HANDLE(), useUnderline ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(Button source);
    }
    
    /**
     * Emitted to animate press then release.
     * 
     * This is an action signal. Applications should never connect
     * to this signal, but use the [signal@Gtk.Button::clicked] signal.
     */
    public void onActivate(ActivateHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalButtonActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("activate"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
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
    public void onClicked(ClickedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalButtonClicked", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("clicked"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
