package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkFlowBoxChild} is the kind of widget that can be added to a {@code GtkFlowBox}.
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
     * Creates a new {@code GtkFlowBoxChild}.
     * <p>
     * This should only be used as a child of a {@code GtkFlowBox}.
     */
    public FlowBoxChild() {
        super(constructNew());
    }
    
    /**
     * Marks {@code child} as changed, causing any state that depends on this
     * to be updated.
     * <p>
     * This affects sorting and filtering.
     * <p>
     * Note that calls to this method must be in sync with the data
     * used for the sorting and filtering functions. For instance, if
     * the list is mirroring some external data set, and <strong>two</strong> children
     * changed in the external data set when you call
     * gtk_flow_box_child_changed() on the first child, the sort function
     * must only read the new data for the first of the two changed
     * children, otherwise the resorting of the children will be wrong.
     * <p>
     * This generally means that if you don’t fully control the data
     * model, you have to duplicate the data that affects the sorting
     * and filtering functions into the widgets themselves.
     * <p>
     * Another alternative is to call {@link FlowBox#invalidateSort}
     * on any model change, but that is more expensive.
     */
    public void changed() {
        gtk_h.gtk_flow_box_child_changed(handle());
    }
    
    /**
     * Gets the child widget of {@code self}.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_flow_box_child_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the current index of the {@code child} in its {@code GtkFlowBox} container.
     */
    public int getIndex() {
        var RESULT = gtk_h.gtk_flow_box_child_get_index(handle());
        return RESULT;
    }
    
    /**
     * Returns whether the {@code child} is currently selected in its
     * {@code GtkFlowBox} container.
     */
    public boolean isSelected() {
        var RESULT = gtk_h.gtk_flow_box_child_is_selected(handle());
        return RESULT != 0;
    }
    
    /**
     * Sets the child widget of {@code self}.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_flow_box_child_set_child(handle(), child.handle());
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(FlowBoxChild source);
    }
    
    /**
     * Emitted when the user activates a child widget in a {@code GtkFlowBox}.
     * <p>
     * This can be happen either by clicking or double-clicking,
     * or via a keybinding.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>,
     * but it can be used by applications for their own purposes.
     * <p>
     * The default bindings are &lt;kbd>Space</kbd> and <kbd>Enter</kbd&gt;.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("activate").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FlowBoxChild.Callbacks.class, "signalFlowBoxChildActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalFlowBoxChildActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FlowBoxChild.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FlowBoxChild(References.get(source)));
        }
        
    }
}
