package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle adw_view_stack_page_get_badge_number = Interop.downcallHandle(
        "adw_view_stack_page_get_badge_number",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the badge number for this page.
     */
    public int getBadgeNumber() {
        int RESULT;
        try {
            RESULT = (int) adw_view_stack_page_get_badge_number.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle adw_view_stack_page_get_child = Interop.downcallHandle(
        "adw_view_stack_page_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the stack child to which {@code self} belongs.
     */
    public @NotNull org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_view_stack_page_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_view_stack_page_get_icon_name = Interop.downcallHandle(
        "adw_view_stack_page_get_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the icon name of the page.
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_view_stack_page_get_icon_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle adw_view_stack_page_get_name = Interop.downcallHandle(
        "adw_view_stack_page_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the page.
     */
    public @Nullable java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_view_stack_page_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle adw_view_stack_page_get_needs_attention = Interop.downcallHandle(
        "adw_view_stack_page_get_needs_attention",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the page is marked as “needs attention”.
     */
    public boolean getNeedsAttention() {
        int RESULT;
        try {
            RESULT = (int) adw_view_stack_page_get_needs_attention.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_view_stack_page_get_title = Interop.downcallHandle(
        "adw_view_stack_page_get_title",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the page title.
     */
    public @Nullable java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_view_stack_page_get_title.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle adw_view_stack_page_get_use_underline = Interop.downcallHandle(
        "adw_view_stack_page_get_use_underline",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether underlines in the page title indicate mnemonics.
     */
    public boolean getUseUnderline() {
        int RESULT;
        try {
            RESULT = (int) adw_view_stack_page_get_use_underline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_view_stack_page_get_visible = Interop.downcallHandle(
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
        int RESULT;
        try {
            RESULT = (int) adw_view_stack_page_get_visible.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_view_stack_page_set_badge_number = Interop.downcallHandle(
        "adw_view_stack_page_set_badge_number",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the badge number for this page.
     */
    public @NotNull void setBadgeNumber(@NotNull int badgeNumber) {
        try {
            adw_view_stack_page_set_badge_number.invokeExact(handle(), badgeNumber);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_view_stack_page_set_icon_name = Interop.downcallHandle(
        "adw_view_stack_page_set_icon_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the icon name of the page.
     */
    public @NotNull void setIconName(@Nullable java.lang.String iconName) {
        try {
            adw_view_stack_page_set_icon_name.invokeExact(handle(), Interop.allocateNativeString(iconName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_view_stack_page_set_name = Interop.downcallHandle(
        "adw_view_stack_page_set_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the name of the page.
     */
    public @NotNull void setName(@Nullable java.lang.String name) {
        try {
            adw_view_stack_page_set_name.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_view_stack_page_set_needs_attention = Interop.downcallHandle(
        "adw_view_stack_page_set_needs_attention",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the page is marked as “needs attention”.
     */
    public @NotNull void setNeedsAttention(@NotNull boolean needsAttention) {
        try {
            adw_view_stack_page_set_needs_attention.invokeExact(handle(), needsAttention ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_view_stack_page_set_title = Interop.downcallHandle(
        "adw_view_stack_page_set_title",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the page title.
     */
    public @NotNull void setTitle(@Nullable java.lang.String title) {
        try {
            adw_view_stack_page_set_title.invokeExact(handle(), Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_view_stack_page_set_use_underline = Interop.downcallHandle(
        "adw_view_stack_page_set_use_underline",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether underlines in the page title indicate mnemonics.
     */
    public @NotNull void setUseUnderline(@NotNull boolean useUnderline) {
        try {
            adw_view_stack_page_set_use_underline.invokeExact(handle(), useUnderline ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_view_stack_page_set_visible = Interop.downcallHandle(
        "adw_view_stack_page_set_visible",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code page} is visible in its {@code AdwViewStack}.
     */
    public @NotNull void setVisible(@NotNull boolean visible) {
        try {
            adw_view_stack_page_set_visible.invokeExact(handle(), visible ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
