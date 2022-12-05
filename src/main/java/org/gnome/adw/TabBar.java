package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A tab bar for {@link TabView}.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="tab-bar-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="tab-bar.png" alt="tab-bar"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwTabBar} widget is a tab bar that can be used with conjunction with
 * {@code AdwTabView}.
 * <p>
 * {@code AdwTabBar} can autohide and can optionally contain action widgets on both
 * sides of the tabs.
 * <p>
 * When there's not enough space to show all the tabs, {@code AdwTabBar} will scroll
 * them. Pinned tabs always stay visible and aren't a part of the scrollable
 * area.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwTabBar} has a single CSS node with name {@code tabbar}.
 * @version 1.0
 */
public class TabBar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwTabBar";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TabBar proxy instance for the provided memory address.
     * <p>
     * Because TabBar is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TabBar(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to TabBar if its GType is a (or inherits from) "AdwTabBar".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TabBar} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwTabBar", a ClassCastException will be thrown.
     */
    public static TabBar castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), TabBar.getType())) {
            return new TabBar(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwTabBar");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_bar_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwTabBar}.
     */
    public TabBar() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Gets whether the tabs automatically hide.
     * @return whether the tabs automatically hide
     */
    public boolean getAutohide() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_bar_get_autohide.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the widget shown after the tabs.
     * @return the widget shown after the tabs
     */
    public @Nullable org.gtk.gtk.Widget getEndActionWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_bar_get_end_action_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether tabs expand to full width.
     * @return whether tabs expand to full width.
     */
    public boolean getExpandTabs() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_bar_get_expand_tabs.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether tabs use inverted layout.
     * @return whether tabs use inverted layout
     */
    public boolean getInverted() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_bar_get_inverted.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} is overflowing.
     * <p>
     * If {@code TRUE}, all tabs cannot be displayed at once and require scrolling.
     * @return whether {@code self} is overflowing
     */
    public boolean getIsOverflowing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_bar_get_is_overflowing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the widget shown before the tabs.
     * @return the widget shown before the tabs
     */
    public @Nullable org.gtk.gtk.Widget getStartActionWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_bar_get_start_action_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether the tabs are currently revealed.
     * <p>
     * See {@code TabBar:autohide}.
     * @return whether the tabs are currently revealed
     */
    public boolean getTabsRevealed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_bar_get_tabs_revealed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the tab view {@code self} controls.
     * @return the view {@code self} controls
     */
    public @Nullable org.gnome.adw.TabView getView() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_bar_get_view.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.TabView(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets whether the tabs automatically hide.
     * <p>
     * If set to {@code TRUE}, the tab bar disappears when {@code TabBar:view} has 0
     * or 1 tab, no pinned tabs, and no tab is being transferred.
     * <p>
     * See {@code TabBar:tabs-revealed}.
     * @param autohide whether the tabs automatically hide
     */
    public void setAutohide(boolean autohide) {
        try {
            DowncallHandles.adw_tab_bar_set_autohide.invokeExact(
                    handle(),
                    autohide ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the widget to show after the tabs.
     * @param widget the widget to show after the tabs
     */
    public void setEndActionWidget(@Nullable org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.adw_tab_bar_set_end_action_widget.invokeExact(
                    handle(),
                    (Addressable) (widget == null ? MemoryAddress.NULL : widget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether tabs expand to full width.
     * <p>
     * If set to {@code TRUE}, the tabs will always vary width filling the whole width
     * when possible, otherwise tabs will always have the minimum possible size.
     * @param expandTabs whether to expand tabs
     */
    public void setExpandTabs(boolean expandTabs) {
        try {
            DowncallHandles.adw_tab_bar_set_expand_tabs.invokeExact(
                    handle(),
                    expandTabs ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether tabs tabs use inverted layout.
     * <p>
     * If set to {@code TRUE}, non-pinned tabs will have the close button at the beginning
     * and the indicator at the end rather than the opposite.
     * @param inverted whether tabs use inverted layout
     */
    public void setInverted(boolean inverted) {
        try {
            DowncallHandles.adw_tab_bar_set_inverted.invokeExact(
                    handle(),
                    inverted ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the widget to show before the tabs.
     * @param widget the widget to show before the tabs
     */
    public void setStartActionWidget(@Nullable org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.adw_tab_bar_set_start_action_widget.invokeExact(
                    handle(),
                    (Addressable) (widget == null ? MemoryAddress.NULL : widget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the tab view {@code self} controls.
     * @param view a tab view
     */
    public void setView(@Nullable org.gnome.adw.TabView view) {
        try {
            DowncallHandles.adw_tab_bar_set_view.invokeExact(
                    handle(),
                    (Addressable) (view == null ? MemoryAddress.NULL : view.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the supported types for this drop target.
     * <p>
     * Sets up an extra drop target on tabs.
     * <p>
     * This allows to drag arbitrary content onto tabs, for example URLs in a web
     * browser.
     * <p>
     * If a tab is hovered for a certain period of time while dragging the content,
     * it will be automatically selected.
     * <p>
     * The {@code TabBar::extra-drag-drop} signal can be used to handle the drop.
     * @param actions the supported actions
     * @param types all supported {@code GType}s that can be dropped
     * @param nTypes number of {@code types}
     */
    public void setupExtraDropTarget(@NotNull org.gtk.gdk.DragAction actions, @Nullable org.gtk.glib.Type[] types, long nTypes) {
        java.util.Objects.requireNonNull(actions, "Parameter 'actions' must not be null");
        try {
            DowncallHandles.adw_tab_bar_setup_extra_drop_target.invokeExact(
                    handle(),
                    actions.getValue(),
                    (Addressable) (types == null ? MemoryAddress.NULL : Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(types), false)),
                    nTypes);
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
            RESULT = (long) DowncallHandles.adw_tab_bar_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface ExtraDragDrop {
        boolean signalReceived(TabBar sourceTabBar, @NotNull org.gnome.adw.TabPage page, @NotNull org.gtk.gobject.Value value);
    }
    
    /**
     * This signal is emitted when content is dropped onto a tab.
     * <p>
     * The content must be of one of the types set up via
     * {@code TabBar#setupExtraDropTarget}.
     * <p>
     * See {@code Gtk.DropTarget::drop}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TabBar.ExtraDragDrop> onExtraDragDrop(TabBar.ExtraDragDrop handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("extra-drag-drop"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TabBar.Callbacks.class, "signalTabBarExtraDragDrop",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TabBar.ExtraDragDrop>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link TabBar.Build} object constructs a {@link TabBar} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TabBar} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TabBar} using {@link TabBar#castFrom}.
         * @return A new instance of {@code TabBar} with the properties 
         *         that were set in the Build object.
         */
        public TabBar construct() {
            return TabBar.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TabBar.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Whether the tabs automatically hide.
         * <p>
         * If set to {@code TRUE}, the tab bar disappears when {@code TabBar:view} has 0
         * or 1 tab, no pinned tabs, and no tab is being transferred.
         * <p>
         * See {@code TabBar:tabs-revealed}.
         * @param autohide The value for the {@code autohide} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAutohide(boolean autohide) {
            names.add("autohide");
            values.add(org.gtk.gobject.Value.create(autohide));
            return this;
        }
        
        /**
         * The widget shown after the tabs.
         * @param endActionWidget The value for the {@code end-action-widget} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEndActionWidget(org.gtk.gtk.Widget endActionWidget) {
            names.add("end-action-widget");
            values.add(org.gtk.gobject.Value.create(endActionWidget));
            return this;
        }
        
        /**
         * Whether tabs expand to full width.
         * <p>
         * If set to {@code TRUE}, the tabs will always vary width filling the whole width
         * when possible, otherwise tabs will always have the minimum possible size.
         * @param expandTabs The value for the {@code expand-tabs} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setExpandTabs(boolean expandTabs) {
            names.add("expand-tabs");
            values.add(org.gtk.gobject.Value.create(expandTabs));
            return this;
        }
        
        /**
         * Whether tabs use inverted layout.
         * <p>
         * If set to {@code TRUE}, non-pinned tabs will have the close button at the
         * beginning and the indicator at the end rather than the opposite.
         * @param inverted The value for the {@code inverted} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInverted(boolean inverted) {
            names.add("inverted");
            values.add(org.gtk.gobject.Value.create(inverted));
            return this;
        }
        
        /**
         * Whether the tab bar is overflowing.
         * <p>
         * If {@code TRUE}, all tabs cannot be displayed at once and require scrolling.
         * @param isOverflowing The value for the {@code is-overflowing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsOverflowing(boolean isOverflowing) {
            names.add("is-overflowing");
            values.add(org.gtk.gobject.Value.create(isOverflowing));
            return this;
        }
        
        /**
         * The widget shown before the tabs.
         * @param startActionWidget The value for the {@code start-action-widget} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStartActionWidget(org.gtk.gtk.Widget startActionWidget) {
            names.add("start-action-widget");
            values.add(org.gtk.gobject.Value.create(startActionWidget));
            return this;
        }
        
        /**
         * Whether the tabs are currently revealed.
         * <p>
         * See {@code TabBar:autohide}.
         * @param tabsRevealed The value for the {@code tabs-revealed} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTabsRevealed(boolean tabsRevealed) {
            names.add("tabs-revealed");
            values.add(org.gtk.gobject.Value.create(tabsRevealed));
            return this;
        }
        
        /**
         * The tab view the tab bar controls.
         * @param view The value for the {@code view} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setView(org.gnome.adw.TabView view) {
            names.add("view");
            values.add(org.gtk.gobject.Value.create(view));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_tab_bar_new = Interop.downcallHandle(
            "adw_tab_bar_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_get_autohide = Interop.downcallHandle(
            "adw_tab_bar_get_autohide",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_get_end_action_widget = Interop.downcallHandle(
            "adw_tab_bar_get_end_action_widget",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_get_expand_tabs = Interop.downcallHandle(
            "adw_tab_bar_get_expand_tabs",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_get_inverted = Interop.downcallHandle(
            "adw_tab_bar_get_inverted",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_get_is_overflowing = Interop.downcallHandle(
            "adw_tab_bar_get_is_overflowing",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_get_start_action_widget = Interop.downcallHandle(
            "adw_tab_bar_get_start_action_widget",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_get_tabs_revealed = Interop.downcallHandle(
            "adw_tab_bar_get_tabs_revealed",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_get_view = Interop.downcallHandle(
            "adw_tab_bar_get_view",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_set_autohide = Interop.downcallHandle(
            "adw_tab_bar_set_autohide",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_tab_bar_set_end_action_widget = Interop.downcallHandle(
            "adw_tab_bar_set_end_action_widget",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_set_expand_tabs = Interop.downcallHandle(
            "adw_tab_bar_set_expand_tabs",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_tab_bar_set_inverted = Interop.downcallHandle(
            "adw_tab_bar_set_inverted",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_tab_bar_set_start_action_widget = Interop.downcallHandle(
            "adw_tab_bar_set_start_action_widget",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_set_view = Interop.downcallHandle(
            "adw_tab_bar_set_view",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_setup_extra_drop_target = Interop.downcallHandle(
            "adw_tab_bar_setup_extra_drop_target",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle adw_tab_bar_get_type = Interop.downcallHandle(
            "adw_tab_bar_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static boolean signalTabBarExtraDragDrop(MemoryAddress sourceTabBar, MemoryAddress page, MemoryAddress value, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (TabBar.ExtraDragDrop) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new TabBar(sourceTabBar, Ownership.NONE), new org.gnome.adw.TabPage(page, Ownership.NONE), new org.gtk.gobject.Value(value, Ownership.NONE));
        }
    }
}
