package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>Using a GtkSpinButton to get an integer</strong><br/>
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
 * <strong>Using a GtkSpinButton to get a floating point value</strong><br/>
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
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * spinbutton.horizontal
 * ????????? text
 * ???    ????????? undershoot.left
 * ???    ????????? undershoot.right
 * ????????? button.down
 * ????????? button.up
 * }</pre>
 * <pre>{@code 
 * spinbutton.vertical
 * ????????? button.up
 * ????????? text
 * ???    ????????? undershoot.left
 * ???    ????????? undershoot.right
 * ????????? button.down
 * }</pre>
 * <p>
 * {@code GtkSpinButton}s main CSS node has the name spinbutton. It creates subnodes
 * for the entry and the two buttons, with these names. The button nodes have
 * the style classes .up and .down. The {@code GtkText} subnodes (if present) are put
 * below the text node. The orientation of the spin button is reflected in
 * the .vertical or .horizontal style class on the main node.
 * <p>
 * <strong>Accessiblity</strong><br/>
 * {@code GtkSpinButton} uses the {@link AccessibleRole#SPIN_BUTTON} role.
 */
public class SpinButton extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.CellEditable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Editable, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSpinButton";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a SpinButton proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SpinButton(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SpinButton> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SpinButton(input);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gtk.Adjustment adjustment, double climbRate, int digits) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_spin_button_new.invokeExact(
                    (Addressable) (adjustment == null ? MemoryAddress.NULL : adjustment.handle()),
                    climbRate,
                    digits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkSpinButton}.
     * @param adjustment the {@code GtkAdjustment} that this spin button should use
     * @param climbRate specifies by how much the rate of change in the value will
     *   accelerate if you continue to hold down an up/down button or arrow key
     * @param digits the number of decimal places to display
     */
    public SpinButton(@Nullable org.gtk.gtk.Adjustment adjustment, double climbRate, int digits) {
        super(constructNew(adjustment, climbRate, digits));
        this.refSink();
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWithRange(double min, double max, double step) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_spin_button_new_with_range.invokeExact(
                    min,
                    max,
                    step);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param min Minimum allowable value
     * @param max Maximum allowable value
     * @param step Increment added or subtracted by spinning the widget
     * @return The new {@code GtkSpinButton}
     */
    public static SpinButton newWithRange(double min, double max, double step) {
        var RESULT = constructNewWithRange(min, max, step);
        var OBJECT = (org.gtk.gtk.SpinButton) Interop.register(RESULT, org.gtk.gtk.SpinButton.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Changes the properties of an existing spin button.
     * <p>
     * The adjustment, climb rate, and number of decimal places
     * are updated accordingly.
     * @param adjustment a {@code GtkAdjustment} to replace the spin button???s
     *   existing adjustment, or {@code null} to leave its current adjustment unchanged
     * @param climbRate the new climb rate
     * @param digits the number of decimal places to display in the spin button
     */
    public void configure(@Nullable org.gtk.gtk.Adjustment adjustment, double climbRate, int digits) {
        try {
            DowncallHandles.gtk_spin_button_configure.invokeExact(
                    handle(),
                    (Addressable) (adjustment == null ? MemoryAddress.NULL : adjustment.handle()),
                    climbRate,
                    digits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the adjustment associated with a {@code GtkSpinButton}.
     * @return the {@code GtkAdjustment} of {@code spin_button}
     */
    public org.gtk.gtk.Adjustment getAdjustment() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_spin_button_get_adjustment.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Adjustment) Interop.register(RESULT, org.gtk.gtk.Adjustment.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns the acceleration rate for repeated changes.
     * @return the acceleration rate
     */
    public double getClimbRate() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_spin_button_get_climb_rate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fetches the precision of {@code spin_button}.
     * @return the current precision
     */
    public int getDigits() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_spin_button_get_digits.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the current step and page the increments
     * used by {@code spin_button}.
     * <p>
     * See {@link SpinButton#setIncrements}.
     * @param step location to store step increment
     * @param page location to store page increment
     */
    public void getIncrements(Out<Double> step, Out<Double> page) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment stepPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment pagePOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            try {
                DowncallHandles.gtk_spin_button_get_increments.invokeExact(
                        handle(),
                        (Addressable) (step == null ? MemoryAddress.NULL : (Addressable) stepPOINTER.address()),
                        (Addressable) (page == null ? MemoryAddress.NULL : (Addressable) pagePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (step != null) step.set(stepPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    if (page != null) page.set(pagePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        }
    }
    
    /**
     * Returns whether non-numeric text can be typed into the spin button.
     * @return {@code true} if only numeric text can be entered
     */
    public boolean getNumeric() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_spin_button_get_numeric.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the range allowed for {@code spin_button}.
     * <p>
     * See {@link SpinButton#setRange}.
     * @param min location to store minimum allowed value
     * @param max location to store maximum allowed value
     */
    public void getRange(Out<Double> min, Out<Double> max) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment minPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment maxPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            try {
                DowncallHandles.gtk_spin_button_get_range.invokeExact(
                        handle(),
                        (Addressable) (min == null ? MemoryAddress.NULL : (Addressable) minPOINTER.address()),
                        (Addressable) (max == null ? MemoryAddress.NULL : (Addressable) maxPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (min != null) min.set(minPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    if (max != null) max.set(maxPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        }
    }
    
    /**
     * Returns whether the values are corrected to the nearest step.
     * @return {@code true} if values are snapped to the nearest step
     */
    public boolean getSnapToTicks() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_spin_button_get_snap_to_ticks.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the update behavior of a spin button.
     * <p>
     * See {@link SpinButton#setUpdatePolicy}.
     * @return the current update policy
     */
    public org.gtk.gtk.SpinButtonUpdatePolicy getUpdatePolicy() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_spin_button_get_update_policy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.SpinButtonUpdatePolicy.of(RESULT);
    }
    
    /**
     * Get the value in the {@code spin_button}.
     * @return the value of {@code spin_button}
     */
    public double getValue() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_spin_button_get_value.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the value {@code spin_button} represented as an integer.
     * @return the value of {@code spin_button}
     */
    public int getValueAsInt() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_spin_button_get_value_as_int.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns whether the spin button???s value wraps around to the
     * opposite limit when the upper or lower limit of the range is
     * exceeded.
     * @return {@code true} if the spin button wraps around
     */
    public boolean getWrap() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_spin_button_get_wrap.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Replaces the {@code GtkAdjustment} associated with {@code spin_button}.
     * @param adjustment a {@code GtkAdjustment} to replace the existing adjustment
     */
    public void setAdjustment(org.gtk.gtk.Adjustment adjustment) {
        try {
            DowncallHandles.gtk_spin_button_set_adjustment.invokeExact(
                    handle(),
                    adjustment.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the acceleration rate for repeated changes when you
     * hold down a button or key.
     * @param climbRate the rate of acceleration, must be &gt;= 0
     */
    public void setClimbRate(double climbRate) {
        try {
            DowncallHandles.gtk_spin_button_set_climb_rate.invokeExact(
                    handle(),
                    climbRate);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the precision to be displayed by {@code spin_button}.
     * <p>
     * Up to 20 digit precision is allowed.
     * @param digits the number of digits after the decimal point to be
     *   displayed for the spin button???s value
     */
    public void setDigits(int digits) {
        try {
            DowncallHandles.gtk_spin_button_set_digits.invokeExact(
                    handle(),
                    digits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the step and page increments for spin_button.
     * <p>
     * This affects how quickly the value changes when
     * the spin button???s arrows are activated.
     * @param step increment applied for a button 1 press.
     * @param page increment applied for a button 2 press.
     */
    public void setIncrements(double step, double page) {
        try {
            DowncallHandles.gtk_spin_button_set_increments.invokeExact(
                    handle(),
                    step,
                    page);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the flag that determines if non-numeric text can be typed
     * into the spin button.
     * @param numeric flag indicating if only numeric entry is allowed
     */
    public void setNumeric(boolean numeric) {
        try {
            DowncallHandles.gtk_spin_button_set_numeric.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(numeric, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the minimum and maximum allowable values for {@code spin_button}.
     * <p>
     * If the current value is outside this range, it will be adjusted
     * to fit within the range, otherwise it will remain unchanged.
     * @param min minimum allowable value
     * @param max maximum allowable value
     */
    public void setRange(double min, double max) {
        try {
            DowncallHandles.gtk_spin_button_set_range.invokeExact(
                    handle(),
                    min,
                    max);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the policy as to whether values are corrected to the
     * nearest step increment when a spin button is activated after
     * providing an invalid value.
     * @param snapToTicks a flag indicating if invalid values should be corrected
     */
    public void setSnapToTicks(boolean snapToTicks) {
        try {
            DowncallHandles.gtk_spin_button_set_snap_to_ticks.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(snapToTicks, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the update behavior of a spin button.
     * <p>
     * This determines whether the spin button is always
     * updated or only when a valid value is set.
     * @param policy a {@code GtkSpinButtonUpdatePolicy} value
     */
    public void setUpdatePolicy(org.gtk.gtk.SpinButtonUpdatePolicy policy) {
        try {
            DowncallHandles.gtk_spin_button_set_update_policy.invokeExact(
                    handle(),
                    policy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code spin_button}.
     * @param value the new value
     */
    public void setValue(double value) {
        try {
            DowncallHandles.gtk_spin_button_set_value.invokeExact(
                    handle(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the flag that determines if a spin button value wraps
     * around to the opposite limit when the upper or lower limit
     * of the range is exceeded.
     * @param wrap a flag indicating if wrapping behavior is performed
     */
    public void setWrap(boolean wrap) {
        try {
            DowncallHandles.gtk_spin_button_set_wrap.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(wrap, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increment or decrement a spin button???s value in a specified
     * direction by a specified amount.
     * @param direction a {@code GtkSpinType} indicating the direction to spin
     * @param increment step increment to apply in the specified direction
     */
    public void spin(org.gtk.gtk.SpinType direction, double increment) {
        try {
            DowncallHandles.gtk_spin_button_spin.invokeExact(
                    handle(),
                    direction.getValue(),
                    increment);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Manually force an update of the spin button.
     */
    public void update() {
        try {
            DowncallHandles.gtk_spin_button_update.invokeExact(handle());
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
            RESULT = (long) DowncallHandles.gtk_spin_button_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code ChangeValue} callback.
     */
    @FunctionalInterface
    public interface ChangeValue {
    
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
        void run(org.gtk.gtk.ScrollType scroll);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSpinButton, int scroll) {
            run(org.gtk.gtk.ScrollType.of(scroll));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ChangeValue.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SpinButton.ChangeValue> onChangeValue(SpinButton.ChangeValue handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("change-value", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Input} callback.
     */
    @FunctionalInterface
    public interface Input {
    
        /**
         * Emitted to convert the users input into a double value.
         * <p>
         * The signal handler is expected to use {@link Editable#getText}
         * to retrieve the text of the spinbutton and set {@code new_value} to the
         * new value.
         * <p>
         * The default conversion uses g_strtod().
         */
        int run(Out<Double> newValue);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceSpinButton, MemoryAddress newValue) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Double> newValueOUT = new Out<>(newValue.get(Interop.valueLayout.C_DOUBLE, 0));
                var RESULT = run(newValueOUT);
                newValue.set(Interop.valueLayout.C_DOUBLE, 0, newValueOUT.get());
                return RESULT;
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Input.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to convert the users input into a double value.
     * <p>
     * The signal handler is expected to use {@link Editable#getText}
     * to retrieve the text of the spinbutton and set {@code new_value} to the
     * new value.
     * <p>
     * The default conversion uses g_strtod().
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SpinButton.Input> onInput(SpinButton.Input handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("input", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Output} callback.
     */
    @FunctionalInterface
    public interface Output {
    
        /**
         * Emitted to tweak the formatting of the value for display.
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
         *    gtk_editable_set_text (GTK_EDITABLE (spin), text):
         *    g_free (text);
         * 
         *    return TRUE;
         * }
         * }</pre>
         */
        boolean run();
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceSpinButton) {
            var RESULT = run();
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Output.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to tweak the formatting of the value for display.
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
     *    gtk_editable_set_text (GTK_EDITABLE (spin), text):
     *    g_free (text);
     * 
     *    return TRUE;
     * }
     * }</pre>
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SpinButton.Output> onOutput(SpinButton.Output handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("output", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ValueChanged} callback.
     */
    @FunctionalInterface
    public interface ValueChanged {
    
        /**
         * Emitted when the value is changed.
         * <p>
         * Also see the {@code Gtk.SpinButton::output} signal.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSpinButton) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ValueChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the value is changed.
     * <p>
     * Also see the {@code Gtk.SpinButton::output} signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SpinButton.ValueChanged> onValueChanged(SpinButton.ValueChanged handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("value-changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Wrapped} callback.
     */
    @FunctionalInterface
    public interface Wrapped {
    
        /**
         * Emitted right after the spinbutton wraps from its maximum
         * to its minimum value or vice-versa.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSpinButton) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Wrapped.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted right after the spinbutton wraps from its maximum
     * to its minimum value or vice-versa.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SpinButton.Wrapped> onWrapped(SpinButton.Wrapped handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("wrapped", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link SpinButton.Builder} object constructs a {@link SpinButton} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SpinButton.Builder#build()}. 
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
         * Finish building the {@link SpinButton} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SpinButton}.
         * @return A new instance of {@code SpinButton} with the properties 
         *         that were set in the Builder object.
         */
        public SpinButton build() {
            return (SpinButton) org.gtk.gobject.GObject.newWithProperties(
                SpinButton.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The adjustment that holds the value of the spin button.
         * @param adjustment The value for the {@code adjustment} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAdjustment(org.gtk.gtk.Adjustment adjustment) {
            names.add("adjustment");
            values.add(org.gtk.gobject.Value.create(adjustment));
            return this;
        }
        
        /**
         * The acceleration rate when you hold down a button or key.
         * @param climbRate The value for the {@code climb-rate} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setClimbRate(double climbRate) {
            names.add("climb-rate");
            values.add(org.gtk.gobject.Value.create(climbRate));
            return this;
        }
        
        /**
         * The number of decimal places to display.
         * @param digits The value for the {@code digits} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDigits(int digits) {
            names.add("digits");
            values.add(org.gtk.gobject.Value.create(digits));
            return this;
        }
        
        /**
         * Whether non-numeric characters should be ignored.
         * @param numeric The value for the {@code numeric} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNumeric(boolean numeric) {
            names.add("numeric");
            values.add(org.gtk.gobject.Value.create(numeric));
            return this;
        }
        
        /**
         * Whether erroneous values are automatically changed to the spin buttons
         * nearest step increment.
         * @param snapToTicks The value for the {@code snap-to-ticks} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSnapToTicks(boolean snapToTicks) {
            names.add("snap-to-ticks");
            values.add(org.gtk.gobject.Value.create(snapToTicks));
            return this;
        }
        
        /**
         * Whether the spin button should update always, or only when the value
         * is acceptable.
         * @param updatePolicy The value for the {@code update-policy} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUpdatePolicy(org.gtk.gtk.SpinButtonUpdatePolicy updatePolicy) {
            names.add("update-policy");
            values.add(org.gtk.gobject.Value.create(updatePolicy));
            return this;
        }
        
        /**
         * The current value.
         * @param value The value for the {@code value} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValue(double value) {
            names.add("value");
            values.add(org.gtk.gobject.Value.create(value));
            return this;
        }
        
        /**
         * Whether a spin button should wrap upon reaching its limits.
         * @param wrap The value for the {@code wrap} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWrap(boolean wrap) {
            names.add("wrap");
            values.add(org.gtk.gobject.Value.create(wrap));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_spin_button_new = Interop.downcallHandle(
                "gtk_spin_button_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_spin_button_new_with_range = Interop.downcallHandle(
                "gtk_spin_button_new_with_range",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_spin_button_configure = Interop.downcallHandle(
                "gtk_spin_button_configure",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_spin_button_get_adjustment = Interop.downcallHandle(
                "gtk_spin_button_get_adjustment",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_spin_button_get_climb_rate = Interop.downcallHandle(
                "gtk_spin_button_get_climb_rate",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_spin_button_get_digits = Interop.downcallHandle(
                "gtk_spin_button_get_digits",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_spin_button_get_increments = Interop.downcallHandle(
                "gtk_spin_button_get_increments",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_spin_button_get_numeric = Interop.downcallHandle(
                "gtk_spin_button_get_numeric",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_spin_button_get_range = Interop.downcallHandle(
                "gtk_spin_button_get_range",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_spin_button_get_snap_to_ticks = Interop.downcallHandle(
                "gtk_spin_button_get_snap_to_ticks",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_spin_button_get_update_policy = Interop.downcallHandle(
                "gtk_spin_button_get_update_policy",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_spin_button_get_value = Interop.downcallHandle(
                "gtk_spin_button_get_value",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_spin_button_get_value_as_int = Interop.downcallHandle(
                "gtk_spin_button_get_value_as_int",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_spin_button_get_wrap = Interop.downcallHandle(
                "gtk_spin_button_get_wrap",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_spin_button_set_adjustment = Interop.downcallHandle(
                "gtk_spin_button_set_adjustment",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_spin_button_set_climb_rate = Interop.downcallHandle(
                "gtk_spin_button_set_climb_rate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_spin_button_set_digits = Interop.downcallHandle(
                "gtk_spin_button_set_digits",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_spin_button_set_increments = Interop.downcallHandle(
                "gtk_spin_button_set_increments",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_spin_button_set_numeric = Interop.downcallHandle(
                "gtk_spin_button_set_numeric",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_spin_button_set_range = Interop.downcallHandle(
                "gtk_spin_button_set_range",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_spin_button_set_snap_to_ticks = Interop.downcallHandle(
                "gtk_spin_button_set_snap_to_ticks",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_spin_button_set_update_policy = Interop.downcallHandle(
                "gtk_spin_button_set_update_policy",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_spin_button_set_value = Interop.downcallHandle(
                "gtk_spin_button_set_value",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_spin_button_set_wrap = Interop.downcallHandle(
                "gtk_spin_button_set_wrap",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_spin_button_spin = Interop.downcallHandle(
                "gtk_spin_button_spin",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_spin_button_update = Interop.downcallHandle(
                "gtk_spin_button_update",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_spin_button_get_type = Interop.downcallHandle(
                "gtk_spin_button_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_spin_button_get_type != null;
    }
}
