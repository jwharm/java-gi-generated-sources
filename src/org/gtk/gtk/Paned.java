package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A widget with two panes, arranged either horizontally or vertically.
 * 
 * ![An example GtkPaned](panes.png)
 * 
 * The division between the two panes is adjustable by the user
 * by dragging a handle.
 * 
 * Child widgets are added to the panes of the widget with
 * [method@Gtk.Paned.set_start_child] and [method@Gtk.Paned.set_end_child].
 * The division between the two children is set by default from the size
 * requests of the children, but it can be adjusted by the user.
 * 
 * A paned widget draws a separator between the two child widgets and a
 * small handle that the user can drag to adjust the division. It does not
 * draw any relief around the children or around the separator. (The space
 * in which the separator is called the gutter.) Often, it is useful to put
 * each child inside a [class@Gtk.Frame] so that the gutter appears as a
 * ridge. No separator is drawn if one of the children is missing.
 * 
 * Each child has two options that can be set, "resize" and "shrink". If
 * "resize" is true then, when the `GtkPaned` is resized, that child will
 * expand or shrink along with the paned widget. If "shrink" is true, then
 * that child can be made smaller than its requisition by the user.
 * Setting "shrink" to false allows the application to set a minimum size.
 * If "resize" is false for both children, then this is treated as if
 * "resize" is true for both children.
 * 
 * The application can set the position of the slider as if it were set
 * by the user, by calling [method@Gtk.Paned.set_position].
 * 
 * # CSS nodes
 * 
 * ```
 * paned
 * ├── <child>
 * ├── separator[.wide]
 * ╰── <child>
 * ```
 * 
 * `GtkPaned` has a main CSS node with name paned, and a subnode for
 * the separator with name separator. The subnode gets a .wide style
 * class when the paned is supposed to be wide.
 * 
 * In horizontal orientation, the nodes are arranged based on the text
 * direction, so in left-to-right mode, :first-child will select the
 * leftmost child, while it will select the rightmost child in
 * RTL layouts.
 * 
 * ## Creating a paned widget with minimum sizes.
 * 
 * ```c
 * GtkWidget *hpaned = gtk_paned_new (GTK_ORIENTATION_HORIZONTAL);
 * GtkWidget *frame1 = gtk_frame_new (NULL);
 * GtkWidget *frame2 = gtk_frame_new (NULL);
 * 
 * gtk_widget_set_size_request (hpaned, 200, -1);
 * 
 * gtk_paned_set_start_child (GTK_PANED (hpaned), frame1);
 * gtk_paned_set_start_child_resize (GTK_PANED (hpaned), TRUE);
 * gtk_paned_set_start_child_shrink (GTK_PANED (hpaned), FALSE);
 * gtk_widget_set_size_request (frame1, 50, -1);
 * 
 * gtk_paned_set_end_child (GTK_PANED (hpaned), frame2);
 * gtk_paned_set_end_child_resize (GTK_PANED (hpaned), FALSE);
 * gtk_paned_set_end_child_shrink (GTK_PANED (hpaned), FALSE);
 * gtk_widget_set_size_request (frame2, 50, -1);
 * ```
 */
public class Paned extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public Paned(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Paned */
    public static Paned castFrom(org.gtk.gobject.Object gobject) {
        return new Paned(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkPaned` widget.
     */
    public Paned(Orientation orientation) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_paned_new(orientation.getValue()), false));
    }
    
    /**
     * Retrieves the end child of the given `GtkPaned`.
     */
    public Widget getEndChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_paned_get_end_child(HANDLE());
        return new Widget(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Obtains the position of the divider between the two panes.
     */
    public int getPosition() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_paned_get_position(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns whether the [property@Gtk.Paned:end-child] can be resized.
     */
    public boolean getResizeEndChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_paned_get_resize_end_child(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the [property@Gtk.Paned:start-child] can be resized.
     */
    public boolean getResizeStartChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_paned_get_resize_start_child(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the [property@Gtk.Paned:end-child] can shrink.
     */
    public boolean getShrinkEndChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_paned_get_shrink_end_child(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the [property@Gtk.Paned:start-child] can shrink.
     */
    public boolean getShrinkStartChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_paned_get_shrink_start_child(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the start child of the given `GtkPaned`.
     */
    public Widget getStartChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_paned_get_start_child(HANDLE());
        return new Widget(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets whether the separator should be wide.
     */
    public boolean getWideHandle() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_paned_get_wide_handle(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets the end child of @paned to @child.
     * 
     * If @child is `NULL`, the existing child will be removed.
     */
    public void setEndChild(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_paned_set_end_child(HANDLE(), child.HANDLE());
    }
    
    /**
     * Sets the position of the divider between the two panes.
     */
    public void setPosition(int position) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_paned_set_position(HANDLE(), position);
    }
    
    /**
     * Sets whether the [property@Gtk.Paned:end-child] can be resized.
     */
    public void setResizeEndChild(boolean resize) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_paned_set_resize_end_child(HANDLE(), resize ? 1 : 0);
    }
    
    /**
     * Sets whether the [property@Gtk.Paned:start-child] can be resized.
     */
    public void setResizeStartChild(boolean resize) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_paned_set_resize_start_child(HANDLE(), resize ? 1 : 0);
    }
    
    /**
     * Sets whether the [property@Gtk.Paned:end-child] can shrink.
     */
    public void setShrinkEndChild(boolean resize) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_paned_set_shrink_end_child(HANDLE(), resize ? 1 : 0);
    }
    
    /**
     * Sets whether the [property@Gtk.Paned:start-child] can shrink.
     */
    public void setShrinkStartChild(boolean resize) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_paned_set_shrink_start_child(HANDLE(), resize ? 1 : 0);
    }
    
    /**
     * Sets the start child of @paned to @child.
     * 
     * If @child is `NULL`, the existing child will be removed.
     */
    public void setStartChild(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_paned_set_start_child(HANDLE(), child.HANDLE());
    }
    
    /**
     * Sets whether the separator should be wide.
     */
    public void setWideHandle(boolean wide) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_paned_set_wide_handle(HANDLE(), wide ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface AcceptPositionHandler {
        boolean signalReceived(Paned source);
    }
    
    /**
     * Emitted to accept the current position of the handle when
     * moving it using key bindings.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default binding for this signal is <kbd>Return</kbd> or
     * <kbd>Space</kbd>.
     */
    public void onAcceptPosition(AcceptPositionHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPanedAcceptPosition", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("accept-position"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface CancelPositionHandler {
        boolean signalReceived(Paned source);
    }
    
    /**
     * Emitted to cancel moving the position of the handle using key
     * bindings.
     * 
     * The position of the handle will be reset to the value prior to
     * moving it.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default binding for this signal is <kbd>Escape</kbd>.
     */
    public void onCancelPosition(CancelPositionHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPanedCancelPosition", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("cancel-position"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface CycleChildFocusHandler {
        boolean signalReceived(Paned source, boolean reversed);
    }
    
    /**
     * Emitted to cycle the focus between the children of the paned.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default binding is <kbd>F6</kbd>.
     */
    public void onCycleChildFocus(CycleChildFocusHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPanedCycleChildFocus", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("cycle-child-focus"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface CycleHandleFocusHandler {
        boolean signalReceived(Paned source, boolean reversed);
    }
    
    /**
     * Emitted to cycle whether the paned should grab focus to allow
     * the user to change position of the handle by using key bindings.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default binding for this signal is <kbd>F8</kbd>.
     */
    public void onCycleHandleFocus(CycleHandleFocusHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPanedCycleHandleFocus", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("cycle-handle-focus"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MoveHandleHandler {
        boolean signalReceived(Paned source, ScrollType scrollType);
    }
    
    /**
     * Emitted to move the handle with key bindings.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     */
    public void onMoveHandle(MoveHandleHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPanedMoveHandle", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("move-handle"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ToggleHandleFocusHandler {
        boolean signalReceived(Paned source);
    }
    
    /**
     * Emitted to accept the current position of the handle and then
     * move focus to the next widget in the focus chain.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default binding is <kbd>Tab</kbd>.
     */
    public void onToggleHandleFocus(ToggleHandleFocusHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPanedToggleHandleFocus", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("toggle-handle-focus"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}