package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkScale} is a slider control used to select a numeric value.
 * <p>
 * <img src="./doc-files/scales.png" alt="An example GtkScale">
 * <p>
 * To use it, you’ll probably want to investigate the methods on its base
 * class, {@code GtkRange}, in addition to the methods for {@code GtkScale} itself.
 * To set the value of a scale, you would normally use {@link Range#setValue}.
 * To detect changes to the value, you would normally use the
 * {@code Gtk.Range::value-changed} signal.
 * <p>
 * Note that using the same upper and lower bounds for the {@code GtkScale} (through
 * the {@code GtkRange} methods) will hide the slider itself. This is useful for
 * applications that want to show an undeterminate value on the scale, without
 * changing the layout of the application (such as movie or music players).
 * <p>
 * <strong>GtkScale as GtkBuildable</strong><br/>
 * {@code GtkScale} supports a custom &lt;marks&gt; element, which can contain multiple
 * &lt;mark\\&gt; elements. The “value” and “position” attributes have the same
 * meaning as {@link Scale#addMark} parameters of the same name. If
 * the element is not empty, its content is taken as the markup to show at
 * the mark. It can be translated with the usual ”translatable” and
 * “context” attributes.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * scale[.fine-tune][.marks-before][.marks-after]
 * ├── [value][.top][.right][.bottom][.left]
 * ├── marks.top
 * │   ├── mark
 * │   ┊    ├── [label]
 * │   ┊    ╰── indicator
 * ┊   ┊
 * │   ╰── mark
 * ├── marks.bottom
 * │   ├── mark
 * │   ┊    ├── indicator
 * │   ┊    ╰── [label]
 * ┊   ┊
 * │   ╰── mark
 * ╰── trough
 *     ├── [fill]
 *     ├── [highlight]
 *     ╰── slider
 * }</pre>
 * <p>
 * {@code GtkScale} has a main CSS node with name scale and a subnode for its contents,
 * with subnodes named trough and slider.
 * <p>
 * The main node gets the style class .fine-tune added when the scale is in
 * 'fine-tuning' mode.
 * <p>
 * If the scale has an origin (see {@link Scale#setHasOrigin}), there is
 * a subnode with name highlight below the trough node that is used for rendering
 * the highlighted part of the trough.
 * <p>
 * If the scale is showing a fill level (see {@link Range#setShowFillLevel}),
 * there is a subnode with name fill below the trough node that is used for
 * rendering the filled in part of the trough.
 * <p>
 * If marks are present, there is a marks subnode before or after the trough
 * node, below which each mark gets a node with name mark. The marks nodes get
 * either the .top or .bottom style class.
 * <p>
 * The mark node has a subnode named indicator. If the mark has text, it also
 * has a subnode named label. When the mark is either above or left of the
 * scale, the label subnode is the first when present. Otherwise, the indicator
 * subnode is the first.
 * <p>
 * The main CSS node gets the 'marks-before' and/or 'marks-after' style classes
 * added depending on what marks are present.
 * <p>
 * If the scale is displaying the value (see {@code Gtk.Scale:draw-value}),
 * there is subnode with name value. This node will get the .top or .bottom style
 * classes similar to the marks node.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkScale} uses the {@link AccessibleRole#SLIDER} role.
 */
public class Scale extends org.gtk.gtk.Range implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkScale";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Range.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Scale proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Scale(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Scale> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Scale(input);
    
    private static MemoryAddress constructNew(org.gtk.gtk.Orientation orientation, @Nullable org.gtk.gtk.Adjustment adjustment) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scale_new.invokeExact(
                    orientation.getValue(),
                    (Addressable) (adjustment == null ? MemoryAddress.NULL : adjustment.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkScale}.
     * @param orientation the scale’s orientation.
     * @param adjustment the {@link Adjustment} which sets
     *   the range of the scale, or {@code null} to create a new adjustment.
     */
    public Scale(org.gtk.gtk.Orientation orientation, @Nullable org.gtk.gtk.Adjustment adjustment) {
        super(constructNew(orientation, adjustment));
        this.refSink();
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWithRange(org.gtk.gtk.Orientation orientation, double min, double max, double step) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scale_new_with_range.invokeExact(
                    orientation.getValue(),
                    min,
                    max,
                    step);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new scale widget with a range from {@code min} to {@code max}.
     * <p>
     * The returns scale will have the given orientation and will let the
     * user input a number between {@code min} and {@code max} (including {@code min} and {@code max})
     * with the increment {@code step}. {@code step} must be nonzero; it’s the distance
     * the slider moves when using the arrow keys to adjust the scale
     * value.
     * <p>
     * Note that the way in which the precision is derived works best if
     * {@code step} is a power of ten. If the resulting precision is not suitable
     * for your needs, use {@link Scale#setDigits} to correct it.
     * @param orientation the scale’s orientation.
     * @param min minimum value
     * @param max maximum value
     * @param step step increment (tick size) used with keyboard shortcuts
     * @return a new {@code GtkScale}
     */
    public static Scale newWithRange(org.gtk.gtk.Orientation orientation, double min, double max, double step) {
        var RESULT = constructNewWithRange(orientation, min, max, step);
        var OBJECT = (org.gtk.gtk.Scale) Interop.register(RESULT, org.gtk.gtk.Scale.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Adds a mark at {@code value}.
     * <p>
     * A mark is indicated visually by drawing a tick mark next to the scale,
     * and GTK makes it easy for the user to position the scale exactly at the
     * marks value.
     * <p>
     * If {@code markup} is not {@code null}, text is shown next to the tick mark.
     * <p>
     * To remove marks from a scale, use {@link Scale#clearMarks}.
     * @param value the value at which the mark is placed, must be between
     *   the lower and upper limits of the scales’ adjustment
     * @param position where to draw the mark. For a horizontal scale, {@link PositionType#TOP}
     *   and {@link PositionType#LEFT} are drawn above the scale, anything else below.
     *   For a vertical scale, {@link PositionType#LEFT} and {@link PositionType#TOP} are drawn to
     *   the left of the scale, anything else to the right.
     * @param markup Text to be shown at the mark, using Pango markup
     */
    public void addMark(double value, org.gtk.gtk.PositionType position, @Nullable java.lang.String markup) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_scale_add_mark.invokeExact(
                        handle(),
                        value,
                        position.getValue(),
                        (Addressable) (markup == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(markup, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Removes any marks that have been added.
     */
    public void clearMarks() {
        try {
            DowncallHandles.gtk_scale_clear_marks.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the number of decimal places that are displayed in the value.
     * @return the number of decimal places that are displayed
     */
    public int getDigits() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_scale_get_digits.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns whether the current value is displayed as a string
     * next to the slider.
     * @return whether the current value is displayed as a string
     */
    public boolean getDrawValue() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_scale_get_draw_value.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether the scale has an origin.
     * @return {@code true} if the scale has an origin.
     */
    public boolean getHasOrigin() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_scale_get_has_origin.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the {@code PangoLayout} used to display the scale.
     * <p>
     * The returned object is owned by the scale so does not need
     * to be freed by the caller.
     * @return the {@link org.pango.Layout}
     *   for this scale, or {@code null} if the {@code GtkScale:draw-value}
     *   property is {@code false}.
     */
    public @Nullable org.pango.Layout getLayout() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scale_get_layout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.Layout) Interop.register(RESULT, org.pango.Layout.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Obtains the coordinates where the scale will draw the
     * {@code PangoLayout} representing the text in the scale.
     * <p>
     * Remember when using the {@code PangoLayout} function you need to
     * convert to and from pixels using {@code PANGO_PIXELS()} or {@code PANGO_SCALE}.
     * <p>
     * If the {@code GtkScale:draw-value} property is {@code false}, the return
     * values are undefined.
     * @param x location to store X offset of layout
     * @param y location to store Y offset of layout
     */
    public void getLayoutOffsets(Out<Integer> x, Out<Integer> y) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment xPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment yPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gtk_scale_get_layout_offsets.invokeExact(
                        handle(),
                        (Addressable) (x == null ? MemoryAddress.NULL : (Addressable) xPOINTER.address()),
                        (Addressable) (y == null ? MemoryAddress.NULL : (Addressable) yPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (x != null) x.set(xPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (y != null) y.set(yPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    /**
     * Gets the position in which the current value is displayed.
     * @return the position in which the current value is displayed
     */
    public org.gtk.gtk.PositionType getValuePos() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_scale_get_value_pos.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.PositionType.of(RESULT);
    }
    
    /**
     * Sets the number of decimal places that are displayed in the value.
     * <p>
     * Also causes the value of the adjustment to be rounded to this number
     * of digits, so the retrieved value matches the displayed one, if
     * {@code GtkScale:draw-value} is {@code true} when the value changes. If
     * you want to enforce rounding the value when {@code GtkScale:draw-value}
     * is {@code false}, you can set {@code GtkRange:round-digits} instead.
     * <p>
     * Note that rounding to a small number of digits can interfere with
     * the smooth autoscrolling that is built into {@code GtkScale}. As an alternative,
     * you can use {@link Scale#setFormatValueFunc} to format the displayed
     * value yourself.
     * @param digits the number of decimal places to display,
     *   e.g. use 1 to display 1.0, 2 to display 1.00, etc
     */
    public void setDigits(int digits) {
        try {
            DowncallHandles.gtk_scale_set_digits.invokeExact(
                    handle(),
                    digits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Specifies whether the current value is displayed as a string next
     * to the slider.
     * @param drawValue {@code true} to draw the value
     */
    public void setDrawValue(boolean drawValue) {
        try {
            DowncallHandles.gtk_scale_set_draw_value.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(drawValue, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * {@code func} allows you to change how the scale value is displayed.
     * <p>
     * The given function will return an allocated string representing
     * {@code value}. That string will then be used to display the scale's value.
     * <p>
     * If {@code NULL} is passed as {@code func}, the value will be displayed on
     * its own, rounded according to the value of the
     * {@code GtkScale:digits} property.
     * @param func function that formats the value
     * @param destroyNotify destroy function for {@code user_data}
     */
    public void setFormatValueFunc(@Nullable org.gtk.gtk.ScaleFormatValueFunc func, @Nullable org.gtk.glib.DestroyNotify destroyNotify) {
        try {
            DowncallHandles.gtk_scale_set_format_value_func.invokeExact(
                    handle(),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (destroyNotify == null ? MemoryAddress.NULL : (Addressable) destroyNotify.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the scale has an origin.
     * <p>
     * If {@code GtkScale:has-origin} is set to {@code true} (the default),
     * the scale will highlight the part of the trough between the origin
     * (bottom or left side) and the current value.
     * @param hasOrigin {@code true} if the scale has an origin
     */
    public void setHasOrigin(boolean hasOrigin) {
        try {
            DowncallHandles.gtk_scale_set_has_origin.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(hasOrigin, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the position in which the current value is displayed.
     * @param pos the position in which the current value is displayed
     */
    public void setValuePos(org.gtk.gtk.PositionType pos) {
        try {
            DowncallHandles.gtk_scale_set_value_pos.invokeExact(
                    handle(),
                    pos.getValue());
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
            RESULT = (long) DowncallHandles.gtk_scale_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Scale.Builder} object constructs a {@link Scale} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Scale.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Range.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Scale} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Scale}.
         * @return A new instance of {@code Scale} with the properties 
         *         that were set in the Builder object.
         */
        public Scale build() {
            return (Scale) org.gtk.gobject.GObject.newWithProperties(
                Scale.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The number of decimal places that are displayed in the value.
         * @param digits The value for the {@code digits} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDigits(int digits) {
            names.add("digits");
            values.add(org.gtk.gobject.Value.create(digits));
            return this;
        }
        
        /**
         * Whether the current value is displayed as a string next to the slider.
         * @param drawValue The value for the {@code draw-value} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDrawValue(boolean drawValue) {
            names.add("draw-value");
            values.add(org.gtk.gobject.Value.create(drawValue));
            return this;
        }
        
        /**
         * Whether the scale has an origin.
         * @param hasOrigin The value for the {@code has-origin} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHasOrigin(boolean hasOrigin) {
            names.add("has-origin");
            values.add(org.gtk.gobject.Value.create(hasOrigin));
            return this;
        }
        
        /**
         * The position in which the current value is displayed.
         * @param valuePos The value for the {@code value-pos} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValuePos(org.gtk.gtk.PositionType valuePos) {
            names.add("value-pos");
            values.add(org.gtk.gobject.Value.create(valuePos));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_scale_new = Interop.downcallHandle(
                "gtk_scale_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_scale_new_with_range = Interop.downcallHandle(
                "gtk_scale_new_with_range",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_scale_add_mark = Interop.downcallHandle(
                "gtk_scale_add_mark",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_scale_clear_marks = Interop.downcallHandle(
                "gtk_scale_clear_marks",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_scale_get_digits = Interop.downcallHandle(
                "gtk_scale_get_digits",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_scale_get_draw_value = Interop.downcallHandle(
                "gtk_scale_get_draw_value",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_scale_get_has_origin = Interop.downcallHandle(
                "gtk_scale_get_has_origin",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_scale_get_layout = Interop.downcallHandle(
                "gtk_scale_get_layout",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_scale_get_layout_offsets = Interop.downcallHandle(
                "gtk_scale_get_layout_offsets",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_scale_get_value_pos = Interop.downcallHandle(
                "gtk_scale_get_value_pos",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_scale_set_digits = Interop.downcallHandle(
                "gtk_scale_set_digits",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_scale_set_draw_value = Interop.downcallHandle(
                "gtk_scale_set_draw_value",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_scale_set_format_value_func = Interop.downcallHandle(
                "gtk_scale_set_format_value_func",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_scale_set_has_origin = Interop.downcallHandle(
                "gtk_scale_set_has_origin",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_scale_set_value_pos = Interop.downcallHandle(
                "gtk_scale_set_value_pos",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_scale_get_type = Interop.downcallHandle(
                "gtk_scale_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_scale_get_type != null;
    }
}
