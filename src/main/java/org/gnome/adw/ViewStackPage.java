package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An auxiliary class used by {@link ViewStack}.
 */
public class ViewStackPage extends org.gtk.gobject.Object {

    public ViewStackPage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ViewStackPage */
    public static ViewStackPage castFrom(org.gtk.gobject.Object gobject) {
        return new ViewStackPage(gobject.refcounted());
    }
    
    static final MethodHandle adw_view_stack_page_get_badge_number = Interop.downcallHandle(
        "adw_view_stack_page_get_badge_number",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the badge number for this page.
     */
    public int getBadgeNumber() {
        try {
            var RESULT = (int) adw_view_stack_page_get_badge_number.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_page_get_child = Interop.downcallHandle(
        "adw_view_stack_page_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the stack child to which {@code self} belongs.
     */
    public org.gtk.gtk.Widget getChild() {
        try {
            var RESULT = (MemoryAddress) adw_view_stack_page_get_child.invokeExact(handle());
            return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_page_get_icon_name = Interop.downcallHandle(
        "adw_view_stack_page_get_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the icon name of the page.
     */
    public java.lang.String getIconName() {
        try {
            var RESULT = (MemoryAddress) adw_view_stack_page_get_icon_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_page_get_name = Interop.downcallHandle(
        "adw_view_stack_page_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the page.
     */
    public java.lang.String getName() {
        try {
            var RESULT = (MemoryAddress) adw_view_stack_page_get_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_page_get_needs_attention = Interop.downcallHandle(
        "adw_view_stack_page_get_needs_attention",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the page is marked as “needs attention”.
     */
    public boolean getNeedsAttention() {
        try {
            var RESULT = (int) adw_view_stack_page_get_needs_attention.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_page_get_title = Interop.downcallHandle(
        "adw_view_stack_page_get_title",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the page title.
     */
    public java.lang.String getTitle() {
        try {
            var RESULT = (MemoryAddress) adw_view_stack_page_get_title.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_page_get_use_underline = Interop.downcallHandle(
        "adw_view_stack_page_get_use_underline",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether underlines in the page title indicate mnemonics.
     */
    public boolean getUseUnderline() {
        try {
            var RESULT = (int) adw_view_stack_page_get_use_underline.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_page_get_visible = Interop.downcallHandle(
        "adw_view_stack_page_get_visible",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} is visible in its {@code AdwViewStack}.
     * <p>
     * This is independent from the {@code Gtk.Widget:visible}
     * property of its widget.
     */
    public boolean getVisible() {
        try {
            var RESULT = (int) adw_view_stack_page_get_visible.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_page_set_badge_number = Interop.downcallHandle(
        "adw_view_stack_page_set_badge_number",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the badge number for this page.
     */
    public void setBadgeNumber(int badgeNumber) {
        try {
            adw_view_stack_page_set_badge_number.invokeExact(handle(), badgeNumber);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_page_set_icon_name = Interop.downcallHandle(
        "adw_view_stack_page_set_icon_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the icon name of the page.
     */
    public void setIconName(java.lang.String iconName) {
        try {
            adw_view_stack_page_set_icon_name.invokeExact(handle(), Interop.allocateNativeString(iconName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_page_set_name = Interop.downcallHandle(
        "adw_view_stack_page_set_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the name of the page.
     */
    public void setName(java.lang.String name) {
        try {
            adw_view_stack_page_set_name.invokeExact(handle(), Interop.allocateNativeString(name).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_page_set_needs_attention = Interop.downcallHandle(
        "adw_view_stack_page_set_needs_attention",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the page is marked as “needs attention”.
     */
    public void setNeedsAttention(boolean needsAttention) {
        try {
            adw_view_stack_page_set_needs_attention.invokeExact(handle(), needsAttention ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_page_set_title = Interop.downcallHandle(
        "adw_view_stack_page_set_title",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the page title.
     */
    public void setTitle(java.lang.String title) {
        try {
            adw_view_stack_page_set_title.invokeExact(handle(), Interop.allocateNativeString(title).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_page_set_use_underline = Interop.downcallHandle(
        "adw_view_stack_page_set_use_underline",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether underlines in the page title indicate mnemonics.
     */
    public void setUseUnderline(boolean useUnderline) {
        try {
            adw_view_stack_page_set_use_underline.invokeExact(handle(), useUnderline ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_view_stack_page_set_visible = Interop.downcallHandle(
        "adw_view_stack_page_set_visible",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code page} is visible in its {@code AdwViewStack}.
     */
    public void setVisible(boolean visible) {
        try {
            adw_view_stack_page_set_visible.invokeExact(handle(), visible ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
