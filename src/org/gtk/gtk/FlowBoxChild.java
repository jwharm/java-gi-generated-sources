package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkFlowBoxChild</code> is the kind of widget that can be added to a <code>GtkFlowBox</code>.
 */
public class FlowBoxChild extends Widget implements Accessible, Buildable, ConstraintTarget {

    public FlowBoxChild(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FlowBoxChild */
    public static FlowBoxChild castFrom(org.gtk.gobject.Object gobject) {
        return new FlowBoxChild(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_flow_box_child_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkFlowBoxChild</code>.
     * <p>
     * This should only be used as a child of a <code>GtkFlowBox</code>.
     */
    public FlowBoxChild() {
        super(constructNew());
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
     * This generally means that if you don&#8217;t fully control the data
     * model, you have to duplicate the data that affects the sorting
     * and filtering functions into the widgets themselves.
     * 
     * Another alternative is to call {@link org.gtk.gtk.FlowBox#invalidateSort}
     * on any model change, but that is more expensive.
     */
    public void changed() {
        gtk_h.gtk_flow_box_child_changed(handle());
    }
    
    /**
     * Gets the child widget of @self.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_flow_box_child_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the current index of the @child in its <code>GtkFlowBox</code> container.
     */
    public int getIndex() {
        var RESULT = gtk_h.gtk_flow_box_child_get_index(handle());
        return RESULT;
    }
    
    /**
     * Returns whether the @child is currently selected in its<code>GtkFlowBox</code> container.
     */
    public boolean isSelected() {
        var RESULT = gtk_h.gtk_flow_box_child_is_selected(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the child widget of @self.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_flow_box_child_set_child(handle(), child.handle());
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(FlowBoxChild source);
    }
    
    /**
     * Emitted when the user activates a child widget in a <code>GtkFlowBox</code>.
     * 
     * This can be happen either by clicking or double-clicking,
     * or via a keybinding.
     * 
     * This is a {@link [keybinding signal]}(class.SignalAction.html),
     * but it can be used by applications for their own purposes.
     * 
     * The default bindings are &#60;kbd&#62;Space&#60;/kbd&#62; and &#60;kbd&#62;Enter&#60;/kbd&#62;.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFlowBoxChildActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
