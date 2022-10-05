package org.gtk.gtk;

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

    public LevelBar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to LevelBar */
    public static LevelBar castFrom(org.gtk.gobject.Object gobject) {
        return new LevelBar(gobject.refcounted());
    }
    
    static final MethodHandle gtk_level_bar_new = Interop.downcallHandle(
        "gtk_level_bar_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_level_bar_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkLevelBar}.
     */
    public LevelBar() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_level_bar_new_for_interval = Interop.downcallHandle(
        "gtk_level_bar_new_for_interval",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    private static Refcounted constructNewForInterval(double minValue, double maxValue) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_level_bar_new_for_interval.invokeExact(minValue, maxValue), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkLevelBar} for the specified interval.
     */
    public static LevelBar newForInterval(double minValue, double maxValue) {
        return new LevelBar(constructNewForInterval(minValue, maxValue));
    }
    
    static final MethodHandle gtk_level_bar_add_offset_value = Interop.downcallHandle(
        "gtk_level_bar_add_offset_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
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
        try {
            gtk_level_bar_add_offset_value.invokeExact(handle(), Interop.allocateNativeString(name).handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_level_bar_get_inverted = Interop.downcallHandle(
        "gtk_level_bar_get_inverted",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the levelbar is inverted.
     */
    public boolean getInverted() {
        try {
            var RESULT = (int) gtk_level_bar_get_inverted.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_level_bar_get_max_value = Interop.downcallHandle(
        "gtk_level_bar_get_max_value",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code max-value} of the {@code GtkLevelBar}.
     */
    public double getMaxValue() {
        try {
            var RESULT = (double) gtk_level_bar_get_max_value.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_level_bar_get_min_value = Interop.downcallHandle(
        "gtk_level_bar_get_min_value",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code min-value of the }GtkLevelBar`.
     */
    public double getMinValue() {
        try {
            var RESULT = (double) gtk_level_bar_get_min_value.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_level_bar_get_mode = Interop.downcallHandle(
        "gtk_level_bar_get_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code mode} of the {@code GtkLevelBar}.
     */
    public LevelBarMode getMode() {
        try {
            var RESULT = (int) gtk_level_bar_get_mode.invokeExact(handle());
            return new LevelBarMode(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_level_bar_get_offset_value = Interop.downcallHandle(
        "gtk_level_bar_get_offset_value",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the value specified for the offset marker {@code name} in {@code self}.
     */
    public boolean getOffsetValue(java.lang.String name, PointerDouble value) {
        try {
            var RESULT = (int) gtk_level_bar_get_offset_value.invokeExact(handle(), Interop.allocateNativeString(name).handle(), value.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_level_bar_get_value = Interop.downcallHandle(
        "gtk_level_bar_get_value",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code value} of the {@code GtkLevelBar}.
     */
    public double getValue() {
        try {
            var RESULT = (double) gtk_level_bar_get_value.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_level_bar_remove_offset_value = Interop.downcallHandle(
        "gtk_level_bar_remove_offset_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes an offset marker from a {@code GtkLevelBar}.
     * <p>
     * The marker must have been previously added with
     * {@link LevelBar#addOffsetValue}.
     */
    public void removeOffsetValue(java.lang.String name) {
        try {
            gtk_level_bar_remove_offset_value.invokeExact(handle(), Interop.allocateNativeString(name).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_level_bar_set_inverted = Interop.downcallHandle(
        "gtk_level_bar_set_inverted",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the {@code GtkLevelBar} is inverted.
     */
    public void setInverted(boolean inverted) {
        try {
            gtk_level_bar_set_inverted.invokeExact(handle(), inverted ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_level_bar_set_max_value = Interop.downcallHandle(
        "gtk_level_bar_set_max_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the {@code max-value} of the {@code GtkLevelBar}.
     * <p>
     * You probably want to update preexisting level offsets after calling
     * this function.
     */
    public void setMaxValue(double value) {
        try {
            gtk_level_bar_set_max_value.invokeExact(handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_level_bar_set_min_value = Interop.downcallHandle(
        "gtk_level_bar_set_min_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the {@code min-value} of the {@code GtkLevelBar}.
     * <p>
     * You probably want to update preexisting level offsets after calling
     * this function.
     */
    public void setMinValue(double value) {
        try {
            gtk_level_bar_set_min_value.invokeExact(handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_level_bar_set_mode = Interop.downcallHandle(
        "gtk_level_bar_set_mode",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@code mode} of the {@code GtkLevelBar}.
     */
    public void setMode(LevelBarMode mode) {
        try {
            gtk_level_bar_set_mode.invokeExact(handle(), mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_level_bar_set_value = Interop.downcallHandle(
        "gtk_level_bar_set_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the value of the {@code GtkLevelBar}.
     */
    public void setValue(double value) {
        try {
            gtk_level_bar_set_value.invokeExact(handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("offset-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(LevelBar.Callbacks.class, "signalLevelBarOffsetChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalLevelBarOffsetChanged(MemoryAddress source, MemoryAddress name, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (LevelBar.OffsetChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new LevelBar(Refcounted.get(source)), name.getUtf8String(0));
        }
        
    }
}
