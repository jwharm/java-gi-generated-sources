package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkStackPage} is an auxiliary class used by {@code GtkStack}.
 */
public class StackPage extends org.gtk.gobject.Object implements Accessible {

    public StackPage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to StackPage */
    public static StackPage castFrom(org.gtk.gobject.Object gobject) {
        return new StackPage(gobject.refcounted());
    }
    
    static final MethodHandle gtk_stack_page_get_child = Interop.downcallHandle(
        "gtk_stack_page_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the stack child to which {@code self} belongs.
     */
    public Widget getChild() {
        try {
            var RESULT = (MemoryAddress) gtk_stack_page_get_child.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_stack_page_get_icon_name = Interop.downcallHandle(
        "gtk_stack_page_get_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the icon name of the page.
     */
    public java.lang.String getIconName() {
        try {
            var RESULT = (MemoryAddress) gtk_stack_page_get_icon_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_stack_page_get_name = Interop.downcallHandle(
        "gtk_stack_page_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the name of the page.
     */
    public java.lang.String getName() {
        try {
            var RESULT = (MemoryAddress) gtk_stack_page_get_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_stack_page_get_needs_attention = Interop.downcallHandle(
        "gtk_stack_page_get_needs_attention",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the page is marked as “needs attention”.
     */
    public boolean getNeedsAttention() {
        try {
            var RESULT = (int) gtk_stack_page_get_needs_attention.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_stack_page_get_title = Interop.downcallHandle(
        "gtk_stack_page_get_title",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the page title.
     */
    public java.lang.String getTitle() {
        try {
            var RESULT = (MemoryAddress) gtk_stack_page_get_title.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_stack_page_get_use_underline = Interop.downcallHandle(
        "gtk_stack_page_get_use_underline",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether underlines in the page title indicate mnemonics.
     */
    public boolean getUseUnderline() {
        try {
            var RESULT = (int) gtk_stack_page_get_use_underline.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_stack_page_get_visible = Interop.downcallHandle(
        "gtk_stack_page_get_visible",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether {@code page} is visible in its {@code GtkStack}.
     * <p>
     * This is independent from the {@code Gtk.Widget:visible}
     * property of its widget.
     */
    public boolean getVisible() {
        try {
            var RESULT = (int) gtk_stack_page_get_visible.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_stack_page_set_icon_name = Interop.downcallHandle(
        "gtk_stack_page_set_icon_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the icon name of the page.
     */
    public void setIconName(java.lang.String setting) {
        try {
            gtk_stack_page_set_icon_name.invokeExact(handle(), Interop.allocateNativeString(setting).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_stack_page_set_name = Interop.downcallHandle(
        "gtk_stack_page_set_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the name of the page.
     */
    public void setName(java.lang.String setting) {
        try {
            gtk_stack_page_set_name.invokeExact(handle(), Interop.allocateNativeString(setting).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_stack_page_set_needs_attention = Interop.downcallHandle(
        "gtk_stack_page_set_needs_attention",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the page is marked as “needs attention”.
     */
    public void setNeedsAttention(boolean setting) {
        try {
            gtk_stack_page_set_needs_attention.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_stack_page_set_title = Interop.downcallHandle(
        "gtk_stack_page_set_title",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the page title.
     */
    public void setTitle(java.lang.String setting) {
        try {
            gtk_stack_page_set_title.invokeExact(handle(), Interop.allocateNativeString(setting).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_stack_page_set_use_underline = Interop.downcallHandle(
        "gtk_stack_page_set_use_underline",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether underlines in the page title indicate mnemonics.
     */
    public void setUseUnderline(boolean setting) {
        try {
            gtk_stack_page_set_use_underline.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_stack_page_set_visible = Interop.downcallHandle(
        "gtk_stack_page_set_visible",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code page} is visible in its {@code GtkStack}.
     */
    public void setVisible(boolean visible) {
        try {
            gtk_stack_page_set_visible.invokeExact(handle(), visible ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
