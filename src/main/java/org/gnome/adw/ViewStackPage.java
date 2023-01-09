package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An auxiliary class used by {@link ViewStack}.
 * @version 1.0
 */
public class ViewStackPage extends org.gtk.gobject.GObject {
    
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
     */
    protected ViewStackPage(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ViewStackPage> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ViewStackPage(input);
    
    /**
     * Gets the badge number for this page.
     * @return the badge number for this page
     */
    public int getBadgeNumber() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_view_stack_page_get_badge_number.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the stack child to which {@code self} belongs.
     * @return the child to which {@code self} belongs
     */
    public org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_page_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the icon name of the page.
     * @return the icon name of the page
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_page_get_icon_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the name of the page.
     * @return the name of the page
     */
    public @Nullable java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_page_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets whether the page requires the user attention.
     * @return whether the page needs attention
     */
    public boolean getNeedsAttention() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_view_stack_page_get_needs_attention.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the page title.
     * @return the page title
     */
    public @Nullable java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_page_get_title.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets whether underlines in the page title indicate mnemonics.
     * @return whether underlines in the page title indicate mnemonics
     */
    public boolean getUseUnderline() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_view_stack_page_get_use_underline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
            RESULT = (int) DowncallHandles.adw_view_stack_page_get_visible.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.adw_view_stack_page_set_icon_name.invokeExact(
                        handle(),
                        (Addressable) (iconName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(iconName, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the name of the page.
     * @param name the page name
     */
    public void setName(@Nullable java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.adw_view_stack_page_set_name.invokeExact(
                        handle(),
                        (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
                    Marshal.booleanToInteger.marshal(needsAttention, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the page title.
     * @param title the page title
     */
    public void setTitle(@Nullable java.lang.String title) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.adw_view_stack_page_set_title.invokeExact(
                        handle(),
                        (Addressable) (title == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(title, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
                    Marshal.booleanToInteger.marshal(useUnderline, null).intValue());
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
                    Marshal.booleanToInteger.marshal(visible, null).intValue());
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
            RESULT = (long) DowncallHandles.adw_view_stack_page_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ViewStackPage.Builder} object constructs a {@link ViewStackPage} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ViewStackPage.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ViewStackPage} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ViewStackPage}.
         * @return A new instance of {@code ViewStackPage} with the properties 
         *         that were set in the Builder object.
         */
        public ViewStackPage build() {
            return (ViewStackPage) org.gtk.gobject.GObject.newWithProperties(
                ViewStackPage.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
        public Builder setBadgeNumber(int badgeNumber) {
            names.add("badge-number");
            values.add(org.gtk.gobject.Value.create(badgeNumber));
            return this;
        }
        
        /**
         * The stack child to which the page belongs.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * The icon name of the child page.
         * @param iconName The value for the {@code icon-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIconName(java.lang.String iconName) {
            names.add("icon-name");
            values.add(org.gtk.gobject.Value.create(iconName));
            return this;
        }
        
        /**
         * The name of the child page.
         * @param name The value for the {@code name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setName(java.lang.String name) {
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
        public Builder setNeedsAttention(boolean needsAttention) {
            names.add("needs-attention");
            values.add(org.gtk.gobject.Value.create(needsAttention));
            return this;
        }
        
        /**
         * The title of the child page.
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTitle(java.lang.String title) {
            names.add("title");
            values.add(org.gtk.gobject.Value.create(title));
            return this;
        }
        
        /**
         * Whether an embedded underline in the title indicates a mnemonic.
         * @param useUnderline The value for the {@code use-underline} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUseUnderline(boolean useUnderline) {
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
        public Builder setVisible(boolean visible) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.adw_view_stack_page_get_type != null;
    }
}
