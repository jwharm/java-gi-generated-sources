package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkScaleButton` provides a button which pops up a scale widget.
 * 
 * This kind of widget is commonly used for volume controls in multimedia
 * applications, and GTK provides a [class@Gtk.VolumeButton] subclass that
 * is tailored for this use case.
 * 
 * # CSS nodes
 * 
 * `GtkScaleButton` has a single CSS node with name button. To differentiate
 * it from a plain `GtkButton`, it gets the .scale style class.
 */
public class ScaleButton extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public ScaleButton(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ScaleButton */
    public static ScaleButton castFrom(org.gtk.gobject.Object gobject) {
        return new ScaleButton(gobject.getReference());
    }
    
    /**
     * Creates a `GtkScaleButton`.
     * 
     * The new scale button has a range between @min and @max,
     * with a stepping of @step.
     */
    public ScaleButton(double min, double max, double step, java.lang.String[] icons) {
        super(References.get(gtk_h.gtk_scale_button_new(min, max, step, Interop.allocateNativeArray(icons).handle()), false));
    }
    
    /**
     * Gets the `GtkAdjustment` associated with the `GtkScaleButton`’s scale.
     * 
     * See [method@Gtk.Range.get_adjustment] for details.
     */
    public Adjustment getAdjustment() {
        var RESULT = gtk_h.gtk_scale_button_get_adjustment(handle());
        return new Adjustment(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the minus button of the `GtkScaleButton`.
     */
    public Button getMinusButton() {
        var RESULT = gtk_h.gtk_scale_button_get_minus_button(handle());
        return new Button(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the plus button of the `GtkScaleButton.`
     */
    public Button getPlusButton() {
        var RESULT = gtk_h.gtk_scale_button_get_plus_button(handle());
        return new Button(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the popup of the `GtkScaleButton`.
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
     * Sets the `GtkAdjustment` to be used as a model
     * for the `GtkScaleButton`’s scale.
     * 
     * See [method@Gtk.Range.set_adjustment] for details.
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
     * 
     * If the value is outside the minimum or maximum range values,
     * it will be clamped to fit inside them.
     * 
     * The scale button emits the [signal@Gtk.ScaleButton::value-changed]
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
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default binding for this signal is <kbd>Escape</kbd>.
     */
    public void onPopdown(PopdownHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalScaleButtonPopdown", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("popdown").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default bindings for this signal are <kbd>Space</kbd>,
     * <kbd>Enter</kbd> and <kbd>Return</kbd>.
     */
    public void onPopup(PopupHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalScaleButtonPopup", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("popup").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
    public void onValueChanged(ValueChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalScaleButtonValueChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("value-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
