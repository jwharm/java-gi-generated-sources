package org.gtk.gtk;

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

    public SpinButton(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SpinButton */
    public static SpinButton castFrom(org.gtk.gobject.Object gobject) {
        return new SpinButton(gobject.refcounted());
    }
    
    static final MethodHandle gtk_spin_button_new = Interop.downcallHandle(
        "gtk_spin_button_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(Adjustment adjustment, double climbRate, int digits) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_spin_button_new.invokeExact(adjustment.handle(), climbRate, digits), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkSpinButton}.
     */
    public SpinButton(Adjustment adjustment, double climbRate, int digits) {
        super(constructNew(adjustment, climbRate, digits));
    }
    
    static final MethodHandle gtk_spin_button_new_with_range = Interop.downcallHandle(
        "gtk_spin_button_new_with_range",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    private static Refcounted constructNewWithRange(double min, double max, double step) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_spin_button_new_with_range.invokeExact(min, max, step), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    
    static final MethodHandle gtk_spin_button_configure = Interop.downcallHandle(
        "gtk_spin_button_configure",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Changes the properties of an existing spin button.
     * <p>
     * The adjustment, climb rate, and number of decimal places
     * are updated accordingly.
     */
    public void configure(Adjustment adjustment, double climbRate, int digits) {
        try {
            gtk_spin_button_configure.invokeExact(handle(), adjustment.handle(), climbRate, digits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_get_adjustment = Interop.downcallHandle(
        "gtk_spin_button_get_adjustment",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the adjustment associated with a {@code GtkSpinButton}.
     */
    public Adjustment getAdjustment() {
        try {
            var RESULT = (MemoryAddress) gtk_spin_button_get_adjustment.invokeExact(handle());
            return new Adjustment(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_get_climb_rate = Interop.downcallHandle(
        "gtk_spin_button_get_climb_rate",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the acceleration rate for repeated changes.
     */
    public double getClimbRate() {
        try {
            var RESULT = (double) gtk_spin_button_get_climb_rate.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_get_digits = Interop.downcallHandle(
        "gtk_spin_button_get_digits",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the precision of {@code spin_button}.
     */
    public int getDigits() {
        try {
            var RESULT = (int) gtk_spin_button_get_digits.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_get_increments = Interop.downcallHandle(
        "gtk_spin_button_get_increments",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current step and page the increments
     * used by {@code spin_button}.
     * <p>
     * See {@link SpinButton#setIncrements}.
     */
    public void getIncrements(PointerDouble step, PointerDouble page) {
        try {
            gtk_spin_button_get_increments.invokeExact(handle(), step.handle(), page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_get_numeric = Interop.downcallHandle(
        "gtk_spin_button_get_numeric",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether non-numeric text can be typed into the spin button.
     */
    public boolean getNumeric() {
        try {
            var RESULT = (int) gtk_spin_button_get_numeric.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_get_range = Interop.downcallHandle(
        "gtk_spin_button_get_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the range allowed for {@code spin_button}.
     * <p>
     * See {@link SpinButton#setRange}.
     */
    public void getRange(PointerDouble min, PointerDouble max) {
        try {
            gtk_spin_button_get_range.invokeExact(handle(), min.handle(), max.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_get_snap_to_ticks = Interop.downcallHandle(
        "gtk_spin_button_get_snap_to_ticks",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the values are corrected to the nearest step.
     */
    public boolean getSnapToTicks() {
        try {
            var RESULT = (int) gtk_spin_button_get_snap_to_ticks.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_get_update_policy = Interop.downcallHandle(
        "gtk_spin_button_get_update_policy",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the update behavior of a spin button.
     * <p>
     * See {@link SpinButton#setUpdatePolicy}.
     */
    public SpinButtonUpdatePolicy getUpdatePolicy() {
        try {
            var RESULT = (int) gtk_spin_button_get_update_policy.invokeExact(handle());
            return new SpinButtonUpdatePolicy(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_get_value = Interop.downcallHandle(
        "gtk_spin_button_get_value",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the value in the {@code spin_button}.
     */
    public double getValue() {
        try {
            var RESULT = (double) gtk_spin_button_get_value.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_get_value_as_int = Interop.downcallHandle(
        "gtk_spin_button_get_value_as_int",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the value {@code spin_button} represented as an integer.
     */
    public int getValueAsInt() {
        try {
            var RESULT = (int) gtk_spin_button_get_value_as_int.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_get_wrap = Interop.downcallHandle(
        "gtk_spin_button_get_wrap",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the spin button’s value wraps around to the
     * opposite limit when the upper or lower limit of the range is
     * exceeded.
     */
    public boolean getWrap() {
        try {
            var RESULT = (int) gtk_spin_button_get_wrap.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_set_adjustment = Interop.downcallHandle(
        "gtk_spin_button_set_adjustment",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Replaces the {@code GtkAdjustment} associated with {@code spin_button}.
     */
    public void setAdjustment(Adjustment adjustment) {
        try {
            gtk_spin_button_set_adjustment.invokeExact(handle(), adjustment.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_set_climb_rate = Interop.downcallHandle(
        "gtk_spin_button_set_climb_rate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the acceleration rate for repeated changes when you
     * hold down a button or key.
     */
    public void setClimbRate(double climbRate) {
        try {
            gtk_spin_button_set_climb_rate.invokeExact(handle(), climbRate);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_set_digits = Interop.downcallHandle(
        "gtk_spin_button_set_digits",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Set the precision to be displayed by {@code spin_button}.
     * <p>
     * Up to 20 digit precision is allowed.
     */
    public void setDigits(int digits) {
        try {
            gtk_spin_button_set_digits.invokeExact(handle(), digits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_set_increments = Interop.downcallHandle(
        "gtk_spin_button_set_increments",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the step and page increments for spin_button.
     * <p>
     * This affects how quickly the value changes when
     * the spin button’s arrows are activated.
     */
    public void setIncrements(double step, double page) {
        try {
            gtk_spin_button_set_increments.invokeExact(handle(), step, page);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_set_numeric = Interop.downcallHandle(
        "gtk_spin_button_set_numeric",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the flag that determines if non-numeric text can be typed
     * into the spin button.
     */
    public void setNumeric(boolean numeric) {
        try {
            gtk_spin_button_set_numeric.invokeExact(handle(), numeric ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_set_range = Interop.downcallHandle(
        "gtk_spin_button_set_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the minimum and maximum allowable values for {@code spin_button}.
     * <p>
     * If the current value is outside this range, it will be adjusted
     * to fit within the range, otherwise it will remain unchanged.
     */
    public void setRange(double min, double max) {
        try {
            gtk_spin_button_set_range.invokeExact(handle(), min, max);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_set_snap_to_ticks = Interop.downcallHandle(
        "gtk_spin_button_set_snap_to_ticks",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the policy as to whether values are corrected to the
     * nearest step increment when a spin button is activated after
     * providing an invalid value.
     */
    public void setSnapToTicks(boolean snapToTicks) {
        try {
            gtk_spin_button_set_snap_to_ticks.invokeExact(handle(), snapToTicks ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_set_update_policy = Interop.downcallHandle(
        "gtk_spin_button_set_update_policy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the update behavior of a spin button.
     * <p>
     * This determines whether the spin button is always
     * updated or only when a valid value is set.
     */
    public void setUpdatePolicy(SpinButtonUpdatePolicy policy) {
        try {
            gtk_spin_button_set_update_policy.invokeExact(handle(), policy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_set_value = Interop.downcallHandle(
        "gtk_spin_button_set_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the value of {@code spin_button}.
     */
    public void setValue(double value) {
        try {
            gtk_spin_button_set_value.invokeExact(handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_set_wrap = Interop.downcallHandle(
        "gtk_spin_button_set_wrap",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the flag that determines if a spin button value wraps
     * around to the opposite limit when the upper or lower limit
     * of the range is exceeded.
     */
    public void setWrap(boolean wrap) {
        try {
            gtk_spin_button_set_wrap.invokeExact(handle(), wrap ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_spin = Interop.downcallHandle(
        "gtk_spin_button_spin",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Increment or decrement a spin button’s value in a specified
     * direction by a specified amount.
     */
    public void spin(SpinType direction, double increment) {
        try {
            gtk_spin_button_spin.invokeExact(handle(), direction.getValue(), increment);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_spin_button_update = Interop.downcallHandle(
        "gtk_spin_button_update",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Manually force an update of the spin button.
     */
    public void update() {
        try {
            gtk_spin_button_update.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("change-value").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SpinButton.Callbacks.class, "signalSpinButtonChangeValue",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("input").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SpinButton.Callbacks.class, "signalSpinButtonInput",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("output").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SpinButton.Callbacks.class, "signalSpinButtonOutput",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("value-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SpinButton.Callbacks.class, "signalSpinButtonValueChanged",
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("wrapped").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SpinButton.Callbacks.class, "signalSpinButtonWrapped",
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
    
        public static void signalSpinButtonChangeValue(MemoryAddress source, int scroll, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SpinButton.ChangeValueHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SpinButton(Refcounted.get(source)), new ScrollType(scroll));
        }
        
        public static void signalSpinButtonInput(MemoryAddress source, double newValue, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SpinButton.InputHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SpinButton(Refcounted.get(source)), newValue);
        }
        
        public static boolean signalSpinButtonOutput(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SpinButton.OutputHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new SpinButton(Refcounted.get(source)));
        }
        
        public static void signalSpinButtonValueChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SpinButton.ValueChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SpinButton(Refcounted.get(source)));
        }
        
        public static void signalSpinButtonWrapped(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SpinButton.WrappedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SpinButton(Refcounted.get(source)));
        }
        
    }
}