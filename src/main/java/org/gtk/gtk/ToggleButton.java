package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <h2>Grouping</h2>
 * <p>
 * Toggle buttons can be grouped together, to form mutually exclusive
 * groups - only one of the buttons can be toggled at a time, and toggling
 * another one will switch the currently toggled one off.
 * <p>
 * To add a {@code GtkToggleButton} to a group, use {@link ToggleButton#setGroup}.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code GtkToggleButton} has a single CSS node with name button. To differentiate
 * it from a plain {@code GtkButton}, it gets the {@code .toggle} style class.
 * <p>
 * <h2>Creating two `GtkToggleButton` widgets.</h2>
 * <p>
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
public class ToggleButton extends Button implements Accessible, Actionable, Buildable, ConstraintTarget {

    public ToggleButton(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ToggleButton */
    public static ToggleButton castFrom(org.gtk.gobject.Object gobject) {
        return new ToggleButton(gobject.refcounted());
    }
    
    static final MethodHandle gtk_toggle_button_new = Interop.downcallHandle(
        "gtk_toggle_button_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_toggle_button_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new toggle button.
     * <p>
     * A widget should be packed into the button, as in {@link Button#Button}.
     */
    public ToggleButton() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_toggle_button_new_with_label = Interop.downcallHandle(
        "gtk_toggle_button_new_with_label",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithLabel(java.lang.String label) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_toggle_button_new_with_label.invokeExact(Interop.allocateNativeString(label).handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new toggle button with a text label.
     */
    public static ToggleButton newWithLabel(java.lang.String label) {
        return new ToggleButton(constructNewWithLabel(label));
    }
    
    static final MethodHandle gtk_toggle_button_new_with_mnemonic = Interop.downcallHandle(
        "gtk_toggle_button_new_with_mnemonic",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithMnemonic(java.lang.String label) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_toggle_button_new_with_mnemonic.invokeExact(Interop.allocateNativeString(label).handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkToggleButton} containing a label.
     * <p>
     * The label will be created using {@link Label#newWithMnemonic},
     * so underscores in {@code label} indicate the mnemonic for the button.
     */
    public static ToggleButton newWithMnemonic(java.lang.String label) {
        return new ToggleButton(constructNewWithMnemonic(label));
    }
    
    static final MethodHandle gtk_toggle_button_get_active = Interop.downcallHandle(
        "gtk_toggle_button_get_active",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries a {@code GtkToggleButton} and returns its current state.
     * <p>
     * Returns {@code true} if the toggle button is pressed in and {@code false}
     * if it is raised.
     */
    public boolean getActive() {
        try {
            var RESULT = (int) gtk_toggle_button_get_active.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_toggle_button_set_active = Interop.downcallHandle(
        "gtk_toggle_button_set_active",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the status of the toggle button.
     * <p>
     * Set to {@code true} if you want the {@code GtkToggleButton} to be “pressed in”,
     * and {@code false} to raise it.
     * <p>
     * If the status of the button changes, this action causes the
     * {@code GtkToggleButton::toggled} signal to be emitted.
     */
    public void setActive(boolean isActive) {
        try {
            gtk_toggle_button_set_active.invokeExact(handle(), isActive ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_toggle_button_set_group = Interop.downcallHandle(
        "gtk_toggle_button_set_group",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void setGroup(ToggleButton group) {
        try {
            gtk_toggle_button_set_group.invokeExact(handle(), group.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_toggle_button_toggled = Interop.downcallHandle(
        "gtk_toggle_button_toggled",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Emits the ::toggled signal on the {@code GtkToggleButton}.
     * <p>
     * There is no good reason for an application ever to call this function.
     */
    public void toggled() {
        try {
            gtk_toggle_button_toggled.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToggledHandler {
        void signalReceived(ToggleButton source);
    }
    
    /**
     * Emitted whenever the {@code GtkToggleButton}'s state is changed.
     */
    public SignalHandle onToggled(ToggledHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("toggled").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ToggleButton.Callbacks.class, "signalToggleButtonToggled",
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
    
        public static void signalToggleButtonToggled(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ToggleButton.ToggledHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ToggleButton(Refcounted.get(source)));
        }
        
    }
}
