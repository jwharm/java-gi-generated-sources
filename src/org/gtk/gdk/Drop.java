package org.gtk.gdk;

import org.gtk.gobject.*;
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

    public Drop(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Drop */
    public static Drop castFrom(org.gtk.gobject.Object gobject) {
        return new Drop(gobject.getProxy());
    }
    
    /**
     * Ends the drag operation after a drop.
     * 
     * The @action must be a single action selected from the actions
     * available via [method@Gdk.Drop.get_actions].
     */
    public void finish(int action) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drop_finish(HANDLE(), action);
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drop_get_actions(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the `GdkDevice` performing the drop.
     */
    public Device getDevice() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drop_get_device(HANDLE());
        return new Device(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the `GdkDisplay` that @self was created for.
     */
    public Display getDisplay() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drop_get_display(HANDLE());
        return new Display(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * If this is an in-app drag-and-drop operation, returns the `GdkDrag`
     * that corresponds to this drop.
     * 
     * If it is not, %NULL is returned.
     */
    public Drag getDrag() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drop_get_drag(HANDLE());
        return new Drag(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns the `GdkContentFormats` that the drop offers the data
     * to be read in.
     */
    public ContentFormats getFormats() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drop_get_formats(HANDLE());
        return new ContentFormats(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns the `GdkSurface` performing the drop.
     */
    public Surface getSurface() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drop_get_surface(HANDLE());
        return new Surface(ProxyFactory.getProxy(RESULT, false));
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
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drop_read_finish(HANDLE(), result.HANDLE(), Interop.allocateNativeArray(outMimeType), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.gio.InputStream(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Finishes an async drop read.
     * 
     * See [method@Gdk.Drop.read_value_async].
     */
    public org.gtk.gobject.Value readValueFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drop_read_value_finish(HANDLE(), result.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.gobject.Value(ProxyFactory.getProxy(RESULT, false));
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drop_status(HANDLE(), actions, preferred);
    }
    
}