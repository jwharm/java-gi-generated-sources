package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkSpinButton} is an ideal way to allow the user to set the
 * value of some attribute.
 * <p>
 * <img src="./doc-files/spinbutton.png" alt="An example GtkSpinButton">
 * <p>
 * Rather than having to directly type a number into a {@code GtkEntry},
 * {@code GtkSpinButton} allows the user to click on one of two arrows
 * to increment or decrement the displayed value. A value can still be
 * typed in, with the bonus that it can be checked to ensure it is in a
 * given range.
 * <p>
 * The main properties of a {@code GtkSpinButton} are through an adjustment.
 * See the {@link Adjustment} documentation for more details about
 * an adjustment's properties.
 * <p>
 * Note that {@code GtkSpinButton} will by default make its entry large enough
 * to accommodate the lower and upper bounds of the adjustment. If this
 * is not desired, the automatic sizing can be turned off by explicitly
 * setting {@code Gtk.Editable:width-chars} to a value != -1.
 * <p>
 * <h2>Using a GtkSpinButton to get an integer</h2>
 * <p>
 * <pre>{@code c
 * // Provides a function to retrieve an integer value from a GtkSpinButton
 * // and creates a spin button to model percentage values.
 * 
 * int
 * grab_int_value (GtkSpinButton *button,
 *                 gpointer       user_data)
 * {
 *   return gtk_spin_button_get_value_as_int (button);
 * }
 * 
 * void
 * create_integer_spin_button (void)
 * {
 * 
 *   GtkWidget *window, *button;
 *   GtkAdjustment *adjustment;
 * 
 *   adjustment = gtk_adjustment_new (50.0, 0.0, 100.0, 1.0, 5.0, 0.0);
 * 
 *   window = gtk_window_new ();
 * 
 *   // creates the spinbutton, with no decimal places
 *   button = gtk_spin_button_new (adjustment, 1.0, 0);
 *   gtk_window_set_child (GTK_WINDOW (window), button);
 * 
 *   gtk_widget_show (window);
 * }
 * }</pre>
 * <p>
 * <h2>Using a GtkSpinButton to get a floating point value</h2>
 * <p>
 * <pre>{@code c
 * // Provides a function to retrieve a floating point value from a
 * // GtkSpinButton, and creates a high precision spin button.
 * 
 * float
 * grab_float_value (GtkSpinButton *button,
 *                   gpointer       user_data)
 * {
 *   return gtk_spin_button_get_value (button);
 * }
 * 
 * void
 * create_floating_spin_button (void)
 * {
 *   GtkWidget *window, *button;
 *   GtkAdjustment *adjustment;
 * 
 *   adjustment = gtk_adjustment_new (2.500, 0.0, 5.0, 0.001, 0.1, 0.0);
 * 
 *   window = gtk_window_new ();
 * 
 *   // creates the spinbutton, with three decimal places
 *   button = gtk_spin_button_new (adjustment, 0.001, 3);
 *   gtk_window_set_child (GTK_WINDOW (window), button);
 * 
 *   gtk_widget_show (window);
 * }
 * }</pre>
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * spinbutton.horizontal
 * ├── text
 * │    ├── undershoot.left
 * │    ╰── undershoot.right
 * ├── button.down
 * ╰── button.up
 * }</pre>
 * <p>
 * <pre>{@code 
 * spinbutton.vertical
 * ├── button.up
 * ├── text
 * │    ├── undershoot.left
 * │    ╰── undershoot.right
 * ╰── button.down
 * }</pre>
 * <p>
 * {@code GtkSpinButton}s main CSS node has the name spinbutton. It creates subnodes
 * for the entry and the two buttons, with these names. The button nodes have
 * the style classes .up and .down. The {@code GtkText} subnodes (if present) are put
 * below the text node. The orientation of the spin button is reflected in
 * the .vertical or .horizontal style class on the main node.
 * <p>
 * <h1>Accessiblity</h1>
 * <p>
 * {@code GtkSpinButton} uses the {@link AccessibleRole#SPIN_BUTTON} role.
 */
public class SpinButton extends Widget implements Accessible, Buildable, CellEditable, ConstraintTarget, Editable, Orientable {

    public SpinButton(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SpinButton */
    public static SpinButton castFrom(org.gtk.gobject.Object gobject) {
        return new SpinButton(gobject.getReference());
    }
    
    private static Reference constructNew(Adjustment adjustment, double climbRate, int digits) {
        Reference RESULT = References.get(gtk_h.gtk_spin_button_new(adjustment.handle(), climbRate, digits), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkSpinButton}.
     */
    public SpinButton(Adjustment adjustment, double climbRate, int digits) {
        super(constructNew(adjustment, climbRate, digits));
    }
    
    private static Reference constructNewWithRange(double min, double max, double step) {
        Reference RESULT = References.get(gtk_h.gtk_spin_button_new_with_range(min, max, step), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkSpinButton} with the given properties.
     * <p>
     * This is a convenience constructor that allows creation
     * of a numeric {@code GtkSpinButton} without manually creating
     * an adjustment. The value is initially set to the minimum
     * value and a page increment of 10 * {@code step} is the default.
     * The precision of the spin button is equivalent to the
     * precision of {@code step}.
     * <p>
     * Note that the way in which the precision is derived works
     * best if {@code step} is a power of ten. If the resulting precision
     * is not suitable for your needs, use
     * {@link SpinButton#setDigits} to correct it.
     */
    public static SpinButton newWithRange(double min, double max, double step) {
        return new SpinButton(constructNewWithRange(min, max, step));
    }
    
    /**
     * Changes the properties of an existing spin button.
     * <p>
     * The adjustment, climb rate, and number of decimal places
     * are updated accordingly.
     */
    public void configure(Adjustment adjustment, double climbRate, int digits) {
        gtk_h.gtk_spin_button_configure(handle(), adjustment.handle(), climbRate, digits);
    }
    
    /**
     * Get the adjustment associated with a {@code GtkSpinButton}.
     */
    public Adjustment getAdjustment() {
        var RESULT = gtk_h.gtk_spin_button_get_adjustment(handle());
        return new Adjustment(References.get(RESULT, false));
    }
    
    /**
     * Returns the acceleration rate for repeated changes.
     */
    public double getClimbRate() {
        var RESULT = gtk_h.gtk_spin_button_get_climb_rate(handle());
        return RESULT;
    }
    
    /**
     * Fetches the precision of {@code spin_button}.
     */
    public int getDigits() {
        var RESULT = gtk_h.gtk_spin_button_get_digits(handle());
        return RESULT;
    }
    
    /**
     * Gets the current step and page the increments
     * used by {@code spin_button}.
     * <p>
     * See {@link SpinButton#setIncrements}.
     */
    public void getIncrements(PointerDouble step, PointerDouble page) {
        gtk_h.gtk_spin_button_get_increments(handle(), step.handle(), page.handle());
    }
    
    /**
     * Returns whether non-numeric text can be typed into the spin button.
     */
    public boolean getNumeric() {
        var RESULT = gtk_h.gtk_spin_button_get_numeric(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the range allowed for {@code spin_button}.
     * <p>
     * See {@link SpinButton#setRange}.
     */
    public void getRange(PointerDouble min, PointerDouble max) {
        gtk_h.gtk_spin_button_get_range(handle(), min.handle(), max.handle());
    }
    
    /**
     * Returns whether the values are corrected to the nearest step.
     */
    public boolean getSnapToTicks() {
        var RESULT = gtk_h.gtk_spin_button_get_snap_to_ticks(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the update behavior of a spin button.
     * <p>
     * See {@link SpinButton#setUpdatePolicy}.
     */
    public SpinButtonUpdatePolicy getUpdatePolicy() {
        var RESULT = gtk_h.gtk_spin_button_get_update_policy(handle());
        return SpinButtonUpdatePolicy.fromValue(RESULT);
    }
    
    /**
     * Get the value in the {@code spin_button}.
     */
    public double getValue() {
        var RESULT = gtk_h.gtk_spin_button_get_value(handle());
        return RESULT;
    }
    
    /**
     * Get the value {@code spin_button} represented as an integer.
     */
    public int getValueAsInt() {
        var RESULT = gtk_h.gtk_spin_button_get_value_as_int(handle());
        return RESULT;
    }
    
    /**
     * Returns whether the spin button’s value wraps around to the
     * opposite limit when the upper or lower limit of the range is
     * exceeded.
     */
    public boolean getWrap() {
        var RESULT = gtk_h.gtk_spin_button_get_wrap(handle());
        return (RESULT != 0);
    }
    
    /**
     * Replaces the {@code GtkAdjustment} associated with {@code spin_button}.
     */
    public void setAdjustment(Adjustment adjustment) {
        gtk_h.gtk_spin_button_set_adjustment(handle(), adjustment.handle());
    }
    
    /**
     * Sets the acceleration rate for repeated changes when you
     * hold down a button or key.
     */
    public void setClimbRate(double climbRate) {
        gtk_h.gtk_spin_button_set_climb_rate(handle(), climbRate);
    }
    
    /**
     * Set the precision to be displayed by {@code spin_button}.
     * <p>
     * Up to 20 digit precision is allowed.
     */
    public void setDigits(int digits) {
        gtk_h.gtk_spin_button_set_digits(handle(), digits);
    }
    
    /**
     * Sets the step and page increments for spin_button.
     * <p>
     * This affects how quickly the value changes when
     * the spin button’s arrows are activated.
     */
    public void setIncrements(double step, double page) {
        gtk_h.gtk_spin_button_set_increments(handle(), step, page);
    }
    
    /**
     * Sets the flag that determines if non-numeric text can be typed
     * into the spin button.
     */
    public void setNumeric(boolean numeric) {
        gtk_h.gtk_spin_button_set_numeric(handle(), numeric ? 1 : 0);
    }
    
    /**
     * Sets the minimum and maximum allowable values for {@code spin_button}.
     * <p>
     * If the current value is outside this range, it will be adjusted
     * to fit within the range, otherwise it will remain unchanged.
     */
    public void setRange(double min, double max) {
        gtk_h.gtk_spin_button_set_range(handle(), min, max);
    }
    
    /**
     * Sets the policy as to whether values are corrected to the
     * nearest step increment when a spin button is activated after
     * providing an invalid value.
     */
    public void setSnapToTicks(boolean snapToTicks) {
        gtk_h.gtk_spin_button_set_snap_to_ticks(handle(), snapToTicks ? 1 : 0);
    }
    
    /**
     * Sets the update behavior of a spin button.
     * <p>
     * This determines whether the spin button is always
     * updated or only when a valid value is set.
     */
    public void setUpdatePolicy(SpinButtonUpdatePolicy policy) {
        gtk_h.gtk_spin_button_set_update_policy(handle(), policy.getValue());
    }
    
    /**
     * Sets the value of {@code spin_button}.
     */
    public void setValue(double value) {
        gtk_h.gtk_spin_button_set_value(handle(), value);
    }
    
    /**
     * Sets the flag that determines if a spin button value wraps
     * around to the opposite limit when the upper or lower limit
     * of the range is exceeded.
     */
    public void setWrap(boolean wrap) {
        gtk_h.gtk_spin_button_set_wrap(handle(), wrap ? 1 : 0);
    }
    
    /**
     * Increment or decrement a spin button’s value in a specified
     * direction by a specified amount.
     */
    public void spin(SpinType direction, double increment) {
        gtk_h.gtk_spin_button_spin(handle(), direction.getValue(), increment);
    }
    
    /**
     * Manually force an update of the spin button.
     */
    public void update() {
        gtk_h.gtk_spin_button_update(handle());
    }
    
    @FunctionalInterface
    public interface ChangeValueHandler {
        void signalReceived(SpinButton source, ScrollType scroll);
    }
    
    /**
     * Emitted when the user initiates a value change.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control the cursor
     * programmatically.
     * <p>
     * The default bindings for this signal are Up/Down and PageUp/PageDown.
     */
    public SignalHandle onChangeValue(ChangeValueHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("change-value").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SpinButton.class, "__signalSpinButtonChangeValue",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalSpinButtonChangeValue(MemoryAddress source, int scroll, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SpinButton.ChangeValueHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SpinButton(References.get(source)), ScrollType.fromValue(scroll));
    }
    
    @FunctionalInterface
    public interface InputHandler {
        void signalReceived(SpinButton source, double newValue);
    }
    
    /**
     * Emitted to convert the users input into a double value.
     * <p>
     * The signal handler is expected to use {@link Editable#getText}
     * to retrieve the text of the spinbutton and set {@code new_value} to the
     * new value.
     * <p>
     * The default conversion uses g_strtod().
     */
    public SignalHandle onInput(InputHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("input").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SpinButton.class, "__signalSpinButtonInput",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalSpinButtonInput(MemoryAddress source, double newValue, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SpinButton.InputHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SpinButton(References.get(source)), newValue);
    }
    
    @FunctionalInterface
    public interface OutputHandler {
        boolean signalReceived(SpinButton source);
    }
    
    /**
     * Emitted to tweak the formatting of the value for display.
     * <p>
     * <pre>{@code c
     * // show leading zeros
     * static gboolean
     * on_output (GtkSpinButton *spin,
     *            gpointer       data)
     * {
     *    GtkAdjustment *adjustment;
     *    char *text;
     *    int value;
     * 
     *    adjustment = gtk_spin_button_get_adjustment (spin);
     *    value = (int)gtk_adjustment_get_value (adjustment);
     *    text = g_strdup_printf ("%02d", value);
     *    gtk_spin_button_set_text (spin, text):
     *    g_free (text);
     * 
     *    return TRUE;
     * }
     * }</pre>
     */
    public SignalHandle onOutput(OutputHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("output").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SpinButton.class, "__signalSpinButtonOutput",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static boolean __signalSpinButtonOutput(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SpinButton.OutputHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new SpinButton(References.get(source)));
    }
    
    @FunctionalInterface
    public interface ValueChangedHandler {
        void signalReceived(SpinButton source);
    }
    
    /**
     * Emitted when the value is changed.
     * <p>
     * Also see the {@code Gtk.SpinButton::output} signal.
     */
    public SignalHandle onValueChanged(ValueChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("value-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SpinButton.class, "__signalSpinButtonValueChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalSpinButtonValueChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SpinButton.ValueChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SpinButton(References.get(source)));
    }
    
    @FunctionalInterface
    public interface WrappedHandler {
        void signalReceived(SpinButton source);
    }
    
    /**
     * Emitted right after the spinbutton wraps from its maximum
     * to its minimum value or vice-versa.
     */
    public SignalHandle onWrapped(WrappedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("wrapped").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SpinButton.class, "__signalSpinButtonWrapped",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalSpinButtonWrapped(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SpinButton.WrappedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SpinButton(References.get(source)));
    }
    
}
