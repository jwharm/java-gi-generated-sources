package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkStack` is a container which only shows one of its children
 * at a time.
 * 
 * In contrast to `GtkNotebook`, `GtkStack` does not provide a means
 * for users to change the visible child. Instead, a separate widget
 * such as [class@Gtk.StackSwitcher] or [class@Gtk.StackSidebar] can
 * be used with `GtkStack` to provide this functionality.
 * 
 * Transitions between pages can be animated as slides or fades. This
 * can be controlled with [method@Gtk.Stack.set_transition_type].
 * These animations respect the [property@Gtk.Settings:gtk-enable-animations]
 * setting.
 * 
 * `GtkStack` maintains a [class@Gtk.StackPage] object for each added
 * child, which holds additional per-child properties. You
 * obtain the `GtkStackPage` for a child with [method@Gtk.Stack.get_page]
 * and you can obtain a `GtkSelectionModel` containing all the pages
 * with [method@Gtk.Stack.get_pages].
 * 
 * # GtkStack as GtkBuildable
 * 
 * To set child-specific properties in a .ui file, create `GtkStackPage`
 * objects explicitly, and set the child widget as a property on it:
 * 
 * ```xml
 *   <object class="GtkStack" id="stack">
 *     <child>
 *       <object class="GtkStackPage">
 *         <property name="name">page1</property>
 *         <property name="title">In the beginning…</property>
 *         <property name="child">
 *           <object class="GtkLabel">
 *             <property name="label">It was dark</property>
 *           </object>
 *         </property>
 *       </object>
 *     </child>
 * ```
 * 
 * # CSS nodes
 * 
 * `GtkStack` has a single CSS node named stack.
 * 
 * # Accessibility
 * 
 * `GtkStack` uses the %GTK_ACCESSIBLE_ROLE_TAB_PANEL for the stack
 * pages, which are the accessible parent objects of the child widgets.
 */
public class Stack extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Stack(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Stack */
    public static Stack castFrom(org.gtk.gobject.Object gobject) {
        return new Stack(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkStack`.
     */
    public Stack() {
        super(References.get(gtk_h.gtk_stack_new(), false));
    }
    
    /**
     * Adds a child to @stack.
     */
    public StackPage addChild(Widget child) {
        var RESULT = gtk_h.gtk_stack_add_child(handle(), child.handle());
        return new StackPage(References.get(RESULT, false));
    }
    
    /**
     * Adds a child to @stack.
     * 
     * The child is identified by the @name.
     */
    public StackPage addNamed(Widget child, java.lang.String name) {
        var RESULT = gtk_h.gtk_stack_add_named(handle(), child.handle(), Interop.allocateNativeString(name).handle());
        return new StackPage(References.get(RESULT, false));
    }
    
    /**
     * Adds a child to @stack.
     * 
     * The child is identified by the @name. The @title
     * will be used by `GtkStackSwitcher` to represent
     * @child in a tab bar, so it should be short.
     */
    public StackPage addTitled(Widget child, java.lang.String name, java.lang.String title) {
        var RESULT = gtk_h.gtk_stack_add_titled(handle(), child.handle(), Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(title).handle());
        return new StackPage(References.get(RESULT, false));
    }
    
    /**
     * Finds the child with the name given as the argument.
     * 
     * Returns %NULL if there is no child with this name.
     */
    public Widget getChildByName(java.lang.String name) {
        var RESULT = gtk_h.gtk_stack_get_child_by_name(handle(), Interop.allocateNativeString(name).handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets whether @stack is horizontally homogeneous.
     */
    public boolean getHhomogeneous() {
        var RESULT = gtk_h.gtk_stack_get_hhomogeneous(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the `GtkStack` is set up to interpolate between
     * the sizes of children on page switch.
     */
    public boolean getInterpolateSize() {
        var RESULT = gtk_h.gtk_stack_get_interpolate_size(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the `GtkStackPage` object for @child or NULL if @child isn't a `GtkStack` child.
     */
    public StackPage getPage(Widget child) {
        var RESULT = gtk_h.gtk_stack_get_page(handle(), child.handle());
        return new StackPage(References.get(RESULT, false));
    }
    
    /**
     * Returns a `GListModel` that contains the pages of the stack.
     * 
     * This can be used to keep an up-to-date view. The model also
     * implements [iface@Gtk.SelectionModel] and can be used to track
     * and modify the visible page.
     */
    public SelectionModel getPages() {
        var RESULT = gtk_h.gtk_stack_get_pages(handle());
        return new SelectionModel.SelectionModelImpl(References.get(RESULT, true));
    }
    
    /**
     * Returns the amount of time (in milliseconds) that
     * transitions between pages in @stack will take.
     */
    public int getTransitionDuration() {
        var RESULT = gtk_h.gtk_stack_get_transition_duration(handle());
        return RESULT;
    }
    
    /**
     * Returns whether the @stack is currently in a transition from one page to
     * another.
     */
    public boolean getTransitionRunning() {
        var RESULT = gtk_h.gtk_stack_get_transition_running(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the type of animation that will be used
     * for transitions between pages in @stack.
     */
    public StackTransitionType getTransitionType() {
        var RESULT = gtk_h.gtk_stack_get_transition_type(handle());
        return StackTransitionType.fromValue(RESULT);
    }
    
    /**
     * Gets whether @stack is vertically homogeneous.
     */
    public boolean getVhomogeneous() {
        var RESULT = gtk_h.gtk_stack_get_vhomogeneous(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the currently visible child of @stack.
     * 
     * Returns %NULL if there are no visible children.
     */
    public Widget getVisibleChild() {
        var RESULT = gtk_h.gtk_stack_get_visible_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns the name of the currently visible child of @stack.
     * 
     * Returns %NULL if there is no visible child.
     */
    public java.lang.String getVisibleChildName() {
        var RESULT = gtk_h.gtk_stack_get_visible_child_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Removes a child widget from @stack.
     */
    public void remove(Widget child) {
        gtk_h.gtk_stack_remove(handle(), child.handle());
    }
    
    /**
     * Sets the `GtkStack` to be horizontally homogeneous or not.
     * 
     * If it is homogeneous, the `GtkStack` will request the same
     * width for all its children. If it isn't, the stack
     * may change width when a different child becomes visible.
     */
    public void setHhomogeneous(boolean hhomogeneous) {
        gtk_h.gtk_stack_set_hhomogeneous(handle(), hhomogeneous ? 1 : 0);
    }
    
    /**
     * Sets whether or not @stack will interpolate its size when
     * changing the visible child.
     * 
     * If the [property@Gtk.Stack:interpolate-size] property is set
     * to %TRUE, @stack will interpolate its size between the current
     * one and the one it'll take after changing the visible child,
     * according to the set transition duration.
     */
    public void setInterpolateSize(boolean interpolateSize) {
        gtk_h.gtk_stack_set_interpolate_size(handle(), interpolateSize ? 1 : 0);
    }
    
    /**
     * Sets the duration that transitions between pages in @stack
     * will take.
     */
    public void setTransitionDuration(int duration) {
        gtk_h.gtk_stack_set_transition_duration(handle(), duration);
    }
    
    /**
     * Sets the type of animation that will be used for
     * transitions between pages in @stack.
     * 
     * Available types include various kinds of fades and slides.
     * 
     * The transition type can be changed without problems
     * at runtime, so it is possible to change the animation
     * based on the page that is about to become current.
     */
    public void setTransitionType(StackTransitionType transition) {
        gtk_h.gtk_stack_set_transition_type(handle(), transition.getValue());
    }
    
    /**
     * Sets the `GtkStack` to be vertically homogeneous or not.
     * 
     * If it is homogeneous, the `GtkStack` will request the same
     * height for all its children. If it isn't, the stack
     * may change height when a different child becomes visible.
     */
    public void setVhomogeneous(boolean vhomogeneous) {
        gtk_h.gtk_stack_set_vhomogeneous(handle(), vhomogeneous ? 1 : 0);
    }
    
    /**
     * Makes @child the visible child of @stack.
     * 
     * If @child is different from the currently visible child,
     * the transition between the two will be animated with the
     * current transition type of @stack.
     * 
     * Note that the @child widget has to be visible itself
     * (see [method@Gtk.Widget.show]) in order to become the visible
     * child of @stack.
     */
    public void setVisibleChild(Widget child) {
        gtk_h.gtk_stack_set_visible_child(handle(), child.handle());
    }
    
    /**
     * Makes the child with the given name visible.
     * 
     * Note that the child widget has to be visible itself
     * (see [method@Gtk.Widget.show]) in order to become the visible
     * child of @stack.
     */
    public void setVisibleChildFull(java.lang.String name, StackTransitionType transition) {
        gtk_h.gtk_stack_set_visible_child_full(handle(), Interop.allocateNativeString(name).handle(), transition.getValue());
    }
    
    /**
     * Makes the child with the given name visible.
     * 
     * If @child is different from the currently visible child,
     * the transition between the two will be animated with the
     * current transition type of @stack.
     * 
     * Note that the child widget has to be visible itself
     * (see [method@Gtk.Widget.show]) in order to become the visible
     * child of @stack.
     */
    public void setVisibleChildName(java.lang.String name) {
        gtk_h.gtk_stack_set_visible_child_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
}
