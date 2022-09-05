package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkSpinButton` is an ideal way to allow the user to set the
 * value of some attribute.
 * 
 * ![An example GtkSpinButton](spinbutton.png)
 * 
 * Rather than having to directly type a number into a `GtkEntry`,
 * `GtkSpinButton` allows the user to click on one of two arrows
 * to increment or decrement the displayed value. A value can still be
 * typed in, with the bonus that it can be checked to ensure it is in a
 * given range.
 * 
 * The main properties of a `GtkSpinButton` are through an adjustment.
 * See the [class@Gtk.Adjustment] documentation for more details about
 * an adjustment's properties.
 * 
 * Note that `GtkSpinButton` will by default make its entry large enough
 * to accommodate the lower and upper bounds of the adjustment. If this
 * is not desired, the automatic sizing can be turned off by explicitly
 * setting [property@Gtk.Editable:width-chars] to a value != -1.
 * 
 * ## Using a GtkSpinButton to get an integer
 * 
 * ```c
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
 * ```
 * 
 * ## Using a GtkSpinButton to get a floating point value
 * 
 * ```c
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
 * ```
 * 
 * # CSS nodes
 * 
 * ```
 * spinbutton.horizontal
 * ├── text
 * │    ├── undershoot.left
 * │    ╰── undershoot.right
 * ├── button.down
 * ╰── button.up
 * ```
 * 
 * ```
 * spinbutton.vertical
 * ├── button.up
 * ├── text
 * │    ├── undershoot.left
 * │    ╰── undershoot.right
 * ╰── button.down
 * ```
 * 
 * `GtkSpinButton`s main CSS node has the name spinbutton. It creates subnodes
 * for the entry and the two buttons, with these names. The button nodes have
 * the style classes .up and .down. The `GtkText` subnodes (if present) are put
 * below the text node. The orientation of the spin button is reflected in
 * the .vertical or .horizontal style class on the main node.
 * 
 * # Accessiblity
 * 
 * `GtkSpinButton` uses the %GTK_ACCESSIBLE_ROLE_SPIN_BUTTON role.
 */
public class SpinButton extends Widget implements Accessible, Buildable, CellEditable, ConstraintTarget, Editable, Orientable {

    public SpinButton(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to SpinButton */
    public static SpinButton castFrom(org.gtk.gobject.Object gobject) {
        return new SpinButton(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkSpinButton`.
     */
    public SpinButton(Adjustment adjustment, double climbRate, int digits) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_new(adjustment.HANDLE(), climbRate, digits), false));
    }
    
    /**
     * Creates a new `GtkSpinButton` with the given properties.
     * 
     * This is a convenience constructor that allows creation
     * of a numeric `GtkSpinButton` without manually creating
     * an adjustment. The value is initially set to the minimum
     * value and a page increment of 10 * @step is the default.
     * The precision of the spin button is equivalent to the
     * precision of @step.
     * 
     * Note that the way in which the precision is derived works
     * best if @step is a power of ten. If the resulting precision
     * is not suitable for your needs, use
     * [method@Gtk.SpinButton.set_digits] to correct it.
     */
    public SpinButton(double min, double max, double step) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_new_with_range(min, max, step), false));
    }
    
    /**
     * Changes the properties of an existing spin button.
     * 
     * The adjustment, climb rate, and number of decimal places
     * are updated accordingly.
     */
    public void configure(Adjustment adjustment, double climbRate, int digits) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_configure(HANDLE(), adjustment.HANDLE(), climbRate, digits);
    }
    
    /**
     * Get the adjustment associated with a `GtkSpinButton`.
     */
    public Adjustment getAdjustment() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_get_adjustment(HANDLE());
        return new Adjustment(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns the acceleration rate for repeated changes.
     */
    public double getClimbRate() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_get_climb_rate(HANDLE());
        return RESULT;
    }
    
    /**
     * Fetches the precision of @spin_button.
     */
    public int getDigits() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_get_digits(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns whether non-numeric text can be typed into the spin button.
     */
    public boolean getNumeric() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_get_numeric(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the values are corrected to the nearest step.
     */
    public boolean getSnapToTicks() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_get_snap_to_ticks(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the update behavior of a spin button.
     * 
     * See [method@Gtk.SpinButton.set_update_policy].
     */
    public SpinButtonUpdatePolicy getUpdatePolicy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_get_update_policy(HANDLE());
        return SpinButtonUpdatePolicy.fromValue(RESULT);
    }
    
    /**
     * Get the value in the @spin_button.
     */
    public double getValue() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_get_value(HANDLE());
        return RESULT;
    }
    
    /**
     * Get the value @spin_button represented as an integer.
     */
    public int getValueAsInt() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_get_value_as_int(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns whether the spin button’s value wraps around to the
     * opposite limit when the upper or lower limit of the range is
     * exceeded.
     */
    public boolean getWrap() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_get_wrap(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Replaces the `GtkAdjustment` associated with @spin_button.
     */
    public void setAdjustment(Adjustment adjustment) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_set_adjustment(HANDLE(), adjustment.HANDLE());
    }
    
    /**
     * Sets the acceleration rate for repeated changes when you
     * hold down a button or key.
     */
    public void setClimbRate(double climbRate) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_set_climb_rate(HANDLE(), climbRate);
    }
    
    /**
     * Set the precision to be displayed by @spin_button.
     * 
     * Up to 20 digit precision is allowed.
     */
    public void setDigits(int digits) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_set_digits(HANDLE(), digits);
    }
    
    /**
     * Sets the step and page increments for spin_button.
     * 
     * This affects how quickly the value changes when
     * the spin button’s arrows are activated.
     */
    public void setIncrements(double step, double page) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_set_increments(HANDLE(), step, page);
    }
    
    /**
     * Sets the flag that determines if non-numeric text can be typed
     * into the spin button.
     */
    public void setNumeric(boolean numeric) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_set_numeric(HANDLE(), numeric ? 1 : 0);
    }
    
    /**
     * Sets the minimum and maximum allowable values for @spin_button.
     * 
     * If the current value is outside this range, it will be adjusted
     * to fit within the range, otherwise it will remain unchanged.
     */
    public void setRange(double min, double max) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_set_range(HANDLE(), min, max);
    }
    
    /**
     * Sets the policy as to whether values are corrected to the
     * nearest step increment when a spin button is activated after
     * providing an invalid value.
     */
    public void setSnapToTicks(boolean snapToTicks) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_set_snap_to_ticks(HANDLE(), snapToTicks ? 1 : 0);
    }
    
    /**
     * Sets the update behavior of a spin button.
     * 
     * This determines whether the spin button is always
     * updated or only when a valid value is set.
     */
    public void setUpdatePolicy(SpinButtonUpdatePolicy policy) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_set_update_policy(HANDLE(), policy.getValue());
    }
    
    /**
     * Sets the value of @spin_button.
     */
    public void setValue(double value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_set_value(HANDLE(), value);
    }
    
    /**
     * Sets the flag that determines if a spin button value wraps
     * around to the opposite limit when the upper or lower limit
     * of the range is exceeded.
     */
    public void setWrap(boolean wrap) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_set_wrap(HANDLE(), wrap ? 1 : 0);
    }
    
    /**
     * Increment or decrement a spin button’s value in a specified
     * direction by a specified amount.
     */
    public void spin(SpinType direction, double increment) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_spin(HANDLE(), direction.getValue(), increment);
    }
    
    /**
     * Manually force an update of the spin button.
     */
    public void update() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spin_button_update(HANDLE());
    }
    
    @FunctionalInterface
    public interface ChangeValueHandler {
        void signalReceived(SpinButton source, ScrollType scroll);
    }
    
    /**
     * Emitted when the user initiates a value change.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control the cursor
     * programmatically.
     * 
     * The default bindings for this signal are Up/Down and PageUp/PageDown.
     */
    public void onChangeValue(ChangeValueHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSpinButtonChangeValue", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("change-value"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InputHandler {
        void signalReceived(SpinButton source, double newValue);
    }
    
    /**
     * Emitted to convert the users input into a double value.
     * 
     * The signal handler is expected to use [method@Gtk.Editable.get_text]
     * to retrieve the text of the spinbutton and set @new_value to the
     * new value.
     * 
     * The default conversion uses g_strtod().
     */
    public void onInput(InputHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSpinButtonInput", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("input"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface OutputHandler {
        boolean signalReceived(SpinButton source);
    }
    
    /**
     * Emitted to tweak the formatting of the value for display.
     * 
     * ```c
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
     * ```
     */
    public void onOutput(OutputHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSpinButtonOutput", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("output"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ValueChangedHandler {
        void signalReceived(SpinButton source);
    }
    
    /**
     * Emitted when the value is changed.
     * 
     * Also see the [signal@Gtk.SpinButton::output] signal.
     */
    public void onValueChanged(ValueChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSpinButtonValueChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("value-changed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
    public void onWrapped(WrappedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSpinButtonWrapped", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("wrapped"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
