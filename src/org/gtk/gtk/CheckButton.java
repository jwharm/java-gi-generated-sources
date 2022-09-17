package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GtkCheckButton</code> places a label next to an indicator.
 * <p>
 * !{@link [Example GtkCheckButtons]}(check-button.png)
 * <p>
 * A <code>GtkCheckButton</code> is created by calling either {@link [ctor@Gtk.CheckButton.new] (ref=ctor)}
 * or {@link [ctor@Gtk.CheckButton.new_with_label] (ref=ctor)}.
 * <p>
 * The state of a <code>GtkCheckButton</code> can be set specifically using
 * {@link org.gtk.gtk.CheckButton#setActive}, and retrieved using
 * {@link org.gtk.gtk.CheckButton#getActive}.
 * <p>
 * <h1>nconsistent state</h1>
 * <p>
 * In addition to &#34;on&#34; and &#34;off&#34;, check buttons can be an
 * &#34;in between&#34; state that is neither on nor off. This can be used
 * e.g. when the user has selected a range of elements (such as some
 * text or spreadsheet cells) that are affected by a check button,
 * and the current values in that range are inconsistent.
 * <p>
 * To set a <code>GtkCheckButton</code> to inconsistent state, use
 * {@link org.gtk.gtk.CheckButton#setInconsistent}.
 * <p>
 * <h1>rouping</h1>
 * <p>
 * Check buttons can be grouped together, to form mutually exclusive
 * groups - only one of the buttons can be toggled at a time, and toggling
 * another one will switch the currently toggled one off.
 * <p>
 * Grouped check buttons use a different indicator, and are commonly referred
 * to as *radio buttons*.
 * <p>
 * !{@link [Example GtkCheckButtons]}(radio-button.png)
 * <p>
 * To add a <code>GtkCheckButton</code> to a group, use {@link org.gtk.gtk.CheckButton#setGroup}.
 * <p>
 * <h1>SS nodes</h1>
 * <p><pre>
 * checkbutton{@link [.text-button]}
 * &#9500;&#9472;&#9472; check
 * &#9584;&#9472;&#9472; {@link [label]}
 * </pre>
 * <p>
 * A <code>GtkCheckButton</code> has a main node with name checkbutton. If the
 * {@link [property@Gtk.CheckButton:label] (ref=property)} property is set, it contains a label
 * child. The indicator node is named check when no group is set, and
 * radio if the checkbutton is grouped together with other checkbuttons.
 * <p>
 * <h1>ccessibility</h1>
 * <p><code>GtkCheckButton</code> uses the {@link org.gtk.gtk.AccessibleRole#CHECKBOX} role.
 */
public class CheckButton extends Widget implements Accessible, Actionable, Buildable, ConstraintTarget {

    public CheckButton(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CheckButton */
    public static CheckButton castFrom(org.gtk.gobject.Object gobject) {
        return new CheckButton(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_check_button_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkCheckButton</code>.
     */
    public CheckButton() {
        super(constructNew());
    }
    
    private static Reference constructNewWithLabel(java.lang.String label) {
        Reference RESULT = References.get(gtk_h.gtk_check_button_new_with_label(Interop.allocateNativeString(label).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkCheckButton</code> with the given text.
     */
    public static CheckButton newWithLabel(java.lang.String label) {
        return new CheckButton(constructNewWithLabel(label));
    }
    
    private static Reference constructNewWithMnemonic(java.lang.String label) {
        Reference RESULT = References.get(gtk_h.gtk_check_button_new_with_mnemonic(Interop.allocateNativeString(label).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkCheckButton</code> with the given text and a mnemonic.
     */
    public static CheckButton newWithMnemonic(java.lang.String label) {
        return new CheckButton(constructNewWithMnemonic(label));
    }
    
    /**
     * Returns whether the check button is active.
     */
    public boolean getActive() {
        var RESULT = gtk_h.gtk_check_button_get_active(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the check button is in an inconsistent state.
     */
    public boolean getInconsistent() {
        var RESULT = gtk_h.gtk_check_button_get_inconsistent(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the label of the check button.
     */
    public java.lang.String getLabel() {
        var RESULT = gtk_h.gtk_check_button_get_label(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether underlines in the label indicate mnemonics.
     */
    public boolean getUseUnderline() {
        var RESULT = gtk_h.gtk_check_button_get_use_underline(handle());
        return (RESULT != 0);
    }
    
    /**
     * Changes the check buttons active state.
     */
    public void setActive(boolean setting) {
        gtk_h.gtk_check_button_set_active(handle(), setting ? 1 : 0);
    }
    
    /**
     * Adds @self to the group of @group.
     * 
     * In a group of multiple check buttons, only one button can be active
     * at a time. The behavior of a checkbutton in a group is also commonly
     * known as a *radio button*.
     * 
     * Setting the group of a check button also changes the css name of the
     * indicator widget&#39;s CSS node to &#39;radio&#39;.
     * 
     * Setting up groups in a cycle leads to undefined behavior.
     * 
     * Note that the same effect can be achieved via the {@link [iface@Gtk.Actionable] (ref=iface)}
     * API, by using the same action with parameter type and state type &#39;s&#39;
     * for all buttons in the group, and giving each button its own target
     * value.
     */
    public void setGroup(CheckButton group) {
        gtk_h.gtk_check_button_set_group(handle(), group.handle());
    }
    
    /**
     * Sets the <code>GtkCheckButton</code> to inconsistent state.
     * 
     * You shoud turn off the inconsistent state again if the user checks
     * the check button. This has to be done manually.
     */
    public void setInconsistent(boolean inconsistent) {
        gtk_h.gtk_check_button_set_inconsistent(handle(), inconsistent ? 1 : 0);
    }
    
    /**
     * Sets the text of @self.
     * 
     * If {@link [property@Gtk.CheckButton:use-underline] (ref=property)} is <code>TRUE,</code> an underscore
     * in @label is interpreted as mnemonic indicator, see
     * {@link org.gtk.gtk.CheckButton#setUseUnderline} for details on this behavior.
     */
    public void setLabel(java.lang.String label) {
        gtk_h.gtk_check_button_set_label(handle(), Interop.allocateNativeString(label).handle());
    }
    
    /**
     * Sets whether underlines in the label indicate mnemonics.
     * 
     * If @setting is <code>TRUE,</code> an underscore character in @self&#39;s label
     * indicates a mnemonic accelerator key. This behavior is similar
     * to {@link [property@Gtk.Label:use-underline] (ref=property)}.
     */
    public void setUseUnderline(boolean setting) {
        gtk_h.gtk_check_button_set_use_underline(handle(), setting ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(CheckButton source);
    }
    
    /**
     * Emitted to when the check button is activated.
     * <p>
     * The <code>::activate</code> signal on <code>GtkCheckButton</code> is an action signal and
     * emitting it causes the button to animate press then release.
     * 
     * Applications should never connect to this signal, but use the
     * {@link [signal@Gtk.CheckButton::toggled] (ref=signal)} signal.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCheckButtonActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ToggledHandler {
        void signalReceived(CheckButton source);
    }
    
    /**
     * Emitted when the buttons&#39;s {@link [property@Gtk.CheckButton:active] (ref=property)}
     * property changes.
     */
    public SignalHandle onToggled(ToggledHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCheckButtonToggled", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("toggled").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
