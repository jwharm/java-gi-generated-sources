package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GdkDrag} object represents the source of an ongoing DND operation.
 * <p>
 * A {@code GdkDrag} is created when a drag is started, and stays alive for duration of
 * the DND operation. After a drag has been started with {@link Gdk#Drag},
 * the caller gets informed about the status of the ongoing drag operation
 * with signals on the {@code GdkDrag} object.
 * <p>
 * GTK provides a higher level abstraction based on top of these functions,
 * and so they are not normally needed in GTK applications. See the
 * "Drag and Drop" section of the GTK documentation for more information.
 */
public class Drag extends org.gtk.gobject.Object {

    public Drag(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Drag */
    public static Drag castFrom(org.gtk.gobject.Object gobject) {
        return new Drag(gobject.getReference());
    }
    
    /**
     * Informs GDK that the drop ended.
     * <p>
     * Passing <code>false</code> for {@code success} may trigger a drag cancellation
     * animation.
     * <p>
     * This function is called by the drag source, and should be the
     * last call before dropping the reference to the {@code drag}.
     * <p>
     * The {@code GdkDrag} will only take the first {@link Drag#dropDone}
     * call as effective, if this function is called multiple times,
     * all subsequent calls will be ignored.
     */
    public void dropDone(boolean success) {
        gtk_h.gdk_drag_drop_done(handle(), success ? 1 : 0);
    }
    
    /**
     * Determines the bitmask of possible actions proposed by the source.
     */
    public int getActions() {
        var RESULT = gtk_h.gdk_drag_get_actions(handle());
        return RESULT;
    }
    
    /**
     * Returns the {@code GdkContentProvider} associated to the {@code GdkDrag} object.
     */
    public ContentProvider getContent() {
        var RESULT = gtk_h.gdk_drag_get_content(handle());
        return new ContentProvider(References.get(RESULT, false));
    }
    
    /**
     * Returns the {@code GdkDevice} associated to the {@code GdkDrag} object.
     */
    public Device getDevice() {
        var RESULT = gtk_h.gdk_drag_get_device(handle());
        return new Device(References.get(RESULT, false));
    }
    
    /**
     * Gets the {@code GdkDisplay} that the drag object was created for.
     */
    public Display getDisplay() {
        var RESULT = gtk_h.gdk_drag_get_display(handle());
        return new Display(References.get(RESULT, false));
    }
    
    /**
     * Returns the surface on which the drag icon should be rendered
     * during the drag operation.
     * <p>
     * Note that the surface may not be available until the drag operation
     * has begun. GDK will move the surface in accordance with the ongoing
     * drag operation. The surface is owned by {@code drag} and will be destroyed
     * when the drag operation is over.
     */
    public Surface getDragSurface() {
        var RESULT = gtk_h.gdk_drag_get_drag_surface(handle());
        return new Surface(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the formats supported by this {@code GdkDrag} object.
     */
    public ContentFormats getFormats() {
        var RESULT = gtk_h.gdk_drag_get_formats(handle());
        return new ContentFormats(References.get(RESULT, false));
    }
    
    /**
     * Determines the action chosen by the drag destination.
     */
    public int getSelectedAction() {
        var RESULT = gtk_h.gdk_drag_get_selected_action(handle());
        return RESULT;
    }
    
    /**
     * Returns the {@code GdkSurface} where the drag originates.
     */
    public Surface getSurface() {
        var RESULT = gtk_h.gdk_drag_get_surface(handle());
        return new Surface(References.get(RESULT, false));
    }
    
    /**
     * Sets the position of the drag surface that will be kept
     * under the cursor hotspot.
     * <p>
     * Initially, the hotspot is at the top left corner of the drag surface.
     */
    public void setHotspot(int hotX, int hotY) {
        gtk_h.gdk_drag_set_hotspot(handle(), hotX, hotY);
    }
    
    /**
     * Starts a drag and creates a new drag context for it.
     * <p>
     * This function is called by the drag source. After this call, you
     * probably want to set up the drag icon using the surface returned
     * by {@link Drag#getDragSurface}.
     * <p>
     * This function returns a reference to the {@link Drag} object,
     * but GTK keeps its own reference as well, as long as the DND operation
     * is going on.
     * <p>
     * Note: if {@code actions} include {@link DragAction#MOVE}, you need to listen for
     * the {@code Gdk.Drag::dnd-finished} signal and delete the data at
     * the source if {@link Drag#getSelectedAction} returns
     * {@link DragAction#MOVE}.
     */
    public static Drag begin(Surface surface, Device device, ContentProvider content, int actions, double dx, double dy) {
        var RESULT = gtk_h.gdk_drag_begin(surface.handle(), device.handle(), content.handle(), actions, dx, dy);
        return new Drag(References.get(RESULT, true));
    }
    
    @FunctionalInterface
    public interface CancelHandler {
        void signalReceived(Drag source, DragCancelReason reason);
    }
    
    /**
     * Emitted when the drag operation is cancelled.
     */
    public SignalHandle onCancel(CancelHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDragCancel", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("cancel").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DndFinishedHandler {
        void signalReceived(Drag source);
    }
    
    /**
     * Emitted when the destination side has finished reading all data.
     * <p>
     * The drag object can now free all miscellaneous data.
     */
    public SignalHandle onDndFinished(DndFinishedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDragDndFinished", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("dnd-finished").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DropPerformedHandler {
        void signalReceived(Drag source);
    }
    
    /**
     * Emitted when the drop operation is performed on an accepting client.
     */
    public SignalHandle onDropPerformed(DropPerformedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDragDropPerformed", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("drop-performed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
