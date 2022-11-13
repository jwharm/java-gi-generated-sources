package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkDropTarget} is an event controller to receive Drag-and-Drop operations.
 * <p>
 * The most basic way to use a {@code GtkDropTarget} to receive drops on a
 * widget is to create it via {@link DropTarget#DropTarget}, passing in the
 * {@code GType} of the data you want to receive and connect to the
 * {@code Gtk.DropTarget::drop} signal to receive the data:
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
 *    {@code Gtk.DropTarget::enter}, {@code Gtk.DropTarget::motion} and
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
public class DropTarget extends org.gtk.gtk.EventController {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkDropTarget";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DropTarget proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DropTarget(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DropTarget if its GType is a (or inherits from) "GtkDropTarget".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DropTarget} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkDropTarget", a ClassCastException will be thrown.
     */
    public static DropTarget castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkDropTarget"))) {
            return new DropTarget(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkDropTarget");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.glib.Type type, @NotNull org.gtk.gdk.DragAction actions) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(actions, "Parameter 'actions' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_target_new.invokeExact(
                    type.getValue().longValue(),
                    actions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkDropTarget} object.
     * <p>
     * If the drop target should support more than 1 type, pass
     * {@code G_TYPE_INVALID} for {@code type} and then call
     * {@link DropTarget#setGtypes}.
     * @param type The supported type or {@code G_TYPE_INVALID}
     * @param actions the supported actions
     */
    public DropTarget(@NotNull org.gtk.glib.Type type, @NotNull org.gtk.gdk.DragAction actions) {
        super(constructNew(type, actions), Ownership.FULL);
    }
    
    /**
     * Gets the actions that this drop target supports.
     * @return the actions that this drop target supports
     */
    public @NotNull org.gtk.gdk.DragAction getActions() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_drop_target_get_actions.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.DragAction(RESULT);
    }
    
    /**
     * Gets the currently handled drop operation.
     * <p>
     * If no drop operation is going on, {@code null} is returned.
     * @return The current drop
     */
    public @Nullable org.gtk.gdk.Drop getCurrentDrop() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_target_get_current_drop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Drop(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the currently handled drop operation.
     * <p>
     * If no drop operation is going on, {@code null} is returned.
     * @return The current drop
     * @deprecated Use {@link DropTarget#getCurrentDrop} instead
     */
    @Deprecated
    public @Nullable org.gtk.gdk.Drop getDrop() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_target_get_drop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Drop(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the data formats that this drop target accepts.
     * <p>
     * If the result is {@code null}, all formats are expected to be supported.
     * @return the supported data formats
     */
    public @Nullable org.gtk.gdk.ContentFormats getFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_target_get_formats.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentFormats(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the list of supported {@code GType}s that can be dropped on the target.
     * <p>
     * If no types have been set, {@code NULL} will be returned.
     * @param nTypes the number of {@code GType}s contained in the
     *   return value
     * @return the {@code G_TYPE_INVALID}-terminated array of types included in
     *   formats
     */
    public @Nullable org.gtk.glib.Type[] getGtypes(Out<Long> nTypes) {
        java.util.Objects.requireNonNull(nTypes, "Parameter 'nTypes' must not be null");
        MemorySegment nTypesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_target_get_gtypes.invokeExact(
                    handle(),
                    (Addressable) nTypesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nTypes.set(nTypesPOINTER.get(ValueLayout.JAVA_LONG, 0));
        if (RESULT.equals(MemoryAddress.NULL)) return null;
        org.gtk.glib.Type[] resultARRAY = new org.gtk.glib.Type[nTypes.get().intValue()];
        for (int I = 0; I < nTypes.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.JAVA_LONG, I);
            resultARRAY[I] = new org.gtk.glib.Type(OBJ);
        }
        return resultARRAY;
    }
    
    /**
     * Gets whether data should be preloaded on hover.
     * @return {@code true} if drop data should be preloaded
     */
    public boolean getPreload() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_drop_target_get_preload.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the current drop data, as a {@code GValue}.
     * @return The current drop data
     */
    public @Nullable org.gtk.gobject.Value getValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_target_get_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Value(RESULT, Ownership.NONE);
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
        try {
            DowncallHandles.gtk_drop_target_reject.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the actions that this drop target supports.
     * @param actions the supported actions
     */
    public void setActions(@NotNull org.gtk.gdk.DragAction actions) {
        java.util.Objects.requireNonNull(actions, "Parameter 'actions' must not be null");
        try {
            DowncallHandles.gtk_drop_target_set_actions.invokeExact(
                    handle(),
                    actions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the supported {@code GTypes} for this drop target.
     * @param types all supported {@code GType}s
     *   that can be dropped on the target
     * @param nTypes number of {@code types}
     */
    public void setGtypes(@Nullable org.gtk.glib.Type[] types, long nTypes) {
        try {
            DowncallHandles.gtk_drop_target_set_gtypes.invokeExact(
                    handle(),
                    (Addressable) (types == null ? MemoryAddress.NULL : Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(types), false)),
                    nTypes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether data should be preloaded on hover.
     * @param preload {@code true} to preload drop data
     */
    public void setPreload(boolean preload) {
        try {
            DowncallHandles.gtk_drop_target_set_preload.invokeExact(
                    handle(),
                    preload ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Accept {
        boolean signalReceived(DropTarget source, @NotNull org.gtk.gdk.Drop drop);
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropTarget.Accept> onAccept(DropTarget.Accept handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("accept"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTarget.Callbacks.class, "signalDropTargetAccept",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DropTarget.Accept>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Drop {
        boolean signalReceived(DropTarget source, @NotNull org.gtk.gobject.Value value, double x, double y);
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropTarget.Drop> onDrop(DropTarget.Drop handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drop"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTarget.Callbacks.class, "signalDropTargetDrop",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DropTarget.Drop>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Enter {
        void signalReceived(DropTarget source, double x, double y);
    }
    
    /**
     * Emitted on the drop site when the pointer enters the widget.
     * <p>
     * It can be used to set up custom highlighting.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropTarget.Enter> onEnter(DropTarget.Enter handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("enter"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTarget.Callbacks.class, "signalDropTargetEnter",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DropTarget.Enter>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Leave {
        void signalReceived(DropTarget source);
    }
    
    /**
     * Emitted on the drop site when the pointer leaves the widget.
     * <p>
     * Its main purpose it to undo things done in
     * {@code Gtk.DropTarget::enter}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropTarget.Leave> onLeave(DropTarget.Leave handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("leave"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTarget.Callbacks.class, "signalDropTargetLeave",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DropTarget.Leave>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Motion {
        void signalReceived(DropTarget source, double x, double y);
    }
    
    /**
     * Emitted while the pointer is moving over the drop target.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropTarget.Motion> onMotion(DropTarget.Motion handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("motion"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTarget.Callbacks.class, "signalDropTargetMotion",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DropTarget.Motion>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_drop_target_new = Interop.downcallHandle(
            "gtk_drop_target_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_drop_target_get_actions = Interop.downcallHandle(
            "gtk_drop_target_get_actions",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_target_get_current_drop = Interop.downcallHandle(
            "gtk_drop_target_get_current_drop",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_target_get_drop = Interop.downcallHandle(
            "gtk_drop_target_get_drop",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_target_get_formats = Interop.downcallHandle(
            "gtk_drop_target_get_formats",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_target_get_gtypes = Interop.downcallHandle(
            "gtk_drop_target_get_gtypes",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_target_get_preload = Interop.downcallHandle(
            "gtk_drop_target_get_preload",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_target_get_value = Interop.downcallHandle(
            "gtk_drop_target_get_value",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_target_reject = Interop.downcallHandle(
            "gtk_drop_target_reject",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_target_set_actions = Interop.downcallHandle(
            "gtk_drop_target_set_actions",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_drop_target_set_gtypes = Interop.downcallHandle(
            "gtk_drop_target_set_gtypes",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            false
        );
        
        private static final MethodHandle gtk_drop_target_set_preload = Interop.downcallHandle(
            "gtk_drop_target_set_preload",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
    
    private static class Callbacks {
        
        public static boolean signalDropTargetAccept(MemoryAddress source, MemoryAddress drop, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (DropTarget.Accept) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new DropTarget(source, Ownership.UNKNOWN), new org.gtk.gdk.Drop(drop, Ownership.NONE));
        }
        
        public static boolean signalDropTargetDrop(MemoryAddress source, MemoryAddress value, double x, double y, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (DropTarget.Drop) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new DropTarget(source, Ownership.UNKNOWN), new org.gtk.gobject.Value(value, Ownership.NONE), x, y);
        }
        
        public static void signalDropTargetEnter(MemoryAddress source, double x, double y, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (DropTarget.Enter) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DropTarget(source, Ownership.UNKNOWN), x, y);
        }
        
        public static void signalDropTargetLeave(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (DropTarget.Leave) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DropTarget(source, Ownership.UNKNOWN));
        }
        
        public static void signalDropTargetMotion(MemoryAddress source, double x, double y, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (DropTarget.Motion) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DropTarget(source, Ownership.UNKNOWN), x, y);
        }
    }
}
