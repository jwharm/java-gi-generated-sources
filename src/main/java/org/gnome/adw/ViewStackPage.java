package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An auxiliary class used by {@link ViewStack}.
 * @version 1.0
 */
public class ViewStackPage extends org.gtk.gobject.Object {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwViewStackPage";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ViewStackPage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ViewStackPage(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ViewStackPage if its GType is a (or inherits from) "AdwViewStackPage".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ViewStackPage} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwViewStackPage", a ClassCastException will be thrown.
     */
    public static ViewStackPage castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ViewStackPage.getType())) {
            return new ViewStackPage(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwViewStackPage");
        }
    }
    
    /**
     * Gets the badge number for this page.
     * @return the badge number for this page
     */
    public int getBadgeNumber() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_view_stack_page_get_badge_number.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the stack child to which {@code self} belongs.
     * @return the child to which {@code self} belongs
     */
    public @NotNull org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_page_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the icon name of the page.
     * @return the icon name of the page
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_page_get_icon_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the name of the page.
     * @return the name of the page
     */
    public @Nullable java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_page_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets whether the page requires the user attention.
     * @return whether the page needs attention
     */
    public boolean getNeedsAttention() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_view_stack_page_get_needs_attention.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the page title.
     * @return the page title
     */
    public @Nullable java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_page_get_title.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets whether underlines in the page title indicate mnemonics.
     * @return whether underlines in the page title indicate mnemonics
     */
    public boolean getUseUnderline() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_view_stack_page_get_use_underline.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} is visible in its {@code AdwViewStack}.
     * <p>
     * This is independent from the {@code Gtk.Widget:visible}
     * property of its widget.
     * @return whether {@code self} is visible
     */
    public boolean getVisible() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_view_stack_page_get_visible.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the badge number for this page.
     * <p>
     * {@link ViewSwitcher} can display it as a badge next to the page icon. It is
     * commonly used to display a number of unread items within the page.
     * <p>
     * It can be used together with {@code ViewStack{age}:needs-attention}.
     * @param badgeNumber the new value to set
     */
    public void setBadgeNumber(int badgeNumber) {
        try {
            DowncallHandles.adw_view_stack_page_set_badge_number.invokeExact(
                    handle(),
                    badgeNumber);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the icon name of the page.
     * @param iconName the icon name
     */
    public void setIconName(@Nullable java.lang.String iconName) {
        try {
            DowncallHandles.adw_view_stack_page_set_icon_name.invokeExact(
                    handle(),
                    (Addressable) (iconName == null ? MemoryAddress.NULL : Interop.allocateNativeString(iconName)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the name of the page.
     * @param name the page name
     */
    public void setName(@Nullable java.lang.String name) {
        try {
            DowncallHandles.adw_view_stack_page_set_name.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the page requires the user attention.
     * <p>
     * {@link ViewSwitcher} will display it as a dot next to the page icon.
     * @param needsAttention the new value to set
     */
    public void setNeedsAttention(boolean needsAttention) {
        try {
            DowncallHandles.adw_view_stack_page_set_needs_attention.invokeExact(
                    handle(),
                    needsAttention ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the page title.
     * @param title the page title
     */
    public void setTitle(@Nullable java.lang.String title) {
        try {
            DowncallHandles.adw_view_stack_page_set_title.invokeExact(
                    handle(),
                    (Addressable) (title == null ? MemoryAddress.NULL : Interop.allocateNativeString(title)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether underlines in the page title indicate mnemonics.
     * @param useUnderline the new value to set
     */
    public void setUseUnderline(boolean useUnderline) {
        try {
            DowncallHandles.adw_view_stack_page_set_use_underline.invokeExact(
                    handle(),
                    useUnderline ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code page} is visible in its {@code AdwViewStack}.
     * <p>
     * This is independent from the {@code Gtk.Widget:visible} property of
     * {@code ViewStackPage:child}.
     * @param visible whether {@code self} is visible
     */
    public void setVisible(boolean visible) {
        try {
            DowncallHandles.adw_view_stack_page_set_visible.invokeExact(
                    handle(),
                    visible ? 1 : 0);
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
            RESULT = (long) DowncallHandles.adw_view_stack_page_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link ViewStackPage.Build} object constructs a {@link ViewStackPage} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ViewStackPage} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ViewStackPage} using {@link ViewStackPage#castFrom}.
         * @return A new instance of {@code ViewStackPage} with the properties 
         *         that were set in the Build object.
         */
        public ViewStackPage construct() {
            return ViewStackPage.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ViewStackPage.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The badge number for this page.
         * <p>
         * {@link ViewSwitcher} can display it as a badge next to the page icon. It is
         * commonly used to display a number of unread items within the page.
         * <p>
         * It can be used together with {@code ViewStack{age}:needs-attention}.
         * @param badgeNumber The value for the {@code badge-number} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBadgeNumber(int badgeNumber) {
            names.add("badge-number");
            values.add(org.gtk.gobject.Value.create(badgeNumber));
            return this;
        }
        
        /**
         * The stack child to which the page belongs.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * The icon name of the child page.
         * @param iconName The value for the {@code icon-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIconName(java.lang.String iconName) {
            names.add("icon-name");
            values.add(org.gtk.gobject.Value.create(iconName));
            return this;
        }
        
        /**
         * The name of the child page.
         * @param name The value for the {@code name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
        
        /**
         * Whether the page requires the user attention.
         * <p>
         * {@link ViewSwitcher} will display it as a dot next to the page icon.
         * @param needsAttention The value for the {@code needs-attention} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNeedsAttention(boolean needsAttention) {
            names.add("needs-attention");
            values.add(org.gtk.gobject.Value.create(needsAttention));
            return this;
        }
        
        /**
         * The title of the child page.
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTitle(java.lang.String title) {
            names.add("title");
            values.add(org.gtk.gobject.Value.create(title));
            return this;
        }
        
        /**
         * Whether an embedded underline in the title indicates a mnemonic.
         * @param useUnderline The value for the {@code use-underline} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUseUnderline(boolean useUnderline) {
            names.add("use-underline");
            values.add(org.gtk.gobject.Value.create(useUnderline));
            return this;
        }
        
        /**
         * Whether this page is visible.
         * <p>
         * This is independent from the {@code Gtk.Widget:visible} property of
         * {@code ViewStackPage:child}.
         * @param visible The value for the {@code visible} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setVisible(boolean visible) {
            names.add("visible");
            values.add(org.gtk.gobject.Value.create(visible));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_view_stack_page_get_badge_number = Interop.downcallHandle(
            "adw_view_stack_page_get_badge_number",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_page_get_child = Interop.downcallHandle(
            "adw_view_stack_page_get_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_page_get_icon_name = Interop.downcallHandle(
            "adw_view_stack_page_get_icon_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_page_get_name = Interop.downcallHandle(
            "adw_view_stack_page_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_page_get_needs_attention = Interop.downcallHandle(
            "adw_view_stack_page_get_needs_attention",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_page_get_title = Interop.downcallHandle(
            "adw_view_stack_page_get_title",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_page_get_use_underline = Interop.downcallHandle(
            "adw_view_stack_page_get_use_underline",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_page_get_visible = Interop.downcallHandle(
            "adw_view_stack_page_get_visible",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_page_set_badge_number = Interop.downcallHandle(
            "adw_view_stack_page_set_badge_number",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_view_stack_page_set_icon_name = Interop.downcallHandle(
            "adw_view_stack_page_set_icon_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_page_set_name = Interop.downcallHandle(
            "adw_view_stack_page_set_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_page_set_needs_attention = Interop.downcallHandle(
            "adw_view_stack_page_set_needs_attention",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_view_stack_page_set_title = Interop.downcallHandle(
            "adw_view_stack_page_set_title",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_stack_page_set_use_underline = Interop.downcallHandle(
            "adw_view_stack_page_set_use_underline",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_view_stack_page_set_visible = Interop.downcallHandle(
            "adw_view_stack_page_set_visible",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_view_stack_page_get_type = Interop.downcallHandle(
            "adw_view_stack_page_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
