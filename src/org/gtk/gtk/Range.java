package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkRange} is the common base class for widgets which visualize an
 * adjustment.
 * <p>
 * Widgets that are derived from {@code GtkRange} include
 * {@code Gtk.Scrollbar}.
 * <p>
 * Apart from signals for monitoring the parameters of the adjustment,
 * {@code GtkRange} provides properties and methods for setting a
 * “fill level” on range widgets. See {@link Range#setFillLevel}.
 */
public class Range extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public Range(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Range */
    public static Range castFrom(org.gtk.gobject.Object gobject) {
        return new Range(gobject.getReference());
    }
    
    /**
     * Get the adjustment which is the “model” object for {@code GtkRange}.
     */
    public Adjustment getAdjustment() {
        var RESULT = gtk_h.gtk_range_get_adjustment(handle());
        return new Adjustment(References.get(RESULT, false));
    }
    
    /**
     * Gets the current position of the fill level indicator.
     */
    public double getFillLevel() {
        var RESULT = gtk_h.gtk_range_get_fill_level(handle());
        return RESULT;
    }
    
    /**
     * Gets whether the {@code GtkRange} respects text direction.
     * <p>
     * See {@link Range#setFlippable}.
     */
    public boolean getFlippable() {
        var RESULT = gtk_h.gtk_range_get_flippable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether the range is inverted.
     * <p>
     * See {@link Range#setInverted}.
     */
    public boolean getInverted() {
        var RESULT = gtk_h.gtk_range_get_inverted(handle());
        return (RESULT != 0);
    }
    
    /**
     * This function returns the area that contains the range’s trough,
     * in coordinates relative to {@code range}'s origin.
     * <p>
     * This function is useful mainly for {@code GtkRange} subclasses.
     */
    public void getRangeRect(org.gtk.gdk.Rectangle rangeRect) {
        gtk_h.gtk_range_get_range_rect(handle(), rangeRect.handle());
    }
    
    /**
     * Gets whether the range is restricted to the fill level.
     */
    public boolean getRestrictToFillLevel() {
        var RESULT = gtk_h.gtk_range_get_restrict_to_fill_level(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the number of digits to round the value to when
     * it changes.
     * <p>
     * See {@code Gtk.Range::change-value}.
     */
    public int getRoundDigits() {
        var RESULT = gtk_h.gtk_range_get_round_digits(handle());
        return RESULT;
    }
    
    /**
     * Gets whether the range displays the fill level graphically.
     */
    public boolean getShowFillLevel() {
        var RESULT = gtk_h.gtk_range_get_show_fill_level(handle());
        return (RESULT != 0);
    }
    
    /**
     * This function is useful mainly for {@code GtkRange} subclasses.
     * <p>
     * See {@link Range#setSliderSizeFixed}.
     */
    public boolean getSliderSizeFixed() {
        var RESULT = gtk_h.gtk_range_get_slider_size_fixed(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the current value of the range.
     */
    public double getValue() {
        var RESULT = gtk_h.gtk_range_get_value(handle());
        return RESULT;
    }
    
    /**
     * Sets the adjustment to be used as the “model” object for the {@code GtkRange}
     * <p>
     * The adjustment indicates the current range value, the minimum and
     * maximum range values, the step/page increments used for keybindings
     * and scrolling, and the page size.
     * <p>
     * The page size is normally 0 for {@code GtkScale} and nonzero for {@code GtkScrollbar},
     * and indicates the size of the visible area of the widget being scrolled.
     * The page size affects the size of the scrollbar slider.
     */
    public void setAdjustment(Adjustment adjustment) {
        gtk_h.gtk_range_set_adjustment(handle(), adjustment.handle());
    }
    
    /**
     * Set the new position of the fill level indicator.
     * <p>
     * The “fill level” is probably best described by its most prominent
     * use case, which is an indicator for the amount of pre-buffering in
     * a streaming media player. In that use case, the value of the range
     * would indicate the current play position, and the fill level would
     * be the position up to which the file/stream has been downloaded.
     * <p>
     * This amount of prebuffering can be displayed on the range’s trough
     * and is themeable separately from the trough. To enable fill level
     * display, use {@link Range#setShowFillLevel}. The range defaults
     * to not showing the fill level.
     * <p>
     * Additionally, it’s possible to restrict the range’s slider position
     * to values which are smaller than the fill level. This is controlled
     * by {@link Range#setRestrictToFillLevel} and is by default
     * enabled.
     */
    public void setFillLevel(double fillLevel) {
        gtk_h.gtk_range_set_fill_level(handle(), fillLevel);
    }
    
    /**
     * Sets whether the {@code GtkRange} respects text direction.
     * <p>
     * If a range is flippable, it will switch its direction
     * if it is horizontal and its direction is {@link TextDirection#RTL}.
     * <p>
     * See {@link Widget#getDirection}.
     */
    public void setFlippable(boolean flippable) {
        gtk_h.gtk_range_set_flippable(handle(), flippable ? 1 : 0);
    }
    
    /**
     * Sets the step and page sizes for the range.
     * <p>
     * The step size is used when the user clicks the {@code GtkScrollbar}
     * arrows or moves a {@code GtkScale} via arrow keys. The page size
     * is used for example when moving via Page Up or Page Down keys.
     */
    public void setIncrements(double step, double page) {
        gtk_h.gtk_range_set_increments(handle(), step, page);
    }
    
    /**
     * Sets whether to invert the range.
     * <p>
     * Ranges normally move from lower to higher values as the
     * slider moves from top to bottom or left to right. Inverted
     * ranges have higher values at the top or on the right rather
     * than on the bottom or left.
     */
    public void setInverted(boolean setting) {
        gtk_h.gtk_range_set_inverted(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets the allowable values in the {@code GtkRange}.
     * <p>
     * The range value is clamped to be between {@code min} and {@code max}.
     * (If the range has a non-zero page size, it is clamped
     * between {@code min} and {@code max} - page-size.)
     */
    public void setRange(double min, double max) {
        gtk_h.gtk_range_set_range(handle(), min, max);
    }
    
    /**
     * Sets whether the slider is restricted to the fill level.
     * <p>
     * See {@link Range#setFillLevel} for a general description
     * of the fill level concept.
     */
    public void setRestrictToFillLevel(boolean restrictToFillLevel) {
        gtk_h.gtk_range_set_restrict_to_fill_level(handle(), restrictToFillLevel ? 1 : 0);
    }
    
    /**
     * Sets the number of digits to round the value to when
     * it changes.
     * <p>
     * See {@code Gtk.Range::change-value}.
     */
    public void setRoundDigits(int roundDigits) {
        gtk_h.gtk_range_set_round_digits(handle(), roundDigits);
    }
    
    /**
     * Sets whether a graphical fill level is show on the trough.
     * <p>
     * See {@link Range#setFillLevel} for a general description
     * of the fill level concept.
     */
    public void setShowFillLevel(boolean showFillLevel) {
        gtk_h.gtk_range_set_show_fill_level(handle(), showFillLevel ? 1 : 0);
    }
    
    /**
     * Sets whether the range’s slider has a fixed size, or a size that
     * depends on its adjustment’s page size.
     * <p>
     * This function is useful mainly for {@code GtkRange} subclasses.
     */
    public void setSliderSizeFixed(boolean sizeFixed) {
        gtk_h.gtk_range_set_slider_size_fixed(handle(), sizeFixed ? 1 : 0);
    }
    
    /**
     * Sets the current value of the range.
     * <p>
     * If the value is outside the minimum or maximum range values,
     * it will be clamped to fit inside them. The range emits the
     * {@code Gtk.Range::value-changed} signal if the value changes.
     */
    public void setValue(double value) {
        gtk_h.gtk_range_set_value(handle(), value);
    }
    
    @FunctionalInterface
    public interface AdjustBoundsHandler {
        void signalReceived(Range source, double value);
    }
    
    /**
     * Emitted before clamping a value, to give the application a
     * chance to adjust the bounds.
     */
    public SignalHandle onAdjustBounds(AdjustBoundsHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalRangeAdjustBounds", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("adjust-bounds").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ChangeValueHandler {
        boolean signalReceived(Range source, ScrollType scroll, double value);
    }
    
    /**
     * Emitted when a scroll action is performed on a range.
     * <p>
     * It allows an application to determine the type of scroll event
     * that occurred and the resultant new value. The application can
     * handle the event itself and return <code>true</code> to prevent further
     * processing. Or, by returning <code>false</code>, it can pass the event to
     * other handlers until the default GTK handler is reached.
     * <p>
     * The value parameter is unrounded. An application that overrides
     * the ::change-value signal is responsible for clamping the value
     * to the desired number of decimal digits; the default GTK
     * handler clamps the value based on {@code Gtk.Range:round-digits}.
     */
    public SignalHandle onChangeValue(ChangeValueHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalRangeChangeValue", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("change-value").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MoveSliderHandler {
        void signalReceived(Range source, ScrollType step);
    }
    
    /**
     * Virtual function that moves the slider.
     * <p>
     * Used for keybindings.
     */
    public SignalHandle onMoveSlider(MoveSliderHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalRangeMoveSlider", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("move-slider").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ValueChangedHandler {
        void signalReceived(Range source);
    }
    
    /**
     * Emitted when the range value changes.
     */
    public SignalHandle onValueChanged(ValueChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalRangeValueChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("value-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
