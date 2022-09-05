package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkFlowBoxChild` is the kind of widget that can be added to a `GtkFlowBox`.
 */
public class FlowBoxChild extends Widget implements Accessible, Buildable, ConstraintTarget {

    public FlowBoxChild(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to FlowBoxChild */
    public static FlowBoxChild castFrom(org.gtk.gobject.Object gobject) {
        return new FlowBoxChild(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkFlowBoxChild`.
     * 
     * This should only be used as a child of a `GtkFlowBox`.
     */
    public FlowBoxChild() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_child_new(), false));
    }
    
    /**
     * Marks @child as changed, causing any state that depends on this
     * to be updated.
     * 
     * This affects sorting and filtering.
     * 
     * Note that calls to this method must be in sync with the data
     * used for the sorting and filtering functions. For instance, if
     * the list is mirroring some external data set, and *two* children
     * changed in the external data set when you call
     * gtk_flow_box_child_changed() on the first child, the sort function
     * must only read the new data for the first of the two changed
     * children, otherwise the resorting of the children will be wrong.
     * 
     * This generally means that if you don’t fully control the data
     * model, you have to duplicate the data that affects the sorting
     * and filtering functions into the widgets themselves.
     * 
     * Another alternative is to call [method@Gtk.FlowBox.invalidate_sort]
     * on any model change, but that is more expensive.
     */
    public void changed() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_child_changed(HANDLE());
    }
    
    /**
     * Gets the child widget of @self.
     */
    public Widget getChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_child_get_child(HANDLE());
        return new Widget(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the current index of the @child in its `GtkFlowBox` container.
     */
    public int getIndex() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_child_get_index(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns whether the @child is currently selected in its
     * `GtkFlowBox` container.
     */
    public boolean isSelected() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_child_is_selected(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets the child widget of @self.
     */
    public void setChild(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_child_set_child(HANDLE(), child.HANDLE());
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(FlowBoxChild source);
    }
    
    /**
     * Emitted when the user activates a child widget in a `GtkFlowBox`.
     * 
     * This can be happen either by clicking or double-clicking,
     * or via a keybinding.
     * 
     * This is a [keybinding signal](class.SignalAction.html),
     * but it can be used by applications for their own purposes.
     * 
     * The default bindings are <kbd>Space</kbd> and <kbd>Enter</kbd>.
     */
    public void onActivate(ActivateHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFlowBoxChildActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("activate").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
