package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkAdjustment</code> is a model for a numeric value.
 * <p>
 * The <code>GtkAdjustment has an associated lower and upper bound.
 * It also contains step and page increments, and a page size.
 * 
 * Adjustments are used within several GTK widgets, including
 * {@link org.gtk.gtk.SpinButton}, {@link org.gtk.gtk.Viewport}, {@link org.gtk.gtk.Scrollbar}
 * and {@link org.gtk.gtk.Scale}.
 * 
 * The </code>GtkAdjustment<code> object does not update the value itself. Instead
 * it is left up to the owner of the </code>GtkAdjustment<code> to control the value.
 */
public class Adjustment extends org.gtk.gobject.InitiallyUnowned {

    public Adjustment(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Adjustment */
    public static Adjustment castFrom(org.gtk.gobject.Object gobject) {
        return new Adjustment(gobject.getReference());
    }
    
    private static Reference constructNew(double value, double lower, double upper, double stepIncrement, double pageIncrement, double pageSize) {
        Reference RESULT = References.get(gtk_h.gtk_adjustment_new(value, lower, upper, stepIncrement, pageIncrement, pageSize), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkAdjustment</code>.
     */
    public Adjustment(double value, double lower, double upper, double stepIncrement, double pageIncrement, double pageSize) {
        super(constructNew(value, lower, upper, stepIncrement, pageIncrement, pageSize));
    }
    
    /**
     * Updates the value property to ensure that the range
     * between @lower and @upper is in the current page.
     * <p>
     * The current page goes from <code>value</code> to <code>value</code> + <code>page-size</code>.
     * If the range is larger than the page size, then only the
     * start of it will be in the current page.
     * 
     * A {@link [signal@Gtk.Adjustment::value-changed] (ref=signal)} signal will be emitted
     * if the value is changed.
     */
    public void clampPage(double lower, double upper) {
        gtk_h.gtk_adjustment_clamp_page(handle(), lower, upper);
    }
    
    /**
     * Sets all properties of the adjustment at once.
     * 
     * Use this function to avoid multiple emissions of the
     * {@link [signal@Gtk.Adjustment::changed] (ref=signal)} signal. See
     * {@link org.gtk.gtk.Adjustment<code>#setLower</code>  for an alternative
     * way of compressing multiple emissions of
     * {@link [signal@Gtk.Adjustment::changed] (ref=signal)} into one.
     */
    public void configure(double value, double lower, double upper, double stepIncrement, double pageIncrement, double pageSize) {
        gtk_h.gtk_adjustment_configure(handle(), value, lower, upper, stepIncrement, pageIncrement, pageSize);
    }
    
    /**
     * Retrieves the minimum value of the adjustment.
     */
    public double getLower() {
        var RESULT = gtk_h.gtk_adjustment_get_lower(handle());
        return RESULT;
    }
    
    /**
     * Gets the smaller of step increment and page increment.
     */
    public double getMinimumIncrement() {
        var RESULT = gtk_h.gtk_adjustment_get_minimum_increment(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the page increment of the adjustment.
     */
    public double getPageIncrement() {
        var RESULT = gtk_h.gtk_adjustment_get_page_increment(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the page size of the adjustment.
     */
    public double getPageSize() {
        var RESULT = gtk_h.gtk_adjustment_get_page_size(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the step increment of the adjustment.
     */
    public double getStepIncrement() {
        var RESULT = gtk_h.gtk_adjustment_get_step_increment(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the maximum value of the adjustment.
     */
    public double getUpper() {
        var RESULT = gtk_h.gtk_adjustment_get_upper(handle());
        return RESULT;
    }
    
    /**
     * Gets the current value of the adjustment.
     */
    public double getValue() {
        var RESULT = gtk_h.gtk_adjustment_get_value(handle());
        return RESULT;
    }
    
    /**
     * Sets the minimum value of the adjustment.
     * 
     * When setting multiple adjustment properties via their individual
     * setters, multiple {@link [signal@Gtk.Adjustment::changed] (ref=signal)} signals will
     * be emitted. However, since the emission of the
     * {@link [signal@Gtk.Adjustment::changed] (ref=signal)} signal is tied to the emission
     * of the ::notify signals of the changed properties, it&<code>#8217</code> s possible
     * to compress the {@link [signal@Gtk.Adjustment::changed] (ref=signal)} signals into one
     * by calling g_object_freeze_notify() and g_object_thaw_notify()
     * around the calls to the individual setters.
     * 
     * Alternatively, using a single g_object_set() for all the properties
     * to change, or using {@link org.gtk.gtk.Adjustment<code>#configure</code>  has the same effect.
     */
    public void setLower(double lower) {
        gtk_h.gtk_adjustment_set_lower(handle(), lower);
    }
    
    /**
     * Sets the page increment of the adjustment.
     * 
     * See {@link org.gtk.gtk.Adjustment<code>#setLower</code>  about how to compress
     * multiple emissions of the {@link [signal@Gtk.Adjustment::changed] (ref=signal)}
     * signal when setting multiple adjustment properties.
     */
    public void setPageIncrement(double pageIncrement) {
        gtk_h.gtk_adjustment_set_page_increment(handle(), pageIncrement);
    }
    
    /**
     * Sets the page size of the adjustment.
     * 
     * See {@link org.gtk.gtk.Adjustment<code>#setLower</code>  about how to compress
     * multiple emissions of the {@link [signal@Gtk.Adjustment::changed] (ref=signal)}
     * signal when setting multiple adjustment properties.
     */
    public void setPageSize(double pageSize) {
        gtk_h.gtk_adjustment_set_page_size(handle(), pageSize);
    }
    
    /**
     * Sets the step increment of the adjustment.
     * 
     * See {@link org.gtk.gtk.Adjustment<code>#setLower</code>  about how to compress
     * multiple emissions of the {@link [signal@Gtk.Adjustment::changed] (ref=signal)}
     * signal when setting multiple adjustment properties.
     */
    public void setStepIncrement(double stepIncrement) {
        gtk_h.gtk_adjustment_set_step_increment(handle(), stepIncrement);
    }
    
    /**
     * Sets the maximum value of the adjustment.
     * <p>
     * Note that values will be restricted by <code>upper - page-size</code>
     * if the page-size property is nonzero.
     * 
     * See {@link org.gtk.gtk.Adjustment<code>#setLower</code>  about how to compress
     * multiple emissions of the {@link [signal@Gtk.Adjustment::changed] (ref=signal)}
     * signal when setting multiple adjustment properties.
     */
    public void setUpper(double upper) {
        gtk_h.gtk_adjustment_set_upper(handle(), upper);
    }
    
    /**
     * Sets the <code>GtkAdjustment</code> value.
     * <p>
     * The value is clamped to lie between {@link [property@Gtk.Adjustment:lower] (ref=property)}
     * and {@link [property@Gtk.Adjustment:upper] (ref=property)}.
     * <p>
     * Note that for adjustments which are used in a <code>GtkScrollbar</code>,
     * the effective range of allowed values goes from
     * {@link [property@Gtk.Adjustment:lower] (ref=property)} to
     * {@link [property@Gtk.Adjustment:upper] (ref=property)} - {@link [property@Gtk.Adjustment:page-size] (ref=property)}.
     */
    public void setValue(double value) {
        gtk_h.gtk_adjustment_set_value(handle(), value);
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(Adjustment source);
    }
    
    /**
     * Emitted when one or more of the <code>GtkAdjustment</code> properties have been
     * changed.
     * 
     * Note that the {@link [property@Gtk.Adjustment:value] (ref=property)} property is
     * covered by the {@link [signal@Gtk.Adjustment::value-changed] (ref=signal)} signal.
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAdjustmentChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
    public SignalHandle onValueChanged(ValueChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAdjustmentValueChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("value-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
