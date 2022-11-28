package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkProgressBar} is typically used to display the progress of a long
 * running operation.
 * <p>
 * It provides a visual clue that processing is underway. {@code GtkProgressBar}
 * can be used in two different modes: percentage mode and activity mode.
 * <p>
 * <img src="./doc-files/progressbar.png" alt="An example GtkProgressBar">
 * <p>
 * When an application can determine how much work needs to take place
 * (e.g. read a fixed number of bytes from a file) and can monitor its
 * progress, it can use the {@code GtkProgressBar} in percentage mode and the
 * user sees a growing bar indicating the percentage of the work that
 * has been completed. In this mode, the application is required to call
 * {@link ProgressBar#setFraction} periodically to update the progress bar.
 * <p>
 * When an application has no accurate way of knowing the amount of work
 * to do, it can use the {@code GtkProgressBar} in activity mode, which shows
 * activity by a block moving back and forth within the progress area. In
 * this mode, the application is required to call {@link ProgressBar#pulse}
 * periodically to update the progress bar.
 * <p>
 * There is quite a bit of flexibility provided to control the appearance
 * of the {@code GtkProgressBar}. Functions are provided to control the orientation
 * of the bar, optional text can be displayed along with the bar, and the
 * step size used in activity mode can be set.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * progressbar[.osd]
 * ├── [text]
 * ╰── trough[.empty][.full]
 *     ╰── progress[.pulse]
 * }</pre>
 * <p>
 * {@code GtkProgressBar} has a main CSS node with name progressbar and subnodes with
 * names text and trough, of which the latter has a subnode named progress. The
 * text subnode is only present if text is shown. The progress subnode has the
 * style class .pulse when in activity mode. It gets the style classes .left,
 * .right, .top or .bottom added when the progress 'touches' the corresponding
 * end of the GtkProgressBar. The .osd class on the progressbar node is for use
 * in overlays like the one Epiphany has for page loading progress.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkProgressBar} uses the {@link AccessibleRole#PROGRESS_BAR} role.
 */
public class ProgressBar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkProgressBar";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ProgressBar proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ProgressBar(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ProgressBar if its GType is a (or inherits from) "GtkProgressBar".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ProgressBar} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkProgressBar", a ClassCastException will be thrown.
     */
    public static ProgressBar castFrom(org.gtk.gobject.Object gobject) {
            return new ProgressBar(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_progress_bar_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkProgressBar}.
     */
    public ProgressBar() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Returns the ellipsizing position of the progress bar.
     * <p>
     * See {@link ProgressBar#setEllipsize}.
     * @return {@code PangoEllipsizeMode}
     */
    public @NotNull org.pango.EllipsizeMode getEllipsize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_progress_bar_get_ellipsize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.EllipsizeMode(RESULT);
    }
    
    /**
     * Returns the current fraction of the task that’s been completed.
     * @return a fraction from 0.0 to 1.0
     */
    public double getFraction() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_progress_bar_get_fraction.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns whether the progress bar is inverted.
     * @return {@code true} if the progress bar is inverted
     */
    public boolean getInverted() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_progress_bar_get_inverted.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the pulse step.
     * <p>
     * See {@link ProgressBar#setPulseStep}.
     * @return a fraction from 0.0 to 1.0
     */
    public double getPulseStep() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_progress_bar_get_pulse_step.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns whether the {@code GtkProgressBar} shows text.
     * <p>
     * See {@link ProgressBar#setShowText}.
     * @return {@code true} if text is shown in the progress bar
     */
    public boolean getShowText() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_progress_bar_get_show_text.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the text that is displayed with the progress bar.
     * <p>
     * The return value is a reference to the text, not a copy of it,
     * so will become invalid if you change the text in the progress bar.
     * @return the text
     */
    public @Nullable java.lang.String getText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_progress_bar_get_text.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Indicates that some progress has been made, but you don’t know how much.
     * <p>
     * Causes the progress bar to enter “activity mode,” where a block
     * bounces back and forth. Each call to {@link ProgressBar#pulse}
     * causes the block to move by a little bit (the amount of movement
     * per pulse is determined by {@link ProgressBar#setPulseStep}).
     */
    public void pulse() {
        try {
            DowncallHandles.gtk_progress_bar_pulse.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the mode used to ellipsize the text.
     * <p>
     * The text is ellipsized if there is not enough space
     * to render the entire string.
     * @param mode a {@code PangoEllipsizeMode}
     */
    public void setEllipsize(@NotNull org.pango.EllipsizeMode mode) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        try {
            DowncallHandles.gtk_progress_bar_set_ellipsize.invokeExact(
                    handle(),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Causes the progress bar to “fill in” the given fraction
     * of the bar.
     * <p>
     * The fraction should be between 0.0 and 1.0, inclusive.
     * @param fraction fraction of the task that’s been completed
     */
    public void setFraction(double fraction) {
        try {
            DowncallHandles.gtk_progress_bar_set_fraction.invokeExact(
                    handle(),
                    fraction);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the progress bar is inverted.
     * <p>
     * Progress bars normally grow from top to bottom or left to right.
     * Inverted progress bars grow in the opposite direction.
     * @param inverted {@code true} to invert the progress bar
     */
    public void setInverted(boolean inverted) {
        try {
            DowncallHandles.gtk_progress_bar_set_inverted.invokeExact(
                    handle(),
                    inverted ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the fraction of total progress bar length to move the
     * bouncing block.
     * <p>
     * The bouncing block is moved when {@link ProgressBar#pulse}
     * is called.
     * @param fraction fraction between 0.0 and 1.0
     */
    public void setPulseStep(double fraction) {
        try {
            DowncallHandles.gtk_progress_bar_set_pulse_step.invokeExact(
                    handle(),
                    fraction);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the progress bar will show text next to the bar.
     * <p>
     * The shown text is either the value of the {@code Gtk.ProgressBar:text}
     * property or, if that is {@code null}, the {@code Gtk.ProgressBar:fraction} value,
     * as a percentage.
     * <p>
     * To make a progress bar that is styled and sized suitably for containing
     * text (even if the actual text is blank), set {@code Gtk.ProgressBar:show-text}
     * to {@code true} and {@code Gtk.ProgressBar:text} to the empty string (not {@code null}).
     * @param showText whether to show text
     */
    public void setShowText(boolean showText) {
        try {
            DowncallHandles.gtk_progress_bar_set_show_text.invokeExact(
                    handle(),
                    showText ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Causes the given {@code text} to appear next to the progress bar.
     * <p>
     * If {@code text} is {@code null} and {@code Gtk.ProgressBar:show-text} is {@code true},
     * the current value of {@code Gtk.ProgressBar:fraction} will be displayed
     * as a percentage.
     * <p>
     * If {@code text} is non-{@code null} and {@code Gtk.ProgressBar:show-text} is {@code true},
     * the text will be displayed. In this case, it will not display the progress
     * percentage. If {@code text} is the empty string, the progress bar will still
     * be styled and sized suitably for containing text, as long as
     * {@code Gtk.ProgressBar:show-text} is {@code true}.
     * @param text a UTF-8 string
     */
    public void setText(@Nullable java.lang.String text) {
        try {
            DowncallHandles.gtk_progress_bar_set_text.invokeExact(
                    handle(),
                    (Addressable) (text == null ? MemoryAddress.NULL : Interop.allocateNativeString(text)));
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
            RESULT = (long) DowncallHandles.gtk_progress_bar_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link ProgressBar.Build} object constructs a {@link ProgressBar} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ProgressBar} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ProgressBar} using {@link ProgressBar#castFrom}.
         * @return A new instance of {@code ProgressBar} with the properties 
         *         that were set in the Build object.
         */
        public ProgressBar construct() {
            return ProgressBar.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ProgressBar.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The preferred place to ellipsize the string.
         * <p>
         * The text will be ellipsized if the progress bar does not have enough room
         * to display the entire string, specified as a {@code PangoEllipsizeMode}.
         * <p>
         * Note that setting this property to a value other than
         * {@link org.pango.EllipsizeMode#NONE} has the side-effect that the progress bar requests
         * only enough space to display the ellipsis ("..."). Another means to set a
         * progress bar's width is {@link Widget#setSizeRequest}.
         * @param ellipsize The value for the {@code ellipsize} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEllipsize(org.pango.EllipsizeMode ellipsize) {
            names.add("ellipsize");
            values.add(org.gtk.gobject.Value.create(ellipsize));
            return this;
        }
        
        /**
         * The fraction of total work that has been completed.
         * @param fraction The value for the {@code fraction} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFraction(double fraction) {
            names.add("fraction");
            values.add(org.gtk.gobject.Value.create(fraction));
            return this;
        }
        
        /**
         * Invert the direction in which the progress bar grows.
         * @param inverted The value for the {@code inverted} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInverted(boolean inverted) {
            names.add("inverted");
            values.add(org.gtk.gobject.Value.create(inverted));
            return this;
        }
        
        /**
         * The fraction of total progress to move the bounding block when pulsed.
         * @param pulseStep The value for the {@code pulse-step} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPulseStep(double pulseStep) {
            names.add("pulse-step");
            values.add(org.gtk.gobject.Value.create(pulseStep));
            return this;
        }
        
        /**
         * Sets whether the progress bar will show a text in addition
         * to the bar itself.
         * <p>
         * The shown text is either the value of the {@code Gtk.ProgressBar:text}
         * property or, if that is {@code null}, the {@code Gtk.ProgressBar:fraction}
         * value, as a percentage.
         * <p>
         * To make a progress bar that is styled and sized suitably for showing text
         * (even if the actual text is blank), set {@code Gtk.ProgressBar:show-text}
         * to {@code true} and {@code Gtk.ProgressBar:text} to the empty string (not {@code null}).
         * @param showText The value for the {@code show-text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShowText(boolean showText) {
            names.add("show-text");
            values.add(org.gtk.gobject.Value.create(showText));
            return this;
        }
        
        /**
         * Text to be displayed in the progress bar.
         * @param text The value for the {@code text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setText(java.lang.String text) {
            names.add("text");
            values.add(org.gtk.gobject.Value.create(text));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_progress_bar_new = Interop.downcallHandle(
            "gtk_progress_bar_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_progress_bar_get_ellipsize = Interop.downcallHandle(
            "gtk_progress_bar_get_ellipsize",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_progress_bar_get_fraction = Interop.downcallHandle(
            "gtk_progress_bar_get_fraction",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_progress_bar_get_inverted = Interop.downcallHandle(
            "gtk_progress_bar_get_inverted",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_progress_bar_get_pulse_step = Interop.downcallHandle(
            "gtk_progress_bar_get_pulse_step",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_progress_bar_get_show_text = Interop.downcallHandle(
            "gtk_progress_bar_get_show_text",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_progress_bar_get_text = Interop.downcallHandle(
            "gtk_progress_bar_get_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_progress_bar_pulse = Interop.downcallHandle(
            "gtk_progress_bar_pulse",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_progress_bar_set_ellipsize = Interop.downcallHandle(
            "gtk_progress_bar_set_ellipsize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_progress_bar_set_fraction = Interop.downcallHandle(
            "gtk_progress_bar_set_fraction",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_progress_bar_set_inverted = Interop.downcallHandle(
            "gtk_progress_bar_set_inverted",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_progress_bar_set_pulse_step = Interop.downcallHandle(
            "gtk_progress_bar_set_pulse_step",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_progress_bar_set_show_text = Interop.downcallHandle(
            "gtk_progress_bar_set_show_text",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_progress_bar_set_text = Interop.downcallHandle(
            "gtk_progress_bar_set_text",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_progress_bar_get_type = Interop.downcallHandle(
            "gtk_progress_bar_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
