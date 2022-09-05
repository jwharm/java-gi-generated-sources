package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkToggleButton` is a button which remains “pressed-in” when
 * clicked.
 * 
 * Clicking again will cause the toggle button to return to its normal state.
 * 
 * A toggle button is created by calling either [ctor@Gtk.ToggleButton.new] or
 * [ctor@Gtk.ToggleButton.new_with_label]. If using the former, it is advisable
 * to pack a widget, (such as a `GtkLabel` and/or a `GtkImage`), into the toggle
 * button’s container. (See [class@Gtk.Button] for more information).
 * 
 * The state of a `GtkToggleButton` can be set specifically using
 * [method@Gtk.ToggleButton.set_active], and retrieved using
 * [method@Gtk.ToggleButton.get_active].
 * 
 * To simply switch the state of a toggle button, use
 * [method@Gtk.ToggleButton.toggled].
 * 
 * ## Grouping
 * 
 * Toggle buttons can be grouped together, to form mutually exclusive
 * groups - only one of the buttons can be toggled at a time, and toggling
 * another one will switch the currently toggled one off.
 * 
 * To add a `GtkToggleButton` to a group, use [method@Gtk.ToggleButton.set_group].
 * 
 * ## CSS nodes
 * 
 * `GtkToggleButton` has a single CSS node with name button. To differentiate
 * it from a plain `GtkButton`, it gets the `.toggle` style class.
 * 
 * ## Creating two `GtkToggleButton` widgets.
 * 
 * ```c
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
 * ```
 */
public class ToggleButton extends Button implements Accessible, Actionable, Buildable, ConstraintTarget {

    public ToggleButton(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ToggleButton */
    public static ToggleButton castFrom(org.gtk.gobject.Object gobject) {
        return new ToggleButton(gobject.getProxy());
    }
    
    /**
     * Creates a new toggle button.
     * 
     * A widget should be packed into the button, as in [ctor@Gtk.Button.new].
     */
    public ToggleButton() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_toggle_button_new(), false));
    }
    
    /**
     * Creates a new toggle button with a text label.
     */
    public static ToggleButton newWithLabel(java.lang.String label) {
        return new ToggleButton(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_toggle_button_new_with_label(Interop.getAllocator().allocateUtf8String(label)), false));
    }
    
    /**
     * Creates a new `GtkToggleButton` containing a label.
     * 
     * The label will be created using [ctor@Gtk.Label.new_with_mnemonic],
     * so underscores in @label indicate the mnemonic for the button.
     */
    public static ToggleButton newWithMnemonic(java.lang.String label) {
        return new ToggleButton(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_toggle_button_new_with_mnemonic(Interop.getAllocator().allocateUtf8String(label)), false));
    }
    
    /**
     * Queries a `GtkToggleButton` and returns its current state.
     * 
     * Returns %TRUE if the toggle button is pressed in and %FALSE
     * if it is raised.
     */
    public boolean getActive() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_toggle_button_get_active(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets the status of the toggle button.
     * 
     * Set to %TRUE if you want the `GtkToggleButton` to be “pressed in”,
     * and %FALSE to raise it.
     * 
     * If the status of the button changes, this action causes the
     * [signal@GtkToggleButton::toggled] signal to be emitted.
     */
    public void setActive(boolean isActive) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_toggle_button_set_active(HANDLE(), isActive ? 1 : 0);
    }
    
    /**
     * Adds @self to the group of @group.
     * 
     * In a group of multiple toggle buttons, only one button can be active
     * at a time.
     * 
     * Setting up groups in a cycle leads to undefined behavior.
     * 
     * Note that the same effect can be achieved via the [iface@Gtk.Actionable]
     * API, by using the same action with parameter type and state type 's'
     * for all buttons in the group, and giving each button its own target
     * value.
     */
    public void setGroup(ToggleButton group) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_toggle_button_set_group(HANDLE(), group.HANDLE());
    }
    
    /**
     * Emits the ::toggled signal on the `GtkToggleButton`.
     * 
     * There is no good reason for an application ever to call this function.
     */
    public void toggled() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_toggle_button_toggled(HANDLE());
    }
    
    @FunctionalInterface
    public interface ToggledHandler {
        void signalReceived(ToggleButton source);
    }
    
    /**
     * Emitted whenever the `GtkToggleButton`'s state is changed.
     */
    public void onToggled(ToggledHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalToggleButtonToggled", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("toggled"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
