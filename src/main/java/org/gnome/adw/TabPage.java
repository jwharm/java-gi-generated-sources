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
    
    private static final java.lang.String C_TYPE_NAME = "AdwTabPage";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TabPage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TabPage(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TabPage if its GType is a (or inherits from) "AdwTabPage".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TabPage} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwTabPage", a ClassCastException will be thrown.
     */
    public static TabPage castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), TabPage.getType())) {
            return new TabPage(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwTabPage");
        }
    }
    
    /**
     * Gets the child of {@code self}.
     * @return the child of {@code self}
     */
    public @NotNull org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_page_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the icon of {@code self}.
     * @return the icon of {@code self}
     */
    public @Nullable org.gtk.gio.Icon getIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_page_get_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Icon.IconImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether the indicator of {@code self} is activatable.
     * @return whether the indicator is activatable
     */
    public boolean getIndicatorActivatable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_page_get_indicator_activatable.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_page_get_indicator_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Icon.IconImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the tooltip of the indicator icon of {@code self}.
     * @return the indicator tooltip of {@code self}
     */
    public @NotNull java.lang.String getIndicatorTooltip() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_page_get_indicator_tooltip.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets whether {@code self} is loading.
     * @return whether {@code self} is loading
     */
    public boolean getLoading() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_page_get_loading.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.adw_tab_page_get_needs_attention.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the parent page of {@code self}.
     * <p>
     * See {@code TabView.add_page#] and [method@TabView.closePage}.
     * @return the parent page
     */
    public @Nullable org.gnome.adw.TabPage getParent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_page_get_parent.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.TabPage(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether {@code self} is pinned.
     * <p>
     * See {@code TabView#setPagePinned}.
     * @return whether {@code self} is pinned
     */
    public boolean getPinned() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_page_get_pinned.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.adw_tab_page_get_selected.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_page_get_title.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the tooltip of {@code self}.
     * @return the tooltip of {@code self}
     */
    public @Nullable java.lang.String getTooltip() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_page_get_tooltip.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Sets the icon of {@code self}.
     * <p>
     * {@link TabBar} displays the icon next to the title.
     * <p>
     * It will not show the icon if {@code TabPage:loading} is set to {@code TRUE},
     * or if the page is pinned and [propertyTabPage:indicator-icon] is set.
     * @param icon the icon of {@code self}
     */
    public void setIcon(@Nullable org.gtk.gio.Icon icon) {
        try {
            DowncallHandles.adw_tab_page_set_icon.invokeExact(
                    handle(),
                    (Addressable) (icon == null ? MemoryAddress.NULL : icon.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the indicator of {@code self} is activatable.
     * <p>
     * If set to {@code TRUE}, {@code TabView::indicator-activated} will be emitted
     * when the indicator icon is clicked.
     * <p>
     * If {@code TabPage:indicator-icon} is not set, does nothing.
     * @param activatable whether the indicator is activatable
     */
    public void setIndicatorActivatable(boolean activatable) {
        try {
            DowncallHandles.adw_tab_page_set_indicator_activatable.invokeExact(
                    handle(),
                    activatable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the indicator icon of {@code self}.
     * <p>
     * A common use case is an audio or camera indicator in a web browser.
     * <p>
     * {@link TabBar} will show it at the beginning of the tab, alongside icon
     * representing {@code TabPage:icon} or loading spinner.
     * <p>
     * If the page is pinned, the indicator will be shown instead of icon or
     * spinner.
     * <p>
     * {@code TabPage:indicator-tooltip} can be used to set the tooltip on the
     * indicator icon.
     * <p>
     * If {@code TabPage:indicator-activatable} is set to {@code TRUE}, the
     * indicator icon can act as a button.
     * @param indicatorIcon the indicator icon of {@code self}
     */
    public void setIndicatorIcon(@Nullable org.gtk.gio.Icon indicatorIcon) {
        try {
            DowncallHandles.adw_tab_page_set_indicator_icon.invokeExact(
                    handle(),
                    (Addressable) (indicatorIcon == null ? MemoryAddress.NULL : indicatorIcon.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the tooltip of the indicator icon of {@code self}.
     * <p>
     * The tooltip can be marked up with the Pango text markup language.
     * <p>
     * See {@code TabPage:indicator-icon}.
     * @param tooltip the indicator tooltip of {@code self}
     */
    public void setIndicatorTooltip(@NotNull java.lang.String tooltip) {
        java.util.Objects.requireNonNull(tooltip, "Parameter 'tooltip' must not be null");
        try {
            DowncallHandles.adw_tab_page_set_indicator_tooltip.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tooltip));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} is loading.
     * <p>
     * If set to {@code TRUE}, {@link TabBar} will display a spinner in place of icon.
     * <p>
     * If the page is pinned and {@code TabPage:indicator-icon} is set, the
     * loading status will not be visible.
     * @param loading whether {@code self} is loading
     */
    public void setLoading(boolean loading) {
        try {
            DowncallHandles.adw_tab_page_set_loading.invokeExact(
                    handle(),
                    loading ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} needs attention.
     * <p>
     * {@link TabBar} will display a line under the tab representing the page if
     * set to {@code TRUE}. If the tab is not visible, the corresponding edge of the tab
     * bar will be highlighted.
     * @param needsAttention whether {@code self} needs attention
     */
    public void setNeedsAttention(boolean needsAttention) {
        try {
            DowncallHandles.adw_tab_page_set_needs_attention.invokeExact(
                    handle(),
                    needsAttention ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * {@link TabBar} will display it in the center of the tab unless it's pinned,
     * and will use it as a tooltip unless {@code TabPage:tooltip} is set.
     * <p>
     * Sets the title of {@code self}.
     * @param title the title of {@code self}
     */
    public void setTitle(@NotNull java.lang.String title) {
        java.util.Objects.requireNonNull(title, "Parameter 'title' must not be null");
        try {
            DowncallHandles.adw_tab_page_set_title.invokeExact(
                    handle(),
                    Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the tooltip of {@code self}.
     * <p>
     * The tooltip can be marked up with the Pango text markup language.
     * <p>
     * If not set, {@link TabBar} as a tooltip
     * instead.
     * @param tooltip the tooltip of {@code self}
     */
    public void setTooltip(@NotNull java.lang.String tooltip) {
        java.util.Objects.requireNonNull(tooltip, "Parameter 'tooltip' must not be null");
        try {
            DowncallHandles.adw_tab_page_set_tooltip.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tooltip));
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
            RESULT = (long) DowncallHandles.adw_tab_page_get_type.invokeExact();
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
         * A {@link TabPage.Build} object constructs a {@link TabPage} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TabPage} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TabPage} using {@link TabPage#castFrom}.
         * @return A new instance of {@code TabPage} with the properties 
         *         that were set in the Build object.
         */
        public TabPage construct() {
            return TabPage.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TabPage.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The child of the page.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * The icon of the page.
         * <p>
         * {@link TabBar} displays the icon next to the title.
         * <p>
         * It will not show the icon if {@code TabPage:loading} is set to {@code TRUE},
         * or if the page is pinned and [propertyTabPage:indicator-icon] is set.
         * @param icon The value for the {@code icon} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIcon(org.gtk.gio.Icon icon) {
            names.add("icon");
            values.add(org.gtk.gobject.Value.create(icon));
            return this;
        }
        
        /**
         * Whether the indicator icon is activatable.
         * <p>
         * If set to {@code TRUE}, {@code TabView::indicator-activated} will be emitted
         * when the indicator icon is clicked.
         * <p>
         * If {@code TabPage:indicator-icon} is not set, does nothing.
         * @param indicatorActivatable The value for the {@code indicator-activatable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIndicatorActivatable(boolean indicatorActivatable) {
            names.add("indicator-activatable");
            values.add(org.gtk.gobject.Value.create(indicatorActivatable));
            return this;
        }
        
        /**
         * An indicator icon for the page.
         * <p>
         * A common use case is an audio or camera indicator in a web browser.
         * <p>
         * {@link TabBar} will show it at the beginning of the tab, alongside icon
         * representing {@code TabPage:icon} or loading spinner.
         * <p>
         * If the page is pinned, the indicator will be shown instead of icon or
         * spinner.
         * <p>
         * {@code TabPage:indicator-tooltip} can be used to set the tooltip on the
         * indicator icon.
         * <p>
         * If {@code TabPage:indicator-activatable} is set to {@code TRUE}, the
         * indicator icon can act as a button.
         * @param indicatorIcon The value for the {@code indicator-icon} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIndicatorIcon(org.gtk.gio.Icon indicatorIcon) {
            names.add("indicator-icon");
            values.add(org.gtk.gobject.Value.create(indicatorIcon));
            return this;
        }
        
        /**
         * The tooltip of the indicator icon.
         * <p>
         * The tooltip can be marked up with the Pango text markup language.
         * <p>
         * See {@code TabPage:indicator-icon}.
         * @param indicatorTooltip The value for the {@code indicator-tooltip} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIndicatorTooltip(java.lang.String indicatorTooltip) {
            names.add("indicator-tooltip");
            values.add(org.gtk.gobject.Value.create(indicatorTooltip));
            return this;
        }
        
        /**
         * Whether the page is loading.
         * <p>
         * If set to {@code TRUE}, {@link TabBar} will display a spinner in place of icon.
         * <p>
         * If the page is pinned and {@code TabPage:indicator-icon} is set, the
         * loading status will not be visible.
         * @param loading The value for the {@code loading} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLoading(boolean loading) {
            names.add("loading");
            values.add(org.gtk.gobject.Value.create(loading));
            return this;
        }
        
        /**
         * Whether the page needs attention.
         * <p>
         * {@link TabBar} will display a line under the tab representing the page if
         * set to {@code TRUE}. If the tab is not visible, the corresponding edge of the tab
         * bar will be highlighted.
         * @param needsAttention The value for the {@code needs-attention} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNeedsAttention(boolean needsAttention) {
            names.add("needs-attention");
            values.add(org.gtk.gobject.Value.create(needsAttention));
            return this;
        }
        
        /**
         * The parent page of the page.
         * <p>
         * See {@code TabView.add_page#] and [method@TabView.closePage}.
         * @param parent The value for the {@code parent} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParent(org.gnome.adw.TabPage parent) {
            names.add("parent");
            values.add(org.gtk.gobject.Value.create(parent));
            return this;
        }
        
        /**
         * Whether the page is pinned.
         * <p>
         * See {@code TabView#setPagePinned}.
         * @param pinned The value for the {@code pinned} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPinned(boolean pinned) {
            names.add("pinned");
            values.add(org.gtk.gobject.Value.create(pinned));
            return this;
        }
        
        /**
         * Whether the page is selected.
         * @param selected The value for the {@code selected} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSelected(boolean selected) {
            names.add("selected");
            values.add(org.gtk.gobject.Value.create(selected));
            return this;
        }
        
        /**
         * The title of the page.
         * <p>
         * {@link TabBar} will display it in the center of the tab unless it's pinned,
         * and will use it as a tooltip unless {@code TabPage:tooltip} is set.
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTitle(java.lang.String title) {
            names.add("title");
            values.add(org.gtk.gobject.Value.create(title));
            return this;
        }
        
        /**
         * The tooltip of the page.
         * <p>
         * The tooltip can be marked up with the Pango text markup language.
         * <p>
         * If not set, {@link TabBar} as a tooltip
         * instead.
         * @param tooltip The value for the {@code tooltip} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTooltip(java.lang.String tooltip) {
            names.add("tooltip");
            values.add(org.gtk.gobject.Value.create(tooltip));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_tab_page_get_child = Interop.downcallHandle(
            "adw_tab_page_get_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_page_get_icon = Interop.downcallHandle(
            "adw_tab_page_get_icon",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_page_get_indicator_activatable = Interop.downcallHandle(
            "adw_tab_page_get_indicator_activatable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_page_get_indicator_icon = Interop.downcallHandle(
            "adw_tab_page_get_indicator_icon",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_page_get_indicator_tooltip = Interop.downcallHandle(
            "adw_tab_page_get_indicator_tooltip",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_page_get_loading = Interop.downcallHandle(
            "adw_tab_page_get_loading",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_page_get_needs_attention = Interop.downcallHandle(
            "adw_tab_page_get_needs_attention",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_page_get_parent = Interop.downcallHandle(
            "adw_tab_page_get_parent",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_page_get_pinned = Interop.downcallHandle(
            "adw_tab_page_get_pinned",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_page_get_selected = Interop.downcallHandle(
            "adw_tab_page_get_selected",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_page_get_title = Interop.downcallHandle(
            "adw_tab_page_get_title",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_page_get_tooltip = Interop.downcallHandle(
            "adw_tab_page_get_tooltip",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_page_set_icon = Interop.downcallHandle(
            "adw_tab_page_set_icon",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_page_set_indicator_activatable = Interop.downcallHandle(
            "adw_tab_page_set_indicator_activatable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_tab_page_set_indicator_icon = Interop.downcallHandle(
            "adw_tab_page_set_indicator_icon",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_page_set_indicator_tooltip = Interop.downcallHandle(
            "adw_tab_page_set_indicator_tooltip",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_page_set_loading = Interop.downcallHandle(
            "adw_tab_page_set_loading",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_tab_page_set_needs_attention = Interop.downcallHandle(
            "adw_tab_page_set_needs_attention",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_tab_page_set_title = Interop.downcallHandle(
            "adw_tab_page_set_title",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_page_set_tooltip = Interop.downcallHandle(
            "adw_tab_page_set_tooltip",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_page_get_type = Interop.downcallHandle(
            "adw_tab_page_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
