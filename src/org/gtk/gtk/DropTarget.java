package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkDropTarget` is an event controller to receive Drag-and-Drop operations.
 * 
 * The most basic way to use a `GtkDropTarget` to receive drops on a
 * widget is to create it via [ctor@Gtk.DropTarget.new], passing in the
 * `GType` of the data you want to receive and connect to the
 * [signal@Gtk.DropTarget::drop] signal to receive the data:
 * 
 * ```c
 * static gboolean
 * on_drop (GtkDropTarget *target,
 *          const GValue  *value,
 *          double         x,
 *          double         y,
 *          gpointer       data)
 * {
 *   MyWidget *self = data;
 * 
 *   // Call the appropriate setter depending on the type of data
 *   // that we received
 *   if (G_VALUE_HOLDS (value, G_TYPE_FILE))
 *     my_widget_set_file (self, g_value_get_object (value));
 *   else if (G_VALUE_HOLDS (value, GDK_TYPE_PIXBUF))
 *     my_widget_set_pixbuf (self, g_value_get_object (value));
 *   else
 *     return FALSE;
 * 
 *   return TRUE;
 * }
 * 
 * static void
 * my_widget_init (MyWidget *self)
 * {
 *   GtkDropTarget *target =
 *     gtk_drop_target_new (G_TYPE_INVALID, GDK_ACTION_COPY);
 * 
 *   // This widget accepts two types of drop types: GFile objects
 *   // and GdkPixbuf objects
 *   gtk_drop_target_set_gtypes (target, (GTypes [2]) {
 *     G_TYPE_FILE,
 *     GDK_TYPE_PIXBUF,
 *   }, 2);
 * 
 *   g_signal_connect (target, "drop", G_CALLBACK (on_drop), self);
 *   gtk_widget_add_controller (GTK_WIDGET (self), GTK_EVENT_CONTROLLER (target));
 * }
 * ```
 * 
 * `GtkDropTarget` supports more options, such as:
 * 
 *  * rejecting potential drops via the [signal@Gtk.DropTarget::accept] signal
 *    and the [method@Gtk.DropTarget.reject] function to let other drop
 *    targets handle the drop
 *  * tracking an ongoing drag operation before the drop via the
 *    [signal@Gtk.DropTarget::enter], [signal@Gtk.DropTarget::motion] and
 *    [signal@Gtk.DropTarget::leave] signals
 *  * configuring how to receive data by setting the
 *    [property@Gtk.DropTarget:preload] property and listening for its
 *    availability via the [property@Gtk.DropTarget:value] property
 * 
 * However, `GtkDropTarget` is ultimately modeled in a synchronous way
 * and only supports data transferred via `GType`. If you want full control
 * over an ongoing drop, the [class@Gtk.DropTargetAsync] object gives you
 * this ability.
 * 
 * While a pointer is dragged over the drop target's widget and the drop
 * has not been rejected, that widget will receive the
 * %GTK_STATE_FLAG_DROP_ACTIVE state, which can be used to style the widget.
 * 
 * If you are not interested in receiving the drop, but just want to update
 * UI state during a Drag-and-Drop operation (e.g. switching tabs), you can
 * use [class@Gtk.DropControllerMotion].
 */
public class DropTarget extends EventController {

    public DropTarget(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to DropTarget */
    public static DropTarget castFrom(org.gtk.gobject.Object gobject) {
        return new DropTarget(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkDropTarget` object.
     * 
     * If the drop target should support more than 1 type, pass
     * %G_TYPE_INVALID for @type and then call
     * [method@Gtk.DropTarget.set_gtypes].
     */
    public DropTarget(Type type, int actions) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_target_new(type.getValue(), actions), true));
    }
    
    /**
     * Gets the actions that this drop target supports.
     */
    public int getActions() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_target_get_actions(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the currently handled drop operation.
     * 
     * If no drop operation is going on, %NULL is returned.
     */
    public org.gtk.gdk.Drop getCurrentDrop() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_target_get_current_drop(HANDLE());
        return new org.gtk.gdk.Drop(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the data formats that this drop target accepts.
     * 
     * If the result is %NULL, all formats are expected to be supported.
     */
    public org.gtk.gdk.ContentFormats getFormats() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_target_get_formats(HANDLE());
        return new org.gtk.gdk.ContentFormats(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets whether data should be preloaded on hover.
     */
    public boolean getPreload() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_target_get_preload(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the current drop data, as a `GValue`.
     */
    public org.gtk.gobject.Value getValue() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_target_get_value(HANDLE());
        return new org.gtk.gobject.Value(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Rejects the ongoing drop operation.
     * 
     * If no drop operation is ongoing, i.e when [property@Gtk.DropTarget:current-drop]
     * is %NULL, this function does nothing.
     * 
     * This function should be used when delaying the decision
     * on whether to accept a drag or not until after reading
     * the data.
     */
    public void reject() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_target_reject(HANDLE());
    }
    
    /**
     * Sets the actions that this drop target supports.
     */
    public void setActions(int actions) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_target_set_actions(HANDLE(), actions);
    }
    
    /**
     * Sets the supported `GTypes` for this drop target.
     */
    public void setGtypes(org.gtk.gobject.Type[] types, long nTypes) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_target_set_gtypes(HANDLE(), Interop.allocateNativeArray(types), nTypes);
    }
    
    /**
     * Sets whether data should be preloaded on hover.
     */
    public void setPreload(boolean preload) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_target_set_preload(HANDLE(), preload ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface AcceptHandler {
        boolean signalReceived(DropTarget source, org.gtk.gdk.Drop drop);
    }
    
    /**
     * Emitted on the drop site when a drop operation is about to begin.
     * 
     * If the drop is not accepted, %FALSE will be returned and the drop target
     * will ignore the drop. If %TRUE is returned, the drop is accepted for now
     * but may be rejected later via a call to [method@Gtk.DropTarget.reject]
     * or ultimately by returning %FALSE from a [signal@Gtk.DropTarget::drop]
     * handler.
     * 
     * The default handler for this signal decides whether to accept the drop
     * based on the formats provided by the @drop.
     * 
     * If the decision whether the drop will be accepted or rejected depends
     * on the data, this function should return %TRUE, the
     * [property@Gtk.DropTarget:preload] property should be set and the value
     * should be inspected via the ::notify:value signal, calling
     * [method@Gtk.DropTarget.reject] if required.
     */
    public void onAccept(AcceptHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDropTargetAccept", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("accept").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DropHandler {
        boolean signalReceived(DropTarget source, org.gtk.gobject.Value value, double x, double y);
    }
    
    /**
     * Emitted on the drop site when the user drops the data onto the widget.
     * 
     * The signal handler must determine whether the pointer position is in
     * a drop zone or not. If it is not in a drop zone, it returns %FALSE
     * and no further processing is necessary.
     * 
     * Otherwise, the handler returns %TRUE. In this case, this handler will
     * accept the drop. The handler is responsible for using the given @value
     * and performing the drop operation.
     */
    public void onDrop(DropHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDropTargetDrop", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("drop").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface EnterHandler {
        void signalReceived(DropTarget source, double x, double y);
    }
    
    /**
     * Emitted on the drop site when the pointer enters the widget.
     * 
     * It can be used to set up custom highlighting.
     */
    public void onEnter(EnterHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDropTargetEnter", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("enter").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface LeaveHandler {
        void signalReceived(DropTarget source);
    }
    
    /**
     * Emitted on the drop site when the pointer leaves the widget.
     * 
     * Its main purpose it to undo things done in
     * [signal@Gtk.DropTarget::enter].
     */
    public void onLeave(LeaveHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDropTargetLeave", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("leave").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MotionHandler {
        void signalReceived(DropTarget source, double x, double y);
    }
    
    /**
     * Emitted while the pointer is moving over the drop target.
     */
    public void onMotion(MotionHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDropTargetMotion", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("motion").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
