package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkLevelBar` is a widget that can be used as a level indicator.
 * 
 * Typical use cases are displaying the strength of a password, or
 * showing the charge level of a battery.
 * 
 * ![An example GtkLevelBar](levelbar.png)
 * 
 * Use [method@Gtk.LevelBar.set_value] to set the current value, and
 * [method@Gtk.LevelBar.add_offset_value] to set the value offsets at which
 * the bar will be considered in a different state. GTK will add a few
 * offsets by default on the level bar: %GTK_LEVEL_BAR_OFFSET_LOW,
 * %GTK_LEVEL_BAR_OFFSET_HIGH and %GTK_LEVEL_BAR_OFFSET_FULL, with
 * values 0.25, 0.75 and 1.0 respectively.
 * 
 * Note that it is your responsibility to update preexisting offsets
 * when changing the minimum or maximum value. GTK will simply clamp
 * them to the new range.
 * 
 * ## Adding a custom offset on the bar
 * 
 * ```c
 * static GtkWidget *
 * create_level_bar (void)
 * {
 *   GtkWidget *widget;
 *   GtkLevelBar *bar;
 * 
 *   widget = gtk_level_bar_new ();
 *   bar = GTK_LEVEL_BAR (widget);
 * 
 *   // This changes the value of the default low offset
 * 
 *   gtk_level_bar_add_offset_value (bar,
 *                                   GTK_LEVEL_BAR_OFFSET_LOW,
 *                                   0.10);
 * 
 *   // This adds a new offset to the bar; the application will
 *   // be able to change its color CSS like this:
 *   //
 *   // levelbar block.my-offset {
 *   //   background-color: magenta;
 *   //   border-style: solid;
 *   //   border-color: black;
 *   //   border-style: 1px;
 *   // }
 * 
 *   gtk_level_bar_add_offset_value (bar, "my-offset", 0.60);
 * 
 *   return widget;
 * }
 * ```
 * 
 * The default interval of values is between zero and one, but it’s possible
 * to modify the interval using [method@Gtk.LevelBar.set_min_value] and
 * [method@Gtk.LevelBar.set_max_value]. The value will be always drawn in
 * proportion to the admissible interval, i.e. a value of 15 with a specified
 * interval between 10 and 20 is equivalent to a value of 0.5 with an interval
 * between 0 and 1. When %GTK_LEVEL_BAR_MODE_DISCRETE is used, the bar level
 * is rendered as a finite number of separated blocks instead of a single one.
 * The number of blocks that will be rendered is equal to the number of units
 * specified by the admissible interval.
 * 
 * For instance, to build a bar rendered with five blocks, it’s sufficient to
 * set the minimum value to 0 and the maximum value to 5 after changing the
 * indicator mode to discrete.
 * 
 * # GtkLevelBar as GtkBuildable
 * 
 * The `GtkLevelBar` implementation of the `GtkBuildable` interface supports a
 * custom <offsets> element, which can contain any number of <offset> elements,
 * each of which must have name and value attributes.
 * 
 * # CSS nodes
 * 
 * ```
 * levelbar[.discrete]
 * ╰── trough
 *     ├── block.filled.level-name
 *     ┊
 *     ├── block.empty
 *     ┊
 * ```
 * 
 * `GtkLevelBar` has a main CSS node with name levelbar and one of the style
 * classes .discrete or .continuous and a subnode with name trough. Below the
 * trough node are a number of nodes with name block and style class .filled
 * or .empty. In continuous mode, there is exactly one node of each, in discrete
 * mode, the number of filled and unfilled nodes corresponds to blocks that are
 * drawn. The block.filled nodes also get a style class .level-name corresponding
 * to the level for the current value.
 * 
 * In horizontal orientation, the nodes are always arranged from left to right,
 * regardless of text direction.
 * 
 * # Accessibility
 * 
 * `GtkLevelBar` uses the %GTK_ACCESSIBLE_ROLE_METER role.
 */
public class LevelBar extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public LevelBar(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to LevelBar */
    public static LevelBar castFrom(org.gtk.gobject.Object gobject) {
        return new LevelBar(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkLevelBar`.
     */
    public LevelBar() {
        super(References.get(gtk_h.gtk_level_bar_new(), false));
    }
    
    /**
     * Creates a new `GtkLevelBar` for the specified interval.
     */
    public static LevelBar newForInterval(double minValue, double maxValue) {
        return new LevelBar(References.get(gtk_h.gtk_level_bar_new_for_interval(minValue, maxValue), false));
    }
    
    /**
     * Adds a new offset marker on @self at the position specified by @value.
     * 
     * When the bar value is in the interval topped by @value (or between @value
     * and [property@Gtk.LevelBar:max-value] in case the offset is the last one
     * on the bar) a style class named `level-`@name will be applied
     * when rendering the level bar fill.
     * 
     * If another offset marker named @name exists, its value will be
     * replaced by @value.
     */
    public void addOffsetValue(java.lang.String name, double value) {
        gtk_h.gtk_level_bar_add_offset_value(handle(), Interop.allocateNativeString(name).handle(), value);
    }
    
    /**
     * Returns whether the levelbar is inverted.
     */
    public boolean getInverted() {
        var RESULT = gtk_h.gtk_level_bar_get_inverted(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the `max-value` of the `GtkLevelBar`.
     */
    public double getMaxValue() {
        var RESULT = gtk_h.gtk_level_bar_get_max_value(handle());
        return RESULT;
    }
    
    /**
     * Returns the `min-value of the `GtkLevelBar`.
     */
    public double getMinValue() {
        var RESULT = gtk_h.gtk_level_bar_get_min_value(handle());
        return RESULT;
    }
    
    /**
     * Returns the `mode` of the `GtkLevelBar`.
     */
    public LevelBarMode getMode() {
        var RESULT = gtk_h.gtk_level_bar_get_mode(handle());
        return LevelBarMode.fromValue(RESULT);
    }
    
    /**
     * Returns the `value` of the `GtkLevelBar`.
     */
    public double getValue() {
        var RESULT = gtk_h.gtk_level_bar_get_value(handle());
        return RESULT;
    }
    
    /**
     * Removes an offset marker from a `GtkLevelBar`.
     * 
     * The marker must have been previously added with
     * [method@Gtk.LevelBar.add_offset_value].
     */
    public void removeOffsetValue(java.lang.String name) {
        gtk_h.gtk_level_bar_remove_offset_value(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Sets whether the `GtkLevelBar` is inverted.
     */
    public void setInverted(boolean inverted) {
        gtk_h.gtk_level_bar_set_inverted(handle(), inverted ? 1 : 0);
    }
    
    /**
     * Sets the `max-value` of the `GtkLevelBar`.
     * 
     * You probably want to update preexisting level offsets after calling
     * this function.
     */
    public void setMaxValue(double value) {
        gtk_h.gtk_level_bar_set_max_value(handle(), value);
    }
    
    /**
     * Sets the `min-value` of the `GtkLevelBar`.
     * 
     * You probably want to update preexisting level offsets after calling
     * this function.
     */
    public void setMinValue(double value) {
        gtk_h.gtk_level_bar_set_min_value(handle(), value);
    }
    
    /**
     * Sets the `mode` of the `GtkLevelBar`.
     */
    public void setMode(LevelBarMode mode) {
        gtk_h.gtk_level_bar_set_mode(handle(), mode.getValue());
    }
    
    /**
     * Sets the value of the `GtkLevelBar`.
     */
    public void setValue(double value) {
        gtk_h.gtk_level_bar_set_value(handle(), value);
    }
    
    @FunctionalInterface
    public interface OffsetChangedHandler {
        void signalReceived(LevelBar source, java.lang.String name);
    }
    
    /**
     * Emitted when an offset specified on the bar changes value.
     * 
     * This typically is the result of a [method@Gtk.LevelBar.add_offset_value]
     * call.
     * 
     * The signal supports detailed connections; you can connect to the
     * detailed signal "changed::x" in order to only receive callbacks when
     * the value of offset "x" changes.
     */
    public void onOffsetChanged(OffsetChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalLevelBarOffsetChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("offset-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
