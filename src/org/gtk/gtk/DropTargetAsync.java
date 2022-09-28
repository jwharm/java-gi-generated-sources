package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public DropTargetAsync(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DropTargetAsync */
    public static DropTargetAsync castFrom(org.gtk.gobject.Object gobject) {
        return new DropTargetAsync(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.gdk.ContentFormats formats, org.gtk.gdk.DragAction actions) {
        Reference RESULT = References.get(gtk_h.gtk_drop_target_async_new(formats.getReference().unowned().handle(), actions.getValue()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkDropTargetAsync} object.
     */
    public DropTargetAsync(org.gtk.gdk.ContentFormats formats, org.gtk.gdk.DragAction actions) {
        super(constructNew(formats, actions));
    }
    
    /**
     * Gets the actions that this drop target supports.
     */
    public org.gtk.gdk.DragAction getActions() {
        var RESULT = gtk_h.gtk_drop_target_async_get_actions(handle());
        return new org.gtk.gdk.DragAction(RESULT);
    }
    
    /**
     * Gets the data formats that this drop target accepts.
     * <p>
     * If the result is {@code null}, all formats are expected to be supported.
     */
    public org.gtk.gdk.ContentFormats getFormats() {
        var RESULT = gtk_h.gtk_drop_target_async_get_formats(handle());
        return new org.gtk.gdk.ContentFormats(References.get(RESULT, true));
    }
    
    /**
     * Sets the {@code drop} as not accepted on this drag site.
     * <p>
     * This function should be used when delaying the decision
     * on whether to accept a drag or not until after reading
     * the data.
     */
    public void rejectDrop(org.gtk.gdk.Drop drop) {
        gtk_h.gtk_drop_target_async_reject_drop(handle(), drop.handle());
    }
    
    /**
     * Sets the actions that this drop target supports.
     */
    public void setActions(org.gtk.gdk.DragAction actions) {
        gtk_h.gtk_drop_target_async_set_actions(handle(), actions.getValue());
    }
    
    /**
     * Sets the data formats that this drop target will accept.
     */
    public void setFormats(org.gtk.gdk.ContentFormats formats) {
        gtk_h.gtk_drop_target_async_set_formats(handle(), formats.handle());
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("accept").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTargetAsync.class, "__signalDropTargetAsyncAccept",
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
    
    public static boolean __signalDropTargetAsyncAccept(MemoryAddress source, MemoryAddress drop, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTargetAsync.AcceptHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new DropTargetAsync(References.get(source)), new org.gtk.gdk.Drop(References.get(drop, false)));
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("drag-enter").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTargetAsync.class, "__signalDropTargetAsyncDragEnter",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalDropTargetAsyncDragEnter(MemoryAddress source, MemoryAddress drop, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTargetAsync.DragEnterHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DropTargetAsync(References.get(source)), new org.gtk.gdk.Drop(References.get(drop, false)), x, y);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("drag-leave").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTargetAsync.class, "__signalDropTargetAsyncDragLeave",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalDropTargetAsyncDragLeave(MemoryAddress source, MemoryAddress drop, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTargetAsync.DragLeaveHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DropTargetAsync(References.get(source)), new org.gtk.gdk.Drop(References.get(drop, false)));
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("drag-motion").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTargetAsync.class, "__signalDropTargetAsyncDragMotion",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalDropTargetAsyncDragMotion(MemoryAddress source, MemoryAddress drop, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTargetAsync.DragMotionHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DropTargetAsync(References.get(source)), new org.gtk.gdk.Drop(References.get(drop, false)), x, y);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("drop").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropTargetAsync.class, "__signalDropTargetAsyncDrop",
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
    
    public static boolean __signalDropTargetAsyncDrop(MemoryAddress source, MemoryAddress drop, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTargetAsync.DropHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new DropTargetAsync(References.get(source)), new org.gtk.gdk.Drop(References.get(drop, false)), x, y);
    }
    
}
