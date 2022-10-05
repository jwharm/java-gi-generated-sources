package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkScaleButton} provides a button which pops up a scale widget.
 * <p>
 * This kind of widget is commonly used for volume controls in multimedia
 * applications, and GTK provides a {@link VolumeButton} subclass that
 * is tailored for this use case.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * {@code GtkScaleButton} has a single CSS node with name button. To differentiate
 * it from a plain {@code GtkButton}, it gets the .scale style class.
 */
public class ScaleButton extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public ScaleButton(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ScaleButton */
    public static ScaleButton castFrom(org.gtk.gobject.Object gobject) {
        return new ScaleButton(gobject.refcounted());
    }
    
    static final MethodHandle gtk_scale_button_new = Interop.downcallHandle(
        "gtk_scale_button_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(double min, double max, double step, java.lang.String[] icons) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_scale_button_new.invokeExact(min, max, step, Interop.allocateNativeArray(icons).handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GtkScaleButton}.
     * <p>
     * The new scale button has a range between {@code min} and {@code max},
     * with a stepping of {@code step}.
     */
    public ScaleButton(double min, double max, double step, java.lang.String[] icons) {
        super(constructNew(min, max, step, icons));
    }
    
    static final MethodHandle gtk_scale_button_get_adjustment = Interop.downcallHandle(
        "gtk_scale_button_get_adjustment",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GtkAdjustment} associated with the {@code GtkScaleButton}’s scale.
     * <p>
     * See {@link Range#getAdjustment} for details.
     */
    public Adjustment getAdjustment() {
        try {
            var RESULT = (MemoryAddress) gtk_scale_button_get_adjustment.invokeExact(handle());
            return new Adjustment(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_scale_button_get_minus_button = Interop.downcallHandle(
        "gtk_scale_button_get_minus_button",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the minus button of the {@code GtkScaleButton}.
     */
    public Button getMinusButton() {
        try {
            var RESULT = (MemoryAddress) gtk_scale_button_get_minus_button.invokeExact(handle());
            return new Button(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_scale_button_get_plus_button = Interop.downcallHandle(
        "gtk_scale_button_get_plus_button",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the plus button of the {@code GtkScaleButton.}
     */
    public Button getPlusButton() {
        try {
            var RESULT = (MemoryAddress) gtk_scale_button_get_plus_button.invokeExact(handle());
            return new Button(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_scale_button_get_popup = Interop.downcallHandle(
        "gtk_scale_button_get_popup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the popup of the {@code GtkScaleButton}.
     */
    public Widget getPopup() {
        try {
            var RESULT = (MemoryAddress) gtk_scale_button_get_popup.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_scale_button_get_value = Interop.downcallHandle(
        "gtk_scale_button_get_value",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current value of the scale button.
     */
    public double getValue() {
        try {
            var RESULT = (double) gtk_scale_button_get_value.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_scale_button_set_adjustment = Interop.downcallHandle(
        "gtk_scale_button_set_adjustment",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code GtkAdjustment} to be used as a model
     * for the {@code GtkScaleButton}’s scale.
     * <p>
     * See {@link Range#setAdjustment} for details.
     */
    public void setAdjustment(Adjustment adjustment) {
        try {
            gtk_scale_button_set_adjustment.invokeExact(handle(), adjustment.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_scale_button_set_icons = Interop.downcallHandle(
        "gtk_scale_button_set_icons",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the icons to be used by the scale button.
     */
    public void setIcons(java.lang.String[] icons) {
        try {
            gtk_scale_button_set_icons.invokeExact(handle(), Interop.allocateNativeArray(icons).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_scale_button_set_value = Interop.downcallHandle(
        "gtk_scale_button_set_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the current value of the scale.
     * <p>
     * If the value is outside the minimum or maximum range values,
     * it will be clamped to fit inside them.
     * <p>
     * The scale button emits the {@code Gtk.ScaleButton::value-changed}
     * signal if the value changes.
     */
    public void setValue(double value) {
        try {
            gtk_scale_button_set_value.invokeExact(handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PopdownHandler {
        void signalReceived(ScaleButton source);
    }
    
    /**
     * Emitted to dismiss the popup.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is &lt;kbd>Escape</kbd&gt;.
     */
    public SignalHandle onPopdown(PopdownHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("popdown").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ScaleButton.Callbacks.class, "signalScaleButtonPopdown",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PopupHandler {
        void signalReceived(ScaleButton source);
    }
    
    /**
     * Emitted to popup the scale widget.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are &lt;kbd>Space</kbd&gt;,
     * &lt;kbd>Enter</kbd> and <kbd>Return</kbd&gt;.
     */
    public SignalHandle onPopup(PopupHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("popup").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ScaleButton.Callbacks.class, "signalScaleButtonPopup",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ValueChangedHandler {
        void signalReceived(ScaleButton source, double value);
    }
    
    /**
     * Emitted when the value field has changed.
     */
    public SignalHandle onValueChanged(ValueChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("value-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ScaleButton.Callbacks.class, "signalScaleButtonValueChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalScaleButtonPopdown(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ScaleButton.PopdownHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ScaleButton(Refcounted.get(source)));
        }
        
        public static void signalScaleButtonPopup(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ScaleButton.PopupHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ScaleButton(Refcounted.get(source)));
        }
        
        public static void signalScaleButtonValueChanged(MemoryAddress source, double value, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ScaleButton.ValueChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ScaleButton(Refcounted.get(source)), value);
        }
        
    }
}
