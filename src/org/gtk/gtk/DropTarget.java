package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkDropTarget} is an event controller to receive Drag-and-Drop operations.
 * <p>
 * The most basic way to use a {@code GtkDropTarget} to receive drops on a
 * widget is to create it via {@link DropTarget#DropTarget}, passing in the
 * {@code GType} of the data you want to receive and connect to the
 * {@code Gtk.DropTarget::drop} signal to receive the data:
 * <p>
 * <pre>{@code c
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
 * }</pre>
 * <p>
 * {@code GtkDropTarget} supports more options, such as:
 * <p>
 *  * rejecting potential drops via the {@code Gtk.DropTarget::accept} signal
 *    and the {@link DropTarget#reject} function to let other drop
 *    targets handle the drop
 *  * tracking an ongoing drag operation before the drop via the
 *    {@code Gtk.DropTarget::motion} and
 *    {@code Gtk.DropTarget::leave} signals
 *  * configuring how to receive data by setting the
 *    {@code Gtk.DropTarget:preload} property and listening for its
 *    availability via the {@code Gtk.DropTarget:value} property
 * <p>
 * However, {@code GtkDropTarget} is ultimately modeled in a synchronous way
 * and only supports data transferred via {@code GType}. If you want full control
 * over an ongoing drop, the {@link DropTargetAsync} object gives you
 * this ability.
 * <p>
 * While a pointer is dragged over the drop target's widget and the drop
 * has not been rejected, that widget will receive the
 * {@link StateFlags#DROP_ACTIVE} state, which can be used to style the widget.
 * <p>
 * If you are not interested in receiving the drop, but just want to update
 * UI state during a Drag-and-Drop operation (e.g. switching tabs), you can
 * use {@link DropControllerMotion}.
 */
public class DropTarget extends EventController {

    public DropTarget(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DropTarget */
    public static DropTarget castFrom(org.gtk.gobject.Object gobject) {
        return new DropTarget(gobject.getReference());
    }
    
    private static Reference constructNew(Type type, int actions) {
        Reference RESULT = References.get(gtk_h.gtk_drop_target_new(type.getValue(), actions), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkDropTarget} object.
     * <p>
     * If the drop target should support more than 1 type, pass
     * {@code G_TYPE_INVALID} for {@code type} and then call
     * {@link DropTarget#setGtypes}.
     */
    public DropTarget(Type type, int actions) {
        super(constructNew(type, actions));
    }
    
    /**
     * Gets the actions that this drop target supports.
     */
    public int getActions() {
        var RESULT = gtk_h.gtk_drop_target_get_actions(handle());
        return RESULT;
    }
    
    /**
     * Gets the currently handled drop operation.
     * <p>
     * If no drop operation is going on, {@code null} is returned.
     */
    public org.gtk.gdk.Drop getCurrentDrop() {
        var RESULT = gtk_h.gtk_drop_target_get_current_drop(handle());
        return new org.gtk.gdk.Drop(References.get(RESULT, false));
    }
    
    /**
     * Gets the data formats that this drop target accepts.
     * <p>
     * If the result is {@code null}, all formats are expected to be supported.
     */
    public org.gtk.gdk.ContentFormats getFormats() {
        var RESULT = gtk_h.gtk_drop_target_get_formats(handle());
        return new org.gtk.gdk.ContentFormats(References.get(RESULT, false));
    }
    
    /**
     * Gets whether data should be preloaded on hover.
     */
    public boolean getPreload() {
        var RESULT = gtk_h.gtk_drop_target_get_preload(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the current drop data, as a {@code GValue}.
     */
    public org.gtk.gobject.Value getValue() {
        var RESULT = gtk_h.gtk_drop_target_get_value(handle());
        return new org.gtk.gobject.Value(References.get(RESULT, false));
    }
    
    /**
     * Rejects the ongoing drop operation.
     * <p>
     * If no drop operation is ongoing, i.e when {@code Gtk.DropTarget:current-drop}
     * is {@code null}, this function does nothing.
     * <p>
     * This function should be used when delaying the decision
     * on whether to accept a drag or not until after reading
     * the data.
     */
    public void reject() {
        gtk_h.gtk_drop_target_reject(handle());
    }
    
    /**
     * Sets the actions that this drop target supports.
     */
    public void setActions(int actions) {
        gtk_h.gtk_drop_target_set_actions(handle(), actions);
    }
    
    /**
     * Sets the supported {@code GTypes} for this drop target.
     */
    public void setGtypes(org.gtk.gobject.Type[] types, long nTypes) {
        gtk_h.gtk_drop_target_set_gtypes(handle(), Interop.allocateNativeArray(org.gtk.gobject.Type.getValues(types)).handle(), nTypes);
    }
    
    /**
     * Sets whether data should be preloaded on hover.
     */
    public void setPreload(boolean preload) {
        gtk_h.gtk_drop_target_set_preload(handle(), preload ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface AcceptHandler {
        boolean signalReceived(DropTarget source, org.gtk.gdk.Drop drop);
    }
    
    /**
     * Emitted on the drop site when a drop operation is about to begin.
     * <p>
     * If the drop is not accepted, {@code false} will be returned and the drop target
     * will ignore the drop. If {@code true} is returned, the drop is accepted for now
     * but may be rejected later via a call to {@link DropTarget#reject}
     * or ultimately by returning {@code false} from a {@code Gtk.DropTarget::drop}
     * handler.
     * <p>
     * The default handler for this signal decides whether to accept the drop
     * based on the formats provided by the {@code drop}.
     * <p>
     * If the decision whether the drop will be accepted or rejected depends
     * on the data, this function should return {@code true}, the
     * {@code Gtk.DropTarget:preload} property should be set and the value
     * should be inspected via the ::notify:value signal, calling
     * {@link DropTarget#reject} if required.
     */
    public SignalHandle onAccept(AcceptHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("accept").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTarget.class, "__signalDropTargetAccept",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static boolean __signalDropTargetAccept(MemoryAddress source, MemoryAddress drop, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTarget.AcceptHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new DropTarget(References.get(source)), new org.gtk.gdk.Drop(References.get(drop, false)));
    }
    
    @FunctionalInterface
    public interface DropHandler {
        boolean signalReceived(DropTarget source, org.gtk.gobject.Value value, double x, double y);
    }
    
    /**
     * Emitted on the drop site when the user drops the data onto the widget.
     * <p>
     * The signal handler must determine whether the pointer position is in
     * a drop zone or not. If it is not in a drop zone, it returns {@code false}
     * and no further processing is necessary.
     * <p>
     * Otherwise, the handler returns {@code true}. In this case, this handler will
     * accept the drop. The handler is responsible for using the given {@code value}
     * and performing the drop operation.
     */
    public SignalHandle onDrop(DropHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("drop").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTarget.class, "__signalDropTargetDrop",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static boolean __signalDropTargetDrop(MemoryAddress source, MemoryAddress value, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTarget.DropHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new DropTarget(References.get(source)), new org.gtk.gobject.Value(References.get(value, false)), x, y);
    }
    
    @FunctionalInterface
    public interface EnterHandler {
        void signalReceived(DropTarget source, double x, double y);
    }
    
    /**
     * Emitted on the drop site when the pointer enters the widget.
     * <p>
     * It can be used to set up custom highlighting.
     */
    public SignalHandle onEnter(EnterHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("enter").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTarget.class, "__signalDropTargetEnter",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalDropTargetEnter(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTarget.EnterHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DropTarget(References.get(source)), x, y);
    }
    
    @FunctionalInterface
    public interface LeaveHandler {
        void signalReceived(DropTarget source);
    }
    
    /**
     * Emitted on the drop site when the pointer leaves the widget.
     * <p>
     * Its main purpose it to undo things done in
     * {@code Gtk.DropTarget::enter}.
     */
    public SignalHandle onLeave(LeaveHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("leave").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTarget.class, "__signalDropTargetLeave",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalDropTargetLeave(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTarget.LeaveHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DropTarget(References.get(source)));
    }
    
    @FunctionalInterface
    public interface MotionHandler {
        void signalReceived(DropTarget source, double x, double y);
    }
    
    /**
     * Emitted while the pointer is moving over the drop target.
     */
    public SignalHandle onMotion(MotionHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("motion").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTarget.class, "__signalDropTargetMotion",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalDropTargetMotion(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTarget.MotionHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DropTarget(References.get(source)), x, y);
    }
    
}
