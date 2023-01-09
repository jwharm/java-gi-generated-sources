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
 * {@code Gtk.CheckButton:label} or {@code Gtk.CheckButton:child}
 * properties are set, it contains a child widget. The indicator node
 * is named check when no group is set, and radio if the checkbutton
 * is grouped together with other checkbuttons.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkCheckButton} uses the {@link AccessibleRole#CHECKBOX} role.
 */
public class CheckButton extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCheckButton";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a CheckButton proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CheckButton(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CheckButton> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CheckButton(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWithLabel(@Nullable java.lang.String label) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_check_button_new_with_label.invokeExact((Addressable) (label == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(label, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new {@code GtkCheckButton} with the given text.
     * @param label the text for the check button.
     * @return a new {@code GtkCheckButton}
     */
    public static CheckButton newWithLabel(@Nullable java.lang.String label) {
        var RESULT = constructNewWithLabel(label);
        var OBJECT = (org.gtk.gtk.CheckButton) Interop.register(RESULT, org.gtk.gtk.CheckButton.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWithMnemonic(@Nullable java.lang.String label) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_check_button_new_with_mnemonic.invokeExact((Addressable) (label == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(label, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new {@code GtkCheckButton} with the given text and a mnemonic.
     * @param label The text of the button, with an underscore
     *   in front of the mnemonic character
     * @return a new {@code GtkCheckButton}
     */
    public static CheckButton newWithMnemonic(@Nullable java.lang.String label) {
        var RESULT = constructNewWithMnemonic(label);
        var OBJECT = (org.gtk.gtk.CheckButton) Interop.register(RESULT, org.gtk.gtk.CheckButton.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Returns whether the check button is active.
     * @return whether the check button is active
     */
    public boolean getActive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_check_button_get_active.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the child widget of {@code button} or {@code NULL} if {@code CheckButton:label} is set.
     * @return the child widget of {@code button}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_check_button_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns whether the check button is in an inconsistent state.
     * @return {@code true} if {@code check_button} is currently in an inconsistent state
     */
    public boolean getInconsistent() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_check_button_get_inconsistent.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the label of the check button or {@code NULL} if {@code CheckButton:child} is set.
     * @return The label {@code self} shows next
     *   to the indicator. If no label is shown, {@code null} will be returned.
     */
    public @Nullable java.lang.String getLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_check_button_get_label.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
            RESULT = (int) DowncallHandles.gtk_check_button_get_use_underline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Changes the check buttons active state.
     * @param setting the new value to set
     */
    public void setActive(boolean setting) {
        try {
            DowncallHandles.gtk_check_button_set_active.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the child widget of {@code button}.
     * <p>
     * Note that by using this API, you take full responsibility for setting
     * up the proper accessibility label and description information for {@code button}.
     * Most likely, you'll either set the accessibility label or description
     * for {@code button} explicitly, or you'll set a labelled-by or described-by
     * relations from {@code child} to {@code button}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_check_button_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
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
                    Marshal.booleanToInteger.marshal(inconsistent, null).intValue());
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_check_button_set_label.invokeExact(
                        handle(),
                        (Addressable) (label == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(label, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_check_button_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Activate} callback.
     */
    @FunctionalInterface
    public interface Activate {
    
        /**
         * Emitted to when the check button is activated.
         * <p>
         * The {@code ::activate} signal on {@code GtkCheckButton} is an action signal and
         * emitting it causes the button to animate press then release.
         * <p>
         * Applications should never connect to this signal, but use the
         * {@code Gtk.CheckButton::toggled} signal.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceCheckButton) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Activate.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Toggled} callback.
     */
    @FunctionalInterface
    public interface Toggled {
    
        /**
         * Emitted when the buttons's {@code Gtk.CheckButton:active}
         * property changes.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceCheckButton) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Toggled.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the buttons's {@code Gtk.CheckButton:active}
     * property changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<CheckButton.Toggled> onToggled(CheckButton.Toggled handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("toggled", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link CheckButton.Builder} object constructs a {@link CheckButton} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CheckButton.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link CheckButton} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CheckButton}.
         * @return A new instance of {@code CheckButton} with the properties 
         *         that were set in the Builder object.
         */
        public CheckButton build() {
            return (CheckButton) org.gtk.gobject.GObject.newWithProperties(
                CheckButton.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * If the check button is active.
         * <p>
         * Setting {@code active} to {@code true} will add the {@code :checked:} state to both
         * the check button and the indicator CSS node.
         * @param active The value for the {@code active} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActive(boolean active) {
            names.add("active");
            values.add(org.gtk.gobject.Value.create(active));
            return this;
        }
        
        /**
         * The child widget.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * The check button whose group this widget belongs to.
         * @param group The value for the {@code group} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGroup(org.gtk.gtk.CheckButton group) {
            names.add("group");
            values.add(org.gtk.gobject.Value.create(group));
            return this;
        }
        
        /**
         * If the check button is in an “in between” state.
         * <p>
         * The inconsistent state only affects visual appearance,
         * not the semantics of the button.
         * @param inconsistent The value for the {@code inconsistent} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInconsistent(boolean inconsistent) {
            names.add("inconsistent");
            values.add(org.gtk.gobject.Value.create(inconsistent));
            return this;
        }
        
        /**
         * Text of the label inside the check button, if it contains a label widget.
         * @param label The value for the {@code label} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLabel(java.lang.String label) {
            names.add("label");
            values.add(org.gtk.gobject.Value.create(label));
            return this;
        }
        
        /**
         * If set, an underline in the text indicates that the following
         * character is to be used as mnemonic.
         * @param useUnderline The value for the {@code use-underline} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUseUnderline(boolean useUnderline) {
            names.add("use-underline");
            values.add(org.gtk.gobject.Value.create(useUnderline));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_check_button_new = Interop.downcallHandle(
                "gtk_check_button_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_check_button_new_with_label = Interop.downcallHandle(
                "gtk_check_button_new_with_label",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_check_button_new_with_mnemonic = Interop.downcallHandle(
                "gtk_check_button_new_with_mnemonic",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_check_button_get_active = Interop.downcallHandle(
                "gtk_check_button_get_active",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_check_button_get_child = Interop.downcallHandle(
                "gtk_check_button_get_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_check_button_get_inconsistent = Interop.downcallHandle(
                "gtk_check_button_get_inconsistent",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_check_button_get_label = Interop.downcallHandle(
                "gtk_check_button_get_label",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_check_button_get_use_underline = Interop.downcallHandle(
                "gtk_check_button_get_use_underline",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_check_button_set_active = Interop.downcallHandle(
                "gtk_check_button_set_active",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_check_button_set_child = Interop.downcallHandle(
                "gtk_check_button_set_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_check_button_set_group = Interop.downcallHandle(
                "gtk_check_button_set_group",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_check_button_set_inconsistent = Interop.downcallHandle(
                "gtk_check_button_set_inconsistent",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_check_button_set_label = Interop.downcallHandle(
                "gtk_check_button_set_label",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_check_button_set_use_underline = Interop.downcallHandle(
                "gtk_check_button_set_use_underline",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_check_button_get_type = Interop.downcallHandle(
                "gtk_check_button_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_check_button_get_type != null;
    }
}
