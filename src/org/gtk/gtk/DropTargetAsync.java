package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkDropTargetAsync</code> is an event controller to receive Drag-and-Drop
 * operations, asynchronously.
 * <p>
 * It is the more complete but also more complex method of handling drop
 * operations compared to {@link org.gtk.gtk.DropTarget}, and you should only use
 * it if <code>GtkDropTarget</code> doesn&#39;t provide all the features you need.
 * <p>
 * To use a <code>GtkDropTargetAsync</code> to receive drops on a widget, you create
 * a <code>GtkDropTargetAsync</code> object, configure which data formats and actions
 * you support, connect to its signals, and then attach it to the widget
 * with {@link org.gtk.gtk.Widget#addController}.
 * <p>
 * During a drag operation, the first signal that a <code>GtkDropTargetAsync</code>
 * emits is {@link [signal@Gtk.DropTargetAsync::accept] (ref=signal)}, which is meant to determine
 * whether the target is a possible drop site for the ongoing drop. The
 * default handler for the ::accept signal accepts the drop if it finds
 * a compatible data format and an action that is supported on both sides.
 * <p>
 * If it is, and the widget becomes a target, you will receive a
 * {@link [signal@Gtk.DropTargetAsync::drag-enter] (ref=signal)} signal, followed by
 * {@link [signal@Gtk.DropTargetAsync::drag-motion] (ref=signal)} signals as the pointer moves,
 * optionally a {@link [signal@Gtk.DropTargetAsync::drop] (ref=signal)} signal when a drop happens,
 * and finally a {@link [signal@Gtk.DropTargetAsync::drag-leave] (ref=signal)} signal when the
 * pointer moves off the widget.
 * <p>
 * The ::drag-enter and ::drag-motion handler return a <code>GdkDragAction</code>
 * to update the status of the ongoing operation. The ::drop handler
 * should decide if it ultimately accepts the drop and if it does, it
 * should initiate the data transfer and finish the operation by calling
 * {@link org.gtk.gdk.Drop#finish}.
 * 
 * Between the ::drag-enter and ::drag-leave signals the widget is a
 * current drop target, and will receive the <code>GTK_STATE_FLAG_DROP_ACTIVE
 * state,</code> which can be used by themes to style the widget as a drop target.
 */
public class DropTargetAsync extends EventController {

    public DropTargetAsync(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DropTargetAsync */
    public static DropTargetAsync castFrom(org.gtk.gobject.Object gobject) {
        return new DropTargetAsync(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.gdk.ContentFormats formats, int actions) {
        Reference RESULT = References.get(gtk_h.gtk_drop_target_async_new(formats.handle(), actions), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkDropTargetAsync</code> object.
     */
    public DropTargetAsync(org.gtk.gdk.ContentFormats formats, int actions) {
        super(constructNew(formats, actions));
    }
    
    /**
     * Gets the actions that this drop target supports.
     */
    public int getActions() {
        var RESULT = gtk_h.gtk_drop_target_async_get_actions(handle());
        return RESULT;
    }
    
    /**
     * Gets the data formats that this drop target accepts.
     * 
     * If the result is <code>NULL,</code> all formats are expected to be supported.
     */
    public org.gtk.gdk.ContentFormats getFormats() {
        var RESULT = gtk_h.gtk_drop_target_async_get_formats(handle());
        return new org.gtk.gdk.ContentFormats(References.get(RESULT, true));
    }
    
    /**
     * Sets the @drop as not accepted on this drag site.
     * 
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
    public void setActions(int actions) {
        gtk_h.gtk_drop_target_async_set_actions(handle(), actions);
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
     * 
     * If the drop is not accepted, <code>false</code> will be returned and the drop target
     * will ignore the drop. If <code>true</code> is returned, the drop is accepted for now
     * but may be rejected later via a call to {@link org.gtk.gtk.DropTargetAsync#rejectDrop}
     * or ultimately by returning <code>false</code> from a {@link [signal@Gtk.DropTargetAsync::drop] (ref=signal)}
     * handler.
     * 
     * The default handler for this signal decides whether to accept the drop
     * based on the formats provided by the @drop.
     * 
     * If the decision whether the drop will be accepted or rejected needs
     * further processing, such as inspecting the data, this function should
     * return <code>true</code> and proceed as is @drop was accepted and if it decides to
     * reject the drop later, it should call {@link org.gtk.gtk.DropTargetAsync#rejectDrop}.
     */
    public SignalHandle onAccept(AcceptHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDropTargetAsyncAccept", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("accept").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DragEnterHandler {
        void signalReceived(DropTargetAsync source, org.gtk.gdk.Drop drop, double x, double y);
    }
    
    /**
     * Emitted on the drop site when the pointer enters the widget.
     * 
     * It can be used to set up custom highlighting.
     */
    public SignalHandle onDragEnter(DragEnterHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDropTargetAsyncDragEnter", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("drag-enter").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DragLeaveHandler {
        void signalReceived(DropTargetAsync source, org.gtk.gdk.Drop drop);
    }
    
    /**
     * Emitted on the drop site when the pointer leaves the widget.
     * <p>
     * Its main purpose it to undo things done in<code>GtkDropTargetAsync</code>::drag-enter.
     */
    public SignalHandle onDragLeave(DragLeaveHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDropTargetAsyncDragLeave", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("drag-leave").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDropTargetAsyncDragMotion", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("drag-motion").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DropHandler {
        boolean signalReceived(DropTargetAsync source, org.gtk.gdk.Drop drop, double x, double y);
    }
    
    /**
     * Emitted on the drop site when the user drops the data onto the widget.
     * 
     * The signal handler must determine whether the pointer position is in a
     * drop zone or not. If it is not in a drop zone, it returns <code>false</code> and no
     * further processing is necessary.
     * 
     * Otherwise, the handler returns <code>TRUE.</code> In this case, this handler will
     * accept the drop. The handler must ensure that {@link org.gtk.gdk.Drop#finish}
     * is called to let the source know that the drop is done. The call to
     * {@link org.gtk.gdk.Drop#finish} must only be done when all data has been received.
     * 
     * To receive the data, use one of the read functions provided by
     * {@link org.gtk.gdk.Drop} such as {@link org.gtk.gdk.Drop#readAsync} or
     * {@link org.gtk.gdk.Drop#readValueAsync}.
     */
    public SignalHandle onDrop(DropHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDropTargetAsyncDrop", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("drop").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
