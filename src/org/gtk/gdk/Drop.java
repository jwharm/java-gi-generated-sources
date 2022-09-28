package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GdkDrop} object represents the target of an ongoing DND operation.
 * <p>
 * Possible drop sites get informed about the status of the ongoing drag
 * operation with events of type {@link EventType#DRAG_ENTER}, {@link EventType#DRAG_LEAVE},
 * {@link EventType#DRAG_MOTION} and {@link EventType#DROP_START}. The {@code GdkDrop} object can be obtained
 * from these {@code Gdk.DNDEvent.get_drop}.
 * <p>
 * The actual data transfer is initiated from the target side via an async
 * read, using one of the {@code GdkDrop} methods for this purpose:
 * {@code Gdk.Drop.read_value_async}.
 * <p>
 * GTK provides a higher level abstraction based on top of these functions,
 * and so they are not normally needed in GTK applications. See the
 * "Drag and Drop" section of the GTK documentation for more information.
 */
public class Drop extends org.gtk.gobject.Object {

    public Drop(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Drop */
    public static Drop castFrom(org.gtk.gobject.Object gobject) {
        return new Drop(gobject.getReference());
    }
    
    /**
     * Ends the drag operation after a drop.
     * <p>
     * The {@code action} must be a single action selected from the actions
     * available via {@link Drop#getActions}.
     */
    public void finish(DragAction action) {
        gtk_h.gdk_drop_finish(handle(), action.getValue());
    }
    
    /**
     * Returns the possible actions for this {@code GdkDrop}.
     * <p>
     * If this value contains multiple actions - i.e.
     * {@link Gdk#DragAction} returns {@code false} for the result -
     * {@link Drop#finish} must choose the action to use when
     * accepting the drop. This will only happen if you passed
     * {@link DragAction#ASK} as one of the possible actions in
     * {@link Drop#status}. {@link DragAction#ASK} itself will not
     * be included in the actions returned by this function.
     * <p>
     * This value may change over the lifetime of the {@link Drop}
     * both as a response to source side actions as well as to calls to
     * {@code Gdk.Drop.finish}. The source
     * side will not change this value anymore once a drop has started.
     */
    public DragAction getActions() {
        var RESULT = gtk_h.gdk_drop_get_actions(handle());
        return new DragAction(RESULT);
    }
    
    /**
     * Returns the {@code GdkDevice} performing the drop.
     */
    public Device getDevice() {
        var RESULT = gtk_h.gdk_drop_get_device(handle());
        return new Device(References.get(RESULT, false));
    }
    
    /**
     * Gets the {@code GdkDisplay} that {@code self} was created for.
     */
    public Display getDisplay() {
        var RESULT = gtk_h.gdk_drop_get_display(handle());
        return new Display(References.get(RESULT, false));
    }
    
    /**
     * If this is an in-app drag-and-drop operation, returns the {@code GdkDrag}
     * that corresponds to this drop.
     * <p>
     * If it is not, {@code null} is returned.
     */
    public Drag getDrag() {
        var RESULT = gtk_h.gdk_drop_get_drag(handle());
        return new Drag(References.get(RESULT, false));
    }
    
    /**
     * Returns the {@code GdkContentFormats} that the drop offers the data
     * to be read in.
     */
    public ContentFormats getFormats() {
        var RESULT = gtk_h.gdk_drop_get_formats(handle());
        return new ContentFormats(References.get(RESULT, false));
    }
    
    /**
     * Returns the {@code GdkSurface} performing the drop.
     */
    public Surface getSurface() {
        var RESULT = gtk_h.gdk_drop_get_surface(handle());
        return new Surface(References.get(RESULT, false));
    }
    
    /**
     * Asynchronously read the dropped data from a {@code GdkDrop}
     * in a format that complies with one of the mime types.
     */
    public void readAsync(java.lang.String[] mimeTypes, int ioPriority, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_drop_read_async(handle(), Interop.allocateNativeArray(mimeTypes).handle(), ioPriority, cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an async drop read operation.
     * <p>
     * Note that you must not use blocking read calls on the returned stream
     * in the GTK thread, since some platforms might require communication with
     * GTK to complete the data transfer. You can use async APIs such as
     * g_input_stream_read_bytes_async().
     * <p>
     * See {@link Drop#readAsync}.
     */
    public org.gtk.gio.InputStream readFinish(org.gtk.gio.AsyncResult result, java.lang.String[] outMimeType) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_drop_read_finish(handle(), result.handle(), Interop.allocateNativeArray(outMimeType).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.InputStream(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously request the drag operation's contents converted
     * to the given {@code type}.
     * <p>
     * When the operation is finished {@code callback} will be called. You must
     * then call {@link Drop#readValueFinish} to get the resulting
     * {@code GValue}.
     * <p>
     * For local drag-and-drop operations that are available in the given
     * {@code GType}, the value will be copied directly. Otherwise, GDK will
     * try to use {@link Gdk#contentDeserializeAsync} to convert the data.
     */
    public void readValueAsync(org.gtk.gobject.Type type, int ioPriority, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_drop_read_value_async(handle(), type.getValue(), ioPriority, cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an async drop read.
     * <p>
     * See {@link Drop#readValueAsync}.
     */
    public org.gtk.gobject.Value readValueFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_drop_read_value_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gobject.Value(References.get(RESULT, false));
    }
    
    /**
     * Selects all actions that are potentially supported by the destination.
     * <p>
     * When calling this function, do not restrict the passed in actions to
     * the ones provided by {@link Drop#getActions}. Those actions may
     * change in the future, even depending on the actions you provide here.
     * <p>
     * The {@code preferred} action is a hint to the drag-and-drop mechanism about which
     * action to use when multiple actions are possible.
     * <p>
     * This function should be called by drag destinations in response to
     * {@link EventType#DRAG_ENTER} or {@link EventType#DRAG_MOTION} events. If the destination does
     * not yet know the exact actions it supports, it should set any possible
     * actions first and then later call this function again.
     */
    public void status(DragAction actions, DragAction preferred) {
        gtk_h.gdk_drop_status(handle(), actions.getValue(), preferred.getValue());
    }
    
}
