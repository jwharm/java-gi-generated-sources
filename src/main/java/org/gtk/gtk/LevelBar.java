package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>Adding a custom offset on the bar</strong><br/>
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
 * <strong>GtkLevelBar as GtkBuildable</strong><br/>
 * The {@code GtkLevelBar} implementation of the {@code GtkBuildable} interface supports a
 * custom &lt;offsets&gt; element, which can contain any number of &lt;offset&gt; elements,
 * each of which must have name and value attributes.
 * <p>
 * <strong>CSS nodes</strong><br/>
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
 * <strong>Accessibility</strong><br/>
 * {@code GtkLevelBar} uses the {@link AccessibleRole#METER} role.
 */
public class LevelBar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkLevelBar";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a LevelBar proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public LevelBar(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to LevelBar if its GType is a (or inherits from) "GtkLevelBar".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code LevelBar} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkLevelBar", a ClassCastException will be thrown.
     */
    public static LevelBar castFrom(org.gtk.gobject.Object gobject) {
            return new LevelBar(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_level_bar_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkLevelBar}.
     */
    public LevelBar() {
        super(constructNew(), Ownership.NONE);
    }
    
    private static Addressable constructNewForInterval(double minValue, double maxValue) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_level_bar_new_for_interval.invokeExact(
                    minValue,
                    maxValue);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkLevelBar} for the specified interval.
     * @param minValue a positive value
     * @param maxValue a positive value
     * @return a {@code GtkLevelBar}
     */
    public static LevelBar newForInterval(double minValue, double maxValue) {
        return new LevelBar(constructNewForInterval(minValue, maxValue), Ownership.NONE);
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
     * @param name the name of the new offset
     * @param value the value for the new offset
     */
    public void addOffsetValue(@NotNull java.lang.String name, double value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gtk_level_bar_add_offset_value.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns whether the levelbar is inverted.
     * @return {@code true} if the level bar is inverted
     */
    public boolean getInverted() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_level_bar_get_inverted.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the {@code max-value} of the {@code GtkLevelBar}.
     * @return a positive value
     */
    public double getMaxValue() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_level_bar_get_max_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the {@code min-value of the }GtkLevelBar`.
     * @return a positive value
     */
    public double getMinValue() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_level_bar_get_min_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the {@code mode} of the {@code GtkLevelBar}.
     * @return a {@code GtkLevelBarMode}
     */
    public @NotNull org.gtk.gtk.LevelBarMode getMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_level_bar_get_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.LevelBarMode(RESULT);
    }
    
    /**
     * Fetches the value specified for the offset marker {@code name} in {@code self}.
     * @param name the name of an offset in the bar
     * @param value location where to store the value
     * @return {@code true} if the specified offset is found
     */
    public boolean getOffsetValue(@Nullable java.lang.String name, Out<Double> value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_level_bar_get_offset_value.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return RESULT != 0;
    }
    
    /**
     * Returns the {@code value} of the {@code GtkLevelBar}.
     * @return a value in the interval between
     *   {@code Gtk.LevelBar:min-value[ and [property@Gtk.LevelBar:max-value}
     */
    public double getValue() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_level_bar_get_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Removes an offset marker from a {@code GtkLevelBar}.
     * <p>
     * The marker must have been previously added with
     * {@link LevelBar#addOffsetValue}.
     * @param name the name of an offset in the bar
     */
    public void removeOffsetValue(@Nullable java.lang.String name) {
        try {
            DowncallHandles.gtk_level_bar_remove_offset_value.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the {@code GtkLevelBar} is inverted.
     * @param inverted {@code true} to invert the level bar
     */
    public void setInverted(boolean inverted) {
        try {
            DowncallHandles.gtk_level_bar_set_inverted.invokeExact(
                    handle(),
                    inverted ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code max-value} of the {@code GtkLevelBar}.
     * <p>
     * You probably want to update preexisting level offsets after calling
     * this function.
     * @param value a positive value
     */
    public void setMaxValue(double value) {
        try {
            DowncallHandles.gtk_level_bar_set_max_value.invokeExact(
                    handle(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code min-value} of the {@code GtkLevelBar}.
     * <p>
     * You probably want to update preexisting level offsets after calling
     * this function.
     * @param value a positive value
     */
    public void setMinValue(double value) {
        try {
            DowncallHandles.gtk_level_bar_set_min_value.invokeExact(
                    handle(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code mode} of the {@code GtkLevelBar}.
     * @param mode a {@code GtkLevelBarMode}
     */
    public void setMode(@NotNull org.gtk.gtk.LevelBarMode mode) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        try {
            DowncallHandles.gtk_level_bar_set_mode.invokeExact(
                    handle(),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of the {@code GtkLevelBar}.
     * @param value a value in the interval between
     *   {@code Gtk.LevelBar:min-value} and {@code Gtk.LevelBar:max-value}
     */
    public void setValue(double value) {
        try {
            DowncallHandles.gtk_level_bar_set_value.invokeExact(
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_level_bar_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface OffsetChanged {
        void signalReceived(LevelBar source, @NotNull java.lang.String name);
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
     * @param detail The signal detail
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<LevelBar.OffsetChanged> onOffsetChanged(@Nullable String detail, LevelBar.OffsetChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("offset-changed" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail))),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(LevelBar.Callbacks.class, "signalLevelBarOffsetChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<LevelBar.OffsetChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link LevelBar.Build} object constructs a {@link LevelBar} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link LevelBar} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link LevelBar} using {@link LevelBar#castFrom}.
         * @return A new instance of {@code LevelBar} with the properties 
         *         that were set in the Build object.
         */
        public LevelBar construct() {
            return LevelBar.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    LevelBar.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Whether the {@code GtkLeveBar} is inverted.
         * <p>
         * Level bars normally grow from top to bottom or left to right.
         * Inverted level bars grow in the opposite direction.
         * @param inverted The value for the {@code inverted} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInverted(boolean inverted) {
            names.add("inverted");
            values.add(org.gtk.gobject.Value.create(inverted));
            return this;
        }
        
        /**
         * Determines the maximum value of the interval that can be displayed by the bar.
         * @param maxValue The value for the {@code max-value} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMaxValue(double maxValue) {
            names.add("max-value");
            values.add(org.gtk.gobject.Value.create(maxValue));
            return this;
        }
        
        /**
         * Determines the minimum value of the interval that can be displayed by the bar.
         * @param minValue The value for the {@code min-value} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMinValue(double minValue) {
            names.add("min-value");
            values.add(org.gtk.gobject.Value.create(minValue));
            return this;
        }
        
        /**
         * Determines the way {@code GtkLevelBar} interprets the value properties to draw the
         * level fill area.
         * <p>
         * Specifically, when the value is {@link LevelBarMode#CONTINUOUS},
         * {@code GtkLevelBar} will draw a single block representing the current value in
         * that area; when the value is {@link LevelBarMode#DISCRETE},
         * the widget will draw a succession of separate blocks filling the
         * draw area, with the number of blocks being equal to the units separating
         * the integral roundings of {@code Gtk.LevelBar:min-value} and
         * {@code Gtk.LevelBar:max-value}.
         * @param mode The value for the {@code mode} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMode(org.gtk.gtk.LevelBarMode mode) {
            names.add("mode");
            values.add(org.gtk.gobject.Value.create(mode));
            return this;
        }
        
        /**
         * Determines the currently filled value of the level bar.
         * @param value The value for the {@code value} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setValue(double value) {
            names.add("value");
            values.add(org.gtk.gobject.Value.create(value));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_level_bar_new = Interop.downcallHandle(
            "gtk_level_bar_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_level_bar_new_for_interval = Interop.downcallHandle(
            "gtk_level_bar_new_for_interval",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_level_bar_add_offset_value = Interop.downcallHandle(
            "gtk_level_bar_add_offset_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_level_bar_get_inverted = Interop.downcallHandle(
            "gtk_level_bar_get_inverted",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_level_bar_get_max_value = Interop.downcallHandle(
            "gtk_level_bar_get_max_value",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_level_bar_get_min_value = Interop.downcallHandle(
            "gtk_level_bar_get_min_value",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_level_bar_get_mode = Interop.downcallHandle(
            "gtk_level_bar_get_mode",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_level_bar_get_offset_value = Interop.downcallHandle(
            "gtk_level_bar_get_offset_value",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_level_bar_get_value = Interop.downcallHandle(
            "gtk_level_bar_get_value",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_level_bar_remove_offset_value = Interop.downcallHandle(
            "gtk_level_bar_remove_offset_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_level_bar_set_inverted = Interop.downcallHandle(
            "gtk_level_bar_set_inverted",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_level_bar_set_max_value = Interop.downcallHandle(
            "gtk_level_bar_set_max_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_level_bar_set_min_value = Interop.downcallHandle(
            "gtk_level_bar_set_min_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_level_bar_set_mode = Interop.downcallHandle(
            "gtk_level_bar_set_mode",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_level_bar_set_value = Interop.downcallHandle(
            "gtk_level_bar_set_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_level_bar_get_type = Interop.downcallHandle(
            "gtk_level_bar_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalLevelBarOffsetChanged(MemoryAddress source, MemoryAddress name, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (LevelBar.OffsetChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new LevelBar(source, Ownership.NONE), Interop.getStringFrom(name));
        }
    }
}
