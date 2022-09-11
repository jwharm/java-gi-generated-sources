package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GdkDrop` object represents the target of an ongoing DND operation.
 * 
 * Possible drop sites get informed about the status of the ongoing drag
 * operation with events of type %GDK_DRAG_ENTER, %GDK_DRAG_LEAVE,
 * %GDK_DRAG_MOTION and %GDK_DROP_START. The `GdkDrop` object can be obtained
 * from these [class@Gdk.Event] types using [method@Gdk.DNDEvent.get_drop].
 * 
 * The actual data transfer is initiated from the target side via an async
 * read, using one of the `GdkDrop` methods for this purpose:
 * [method@Gdk.Drop.read_async] or [method@Gdk.Drop.read_value_async].
 * 
 * GTK provides a higher level abstraction based on top of these functions,
 * and so they are not normally needed in GTK applications. See the
 * "Drag and Drop" section of the GTK documentation for more information.
 */
public class Drop extends org.gtk.gobject.Object {

    public Drop(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Drop */
    public static Drop castFrom(org.gtk.gobject.Object gobject) {
        return new Drop(gobject.getReference());
    }
    
    /**
     * Ends the drag operation after a drop.
     * 
     * The @action must be a single action selected from the actions
     * available via [method@Gdk.Drop.get_actions].
     */
    public void finish(int action) {
        gtk_h.gdk_drop_finish(handle(), action);
    }
    
    /**
     * Returns the possible actions for this `GdkDrop`.
     * 
     * If this value contains multiple actions - i.e.
     * [func@Gdk.DragAction.is_unique] returns %FALSE for the result -
     * [method@Gdk.Drop.finish] must choose the action to use when
     * accepting the drop. This will only happen if you passed
     * %GDK_ACTION_ASK as one of the possible actions in
     * [method@Gdk.Drop.status]. %GDK_ACTION_ASK itself will not
     * be included in the actions returned by this function.
     * 
     * This value may change over the lifetime of the [class@Gdk.Drop]
     * both as a response to source side actions as well as to calls to
     * [method@Gdk.Drop.status] or [method@Gdk.Drop.finish]. The source
     * side will not change this value anymore once a drop has started.
     */
    public int getActions() {
        var RESULT = gtk_h.gdk_drop_get_actions(handle());
        return RESULT;
    }
    
    /**
     * Returns the `GdkDevice` performing the drop.
     */
    public Device getDevice() {
        var RESULT = gtk_h.gdk_drop_get_device(handle());
        return new Device(References.get(RESULT, false));
    }
    
    /**
     * Gets the `GdkDisplay` that @self was created for.
     */
    public Display getDisplay() {
        var RESULT = gtk_h.gdk_drop_get_display(handle());
        return new Display(References.get(RESULT, false));
    }
    
    /**
     * If this is an in-app drag-and-drop operation, returns the `GdkDrag`
     * that corresponds to this drop.
     * 
     * If it is not, %NULL is returned.
     */
    public Drag getDrag() {
        var RESULT = gtk_h.gdk_drop_get_drag(handle());
        return new Drag(References.get(RESULT, false));
    }
    
    /**
     * Returns the `GdkContentFormats` that the drop offers the data
     * to be read in.
     */
    public ContentFormats getFormats() {
        var RESULT = gtk_h.gdk_drop_get_formats(handle());
        return new ContentFormats(References.get(RESULT, false));
    }
    
    /**
     * Returns the `GdkSurface` performing the drop.
     */
    public Surface getSurface() {
        var RESULT = gtk_h.gdk_drop_get_surface(handle());
        return new Surface(References.get(RESULT, false));
    }
    
    /**
     * Asynchronously read the dropped data from a `GdkDrop`
     * in a format that complies with one of the mime types.
     */
    public void readAsync(Drop self, java.lang.String[] mimeTypes, int ioPriority, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            int hash = callback.hashCode();
            Interop.signalRegistry.put(hash, callback);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.gdk_drop_read_async(handle(), Interop.allocateNativeArray(mimeTypes).handle(), ioPriority, cancellable.handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an async drop read operation.
     * 
     * Note that you must not use blocking read calls on the returned stream
     * in the GTK thread, since some platforms might require communication with
     * GTK to complete the data transfer. You can use async APIs such as
     * g_input_stream_read_bytes_async().
     * 
     * See [method@Gdk.Drop.read_async].
     */
    public org.gtk.gio.InputStream readFinish(org.gtk.gio.AsyncResult result, java.lang.String[] outMimeType) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_drop_read_finish(handle(), result.handle(), Interop.allocateNativeArray(outMimeType).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.InputStream(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously request the drag operation's contents converted
     * to the given @type.
     * 
     * When the operation is finished @callback will be called. You must
     * then call [method@Gdk.Drop.read_value_finish] to get the resulting
     * `GValue`.
     * 
     * For local drag-and-drop operations that are available in the given
     * `GType`, the value will be copied directly. Otherwise, GDK will
     * try to use [func@Gdk.content_deserialize_async] to convert the data.
     */
    public void readValueAsync(Drop self, Type type, int ioPriority, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            int hash = callback.hashCode();
            Interop.signalRegistry.put(hash, callback);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.gdk_drop_read_value_async(handle(), type.getValue(), ioPriority, cancellable.handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an async drop read.
     * 
     * See [method@Gdk.Drop.read_value_async].
     */
    public org.gtk.gobject.Value readValueFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_drop_read_value_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gobject.Value(References.get(RESULT, false));
    }
    
    /**
     * Selects all actions that are potentially supported by the destination.
     * 
     * When calling this function, do not restrict the passed in actions to
     * the ones provided by [method@Gdk.Drop.get_actions]. Those actions may
     * change in the future, even depending on the actions you provide here.
     * 
     * The @preferred action is a hint to the drag-and-drop mechanism about which
     * action to use when multiple actions are possible.
     * 
     * This function should be called by drag destinations in response to
     * %GDK_DRAG_ENTER or %GDK_DRAG_MOTION events. If the destination does
     * not yet know the exact actions it supports, it should set any possible
     * actions first and then later call this function again.
     */
    public void status(int actions, int preferred) {
        gtk_h.gdk_drop_status(handle(), actions, preferred);
    }
    
}
