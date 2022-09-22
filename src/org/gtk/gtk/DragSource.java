package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkDragSource} is an event controller to initiate Drag-And-Drop operations.
 * <p>
 * {@code GtkDragSource} can be set up with the necessary
 * ingredients for a DND operation ahead of time. This includes
 * the source for the data that is being transferred, in the form
 * of a {@link org.gtk.gdk.ContentProvider}, the desired action, and the icon to
 * use during the drag operation. After setting it up, the drag
 * source must be added to a widget as an event controller, using
 * {@link Widget#addController}.
 * <p>
 * <pre>{@code c
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
 * }</pre>
 * <p>
 * Setting up the content provider and icon ahead of time only makes
 * sense when the data does not change. More commonly, you will want
 * to set them up just in time. To do so, {@code GtkDragSource} has
 * {@code Gtk.DragSource::drag-begin}
 * signals.
 * <p>
 * The ::prepare signal is emitted before a drag is started, and
 * can be used to set the content provider and actions that the
 * drag should be started with.
 * <p>
 * <pre>{@code c
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
 * }</pre>
 * <p>
 * The ::drag-begin signal is emitted after the {@code GdkDrag} object has
 * been created, and can be used to set up the drag icon.
 * <p>
 * <pre>{@code c
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
 * }</pre>
 * <p>
 * During the DND operation, {@code GtkDragSource} emits signals that
 * can be used to obtain updates about the status of the operation,
 * but it is not normally necessary to connect to any signals,
 * except for one case: when the supported actions include
 * {@link org.gtk.gdk.DragAction#MOVE}, you need to listen for the
 * {@code Gtk.DragSource::drag-end} signal and delete the
 * data after it has been transferred.
 */
public class DragSource extends GestureSingle {

    public DragSource(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DragSource */
    public static DragSource castFrom(org.gtk.gobject.Object gobject) {
        return new DragSource(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_drag_source_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkDragSource} object.
     */
    public DragSource() {
        super(constructNew());
    }
    
    /**
     * Cancels a currently ongoing drag operation.
     */
    public void dragCancel() {
        gtk_h.gtk_drag_source_drag_cancel(handle());
    }
    
    /**
     * Gets the actions that are currently set on the {@code GtkDragSource}.
     */
    public int getActions() {
        var RESULT = gtk_h.gtk_drag_source_get_actions(handle());
        return RESULT;
    }
    
    /**
     * Gets the current content provider of a {@code GtkDragSource}.
     */
    public org.gtk.gdk.ContentProvider getContent() {
        var RESULT = gtk_h.gtk_drag_source_get_content(handle());
        return new org.gtk.gdk.ContentProvider(References.get(RESULT, false));
    }
    
    /**
     * Returns the underlying {@code GdkDrag} object for an ongoing drag.
     */
    public org.gtk.gdk.Drag getDrag() {
        var RESULT = gtk_h.gtk_drag_source_get_drag(handle());
        return new org.gtk.gdk.Drag(References.get(RESULT, false));
    }
    
    /**
     * Sets the actions on the {@code GtkDragSource}.
     * <p>
     * During a DND operation, the actions are offered to potential
     * drop targets. If {@code actions} include {@link org.gtk.gdk.DragAction#MOVE}, you need
     * to listen to the {@code Gtk.DragSource::drag-end} signal and
     * handle {@code delete_data} being <code>true</code>.
     * <p>
     * This function can be called before a drag is started,
     * or in a handler for the {@code Gtk.DragSource::prepare} signal.
     */
    public void setActions(int actions) {
        gtk_h.gtk_drag_source_set_actions(handle(), actions);
    }
    
    /**
     * Sets a content provider on a {@code GtkDragSource}.
     * <p>
     * When the data is requested in the cause of a DND operation,
     * it will be obtained from the content provider.
     * <p>
     * This function can be called before a drag is started,
     * or in a handler for the {@code Gtk.DragSource::prepare} signal.
     * <p>
     * You may consider setting the content provider back to
     * <code>null</code> in a {@code Gtk.DragSource::drag-end} signal handler.
     */
    public void setContent(org.gtk.gdk.ContentProvider content) {
        gtk_h.gtk_drag_source_set_content(handle(), content.handle());
    }
    
    /**
     * Sets a paintable to use as icon during DND operations.
     * <p>
     * The hotspot coordinates determine the point on the icon
     * that gets aligned with the hotspot of the cursor.
     * <p>
     * If {@code paintable} is <code>null</code>, a default icon is used.
     * <p>
     * This function can be called before a drag is started, or in
     * a {@code Gtk.DragSource::prepare} or
     * {@code Gtk.DragSource::drag-begin} signal handler.
     */
    public void setIcon(org.gtk.gdk.Paintable paintable, int hotX, int hotY) {
        gtk_h.gtk_drag_source_set_icon(handle(), paintable.handle(), hotX, hotY);
    }
    
    @FunctionalInterface
    public interface DragBeginHandler {
        void signalReceived(DragSource source, org.gtk.gdk.Drag drag);
    }
    
    /**
     * Emitted on the drag source when a drag is started.
     * <p>
     * It can be used to e.g. set a custom drag icon with
     * {@link DragSource#setIcon}.
     */
    public SignalHandle onDragBegin(DragBeginHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDragSourceDragBegin", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("drag-begin").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * <p>
     * The signal handler may handle a failed drag operation based on
     * the type of error. It should return <code>true</code> if the failure has been handled
     * and the default "drag operation failed" animation should not be shown.
     */
    public SignalHandle onDragCancel(DragCancelHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDragSourceDragCancel", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("drag-cancel").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * <p>
     * A typical reason to connect to this signal is to undo
     * things done in {@code Gtk.DragSource::prepare} or
     * {@code Gtk.DragSource::drag-begin} handlers.
     */
    public SignalHandle onDragEnd(DragEndHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDragSourceDragEnd", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("drag-end").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * <p>
     * It returns the {@code GdkContentProvider} to use for the drag that is about
     * to start. The default handler for this signal returns the value of
     * the {@code Gtk.DragSource:content} property, so if you set up that
     * property ahead of time, you don't need to connect to this signal.
     */
    public SignalHandle onPrepare(PrepareHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDragSourcePrepare", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("prepare").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
