package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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

    public Range(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Range */
    public static Range castFrom(org.gtk.gobject.Object gobject) {
        return new Range(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_range_get_adjustment = Interop.downcallHandle(
        "gtk_range_get_adjustment",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the adjustment which is the “model” object for {@code GtkRange}.
     */
    public @NotNull Adjustment getAdjustment() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_range_get_adjustment.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Adjustment(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_range_get_fill_level = Interop.downcallHandle(
        "gtk_range_get_fill_level",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current position of the fill level indicator.
     */
    public double getFillLevel() {
        double RESULT;
        try {
            RESULT = (double) gtk_range_get_fill_level.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_range_get_flippable = Interop.downcallHandle(
        "gtk_range_get_flippable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the {@code GtkRange} respects text direction.
     * <p>
     * See {@link Range#setFlippable}.
     */
    public boolean getFlippable() {
        int RESULT;
        try {
            RESULT = (int) gtk_range_get_flippable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_range_get_inverted = Interop.downcallHandle(
        "gtk_range_get_inverted",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the range is inverted.
     * <p>
     * See {@link Range#setInverted}.
     */
    public boolean getInverted() {
        int RESULT;
        try {
            RESULT = (int) gtk_range_get_inverted.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_range_get_range_rect = Interop.downcallHandle(
        "gtk_range_get_range_rect",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function returns the area that contains the range’s trough,
     * in coordinates relative to {@code range}'s origin.
     * <p>
     * This function is useful mainly for {@code GtkRange} subclasses.
     */
    public @NotNull void getRangeRect(@NotNull Out<org.gtk.gdk.Rectangle> rangeRect) {
        MemorySegment rangeRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            gtk_range_get_range_rect.invokeExact(handle(), (Addressable) rangeRectPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        rangeRect.set(new org.gtk.gdk.Rectangle(Refcounted.get(rangeRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle gtk_range_get_restrict_to_fill_level = Interop.downcallHandle(
        "gtk_range_get_restrict_to_fill_level",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the range is restricted to the fill level.
     */
    public boolean getRestrictToFillLevel() {
        int RESULT;
        try {
            RESULT = (int) gtk_range_get_restrict_to_fill_level.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_range_get_round_digits = Interop.downcallHandle(
        "gtk_range_get_round_digits",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of digits to round the value to when
     * it changes.
     * <p>
     * See {@code Gtk.Range::change-value}.
     */
    public int getRoundDigits() {
        int RESULT;
        try {
            RESULT = (int) gtk_range_get_round_digits.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_range_get_show_fill_level = Interop.downcallHandle(
        "gtk_range_get_show_fill_level",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the range displays the fill level graphically.
     */
    public boolean getShowFillLevel() {
        int RESULT;
        try {
            RESULT = (int) gtk_range_get_show_fill_level.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_range_get_slider_range = Interop.downcallHandle(
        "gtk_range_get_slider_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function returns sliders range along the long dimension,
     * in widget->window coordinates.
     * <p>
     * This function is useful mainly for {@code GtkRange} subclasses.
     */
    public @NotNull void getSliderRange(@NotNull Out<Integer> sliderStart, @NotNull Out<Integer> sliderEnd) {
        MemorySegment sliderStartPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment sliderEndPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            gtk_range_get_slider_range.invokeExact(handle(), (Addressable) sliderStartPOINTER.address(), (Addressable) sliderEndPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sliderStart.set(sliderStartPOINTER.get(ValueLayout.JAVA_INT, 0));
        sliderEnd.set(sliderEndPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    private static final MethodHandle gtk_range_get_slider_size_fixed = Interop.downcallHandle(
        "gtk_range_get_slider_size_fixed",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * This function is useful mainly for {@code GtkRange} subclasses.
     * <p>
     * See {@link Range#setSliderSizeFixed}.
     */
    public boolean getSliderSizeFixed() {
        int RESULT;
        try {
            RESULT = (int) gtk_range_get_slider_size_fixed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_range_get_value = Interop.downcallHandle(
        "gtk_range_get_value",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current value of the range.
     */
    public double getValue() {
        double RESULT;
        try {
            RESULT = (double) gtk_range_get_value.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_range_set_adjustment = Interop.downcallHandle(
        "gtk_range_set_adjustment",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void setAdjustment(@NotNull Adjustment adjustment) {
        try {
            gtk_range_set_adjustment.invokeExact(handle(), adjustment.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_range_set_fill_level = Interop.downcallHandle(
        "gtk_range_set_fill_level",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
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
    public @NotNull void setFillLevel(@NotNull double fillLevel) {
        try {
            gtk_range_set_fill_level.invokeExact(handle(), fillLevel);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_range_set_flippable = Interop.downcallHandle(
        "gtk_range_set_flippable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the {@code GtkRange} respects text direction.
     * <p>
     * If a range is flippable, it will switch its direction
     * if it is horizontal and its direction is {@link TextDirection#RTL}.
     * <p>
     * See {@link Widget#getDirection}.
     */
    public @NotNull void setFlippable(@NotNull boolean flippable) {
        try {
            gtk_range_set_flippable.invokeExact(handle(), flippable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_range_set_increments = Interop.downcallHandle(
        "gtk_range_set_increments",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the step and page sizes for the range.
     * <p>
     * The step size is used when the user clicks the {@code GtkScrollbar}
     * arrows or moves a {@code GtkScale} via arrow keys. The page size
     * is used for example when moving via Page Up or Page Down keys.
     */
    public @NotNull void setIncrements(@NotNull double step, @NotNull double page) {
        try {
            gtk_range_set_increments.invokeExact(handle(), step, page);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_range_set_inverted = Interop.downcallHandle(
        "gtk_range_set_inverted",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether to invert the range.
     * <p>
     * Ranges normally move from lower to higher values as the
     * slider moves from top to bottom or left to right. Inverted
     * ranges have higher values at the top or on the right rather
     * than on the bottom or left.
     */
    public @NotNull void setInverted(@NotNull boolean setting) {
        try {
            gtk_range_set_inverted.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_range_set_range = Interop.downcallHandle(
        "gtk_range_set_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the allowable values in the {@code GtkRange}.
     * <p>
     * The range value is clamped to be between {@code min} and {@code max}.
     * (If the range has a non-zero page size, it is clamped
     * between {@code min} and {@code max} - page-size.)
     */
    public @NotNull void setRange(@NotNull double min, @NotNull double max) {
        try {
            gtk_range_set_range.invokeExact(handle(), min, max);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_range_set_restrict_to_fill_level = Interop.downcallHandle(
        "gtk_range_set_restrict_to_fill_level",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the slider is restricted to the fill level.
     * <p>
     * See {@link Range#setFillLevel} for a general description
     * of the fill level concept.
     */
    public @NotNull void setRestrictToFillLevel(@NotNull boolean restrictToFillLevel) {
        try {
            gtk_range_set_restrict_to_fill_level.invokeExact(handle(), restrictToFillLevel ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_range_set_round_digits = Interop.downcallHandle(
        "gtk_range_set_round_digits",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the number of digits to round the value to when
     * it changes.
     * <p>
     * See {@code Gtk.Range::change-value}.
     */
    public @NotNull void setRoundDigits(@NotNull int roundDigits) {
        try {
            gtk_range_set_round_digits.invokeExact(handle(), roundDigits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_range_set_show_fill_level = Interop.downcallHandle(
        "gtk_range_set_show_fill_level",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether a graphical fill level is show on the trough.
     * <p>
     * See {@link Range#setFillLevel} for a general description
     * of the fill level concept.
     */
    public @NotNull void setShowFillLevel(@NotNull boolean showFillLevel) {
        try {
            gtk_range_set_show_fill_level.invokeExact(handle(), showFillLevel ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_range_set_slider_size_fixed = Interop.downcallHandle(
        "gtk_range_set_slider_size_fixed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the range’s slider has a fixed size, or a size that
     * depends on its adjustment’s page size.
     * <p>
     * This function is useful mainly for {@code GtkRange} subclasses.
     */
    public @NotNull void setSliderSizeFixed(@NotNull boolean sizeFixed) {
        try {
            gtk_range_set_slider_size_fixed.invokeExact(handle(), sizeFixed ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_range_set_value = Interop.downcallHandle(
        "gtk_range_set_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the current value of the range.
     * <p>
     * If the value is outside the minimum or maximum range values,
     * it will be clamped to fit inside them. The range emits the
     * {@code Gtk.Range::value-changed} signal if the value changes.
     */
    public @NotNull void setValue(@NotNull double value) {
        try {
            gtk_range_set_value.invokeExact(handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface AdjustBoundsHandler {
        void signalReceived(Range source, @NotNull double value);
    }
    
    /**
     * Emitted before clamping a value, to give the application a
     * chance to adjust the bounds.
     */
    public SignalHandle onAdjustBounds(AdjustBoundsHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("adjust-bounds"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Range.Callbacks.class, "signalRangeAdjustBounds",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ChangeValueHandler {
        boolean signalReceived(Range source, @NotNull ScrollType scroll, @NotNull double value);
    }
    
    /**
     * Emitted when a scroll action is performed on a range.
     * <p>
     * It allows an application to determine the type of scroll event
     * that occurred and the resultant new value. The application can
     * handle the event itself and return {@code true} to prevent further
     * processing. Or, by returning {@code false}, it can pass the event to
     * other handlers until the default GTK handler is reached.
     * <p>
     * The value parameter is unrounded. An application that overrides
     * the ::change-value signal is responsible for clamping the value
     * to the desired number of decimal digits; the default GTK
     * handler clamps the value based on {@code Gtk.Range:round-digits}.
     */
    public SignalHandle onChangeValue(ChangeValueHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("change-value"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Range.Callbacks.class, "signalRangeChangeValue",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MoveSliderHandler {
        void signalReceived(Range source, @NotNull ScrollType step);
    }
    
    /**
     * Virtual function that moves the slider.
     * <p>
     * Used for keybindings.
     */
    public SignalHandle onMoveSlider(MoveSliderHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-slider"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Range.Callbacks.class, "signalRangeMoveSlider",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
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
        void signalReceived(Range source);
    }
    
    /**
     * Emitted when the range value changes.
     */
    public SignalHandle onValueChanged(ValueChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("value-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Range.Callbacks.class, "signalRangeValueChanged",
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
    
        public static void signalRangeAdjustBounds(MemoryAddress source, double value, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Range.AdjustBoundsHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Range(Refcounted.get(source)), value);
        }
        
        public static boolean signalRangeChangeValue(MemoryAddress source, int scroll, double value, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Range.ChangeValueHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new Range(Refcounted.get(source)), new ScrollType(scroll), value);
        }
        
        public static void signalRangeMoveSlider(MemoryAddress source, int step, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Range.MoveSliderHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Range(Refcounted.get(source)), new ScrollType(step));
        }
        
        public static void signalRangeValueChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Range.ValueChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Range(Refcounted.get(source)));
        }
        
    }
}
