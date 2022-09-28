package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkCheckButton} places a label next to an indicator.
 * <p>
 * <img src="./doc-files/check-button.png" alt="Example GtkCheckButtons">
 * <p>
 * A {@code GtkCheckButton} is created by calling either {@link CheckButton#CheckButton}
 * or {@link CheckButton#newWithLabel}.
 * <p>
 * The state of a {@code GtkCheckButton} can be set specifically using
 * {@link CheckButton#setActive}, and retrieved using
 * {@link CheckButton#getActive}.
 * <p>
 * <h1>Inconsistent state</h1>
 * <p>
 * In addition to "on" and "off", check buttons can be an
 * "in between" state that is neither on nor off. This can be used
 * e.g. when the user has selected a range of elements (such as some
 * text or spreadsheet cells) that are affected by a check button,
 * and the current values in that range are inconsistent.
 * <p>
 * To set a {@code GtkCheckButton} to inconsistent state, use
 * {@link CheckButton#setInconsistent}.
 * <p>
 * <h1>Grouping</h1>
 * <p>
 * Check buttons can be grouped together, to form mutually exclusive
 * groups - only one of the buttons can be toggled at a time, and toggling
 * another one will switch the currently toggled one off.
 * <p>
 * Grouped check buttons use a different indicator, and are commonly referred
 * to as <strong>radio buttons</strong>.
 * <p>
 * <img src="./doc-files/radio-button.png" alt="Example GtkCheckButtons">
 * <p>
 * To add a {@code GtkCheckButton} to a group, use {@link CheckButton#setGroup}.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * checkbutton[.text-button]
 * ├── check
 * ╰── [label]
 * }</pre>
 * <p>
 * A {@code GtkCheckButton} has a main node with name checkbutton. If the
 * {@code Gtk.CheckButton:label} property is set, it contains a label
 * child. The indicator node is named check when no group is set, and
 * radio if the checkbutton is grouped together with other checkbuttons.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkCheckButton} uses the {@link AccessibleRole#CHECKBOX} role.
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
     * Creates a new {@code GtkCheckButton}.
     */
    public CheckButton() {
        super(constructNew());
    }
    
    private static Reference constructNewWithLabel(java.lang.String label) {
        Reference RESULT = References.get(gtk_h.gtk_check_button_new_with_label(Interop.allocateNativeString(label).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCheckButton} with the given text.
     */
    public static CheckButton newWithLabel(java.lang.String label) {
        return new CheckButton(constructNewWithLabel(label));
    }
    
    private static Reference constructNewWithMnemonic(java.lang.String label) {
        Reference RESULT = References.get(gtk_h.gtk_check_button_new_with_mnemonic(Interop.allocateNativeString(label).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCheckButton} with the given text and a mnemonic.
     */
    public static CheckButton newWithMnemonic(java.lang.String label) {
        return new CheckButton(constructNewWithMnemonic(label));
    }
    
    /**
     * Returns whether the check button is active.
     */
    public boolean getActive() {
        var RESULT = gtk_h.gtk_check_button_get_active(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether the check button is in an inconsistent state.
     */
    public boolean getInconsistent() {
        var RESULT = gtk_h.gtk_check_button_get_inconsistent(handle());
        return RESULT != 0;
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
        return RESULT != 0;
    }
    
    /**
     * Changes the check buttons active state.
     */
    public void setActive(boolean setting) {
        gtk_h.gtk_check_button_set_active(handle(), setting ? 1 : 0);
    }
    
    /**
     * Adds {@code self} to the group of {@code group}.
     * <p>
     * In a group of multiple check buttons, only one button can be active
     * at a time. The behavior of a checkbutton in a group is also commonly
     * known as a <strong>radio button</strong>.
     * <p>
     * Setting the group of a check button also changes the css name of the
     * indicator widget's CSS node to 'radio'.
     * <p>
     * Setting up groups in a cycle leads to undefined behavior.
     * <p>
     * Note that the same effect can be achieved via the {@code Gtk.Actionable}
     * API, by using the same action with parameter type and state type 's'
     * for all buttons in the group, and giving each button its own target
     * value.
     */
    public void setGroup(CheckButton group) {
        gtk_h.gtk_check_button_set_group(handle(), group.handle());
    }
    
    /**
     * Sets the {@code GtkCheckButton} to inconsistent state.
     * <p>
     * You shoud turn off the inconsistent state again if the user checks
     * the check button. This has to be done manually.
     */
    public void setInconsistent(boolean inconsistent) {
        gtk_h.gtk_check_button_set_inconsistent(handle(), inconsistent ? 1 : 0);
    }
    
    /**
     * Sets the text of {@code self}.
     * <p>
     * If {@code Gtk.CheckButton:use-underline} is {@code true}, an underscore
     * in {@code label} is interpreted as mnemonic indicator, see
     * {@link CheckButton#setUseUnderline} for details on this behavior.
     */
    public void setLabel(java.lang.String label) {
        gtk_h.gtk_check_button_set_label(handle(), Interop.allocateNativeString(label).handle());
    }
    
    /**
     * Sets whether underlines in the label indicate mnemonics.
     * <p>
     * If {@code setting} is {@code true}, an underscore character in {@code self}'s label
     * indicates a mnemonic accelerator key. This behavior is similar
     * to {@code Gtk.Label:use-underline}.
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
     * The {@code ::activate} signal on {@code GtkCheckButton} is an action signal and
     * emitting it causes the button to animate press then release.
     * <p>
     * Applications should never connect to this signal, but use the
     * {@code Gtk.CheckButton::toggled} signal.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("activate").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CheckButton.Callbacks.class, "signalCheckButtonActivate",
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
    public interface ToggledHandler {
        void signalReceived(CheckButton source);
    }
    
    /**
     * Emitted when the buttons's {@code Gtk.CheckButton:active}
     * property changes.
     */
    public SignalHandle onToggled(ToggledHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("toggled").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CheckButton.Callbacks.class, "signalCheckButtonToggled",
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
    
        public static void signalCheckButtonActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (CheckButton.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new CheckButton(References.get(source)));
        }
        
        public static void signalCheckButtonToggled(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (CheckButton.ToggledHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new CheckButton(References.get(source)));
        }
        
    }
}
