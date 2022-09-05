package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkCheckButton` places a label next to an indicator.
 * 
 * ![Example GtkCheckButtons](check-button.png)
 * 
 * A `GtkCheckButton` is created by calling either [ctor@Gtk.CheckButton.new]
 * or [ctor@Gtk.CheckButton.new_with_label].
 * 
 * The state of a `GtkCheckButton` can be set specifically using
 * [method@Gtk.CheckButton.set_active], and retrieved using
 * [method@Gtk.CheckButton.get_active].
 * 
 * # Inconsistent state
 * 
 * In addition to "on" and "off", check buttons can be an
 * "in between" state that is neither on nor off. This can be used
 * e.g. when the user has selected a range of elements (such as some
 * text or spreadsheet cells) that are affected by a check button,
 * and the current values in that range are inconsistent.
 * 
 * To set a `GtkCheckButton` to inconsistent state, use
 * [method@Gtk.CheckButton.set_inconsistent].
 * 
 * # Grouping
 * 
 * Check buttons can be grouped together, to form mutually exclusive
 * groups - only one of the buttons can be toggled at a time, and toggling
 * another one will switch the currently toggled one off.
 * 
 * Grouped check buttons use a different indicator, and are commonly referred
 * to as *radio buttons*.
 * 
 * ![Example GtkCheckButtons](radio-button.png)
 * 
 * To add a `GtkCheckButton` to a group, use [method@Gtk.CheckButton.set_group].
 * 
 * # CSS nodes
 * 
 * ```
 * checkbutton[.text-button]
 * ├── check
 * ╰── [label]
 * ```
 * 
 * A `GtkCheckButton` has a main node with name checkbutton. If the
 * [property@Gtk.CheckButton:label] property is set, it contains a label
 * child. The indicator node is named check when no group is set, and
 * radio if the checkbutton is grouped together with other checkbuttons.
 * 
 * # Accessibility
 * 
 * `GtkCheckButton` uses the %GTK_ACCESSIBLE_ROLE_CHECKBOX role.
 */
public class CheckButton extends Widget implements Accessible, Actionable, Buildable, ConstraintTarget {

    public CheckButton(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to CheckButton */
    public static CheckButton castFrom(org.gtk.gobject.Object gobject) {
        return new CheckButton(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkCheckButton`.
     */
    public CheckButton() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_check_button_new(), false));
    }
    
    /**
     * Creates a new `GtkCheckButton` with the given text.
     */
    public static CheckButton newWithLabel(java.lang.String label) {
        return new CheckButton(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_check_button_new_with_label(Interop.getAllocator().allocateUtf8String(label)), false));
    }
    
    /**
     * Creates a new `GtkCheckButton` with the given text and a mnemonic.
     */
    public static CheckButton newWithMnemonic(java.lang.String label) {
        return new CheckButton(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_check_button_new_with_mnemonic(Interop.getAllocator().allocateUtf8String(label)), false));
    }
    
    /**
     * Returns whether the check button is active.
     */
    public boolean getActive() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_check_button_get_active(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the check button is in an inconsistent state.
     */
    public boolean getInconsistent() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_check_button_get_inconsistent(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the label of the check button.
     */
    public java.lang.String getLabel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_check_button_get_label(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether underlines in the label indicate mnemonics.
     */
    public boolean getUseUnderline() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_check_button_get_use_underline(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Changes the check buttons active state.
     */
    public void setActive(boolean setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_check_button_set_active(HANDLE(), setting ? 1 : 0);
    }
    
    /**
     * Adds @self to the group of @group.
     * 
     * In a group of multiple check buttons, only one button can be active
     * at a time. The behavior of a checkbutton in a group is also commonly
     * known as a *radio button*.
     * 
     * Setting the group of a check button also changes the css name of the
     * indicator widget's CSS node to 'radio'.
     * 
     * Setting up groups in a cycle leads to undefined behavior.
     * 
     * Note that the same effect can be achieved via the [iface@Gtk.Actionable]
     * API, by using the same action with parameter type and state type 's'
     * for all buttons in the group, and giving each button its own target
     * value.
     */
    public void setGroup(CheckButton group) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_check_button_set_group(HANDLE(), group.HANDLE());
    }
    
    /**
     * Sets the `GtkCheckButton` to inconsistent state.
     * 
     * You shoud turn off the inconsistent state again if the user checks
     * the check button. This has to be done manually.
     */
    public void setInconsistent(boolean inconsistent) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_check_button_set_inconsistent(HANDLE(), inconsistent ? 1 : 0);
    }
    
    /**
     * Sets the text of @self.
     * 
     * If [property@Gtk.CheckButton:use-underline] is %TRUE, an underscore
     * in @label is interpreted as mnemonic indicator, see
     * [method@Gtk.CheckButton.set_use_underline] for details on this behavior.
     */
    public void setLabel(java.lang.String label) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_check_button_set_label(HANDLE(), Interop.getAllocator().allocateUtf8String(label));
    }
    
    /**
     * Sets whether underlines in the label indicate mnemonics.
     * 
     * If @setting is %TRUE, an underscore character in @self's label
     * indicates a mnemonic accelerator key. This behavior is similar
     * to [property@Gtk.Label:use-underline].
     */
    public void setUseUnderline(boolean setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_check_button_set_use_underline(HANDLE(), setting ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(CheckButton source);
    }
    
    /**
     * Emitted to when the check button is activated.
     * 
     * The `::activate` signal on `GtkCheckButton` is an action signal and
     * emitting it causes the button to animate press then release.
     * 
     * Applications should never connect to this signal, but use the
     * [signal@Gtk.CheckButton::toggled] signal.
     */
    public void onActivate(ActivateHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCheckButtonActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("activate"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ToggledHandler {
        void signalReceived(CheckButton source);
    }
    
    /**
     * Emitted when the buttons's [property@Gtk.CheckButton:active]
     * property changes.
     */
    public void onToggled(ToggledHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCheckButtonToggled", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("toggled"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
