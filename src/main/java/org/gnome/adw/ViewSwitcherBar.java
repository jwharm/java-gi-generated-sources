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
 * {@link ViewStack}. It is designed to be put at
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
 * <pre>{@code xml
 * <object class="GtkWindow">
 *   <property name="titlebar">
 *     <object class="AdwHeaderBar">
 *       <property name="centering-policy">strict</property>
 *       <property name="title-widget">
 *         <object class="AdwViewSwitcherTitle" id="title">
 *           <property name="stack">stack</property>
 *         </object>
 *       </property>
 *     </object>
 *   </property>
 *   <property>
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
 *   </property>
 * </object>
 * }</pre>
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwViewSwitcherBar} has a single CSS node with name{@code  viewswitcherbar}.
 * @version 1.0
 */
public class ViewSwitcherBar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwViewSwitcherBar";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public ViewSwitcherBar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ViewSwitcherBar if its GType is a (or inherits from) "AdwViewSwitcherBar".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ViewSwitcherBar" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwViewSwitcherBar", a ClassCastException will be thrown.
     */
    public static ViewSwitcherBar castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwViewSwitcherBar"))) {
            return new ViewSwitcherBar(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwViewSwitcherBar");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_view_switcher_bar_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwViewSwitcherBar}.
     */
    public ViewSwitcherBar() {
        super(constructNew());
    }
    
    /**
     * Gets whether {@code self} should be revealed or hidden.
     * @return whether {@code self} is revealed
     */
    public boolean getReveal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_view_switcher_bar_get_reveal.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the stack controlled by {@code self}.
     * @return the stack
     */
    public @Nullable org.gnome.adw.ViewStack getStack() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_switcher_bar_get_stack.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.ViewStack(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets whether {@code self} should be revealed or hidden.
     * @param reveal whether to reveal {@code self}
     */
    public void setReveal(boolean reveal) {
        try {
            DowncallHandles.adw_view_switcher_bar_set_reveal.invokeExact(
                    handle(),
                    reveal ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the stack controlled by {@code self}.
     * @param stack a stack
     */
    public void setStack(@Nullable org.gnome.adw.ViewStack stack) {
        try {
            DowncallHandles.adw_view_switcher_bar_set_stack.invokeExact(
                    handle(),
                    (Addressable) (stack == null ? MemoryAddress.NULL : stack.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_view_switcher_bar_new = Interop.downcallHandle(
            "adw_view_switcher_bar_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_switcher_bar_get_reveal = Interop.downcallHandle(
            "adw_view_switcher_bar_get_reveal",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_switcher_bar_get_stack = Interop.downcallHandle(
            "adw_view_switcher_bar_get_stack",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_switcher_bar_set_reveal = Interop.downcallHandle(
            "adw_view_switcher_bar_set_reveal",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_view_switcher_bar_set_stack = Interop.downcallHandle(
            "adw_view_switcher_bar_set_stack",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
