package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkScaleButton} provides a button which pops up a scale widget.
 * <p>
 * This kind of widget is commonly used for volume controls in multimedia
 * applications, and GTK provides a {@link VolumeButton} subclass that
 * is tailored for this use case.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkScaleButton} has a single CSS node with name button. To differentiate
 * it from a plain {@code GtkButton}, it gets the .scale style class.
 */
public class ScaleButton extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkScaleButton";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gtk.Widget parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gtk.Widget(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a ScaleButton proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ScaleButton(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ScaleButton if its GType is a (or inherits from) "GtkScaleButton".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ScaleButton} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkScaleButton", a ClassCastException will be thrown.
     */
    public static ScaleButton castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkScaleButton"))) {
            return new ScaleButton(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkScaleButton");
        }
    }
    
    private static Addressable constructNew(double min, double max, double step, @Nullable java.lang.String[] icons) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scale_button_new.invokeExact(
                    min,
                    max,
                    step,
                    (Addressable) (icons == null ? MemoryAddress.NULL : Interop.allocateNativeArray(icons, false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkScaleButton}.
     * <p>
     * The new scale button has a range between {@code min} and {@code max},
     * with a stepping of {@code step}.
     * @param min the minimum value of the scale (usually 0)
     * @param max the maximum value of the scale (usually 100)
     * @param step the stepping of value when a scroll-wheel event,
     *   or up/down arrow event occurs (usually 2)
     * @param icons a {@code null}-terminated
     *   array of icon names, or {@code null} if you want to set the list
     *   later with gtk_scale_button_set_icons()
     */
    public ScaleButton(double min, double max, double step, @Nullable java.lang.String[] icons) {
        super(constructNew(min, max, step, icons), Ownership.NONE);
    }
    
    /**
     * Gets the {@code GtkAdjustment} associated with the {@code GtkScaleButton}’s scale.
     * <p>
     * See {@link Range#getAdjustment} for details.
     * @return the adjustment associated with the scale
     */
    public @NotNull org.gtk.gtk.Adjustment getAdjustment() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scale_button_get_adjustment.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Adjustment(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the minus button of the {@code GtkScaleButton}.
     * @return the minus button
     *   of the {@code GtkScaleButton}
     */
    public @NotNull org.gtk.gtk.Button getMinusButton() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scale_button_get_minus_button.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Button(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the plus button of the {@code GtkScaleButton.}
     * @return the plus button
     *   of the {@code GtkScaleButton}
     */
    public @NotNull org.gtk.gtk.Button getPlusButton() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scale_button_get_plus_button.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Button(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the popup of the {@code GtkScaleButton}.
     * @return the popup of the {@code GtkScaleButton}
     */
    public @NotNull org.gtk.gtk.Widget getPopup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scale_button_get_popup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the current value of the scale button.
     * @return current value of the scale button
     */
    public double getValue() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_scale_button_get_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the {@code GtkAdjustment} to be used as a model
     * for the {@code GtkScaleButton}’s scale.
     * <p>
     * See {@link Range#setAdjustment} for details.
     * @param adjustment a {@code GtkAdjustment}
     */
    public void setAdjustment(@NotNull org.gtk.gtk.Adjustment adjustment) {
        java.util.Objects.requireNonNull(adjustment, "Parameter 'adjustment' must not be null");
        try {
            DowncallHandles.gtk_scale_button_set_adjustment.invokeExact(
                    handle(),
                    adjustment.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the icons to be used by the scale button.
     * @param icons a {@code null}-terminated array of icon names
     */
    public void setIcons(@NotNull java.lang.String[] icons) {
        java.util.Objects.requireNonNull(icons, "Parameter 'icons' must not be null");
        try {
            DowncallHandles.gtk_scale_button_set_icons.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(icons, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the current value of the scale.
     * <p>
     * If the value is outside the minimum or maximum range values,
     * it will be clamped to fit inside them.
     * <p>
     * The scale button emits the {@code Gtk.ScaleButton::value-changed}
     * signal if the value changes.
     * @param value new value of the scale button
     */
    public void setValue(double value) {
        try {
            DowncallHandles.gtk_scale_button_set_value.invokeExact(
                    handle(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Popdown {
        void signalReceived(ScaleButton source);
    }
    
    /**
     * Emitted to dismiss the popup.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;Escape&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ScaleButton.Popdown> onPopdown(ScaleButton.Popdown handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("popdown"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ScaleButton.Callbacks.class, "signalScaleButtonPopdown",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ScaleButton.Popdown>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Popup {
        void signalReceived(ScaleButton source);
    }
    
    /**
     * Emitted to popup the scale widget.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are &lt;kbd&gt;Space&lt;/kbd&gt;,
     * &lt;kbd&gt;Enter&lt;/kbd&gt; and &lt;kbd&gt;Return&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ScaleButton.Popup> onPopup(ScaleButton.Popup handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("popup"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ScaleButton.Callbacks.class, "signalScaleButtonPopup",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ScaleButton.Popup>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ValueChanged {
        void signalReceived(ScaleButton source, double value);
    }
    
    /**
     * Emitted when the value field has changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ScaleButton.ValueChanged> onValueChanged(ScaleButton.ValueChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("value-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ScaleButton.Callbacks.class, "signalScaleButtonValueChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ScaleButton.ValueChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_scale_button_new = Interop.downcallHandle(
            "gtk_scale_button_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scale_button_get_adjustment = Interop.downcallHandle(
            "gtk_scale_button_get_adjustment",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scale_button_get_minus_button = Interop.downcallHandle(
            "gtk_scale_button_get_minus_button",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scale_button_get_plus_button = Interop.downcallHandle(
            "gtk_scale_button_get_plus_button",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scale_button_get_popup = Interop.downcallHandle(
            "gtk_scale_button_get_popup",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scale_button_get_value = Interop.downcallHandle(
            "gtk_scale_button_get_value",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scale_button_set_adjustment = Interop.downcallHandle(
            "gtk_scale_button_set_adjustment",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scale_button_set_icons = Interop.downcallHandle(
            "gtk_scale_button_set_icons",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scale_button_set_value = Interop.downcallHandle(
            "gtk_scale_button_set_value",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalScaleButtonPopdown(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ScaleButton.Popdown) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ScaleButton(source, Ownership.UNKNOWN));
        }
        
        public static void signalScaleButtonPopup(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ScaleButton.Popup) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ScaleButton(source, Ownership.UNKNOWN));
        }
        
        public static void signalScaleButtonValueChanged(MemoryAddress source, double value, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ScaleButton.ValueChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ScaleButton(source, Ownership.UNKNOWN), value);
        }
    }
}
