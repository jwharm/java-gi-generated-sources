package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GtkScale</code> is a slider control used to select a numeric value.
 * <p>
 * !{@link [An example GtkScale]}(scales.png)
 * <p>
 * To use it, you&<code>#8217</code> ll probably want to investigate the methods on its base
 * class, {@link [class@GtkRange]}, in addition to the methods for <code>GtkScale</code> itself.
 * To set the value of a scale, you would normally use {@link org.gtk.gtk.Range<code>#setValue</code> .
 * To detect changes to the value, you would normally use the
 * {@link [signal@Gtk.Range::value-changed] (ref=signal)} signal.
 * <p>
 * Note that using the same upper and lower bounds for the <code>GtkScale</code> (through
 * the <code>GtkRange</code> methods) will hide the slider itself. This is useful for
 * applications that want to show an undeterminate value on the scale, without
 * changing the layout of the application (such as movie or music players).
 * <p>
 * <h1>GtkScale as GtkBuildable</h1>
 * <p><code>GtkScale</code> supports a custom &<code>#60</code> marks&<code>#62</code>  element, which can contain multiple
 * &<code>#60</code> mark\\&<code>#62</code>  elements. The &<code>#8220</code> value&<code>#8221</code>  and &<code>#8220</code> position&<code>#8221</code>  attributes have the same
 * meaning as {@link org.gtk.gtk.Scale<code>#addMark</code>  parameters of the same name. If
 * the element is not empty, its content is taken as the markup to show at
 * the mark. It can be translated with the usual &<code>#8221</code> translatable&<code>#8221</code>  and
 * &<code>#8220</code> context&<code>#8221</code>  attributes.
 * <p>
 * <h1>CSS nodes</h1>
 * <p><pre>
 * scale{@link [.fine-tune]}{@link [.marks-before]}{@link [.marks-after]}
 * &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  {@link [value]}{@link [.top]}{@link [.right]}{@link [.bottom]}{@link [.left]}
 * &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  marks.top
 * &<code>#9474</code>    &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  mark
 * &<code>#9474</code>    &<code>#9482</code>     &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  {@link [label]}
 * &<code>#9474</code>    &<code>#9482</code>     &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  indicator
 * &<code>#9482</code>    &<code>#9482</code> 
 * &<code>#9474</code>    &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  mark
 * &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  marks.bottom
 * &<code>#9474</code>    &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  mark
 * &<code>#9474</code>    &<code>#9482</code>     &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  indicator
 * &<code>#9474</code>    &<code>#9482</code>     &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  {@link [label]}
 * &<code>#9482</code>    &<code>#9482</code> 
 * &<code>#9474</code>    &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  mark
 * &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  trough
 *     &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  {@link [fill]}
 *     &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  {@link [highlight]}
 *     &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  slider
 * </pre>
 * <p><code>GtkScale</code> has a main CSS node with name scale and a subnode for its contents,
 * with subnodes named trough and slider.
 * <p>
 * The main node gets the style class .fine-tune added when the scale is in
 * &<code>#39</code> fine-tuning&<code>#39</code>  mode.
 * <p>
 * If the scale has an origin (see {@link org.gtk.gtk.Scale<code>#setHasOrigin</code> ), there is
 * a subnode with name highlight below the trough node that is used for rendering
 * the highlighted part of the trough.
 * <p>
 * If the scale is showing a fill level (see {@link org.gtk.gtk.Range<code>#setShowFillLevel</code> ),
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
 * The main CSS node gets the &<code>#39</code> marks-before&<code>#39</code>  and/or &<code>#39</code> marks-after&<code>#39</code>  style classes
 * added depending on what marks are present.
 * <p>
 * If the scale is displaying the value (see {@link [property@Gtk.Scale:draw-value] (ref=property)}),
 * there is subnode with name value. This node will get the .top or .bottom style
 * classes similar to the marks node.
 * <p>
 * <h1>Accessibility</h1>
 * <p><code>GtkScale</code> uses the {@link org.gtk.gtk.AccessibleRole<code>#SLIDER</code>  role.
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
     * Creates a new <code>GtkScale</code>.
     */
    public Scale(Orientation orientation, Adjustment adjustment) {
        super(constructNew(orientation, adjustment));
    }
    
    private static Reference constructNewWithRange(Orientation orientation, double min, double max, double step) {
        Reference RESULT = References.get(gtk_h.gtk_scale_new_with_range(orientation.getValue(), min, max, step), false);
        return RESULT;
    }
    
    /**
     * Creates a new scale widget with a range from @min to @max.
     * 
     * The returns scale will have the given orientation and will let the
     * user input a number between @min and @max (including @min and @max)
     * with the increment @step. @step must be nonzero; it&<code>#8217</code> s the distance
     * the slider moves when using the arrow keys to adjust the scale
     * value.
     * 
     * Note that the way in which the precision is derived works best if
     * @step is a power of ten. If the resulting precision is not suitable
     * for your needs, use {@link org.gtk.gtk.Scale<code>#setDigits</code>  to correct it.
     */
    public static Scale newWithRange(Orientation orientation, double min, double max, double step) {
        return new Scale(constructNewWithRange(orientation, min, max, step));
    }
    
    /**
     * Adds a mark at @value.
     * 
     * A mark is indicated visually by drawing a tick mark next to the scale,
     * and GTK makes it easy for the user to position the scale exactly at the
     * marks value.
     * 
     * If @markup is not <code>null</code>  text is shown next to the tick mark.
     * 
     * To remove marks from a scale, use {@link org.gtk.gtk.Scale<code>#clearMarks</code> .
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
     * Gets the <code>PangoLayout</code> used to display the scale.
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
     * <p>
     * Also causes the value of the adjustment to be rounded to this number
     * of digits, so the retrieved value matches the displayed one, if
     * {@link [property@GtkScale:draw-value] (ref=property)} is <code>true</code> when the value changes. If
     * you want to enforce rounding the value when {@link [property@GtkScale:draw-value] (ref=property)}
     * is <code>false</code>  you can set {@link [property@GtkRange:round-digits] (ref=property)} instead.
     * <p>
     * Note that rounding to a small number of digits can interfere with
     * the smooth autoscrolling that is built into <code>GtkScale</code>. As an alternative,
     * you can use {@link org.gtk.gtk.Scale<code>#setFormatValueFunc</code>  to format the displayed
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
     * @func allows you to change how the scale value is displayed.
     * 
     * The given function will return an allocated string representing
     * @value. That string will then be used to display the scale&<code>#39</code> s value.
     * 
     * If <code>#NULL</code> is passed as @func, the value will be displayed on
     * its own, rounded according to the value of the
     * {@link [property@GtkScale:digits] (ref=property)} property.
     */
    public void setFormatValueFunc(ScaleFormatValueFunc func) {
        try {
            gtk_h.gtk_scale_set_format_value_func(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbScaleFormatValueFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, double.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets whether the scale has an origin.
     * 
     * If {@link [property@GtkScale:has-origin] (ref=property)} is set to <code>true</code> (the default),
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
