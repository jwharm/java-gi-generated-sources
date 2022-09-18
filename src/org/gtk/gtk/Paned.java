package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A widget with two panes, arranged either horizontally or vertically.
 * <p>
 * !{@link [An example GtkPaned]}(panes.png)
 * <p>
 * The division between the two panes is adjustable by the user
 * by dragging a handle.
 * <p>
 * Child widgets are added to the panes of the widget with
 * {@link org.gtk.gtk.Paned<code>#setStartChild</code>  and {@link org.gtk.gtk.Paned<code>#setEndChild</code> .
 * The division between the two children is set by default from the size
 * requests of the children, but it can be adjusted by the user.
 * <p>
 * A paned widget draws a separator between the two child widgets and a
 * small handle that the user can drag to adjust the division. It does not
 * draw any relief around the children or around the separator. (The space
 * in which the separator is called the gutter.) Often, it is useful to put
 * each child inside a {@link org.gtk.gtk.Frame} so that the gutter appears as a
 * ridge. No separator is drawn if one of the children is missing.
 * <p>
 * Each child has two options that can be set, &<code>#34</code> resize&<code>#34</code>  and &<code>#34</code> shrink&<code>#34</code> . If
 * &<code>#34</code> resize&<code>#34</code>  is true then, when the <code>GtkPaned</code> is resized, that child will
 * expand or shrink along with the paned widget. If &<code>#34</code> shrink&<code>#34</code>  is true, then
 * that child can be made smaller than its requisition by the user.
 * Setting &<code>#34</code> shrink&<code>#34</code>  to false allows the application to set a minimum size.
 * If &<code>#34</code> resize&<code>#34</code>  is false for both children, then this is treated as if
 * &<code>#34</code> resize&<code>#34</code>  is true for both children.
 * <p>
 * The application can set the position of the slider as if it were set
 * by the user, by calling {@link org.gtk.gtk.Paned<code>#setPosition</code> .
 * <p>
 * <h1>CSS nodes</h1>
 * <p><pre>
 * paned
 * &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  &<code>#60</code> child&<code>#62</code> 
 * &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  separator{@link [.wide]}
 * &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  &<code>#60</code> child&<code>#62</code> 
 * </pre>
 * <p><code>GtkPaned</code> has a main CSS node with name paned, and a subnode for
 * the separator with name separator. The subnode gets a .wide style
 * class when the paned is supposed to be wide.
 * <p>
 * In horizontal orientation, the nodes are arranged based on the text
 * direction, so in left-to-right mode, :first-child will select the
 * leftmost child, while it will select the rightmost child in
 * RTL layouts.
 * <p>
 * <h2>Creating a paned widget with minimum sizes.</h2>
 * <p><pre>c
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
 * </pre>
 */
public class Paned extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public Paned(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Paned */
    public static Paned castFrom(org.gtk.gobject.Object gobject) {
        return new Paned(gobject.getReference());
    }
    
    private static Reference constructNew(Orientation orientation) {
        Reference RESULT = References.get(gtk_h.gtk_paned_new(orientation.getValue()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkPaned</code> widget.
     */
    public Paned(Orientation orientation) {
        super(constructNew(orientation));
    }
    
    /**
     * Retrieves the end child of the given <code>GtkPaned</code>.
     */
    public Widget getEndChild() {
        var RESULT = gtk_h.gtk_paned_get_end_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Obtains the position of the divider between the two panes.
     */
    public int getPosition() {
        var RESULT = gtk_h.gtk_paned_get_position(handle());
        return RESULT;
    }
    
    /**
     * Returns whether the {@link [property@Gtk.Paned:end-child] (ref=property)} can be resized.
     */
    public boolean getResizeEndChild() {
        var RESULT = gtk_h.gtk_paned_get_resize_end_child(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the {@link [property@Gtk.Paned:start-child] (ref=property)} can be resized.
     */
    public boolean getResizeStartChild() {
        var RESULT = gtk_h.gtk_paned_get_resize_start_child(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the {@link [property@Gtk.Paned:end-child] (ref=property)} can shrink.
     */
    public boolean getShrinkEndChild() {
        var RESULT = gtk_h.gtk_paned_get_shrink_end_child(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the {@link [property@Gtk.Paned:start-child] (ref=property)} can shrink.
     */
    public boolean getShrinkStartChild() {
        var RESULT = gtk_h.gtk_paned_get_shrink_start_child(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the start child of the given <code>GtkPaned</code>.
     */
    public Widget getStartChild() {
        var RESULT = gtk_h.gtk_paned_get_start_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets whether the separator should be wide.
     */
    public boolean getWideHandle() {
        var RESULT = gtk_h.gtk_paned_get_wide_handle(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the end child of @paned to @child.
     * <p>
     * If @child is <code>NULL</code>, the existing child will be removed.
     */
    public void setEndChild(Widget child) {
        gtk_h.gtk_paned_set_end_child(handle(), child.handle());
    }
    
    /**
     * Sets the position of the divider between the two panes.
     */
    public void setPosition(int position) {
        gtk_h.gtk_paned_set_position(handle(), position);
    }
    
    /**
     * Sets whether the {@link [property@Gtk.Paned:end-child] (ref=property)} can be resized.
     */
    public void setResizeEndChild(boolean resize) {
        gtk_h.gtk_paned_set_resize_end_child(handle(), resize ? 1 : 0);
    }
    
    /**
     * Sets whether the {@link [property@Gtk.Paned:start-child] (ref=property)} can be resized.
     */
    public void setResizeStartChild(boolean resize) {
        gtk_h.gtk_paned_set_resize_start_child(handle(), resize ? 1 : 0);
    }
    
    /**
     * Sets whether the {@link [property@Gtk.Paned:end-child] (ref=property)} can shrink.
     */
    public void setShrinkEndChild(boolean resize) {
        gtk_h.gtk_paned_set_shrink_end_child(handle(), resize ? 1 : 0);
    }
    
    /**
     * Sets whether the {@link [property@Gtk.Paned:start-child] (ref=property)} can shrink.
     */
    public void setShrinkStartChild(boolean resize) {
        gtk_h.gtk_paned_set_shrink_start_child(handle(), resize ? 1 : 0);
    }
    
    /**
     * Sets the start child of @paned to @child.
     * <p>
     * If @child is <code>NULL</code>, the existing child will be removed.
     */
    public void setStartChild(Widget child) {
        gtk_h.gtk_paned_set_start_child(handle(), child.handle());
    }
    
    /**
     * Sets whether the separator should be wide.
     */
    public void setWideHandle(boolean wide) {
        gtk_h.gtk_paned_set_wide_handle(handle(), wide ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface AcceptPositionHandler {
        boolean signalReceived(Paned source);
    }
    
    /**
     * Emitted to accept the current position of the handle when
     * moving it using key bindings.
     * 
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * The default binding for this signal is &<code>#60</code> kbd&<code>#62</code> Return&<code>#60</code> /kbd&<code>#62</code>  or
     * &<code>#60</code> kbd&<code>#62</code> Space&<code>#60</code> /kbd&<code>#62</code> .
     */
    public SignalHandle onAcceptPosition(AcceptPositionHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPanedAcceptPosition", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("accept-position").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * The default binding for this signal is &<code>#60</code> kbd&<code>#62</code> Escape&<code>#60</code> /kbd&<code>#62</code> .
     */
    public SignalHandle onCancelPosition(CancelPositionHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPanedCancelPosition", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("cancel-position").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * The default binding is &<code>#60</code> kbd&<code>#62</code> F6&<code>#60</code> /kbd&<code>#62</code> .
     */
    public SignalHandle onCycleChildFocus(CycleChildFocusHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPanedCycleChildFocus", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("cycle-child-focus").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * The default binding for this signal is &<code>#60</code> kbd&<code>#62</code> F8&<code>#60</code> /kbd&<code>#62</code> .
     */
    public SignalHandle onCycleHandleFocus(CycleHandleFocusHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPanedCycleHandleFocus", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("cycle-handle-focus").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     */
    public SignalHandle onMoveHandle(MoveHandleHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPanedMoveHandle", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("move-handle").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * The default binding is &<code>#60</code> kbd&<code>#62</code> Tab&<code>#60</code> /kbd&<code>#62</code> .
     */
    public SignalHandle onToggleHandleFocus(ToggleHandleFocusHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPanedToggleHandleFocus", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("toggle-handle-focus").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
