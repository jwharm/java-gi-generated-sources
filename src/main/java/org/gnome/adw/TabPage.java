package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An auxiliary class used by {@link TabView}.
 */
public class TabPage extends org.gtk.gobject.Object {
    
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
    
    public TabPage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TabPage */
    public static TabPage castFrom(org.gtk.gobject.Object gobject) {
        return new TabPage(gobject.refcounted());
    }
    
    /**
     * Gets the child of {@code self}.
     * @return the child of {@code self}
     */
    public @NotNull org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_page_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the icon of {@code self}.
     * @return the icon of {@code self}
     */
    public @Nullable org.gtk.gio.Icon getIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_page_get_icon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Icon.IconImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether the indicator of {@code self} is activatable.
     * @return whether the indicator is activatable
     */
    public boolean getIndicatorActivatable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_page_get_indicator_activatable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the indicator icon of {@code self}.
     * @return the indicator icon of {@code self}
     */
    public @Nullable org.gtk.gio.Icon getIndicatorIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_page_get_indicator_icon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Icon.IconImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether {@code self} is loading.
     * @return whether {@code self} is loading
     */
    public boolean getLoading() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_page_get_loading.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} needs attention.
     * @return whether {@code self} needs attention
     */
    public boolean getNeedsAttention() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_page_get_needs_attention.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the parent page of {@code self}.
     * @return the parent page
     */
    public @Nullable org.gnome.adw.TabPage getParent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_page_get_parent.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.TabPage(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether {@code self} is pinned.
     * @return whether {@code self} is pinned
     */
    public boolean getPinned() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_page_get_pinned.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} is selected.
     * @return whether {@code self} is selected
     */
    public boolean getSelected() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_page_get_selected.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the title of {@code self}.
     * @return the title of {@code self}
     */
    public @NotNull java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_page_get_title.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the tooltip of {@code self}.
     * @return the tooltip of {@code self}
     */
    public @Nullable java.lang.String getTooltip() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_page_get_tooltip.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets the icon of {@code self}.
     * @param icon the icon of {@code self}
     */
    public void setIcon(@Nullable org.gtk.gio.Icon icon) {
        java.util.Objects.requireNonNullElse(icon, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_tab_page_set_icon.invokeExact(handle(), icon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the indicator of {@code self} is activatable.
     * @param activatable whether the indicator is activatable
     */
    public void setIndicatorActivatable(boolean activatable) {
        try {
            DowncallHandles.adw_tab_page_set_indicator_activatable.invokeExact(handle(), activatable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the indicator icon of {@code self}.
     * @param indicatorIcon the indicator icon of {@code self}
     */
    public void setIndicatorIcon(@Nullable org.gtk.gio.Icon indicatorIcon) {
        java.util.Objects.requireNonNullElse(indicatorIcon, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_tab_page_set_indicator_icon.invokeExact(handle(), indicatorIcon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets wether {@code self} is loading.
     * @param loading whether {@code self} is loading
     */
    public void setLoading(boolean loading) {
        try {
            DowncallHandles.adw_tab_page_set_loading.invokeExact(handle(), loading ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} needs attention.
     * @param needsAttention whether {@code self} needs attention
     */
    public void setNeedsAttention(boolean needsAttention) {
        try {
            DowncallHandles.adw_tab_page_set_needs_attention.invokeExact(handle(), needsAttention ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the title of {@code self}.
     * @param title the title of {@code self}
     */
    public void setTitle(@NotNull java.lang.String title) {
        java.util.Objects.requireNonNull(title, "Parameter 'title' must not be null");
        try {
            DowncallHandles.adw_tab_page_set_title.invokeExact(handle(), Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the tooltip of {@code self}.
     * @param tooltip the tooltip of {@code self}
     */
    public void setTooltip(@NotNull java.lang.String tooltip) {
        java.util.Objects.requireNonNull(tooltip, "Parameter 'tooltip' must not be null");
        try {
            DowncallHandles.adw_tab_page_set_tooltip.invokeExact(handle(), Interop.allocateNativeString(tooltip));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_tab_page_get_child = Interop.downcallHandle(
            "adw_tab_page_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_page_get_icon = Interop.downcallHandle(
            "adw_tab_page_get_icon",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_page_get_indicator_activatable = Interop.downcallHandle(
            "adw_tab_page_get_indicator_activatable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_page_get_indicator_icon = Interop.downcallHandle(
            "adw_tab_page_get_indicator_icon",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_page_get_loading = Interop.downcallHandle(
            "adw_tab_page_get_loading",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_page_get_needs_attention = Interop.downcallHandle(
            "adw_tab_page_get_needs_attention",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_page_get_parent = Interop.downcallHandle(
            "adw_tab_page_get_parent",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_page_get_pinned = Interop.downcallHandle(
            "adw_tab_page_get_pinned",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_page_get_selected = Interop.downcallHandle(
            "adw_tab_page_get_selected",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_page_get_title = Interop.downcallHandle(
            "adw_tab_page_get_title",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_page_get_tooltip = Interop.downcallHandle(
            "adw_tab_page_get_tooltip",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_page_set_icon = Interop.downcallHandle(
            "adw_tab_page_set_icon",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_page_set_indicator_activatable = Interop.downcallHandle(
            "adw_tab_page_set_indicator_activatable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_tab_page_set_indicator_icon = Interop.downcallHandle(
            "adw_tab_page_set_indicator_icon",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_page_set_loading = Interop.downcallHandle(
            "adw_tab_page_set_loading",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_tab_page_set_needs_attention = Interop.downcallHandle(
            "adw_tab_page_set_needs_attention",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_tab_page_set_title = Interop.downcallHandle(
            "adw_tab_page_set_title",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_page_set_tooltip = Interop.downcallHandle(
            "adw_tab_page_set_tooltip",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
