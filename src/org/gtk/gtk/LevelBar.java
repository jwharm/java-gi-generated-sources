package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkLevelBar} is a widget that can be used as a level indicator.
 * <p>
 * Typical use cases are displaying the strength of a password, or
 * showing the charge level of a battery.
 * <p>
 * <img src="./doc-files/levelbar.png" alt="An example GtkLevelBar">
 * <p>
 * Use {@link LevelBar#setValue} to set the current value, and
 * {@link LevelBar#addOffsetValue} to set the value offsets at which
 * the bar will be considered in a different state. GTK will add a few
 * offsets by default on the level bar: {@code GTK_LEVEL_BAR_OFFSET_LOW},
 * {@code GTK_LEVEL_BAR_OFFSET_HIGH} and {@code GTK_LEVEL_BAR_OFFSET_FULL}, with
 * values 0.25, 0.75 and 1.0 respectively.
 * <p>
 * Note that it is your responsibility to update preexisting offsets
 * when changing the minimum or maximum value. GTK will simply clamp
 * them to the new range.
 * <p>
 * <h2>Adding a custom offset on the bar</h2>
 * <p>
 * <pre>{@code c
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
 * }</pre>
 * <p>
 * The default interval of values is between zero and one, but it’s possible
 * to modify the interval using {@link LevelBar#setMinValue} and
 * {@link LevelBar#setMaxValue}. The value will be always drawn in
 * proportion to the admissible interval, i.e. a value of 15 with a specified
 * interval between 10 and 20 is equivalent to a value of 0.5 with an interval
 * between 0 and 1. When {@link LevelBarMode#DISCRETE} is used, the bar level
 * is rendered as a finite number of separated blocks instead of a single one.
 * The number of blocks that will be rendered is equal to the number of units
 * specified by the admissible interval.
 * <p>
 * For instance, to build a bar rendered with five blocks, it’s sufficient to
 * set the minimum value to 0 and the maximum value to 5 after changing the
 * indicator mode to discrete.
 * <p>
 * <h1>GtkLevelBar as GtkBuildable</h1>
 * <p>
 * The {@code GtkLevelBar} implementation of the {@code GtkBuildable} interface supports a
 * custom &lt;offsets> element, which can contain any number of <offset&gt; elements,
 * each of which must have name and value attributes.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * levelbar[.discrete]
 * ╰── trough
 *     ├── block.filled.level-name
 *     ┊
 *     ├── block.empty
 *     ┊
 * }</pre>
 * <p>
 * {@code GtkLevelBar} has a main CSS node with name levelbar and one of the style
 * classes .discrete or .continuous and a subnode with name trough. Below the
 * trough node are a number of nodes with name block and style class .filled
 * or .empty. In continuous mode, there is exactly one node of each, in discrete
 * mode, the number of filled and unfilled nodes corresponds to blocks that are
 * drawn. The block.filled nodes also get a style class .level-name corresponding
 * to the level for the current value.
 * <p>
 * In horizontal orientation, the nodes are always arranged from left to right,
 * regardless of text direction.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkLevelBar} uses the {@link AccessibleRole#METER} role.
 */
public class LevelBar extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public LevelBar(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to LevelBar */
    public static LevelBar castFrom(org.gtk.gobject.Object gobject) {
        return new LevelBar(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_level_bar_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkLevelBar}.
     */
    public LevelBar() {
        super(constructNew());
    }
    
    private static Reference constructNewForInterval(double minValue, double maxValue) {
        Reference RESULT = References.get(gtk_h.gtk_level_bar_new_for_interval(minValue, maxValue), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkLevelBar} for the specified interval.
     */
    public static LevelBar newForInterval(double minValue, double maxValue) {
        return new LevelBar(constructNewForInterval(minValue, maxValue));
    }
    
    /**
     * Adds a new offset marker on {@code self} at the position specified by {@code value}.
     * <p>
     * When the bar value is in the interval topped by {@code value} (or between {@code value}
     * and {@code Gtk.LevelBar:max-value} in case the offset is the last one
     * on the bar) a style class named {@code level-}{@code name} will be applied
     * when rendering the level bar fill.
     * <p>
     * If another offset marker named {@code name} exists, its value will be
     * replaced by {@code value}.
     */
    public void addOffsetValue(java.lang.String name, double value) {
        gtk_h.gtk_level_bar_add_offset_value(handle(), Interop.allocateNativeString(name).handle(), value);
    }
    
    /**
     * Returns whether the levelbar is inverted.
     */
    public boolean getInverted() {
        var RESULT = gtk_h.gtk_level_bar_get_inverted(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the {@code max-value} of the {@code GtkLevelBar}.
     */
    public double getMaxValue() {
        var RESULT = gtk_h.gtk_level_bar_get_max_value(handle());
        return RESULT;
    }
    
    /**
     * Returns the {@code min-value of the }GtkLevelBar`.
     */
    public double getMinValue() {
        var RESULT = gtk_h.gtk_level_bar_get_min_value(handle());
        return RESULT;
    }
    
    /**
     * Returns the {@code mode} of the {@code GtkLevelBar}.
     */
    public LevelBarMode getMode() {
        var RESULT = gtk_h.gtk_level_bar_get_mode(handle());
        return new LevelBarMode(RESULT);
    }
    
    /**
     * Fetches the value specified for the offset marker {@code name} in {@code self}.
     */
    public boolean getOffsetValue(java.lang.String name, PointerDouble value) {
        var RESULT = gtk_h.gtk_level_bar_get_offset_value(handle(), Interop.allocateNativeString(name).handle(), value.handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the {@code value} of the {@code GtkLevelBar}.
     */
    public double getValue() {
        var RESULT = gtk_h.gtk_level_bar_get_value(handle());
        return RESULT;
    }
    
    /**
     * Removes an offset marker from a {@code GtkLevelBar}.
     * <p>
     * The marker must have been previously added with
     * {@link LevelBar#addOffsetValue}.
     */
    public void removeOffsetValue(java.lang.String name) {
        gtk_h.gtk_level_bar_remove_offset_value(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Sets whether the {@code GtkLevelBar} is inverted.
     */
    public void setInverted(boolean inverted) {
        gtk_h.gtk_level_bar_set_inverted(handle(), inverted ? 1 : 0);
    }
    
    /**
     * Sets the {@code max-value} of the {@code GtkLevelBar}.
     * <p>
     * You probably want to update preexisting level offsets after calling
     * this function.
     */
    public void setMaxValue(double value) {
        gtk_h.gtk_level_bar_set_max_value(handle(), value);
    }
    
    /**
     * Sets the {@code min-value} of the {@code GtkLevelBar}.
     * <p>
     * You probably want to update preexisting level offsets after calling
     * this function.
     */
    public void setMinValue(double value) {
        gtk_h.gtk_level_bar_set_min_value(handle(), value);
    }
    
    /**
     * Sets the {@code mode} of the {@code GtkLevelBar}.
     */
    public void setMode(LevelBarMode mode) {
        gtk_h.gtk_level_bar_set_mode(handle(), mode.getValue());
    }
    
    /**
     * Sets the value of the {@code GtkLevelBar}.
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
     * <p>
     * This typically is the result of a {@link LevelBar#addOffsetValue}
     * call.
     * <p>
     * The signal supports detailed connections; you can connect to the
     * detailed signal "changed::x" in order to only receive callbacks when
     * the value of offset "x" changes.
     */
    public SignalHandle onOffsetChanged(OffsetChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("offset-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(LevelBar.class, "__signalLevelBarOffsetChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalLevelBarOffsetChanged(MemoryAddress source, MemoryAddress name, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (LevelBar.OffsetChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new LevelBar(References.get(source)), name.getUtf8String(0));
    }
    
}
