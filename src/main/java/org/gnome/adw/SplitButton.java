package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A combined button and dropdown widget.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="split-button-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="split-button.png" alt="split-button"&gt;
 * &lt;/picture&gt;
 * <p>
 * {@code AdwSplitButton} is typically used to present a set of actions in a menu,
 * but allow access to one of them with a single click.
 * <p>
 * The API is very similar to {@code Gtk.MenuButton}, see
 * their documentation for details.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * <pre>{@code 
 * splitbutton[.image-button][.text-button]
 * ├── button
 * │   ╰── <content>
 * ├── separator
 * ╰── menubutton
 *     ╰── button.toggle
 *         ╰── arrow
 * }</pre>
 * <p>
 * {@code AdwSplitButton}'s CSS node is called {@code splitbutton}. It contains the css
 * nodes: {@code button}, {@code separator}, {@code menubutton}. See {@link org.gtk.gtk.MenuButton}
 * documentation for the {@code menubutton} contents.
 * <p>
 * The main CSS node will contain the {@code .image-button} or {@code .text-button} style
 * classes matching the button contents. The nested button nodes will never
 * contain them.
 * <p>
 * <h2>Accessibility</h2>
 * <p>
 * {@code AdwSplitButton} uses the {@code GTK_ACCESSIBLE_ROLE_GROUP} role.
 */
public class SplitButton extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public SplitButton(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SplitButton */
    public static SplitButton castFrom(org.gtk.gobject.Object gobject) {
        return new SplitButton(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_split_button_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwSplitButton}.
     */
    public SplitButton() {
        super(constructNew());
    }
    
    /**
     * Gets the child widget.
     */
    public org.gtk.gtk.Widget getChild() {
        var RESULT = gtk_h.adw_split_button_get_child(handle());
        return new org.gtk.gtk.Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the direction in which the popup will be popped up.
     */
    public org.gtk.gtk.ArrowType getArrowDirection() {
        var RESULT = gtk_h.adw_split_button_get_direction(handle());
        return new org.gtk.gtk.ArrowType(RESULT);
    }
    
    /**
     * Gets the name of the icon used to automatically populate the button.
     * <p>
     * If the icon name has not been set with {@link SplitButton#setIconName}
     * the return value will be {@code NULL}.
     */
    public java.lang.String getIconName() {
        var RESULT = gtk_h.adw_split_button_get_icon_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the label for {@code self}.
     */
    public java.lang.String getLabel() {
        var RESULT = gtk_h.adw_split_button_get_label(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the menu model from which the popup will be created.
     */
    public org.gtk.gio.MenuModel getMenuModel() {
        var RESULT = gtk_h.adw_split_button_get_menu_model(handle());
        return new org.gtk.gio.MenuModel(References.get(RESULT, false));
    }
    
    /**
     * Gets the popover that will be popped up when the dropdown is clicked.
     */
    public org.gtk.gtk.Popover getPopover() {
        var RESULT = gtk_h.adw_split_button_get_popover(handle());
        return new org.gtk.gtk.Popover(References.get(RESULT, false));
    }
    
    /**
     * Gets whether an underline in the text indicates a mnemonic.
     */
    public boolean getUseUnderline() {
        var RESULT = gtk_h.adw_split_button_get_use_underline(handle());
        return RESULT != 0;
    }
    
    /**
     * Dismisses the menu.
     */
    public void popdown() {
        gtk_h.adw_split_button_popdown(handle());
    }
    
    /**
     * Pops up the menu.
     */
    public void popup() {
        gtk_h.adw_split_button_popup(handle());
    }
    
    /**
     * Sets the child widget.
     */
    public void setChild(org.gtk.gtk.Widget child) {
        gtk_h.adw_split_button_set_child(handle(), child.handle());
    }
    
    /**
     * Sets the direction in which the popup will be popped up.
     */
    public void setDirection(org.gtk.gtk.ArrowType direction) {
        gtk_h.adw_split_button_set_direction(handle(), direction.getValue());
    }
    
    /**
     * Sets the name of the icon used to automatically populate the button.
     */
    public void setIconName(java.lang.String iconName) {
        gtk_h.adw_split_button_set_icon_name(handle(), Interop.allocateNativeString(iconName).handle());
    }
    
    /**
     * Sets the label for {@code self}.
     */
    public void setLabel(java.lang.String label) {
        gtk_h.adw_split_button_set_label(handle(), Interop.allocateNativeString(label).handle());
    }
    
    /**
     * Sets the menu model from which the popup will be created.
     */
    public void setMenuModel(org.gtk.gio.MenuModel menuModel) {
        gtk_h.adw_split_button_set_menu_model(handle(), menuModel.handle());
    }
    
    /**
     * Sets the popover that will be popped up when the dropdown is clicked.
     */
    public void setPopover(org.gtk.gtk.Popover popover) {
        gtk_h.adw_split_button_set_popover(handle(), popover.handle());
    }
    
    /**
     * Sets whether an underline in the text indicates a mnemonic.
     */
    public void setUseUnderline(boolean useUnderline) {
        gtk_h.adw_split_button_set_use_underline(handle(), useUnderline ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(SplitButton source);
    }
    
    /**
     * Emitted to animate press then release.
     * <p>
     * This is an action signal. Applications should never connect to this signal,
     * but use the {@code SplitButton::clicked} signal.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("activate").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SplitButton.Callbacks.class, "signalSplitButtonActivate",
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
        void signalReceived(SplitButton source);
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
                    MethodHandles.lookup().findStatic(SplitButton.Callbacks.class, "signalSplitButtonClicked",
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
    
        public static void signalSplitButtonActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SplitButton.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SplitButton(References.get(source)));
        }
        
        public static void signalSplitButtonClicked(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SplitButton.ClickedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SplitButton(References.get(source)));
        }
        
    }
}
