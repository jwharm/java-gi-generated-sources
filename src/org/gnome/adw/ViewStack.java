package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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

    public ViewStack(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ViewStack */
    public static ViewStack castFrom(org.gtk.gobject.Object gobject) {
        return new ViewStack(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_view_stack_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwViewStack}.
     */
    public ViewStack() {
        super(constructNew());
    }
    
    /**
     * Adds a child to {@code self}.
     */
    public ViewStackPage add(org.gtk.gtk.Widget child) {
        var RESULT = gtk_h.adw_view_stack_add(handle(), child.handle());
        return new ViewStackPage(References.get(RESULT, false));
    }
    
    /**
     * Adds a child to {@code self}.
     * <p>
     * The child is identified by the {@code name}.
     */
    public ViewStackPage addNamed(org.gtk.gtk.Widget child, java.lang.String name) {
        var RESULT = gtk_h.adw_view_stack_add_named(handle(), child.handle(), Interop.allocateNativeString(name).handle());
        return new ViewStackPage(References.get(RESULT, false));
    }
    
    /**
     * Adds a child to {@code self}.
     * <p>
     * The child is identified by the {@code name}. The {@code title} will be used by
     * {@link ViewSwitcher} to represent {@code child}, so it should be short.
     */
    public ViewStackPage addTitled(org.gtk.gtk.Widget child, java.lang.String name, java.lang.String title) {
        var RESULT = gtk_h.adw_view_stack_add_titled(handle(), child.handle(), Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(title).handle());
        return new ViewStackPage(References.get(RESULT, false));
    }
    
    /**
     * Finds the child with {@code name} in {@code self}.
     */
    public org.gtk.gtk.Widget getChildByName(java.lang.String name) {
        var RESULT = gtk_h.adw_view_stack_get_child_by_name(handle(), Interop.allocateNativeString(name).handle());
        return new org.gtk.gtk.Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets whether {@code self} is horizontally homogeneous.
     */
    public boolean getHhomogeneous() {
        var RESULT = gtk_h.adw_view_stack_get_hhomogeneous(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the {@link ViewStackPage} object for {@code child}.
     */
    public ViewStackPage getPage(org.gtk.gtk.Widget child) {
        var RESULT = gtk_h.adw_view_stack_get_page(handle(), child.handle());
        return new ViewStackPage(References.get(RESULT, false));
    }
    
    /**
     * Returns a {@code Gio.ListModel} that contains the pages of the stack.
     * <p>
     * This can be used to keep an up-to-date view. The model also implements
     * {@code Gtk.SelectionModel} and can be used to track and change the visible
     * page.
     */
    public org.gtk.gtk.SelectionModel getPages() {
        var RESULT = gtk_h.adw_view_stack_get_pages(handle());
        return new org.gtk.gtk.SelectionModel.SelectionModelImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets whether {@code self} is vertically homogeneous.
     */
    public boolean getVhomogeneous() {
        var RESULT = gtk_h.adw_view_stack_get_vhomogeneous(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the currently visible child of {@code self}, .
     */
    public org.gtk.gtk.Widget getVisibleChild() {
        var RESULT = gtk_h.adw_view_stack_get_visible_child(handle());
        return new org.gtk.gtk.Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns the name of the currently visible child of {@code self}.
     */
    public java.lang.String getVisibleChildName() {
        var RESULT = gtk_h.adw_view_stack_get_visible_child_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Removes a child widget from {@code self}.
     */
    public void remove(org.gtk.gtk.Widget child) {
        gtk_h.adw_view_stack_remove(handle(), child.handle());
    }
    
    /**
     * Sets {@code self} to be horizontally homogeneous or not.
     */
    public void setHhomogeneous(boolean hhomogeneous) {
        gtk_h.adw_view_stack_set_hhomogeneous(handle(), hhomogeneous ? 1 : 0);
    }
    
    /**
     * Sets {@code self} to be vertically homogeneous or not.
     */
    public void setVhomogeneous(boolean vhomogeneous) {
        gtk_h.adw_view_stack_set_vhomogeneous(handle(), vhomogeneous ? 1 : 0);
    }
    
    /**
     * Makes {@code child} the visible child of {@code self}.
     */
    public void setVisibleChild(org.gtk.gtk.Widget child) {
        gtk_h.adw_view_stack_set_visible_child(handle(), child.handle());
    }
    
    /**
     * Makes the child with {@code name} visible.
     */
    public void setVisibleChildName(java.lang.String name) {
        gtk_h.adw_view_stack_set_visible_child_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
}
