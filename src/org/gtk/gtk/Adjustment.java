package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkAdjustment` is a model for a numeric value.
 * 
 * The `GtkAdjustment has an associated lower and upper bound.
 * It also contains step and page increments, and a page size.
 * 
 * Adjustments are used within several GTK widgets, including
 * [class@Gtk.SpinButton], [class@Gtk.Viewport], [class@Gtk.Scrollbar]
 * and [class@Gtk.Scale].
 * 
 * The `GtkAdjustment` object does not update the value itself. Instead
 * it is left up to the owner of the `GtkAdjustment` to control the value.
 */
public class Adjustment extends org.gtk.gobject.InitiallyUnowned {

    public Adjustment(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Adjustment */
    public static Adjustment castFrom(org.gtk.gobject.Object gobject) {
        return new Adjustment(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkAdjustment`.
     */
    public Adjustment(double value, double lower, double upper, double stepIncrement, double pageIncrement, double pageSize) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_adjustment_new(value, lower, upper, stepIncrement, pageIncrement, pageSize), false));
    }
    
    /**
     * Updates the value property to ensure that the range
     * between @lower and @upper is in the current page.
     * 
     * The current page goes from `value` to `value` + `page-size`.
     * If the range is larger than the page size, then only the
     * start of it will be in the current page.
     * 
     * A [signal@Gtk.Adjustment::value-changed] signal will be emitted
     * if the value is changed.
     */
    public void clampPage(double lower, double upper) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_adjustment_clamp_page(HANDLE(), lower, upper);
    }
    
    /**
     * Sets all properties of the adjustment at once.
     * 
     * Use this function to avoid multiple emissions of the
     * [signal@Gtk.Adjustment::changed] signal. See
     * [method@Gtk.Adjustment.set_lower] for an alternative
     * way of compressing multiple emissions of
     * [signal@Gtk.Adjustment::changed] into one.
     */
    public void configure(double value, double lower, double upper, double stepIncrement, double pageIncrement, double pageSize) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_adjustment_configure(HANDLE(), value, lower, upper, stepIncrement, pageIncrement, pageSize);
    }
    
    /**
     * Retrieves the minimum value of the adjustment.
     */
    public double getLower() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_adjustment_get_lower(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the smaller of step increment and page increment.
     */
    public double getMinimumIncrement() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_adjustment_get_minimum_increment(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the page increment of the adjustment.
     */
    public double getPageIncrement() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_adjustment_get_page_increment(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the page size of the adjustment.
     */
    public double getPageSize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_adjustment_get_page_size(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the step increment of the adjustment.
     */
    public double getStepIncrement() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_adjustment_get_step_increment(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the maximum value of the adjustment.
     */
    public double getUpper() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_adjustment_get_upper(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the current value of the adjustment.
     */
    public double getValue() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_adjustment_get_value(HANDLE());
        return RESULT;
    }
    
    /**
     * Sets the minimum value of the adjustment.
     * 
     * When setting multiple adjustment properties via their individual
     * setters, multiple [signal@Gtk.Adjustment::changed] signals will
     * be emitted. However, since the emission of the
     * [signal@Gtk.Adjustment::changed] signal is tied to the emission
     * of the ::notify signals of the changed properties, it’s possible
     * to compress the [signal@Gtk.Adjustment::changed] signals into one
     * by calling g_object_freeze_notify() and g_object_thaw_notify()
     * around the calls to the individual setters.
     * 
     * Alternatively, using a single g_object_set() for all the properties
     * to change, or using [method@Gtk.Adjustment.configure] has the same effect.
     */
    public void setLower(double lower) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_adjustment_set_lower(HANDLE(), lower);
    }
    
    /**
     * Sets the page increment of the adjustment.
     * 
     * See [method@Gtk.Adjustment.set_lower] about how to compress
     * multiple emissions of the [signal@Gtk.Adjustment::changed]
     * signal when setting multiple adjustment properties.
     */
    public void setPageIncrement(double pageIncrement) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_adjustment_set_page_increment(HANDLE(), pageIncrement);
    }
    
    /**
     * Sets the page size of the adjustment.
     * 
     * See [method@Gtk.Adjustment.set_lower] about how to compress
     * multiple emissions of the [signal@Gtk.Adjustment::changed]
     * signal when setting multiple adjustment properties.
     */
    public void setPageSize(double pageSize) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_adjustment_set_page_size(HANDLE(), pageSize);
    }
    
    /**
     * Sets the step increment of the adjustment.
     * 
     * See [method@Gtk.Adjustment.set_lower] about how to compress
     * multiple emissions of the [signal@Gtk.Adjustment::changed]
     * signal when setting multiple adjustment properties.
     */
    public void setStepIncrement(double stepIncrement) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_adjustment_set_step_increment(HANDLE(), stepIncrement);
    }
    
    /**
     * Sets the maximum value of the adjustment.
     * 
     * Note that values will be restricted by `upper - page-size`
     * if the page-size property is nonzero.
     * 
     * See [method@Gtk.Adjustment.set_lower] about how to compress
     * multiple emissions of the [signal@Gtk.Adjustment::changed]
     * signal when setting multiple adjustment properties.
     */
    public void setUpper(double upper) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_adjustment_set_upper(HANDLE(), upper);
    }
    
    /**
     * Sets the `GtkAdjustment` value.
     * 
     * The value is clamped to lie between [property@Gtk.Adjustment:lower]
     * and [property@Gtk.Adjustment:upper].
     * 
     * Note that for adjustments which are used in a `GtkScrollbar`,
     * the effective range of allowed values goes from
     * [property@Gtk.Adjustment:lower] to
     * [property@Gtk.Adjustment:upper] - [property@Gtk.Adjustment:page-size].
     */
    public void setValue(double value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_adjustment_set_value(HANDLE(), value);
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(Adjustment source);
    }
    
    /**
     * Emitted when one or more of the `GtkAdjustment` properties have been
     * changed.
     * 
     * Note that the [property@Gtk.Adjustment:value] property is
     * covered by the [signal@Gtk.Adjustment::value-changed] signal.
     */
    public void onChanged(ChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAdjustmentChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("changed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ValueChangedHandler {
        void signalReceived(Adjustment source);
    }
    
    /**
     * Emitted when the value has been changed.
     */
    public void onValueChanged(ValueChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAdjustmentValueChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("value-changed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}