package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A view container for {@link ViewSwitcher}.
 * <p>
 * {@code AdwViewStack} is a container which only shows one page at a time.
 * It is typically used to hold an application's main views.
 * <p>
 * It doesn't provide a way to transition between pages.
 * Instead, a separate widget such as {@link ViewSwitcher} can be used with
 * {@code AdwViewStack} to provide this functionality.
 * <p>
 * {@code AdwViewStack} pages can have a title, an icon, an attention request, and a
 * numbered badge that {@link ViewSwitcher} will use to let users identify which
 * page is which. Set them using the {@code ViewStackPage:title},
 * {@code ViewStackPage:icon-name},
 * {@code ViewStackPage:needs-attention}, and
 * {@code ViewStackPage:badge-number} properties.
 * <p>
 * Unlike {@link org.gtk.gtk.Stack}, transitions between views are not animated.
 * <p>
 * {@code AdwViewStack} maintains a {@link ViewStackPage} object for each added child,
 * which holds additional per-child properties. You obtain the
 * {@code ViewStack.get_page} and you
 * can obtain a {@code Gtk.SelectionModel} containing all the pages with
 * {@link ViewStack#getPages}.
 * <p>
 * <h2>AdwViewStack as GtkBuildable</h2>
 * <p>
 * To set child-specific properties in a .ui file, create
 * {@link ViewStackPage} objects explicitly, and set the child widget as a
 * property on it:
 * <p>
 * <pre>{@code xml
 *   <object class="AdwViewStack" id="stack">
 *     <child>
 *       <object class="AdwViewStackPage">
 *         <property name="name">overview</property>
 *         <property name="title">Overview</property>
 *         <property name="child">
 *           <object class="AdwStatusPage">
 *             <property name="title">Welcome!</property>
 *           </object>
 *         </property>
 *       </object>
 *     </child>
 *   </object>
 * }</pre>
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwViewStack} has a single CSS node named {@code stack}.
 */
public class ViewStack extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public ViewStack(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ViewStack */
    public static ViewStack castFrom(org.gtk.gobject.Object gobject) {
        return new ViewStack(gobject.refcounted());
    }
    
    static final MethodHandle adw_view_stack_new = Interop.downcallHandle(
        "adw_view_stack_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_view_stack_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwViewStack}.
     */
    public ViewStack() {
        super(constructNew());
    }
    
    static final MethodHandle adw_view_stack_add = Interop.downcallHandle(
        "adw_view_stack_add",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a child to {@code self}.
     */
    public ViewStackPage add(org.gtk.gtk.Widget child) {
        try {
            var RESULT = (MemoryAddress) adw_view_stack_add.invokeExact(handle(), child.handle());
            return new ViewStackPage(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_add_named = Interop.downcallHandle(
        "adw_view_stack_add_named",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a child to {@code self}.
     * <p>
     * The child is identified by the {@code name}.
     */
    public ViewStackPage addNamed(org.gtk.gtk.Widget child, java.lang.String name) {
        try {
            var RESULT = (MemoryAddress) adw_view_stack_add_named.invokeExact(handle(), child.handle(), Interop.allocateNativeString(name).handle());
            return new ViewStackPage(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_add_titled = Interop.downcallHandle(
        "adw_view_stack_add_titled",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a child to {@code self}.
     * <p>
     * The child is identified by the {@code name}. The {@code title} will be used by
     * {@link ViewSwitcher} to represent {@code child}, so it should be short.
     */
    public ViewStackPage addTitled(org.gtk.gtk.Widget child, java.lang.String name, java.lang.String title) {
        try {
            var RESULT = (MemoryAddress) adw_view_stack_add_titled.invokeExact(handle(), child.handle(), Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(title).handle());
            return new ViewStackPage(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_get_child_by_name = Interop.downcallHandle(
        "adw_view_stack_get_child_by_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the child with {@code name} in {@code self}.
     */
    public org.gtk.gtk.Widget getChildByName(java.lang.String name) {
        try {
            var RESULT = (MemoryAddress) adw_view_stack_get_child_by_name.invokeExact(handle(), Interop.allocateNativeString(name).handle());
            return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_get_hhomogeneous = Interop.downcallHandle(
        "adw_view_stack_get_hhomogeneous",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} is horizontally homogeneous.
     */
    public boolean getHhomogeneous() {
        try {
            var RESULT = (int) adw_view_stack_get_hhomogeneous.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_get_page = Interop.downcallHandle(
        "adw_view_stack_get_page",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link ViewStackPage} object for {@code child}.
     */
    public ViewStackPage getPage(org.gtk.gtk.Widget child) {
        try {
            var RESULT = (MemoryAddress) adw_view_stack_get_page.invokeExact(handle(), child.handle());
            return new ViewStackPage(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_get_pages = Interop.downcallHandle(
        "adw_view_stack_get_pages",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a {@code Gio.ListModel} that contains the pages of the stack.
     * <p>
     * This can be used to keep an up-to-date view. The model also implements
     * {@code Gtk.SelectionModel} and can be used to track and change the visible
     * page.
     */
    public org.gtk.gtk.SelectionModel getPages() {
        try {
            var RESULT = (MemoryAddress) adw_view_stack_get_pages.invokeExact(handle());
            return new org.gtk.gtk.SelectionModel.SelectionModelImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_get_vhomogeneous = Interop.downcallHandle(
        "adw_view_stack_get_vhomogeneous",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} is vertically homogeneous.
     */
    public boolean getVhomogeneous() {
        try {
            var RESULT = (int) adw_view_stack_get_vhomogeneous.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_get_visible_child = Interop.downcallHandle(
        "adw_view_stack_get_visible_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the currently visible child of {@code self}, .
     */
    public org.gtk.gtk.Widget getVisibleChild() {
        try {
            var RESULT = (MemoryAddress) adw_view_stack_get_visible_child.invokeExact(handle());
            return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_get_visible_child_name = Interop.downcallHandle(
        "adw_view_stack_get_visible_child_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the name of the currently visible child of {@code self}.
     */
    public java.lang.String getVisibleChildName() {
        try {
            var RESULT = (MemoryAddress) adw_view_stack_get_visible_child_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_remove = Interop.downcallHandle(
        "adw_view_stack_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a child widget from {@code self}.
     */
    public void remove(org.gtk.gtk.Widget child) {
        try {
            adw_view_stack_remove.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_set_hhomogeneous = Interop.downcallHandle(
        "adw_view_stack_set_hhomogeneous",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets {@code self} to be horizontally homogeneous or not.
     */
    public void setHhomogeneous(boolean hhomogeneous) {
        try {
            adw_view_stack_set_hhomogeneous.invokeExact(handle(), hhomogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_set_vhomogeneous = Interop.downcallHandle(
        "adw_view_stack_set_vhomogeneous",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets {@code self} to be vertically homogeneous or not.
     */
    public void setVhomogeneous(boolean vhomogeneous) {
        try {
            adw_view_stack_set_vhomogeneous.invokeExact(handle(), vhomogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_set_visible_child = Interop.downcallHandle(
        "adw_view_stack_set_visible_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes {@code child} the visible child of {@code self}.
     */
    public void setVisibleChild(org.gtk.gtk.Widget child) {
        try {
            adw_view_stack_set_visible_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_set_visible_child_name = Interop.downcallHandle(
        "adw_view_stack_set_visible_child_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes the child with {@code name} visible.
     */
    public void setVisibleChildName(java.lang.String name) {
        try {
            adw_view_stack_set_visible_child_name.invokeExact(handle(), Interop.allocateNativeString(name).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}