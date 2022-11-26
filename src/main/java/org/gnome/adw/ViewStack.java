package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * {@link ViewStackPage} and you
 * can obtain a {@code Gtk.SelectionModel} containing all the pages with
 * {@code ViewStack#getPages}.
 * <p>
 * <strong>AdwViewStack as GtkBuildable</strong><br/>
 * To set child-specific properties in a .ui file, create
 * {@link ViewStackPage} objects explicitly, and set the child widget as a
 * property on it:
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
 * <strong>CSS nodes</strong><br/>
 * {@code AdwViewStack} has a single CSS node named {@code stack}.
 * @version 1.0
 */
public class ViewStack extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwViewStack";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ViewStack proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ViewStack(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ViewStack if its GType is a (or inherits from) "AdwViewStack".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ViewStack} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwViewStack", a ClassCastException will be thrown.
     */
    public static ViewStack castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ViewStack.getType())) {
            return new ViewStack(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwViewStack");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwViewStack}.
     */
    public ViewStack() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Adds a child to {@code self}.
     * @param child the widget to add
     * @return the {@link ViewStackPage} for {@code child}
     */
    public @NotNull org.gnome.adw.ViewStackPage add(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_add.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.ViewStackPage(RESULT, Ownership.NONE);
    }
    
    /**
     * Adds a child to {@code self}.
     * <p>
     * The child is identified by the {@code name}.
     * @param child the widget to add
     * @param name the name for {@code child}
     * @return the {@code AdwViewStackPage} for {@code child}
     */
    public @NotNull org.gnome.adw.ViewStackPage addNamed(@NotNull org.gtk.gtk.Widget child, @Nullable java.lang.String name) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_add_named.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.ViewStackPage(RESULT, Ownership.NONE);
    }
    
    /**
     * Adds a child to {@code self}.
     * <p>
     * The child is identified by the {@code name}. The {@code title} will be used by
     * {@link ViewSwitcher} to represent {@code child}, so it should be short.
     * @param child the widget to add
     * @param name the name for {@code child}
     * @param title a human-readable title for {@code child}
     * @return the {@code AdwViewStackPage} for {@code child}
     */
    public @NotNull org.gnome.adw.ViewStackPage addTitled(@NotNull org.gtk.gtk.Widget child, @Nullable java.lang.String name, @NotNull java.lang.String title) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNull(title, "Parameter 'title' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_add_titled.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)),
                    Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.ViewStackPage(RESULT, Ownership.NONE);
    }
    
    /**
     * Adds a child to {@code self}.
     * <p>
     * The child is identified by the {@code name}. The {@code title} and {@code icon_name} will be used
     * by {@link ViewSwitcher} to represent {@code child}.
     * @param child the widget to add
     * @param name the name for {@code child}
     * @param title a human-readable title for {@code child}
     * @param iconName an icon name for {@code child}
     * @return the {@code AdwViewStackPage} for {@code child}
     */
    public @NotNull org.gnome.adw.ViewStackPage addTitledWithIcon(@NotNull org.gtk.gtk.Widget child, @Nullable java.lang.String name, @NotNull java.lang.String title, @NotNull java.lang.String iconName) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNull(title, "Parameter 'title' must not be null");
        java.util.Objects.requireNonNull(iconName, "Parameter 'iconName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_add_titled_with_icon.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)),
                    Interop.allocateNativeString(title),
                    Interop.allocateNativeString(iconName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.ViewStackPage(RESULT, Ownership.NONE);
    }
    
    /**
     * Finds the child with {@code name} in {@code self}.
     * @param name the name of the child to find
     * @return the requested child
     */
    public @Nullable org.gtk.gtk.Widget getChildByName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_get_child_by_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether {@code self} is horizontally homogeneous.
     * @return whether {@code self} is horizontally homogeneous
     */
    public boolean getHhomogeneous() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_view_stack_get_hhomogeneous.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the {@link ViewStackPage} object for {@code child}.
     * @param child a child of {@code self}
     * @return the page object for {@code child}
     */
    public @NotNull org.gnome.adw.ViewStackPage getPage(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_get_page.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.ViewStackPage(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns a {@code Gio.ListModel} that contains the pages of the stack.
     * <p>
     * This can be used to keep an up-to-date view. The model also implements
     * {@code Gtk.SelectionModel} and can be used to track and change the visible
     * page.
     * @return a {@code GtkSelectionModel} for the stack's children
     */
    public @NotNull org.gtk.gtk.SelectionModel getPages() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_get_pages.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.SelectionModel.SelectionModelImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets whether {@code self} is vertically homogeneous.
     * @return whether {@code self} is vertically homogeneous
     */
    public boolean getVhomogeneous() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_view_stack_get_vhomogeneous.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the currently visible child of {@code self}, .
     * @return the visible child
     */
    public @Nullable org.gtk.gtk.Widget getVisibleChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_get_visible_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the name of the currently visible child of {@code self}.
     * @return the name of the visible child
     */
    public @Nullable java.lang.String getVisibleChildName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_get_visible_child_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Removes a child widget from {@code self}.
     * @param child the child to remove
     */
    public void remove(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.adw_view_stack_remove.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code self} to be horizontally homogeneous or not.
     * <p>
     * If the stack is horizontally homogeneous, it allocates the same width for
     * all children.
     * <p>
     * If it's {@code FALSE}, the stack may change width when a different child becomes
     * visible.
     * @param hhomogeneous whether to make {@code self} horizontally homogeneous
     */
    public void setHhomogeneous(boolean hhomogeneous) {
        try {
            DowncallHandles.adw_view_stack_set_hhomogeneous.invokeExact(
                    handle(),
                    hhomogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code self} to be vertically homogeneous or not.
     * <p>
     * If the stack is vertically homogeneous, it allocates the same height for
     * all children.
     * <p>
     * If it's {@code FALSE}, the stack may change height when a different child becomes
     * visible.
     * @param vhomogeneous whether to make {@code self} vertically homogeneous
     */
    public void setVhomogeneous(boolean vhomogeneous) {
        try {
            DowncallHandles.adw_view_stack_set_vhomogeneous.invokeExact(
                    handle(),
                    vhomogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes {@code child} the visible child of {@code self}.
     * @param child a child of {@code self}
     */
    public void setVisibleChild(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.adw_view_stack_set_visible_child.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes the child with {@code name} visible.
     * <p>
     * See {@code ViewStack:visible-child}.
     * @param name the name of the child
     */
    public void setVisibleChildName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.adw_view_stack_set_visible_child_name.invokeExact(
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
            RESULT = (long) DowncallHandles.adw_view_stack_get_type.invokeExact();
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
         * A {@link ViewStack.Build} object constructs a {@link ViewStack} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ViewStack} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ViewStack} using {@link ViewStack#castFrom}.
         * @return A new instance of {@code ViewStack} with the properties 
         *         that were set in the Build object.
         */
        public ViewStack construct() {
            return ViewStack.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ViewStack.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Whether the stack is horizontally homogeneous.
         * <p>
         * If the stack is horizontally homogeneous, it allocates the same width for
         * all children.
         * <p>
         * If it's {@code FALSE}, the stack may change width when a different child becomes
         * visible.
         * @param hhomogeneous The value for the {@code hhomogeneous} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHhomogeneous(boolean hhomogeneous) {
            names.add("hhomogeneous");
            values.add(org.gtk.gobject.Value.create(hhomogeneous));
            return this;
        }
        
        /**
         * A selection model with the stack's pages.
         * <p>
         * This can be used to keep an up-to-date view. The model also implements
         * {@code Gtk.SelectionModel} and can be used to track and change the visible
         * page.
         * @param pages The value for the {@code pages} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPages(org.gtk.gtk.SelectionModel pages) {
            names.add("pages");
            values.add(org.gtk.gobject.Value.create(pages));
            return this;
        }
        
        /**
         * Whether the stack is vertically homogeneous.
         * <p>
         * If the stack is vertically homogeneous, it allocates the same height for
         * all children.
         * <p>
         * If it's {@code FALSE}, the stack may change height when a different child becomes
         * visible.
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
         * <p>
         * See {@code ViewStack:visible-child}.
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
        
        private static final MethodHandle adw_view_stack_new = Interop.downcallHandle(
            "adw_view_stack_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_add = Interop.downcallHandle(
            "adw_view_stack_add",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_add_named = Interop.downcallHandle(
            "adw_view_stack_add_named",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_add_titled = Interop.downcallHandle(
            "adw_view_stack_add_titled",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_add_titled_with_icon = Interop.downcallHandle(
            "adw_view_stack_add_titled_with_icon",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_get_child_by_name = Interop.downcallHandle(
            "adw_view_stack_get_child_by_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_get_hhomogeneous = Interop.downcallHandle(
            "adw_view_stack_get_hhomogeneous",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_get_page = Interop.downcallHandle(
            "adw_view_stack_get_page",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_get_pages = Interop.downcallHandle(
            "adw_view_stack_get_pages",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_get_vhomogeneous = Interop.downcallHandle(
            "adw_view_stack_get_vhomogeneous",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_get_visible_child = Interop.downcallHandle(
            "adw_view_stack_get_visible_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_get_visible_child_name = Interop.downcallHandle(
            "adw_view_stack_get_visible_child_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_remove = Interop.downcallHandle(
            "adw_view_stack_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_set_hhomogeneous = Interop.downcallHandle(
            "adw_view_stack_set_hhomogeneous",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_view_stack_set_vhomogeneous = Interop.downcallHandle(
            "adw_view_stack_set_vhomogeneous",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_view_stack_set_visible_child = Interop.downcallHandle(
            "adw_view_stack_set_visible_child",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_set_visible_child_name = Interop.downcallHandle(
            "adw_view_stack_set_visible_child_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_get_type = Interop.downcallHandle(
            "adw_view_stack_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
