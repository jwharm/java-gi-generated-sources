package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkScale` is a slider control used to select a numeric value.
 * 
 * ![An example GtkScale](scales.png)
 * 
 * To use it, you’ll probably want to investigate the methods on its base
 * class, [class@GtkRange], in addition to the methods for `GtkScale` itself.
 * To set the value of a scale, you would normally use [method@Gtk.Range.set_value].
 * To detect changes to the value, you would normally use the
 * [signal@Gtk.Range::value-changed] signal.
 * 
 * Note that using the same upper and lower bounds for the `GtkScale` (through
 * the `GtkRange` methods) will hide the slider itself. This is useful for
 * applications that want to show an undeterminate value on the scale, without
 * changing the layout of the application (such as movie or music players).
 * 
 * # GtkScale as GtkBuildable
 * 
 * `GtkScale` supports a custom <marks> element, which can contain multiple
 * <mark\\> elements. The “value” and “position” attributes have the same
 * meaning as [method@Gtk.Scale.add_mark] parameters of the same name. If
 * the element is not empty, its content is taken as the markup to show at
 * the mark. It can be translated with the usual ”translatable” and
 * “context” attributes.
 * 
 * # CSS nodes
 * 
 * ```
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
 * ```
 * 
 * `GtkScale` has a main CSS node with name scale and a subnode for its contents,
 * with subnodes named trough and slider.
 * 
 * The main node gets the style class .fine-tune added when the scale is in
 * 'fine-tuning' mode.
 * 
 * If the scale has an origin (see [method@Gtk.Scale.set_has_origin]), there is
 * a subnode with name highlight below the trough node that is used for rendering
 * the highlighted part of the trough.
 * 
 * If the scale is showing a fill level (see [method@Gtk.Range.set_show_fill_level]),
 * there is a subnode with name fill below the trough node that is used for
 * rendering the filled in part of the trough.
 * 
 * If marks are present, there is a marks subnode before or after the trough
 * node, below which each mark gets a node with name mark. The marks nodes get
 * either the .top or .bottom style class.
 * 
 * The mark node has a subnode named indicator. If the mark has text, it also
 * has a subnode named label. When the mark is either above or left of the
 * scale, the label subnode is the first when present. Otherwise, the indicator
 * subnode is the first.
 * 
 * The main CSS node gets the 'marks-before' and/or 'marks-after' style classes
 * added depending on what marks are present.
 * 
 * If the scale is displaying the value (see [property@Gtk.Scale:draw-value]),
 * there is subnode with name value. This node will get the .top or .bottom style
 * classes similar to the marks node.
 * 
 * # Accessibility
 * 
 * `GtkScale` uses the %GTK_ACCESSIBLE_ROLE_SLIDER role.
 */
public class Scale extends Range implements Accessible, Buildable, ConstraintTarget, Orientable {

    public Scale(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Scale */
    public static Scale castFrom(org.gtk.gobject.Object gobject) {
        return new Scale(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkScale`.
     */
    public Scale(Orientation orientation, Adjustment adjustment) {
        super(References.get(gtk_h.gtk_scale_new(orientation.getValue(), adjustment.handle()), false));
    }
    
    /**
     * Creates a new scale widget with a range from @min to @max.
     * 
     * The returns scale will have the given orientation and will let the
     * user input a number between @min and @max (including @min and @max)
     * with the increment @step. @step must be nonzero; it’s the distance
     * the slider moves when using the arrow keys to adjust the scale
     * value.
     * 
     * Note that the way in which the precision is derived works best if
     * @step is a power of ten. If the resulting precision is not suitable
     * for your needs, use [method@Gtk.Scale.set_digits] to correct it.
     */
    public static Scale newWithRange(Orientation orientation, double min, double max, double step) {
        return new Scale(References.get(gtk_h.gtk_scale_new_with_range(orientation.getValue(), min, max, step), false));
    }
    
    /**
     * Adds a mark at @value.
     * 
     * A mark is indicated visually by drawing a tick mark next to the scale,
     * and GTK makes it easy for the user to position the scale exactly at the
     * marks value.
     * 
     * If @markup is not %NULL, text is shown next to the tick mark.
     * 
     * To remove marks from a scale, use [method@Gtk.Scale.clear_marks].
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
     * Gets the `PangoLayout` used to display the scale.
     * 
     * The returned object is owned by the scale so does not need
     * to be freed by the caller.
     */
    public org.pango.Layout getLayout() {
        var RESULT = gtk_h.gtk_scale_get_layout(handle());
        return new org.pango.Layout(References.get(RESULT, false));
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
     * 
     * Also causes the value of the adjustment to be rounded to this number
     * of digits, so the retrieved value matches the displayed one, if
     * [property@GtkScale:draw-value] is %TRUE when the value changes. If
     * you want to enforce rounding the value when [property@GtkScale:draw-value]
     * is %FALSE, you can set [property@GtkRange:round-digits] instead.
     * 
     * Note that rounding to a small number of digits can interfere with
     * the smooth autoscrolling that is built into `GtkScale`. As an alternative,
     * you can use [method@Gtk.Scale.set_format_value_func] to format the displayed
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
     * Sets whether the scale has an origin.
     * 
     * If [property@GtkScale:has-origin] is set to %TRUE (the default),
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
