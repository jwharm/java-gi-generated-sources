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
 * {@link Scale}.
 * <p>
 * Apart from signals for monitoring the parameters of the adjustment,
 * {@code GtkRange} provides properties and methods for setting a
 * “fill level” on range widgets. See {@link Range#setFillLevel}.
 */
public class Range extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkRange";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
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
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gtk.Widget parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gtk.Widget(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a Range proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Range(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Range if its GType is a (or inherits from) "GtkRange".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Range" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkRange", a ClassCastException will be thrown.
     */
    public static Range castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkRange"))) {
            return new Range(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkRange");
        }
    }
    
    /**
     * Get the adjustment which is the “model” object for {@code GtkRange}.
     * @return a {@code GtkAdjustment}
     */
    public @NotNull org.gtk.gtk.Adjustment getAdjustment() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_range_get_adjustment.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Adjustment(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the current position of the fill level indicator.
     * @return The current fill level
     */
    public double getFillLevel() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_range_get_fill_level.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets whether the {@code GtkRange} respects text direction.
     * <p>
     * See {@link Range#setFlippable}.
     * @return {@code true} if the range is flippable
     */
    public boolean getFlippable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_range_get_flippable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether the range is inverted.
     * <p>
     * See {@link Range#setInverted}.
     * @return {@code true} if the range is inverted
     */
    public boolean getInverted() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_range_get_inverted.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * This function returns the area that contains the range’s trough,
     * in coordinates relative to {@code range}'s origin.
     * <p>
     * This function is useful mainly for {@code GtkRange} subclasses.
     * @param rangeRect return location for the range rectangle
     */
    public void getRangeRect(@NotNull org.gtk.gdk.Rectangle rangeRect) {
        java.util.Objects.requireNonNull(rangeRect, "Parameter 'rangeRect' must not be null");
        try {
            DowncallHandles.gtk_range_get_range_rect.invokeExact(
                    handle(),
                    rangeRect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets whether the range is restricted to the fill level.
     * @return {@code true} if {@code range} is restricted to the fill level.
     */
    public boolean getRestrictToFillLevel() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_range_get_restrict_to_fill_level.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the number of digits to round the value to when
     * it changes.
     * <p>
     * See {@code Gtk.Range::change-value}.
     * @return the number of digits to round to
     */
    public int getRoundDigits() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_range_get_round_digits.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets whether the range displays the fill level graphically.
     * @return {@code true} if {@code range} shows the fill level.
     */
    public boolean getShowFillLevel() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_range_get_show_fill_level.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * This function returns sliders range along the long dimension,
     * in widget-&gt;window coordinates.
     * <p>
     * This function is useful mainly for {@code GtkRange} subclasses.
     * @param sliderStart return location for the slider's start
     * @param sliderEnd return location for the slider's end
     */
    public void getSliderRange(Out<Integer> sliderStart, Out<Integer> sliderEnd) {
        java.util.Objects.requireNonNull(sliderStart, "Parameter 'sliderStart' must not be null");
        java.util.Objects.requireNonNull(sliderEnd, "Parameter 'sliderEnd' must not be null");
        MemorySegment sliderStartPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment sliderEndPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.gtk_range_get_slider_range.invokeExact(
                    handle(),
                    (Addressable) sliderStartPOINTER.address(),
                    (Addressable) sliderEndPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sliderStart.set(sliderStartPOINTER.get(ValueLayout.JAVA_INT, 0));
        sliderEnd.set(sliderEndPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    /**
     * This function is useful mainly for {@code GtkRange} subclasses.
     * <p>
     * See {@link Range#setSliderSizeFixed}.
     * @return whether the range’s slider has a fixed size.
     */
    public boolean getSliderSizeFixed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_range_get_slider_size_fixed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the current value of the range.
     * @return current value of the range.
     */
    public double getValue() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_range_get_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param adjustment a {@code GtkAdjustment}
     */
    public void setAdjustment(@NotNull org.gtk.gtk.Adjustment adjustment) {
        java.util.Objects.requireNonNull(adjustment, "Parameter 'adjustment' must not be null");
        try {
            DowncallHandles.gtk_range_set_adjustment.invokeExact(
                    handle(),
                    adjustment.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param fillLevel the new position of the fill level indicator
     */
    public void setFillLevel(double fillLevel) {
        try {
            DowncallHandles.gtk_range_set_fill_level.invokeExact(
                    handle(),
                    fillLevel);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the {@code GtkRange} respects text direction.
     * <p>
     * If a range is flippable, it will switch its direction
     * if it is horizontal and its direction is {@link TextDirection#RTL}.
     * <p>
     * See {@link Widget#getDirection}.
     * @param flippable {@code true} to make the range flippable
     */
    public void setFlippable(boolean flippable) {
        try {
            DowncallHandles.gtk_range_set_flippable.invokeExact(
                    handle(),
                    flippable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the step and page sizes for the range.
     * <p>
     * The step size is used when the user clicks the {@code GtkScrollbar}
     * arrows or moves a {@code GtkScale} via arrow keys. The page size
     * is used for example when moving via Page Up or Page Down keys.
     * @param step step size
     * @param page page size
     */
    public void setIncrements(double step, double page) {
        try {
            DowncallHandles.gtk_range_set_increments.invokeExact(
                    handle(),
                    step,
                    page);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to invert the range.
     * <p>
     * Ranges normally move from lower to higher values as the
     * slider moves from top to bottom or left to right. Inverted
     * ranges have higher values at the top or on the right rather
     * than on the bottom or left.
     * @param setting {@code true} to invert the range
     */
    public void setInverted(boolean setting) {
        try {
            DowncallHandles.gtk_range_set_inverted.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the allowable values in the {@code GtkRange}.
     * <p>
     * The range value is clamped to be between {@code min} and {@code max}.
     * (If the range has a non-zero page size, it is clamped
     * between {@code min} and {@code max} - page-size.)
     * @param min minimum range value
     * @param max maximum range value
     */
    public void setRange(double min, double max) {
        try {
            DowncallHandles.gtk_range_set_range.invokeExact(
                    handle(),
                    min,
                    max);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the slider is restricted to the fill level.
     * <p>
     * See {@link Range#setFillLevel} for a general description
     * of the fill level concept.
     * @param restrictToFillLevel Whether the fill level restricts slider movement.
     */
    public void setRestrictToFillLevel(boolean restrictToFillLevel) {
        try {
            DowncallHandles.gtk_range_set_restrict_to_fill_level.invokeExact(
                    handle(),
                    restrictToFillLevel ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the number of digits to round the value to when
     * it changes.
     * <p>
     * See {@code Gtk.Range::change-value}.
     * @param roundDigits the precision in digits, or -1
     */
    public void setRoundDigits(int roundDigits) {
        try {
            DowncallHandles.gtk_range_set_round_digits.invokeExact(
                    handle(),
                    roundDigits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether a graphical fill level is show on the trough.
     * <p>
     * See {@link Range#setFillLevel} for a general description
     * of the fill level concept.
     * @param showFillLevel Whether a fill level indicator graphics is shown.
     */
    public void setShowFillLevel(boolean showFillLevel) {
        try {
            DowncallHandles.gtk_range_set_show_fill_level.invokeExact(
                    handle(),
                    showFillLevel ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the range’s slider has a fixed size, or a size that
     * depends on its adjustment’s page size.
     * <p>
     * This function is useful mainly for {@code GtkRange} subclasses.
     * @param sizeFixed {@code true} to make the slider size constant
     */
    public void setSliderSizeFixed(boolean sizeFixed) {
        try {
            DowncallHandles.gtk_range_set_slider_size_fixed.invokeExact(
                    handle(),
                    sizeFixed ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the current value of the range.
     * <p>
     * If the value is outside the minimum or maximum range values,
     * it will be clamped to fit inside them. The range emits the
     * {@code Gtk.Range::value-changed} signal if the value changes.
     * @param value new value of the range
     */
    public void setValue(double value) {
        try {
            DowncallHandles.gtk_range_set_value.invokeExact(
                    handle(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface AdjustBounds {
        void signalReceived(Range source, double value);
    }
    
    /**
     * Emitted before clamping a value, to give the application a
     * chance to adjust the bounds.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Range.AdjustBounds> onAdjustBounds(Range.AdjustBounds handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("adjust-bounds"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Range.Callbacks.class, "signalRangeAdjustBounds",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Range.AdjustBounds>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ChangeValue {
        boolean signalReceived(Range source, @NotNull org.gtk.gtk.ScrollType scroll, double value);
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Range.ChangeValue> onChangeValue(Range.ChangeValue handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("change-value"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Range.Callbacks.class, "signalRangeChangeValue",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Range.ChangeValue>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MoveSlider {
        void signalReceived(Range source, @NotNull org.gtk.gtk.ScrollType step);
    }
    
    /**
     * Virtual function that moves the slider.
     * <p>
     * Used for keybindings.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Range.MoveSlider> onMoveSlider(Range.MoveSlider handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-slider"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Range.Callbacks.class, "signalRangeMoveSlider",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Range.MoveSlider>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ValueChanged {
        void signalReceived(Range source);
    }
    
    /**
     * Emitted when the range value changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Range.ValueChanged> onValueChanged(Range.ValueChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("value-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Range.Callbacks.class, "signalRangeValueChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Range.ValueChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_range_get_adjustment = Interop.downcallHandle(
            "gtk_range_get_adjustment",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_range_get_fill_level = Interop.downcallHandle(
            "gtk_range_get_fill_level",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_range_get_flippable = Interop.downcallHandle(
            "gtk_range_get_flippable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_range_get_inverted = Interop.downcallHandle(
            "gtk_range_get_inverted",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_range_get_range_rect = Interop.downcallHandle(
            "gtk_range_get_range_rect",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_range_get_restrict_to_fill_level = Interop.downcallHandle(
            "gtk_range_get_restrict_to_fill_level",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_range_get_round_digits = Interop.downcallHandle(
            "gtk_range_get_round_digits",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_range_get_show_fill_level = Interop.downcallHandle(
            "gtk_range_get_show_fill_level",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_range_get_slider_range = Interop.downcallHandle(
            "gtk_range_get_slider_range",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_range_get_slider_size_fixed = Interop.downcallHandle(
            "gtk_range_get_slider_size_fixed",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_range_get_value = Interop.downcallHandle(
            "gtk_range_get_value",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_range_set_adjustment = Interop.downcallHandle(
            "gtk_range_set_adjustment",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_range_set_fill_level = Interop.downcallHandle(
            "gtk_range_set_fill_level",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_range_set_flippable = Interop.downcallHandle(
            "gtk_range_set_flippable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_range_set_increments = Interop.downcallHandle(
            "gtk_range_set_increments",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_range_set_inverted = Interop.downcallHandle(
            "gtk_range_set_inverted",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_range_set_range = Interop.downcallHandle(
            "gtk_range_set_range",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_range_set_restrict_to_fill_level = Interop.downcallHandle(
            "gtk_range_set_restrict_to_fill_level",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_range_set_round_digits = Interop.downcallHandle(
            "gtk_range_set_round_digits",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_range_set_show_fill_level = Interop.downcallHandle(
            "gtk_range_set_show_fill_level",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_range_set_slider_size_fixed = Interop.downcallHandle(
            "gtk_range_set_slider_size_fixed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_range_set_value = Interop.downcallHandle(
            "gtk_range_set_value",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalRangeAdjustBounds(MemoryAddress source, double value, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Range.AdjustBounds) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Range(source, Ownership.UNKNOWN), value);
        }
        
        public static boolean signalRangeChangeValue(MemoryAddress source, int scroll, double value, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Range.ChangeValue) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new Range(source, Ownership.UNKNOWN), new org.gtk.gtk.ScrollType(scroll), value);
        }
        
        public static void signalRangeMoveSlider(MemoryAddress source, int step, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Range.MoveSlider) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Range(source, Ownership.UNKNOWN), new org.gtk.gtk.ScrollType(step));
        }
        
        public static void signalRangeValueChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Range.ValueChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Range(source, Ownership.UNKNOWN));
        }
    }
}
