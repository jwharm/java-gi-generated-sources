package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
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

    public ScaleButton(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ScaleButton */
    public static ScaleButton castFrom(org.gtk.gobject.Object gobject) {
        return new ScaleButton(gobject.getReference());
    }
    
    private static Reference constructNew(double min, double max, double step, java.lang.String[] icons) {
        Reference RESULT = References.get(gtk_h.gtk_scale_button_new(min, max, step, Interop.allocateNativeArray(icons).handle()), false);
        return RESULT;
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
    
    /**
     * Gets the {@code GtkAdjustment} associated with the {@code GtkScaleButton}’s scale.
     * <p>
     * See {@link Range#getAdjustment} for details.
     */
    public Adjustment getAdjustment() {
        var RESULT = gtk_h.gtk_scale_button_get_adjustment(handle());
        return new Adjustment(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the minus button of the {@code GtkScaleButton}.
     */
    public Button getMinusButton() {
        var RESULT = gtk_h.gtk_scale_button_get_minus_button(handle());
        return new Button(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the plus button of the {@code GtkScaleButton.}
     */
    public Button getPlusButton() {
        var RESULT = gtk_h.gtk_scale_button_get_plus_button(handle());
        return new Button(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the popup of the {@code GtkScaleButton}.
     */
    public Widget getPopup() {
        var RESULT = gtk_h.gtk_scale_button_get_popup(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the current value of the scale button.
     */
    public double getValue() {
        var RESULT = gtk_h.gtk_scale_button_get_value(handle());
        return RESULT;
    }
    
    /**
     * Sets the {@code GtkAdjustment} to be used as a model
     * for the {@code GtkScaleButton}’s scale.
     * <p>
     * See {@link Range#setAdjustment} for details.
     */
    public void setAdjustment(Adjustment adjustment) {
        gtk_h.gtk_scale_button_set_adjustment(handle(), adjustment.handle());
    }
    
    /**
     * Sets the icons to be used by the scale button.
     */
    public void setIcons(java.lang.String[] icons) {
        gtk_h.gtk_scale_button_set_icons(handle(), Interop.allocateNativeArray(icons).handle());
    }
    
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
        gtk_h.gtk_scale_button_set_value(handle(), value);
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalScaleButtonPopdown", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("popdown").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalScaleButtonPopup", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("popup").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalScaleButtonValueChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("value-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
