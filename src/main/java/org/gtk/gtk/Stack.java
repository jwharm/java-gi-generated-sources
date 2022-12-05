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
 * such as {@link StackSwitcher} can
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
 * <p>
 * <strong>GtkStack as GtkBuildable</strong><br/>
 * To set child-specific properties in a .ui file, create {@code GtkStackPage}
 * objects explicitly, and set the child widget as a property on it:
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
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkStack} has a single CSS node named stack.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkStack} uses the {@link AccessibleRole#TAB_PANEL} for the stack
 * pages, which are the accessible parent objects of the child widgets.
 */
public class Stack extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkStack";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Stack proxy instance for the provided memory address.
     * <p>
     * Because Stack is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Stack(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to Stack if its GType is a (or inherits from) "GtkStack".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Stack} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkStack", a ClassCastException will be thrown.
     */
    public static Stack castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Stack.getType())) {
            return new Stack(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkStack");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_stack_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkStack}.
     */
    public Stack() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Adds a child to {@code stack}.
     * @param child the widget to add
     * @return the {@code GtkStackPage} for {@code child}
     */
    public @NotNull org.gtk.gtk.StackPage addChild(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_stack_add_child.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.StackPage(RESULT, Ownership.NONE);
    }
    
    /**
     * Adds a child to {@code stack}.
     * <p>
     * The child is identified by the {@code name}.
     * @param child the widget to add
     * @param name the name for {@code child}
     * @return the {@code GtkStackPage} for {@code child}
     */
    public @NotNull org.gtk.gtk.StackPage addNamed(@NotNull org.gtk.gtk.Widget child, @Nullable java.lang.String name) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_stack_add_named.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.StackPage(RESULT, Ownership.NONE);
    }
    
    /**
     * Adds a child to {@code stack}.
     * <p>
     * The child is identified by the {@code name}. The {@code title}
     * will be used by {@code GtkStackSwitcher} to represent
     * {@code child} in a tab bar, so it should be short.
     * @param child the widget to add
     * @param name the name for {@code child}
     * @param title a human-readable title for {@code child}
     * @return the {@code GtkStackPage} for {@code child}
     */
    public @NotNull org.gtk.gtk.StackPage addTitled(@NotNull org.gtk.gtk.Widget child, @Nullable java.lang.String name, @NotNull java.lang.String title) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNull(title, "Parameter 'title' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_stack_add_titled.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)),
                    Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.StackPage(RESULT, Ownership.NONE);
    }
    
    /**
     * Finds the child with the name given as the argument.
     * <p>
     * Returns {@code null} if there is no child with this name.
     * @param name the name of the child to find
     * @return the requested child
     *   of the {@code GtkStack}
     */
    public @Nullable org.gtk.gtk.Widget getChildByName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_stack_get_child_by_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether {@code stack} is horizontally homogeneous.
     * @return whether {@code stack} is horizontally homogeneous.
     */
    public boolean getHhomogeneous() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_stack_get_hhomogeneous.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the {@code GtkStack} is set up to interpolate between
     * the sizes of children on page switch.
     * @return {@code true} if child sizes are interpolated
     */
    public boolean getInterpolateSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_stack_get_interpolate_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the {@code GtkStackPage} object for {@code child}.
     * @param child a child of {@code stack}
     * @return the {@code GtkStackPage} for {@code child}
     */
    public @NotNull org.gtk.gtk.StackPage getPage(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_stack_get_page.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.StackPage(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns a {@code GListModel} that contains the pages of the stack.
     * <p>
     * This can be used to keep an up-to-date view. The model also
     * implements {@code Gtk.SelectionModel} and can be used to track
     * and modify the visible page.
     * @return a {@code GtkSelectionModel} for the stack's children
     */
    public @NotNull org.gtk.gtk.SelectionModel getPages() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_stack_get_pages.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.SelectionModel.SelectionModelImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the amount of time (in milliseconds) that
     * transitions between pages in {@code stack} will take.
     * @return the transition duration
     */
    public int getTransitionDuration() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_stack_get_transition_duration.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns whether the {@code stack} is currently in a transition from one page to
     * another.
     * @return {@code true} if the transition is currently running, {@code false} otherwise.
     */
    public boolean getTransitionRunning() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_stack_get_transition_running.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the type of animation that will be used
     * for transitions between pages in {@code stack}.
     * @return the current transition type of {@code stack}
     */
    public @NotNull org.gtk.gtk.StackTransitionType getTransitionType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_stack_get_transition_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.StackTransitionType.of(RESULT);
    }
    
    /**
     * Gets whether {@code stack} is vertically homogeneous.
     * @return whether {@code stack} is vertically homogeneous.
     */
    public boolean getVhomogeneous() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_stack_get_vhomogeneous.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the currently visible child of {@code stack}.
     * <p>
     * Returns {@code null} if there are no visible children.
     * @return the visible child of the {@code GtkStack}
     */
    public @Nullable org.gtk.gtk.Widget getVisibleChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_stack_get_visible_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the name of the currently visible child of {@code stack}.
     * <p>
     * Returns {@code null} if there is no visible child.
     * @return the name of the visible child
     *   of the {@code GtkStack}
     */
    public @Nullable java.lang.String getVisibleChildName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_stack_get_visible_child_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Removes a child widget from {@code stack}.
     * @param child the child to remove
     */
    public void remove(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_stack_remove.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkStack} to be horizontally homogeneous or not.
     * <p>
     * If it is homogeneous, the {@code GtkStack} will request the same
     * width for all its children. If it isn't, the stack
     * may change width when a different child becomes visible.
     * @param hhomogeneous {@code true} to make {@code stack} horizontally homogeneous
     */
    public void setHhomogeneous(boolean hhomogeneous) {
        try {
            DowncallHandles.gtk_stack_set_hhomogeneous.invokeExact(
                    handle(),
                    hhomogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether or not {@code stack} will interpolate its size when
     * changing the visible child.
     * <p>
     * If the {@code Gtk.Stack:interpolate-size} property is set
     * to {@code true}, {@code stack} will interpolate its size between the current
     * one and the one it'll take after changing the visible child,
     * according to the set transition duration.
     * @param interpolateSize the new value
     */
    public void setInterpolateSize(boolean interpolateSize) {
        try {
            DowncallHandles.gtk_stack_set_interpolate_size.invokeExact(
                    handle(),
                    interpolateSize ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the duration that transitions between pages in {@code stack}
     * will take.
     * @param duration the new duration, in milliseconds
     */
    public void setTransitionDuration(int duration) {
        try {
            DowncallHandles.gtk_stack_set_transition_duration.invokeExact(
                    handle(),
                    duration);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the type of animation that will be used for
     * transitions between pages in {@code stack}.
     * <p>
     * Available types include various kinds of fades and slides.
     * <p>
     * The transition type can be changed without problems
     * at runtime, so it is possible to change the animation
     * based on the page that is about to become current.
     * @param transition the new transition type
     */
    public void setTransitionType(@NotNull org.gtk.gtk.StackTransitionType transition) {
        java.util.Objects.requireNonNull(transition, "Parameter 'transition' must not be null");
        try {
            DowncallHandles.gtk_stack_set_transition_type.invokeExact(
                    handle(),
                    transition.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkStack} to be vertically homogeneous or not.
     * <p>
     * If it is homogeneous, the {@code GtkStack} will request the same
     * height for all its children. If it isn't, the stack
     * may change height when a different child becomes visible.
     * @param vhomogeneous {@code true} to make {@code stack} vertically homogeneous
     */
    public void setVhomogeneous(boolean vhomogeneous) {
        try {
            DowncallHandles.gtk_stack_set_vhomogeneous.invokeExact(
                    handle(),
                    vhomogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param child a child of {@code stack}
     */
    public void setVisibleChild(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_stack_set_visible_child.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes the child with the given name visible.
     * <p>
     * Note that the child widget has to be visible itself
     * (see {@link Widget#show}) in order to become the visible
     * child of {@code stack}.
     * @param name the name of the child to make visible
     * @param transition the transition type to use
     */
    public void setVisibleChildFull(@NotNull java.lang.String name, @NotNull org.gtk.gtk.StackTransitionType transition) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(transition, "Parameter 'transition' must not be null");
        try {
            DowncallHandles.gtk_stack_set_visible_child_full.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    transition.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param name the name of the child to make visible
     */
    public void setVisibleChildName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gtk_stack_set_visible_child_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_stack_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link Stack.Build} object constructs a {@link Stack} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Stack} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Stack} using {@link Stack#castFrom}.
         * @return A new instance of {@code Stack} with the properties 
         *         that were set in the Build object.
         */
        public Stack construct() {
            return Stack.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Stack.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * {@code true} if the stack allocates the same width for all children.
         * @param hhomogeneous The value for the {@code hhomogeneous} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHhomogeneous(boolean hhomogeneous) {
            names.add("hhomogeneous");
            values.add(org.gtk.gobject.Value.create(hhomogeneous));
            return this;
        }
        
        /**
         * Whether or not the size should smoothly change during the transition.
         * @param interpolateSize The value for the {@code interpolate-size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInterpolateSize(boolean interpolateSize) {
            names.add("interpolate-size");
            values.add(org.gtk.gobject.Value.create(interpolateSize));
            return this;
        }
        
        /**
         * A selection model with the stack pages.
         * @param pages The value for the {@code pages} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPages(org.gtk.gtk.SelectionModel pages) {
            names.add("pages");
            values.add(org.gtk.gobject.Value.create(pages));
            return this;
        }
        
        /**
         * The animation duration, in milliseconds.
         * @param transitionDuration The value for the {@code transition-duration} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTransitionDuration(int transitionDuration) {
            names.add("transition-duration");
            values.add(org.gtk.gobject.Value.create(transitionDuration));
            return this;
        }
        
        /**
         * Whether or not the transition is currently running.
         * @param transitionRunning The value for the {@code transition-running} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTransitionRunning(boolean transitionRunning) {
            names.add("transition-running");
            values.add(org.gtk.gobject.Value.create(transitionRunning));
            return this;
        }
        
        /**
         * The type of animation used to transition.
         * @param transitionType The value for the {@code transition-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTransitionType(org.gtk.gtk.StackTransitionType transitionType) {
            names.add("transition-type");
            values.add(org.gtk.gobject.Value.create(transitionType));
            return this;
        }
        
        /**
         * {@code true} if the stack allocates the same height for all children.
         * @param vhomogeneous The value for the {@code vhomogeneous} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setVhomogeneous(boolean vhomogeneous) {
            names.add("vhomogeneous");
            values.add(org.gtk.gobject.Value.create(vhomogeneous));
            return this;
        }
        
        /**
         * The widget currently visible in the stack.
         * @param visibleChild The value for the {@code visible-child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setVisibleChild(org.gtk.gtk.Widget visibleChild) {
            names.add("visible-child");
            values.add(org.gtk.gobject.Value.create(visibleChild));
            return this;
        }
        
        /**
         * The name of the widget currently visible in the stack.
         * @param visibleChildName The value for the {@code visible-child-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setVisibleChildName(java.lang.String visibleChildName) {
            names.add("visible-child-name");
            values.add(org.gtk.gobject.Value.create(visibleChildName));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_stack_new = Interop.downcallHandle(
            "gtk_stack_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_stack_add_child = Interop.downcallHandle(
            "gtk_stack_add_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_stack_add_named = Interop.downcallHandle(
            "gtk_stack_add_named",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_stack_add_titled = Interop.downcallHandle(
            "gtk_stack_add_titled",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_stack_get_child_by_name = Interop.downcallHandle(
            "gtk_stack_get_child_by_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_stack_get_hhomogeneous = Interop.downcallHandle(
            "gtk_stack_get_hhomogeneous",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_stack_get_interpolate_size = Interop.downcallHandle(
            "gtk_stack_get_interpolate_size",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_stack_get_page = Interop.downcallHandle(
            "gtk_stack_get_page",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_stack_get_pages = Interop.downcallHandle(
            "gtk_stack_get_pages",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_stack_get_transition_duration = Interop.downcallHandle(
            "gtk_stack_get_transition_duration",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_stack_get_transition_running = Interop.downcallHandle(
            "gtk_stack_get_transition_running",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_stack_get_transition_type = Interop.downcallHandle(
            "gtk_stack_get_transition_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_stack_get_vhomogeneous = Interop.downcallHandle(
            "gtk_stack_get_vhomogeneous",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_stack_get_visible_child = Interop.downcallHandle(
            "gtk_stack_get_visible_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_stack_get_visible_child_name = Interop.downcallHandle(
            "gtk_stack_get_visible_child_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_stack_remove = Interop.downcallHandle(
            "gtk_stack_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_stack_set_hhomogeneous = Interop.downcallHandle(
            "gtk_stack_set_hhomogeneous",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_stack_set_interpolate_size = Interop.downcallHandle(
            "gtk_stack_set_interpolate_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_stack_set_transition_duration = Interop.downcallHandle(
            "gtk_stack_set_transition_duration",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_stack_set_transition_type = Interop.downcallHandle(
            "gtk_stack_set_transition_type",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_stack_set_vhomogeneous = Interop.downcallHandle(
            "gtk_stack_set_vhomogeneous",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_stack_set_visible_child = Interop.downcallHandle(
            "gtk_stack_set_visible_child",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_stack_set_visible_child_full = Interop.downcallHandle(
            "gtk_stack_set_visible_child_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_stack_set_visible_child_name = Interop.downcallHandle(
            "gtk_stack_set_visible_child_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_stack_get_type = Interop.downcallHandle(
            "gtk_stack_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
