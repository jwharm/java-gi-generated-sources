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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public ViewStackPage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ViewStackPage */
    public static ViewStackPage castFrom(org.gtk.gobject.Object gobject) {
        return new ViewStackPage(gobject.refcounted());
    }
    
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
    public @NotNull org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_page_get_child.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_page_get_icon_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
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
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether the page is marked as “needs attention”.
     * @return whether the page needs attention
     */
    public boolean getNeedsAttention() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_view_stack_page_get_needs_attention.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.adw_view_stack_page_get_title.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
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
            RESULT = (int) DowncallHandles.adw_view_stack_page_get_visible.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the badge number for this page.
     * @param badgeNumber the new value to set
     */
    public void setBadgeNumber(int badgeNumber) {
        try {
            DowncallHandles.adw_view_stack_page_set_badge_number.invokeExact(handle(), badgeNumber);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the icon name of the page.
     * @param iconName the icon name
     */
    public void setIconName(@Nullable java.lang.String iconName) {
        java.util.Objects.requireNonNullElse(iconName, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_view_stack_page_set_icon_name.invokeExact(handle(), Interop.allocateNativeString(iconName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the name of the page.
     * @param name the page name
     */
    public void setName(@Nullable java.lang.String name) {
        java.util.Objects.requireNonNullElse(name, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_view_stack_page_set_name.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the page is marked as “needs attention”.
     * @param needsAttention the new value to set
     */
    public void setNeedsAttention(boolean needsAttention) {
        try {
            DowncallHandles.adw_view_stack_page_set_needs_attention.invokeExact(handle(), needsAttention ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the page title.
     * @param title the page title
     */
    public void setTitle(@Nullable java.lang.String title) {
        java.util.Objects.requireNonNullElse(title, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_view_stack_page_set_title.invokeExact(handle(), Interop.allocateNativeString(title));
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
            DowncallHandles.adw_view_stack_page_set_use_underline.invokeExact(handle(), useUnderline ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code page} is visible in its {@code AdwViewStack}.
     * @param visible whether {@code self} is visible
     */
    public void setVisible(boolean visible) {
        try {
            DowncallHandles.adw_view_stack_page_set_visible.invokeExact(handle(), visible ? 1 : 0);
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
