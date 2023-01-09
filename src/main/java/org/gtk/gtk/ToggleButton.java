package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkToggleButton} is a button which remains “pressed-in” when
 * clicked.
 * <p>
 * Clicking again will cause the toggle button to return to its normal state.
 * <p>
 * A toggle button is created by calling either {@link ToggleButton#ToggleButton} or
 * {@link ToggleButton#newWithLabel}. If using the former, it is advisable
 * to pack a widget, (such as a {@code GtkLabel} and/or a {@code GtkImage}), into the toggle
 * button’s container. (See {@link Button} for more information).
 * <p>
 * The state of a {@code GtkToggleButton} can be set specifically using
 * {@link ToggleButton#setActive}, and retrieved using
 * {@link ToggleButton#getActive}.
 * <p>
 * To simply switch the state of a toggle button, use
 * {@link ToggleButton#toggled}.
 * <p>
 * <strong>Grouping</strong><br/>
 * Toggle buttons can be grouped together, to form mutually exclusive
 * groups - only one of the buttons can be toggled at a time, and toggling
 * another one will switch the currently toggled one off.
 * <p>
 * To add a {@code GtkToggleButton} to a group, use {@link ToggleButton#setGroup}.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkToggleButton} has a single CSS node with name button. To differentiate
 * it from a plain {@code GtkButton}, it gets the {@code .toggle} style class.
 * <p>
 * <strong>Creating two `GtkToggleButton` widgets.</strong><br/>
 * <pre>{@code c
 * static void
 * output_state (GtkToggleButton *source,
 *               gpointer         user_data)
 * {
 *   g_print ("Toggle button "%s" is active: %s",
 *            gtk_button_get_label (GTK_BUTTON (source)),
 *            gtk_toggle_button_get_active (source) ? "Yes" : "No");
 * }
 * 
 * static void
 * make_toggles (void)
 * {
 *   GtkWidget *window, *toggle1, *toggle2;
 *   GtkWidget *box;
 *   const char *text;
 * 
 *   window = gtk_window_new ();
 *   box = gtk_box_new (GTK_ORIENTATION_VERTICAL, 12);
 * 
 *   text = "Hi, I’m toggle button one";
 *   toggle1 = gtk_toggle_button_new_with_label (text);
 * 
 *   g_signal_connect (toggle1, "toggled",
 *                     G_CALLBACK (output_state),
 *                     NULL);
 *   gtk_box_append (GTK_BOX (box), toggle1);
 * 
 *   text = "Hi, I’m toggle button two";
 *   toggle2 = gtk_toggle_button_new_with_label (text);
 *   g_signal_connect (toggle2, "toggled",
 *                     G_CALLBACK (output_state),
 *                     NULL);
 *   gtk_box_append (GTK_BOX (box), toggle2);
 * 
 *   gtk_window_set_child (GTK_WINDOW (window), box);
 *   gtk_widget_show (window);
 * }
 * }</pre>
 */
public class ToggleButton extends org.gtk.gtk.Button implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkToggleButton";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Button.getMemoryLayout().withName("button")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ToggleButton proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ToggleButton(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ToggleButton> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ToggleButton(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_toggle_button_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new toggle button.
     * <p>
     * A widget should be packed into the button, as in {@link Button#Button}.
     */
    public ToggleButton() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWithLabel(java.lang.String label) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_toggle_button_new_with_label.invokeExact(Marshal.stringToAddress.marshal(label, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new toggle button with a text label.
     * @param label a string containing the message to be placed in the toggle button.
     * @return a new toggle button.
     */
    public static ToggleButton newWithLabel(java.lang.String label) {
        var RESULT = constructNewWithLabel(label);
        var OBJECT = (org.gtk.gtk.ToggleButton) Interop.register(RESULT, org.gtk.gtk.ToggleButton.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWithMnemonic(java.lang.String label) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_toggle_button_new_with_mnemonic.invokeExact(Marshal.stringToAddress.marshal(label, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new {@code GtkToggleButton} containing a label.
     * <p>
     * The label will be created using {@link Label#newWithMnemonic},
     * so underscores in {@code label} indicate the mnemonic for the button.
     * @param label the text of the button, with an underscore in front of the
     *   mnemonic character
     * @return a new {@code GtkToggleButton}
     */
    public static ToggleButton newWithMnemonic(java.lang.String label) {
        var RESULT = constructNewWithMnemonic(label);
        var OBJECT = (org.gtk.gtk.ToggleButton) Interop.register(RESULT, org.gtk.gtk.ToggleButton.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Queries a {@code GtkToggleButton} and returns its current state.
     * <p>
     * Returns {@code true} if the toggle button is pressed in and {@code false}
     * if it is raised.
     * @return whether the button is pressed
     */
    public boolean getActive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_toggle_button_get_active.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the status of the toggle button.
     * <p>
     * Set to {@code true} if you want the {@code GtkToggleButton} to be “pressed in”,
     * and {@code false} to raise it.
     * <p>
     * If the status of the button changes, this action causes the
     * {@code GtkToggleButton::toggled} signal to be emitted.
     * @param isActive {@code true} or {@code false}.
     */
    public void setActive(boolean isActive) {
        try {
            DowncallHandles.gtk_toggle_button_set_active.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(isActive, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code self} to the group of {@code group}.
     * <p>
     * In a group of multiple toggle buttons, only one button can be active
     * at a time.
     * <p>
     * Setting up groups in a cycle leads to undefined behavior.
     * <p>
     * Note that the same effect can be achieved via the {@code Gtk.Actionable}
     * API, by using the same action with parameter type and state type 's'
     * for all buttons in the group, and giving each button its own target
     * value.
     * @param group another {@code GtkToggleButton} to
     *   form a group with
     */
    public void setGroup(@Nullable org.gtk.gtk.ToggleButton group) {
        try {
            DowncallHandles.gtk_toggle_button_set_group.invokeExact(
                    handle(),
                    (Addressable) (group == null ? MemoryAddress.NULL : group.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits the ::toggled signal on the {@code GtkToggleButton}.
     * <p>
     * There is no good reason for an application ever to call this function.
     */
    public void toggled() {
        try {
            DowncallHandles.gtk_toggle_button_toggled.invokeExact(handle());
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
            RESULT = (long) DowncallHandles.gtk_toggle_button_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Toggled} callback.
     */
    @FunctionalInterface
    public interface Toggled {
    
        /**
         * Emitted whenever the {@code GtkToggleButton}'s state is changed.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceToggleButton) {
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
     * Emitted whenever the {@code GtkToggleButton}'s state is changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ToggleButton.Toggled> onToggled(ToggleButton.Toggled handler) {
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
     * A {@link ToggleButton.Builder} object constructs a {@link ToggleButton} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ToggleButton.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Button.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ToggleButton} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ToggleButton}.
         * @return A new instance of {@code ToggleButton} with the properties 
         *         that were set in the Builder object.
         */
        public ToggleButton build() {
            return (ToggleButton) org.gtk.gobject.GObject.newWithProperties(
                ToggleButton.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * If the toggle button should be pressed in.
         * @param active The value for the {@code active} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActive(boolean active) {
            names.add("active");
            values.add(org.gtk.gobject.Value.create(active));
            return this;
        }
        
        /**
         * The toggle button whose group this widget belongs to.
         * @param group The value for the {@code group} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGroup(org.gtk.gtk.ToggleButton group) {
            names.add("group");
            values.add(org.gtk.gobject.Value.create(group));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_toggle_button_new = Interop.downcallHandle(
                "gtk_toggle_button_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_toggle_button_new_with_label = Interop.downcallHandle(
                "gtk_toggle_button_new_with_label",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_toggle_button_new_with_mnemonic = Interop.downcallHandle(
                "gtk_toggle_button_new_with_mnemonic",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_toggle_button_get_active = Interop.downcallHandle(
                "gtk_toggle_button_get_active",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_toggle_button_set_active = Interop.downcallHandle(
                "gtk_toggle_button_set_active",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_toggle_button_set_group = Interop.downcallHandle(
                "gtk_toggle_button_set_group",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_toggle_button_toggled = Interop.downcallHandle(
                "gtk_toggle_button_toggled",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_toggle_button_get_type = Interop.downcallHandle(
                "gtk_toggle_button_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_toggle_button_get_type != null;
    }
}
