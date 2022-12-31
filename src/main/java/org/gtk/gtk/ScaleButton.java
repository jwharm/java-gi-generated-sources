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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ScaleButton proxy instance for the provided memory address.
     * <p>
     * Because ScaleButton is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ScaleButton(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ScaleButton> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ScaleButton(input, ownership);
    
    private static MemoryAddress constructNew(double min, double max, double step, @Nullable java.lang.String[] icons) {
        MemoryAddress RESULT;
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
    public org.gtk.gtk.Adjustment getAdjustment() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scale_button_get_adjustment.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Adjustment) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Adjustment.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the minus button of the {@code GtkScaleButton}.
     * @return the minus button
     *   of the {@code GtkScaleButton}
     */
    public org.gtk.gtk.Button getMinusButton() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scale_button_get_minus_button.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Button) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Button.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the plus button of the {@code GtkScaleButton.}
     * @return the plus button
     *   of the {@code GtkScaleButton}
     */
    public org.gtk.gtk.Button getPlusButton() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scale_button_get_plus_button.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Button) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Button.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the popup of the {@code GtkScaleButton}.
     * @return the popup of the {@code GtkScaleButton}
     */
    public org.gtk.gtk.Widget getPopup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scale_button_get_popup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
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
    public void setAdjustment(org.gtk.gtk.Adjustment adjustment) {
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
    public void setIcons(java.lang.String[] icons) {
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_scale_button_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Popdown {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceScaleButton) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Popdown.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
                handle(), Interop.allocateNativeString("popdown"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Popup {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceScaleButton) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Popup.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
                handle(), Interop.allocateNativeString("popup"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ValueChanged {
        void run(double value);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceScaleButton, double value) {
            run(value);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ValueChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the value field has changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ScaleButton.ValueChanged> onValueChanged(ScaleButton.ValueChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("value-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link ScaleButton.Builder} object constructs a {@link ScaleButton} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ScaleButton.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ScaleButton} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ScaleButton}.
         * @return A new instance of {@code ScaleButton} with the properties 
         *         that were set in the Builder object.
         */
        public ScaleButton build() {
            return (ScaleButton) org.gtk.gobject.GObject.newWithProperties(
                ScaleButton.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The {@code GtkAdjustment} that is used as the model.
         * @param adjustment The value for the {@code adjustment} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAdjustment(org.gtk.gtk.Adjustment adjustment) {
            names.add("adjustment");
            values.add(org.gtk.gobject.Value.create(adjustment));
            return this;
        }
        
        /**
         * The value of the scale.
         * @param value The value for the {@code value} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValue(double value) {
            names.add("value");
            values.add(org.gtk.gobject.Value.create(value));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_scale_button_new = Interop.downcallHandle(
            "gtk_scale_button_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scale_button_get_adjustment = Interop.downcallHandle(
            "gtk_scale_button_get_adjustment",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scale_button_get_minus_button = Interop.downcallHandle(
            "gtk_scale_button_get_minus_button",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scale_button_get_plus_button = Interop.downcallHandle(
            "gtk_scale_button_get_plus_button",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scale_button_get_popup = Interop.downcallHandle(
            "gtk_scale_button_get_popup",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scale_button_get_value = Interop.downcallHandle(
            "gtk_scale_button_get_value",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scale_button_set_adjustment = Interop.downcallHandle(
            "gtk_scale_button_set_adjustment",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scale_button_set_icons = Interop.downcallHandle(
            "gtk_scale_button_set_icons",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_scale_button_set_value = Interop.downcallHandle(
            "gtk_scale_button_set_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_scale_button_get_type = Interop.downcallHandle(
            "gtk_scale_button_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
