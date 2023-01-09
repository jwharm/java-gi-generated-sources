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
     * @param address   The memory address of the native object
     */
    protected Stack(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Stack> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Stack(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Adds a child to {@code stack}.
     * @param child the widget to add
     * @return the {@code GtkStackPage} for {@code child}
     */
    public org.gtk.gtk.StackPage addChild(org.gtk.gtk.Widget child) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_stack_add_child.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.StackPage) Interop.register(RESULT, org.gtk.gtk.StackPage.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Adds a child to {@code stack}.
     * <p>
     * The child is identified by the {@code name}.
     * @param child the widget to add
     * @param name the name for {@code child}
     * @return the {@code GtkStackPage} for {@code child}
     */
    public org.gtk.gtk.StackPage addNamed(org.gtk.gtk.Widget child, @Nullable java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_stack_add_named.invokeExact(
                        handle(),
                        child.handle(),
                        (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return (org.gtk.gtk.StackPage) Interop.register(RESULT, org.gtk.gtk.StackPage.fromAddress).marshal(RESULT, null);
        }
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
    public org.gtk.gtk.StackPage addTitled(org.gtk.gtk.Widget child, @Nullable java.lang.String name, java.lang.String title) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_stack_add_titled.invokeExact(
                        handle(),
                        child.handle(),
                        (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)),
                        Marshal.stringToAddress.marshal(title, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return (org.gtk.gtk.StackPage) Interop.register(RESULT, org.gtk.gtk.StackPage.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Finds the child with the name given as the argument.
     * <p>
     * Returns {@code null} if there is no child with this name.
     * @param name the name of the child to find
     * @return the requested child
     *   of the {@code GtkStack}
     */
    public @Nullable org.gtk.gtk.Widget getChildByName(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_stack_get_child_by_name.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Gets whether {@code stack} is horizontally homogeneous.
     * @return whether {@code stack} is horizontally homogeneous.
     */
    public boolean getHhomogeneous() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_stack_get_hhomogeneous.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether the {@code GtkStack} is set up to interpolate between
     * the sizes of children on page switch.
     * @return {@code true} if child sizes are interpolated
     */
    public boolean getInterpolateSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_stack_get_interpolate_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the {@code GtkStackPage} object for {@code child}.
     * @param child a child of {@code stack}
     * @return the {@code GtkStackPage} for {@code child}
     */
    public org.gtk.gtk.StackPage getPage(org.gtk.gtk.Widget child) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_stack_get_page.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.StackPage) Interop.register(RESULT, org.gtk.gtk.StackPage.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns a {@code GListModel} that contains the pages of the stack.
     * <p>
     * This can be used to keep an up-to-date view. The model also
     * implements {@code Gtk.SelectionModel} and can be used to track
     * and modify the visible page.
     * @return a {@code GtkSelectionModel} for the stack's children
     */
    public org.gtk.gtk.SelectionModel getPages() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_stack_get_pages.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gtk.SelectionModel) Interop.register(RESULT, org.gtk.gtk.SelectionModel.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Returns the amount of time (in milliseconds) that
     * transitions between pages in {@code stack} will take.
     * @return the transition duration
     */
    public int getTransitionDuration() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_stack_get_transition_duration.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gtk_stack_get_transition_running.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the type of animation that will be used
     * for transitions between pages in {@code stack}.
     * @return the current transition type of {@code stack}
     */
    public org.gtk.gtk.StackTransitionType getTransitionType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_stack_get_transition_type.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gtk_stack_get_vhomogeneous.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_stack_get_visible_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_stack_get_visible_child_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Removes a child widget from {@code stack}.
     * @param child the child to remove
     */
    public void remove(org.gtk.gtk.Widget child) {
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
                    Marshal.booleanToInteger.marshal(hhomogeneous, null).intValue());
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
                    Marshal.booleanToInteger.marshal(interpolateSize, null).intValue());
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
    public void setTransitionType(org.gtk.gtk.StackTransitionType transition) {
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
                    Marshal.booleanToInteger.marshal(vhomogeneous, null).intValue());
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
    public void setVisibleChild(org.gtk.gtk.Widget child) {
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
    public void setVisibleChildFull(java.lang.String name, org.gtk.gtk.StackTransitionType transition) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_stack_set_visible_child_full.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        transition.getValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public void setVisibleChildName(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_stack_set_visible_child_name.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_stack_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Stack.Builder} object constructs a {@link Stack} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Stack.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Stack} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Stack}.
         * @return A new instance of {@code Stack} with the properties 
         *         that were set in the Builder object.
         */
        public Stack build() {
            return (Stack) org.gtk.gobject.GObject.newWithProperties(
                Stack.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * {@code true} if the stack allocates the same width for all children.
         * @param hhomogeneous The value for the {@code hhomogeneous} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHhomogeneous(boolean hhomogeneous) {
            names.add("hhomogeneous");
            values.add(org.gtk.gobject.Value.create(hhomogeneous));
            return this;
        }
        
        /**
         * Whether or not the size should smoothly change during the transition.
         * @param interpolateSize The value for the {@code interpolate-size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInterpolateSize(boolean interpolateSize) {
            names.add("interpolate-size");
            values.add(org.gtk.gobject.Value.create(interpolateSize));
            return this;
        }
        
        /**
         * A selection model with the stack pages.
         * @param pages The value for the {@code pages} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPages(org.gtk.gtk.SelectionModel pages) {
            names.add("pages");
            values.add(org.gtk.gobject.Value.create(pages));
            return this;
        }
        
        /**
         * The animation duration, in milliseconds.
         * @param transitionDuration The value for the {@code transition-duration} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTransitionDuration(int transitionDuration) {
            names.add("transition-duration");
            values.add(org.gtk.gobject.Value.create(transitionDuration));
            return this;
        }
        
        /**
         * Whether or not the transition is currently running.
         * @param transitionRunning The value for the {@code transition-running} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTransitionRunning(boolean transitionRunning) {
            names.add("transition-running");
            values.add(org.gtk.gobject.Value.create(transitionRunning));
            return this;
        }
        
        /**
         * The type of animation used to transition.
         * @param transitionType The value for the {@code transition-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTransitionType(org.gtk.gtk.StackTransitionType transitionType) {
            names.add("transition-type");
            values.add(org.gtk.gobject.Value.create(transitionType));
            return this;
        }
        
        /**
         * {@code true} if the stack allocates the same height for all children.
         * @param vhomogeneous The value for the {@code vhomogeneous} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVhomogeneous(boolean vhomogeneous) {
            names.add("vhomogeneous");
            values.add(org.gtk.gobject.Value.create(vhomogeneous));
            return this;
        }
        
        /**
         * The widget currently visible in the stack.
         * @param visibleChild The value for the {@code visible-child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVisibleChild(org.gtk.gtk.Widget visibleChild) {
            names.add("visible-child");
            values.add(org.gtk.gobject.Value.create(visibleChild));
            return this;
        }
        
        /**
         * The name of the widget currently visible in the stack.
         * @param visibleChildName The value for the {@code visible-child-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVisibleChildName(java.lang.String visibleChildName) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_stack_get_type != null;
    }
}
