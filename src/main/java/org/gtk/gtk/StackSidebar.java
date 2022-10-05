package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkStackSidebar} uses a sidebar to switch between {@code GtkStack} pages.
 * <p>
 * In order to use a {@code GtkStackSidebar}, you simply use a {@code GtkStack} to
 * organize your UI flow, and add the sidebar to your sidebar area. You
 * can use {@link StackSidebar#setStack} to connect the {@code GtkStackSidebar}
 * to the {@code GtkStack}.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * {@code GtkStackSidebar} has a single CSS node with name stacksidebar and
 * style class .sidebar.
 * <p>
 * When circumstances require it, {@code GtkStackSidebar} adds the
 * .needs-attention style class to the widgets representing the stack
 * pages.
 */
public class StackSidebar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public StackSidebar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to StackSidebar */
    public static StackSidebar castFrom(org.gtk.gobject.Object gobject) {
        return new StackSidebar(gobject.refcounted());
    }
    
    static final MethodHandle gtk_stack_sidebar_new = Interop.downcallHandle(
        "gtk_stack_sidebar_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_stack_sidebar_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkStackSidebar}.
     */
    public StackSidebar() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_stack_sidebar_get_stack = Interop.downcallHandle(
        "gtk_stack_sidebar_get_stack",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the stack.
     */
    public Stack getStack() {
        try {
            var RESULT = (MemoryAddress) gtk_stack_sidebar_get_stack.invokeExact(handle());
            return new Stack(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_stack_sidebar_set_stack = Interop.downcallHandle(
        "gtk_stack_sidebar_set_stack",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the {@code GtkStack} associated with this {@code GtkStackSidebar}.
     * <p>
     * The sidebar widget will automatically update according to
     * the order and items within the given {@code GtkStack}.
     */
    public void setStack(Stack stack) {
        try {
            gtk_stack_sidebar_set_stack.invokeExact(handle(), stack.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
