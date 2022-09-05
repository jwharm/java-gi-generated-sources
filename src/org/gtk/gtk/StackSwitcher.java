package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GtkStackSwitcher` shows a row of buttons to switch between `GtkStack`
 * pages.
 * 
 * ![An example GtkStackSwitcher](stackswitcher.png)
 * 
 * It acts as a controller for the associated `GtkStack`.
 * 
 * All the content for the buttons comes from the properties of the stacks
 * [class@Gtk.StackPage] objects; the button visibility in a `GtkStackSwitcher`
 * widget is controlled by the visibility of the child in the `GtkStack`.
 * 
 * It is possible to associate multiple `GtkStackSwitcher` widgets
 * with the same `GtkStack` widget.
 * 
 * # CSS nodes
 * 
 * `GtkStackSwitcher` has a single CSS node named stackswitcher and
 * style class .stack-switcher.
 * 
 * When circumstances require it, `GtkStackSwitcher` adds the
 * .needs-attention style class to the widgets representing the
 * stack pages.
 * 
 * # Accessibility
 * 
 * `GtkStackSwitcher` uses the %GTK_ACCESSIBLE_ROLE_TAB_LIST role
 * and uses the %GTK_ACCESSIBLE_ROLE_TAB for its buttons.
 * 
 * # Orientable
 * 
 * Since GTK 4.4, `GtkStackSwitcher` implements `GtkOrientable` allowing
 * the stack switcher to be made vertical with
 * `gtk_orientable_set_orientation()`.
 */
public class StackSwitcher extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public StackSwitcher(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to StackSwitcher */
    public static StackSwitcher castFrom(org.gtk.gobject.Object gobject) {
        return new StackSwitcher(gobject.getProxy());
    }
    
    /**
     * Create a new `GtkStackSwitcher`.
     */
    public StackSwitcher() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_stack_switcher_new(), false));
    }
    
    /**
     * Retrieves the stack.
     */
    public Stack getStack() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_stack_switcher_get_stack(HANDLE());
        return new Stack(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Sets the stack to control.
     */
    public void setStack(Stack stack) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_stack_switcher_set_stack(HANDLE(), stack.HANDLE());
    }
    
}