package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkRange` is the common base class for widgets which visualize an
 * adjustment.
 * 
 * Widgets that are derived from `GtkRange` include
 * [class@Gtk.Scale] and [class@Gtk.Scrollbar].
 * 
 * Apart from signals for monitoring the parameters of the adjustment,
 * `GtkRange` provides properties and methods for setting a
 * “fill level” on range widgets. See [method@Gtk.Range.set_fill_level].
 */
public class Range extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public Range(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Range */
    public static Range castFrom(org.gtk.gobject.Object gobject) {
        return new Range(gobject.getReference());
    }
    
    /**
     * Get the adjustment which is the “model” object for `GtkRange`.
     */
    public Adjustment getAdjustment() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_get_adjustment(HANDLE());
        return new Adjustment(References.get(RESULT, false));
    }
    
    /**
     * Gets the current position of the fill level indicator.
     */
    public double getFillLevel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_get_fill_level(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets whether the `GtkRange` respects text direction.
     * 
     * See [method@Gtk.Range.set_flippable].
     */
    public boolean getFlippable() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_get_flippable(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether the range is inverted.
     * 
     * See [method@Gtk.Range.set_inverted].
     */
    public boolean getInverted() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_get_inverted(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * This function returns the area that contains the range’s trough,
     * in coordinates relative to @range's origin.
     * 
     * This function is useful mainly for `GtkRange` subclasses.
     */
    public void getRangeRect(org.gtk.gdk.Rectangle rangeRect) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_get_range_rect(HANDLE(), rangeRect.HANDLE());
    }
    
    /**
     * Gets whether the range is restricted to the fill level.
     */
    public boolean getRestrictToFillLevel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_get_restrict_to_fill_level(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the number of digits to round the value to when
     * it changes.
     * 
     * See [signal@Gtk.Range::change-value].
     */
    public int getRoundDigits() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_get_round_digits(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets whether the range displays the fill level graphically.
     */
    public boolean getShowFillLevel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_get_show_fill_level(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * This function is useful mainly for `GtkRange` subclasses.
     * 
     * See [method@Gtk.Range.set_slider_size_fixed].
     */
    public boolean getSliderSizeFixed() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_get_slider_size_fixed(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the current value of the range.
     */
    public double getValue() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_get_value(HANDLE());
        return RESULT;
    }
    
    /**
     * Sets the adjustment to be used as the “model” object for the `GtkRange`
     * 
     * The adjustment indicates the current range value, the minimum and
     * maximum range values, the step/page increments used for keybindings
     * and scrolling, and the page size.
     * 
     * The page size is normally 0 for `GtkScale` and nonzero for `GtkScrollbar`,
     * and indicates the size of the visible area of the widget being scrolled.
     * The page size affects the size of the scrollbar slider.
     */
    public void setAdjustment(Adjustment adjustment) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_set_adjustment(HANDLE(), adjustment.HANDLE());
    }
    
    /**
     * Set the new position of the fill level indicator.
     * 
     * The “fill level” is probably best described by its most prominent
     * use case, which is an indicator for the amount of pre-buffering in
     * a streaming media player. In that use case, the value of the range
     * would indicate the current play position, and the fill level would
     * be the position up to which the file/stream has been downloaded.
     * 
     * This amount of prebuffering can be displayed on the range’s trough
     * and is themeable separately from the trough. To enable fill level
     * display, use [method@Gtk.Range.set_show_fill_level]. The range defaults
     * to not showing the fill level.
     * 
     * Additionally, it’s possible to restrict the range’s slider position
     * to values which are smaller than the fill level. This is controlled
     * by [method@Gtk.Range.set_restrict_to_fill_level] and is by default
     * enabled.
     */
    public void setFillLevel(double fillLevel) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_set_fill_level(HANDLE(), fillLevel);
    }
    
    /**
     * Sets whether the `GtkRange` respects text direction.
     * 
     * If a range is flippable, it will switch its direction
     * if it is horizontal and its direction is %GTK_TEXT_DIR_RTL.
     * 
     * See [method@Gtk.Widget.get_direction].
     */
    public void setFlippable(boolean flippable) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_set_flippable(HANDLE(), flippable ? 1 : 0);
    }
    
    /**
     * Sets the step and page sizes for the range.
     * 
     * The step size is used when the user clicks the `GtkScrollbar`
     * arrows or moves a `GtkScale` via arrow keys. The page size
     * is used for example when moving via Page Up or Page Down keys.
     */
    public void setIncrements(double step, double page) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_set_increments(HANDLE(), step, page);
    }
    
    /**
     * Sets whether to invert the range.
     * 
     * Ranges normally move from lower to higher values as the
     * slider moves from top to bottom or left to right. Inverted
     * ranges have higher values at the top or on the right rather
     * than on the bottom or left.
     */
    public void setInverted(boolean setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_set_inverted(HANDLE(), setting ? 1 : 0);
    }
    
    /**
     * Sets the allowable values in the `GtkRange`.
     * 
     * The range value is clamped to be between @min and @max.
     * (If the range has a non-zero page size, it is clamped
     * between @min and @max - page-size.)
     */
    public void setRange(double min, double max) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_set_range(HANDLE(), min, max);
    }
    
    /**
     * Sets whether the slider is restricted to the fill level.
     * 
     * See [method@Gtk.Range.set_fill_level] for a general description
     * of the fill level concept.
     */
    public void setRestrictToFillLevel(boolean restrictToFillLevel) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_set_restrict_to_fill_level(HANDLE(), restrictToFillLevel ? 1 : 0);
    }
    
    /**
     * Sets the number of digits to round the value to when
     * it changes.
     * 
     * See [signal@Gtk.Range::change-value].
     */
    public void setRoundDigits(int roundDigits) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_set_round_digits(HANDLE(), roundDigits);
    }
    
    /**
     * Sets whether a graphical fill level is show on the trough.
     * 
     * See [method@Gtk.Range.set_fill_level] for a general description
     * of the fill level concept.
     */
    public void setShowFillLevel(boolean showFillLevel) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_set_show_fill_level(HANDLE(), showFillLevel ? 1 : 0);
    }
    
    /**
     * Sets whether the range’s slider has a fixed size, or a size that
     * depends on its adjustment’s page size.
     * 
     * This function is useful mainly for `GtkRange` subclasses.
     */
    public void setSliderSizeFixed(boolean sizeFixed) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_set_slider_size_fixed(HANDLE(), sizeFixed ? 1 : 0);
    }
    
    /**
     * Sets the current value of the range.
     * 
     * If the value is outside the minimum or maximum range values,
     * it will be clamped to fit inside them. The range emits the
     * [signal@Gtk.Range::value-changed] signal if the value changes.
     */
    public void setValue(double value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_range_set_value(HANDLE(), value);
    }
    
    @FunctionalInterface
    public interface AdjustBoundsHandler {
        void signalReceived(Range source, double value);
    }
    
    /**
     * Emitted before clamping a value, to give the application a
     * chance to adjust the bounds.
     */
    public void onAdjustBounds(AdjustBoundsHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalRangeAdjustBounds", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("adjust-bounds").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * 
     * It allows an application to determine the type of scroll event
     * that occurred and the resultant new value. The application can
     * handle the event itself and return %TRUE to prevent further
     * processing. Or, by returning %FALSE, it can pass the event to
     * other handlers until the default GTK handler is reached.
     * 
     * The value parameter is unrounded. An application that overrides
     * the ::change-value signal is responsible for clamping the value
     * to the desired number of decimal digits; the default GTK
     * handler clamps the value based on [property@Gtk.Range:round-digits].
     */
    public void onChangeValue(ChangeValueHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalRangeChangeValue", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("change-value").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * 
     * Used for keybindings.
     */
    public void onMoveSlider(MoveSliderHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalRangeMoveSlider", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("move-slider").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
    public void onValueChanged(ValueChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalRangeValueChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("value-changed").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
