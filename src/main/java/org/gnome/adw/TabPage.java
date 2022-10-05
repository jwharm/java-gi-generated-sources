package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An auxiliary class used by {@link TabView}.
 */
public class TabPage extends org.gtk.gobject.Object {

    public TabPage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TabPage */
    public static TabPage castFrom(org.gtk.gobject.Object gobject) {
        return new TabPage(gobject.refcounted());
    }
    
    static final MethodHandle adw_tab_page_get_child = Interop.downcallHandle(
        "adw_tab_page_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child of {@code self}.
     */
    public org.gtk.gtk.Widget getChild() {
        try {
            var RESULT = (MemoryAddress) adw_tab_page_get_child.invokeExact(handle());
            return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_page_get_icon = Interop.downcallHandle(
        "adw_tab_page_get_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the icon of {@code self}.
     */
    public org.gtk.gio.Icon getIcon() {
        try {
            var RESULT = (MemoryAddress) adw_tab_page_get_icon.invokeExact(handle());
            return new org.gtk.gio.Icon.IconImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_page_get_indicator_activatable = Interop.downcallHandle(
        "adw_tab_page_get_indicator_activatable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the indicator of {@code self} is activatable.
     */
    public boolean getIndicatorActivatable() {
        try {
            var RESULT = (int) adw_tab_page_get_indicator_activatable.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_page_get_indicator_icon = Interop.downcallHandle(
        "adw_tab_page_get_indicator_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the indicator icon of {@code self}.
     */
    public org.gtk.gio.Icon getIndicatorIcon() {
        try {
            var RESULT = (MemoryAddress) adw_tab_page_get_indicator_icon.invokeExact(handle());
            return new org.gtk.gio.Icon.IconImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_page_get_loading = Interop.downcallHandle(
        "adw_tab_page_get_loading",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} is loading.
     */
    public boolean getLoading() {
        try {
            var RESULT = (int) adw_tab_page_get_loading.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_page_get_needs_attention = Interop.downcallHandle(
        "adw_tab_page_get_needs_attention",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} needs attention.
     */
    public boolean getNeedsAttention() {
        try {
            var RESULT = (int) adw_tab_page_get_needs_attention.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_page_get_parent = Interop.downcallHandle(
        "adw_tab_page_get_parent",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the parent page of {@code self}.
     */
    public TabPage getParent() {
        try {
            var RESULT = (MemoryAddress) adw_tab_page_get_parent.invokeExact(handle());
            return new TabPage(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_page_get_pinned = Interop.downcallHandle(
        "adw_tab_page_get_pinned",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} is pinned.
     */
    public boolean getPinned() {
        try {
            var RESULT = (int) adw_tab_page_get_pinned.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_page_get_selected = Interop.downcallHandle(
        "adw_tab_page_get_selected",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} is selected.
     */
    public boolean getSelected() {
        try {
            var RESULT = (int) adw_tab_page_get_selected.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_page_get_title = Interop.downcallHandle(
        "adw_tab_page_get_title",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the title of {@code self}.
     */
    public java.lang.String getTitle() {
        try {
            var RESULT = (MemoryAddress) adw_tab_page_get_title.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_page_get_tooltip = Interop.downcallHandle(
        "adw_tab_page_get_tooltip",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the tooltip of {@code self}.
     */
    public java.lang.String getTooltip() {
        try {
            var RESULT = (MemoryAddress) adw_tab_page_get_tooltip.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_page_set_icon = Interop.downcallHandle(
        "adw_tab_page_set_icon",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the icon of {@code self}.
     */
    public void setIcon(org.gtk.gio.Icon icon) {
        try {
            adw_tab_page_set_icon.invokeExact(handle(), icon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_page_set_indicator_activatable = Interop.downcallHandle(
        "adw_tab_page_set_indicator_activatable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the indicator of {@code self} is activatable.
     */
    public void setIndicatorActivatable(boolean activatable) {
        try {
            adw_tab_page_set_indicator_activatable.invokeExact(handle(), activatable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_page_set_indicator_icon = Interop.downcallHandle(
        "adw_tab_page_set_indicator_icon",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the indicator icon of {@code self}.
     */
    public void setIndicatorIcon(org.gtk.gio.Icon indicatorIcon) {
        try {
            adw_tab_page_set_indicator_icon.invokeExact(handle(), indicatorIcon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_page_set_loading = Interop.downcallHandle(
        "adw_tab_page_set_loading",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets wether {@code self} is loading.
     */
    public void setLoading(boolean loading) {
        try {
            adw_tab_page_set_loading.invokeExact(handle(), loading ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_page_set_needs_attention = Interop.downcallHandle(
        "adw_tab_page_set_needs_attention",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code self} needs attention.
     */
    public void setNeedsAttention(boolean needsAttention) {
        try {
            adw_tab_page_set_needs_attention.invokeExact(handle(), needsAttention ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_page_set_title = Interop.downcallHandle(
        "adw_tab_page_set_title",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the title of {@code self}.
     */
    public void setTitle(java.lang.String title) {
        try {
            adw_tab_page_set_title.invokeExact(handle(), Interop.allocateNativeString(title).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_page_set_tooltip = Interop.downcallHandle(
        "adw_tab_page_set_tooltip",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the tooltip of {@code self}.
     */
    public void setTooltip(java.lang.String tooltip) {
        try {
            adw_tab_page_set_tooltip.invokeExact(handle(), Interop.allocateNativeString(tooltip).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
