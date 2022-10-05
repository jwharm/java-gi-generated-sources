package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkDropTargetAsync} is an event controller to receive Drag-and-Drop
 * operations, asynchronously.
 * <p>
 * It is the more complete but also more complex method of handling drop
 * operations compared to {@link DropTarget}, and you should only use
 * it if {@code GtkDropTarget} doesn't provide all the features you need.
 * <p>
 * To use a {@code GtkDropTargetAsync} to receive drops on a widget, you create
 * a {@code GtkDropTargetAsync} object, configure which data formats and actions
 * you support, connect to its signals, and then attach it to the widget
 * with {@link Widget#addController}.
 * <p>
 * During a drag operation, the first signal that a {@code GtkDropTargetAsync}
 * emits is {@code Gtk.DropTargetAsync::accept}, which is meant to determine
 * whether the target is a possible drop site for the ongoing drop. The
 * default handler for the ::accept signal accepts the drop if it finds
 * a compatible data format and an action that is supported on both sides.
 * <p>
 * If it is, and the widget becomes a target, you will receive a
 * {@code Gtk.DropTargetAsync::drag-enter} signal, followed by
 * {@code Gtk.DropTargetAsync::drag-motion} signals as the pointer moves,
 * optionally a {@code Gtk.DropTargetAsync::drop} signal when a drop happens,
 * and finally a {@code Gtk.DropTargetAsync::drag-leave} signal when the
 * pointer moves off the widget.
 * <p>
 * The ::drag-enter and ::drag-motion handler return a {@code GdkDragAction}
 * to update the status of the ongoing operation. The ::drop handler
 * should decide if it ultimately accepts the drop and if it does, it
 * should initiate the data transfer and finish the operation by calling
 * {@link org.gtk.gdk.Drop#finish}.
 * <p>
 * Between the ::drag-enter and ::drag-leave signals the widget is a
 * current drop target, and will receive the {@link StateFlags#DROP_ACTIVE}
 * state, which can be used by themes to style the widget as a drop target.
 */
public class DropTargetAsync extends EventController {

    public DropTargetAsync(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DropTargetAsync */
    public static DropTargetAsync castFrom(org.gtk.gobject.Object gobject) {
        return new DropTargetAsync(gobject.refcounted());
    }
    
    static final MethodHandle gtk_drop_target_async_new = Interop.downcallHandle(
        "gtk_drop_target_async_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(org.gtk.gdk.ContentFormats formats, org.gtk.gdk.DragAction actions) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_drop_target_async_new.invokeExact(formats.refcounted().unowned().handle(), actions.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkDropTargetAsync} object.
     */
    public DropTargetAsync(org.gtk.gdk.ContentFormats formats, org.gtk.gdk.DragAction actions) {
        super(constructNew(formats, actions));
    }
    
    static final MethodHandle gtk_drop_target_async_get_actions = Interop.downcallHandle(
        "gtk_drop_target_async_get_actions",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the actions that this drop target supports.
     */
    public org.gtk.gdk.DragAction getActions() {
        try {
            var RESULT = (int) gtk_drop_target_async_get_actions.invokeExact(handle());
            return new org.gtk.gdk.DragAction(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_target_async_get_formats = Interop.downcallHandle(
        "gtk_drop_target_async_get_formats",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the data formats that this drop target accepts.
     * <p>
     * If the result is {@code null}, all formats are expected to be supported.
     */
    public org.gtk.gdk.ContentFormats getFormats() {
        try {
            var RESULT = (MemoryAddress) gtk_drop_target_async_get_formats.invokeExact(handle());
            return new org.gtk.gdk.ContentFormats(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_target_async_reject_drop = Interop.downcallHandle(
        "gtk_drop_target_async_reject_drop",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code drop} as not accepted on this drag site.
     * <p>
     * This function should be used when delaying the decision
     * on whether to accept a drag or not until after reading
     * the data.
     */
    public void rejectDrop(org.gtk.gdk.Drop drop) {
        try {
            gtk_drop_target_async_reject_drop.invokeExact(handle(), drop.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_target_async_set_actions = Interop.downcallHandle(
        "gtk_drop_target_async_set_actions",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the actions that this drop target supports.
     */
    public void setActions(org.gtk.gdk.DragAction actions) {
        try {
            gtk_drop_target_async_set_actions.invokeExact(handle(), actions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_target_async_set_formats = Interop.downcallHandle(
        "gtk_drop_target_async_set_formats",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the data formats that this drop target will accept.
     */
    public void setFormats(org.gtk.gdk.ContentFormats formats) {
        try {
            gtk_drop_target_async_set_formats.invokeExact(handle(), formats.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface AcceptHandler {
        boolean signalReceived(DropTargetAsync source, org.gtk.gdk.Drop drop);
    }
    
    /**
     * Emitted on the drop site when a drop operation is about to begin.
     * <p>
     * If the drop is not accepted, {@code false} will be returned and the drop target
     * will ignore the drop. If {@code true} is returned, the drop is accepted for now
     * but may be rejected later via a call to {@link DropTargetAsync#rejectDrop}
     * or ultimately by returning {@code false} from a {@code Gtk.DropTargetAsync::drop}
     * handler.
     * <p>
     * The default handler for this signal decides whether to accept the drop
     * based on the formats provided by the {@code drop}.
     * <p>
     * If the decision whether the drop will be accepted or rejected needs
     * further processing, such as inspecting the data, this function should
     * return {@code true} and proceed as is {@code drop} was accepted and if it decides to
     * reject the drop later, it should call {@link DropTargetAsync#rejectDrop}.
     */
    public SignalHandle onAccept(AcceptHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("accept").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTargetAsync.Callbacks.class, "signalDropTargetAsyncAccept",
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
    public interface DragEnterHandler {
        void signalReceived(DropTargetAsync source, org.gtk.gdk.Drop drop, double x, double y);
    }
    
    /**
     * Emitted on the drop site when the pointer enters the widget.
     * <p>
     * It can be used to set up custom highlighting.
     */
    public SignalHandle onDragEnter(DragEnterHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drag-enter").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTargetAsync.Callbacks.class, "signalDropTargetAsyncDragEnter",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DragLeaveHandler {
        void signalReceived(DropTargetAsync source, org.gtk.gdk.Drop drop);
    }
    
    /**
     * Emitted on the drop site when the pointer leaves the widget.
     * <p>
     * Its main purpose it to undo things done in
     * {@code GtkDropTargetAsync}::drag-enter.
     */
    public SignalHandle onDragLeave(DragLeaveHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drag-leave").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTargetAsync.Callbacks.class, "signalDropTargetAsyncDragLeave",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DragMotionHandler {
        void signalReceived(DropTargetAsync source, org.gtk.gdk.Drop drop, double x, double y);
    }
    
    /**
     * Emitted while the pointer is moving over the drop target.
     */
    public SignalHandle onDragMotion(DragMotionHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drag-motion").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTargetAsync.Callbacks.class, "signalDropTargetAsyncDragMotion",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
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
        boolean signalReceived(DropTargetAsync source, org.gtk.gdk.Drop drop, double x, double y);
    }
    
    /**
     * Emitted on the drop site when the user drops the data onto the widget.
     * <p>
     * The signal handler must determine whether the pointer position is in a
     * drop zone or not. If it is not in a drop zone, it returns {@code false} and no
     * further processing is necessary.
     * <p>
     * Otherwise, the handler returns {@code true}. In this case, this handler will
     * accept the drop. The handler must ensure that {@link org.gtk.gdk.Drop#finish}
     * is called to let the source know that the drop is done. The call to
     * {@link org.gtk.gdk.Drop#finish} must only be done when all data has been received.
     * <p>
     * To receive the data, use one of the read functions provided by
     * {@code Gdk.Drop.read_async} or
     * {@link org.gtk.gdk.Drop#readValueAsync}.
     */
    public SignalHandle onDrop(DropHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drop").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTargetAsync.Callbacks.class, "signalDropTargetAsyncDrop",
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
    
    public static class Callbacks {
    
        public static boolean signalDropTargetAsyncAccept(MemoryAddress source, MemoryAddress drop, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DropTargetAsync.AcceptHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new DropTargetAsync(Refcounted.get(source)), new org.gtk.gdk.Drop(Refcounted.get(drop, false)));
        }
        
        public static void signalDropTargetAsyncDragEnter(MemoryAddress source, MemoryAddress drop, double x, double y, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DropTargetAsync.DragEnterHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DropTargetAsync(Refcounted.get(source)), new org.gtk.gdk.Drop(Refcounted.get(drop, false)), x, y);
        }
        
        public static void signalDropTargetAsyncDragLeave(MemoryAddress source, MemoryAddress drop, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DropTargetAsync.DragLeaveHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DropTargetAsync(Refcounted.get(source)), new org.gtk.gdk.Drop(Refcounted.get(drop, false)));
        }
        
        public static void signalDropTargetAsyncDragMotion(MemoryAddress source, MemoryAddress drop, double x, double y, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DropTargetAsync.DragMotionHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DropTargetAsync(Refcounted.get(source)), new org.gtk.gdk.Drop(Refcounted.get(drop, false)), x, y);
        }
        
        public static boolean signalDropTargetAsyncDrop(MemoryAddress source, MemoryAddress drop, double x, double y, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DropTargetAsync.DropHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new DropTargetAsync(Refcounted.get(source)), new org.gtk.gdk.Drop(Refcounted.get(drop, false)), x, y);
        }
        
    }
}