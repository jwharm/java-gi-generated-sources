package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkDragSource` is an event controller to initiate Drag-And-Drop operations.
 * 
 * `GtkDragSource` can be set up with the necessary
 * ingredients for a DND operation ahead of time. This includes
 * the source for the data that is being transferred, in the form
 * of a [class@Gdk.ContentProvider], the desired action, and the icon to
 * use during the drag operation. After setting it up, the drag
 * source must be added to a widget as an event controller, using
 * [method@Gtk.Widget.add_controller].
 * 
 * ```c
 * static void
 * my_widget_init (MyWidget *self)
 * {
 *   GtkDragSource *drag_source = gtk_drag_source_new ();
 * 
 *   g_signal_connect (drag_source, "prepare", G_CALLBACK (on_drag_prepare), self);
 *   g_signal_connect (drag_source, "drag-begin", G_CALLBACK (on_drag_begin), self);
 * 
 *   gtk_widget_add_controller (GTK_WIDGET (self), GTK_EVENT_CONTROLLER (drag_source));
 * }
 * ```
 * 
 * Setting up the content provider and icon ahead of time only makes
 * sense when the data does not change. More commonly, you will want
 * to set them up just in time. To do so, `GtkDragSource` has
 * [signal@Gtk.DragSource::prepare] and [signal@Gtk.DragSource::drag-begin]
 * signals.
 * 
 * The ::prepare signal is emitted before a drag is started, and
 * can be used to set the content provider and actions that the
 * drag should be started with.
 * 
 * ```c
 * static GdkContentProvider *
 * on_drag_prepare (GtkDragSource *source,
 *                  double         x,
 *                  double         y,
 *                  MyWidget      *self)
 * {
 *   // This widget supports two types of content: GFile objects
 *   // and GdkPixbuf objects; GTK will handle the serialization
 *   // of these types automatically
 *   GFile *file = my_widget_get_file (self);
 *   GdkPixbuf *pixbuf = my_widget_get_pixbuf (self);
 * 
 *   return gdk_content_provider_new_union ((GdkContentProvider *[2]) {
 *       gdk_content_provider_new_typed (G_TYPE_FILE, file),
 *       gdk_content_provider_new_typed (GDK_TYPE_PIXBUF, pixbuf),
 *     }, 2);
 * }
 * ```
 * 
 * The ::drag-begin signal is emitted after the `GdkDrag` object has
 * been created, and can be used to set up the drag icon.
 * 
 * ```c
 * static void
 * on_drag_begin (GtkDragSource *source,
 *                GdkDrag       *drag,
 *                MyWidget      *self)
 * {
 *   // Set the widget as the drag icon
 *   GdkPaintable *paintable = gtk_widget_paintable_new (GTK_WIDGET (self));
 *   gtk_drag_source_set_icon (source, paintable, 0, 0);
 *   g_object_unref (paintable);
 * }
 * ```
 * 
 * During the DND operation, `GtkDragSource` emits signals that
 * can be used to obtain updates about the status of the operation,
 * but it is not normally necessary to connect to any signals,
 * except for one case: when the supported actions include
 * %GDK_ACTION_MOVE, you need to listen for the
 * [signal@Gtk.DragSource::drag-end] signal and delete the
 * data after it has been transferred.
 */
public class DragSource extends GestureSingle {

    public DragSource(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to DragSource */
    public static DragSource castFrom(org.gtk.gobject.Object gobject) {
        return new DragSource(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkDragSource` object.
     */
    public DragSource() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drag_source_new(), true));
    }
    
    /**
     * Cancels a currently ongoing drag operation.
     */
    public void dragCancel() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drag_source_drag_cancel(HANDLE());
    }
    
    /**
     * Gets the actions that are currently set on the `GtkDragSource`.
     */
    public int getActions() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drag_source_get_actions(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the current content provider of a `GtkDragSource`.
     */
    public org.gtk.gdk.ContentProvider getContent() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drag_source_get_content(HANDLE());
        return new org.gtk.gdk.ContentProvider(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns the underlying `GdkDrag` object for an ongoing drag.
     */
    public org.gtk.gdk.Drag getDrag() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drag_source_get_drag(HANDLE());
        return new org.gtk.gdk.Drag(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Sets the actions on the `GtkDragSource`.
     * 
     * During a DND operation, the actions are offered to potential
     * drop targets. If @actions include %GDK_ACTION_MOVE, you need
     * to listen to the [signal@Gtk.DragSource::drag-end] signal and
     * handle @delete_data being %TRUE.
     * 
     * This function can be called before a drag is started,
     * or in a handler for the [signal@Gtk.DragSource::prepare] signal.
     */
    public void setActions(int actions) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drag_source_set_actions(HANDLE(), actions);
    }
    
    /**
     * Sets a content provider on a `GtkDragSource`.
     * 
     * When the data is requested in the cause of a DND operation,
     * it will be obtained from the content provider.
     * 
     * This function can be called before a drag is started,
     * or in a handler for the [signal@Gtk.DragSource::prepare] signal.
     * 
     * You may consider setting the content provider back to
     * %NULL in a [signal@Gtk.DragSource::drag-end] signal handler.
     */
    public void setContent(org.gtk.gdk.ContentProvider content) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drag_source_set_content(HANDLE(), content.HANDLE());
    }
    
    /**
     * Sets a paintable to use as icon during DND operations.
     * 
     * The hotspot coordinates determine the point on the icon
     * that gets aligned with the hotspot of the cursor.
     * 
     * If @paintable is %NULL, a default icon is used.
     * 
     * This function can be called before a drag is started, or in
     * a [signal@Gtk.DragSource::prepare] or
     * [signal@Gtk.DragSource::drag-begin] signal handler.
     */
    public void setIcon(org.gtk.gdk.Paintable paintable, int hotX, int hotY) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drag_source_set_icon(HANDLE(), paintable.HANDLE(), hotX, hotY);
    }
    
    @FunctionalInterface
    public interface DragBeginHandler {
        void signalReceived(DragSource source, org.gtk.gdk.Drag drag);
    }
    
    /**
     * Emitted on the drag source when a drag is started.
     * 
     * It can be used to e.g. set a custom drag icon with
     * [method@Gtk.DragSource.set_icon].
     */
    public void onDragBegin(DragBeginHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDragSourceDragBegin", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("drag-begin").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DragCancelHandler {
        boolean signalReceived(DragSource source, org.gtk.gdk.Drag drag, org.gtk.gdk.DragCancelReason reason);
    }
    
    /**
     * Emitted on the drag source when a drag has failed.
     * 
     * The signal handler may handle a failed drag operation based on
     * the type of error. It should return %TRUE if the failure has been handled
     * and the default "drag operation failed" animation should not be shown.
     */
    public void onDragCancel(DragCancelHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDragSourceDragCancel", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("drag-cancel").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DragEndHandler {
        void signalReceived(DragSource source, org.gtk.gdk.Drag drag, boolean deleteData);
    }
    
    /**
     * Emitted on the drag source when a drag is finished.
     * 
     * A typical reason to connect to this signal is to undo
     * things done in [signal@Gtk.DragSource::prepare] or
     * [signal@Gtk.DragSource::drag-begin] handlers.
     */
    public void onDragEnd(DragEndHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDragSourceDragEnd", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("drag-end").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PrepareHandler {
        void signalReceived(DragSource source, double x, double y);
    }
    
    /**
     * Emitted when a drag is about to be initiated.
     * 
     * It returns the `GdkContentProvider` to use for the drag that is about
     * to start. The default handler for this signal returns the value of
     * the [property@Gtk.DragSource:content] property, so if you set up that
     * property ahead of time, you don't need to connect to this signal.
     */
    public void onPrepare(PrepareHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDragSourcePrepare", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("prepare").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
