package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkStackSidebar` uses a sidebar to switch between `GtkStack` pages.
 * 
 * In order to use a `GtkStackSidebar`, you simply use a `GtkStack` to
 * organize your UI flow, and add the sidebar to your sidebar area. You
 * can use [method@Gtk.StackSidebar.set_stack] to connect the `GtkStackSidebar`
 * to the `GtkStack`.
 * 
 * # CSS nodes
 * 
 * `GtkStackSidebar` has a single CSS node with name stacksidebar and
 * style class .sidebar.
 * 
 * When circumstances require it, `GtkStackSidebar` adds the
 * .needs-attention style class to the widgets representing the stack
 * pages.
 */
public class StackSidebar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public StackSidebar(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to StackSidebar */
    public static StackSidebar castFrom(org.gtk.gobject.Object gobject) {
        return new StackSidebar(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkStackSidebar`.
     */
    public StackSidebar() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_stack_sidebar_new(), false));
    }
    
    /**
     * Retrieves the stack.
     */
    public Stack getStack() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_stack_sidebar_get_stack(HANDLE());
        return new Stack(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Set the `GtkStack` associated with this `GtkStackSidebar`.
     * 
     * The sidebar widget will automatically update according to
     * the order and items within the given `GtkStack`.
     */
    public void setStack(Stack stack) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_stack_sidebar_set_stack(HANDLE(), stack.HANDLE());
    }
    
}
