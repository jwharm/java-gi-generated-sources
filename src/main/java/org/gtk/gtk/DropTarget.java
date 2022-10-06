package org.gtk.gtk;

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

    public DropTarget(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DropTarget */
    public static DropTarget castFrom(org.gtk.gobject.Object gobject) {
        return new DropTarget(gobject.refcounted());
    }
    
    static final MethodHandle gtk_drop_target_new = Interop.downcallHandle(
        "gtk_drop_target_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(org.gtk.gobject.Type type, org.gtk.gdk.DragAction actions) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_drop_target_new.invokeExact(type.getValue(), actions.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkDropTarget} object.
     * <p>
     * If the drop target should support more than 1 type, pass
     * {@code G_TYPE_INVALID} for {@code type} and then call
     * {@link DropTarget#setGtypes}.
     */
    public DropTarget(org.gtk.gobject.Type type, org.gtk.gdk.DragAction actions) {
        super(constructNew(type, actions));
    }
    
    static final MethodHandle gtk_drop_target_get_actions = Interop.downcallHandle(
        "gtk_drop_target_get_actions",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the actions that this drop target supports.
     */
    public org.gtk.gdk.DragAction getActions() {
        try {
            var RESULT = (int) gtk_drop_target_get_actions.invokeExact(handle());
            return new org.gtk.gdk.DragAction(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_target_get_current_drop = Interop.downcallHandle(
        "gtk_drop_target_get_current_drop",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the currently handled drop operation.
     * <p>
     * If no drop operation is going on, {@code null} is returned.
     */
    public org.gtk.gdk.Drop getCurrentDrop() {
        try {
            var RESULT = (MemoryAddress) gtk_drop_target_get_current_drop.invokeExact(handle());
            return new org.gtk.gdk.Drop(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_target_get_formats = Interop.downcallHandle(
        "gtk_drop_target_get_formats",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the data formats that this drop target accepts.
     * <p>
     * If the result is {@code null}, all formats are expected to be supported.
     */
    public org.gtk.gdk.ContentFormats getFormats() {
        try {
            var RESULT = (MemoryAddress) gtk_drop_target_get_formats.invokeExact(handle());
            return new org.gtk.gdk.ContentFormats(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_target_get_gtypes = Interop.downcallHandle(
        "gtk_drop_target_get_gtypes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the list of supported {@code GType}s that can be dropped on the target.
     * <p>
     * If no types have been set, {@code NULL} will be returned.
     */
    public PointerLong getGtypes(PointerLong nTypes) {
        try {
            var RESULT = (MemoryAddress) gtk_drop_target_get_gtypes.invokeExact(handle(), nTypes.handle());
            return new PointerLong(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_target_get_preload = Interop.downcallHandle(
        "gtk_drop_target_get_preload",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether data should be preloaded on hover.
     */
    public boolean getPreload() {
        try {
            var RESULT = (int) gtk_drop_target_get_preload.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_target_get_value = Interop.downcallHandle(
        "gtk_drop_target_get_value",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current drop data, as a {@code GValue}.
     */
    public org.gtk.gobject.Value getValue() {
        try {
            var RESULT = (MemoryAddress) gtk_drop_target_get_value.invokeExact(handle());
            return new org.gtk.gobject.Value(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_target_reject = Interop.downcallHandle(
        "gtk_drop_target_reject",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
        try {
            gtk_drop_target_reject.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_target_set_actions = Interop.downcallHandle(
        "gtk_drop_target_set_actions",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the actions that this drop target supports.
     */
    public void setActions(org.gtk.gdk.DragAction actions) {
        try {
            gtk_drop_target_set_actions.invokeExact(handle(), actions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_target_set_gtypes = Interop.downcallHandle(
        "gtk_drop_target_set_gtypes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Sets the supported {@code GTypes} for this drop target.
     */
    public void setGtypes(org.gtk.gobject.Type[] types, long nTypes) {
        try {
            gtk_drop_target_set_gtypes.invokeExact(handle(), Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(types)).handle(), nTypes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_target_set_preload = Interop.downcallHandle(
        "gtk_drop_target_set_preload",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether data should be preloaded on hover.
     */
    public void setPreload(boolean preload) {
        try {
            gtk_drop_target_set_preload.invokeExact(handle(), preload ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("accept").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTarget.Callbacks.class, "signalDropTargetAccept",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drop").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTarget.Callbacks.class, "signalDropTargetDrop",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("enter").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTarget.Callbacks.class, "signalDropTargetEnter",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("leave").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTarget.Callbacks.class, "signalDropTargetLeave",
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
    public interface MotionHandler {
        void signalReceived(DropTarget source, double x, double y);
    }
    
    /**
     * Emitted while the pointer is moving over the drop target.
     */
    public SignalHandle onMotion(MotionHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("motion").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTarget.Callbacks.class, "signalDropTargetMotion",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static boolean signalDropTargetAccept(MemoryAddress source, MemoryAddress drop, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DropTarget.AcceptHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new DropTarget(Refcounted.get(source)), new org.gtk.gdk.Drop(Refcounted.get(drop, false)));
        }
        
        public static boolean signalDropTargetDrop(MemoryAddress source, MemoryAddress value, double x, double y, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DropTarget.DropHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new DropTarget(Refcounted.get(source)), new org.gtk.gobject.Value(Refcounted.get(value, false)), x, y);
        }
        
        public static void signalDropTargetEnter(MemoryAddress source, double x, double y, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DropTarget.EnterHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DropTarget(Refcounted.get(source)), x, y);
        }
        
        public static void signalDropTargetLeave(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DropTarget.LeaveHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DropTarget(Refcounted.get(source)));
        }
        
        public static void signalDropTargetMotion(MemoryAddress source, double x, double y, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DropTarget.MotionHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DropTarget(Refcounted.get(source)), x, y);
        }
        
    }
}
