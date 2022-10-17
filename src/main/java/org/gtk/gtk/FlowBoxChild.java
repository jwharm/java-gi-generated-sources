package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkFlowBoxChild} is the kind of widget that can be added to a {@code GtkFlowBox}.
 */
public class FlowBoxChild extends Widget implements Accessible, Buildable, ConstraintTarget {

    public FlowBoxChild(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FlowBoxChild */
    public static FlowBoxChild castFrom(org.gtk.gobject.Object gobject) {
        return new FlowBoxChild(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_flow_box_child_new = Interop.downcallHandle(
        "gtk_flow_box_child_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_flow_box_child_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkFlowBoxChild}.
     * <p>
     * This should only be used as a child of a {@code GtkFlowBox}.
     */
    public FlowBoxChild() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_flow_box_child_changed = Interop.downcallHandle(
        "gtk_flow_box_child_changed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void changed() {
        try {
            gtk_flow_box_child_changed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_flow_box_child_get_child = Interop.downcallHandle(
        "gtk_flow_box_child_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget of {@code self}.
     */
    public @Nullable Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_flow_box_child_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_flow_box_child_get_index = Interop.downcallHandle(
        "gtk_flow_box_child_get_index",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current index of the {@code child} in its {@code GtkFlowBox} container.
     */
    public int getIndex() {
        int RESULT;
        try {
            RESULT = (int) gtk_flow_box_child_get_index.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_flow_box_child_is_selected = Interop.downcallHandle(
        "gtk_flow_box_child_is_selected",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the {@code child} is currently selected in its
     * {@code GtkFlowBox} container.
     */
    public boolean isSelected() {
        int RESULT;
        try {
            RESULT = (int) gtk_flow_box_child_is_selected.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_flow_box_child_set_child = Interop.downcallHandle(
        "gtk_flow_box_child_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child widget of {@code self}.
     */
    public @NotNull void setChild(@Nullable Widget child) {
        try {
            gtk_flow_box_child_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * The default bindings are &lt;kbd&gt;Space&lt;/kbd&gt; and &lt;kbd&gt;Enter&lt;/kbd&gt;.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FlowBoxChild.Callbacks.class, "signalFlowBoxChildActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalFlowBoxChildActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FlowBoxChild.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FlowBoxChild(Refcounted.get(source)));
        }
        
    }
}
