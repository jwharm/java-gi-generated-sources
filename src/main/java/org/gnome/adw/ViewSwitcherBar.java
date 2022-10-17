package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A view switcher action bar.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="view-switcher-bar-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="view-switcher-bar.png" alt="view-switcher-bar"&gt;
 * &lt;/picture&gt;
 * <p>
 * An action bar letting you switch between multiple views contained in a
 * {@code ViewSwitcher}. It is designed to be put at
 * the bottom of a window and to be revealed only on really narrow windows, e.g.
 * on mobile phones. It can't be revealed if there are less than two pages.
 * <p>
 * {@code AdwViewSwitcherBar} is intended to be used together with
 * {@link ViewSwitcherTitle}.
 * <p>
 * A common use case is to bind the {@code ViewSwitcherBar:reveal} property
 * to {@code ViewSwitcherTitle:title-visible} to automatically reveal the
 * view switcher bar when the title label is displayed in place of the view
 * switcher, as follows:
 * 
 * <pre>{@code xml
 * <object class="GtkWindow">
 *   <child type="titlebar">
 *     <object class="AdwHeaderBar">
 *       <property name="centering-policy">strict</property>
 *       <child type="title">
 *         <object class="AdwViewSwitcherTitle" id="title">
 *           <property name="stack">stack</property>
 *         </object>
 *       </child>
 *     </object>
 *   </child>
 *   <child>
 *     <object class="GtkBox">
 *       <property name="orientation">vertical</property>
 *       <child>
 *         <object class="AdwViewStack" id="stack"/>
 *       </child>
 *       <child>
 *         <object class="AdwViewSwitcherBar">
 *           <property name="stack">stack</property>
 *           <binding name="reveal">
 *             <lookup name="title-visible">title</lookup>
 *           </binding>
 *         </object>
 *       </child>
 *     </object>
 *   </child>
 * </object>
 * }</pre>
 * 
 * <h2>CSS nodes</h2>
 * {@code AdwViewSwitcherBar} has a single CSS node with name{@code  viewswitcherbar}.
 */
public class ViewSwitcherBar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public ViewSwitcherBar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ViewSwitcherBar */
    public static ViewSwitcherBar castFrom(org.gtk.gobject.Object gobject) {
        return new ViewSwitcherBar(gobject.refcounted());
    }
    
    private static final MethodHandle adw_view_switcher_bar_new = Interop.downcallHandle(
        "adw_view_switcher_bar_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_view_switcher_bar_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwViewSwitcherBar}.
     */
    public ViewSwitcherBar() {
        super(constructNew());
    }
    
    private static final MethodHandle adw_view_switcher_bar_get_reveal = Interop.downcallHandle(
        "adw_view_switcher_bar_get_reveal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} should be revealed or hidden.
     */
    public boolean getReveal() {
        int RESULT;
        try {
            RESULT = (int) adw_view_switcher_bar_get_reveal.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_view_switcher_bar_get_stack = Interop.downcallHandle(
        "adw_view_switcher_bar_get_stack",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the stack controlled by {@code self}.
     */
    public @Nullable ViewStack getStack() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_view_switcher_bar_get_stack.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ViewStack(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_view_switcher_bar_set_reveal = Interop.downcallHandle(
        "adw_view_switcher_bar_set_reveal",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code self} should be revealed or hidden.
     */
    public @NotNull void setReveal(@NotNull boolean reveal) {
        try {
            adw_view_switcher_bar_set_reveal.invokeExact(handle(), reveal ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_view_switcher_bar_set_stack = Interop.downcallHandle(
        "adw_view_switcher_bar_set_stack",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the stack controlled by {@code self}.
     */
    public @NotNull void setStack(@Nullable ViewStack stack) {
        try {
            adw_view_switcher_bar_set_stack.invokeExact(handle(), stack.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
