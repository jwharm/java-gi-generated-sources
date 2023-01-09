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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Range proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Range(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Range> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Range(input);
    
    /**
     * Get the adjustment which is the “model” object for {@code GtkRange}.
     * @return a {@code GtkAdjustment}
     */
    public org.gtk.gtk.Adjustment getAdjustment() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_range_get_adjustment.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Adjustment) Interop.register(RESULT, org.gtk.gtk.Adjustment.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the current position of the fill level indicator.
     * @return The current fill level
     */
    public double getFillLevel() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_range_get_fill_level.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gtk_range_get_flippable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
            RESULT = (int) DowncallHandles.gtk_range_get_inverted.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * This function returns the area that contains the range’s trough,
     * in coordinates relative to {@code range}'s origin.
     * <p>
     * This function is useful mainly for {@code GtkRange} subclasses.
     * @param rangeRect return location for the range rectangle
     */
    public void getRangeRect(org.gtk.gdk.Rectangle rangeRect) {
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
            RESULT = (int) DowncallHandles.gtk_range_get_restrict_to_fill_level.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
            RESULT = (int) DowncallHandles.gtk_range_get_round_digits.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gtk_range_get_show_fill_level.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment sliderStartPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment sliderEndPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gtk_range_get_slider_range.invokeExact(
                        handle(),
                        (Addressable) (sliderStart == null ? MemoryAddress.NULL : (Addressable) sliderStartPOINTER.address()),
                        (Addressable) (sliderEnd == null ? MemoryAddress.NULL : (Addressable) sliderEndPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (sliderStart != null) sliderStart.set(sliderStartPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (sliderEnd != null) sliderEnd.set(sliderEndPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
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
            RESULT = (int) DowncallHandles.gtk_range_get_slider_size_fixed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the current value of the range.
     * @return current value of the range.
     */
    public double getValue() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_range_get_value.invokeExact(handle());
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
    public void setAdjustment(org.gtk.gtk.Adjustment adjustment) {
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
                    Marshal.booleanToInteger.marshal(flippable, null).intValue());
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
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
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
                    Marshal.booleanToInteger.marshal(restrictToFillLevel, null).intValue());
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
                    Marshal.booleanToInteger.marshal(showFillLevel, null).intValue());
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
                    Marshal.booleanToInteger.marshal(sizeFixed, null).intValue());
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_range_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code AdjustBounds} callback.
     */
    @FunctionalInterface
    public interface AdjustBounds {
    
        /**
         * Emitted before clamping a value, to give the application a
         * chance to adjust the bounds.
         */
        void run(double value);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceRange, double value) {
            run(value);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AdjustBounds.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted before clamping a value, to give the application a
     * chance to adjust the bounds.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Range.AdjustBounds> onAdjustBounds(Range.AdjustBounds handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("adjust-bounds", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ChangeValue} callback.
     */
    @FunctionalInterface
    public interface ChangeValue {
    
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
        boolean run(org.gtk.gtk.ScrollType scroll, double value);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceRange, int scroll, double value) {
            var RESULT = run(org.gtk.gtk.ScrollType.of(scroll), value);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE);
        
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
     * Functional interface declaration of the {@code MoveSlider} callback.
     */
    @FunctionalInterface
    public interface MoveSlider {
    
        /**
         * Virtual function that moves the slider.
         * <p>
         * Used for keybindings.
         */
        void run(org.gtk.gtk.ScrollType step);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceRange, int step) {
            run(org.gtk.gtk.ScrollType.of(step));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MoveSlider.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Virtual function that moves the slider.
     * <p>
     * Used for keybindings.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Range.MoveSlider> onMoveSlider(Range.MoveSlider handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("move-slider", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
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
         * Emitted when the range value changes.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceRange) {
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
     * Emitted when the range value changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Range.ValueChanged> onValueChanged(Range.ValueChanged handler) {
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
     * A {@link Range.Builder} object constructs a {@link Range} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Range.Builder#build()}. 
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
         * Finish building the {@link Range} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Range}.
         * @return A new instance of {@code Range} with the properties 
         *         that were set in the Builder object.
         */
        public Range build() {
            return (Range) org.gtk.gobject.GObject.newWithProperties(
                Range.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The adjustment that is controlled by the range.
         * @param adjustment The value for the {@code adjustment} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAdjustment(org.gtk.gtk.Adjustment adjustment) {
            names.add("adjustment");
            values.add(org.gtk.gobject.Value.create(adjustment));
            return this;
        }
        
        /**
         * The fill level (e.g. prebuffering of a network stream).
         * @param fillLevel The value for the {@code fill-level} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFillLevel(double fillLevel) {
            names.add("fill-level");
            values.add(org.gtk.gobject.Value.create(fillLevel));
            return this;
        }
        
        /**
         * If {@code true}, the direction in which the slider moves is inverted.
         * @param inverted The value for the {@code inverted} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInverted(boolean inverted) {
            names.add("inverted");
            values.add(org.gtk.gobject.Value.create(inverted));
            return this;
        }
        
        /**
         * Controls whether slider movement is restricted to an
         * upper boundary set by the fill level.
         * @param restrictToFillLevel The value for the {@code restrict-to-fill-level} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRestrictToFillLevel(boolean restrictToFillLevel) {
            names.add("restrict-to-fill-level");
            values.add(org.gtk.gobject.Value.create(restrictToFillLevel));
            return this;
        }
        
        /**
         * The number of digits to round the value to when
         * it changes.
         * <p>
         * See {@code Gtk.Range::change-value}.
         * @param roundDigits The value for the {@code round-digits} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRoundDigits(int roundDigits) {
            names.add("round-digits");
            values.add(org.gtk.gobject.Value.create(roundDigits));
            return this;
        }
        
        /**
         * Controls whether fill level indicator graphics are displayed
         * on the trough.
         * @param showFillLevel The value for the {@code show-fill-level} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShowFillLevel(boolean showFillLevel) {
            names.add("show-fill-level");
            values.add(org.gtk.gobject.Value.create(showFillLevel));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_range_get_adjustment = Interop.downcallHandle(
                "gtk_range_get_adjustment",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_range_get_fill_level = Interop.downcallHandle(
                "gtk_range_get_fill_level",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_range_get_flippable = Interop.downcallHandle(
                "gtk_range_get_flippable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_range_get_inverted = Interop.downcallHandle(
                "gtk_range_get_inverted",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_range_get_range_rect = Interop.downcallHandle(
                "gtk_range_get_range_rect",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_range_get_restrict_to_fill_level = Interop.downcallHandle(
                "gtk_range_get_restrict_to_fill_level",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_range_get_round_digits = Interop.downcallHandle(
                "gtk_range_get_round_digits",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_range_get_show_fill_level = Interop.downcallHandle(
                "gtk_range_get_show_fill_level",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_range_get_slider_range = Interop.downcallHandle(
                "gtk_range_get_slider_range",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_range_get_slider_size_fixed = Interop.downcallHandle(
                "gtk_range_get_slider_size_fixed",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_range_get_value = Interop.downcallHandle(
                "gtk_range_get_value",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_range_set_adjustment = Interop.downcallHandle(
                "gtk_range_set_adjustment",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_range_set_fill_level = Interop.downcallHandle(
                "gtk_range_set_fill_level",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_range_set_flippable = Interop.downcallHandle(
                "gtk_range_set_flippable",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_range_set_increments = Interop.downcallHandle(
                "gtk_range_set_increments",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_range_set_inverted = Interop.downcallHandle(
                "gtk_range_set_inverted",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_range_set_range = Interop.downcallHandle(
                "gtk_range_set_range",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_range_set_restrict_to_fill_level = Interop.downcallHandle(
                "gtk_range_set_restrict_to_fill_level",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_range_set_round_digits = Interop.downcallHandle(
                "gtk_range_set_round_digits",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_range_set_show_fill_level = Interop.downcallHandle(
                "gtk_range_set_show_fill_level",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_range_set_slider_size_fixed = Interop.downcallHandle(
                "gtk_range_set_slider_size_fixed",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_range_set_value = Interop.downcallHandle(
                "gtk_range_set_value",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_range_get_type = Interop.downcallHandle(
                "gtk_range_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_range_get_type != null;
    }
}
