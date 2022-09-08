package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GdkDrag` object represents the source of an ongoing DND operation.
 * 
 * A `GdkDrag` is created when a drag is started, and stays alive for duration of
 * the DND operation. After a drag has been started with [func@Gdk.Drag.begin],
 * the caller gets informed about the status of the ongoing drag operation
 * with signals on the `GdkDrag` object.
 * 
 * GTK provides a higher level abstraction based on top of these functions,
 * and so they are not normally needed in GTK applications. See the
 * "Drag and Drop" section of the GTK documentation for more information.
 */
public class Drag extends org.gtk.gobject.Object {

    public Drag(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Drag */
    public static Drag castFrom(org.gtk.gobject.Object gobject) {
        return new Drag(gobject.getReference());
    }
    
    /**
     * Informs GDK that the drop ended.
     * 
     * Passing %FALSE for @success may trigger a drag cancellation
     * animation.
     * 
     * This function is called by the drag source, and should be the
     * last call before dropping the reference to the @drag.
     * 
     * The `GdkDrag` will only take the first [method@Gdk.Drag.drop_done]
     * call as effective, if this function is called multiple times,
     * all subsequent calls will be ignored.
     */
    public void dropDone(boolean success) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drag_drop_done(HANDLE(), success ? 1 : 0);
    }
    
    /**
     * Determines the bitmask of possible actions proposed by the source.
     */
    public int getActions() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drag_get_actions(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the `GdkContentProvider` associated to the `GdkDrag` object.
     */
    public ContentProvider getContent() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drag_get_content(HANDLE());
        return new ContentProvider(References.get(RESULT, false));
    }
    
    /**
     * Returns the `GdkDevice` associated to the `GdkDrag` object.
     */
    public Device getDevice() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drag_get_device(HANDLE());
        return new Device(References.get(RESULT, false));
    }
    
    /**
     * Gets the `GdkDisplay` that the drag object was created for.
     */
    public Display getDisplay() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drag_get_display(HANDLE());
        return new Display(References.get(RESULT, false));
    }
    
    /**
     * Returns the surface on which the drag icon should be rendered
     * during the drag operation.
     * 
     * Note that the surface may not be available until the drag operation
     * has begun. GDK will move the surface in accordance with the ongoing
     * drag operation. The surface is owned by @drag and will be destroyed
     * when the drag operation is over.
     */
    public Surface getDragSurface() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drag_get_drag_surface(HANDLE());
        return new Surface(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the formats supported by this `GdkDrag` object.
     */
    public ContentFormats getFormats() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drag_get_formats(HANDLE());
        return new ContentFormats(References.get(RESULT, false));
    }
    
    /**
     * Determines the action chosen by the drag destination.
     */
    public int getSelectedAction() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drag_get_selected_action(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the `GdkSurface` where the drag originates.
     */
    public Surface getSurface() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drag_get_surface(HANDLE());
        return new Surface(References.get(RESULT, false));
    }
    
    /**
     * Sets the position of the drag surface that will be kept
     * under the cursor hotspot.
     * 
     * Initially, the hotspot is at the top left corner of the drag surface.
     */
    public void setHotspot(int hotX, int hotY) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drag_set_hotspot(HANDLE(), hotX, hotY);
    }
    
    @FunctionalInterface
    public interface CancelHandler {
        void signalReceived(Drag source, DragCancelReason reason);
    }
    
    /**
     * Emitted when the drag operation is cancelled.
     */
    public void onCancel(CancelHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDragCancel", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("cancel").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * 
     * The drag object can now free all miscellaneous data.
     */
    public void onDndFinished(DndFinishedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDragDndFinished", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("dnd-finished").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
    public void onDropPerformed(DropPerformedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDragDropPerformed", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("drop-performed").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
