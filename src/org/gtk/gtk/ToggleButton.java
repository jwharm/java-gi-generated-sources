package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GtkToggleButton</code> is a button which remains &<code>#8220</code> pressed-in&<code>#8221</code>  when
 * clicked.
 * <p>
 * Clicking again will cause the toggle button to return to its normal state.
 * <p>
 * A toggle button is created by calling either {@link [ctor@Gtk.ToggleButton.new] (ref=ctor)} or
 * {@link [ctor@Gtk.ToggleButton.new_with_label] (ref=ctor)}. If using the former, it is advisable
 * to pack a widget, (such as a <code>GtkLabel</code> and/or a <code>GtkImage</code>), into the toggle
 * button&<code>#8217</code> s container. (See {@link org.gtk.gtk.Button} for more information).
 * <p>
 * The state of a <code>GtkToggleButton</code> can be set specifically using
 * {@link org.gtk.gtk.ToggleButton<code>#setActive</code> , and retrieved using
 * {@link org.gtk.gtk.ToggleButton<code>#getActive</code> .
 * <p>
 * To simply switch the state of a toggle button, use
 * {@link org.gtk.gtk.ToggleButton<code>#toggled</code> .
 * <p>
 * <h2>Grouping</h2>
 * <p>
 * Toggle buttons can be grouped together, to form mutually exclusive
 * groups - only one of the buttons can be toggled at a time, and toggling
 * another one will switch the currently toggled one off.
 * <p>
 * To add a <code>GtkToggleButton</code> to a group, use {@link org.gtk.gtk.ToggleButton<code>#setGroup</code> .
 * <p>
 * <h2>CSS nodes</h2>
 * <p><code>GtkToggleButton</code> has a single CSS node with name button. To differentiate
 * it from a plain <code>GtkButton</code>, it gets the <code>.toggle</code> style class.
 * <p>
 * <h2>Creating two <code>GtkToggleButton</code> widgets.</h2>
 * <p><pre>c
 * static void
 * output_state (GtkToggleButton *source,
 *               gpointer         user_data)
 * {
 *   g_print (&<code>#34</code> Toggle button &<code>#34</code> <code>s</code> <code>#34</code>  is active: <code>s</code> <code>#34</code> ,
 *            gtk_button_get_label (GTK_BUTTON (source)),
 *            gtk_toggle_button_get_active (source) ? &<code>#34</code> Yes&<code>#34</code>  : &<code>#34</code> No&<code>#34</code> );
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
 *   text = &<code>#34</code> Hi, I&<code>#8217</code> m toggle button one&<code>#34</code> ;
 *   toggle1 = gtk_toggle_button_new_with_label (text);
 * 
 *   g_signal_connect (toggle1, &<code>#34</code> toggled&<code>#34</code> ,
 *                     G_CALLBACK (output_state),
 *                     NULL);
 *   gtk_box_append (GTK_BOX (box), toggle1);
 * 
 *   text = &<code>#34</code> Hi, I&<code>#8217</code> m toggle button two&<code>#34</code> ;
 *   toggle2 = gtk_toggle_button_new_with_label (text);
 *   g_signal_connect (toggle2, &<code>#34</code> toggled&<code>#34</code> ,
 *                     G_CALLBACK (output_state),
 *                     NULL);
 *   gtk_box_append (GTK_BOX (box), toggle2);
 * 
 *   gtk_window_set_child (GTK_WINDOW (window), box);
 *   gtk_widget_show (window);
 * }
 * </pre>
 */
public class ToggleButton extends Button implements Accessible, Actionable, Buildable, ConstraintTarget {

    public ToggleButton(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ToggleButton */
    public static ToggleButton castFrom(org.gtk.gobject.Object gobject) {
        return new ToggleButton(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_toggle_button_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new toggle button.
     * 
     * A widget should be packed into the button, as in {@link [ctor@Gtk.Button.new] (ref=ctor)}.
     */
    public ToggleButton() {
        super(constructNew());
    }
    
    private static Reference constructNewWithLabel(java.lang.String label) {
        Reference RESULT = References.get(gtk_h.gtk_toggle_button_new_with_label(Interop.allocateNativeString(label).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new toggle button with a text label.
     */
    public static ToggleButton newWithLabel(java.lang.String label) {
        return new ToggleButton(constructNewWithLabel(label));
    }
    
    private static Reference constructNewWithMnemonic(java.lang.String label) {
        Reference RESULT = References.get(gtk_h.gtk_toggle_button_new_with_mnemonic(Interop.allocateNativeString(label).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkToggleButton</code> containing a label.
     * 
     * The label will be created using {@link [ctor@Gtk.Label.new_with_mnemonic] (ref=ctor)},
     * so underscores in @label indicate the mnemonic for the button.
     */
    public static ToggleButton newWithMnemonic(java.lang.String label) {
        return new ToggleButton(constructNewWithMnemonic(label));
    }
    
    /**
     * Queries a <code>GtkToggleButton</code> and returns its current state.
     * 
     * Returns <code>true</code> if the toggle button is pressed in and <code>false</code> if it is raised.
     */
    public boolean getActive() {
        var RESULT = gtk_h.gtk_toggle_button_get_active(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the status of the toggle button.
     * <p>
     * Set to <code>true</code> if you want the <code>GtkToggleButton</code> to be &<code>#8220</code> pressed in&<code>#8221</code> ,
     * and <code>false</code> to raise it.
     * 
     * If the status of the button changes, this action causes the
     * {@link [signal@GtkToggleButton::toggled] (ref=signal)} signal to be emitted.
     */
    public void setActive(boolean isActive) {
        gtk_h.gtk_toggle_button_set_active(handle(), isActive ? 1 : 0);
    }
    
    /**
     * Adds @self to the group of @group.
     * 
     * In a group of multiple toggle buttons, only one button can be active
     * at a time.
     * 
     * Setting up groups in a cycle leads to undefined behavior.
     * 
     * Note that the same effect can be achieved via the {@link [iface@Gtk.Actionable] (ref=iface)}
     * API, by using the same action with parameter type and state type &<code>#39</code> s&<code>#39</code> 
     * for all buttons in the group, and giving each button its own target
     * value.
     */
    public void setGroup(ToggleButton group) {
        gtk_h.gtk_toggle_button_set_group(handle(), group.handle());
    }
    
    /**
     * Emits the ::toggled signal on the <code>GtkToggleButton</code>.
     * 
     * There is no good reason for an application ever to call this function.
     */
    public void toggled() {
        gtk_h.gtk_toggle_button_toggled(handle());
    }
    
    @FunctionalInterface
    public interface ToggledHandler {
        void signalReceived(ToggleButton source);
    }
    
    /**
     * Emitted whenever the <code>GtkToggleButton</code>&<code>#39</code> s state is changed.
     */
    public SignalHandle onToggled(ToggledHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalToggleButtonToggled", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("toggled").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
