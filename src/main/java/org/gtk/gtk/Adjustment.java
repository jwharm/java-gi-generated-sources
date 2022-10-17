package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkAdjustment} is a model for a numeric value.
 * <p>
 * The {@code GtkAdjustment has an associated lower and upper bound.
 * It also contains step and page increments, and a page size.
 * 
 * Adjustments are used within several GTK widgets, including
 * [class@Gtk.SpinButton], [class@Gtk.Viewport], [class@Gtk.Scrollbar]
 * and [class@Gtk.Scale].
 * 
 * The }GtkAdjustment{@code  object does not update the value itself. Instead
 * it is left up to the owner of the }GtkAdjustment` to control the value.
 */
public class Adjustment extends org.gtk.gobject.InitiallyUnowned {

    public Adjustment(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Adjustment */
    public static Adjustment castFrom(org.gtk.gobject.Object gobject) {
        return new Adjustment(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_adjustment_new = Interop.downcallHandle(
        "gtk_adjustment_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    private static Refcounted constructNew(@NotNull double value, @NotNull double lower, @NotNull double upper, @NotNull double stepIncrement, @NotNull double pageIncrement, @NotNull double pageSize) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_adjustment_new.invokeExact(value, lower, upper, stepIncrement, pageIncrement, pageSize), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkAdjustment}.
     */
    public Adjustment(@NotNull double value, @NotNull double lower, @NotNull double upper, @NotNull double stepIncrement, @NotNull double pageIncrement, @NotNull double pageSize) {
        super(constructNew(value, lower, upper, stepIncrement, pageIncrement, pageSize));
    }
    
    private static final MethodHandle gtk_adjustment_clamp_page = Interop.downcallHandle(
        "gtk_adjustment_clamp_page",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Updates the value property to ensure that the range
     * between {@code lower} and {@code upper} is in the current page.
     * <p>
     * The current page goes from {@code value} to {@code value} + {@code page-size}.
     * If the range is larger than the page size, then only the
     * start of it will be in the current page.
     * <p>
     * A {@code Gtk.Adjustment::value-changed} signal will be emitted
     * if the value is changed.
     */
    public @NotNull void clampPage(@NotNull double lower, @NotNull double upper) {
        try {
            gtk_adjustment_clamp_page.invokeExact(handle(), lower, upper);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_adjustment_configure = Interop.downcallHandle(
        "gtk_adjustment_configure",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets all properties of the adjustment at once.
     * <p>
     * Use this function to avoid multiple emissions of the
     * {@code Gtk.Adjustment::changed} signal. See
     * {@link Adjustment#setLower} for an alternative
     * way of compressing multiple emissions of
     * {@code Gtk.Adjustment::changed} into one.
     */
    public @NotNull void configure(@NotNull double value, @NotNull double lower, @NotNull double upper, @NotNull double stepIncrement, @NotNull double pageIncrement, @NotNull double pageSize) {
        try {
            gtk_adjustment_configure.invokeExact(handle(), value, lower, upper, stepIncrement, pageIncrement, pageSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_adjustment_get_lower = Interop.downcallHandle(
        "gtk_adjustment_get_lower",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the minimum value of the adjustment.
     */
    public double getLower() {
        double RESULT;
        try {
            RESULT = (double) gtk_adjustment_get_lower.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_adjustment_get_minimum_increment = Interop.downcallHandle(
        "gtk_adjustment_get_minimum_increment",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the smaller of step increment and page increment.
     */
    public double getMinimumIncrement() {
        double RESULT;
        try {
            RESULT = (double) gtk_adjustment_get_minimum_increment.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_adjustment_get_page_increment = Interop.downcallHandle(
        "gtk_adjustment_get_page_increment",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the page increment of the adjustment.
     */
    public double getPageIncrement() {
        double RESULT;
        try {
            RESULT = (double) gtk_adjustment_get_page_increment.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_adjustment_get_page_size = Interop.downcallHandle(
        "gtk_adjustment_get_page_size",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the page size of the adjustment.
     */
    public double getPageSize() {
        double RESULT;
        try {
            RESULT = (double) gtk_adjustment_get_page_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_adjustment_get_step_increment = Interop.downcallHandle(
        "gtk_adjustment_get_step_increment",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the step increment of the adjustment.
     */
    public double getStepIncrement() {
        double RESULT;
        try {
            RESULT = (double) gtk_adjustment_get_step_increment.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_adjustment_get_upper = Interop.downcallHandle(
        "gtk_adjustment_get_upper",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the maximum value of the adjustment.
     */
    public double getUpper() {
        double RESULT;
        try {
            RESULT = (double) gtk_adjustment_get_upper.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_adjustment_get_value = Interop.downcallHandle(
        "gtk_adjustment_get_value",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current value of the adjustment.
     */
    public double getValue() {
        double RESULT;
        try {
            RESULT = (double) gtk_adjustment_get_value.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_adjustment_set_lower = Interop.downcallHandle(
        "gtk_adjustment_set_lower",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the minimum value of the adjustment.
     * <p>
     * When setting multiple adjustment properties via their individual
     * setters, multiple {@code Gtk.Adjustment::changed} signals will
     * be emitted. However, since the emission of the
     * {@code Gtk.Adjustment::changed} signal is tied to the emission
     * of the ::notify signals of the changed properties, it’s possible
     * to compress the {@code Gtk.Adjustment::changed} signals into one
     * by calling g_object_freeze_notify() and g_object_thaw_notify()
     * around the calls to the individual setters.
     * <p>
     * Alternatively, using a single g_object_set() for all the properties
     * to change, or using {@link Adjustment#configure} has the same effect.
     */
    public @NotNull void setLower(@NotNull double lower) {
        try {
            gtk_adjustment_set_lower.invokeExact(handle(), lower);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_adjustment_set_page_increment = Interop.downcallHandle(
        "gtk_adjustment_set_page_increment",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the page increment of the adjustment.
     * <p>
     * See {@link Adjustment#setLower} about how to compress
     * multiple emissions of the {@code Gtk.Adjustment::changed}
     * signal when setting multiple adjustment properties.
     */
    public @NotNull void setPageIncrement(@NotNull double pageIncrement) {
        try {
            gtk_adjustment_set_page_increment.invokeExact(handle(), pageIncrement);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_adjustment_set_page_size = Interop.downcallHandle(
        "gtk_adjustment_set_page_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the page size of the adjustment.
     * <p>
     * See {@link Adjustment#setLower} about how to compress
     * multiple emissions of the {@code Gtk.Adjustment::changed}
     * signal when setting multiple adjustment properties.
     */
    public @NotNull void setPageSize(@NotNull double pageSize) {
        try {
            gtk_adjustment_set_page_size.invokeExact(handle(), pageSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_adjustment_set_step_increment = Interop.downcallHandle(
        "gtk_adjustment_set_step_increment",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the step increment of the adjustment.
     * <p>
     * See {@link Adjustment#setLower} about how to compress
     * multiple emissions of the {@code Gtk.Adjustment::changed}
     * signal when setting multiple adjustment properties.
     */
    public @NotNull void setStepIncrement(@NotNull double stepIncrement) {
        try {
            gtk_adjustment_set_step_increment.invokeExact(handle(), stepIncrement);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_adjustment_set_upper = Interop.downcallHandle(
        "gtk_adjustment_set_upper",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the maximum value of the adjustment.
     * <p>
     * Note that values will be restricted by {@code upper - page-size}
     * if the page-size property is nonzero.
     * <p>
     * See {@link Adjustment#setLower} about how to compress
     * multiple emissions of the {@code Gtk.Adjustment::changed}
     * signal when setting multiple adjustment properties.
     */
    public @NotNull void setUpper(@NotNull double upper) {
        try {
            gtk_adjustment_set_upper.invokeExact(handle(), upper);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_adjustment_set_value = Interop.downcallHandle(
        "gtk_adjustment_set_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the {@code GtkAdjustment} value.
     * <p>
     * The value is clamped to lie between {@code Gtk.Adjustment:lower}
     * and {@code Gtk.Adjustment:upper}.
     * <p>
     * Note that for adjustments which are used in a {@code GtkScrollbar},
     * the effective range of allowed values goes from
     * {@code Gtk.Adjustment:lower} to
     * {@code Gtk.Adjustment:page-size}.
     */
    public @NotNull void setValue(@NotNull double value) {
        try {
            gtk_adjustment_set_value.invokeExact(handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(Adjustment source);
    }
    
    /**
     * Emitted when one or more of the {@code GtkAdjustment} properties have been
     * changed.
     * <p>
     * Note that the {@code Gtk.Adjustment:value} property is
     * covered by the {@code Gtk.Adjustment::value-changed} signal.
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Adjustment.Callbacks.class, "signalAdjustmentChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ValueChangedHandler {
        void signalReceived(Adjustment source);
    }
    
    /**
     * Emitted when the value has been changed.
     */
    public SignalHandle onValueChanged(ValueChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("value-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Adjustment.Callbacks.class, "signalAdjustmentValueChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalAdjustmentChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Adjustment.ChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Adjustment(Refcounted.get(source)));
        }
        
        public static void signalAdjustmentValueChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Adjustment.ValueChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Adjustment(Refcounted.get(source)));
        }
        
    }
}
