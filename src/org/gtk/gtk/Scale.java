package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkScale} is a slider control used to select a numeric value.
 * <p>
 * <img src="./doc-files/scales.png" alt="An example GtkScale">
 * <p>
 * To use it, you’ll probably want to investigate the methods on its base
 * class, {@link GtkRange}, in addition to the methods for {@code GtkScale} itself.
 * To set the value of a scale, you would normally use {@link Range#setValue}.
 * To detect changes to the value, you would normally use the
 * {@code Gtk.Range::value-changed} signal.
 * <p>
 * Note that using the same upper and lower bounds for the {@code GtkScale} (through
 * the {@code GtkRange} methods) will hide the slider itself. This is useful for
 * applications that want to show an undeterminate value on the scale, without
 * changing the layout of the application (such as movie or music players).
 * <p>
 * <h1>GtkScale as GtkBuildable</h1>
 * <p>
 * {@code GtkScale} supports a custom &lt;marks&gt; element, which can contain multiple
 * &lt;mark\\&gt; elements. The “value” and “position” attributes have the same
 * meaning as {@link Scale#addMark} parameters of the same name. If
 * the element is not empty, its content is taken as the markup to show at
 * the mark. It can be translated with the usual ”translatable” and
 * “context” attributes.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
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
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkScale} uses the {@link AccessibleRole#SLIDER} role.
 */
public class Scale extends Range implements Accessible, Buildable, ConstraintTarget, Orientable {

    public Scale(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Scale */
    public static Scale castFrom(org.gtk.gobject.Object gobject) {
        return new Scale(gobject.getReference());
    }
    
    private static Reference constructNew(Orientation orientation, Adjustment adjustment) {
        Reference RESULT = References.get(gtk_h.gtk_scale_new(orientation.getValue(), adjustment.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkScale}.
     */
    public Scale(Orientation orientation, Adjustment adjustment) {
        super(constructNew(orientation, adjustment));
    }
    
    private static Reference constructNewWithRange(Orientation orientation, double min, double max, double step) {
        Reference RESULT = References.get(gtk_h.gtk_scale_new_with_range(orientation.getValue(), min, max, step), false);
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
     */
    public static Scale newWithRange(Orientation orientation, double min, double max, double step) {
        return new Scale(constructNewWithRange(orientation, min, max, step));
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
     */
    public void addMark(double value, PositionType position, java.lang.String markup) {
        gtk_h.gtk_scale_add_mark(handle(), value, position.getValue(), Interop.allocateNativeString(markup).handle());
    }
    
    /**
     * Removes any marks that have been added.
     */
    public void clearMarks() {
        gtk_h.gtk_scale_clear_marks(handle());
    }
    
    /**
     * Gets the number of decimal places that are displayed in the value.
     */
    public int getDigits() {
        var RESULT = gtk_h.gtk_scale_get_digits(handle());
        return RESULT;
    }
    
    /**
     * Returns whether the current value is displayed as a string
     * next to the slider.
     */
    public boolean getDrawValue() {
        var RESULT = gtk_h.gtk_scale_get_draw_value(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the scale has an origin.
     */
    public boolean getHasOrigin() {
        var RESULT = gtk_h.gtk_scale_get_has_origin(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the {@code PangoLayout} used to display the scale.
     * <p>
     * The returned object is owned by the scale so does not need
     * to be freed by the caller.
     */
    public org.pango.Layout getLayout() {
        var RESULT = gtk_h.gtk_scale_get_layout(handle());
        return new org.pango.Layout(References.get(RESULT, false));
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
     */
    public void getLayoutOffsets(PointerInteger x, PointerInteger y) {
        gtk_h.gtk_scale_get_layout_offsets(handle(), x.handle(), y.handle());
    }
    
    /**
     * Gets the position in which the current value is displayed.
     */
    public PositionType getValuePos() {
        var RESULT = gtk_h.gtk_scale_get_value_pos(handle());
        return PositionType.fromValue(RESULT);
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
     */
    public void setDigits(int digits) {
        gtk_h.gtk_scale_set_digits(handle(), digits);
    }
    
    /**
     * Specifies whether the current value is displayed as a string next
     * to the slider.
     */
    public void setDrawValue(boolean drawValue) {
        gtk_h.gtk_scale_set_draw_value(handle(), drawValue ? 1 : 0);
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
     */
    public void setFormatValueFunc(ScaleFormatValueFunc func) {
        try {
            gtk_h.gtk_scale_set_format_value_func(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbScaleFormatValueFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, double.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets whether the scale has an origin.
     * <p>
     * If {@code GtkScale:has-origin} is set to {@code true} (the default),
     * the scale will highlight the part of the trough between the origin
     * (bottom or left side) and the current value.
     */
    public void setHasOrigin(boolean hasOrigin) {
        gtk_h.gtk_scale_set_has_origin(handle(), hasOrigin ? 1 : 0);
    }
    
    /**
     * Sets the position in which the current value is displayed.
     */
    public void setValuePos(PositionType pos) {
        gtk_h.gtk_scale_set_value_pos(handle(), pos.getValue());
    }
    
}
