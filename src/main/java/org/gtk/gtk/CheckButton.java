package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>Inconsistent state</strong><br/>
 * In addition to "on" and "off", check buttons can be an
 * "in between" state that is neither on nor off. This can be used
 * e.g. when the user has selected a range of elements (such as some
 * text or spreadsheet cells) that are affected by a check button,
 * and the current values in that range are inconsistent.
 * <p>
 * To set a {@code GtkCheckButton} to inconsistent state, use
 * {@link CheckButton#setInconsistent}.
 * <p>
 * <strong>Grouping</strong><br/>
 * Check buttons can be grouped together, to form mutually exclusive
 * groups - only one of the buttons can be toggled at a time, and toggling
 * another one will switch the currently toggled one off.
 * <p>
 * Grouped check buttons use a different indicator, and are commonly referred
 * to as <em>radio buttons</em>.
 * <p>
 * <img src="./doc-files/radio-button.png" alt="Example GtkCheckButtons">
 * <p>
 * To add a {@code GtkCheckButton} to a group, use {@link CheckButton#setGroup}.
 * <p>
 * <strong>CSS nodes</strong><br/>
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
 * <strong>Accessibility</strong><br/>
 * {@code GtkCheckButton} uses the {@link AccessibleRole#CHECKBOX} role.
 */
public class CheckButton extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCheckButton";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gtk.Widget parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gtk.Widget(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a CheckButton proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CheckButton(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CheckButton if its GType is a (or inherits from) "GtkCheckButton".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CheckButton} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCheckButton", a ClassCastException will be thrown.
     */
    public static CheckButton castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkCheckButton"))) {
            return new CheckButton(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCheckButton");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_check_button_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCheckButton}.
     */
    public CheckButton() {
        super(constructNew(), Ownership.NONE);
    }
    
    private static Addressable constructNewWithLabel(@Nullable java.lang.String label) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_check_button_new_with_label.invokeExact(
                    (Addressable) (label == null ? MemoryAddress.NULL : Interop.allocateNativeString(label)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCheckButton} with the given text.
     * @param label the text for the check button.
     * @return a new {@code GtkCheckButton}
     */
    public static CheckButton newWithLabel(@Nullable java.lang.String label) {
        return new CheckButton(constructNewWithLabel(label), Ownership.NONE);
    }
    
    private static Addressable constructNewWithMnemonic(@Nullable java.lang.String label) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_check_button_new_with_mnemonic.invokeExact(
                    (Addressable) (label == null ? MemoryAddress.NULL : Interop.allocateNativeString(label)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCheckButton} with the given text and a mnemonic.
     * @param label The text of the button, with an underscore
     *   in front of the mnemonic character
     * @return a new {@code GtkCheckButton}
     */
    public static CheckButton newWithMnemonic(@Nullable java.lang.String label) {
        return new CheckButton(constructNewWithMnemonic(label), Ownership.NONE);
    }
    
    /**
     * Returns whether the check button is active.
     * @return whether the check button is active
     */
    public boolean getActive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_check_button_get_active.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the check button is in an inconsistent state.
     * @return {@code true} if {@code check_button} is currently in an inconsistent state
     */
    public boolean getInconsistent() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_check_button_get_inconsistent.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the label of the check button.
     * @return The label {@code self} shows next
     *   to the indicator. If no label is shown, {@code null} will be returned.
     */
    public @Nullable java.lang.String getLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_check_button_get_label.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns whether underlines in the label indicate mnemonics.
     * @return The value of the {@code Gtk.CheckButton:use-underline} property.
     *   See {@link CheckButton#setUseUnderline} for details on how to set
     *   a new value.
     */
    public boolean getUseUnderline() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_check_button_get_use_underline.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Changes the check buttons active state.
     * @param setting the new value to set
     */
    public void setActive(boolean setting) {
        try {
            DowncallHandles.gtk_check_button_set_active.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code self} to the group of {@code group}.
     * <p>
     * In a group of multiple check buttons, only one button can be active
     * at a time. The behavior of a checkbutton in a group is also commonly
     * known as a <em>radio button</em>.
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
     * @param group another {@code GtkCheckButton} to
     *   form a group with
     */
    public void setGroup(@Nullable org.gtk.gtk.CheckButton group) {
        try {
            DowncallHandles.gtk_check_button_set_group.invokeExact(
                    handle(),
                    (Addressable) (group == null ? MemoryAddress.NULL : group.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkCheckButton} to inconsistent state.
     * <p>
     * You shoud turn off the inconsistent state again if the user checks
     * the check button. This has to be done manually.
     * @param inconsistent {@code true} if state is inconsistent
     */
    public void setInconsistent(boolean inconsistent) {
        try {
            DowncallHandles.gtk_check_button_set_inconsistent.invokeExact(
                    handle(),
                    inconsistent ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the text of {@code self}.
     * <p>
     * If {@code Gtk.CheckButton:use-underline} is {@code true}, an underscore
     * in {@code label} is interpreted as mnemonic indicator, see
     * {@link CheckButton#setUseUnderline} for details on this behavior.
     * @param label The text shown next to the indicator, or {@code null}
     *   to show no text
     */
    public void setLabel(@Nullable java.lang.String label) {
        try {
            DowncallHandles.gtk_check_button_set_label.invokeExact(
                    handle(),
                    (Addressable) (label == null ? MemoryAddress.NULL : Interop.allocateNativeString(label)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether underlines in the label indicate mnemonics.
     * <p>
     * If {@code setting} is {@code true}, an underscore character in {@code self}'s label
     * indicates a mnemonic accelerator key. This behavior is similar
     * to {@code Gtk.Label:use-underline}.
     * @param setting the new value to set
     */
    public void setUseUnderline(boolean setting) {
        try {
            DowncallHandles.gtk_check_button_set_use_underline.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Activate {
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<CheckButton.Activate> onActivate(CheckButton.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CheckButton.Callbacks.class, "signalCheckButtonActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<CheckButton.Activate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Toggled {
        void signalReceived(CheckButton source);
    }
    
    /**
     * Emitted when the buttons's {@code Gtk.CheckButton:active}
     * property changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<CheckButton.Toggled> onToggled(CheckButton.Toggled handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("toggled"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CheckButton.Callbacks.class, "signalCheckButtonToggled",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<CheckButton.Toggled>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_check_button_new = Interop.downcallHandle(
            "gtk_check_button_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_check_button_new_with_label = Interop.downcallHandle(
            "gtk_check_button_new_with_label",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_check_button_new_with_mnemonic = Interop.downcallHandle(
            "gtk_check_button_new_with_mnemonic",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_check_button_get_active = Interop.downcallHandle(
            "gtk_check_button_get_active",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_check_button_get_inconsistent = Interop.downcallHandle(
            "gtk_check_button_get_inconsistent",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_check_button_get_label = Interop.downcallHandle(
            "gtk_check_button_get_label",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_check_button_get_use_underline = Interop.downcallHandle(
            "gtk_check_button_get_use_underline",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_check_button_set_active = Interop.downcallHandle(
            "gtk_check_button_set_active",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_check_button_set_group = Interop.downcallHandle(
            "gtk_check_button_set_group",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_check_button_set_inconsistent = Interop.downcallHandle(
            "gtk_check_button_set_inconsistent",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_check_button_set_label = Interop.downcallHandle(
            "gtk_check_button_set_label",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_check_button_set_use_underline = Interop.downcallHandle(
            "gtk_check_button_set_use_underline",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalCheckButtonActivate(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (CheckButton.Activate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new CheckButton(source, Ownership.UNKNOWN));
        }
        
        public static void signalCheckButtonToggled(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (CheckButton.Toggled) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new CheckButton(source, Ownership.UNKNOWN));
        }
    }
}
