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
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public ViewStackPage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ViewStackPage if its GType is a (or inherits from) "AdwViewStackPage".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ViewStackPage" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwViewStackPage", a ClassCastException will be thrown.
     */
    public static ViewStackPage castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwViewStackPage"))) {
            return new ViewStackPage(gobject.refcounted());
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
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
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
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_view_stack_page_get_badge_number = Interop.downcallHandle(
            "adw_view_stack_page_get_badge_number",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_stack_page_get_child = Interop.downcallHandle(
            "adw_view_stack_page_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_stack_page_get_icon_name = Interop.downcallHandle(
            "adw_view_stack_page_get_icon_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_stack_page_get_name = Interop.downcallHandle(
            "adw_view_stack_page_get_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_stack_page_get_needs_attention = Interop.downcallHandle(
            "adw_view_stack_page_get_needs_attention",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_stack_page_get_title = Interop.downcallHandle(
            "adw_view_stack_page_get_title",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_stack_page_get_use_underline = Interop.downcallHandle(
            "adw_view_stack_page_get_use_underline",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_stack_page_get_visible = Interop.downcallHandle(
            "adw_view_stack_page_get_visible",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_stack_page_set_badge_number = Interop.downcallHandle(
            "adw_view_stack_page_set_badge_number",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_view_stack_page_set_icon_name = Interop.downcallHandle(
            "adw_view_stack_page_set_icon_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_stack_page_set_name = Interop.downcallHandle(
            "adw_view_stack_page_set_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_stack_page_set_needs_attention = Interop.downcallHandle(
            "adw_view_stack_page_set_needs_attention",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_view_stack_page_set_title = Interop.downcallHandle(
            "adw_view_stack_page_set_title",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_stack_page_set_use_underline = Interop.downcallHandle(
            "adw_view_stack_page_set_use_underline",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_view_stack_page_set_visible = Interop.downcallHandle(
            "adw_view_stack_page_set_visible",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
