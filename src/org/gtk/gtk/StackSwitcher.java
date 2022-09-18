package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>GtkStackSwitcher</code> shows a row of buttons to switch between <code>GtkStack</code>
 * pages.
 * <p>
 * !{@link [An example GtkStackSwitcher]}(stackswitcher.png)
 * <p>
 * It acts as a controller for the associated <code>GtkStack</code>.
 * <p>
 * All the content for the buttons comes from the properties of the stacks
 * {@link org.gtk.gtk.StackPage} objects; the button visibility in a <code>GtkStackSwitcher</code>
 * widget is controlled by the visibility of the child in the <code>GtkStack</code>.
 * <p>
 * It is possible to associate multiple <code>GtkStackSwitcher</code> widgets
 * with the same <code>GtkStack</code> widget.
 * <p>
 * <h1>CSS nodes</h1>
 * <p><code>GtkStackSwitcher</code> has a single CSS node named stackswitcher and
 * style class .stack-switcher.
 * <p>
 * When circumstances require it, <code>GtkStackSwitcher</code> adds the
 * .needs-attention style class to the widgets representing the
 * stack pages.
 * <p>
 * <h1>Accessibility</h1>
 * <p><code>GtkStackSwitcher</code> uses the {@link org.gtk.gtk.AccessibleRole<code>#TAB_LIST</code>  role
 * and uses the {@link org.gtk.gtk.AccessibleRole<code>#TAB</code>  for its buttons.
 * <p>
 * <h1>Orientable</h1>
 * <p>
 * Since GTK 4.4, <code>GtkStackSwitcher</code> implements <code>GtkOrientable</code> allowing
 * the stack switcher to be made vertical with<code>gtk_orientable_set_orientation()</code>.
 */
public class StackSwitcher extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public StackSwitcher(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to StackSwitcher */
    public static StackSwitcher castFrom(org.gtk.gobject.Object gobject) {
        return new StackSwitcher(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_stack_switcher_new(), false);
        return RESULT;
    }
    
    /**
     * Create a new <code>GtkStackSwitcher</code>.
     */
    public StackSwitcher() {
        super(constructNew());
    }
    
    /**
     * Retrieves the stack.
     */
    public Stack getStack() {
        var RESULT = gtk_h.gtk_stack_switcher_get_stack(handle());
        return new Stack(References.get(RESULT, false));
    }
    
    /**
     * Sets the stack to control.
     */
    public void setStack(Stack stack) {
        gtk_h.gtk_stack_switcher_set_stack(handle(), stack.handle());
    }
    
}
