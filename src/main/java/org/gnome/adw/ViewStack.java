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
     * <p>
     * Because ViewStack is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ViewStack(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ViewStack> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ViewStack(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
    public org.gnome.adw.ViewStackPage add(org.gtk.gtk.Widget child) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_add.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gnome.adw.ViewStackPage) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gnome.adw.ViewStackPage.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Adds a child to {@code self}.
     * <p>
     * The child is identified by the {@code name}.
     * @param child the widget to add
     * @param name the name for {@code child}
     * @return the {@code AdwViewStackPage} for {@code child}
     */
    public org.gnome.adw.ViewStackPage addNamed(org.gtk.gtk.Widget child, @Nullable java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_add_named.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gnome.adw.ViewStackPage) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gnome.adw.ViewStackPage.fromAddress).marshal(RESULT, Ownership.NONE);
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
    public org.gnome.adw.ViewStackPage addTitled(org.gtk.gtk.Widget child, @Nullable java.lang.String name, java.lang.String title) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_add_titled.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)),
                    Marshal.stringToAddress.marshal(title, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gnome.adw.ViewStackPage) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gnome.adw.ViewStackPage.fromAddress).marshal(RESULT, Ownership.NONE);
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
    public org.gnome.adw.ViewStackPage addTitledWithIcon(org.gtk.gtk.Widget child, @Nullable java.lang.String name, java.lang.String title, java.lang.String iconName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_add_titled_with_icon.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)),
                    Marshal.stringToAddress.marshal(title, null),
                    Marshal.stringToAddress.marshal(iconName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gnome.adw.ViewStackPage) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gnome.adw.ViewStackPage.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Finds the child with {@code name} in {@code self}.
     * @param name the name of the child to find
     * @return the requested child
     */
    public @Nullable org.gtk.gtk.Widget getChildByName(java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_get_child_by_name.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the {@link ViewStackPage} object for {@code child}.
     * @param child a child of {@code self}
     * @return the page object for {@code child}
     */
    public org.gnome.adw.ViewStackPage getPage(org.gtk.gtk.Widget child) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_get_page.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gnome.adw.ViewStackPage) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gnome.adw.ViewStackPage.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns a {@code Gio.ListModel} that contains the pages of the stack.
     * <p>
     * This can be used to keep an up-to-date view. The model also implements
     * {@code Gtk.SelectionModel} and can be used to track and change the visible
     * page.
     * @return a {@code GtkSelectionModel} for the stack's children
     */
    public org.gtk.gtk.SelectionModel getPages() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_get_pages.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.SelectionModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.SelectionModel.fromAddress).marshal(RESULT, Ownership.FULL);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
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
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Removes a child widget from {@code self}.
     * @param child the child to remove
     */
    public void remove(org.gtk.gtk.Widget child) {
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
                    Marshal.booleanToInteger.marshal(hhomogeneous, null).intValue());
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
                    Marshal.booleanToInteger.marshal(vhomogeneous, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes {@code child} the visible child of {@code self}.
     * @param child a child of {@code self}
     */
    public void setVisibleChild(org.gtk.gtk.Widget child) {
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
    public void setVisibleChildName(java.lang.String name) {
        try {
            DowncallHandles.adw_view_stack_set_visible_child_name.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_view_stack_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ViewStack.Builder} object constructs a {@link ViewStack} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ViewStack.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ViewStack} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ViewStack}.
         * @return A new instance of {@code ViewStack} with the properties 
         *         that were set in the Builder object.
         */
        public ViewStack build() {
            return (ViewStack) org.gtk.gobject.GObject.newWithProperties(
                ViewStack.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
        public Builder setHhomogeneous(boolean hhomogeneous) {
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
        public Builder setPages(org.gtk.gtk.SelectionModel pages) {
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
         * <p>
         * See {@code ViewStack:visible-child}.
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
