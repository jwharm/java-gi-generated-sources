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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkAdjustment";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.InitiallyUnowned.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a Adjustment proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Adjustment(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Adjustment if its GType is a (or inherits from) "GtkAdjustment".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Adjustment} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkAdjustment", a ClassCastException will be thrown.
     */
    public static Adjustment castFrom(org.gtk.gobject.Object gobject) {
            return new Adjustment(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(double value, double lower, double upper, double stepIncrement, double pageIncrement, double pageSize) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_adjustment_new.invokeExact(
                    value,
                    lower,
                    upper,
                    stepIncrement,
                    pageIncrement,
                    pageSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkAdjustment}.
     * @param value the initial value
     * @param lower the minimum value
     * @param upper the maximum value
     * @param stepIncrement the step increment
     * @param pageIncrement the page increment
     * @param pageSize the page size
     */
    public Adjustment(double value, double lower, double upper, double stepIncrement, double pageIncrement, double pageSize) {
        super(constructNew(value, lower, upper, stepIncrement, pageIncrement, pageSize), Ownership.NONE);
    }
    
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
     * @param lower the lower value
     * @param upper the upper value
     */
    public void clampPage(double lower, double upper) {
        try {
            DowncallHandles.gtk_adjustment_clamp_page.invokeExact(
                    handle(),
                    lower,
                    upper);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets all properties of the adjustment at once.
     * <p>
     * Use this function to avoid multiple emissions of the
     * {@code Gtk.Adjustment::changed} signal. See
     * {@link Adjustment#setLower} for an alternative
     * way of compressing multiple emissions of
     * {@code Gtk.Adjustment::changed} into one.
     * @param value the new value
     * @param lower the new minimum value
     * @param upper the new maximum value
     * @param stepIncrement the new step increment
     * @param pageIncrement the new page increment
     * @param pageSize the new page size
     */
    public void configure(double value, double lower, double upper, double stepIncrement, double pageIncrement, double pageSize) {
        try {
            DowncallHandles.gtk_adjustment_configure.invokeExact(
                    handle(),
                    value,
                    lower,
                    upper,
                    stepIncrement,
                    pageIncrement,
                    pageSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the minimum value of the adjustment.
     * @return The current minimum value of the adjustment
     */
    public double getLower() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_adjustment_get_lower.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the smaller of step increment and page increment.
     * @return the minimum increment of {@code adjustment}
     */
    public double getMinimumIncrement() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_adjustment_get_minimum_increment.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the page increment of the adjustment.
     * @return The current page increment of the adjustment
     */
    public double getPageIncrement() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_adjustment_get_page_increment.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the page size of the adjustment.
     * @return The current page size of the adjustment
     */
    public double getPageSize() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_adjustment_get_page_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the step increment of the adjustment.
     * @return The current step increment of the adjustment.
     */
    public double getStepIncrement() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_adjustment_get_step_increment.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the maximum value of the adjustment.
     * @return The current maximum value of the adjustment
     */
    public double getUpper() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_adjustment_get_upper.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the current value of the adjustment.
     * @return The current value of the adjustment
     */
    public double getValue() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_adjustment_get_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
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
     * @param lower the new minimum value
     */
    public void setLower(double lower) {
        try {
            DowncallHandles.gtk_adjustment_set_lower.invokeExact(
                    handle(),
                    lower);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the page increment of the adjustment.
     * <p>
     * See {@link Adjustment#setLower} about how to compress
     * multiple emissions of the {@code Gtk.Adjustment::changed}
     * signal when setting multiple adjustment properties.
     * @param pageIncrement the new page increment
     */
    public void setPageIncrement(double pageIncrement) {
        try {
            DowncallHandles.gtk_adjustment_set_page_increment.invokeExact(
                    handle(),
                    pageIncrement);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the page size of the adjustment.
     * <p>
     * See {@link Adjustment#setLower} about how to compress
     * multiple emissions of the {@code Gtk.Adjustment::changed}
     * signal when setting multiple adjustment properties.
     * @param pageSize the new page size
     */
    public void setPageSize(double pageSize) {
        try {
            DowncallHandles.gtk_adjustment_set_page_size.invokeExact(
                    handle(),
                    pageSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the step increment of the adjustment.
     * <p>
     * See {@link Adjustment#setLower} about how to compress
     * multiple emissions of the {@code Gtk.Adjustment::changed}
     * signal when setting multiple adjustment properties.
     * @param stepIncrement the new step increment
     */
    public void setStepIncrement(double stepIncrement) {
        try {
            DowncallHandles.gtk_adjustment_set_step_increment.invokeExact(
                    handle(),
                    stepIncrement);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the maximum value of the adjustment.
     * <p>
     * Note that values will be restricted by {@code upper - page-size}
     * if the page-size property is nonzero.
     * <p>
     * See {@link Adjustment#setLower} about how to compress
     * multiple emissions of the {@code Gtk.Adjustment::changed}
     * signal when setting multiple adjustment properties.
     * @param upper the new maximum value
     */
    public void setUpper(double upper) {
        try {
            DowncallHandles.gtk_adjustment_set_upper.invokeExact(
                    handle(),
                    upper);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkAdjustment} value.
     * <p>
     * The value is clamped to lie between {@code Gtk.Adjustment:lower}
     * and {@code Gtk.Adjustment:upper}.
     * <p>
     * Note that for adjustments which are used in a {@code GtkScrollbar},
     * the effective range of allowed values goes from
     * {@code Gtk.Adjustment:lower} to
     * {@code Gtk.Adjustment:upper} - {@code Gtk.Adjustment:page-size}.
     * @param value the new value
     */
    public void setValue(double value) {
        try {
            DowncallHandles.gtk_adjustment_set_value.invokeExact(
                    handle(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_adjustment_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Changed {
        void signalReceived(Adjustment source);
    }
    
    /**
     * Emitted when one or more of the {@code GtkAdjustment} properties have been
     * changed.
     * <p>
     * Note that the {@code Gtk.Adjustment:value} property is
     * covered by the {@code Gtk.Adjustment::value-changed} signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Adjustment.Changed> onChanged(Adjustment.Changed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Adjustment.Callbacks.class, "signalAdjustmentChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Adjustment.Changed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ValueChanged {
        void signalReceived(Adjustment source);
    }
    
    /**
     * Emitted when the value has been changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Adjustment.ValueChanged> onValueChanged(Adjustment.ValueChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("value-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Adjustment.Callbacks.class, "signalAdjustmentValueChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Adjustment.ValueChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.InitiallyUnowned.Build {
        
         /**
         * A {@link Adjustment.Build} object constructs a {@link Adjustment} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Adjustment} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Adjustment} using {@link Adjustment#castFrom}.
         * @return A new instance of {@code Adjustment} with the properties 
         *         that were set in the Build object.
         */
        public Adjustment construct() {
            return Adjustment.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Adjustment.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The minimum value of the adjustment.
         * @param lower The value for the {@code lower} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLower(double lower) {
            names.add("lower");
            values.add(org.gtk.gobject.Value.create(lower));
            return this;
        }
        
        /**
         * The page increment of the adjustment.
         * @param pageIncrement The value for the {@code page-increment} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPageIncrement(double pageIncrement) {
            names.add("page-increment");
            values.add(org.gtk.gobject.Value.create(pageIncrement));
            return this;
        }
        
        /**
         * The page size of the adjustment.
         * <p>
         * Note that the page-size is irrelevant and should be set to zero
         * if the adjustment is used for a simple scalar value, e.g. in a
         * {@code GtkSpinButton}.
         * @param pageSize The value for the {@code page-size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPageSize(double pageSize) {
            names.add("page-size");
            values.add(org.gtk.gobject.Value.create(pageSize));
            return this;
        }
        
        /**
         * The step increment of the adjustment.
         * @param stepIncrement The value for the {@code step-increment} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStepIncrement(double stepIncrement) {
            names.add("step-increment");
            values.add(org.gtk.gobject.Value.create(stepIncrement));
            return this;
        }
        
        /**
         * The maximum value of the adjustment.
         * <p>
         * Note that values will be restricted by {@code upper - page-size} if the page-size
         * property is nonzero.
         * @param upper The value for the {@code upper} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUpper(double upper) {
            names.add("upper");
            values.add(org.gtk.gobject.Value.create(upper));
            return this;
        }
        
        /**
         * The value of the adjustment.
         * @param value The value for the {@code value} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setValue(double value) {
            names.add("value");
            values.add(org.gtk.gobject.Value.create(value));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_adjustment_new = Interop.downcallHandle(
            "gtk_adjustment_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_adjustment_clamp_page = Interop.downcallHandle(
            "gtk_adjustment_clamp_page",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_adjustment_configure = Interop.downcallHandle(
            "gtk_adjustment_configure",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_adjustment_get_lower = Interop.downcallHandle(
            "gtk_adjustment_get_lower",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_adjustment_get_minimum_increment = Interop.downcallHandle(
            "gtk_adjustment_get_minimum_increment",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_adjustment_get_page_increment = Interop.downcallHandle(
            "gtk_adjustment_get_page_increment",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_adjustment_get_page_size = Interop.downcallHandle(
            "gtk_adjustment_get_page_size",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_adjustment_get_step_increment = Interop.downcallHandle(
            "gtk_adjustment_get_step_increment",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_adjustment_get_upper = Interop.downcallHandle(
            "gtk_adjustment_get_upper",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_adjustment_get_value = Interop.downcallHandle(
            "gtk_adjustment_get_value",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_adjustment_set_lower = Interop.downcallHandle(
            "gtk_adjustment_set_lower",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_adjustment_set_page_increment = Interop.downcallHandle(
            "gtk_adjustment_set_page_increment",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_adjustment_set_page_size = Interop.downcallHandle(
            "gtk_adjustment_set_page_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_adjustment_set_step_increment = Interop.downcallHandle(
            "gtk_adjustment_set_step_increment",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_adjustment_set_upper = Interop.downcallHandle(
            "gtk_adjustment_set_upper",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_adjustment_set_value = Interop.downcallHandle(
            "gtk_adjustment_set_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_adjustment_get_type = Interop.downcallHandle(
            "gtk_adjustment_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalAdjustmentChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Adjustment.Changed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Adjustment(source, Ownership.NONE));
        }
        
        public static void signalAdjustmentValueChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Adjustment.ValueChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Adjustment(source, Ownership.NONE));
        }
    }
}
