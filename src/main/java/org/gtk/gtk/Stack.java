package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkStack} is a container which only shows one of its children
 * at a time.
 * <p>
 * In contrast to {@code GtkNotebook}, {@code GtkStack} does not provide a means
 * for users to change the visible child. Instead, a separate widget
 * such as {@code Gtk.StackSidebar} can
 * be used with {@code GtkStack} to provide this functionality.
 * <p>
 * Transitions between pages can be animated as slides or fades. This
 * can be controlled with {@link Stack#setTransitionType}.
 * These animations respect the {@code Gtk.Settings:gtk-enable-animations}
 * setting.
 * <p>
 * {@code GtkStack} maintains a {@link StackPage} object for each added
 * child, which holds additional per-child properties. You
 * obtain the {@code GtkStackPage} for a child with {@link Stack#getPage}
 * and you can obtain a {@code GtkSelectionModel} containing all the pages
 * with {@link Stack#getPages}.
 * 
 * <h1>GtkStack as GtkBuildable</h1>
 * To set child-specific properties in a .ui file, create {@code GtkStackPage}
 * objects explicitly, and set the child widget as a property on it:
 * 
 * <pre>{@code xml
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
 * }</pre>
 * 
 * <h1>CSS nodes</h1>
 * {@code GtkStack} has a single CSS node named stack.
 * 
 * <h1>Accessibility</h1>
 * {@code GtkStack} uses the {@link AccessibleRole#TAB_PANEL} for the stack
 * pages, which are the accessible parent objects of the child widgets.
 */
public class Stack extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Stack(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Stack */
    public static Stack castFrom(org.gtk.gobject.Object gobject) {
        return new Stack(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_stack_new = Interop.downcallHandle(
        "gtk_stack_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_stack_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkStack}.
     */
    public Stack() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_stack_add_child = Interop.downcallHandle(
        "gtk_stack_add_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a child to {@code stack}.
     */
    public @NotNull StackPage addChild(@NotNull Widget child) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_stack_add_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new StackPage(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_stack_add_named = Interop.downcallHandle(
        "gtk_stack_add_named",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a child to {@code stack}.
     * <p>
     * The child is identified by the {@code name}.
     */
    public @NotNull StackPage addNamed(@NotNull Widget child, @Nullable java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_stack_add_named.invokeExact(handle(), child.handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new StackPage(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_stack_add_titled = Interop.downcallHandle(
        "gtk_stack_add_titled",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a child to {@code stack}.
     * <p>
     * The child is identified by the {@code name}. The {@code title}
     * will be used by {@code GtkStackSwitcher} to represent
     * {@code child} in a tab bar, so it should be short.
     */
    public @NotNull StackPage addTitled(@NotNull Widget child, @Nullable java.lang.String name, @NotNull java.lang.String title) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_stack_add_titled.invokeExact(handle(), child.handle(), Interop.allocateNativeString(name), Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new StackPage(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_stack_get_child_by_name = Interop.downcallHandle(
        "gtk_stack_get_child_by_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the child with the name given as the argument.
     * <p>
     * Returns {@code null} if there is no child with this name.
     */
    public @Nullable Widget getChildByName(@NotNull java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_stack_get_child_by_name.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_stack_get_hhomogeneous = Interop.downcallHandle(
        "gtk_stack_get_hhomogeneous",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code stack} is horizontally homogeneous.
     */
    public boolean getHhomogeneous() {
        int RESULT;
        try {
            RESULT = (int) gtk_stack_get_hhomogeneous.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_stack_get_interpolate_size = Interop.downcallHandle(
        "gtk_stack_get_interpolate_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the {@code GtkStack} is set up to interpolate between
     * the sizes of children on page switch.
     */
    public boolean getInterpolateSize() {
        int RESULT;
        try {
            RESULT = (int) gtk_stack_get_interpolate_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_stack_get_page = Interop.downcallHandle(
        "gtk_stack_get_page",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the stack page for the given {@code child}.
     * <p>
     * If the given {@code child} is not a child widget of the stack, this function will return {@code NULL}.
     */
    public @Nullable StackPage getPage(@NotNull Widget child) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_stack_get_page.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new StackPage(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_stack_get_pages = Interop.downcallHandle(
        "gtk_stack_get_pages",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a {@code GListModel} that contains the pages of the stack.
     * <p>
     * This can be used to keep an up-to-date view. The model also
     * implements {@code Gtk.SelectionModel} and can be used to track
     * and modify the visible page.
     */
    public @NotNull SelectionModel getPages() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_stack_get_pages.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SelectionModel.SelectionModelImpl(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_stack_get_transition_duration = Interop.downcallHandle(
        "gtk_stack_get_transition_duration",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the amount of time (in milliseconds) that
     * transitions between pages in {@code stack} will take.
     */
    public int getTransitionDuration() {
        int RESULT;
        try {
            RESULT = (int) gtk_stack_get_transition_duration.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_stack_get_transition_running = Interop.downcallHandle(
        "gtk_stack_get_transition_running",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the {@code stack} is currently in a transition from one page to
     * another.
     */
    public boolean getTransitionRunning() {
        int RESULT;
        try {
            RESULT = (int) gtk_stack_get_transition_running.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_stack_get_transition_type = Interop.downcallHandle(
        "gtk_stack_get_transition_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the type of animation that will be used
     * for transitions between pages in {@code stack}.
     */
    public @NotNull StackTransitionType getTransitionType() {
        int RESULT;
        try {
            RESULT = (int) gtk_stack_get_transition_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new StackTransitionType(RESULT);
    }
    
    private static final MethodHandle gtk_stack_get_vhomogeneous = Interop.downcallHandle(
        "gtk_stack_get_vhomogeneous",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code stack} is vertically homogeneous.
     */
    public boolean getVhomogeneous() {
        int RESULT;
        try {
            RESULT = (int) gtk_stack_get_vhomogeneous.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_stack_get_visible_child = Interop.downcallHandle(
        "gtk_stack_get_visible_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the currently visible child of {@code stack}.
     * <p>
     * Returns {@code null} if there are no visible children.
     */
    public @Nullable Widget getVisibleChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_stack_get_visible_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_stack_get_visible_child_name = Interop.downcallHandle(
        "gtk_stack_get_visible_child_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the name of the currently visible child of {@code stack}.
     * <p>
     * Returns {@code null} if there is no visible child.
     */
    public @Nullable java.lang.String getVisibleChildName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_stack_get_visible_child_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_stack_remove = Interop.downcallHandle(
        "gtk_stack_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a child widget from {@code stack}.
     */
    public @NotNull void remove(@NotNull Widget child) {
        try {
            gtk_stack_remove.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_stack_set_hhomogeneous = Interop.downcallHandle(
        "gtk_stack_set_hhomogeneous",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@code GtkStack} to be horizontally homogeneous or not.
     * <p>
     * If it is homogeneous, the {@code GtkStack} will request the same
     * width for all its children. If it isn't, the stack
     * may change width when a different child becomes visible.
     */
    public @NotNull void setHhomogeneous(@NotNull boolean hhomogeneous) {
        try {
            gtk_stack_set_hhomogeneous.invokeExact(handle(), hhomogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_stack_set_interpolate_size = Interop.downcallHandle(
        "gtk_stack_set_interpolate_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether or not {@code stack} will interpolate its size when
     * changing the visible child.
     * <p>
     * If the {@code Gtk.Stack:interpolate-size} property is set
     * to {@code true}, {@code stack} will interpolate its size between the current
     * one and the one it'll take after changing the visible child,
     * according to the set transition duration.
     */
    public @NotNull void setInterpolateSize(@NotNull boolean interpolateSize) {
        try {
            gtk_stack_set_interpolate_size.invokeExact(handle(), interpolateSize ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_stack_set_transition_duration = Interop.downcallHandle(
        "gtk_stack_set_transition_duration",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the duration that transitions between pages in {@code stack}
     * will take.
     */
    public @NotNull void setTransitionDuration(@NotNull int duration) {
        try {
            gtk_stack_set_transition_duration.invokeExact(handle(), duration);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_stack_set_transition_type = Interop.downcallHandle(
        "gtk_stack_set_transition_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the type of animation that will be used for
     * transitions between pages in {@code stack}.
     * <p>
     * Available types include various kinds of fades and slides.
     * <p>
     * The transition type can be changed without problems
     * at runtime, so it is possible to change the animation
     * based on the page that is about to become current.
     */
    public @NotNull void setTransitionType(@NotNull StackTransitionType transition) {
        try {
            gtk_stack_set_transition_type.invokeExact(handle(), transition.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_stack_set_vhomogeneous = Interop.downcallHandle(
        "gtk_stack_set_vhomogeneous",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@code GtkStack} to be vertically homogeneous or not.
     * <p>
     * If it is homogeneous, the {@code GtkStack} will request the same
     * height for all its children. If it isn't, the stack
     * may change height when a different child becomes visible.
     */
    public @NotNull void setVhomogeneous(@NotNull boolean vhomogeneous) {
        try {
            gtk_stack_set_vhomogeneous.invokeExact(handle(), vhomogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_stack_set_visible_child = Interop.downcallHandle(
        "gtk_stack_set_visible_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes {@code child} the visible child of {@code stack}.
     * <p>
     * If {@code child} is different from the currently visible child,
     * the transition between the two will be animated with the
     * current transition type of {@code stack}.
     * <p>
     * Note that the {@code child} widget has to be visible itself
     * (see {@link Widget#show}) in order to become the visible
     * child of {@code stack}.
     */
    public @NotNull void setVisibleChild(@NotNull Widget child) {
        try {
            gtk_stack_set_visible_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_stack_set_visible_child_full = Interop.downcallHandle(
        "gtk_stack_set_visible_child_full",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Makes the child with the given name visible.
     * <p>
     * Note that the child widget has to be visible itself
     * (see {@link Widget#show}) in order to become the visible
     * child of {@code stack}.
     */
    public @NotNull void setVisibleChildFull(@NotNull java.lang.String name, @NotNull StackTransitionType transition) {
        try {
            gtk_stack_set_visible_child_full.invokeExact(handle(), Interop.allocateNativeString(name), transition.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_stack_set_visible_child_name = Interop.downcallHandle(
        "gtk_stack_set_visible_child_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes the child with the given name visible.
     * <p>
     * If {@code child} is different from the currently visible child,
     * the transition between the two will be animated with the
     * current transition type of {@code stack}.
     * <p>
     * Note that the child widget has to be visible itself
     * (see {@link Widget#show}) in order to become the visible
     * child of {@code stack}.
     */
    public @NotNull void setVisibleChildName(@NotNull java.lang.String name) {
        try {
            gtk_stack_set_visible_child_name.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
