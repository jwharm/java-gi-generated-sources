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
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TabBar(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TabBar if its GType is a (or inherits from) "AdwTabBar".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "TabBar" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwTabBar", a ClassCastException will be thrown.
     */
    public static TabBar castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwTabBar"))) {
            return new TabBar(gobject.handle(), gobject.refcounted().getOwnership());
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
    
    @FunctionalInterface
    public interface ExtraDragDrop {
        boolean signalReceived(TabBar source, @NotNull org.gnome.adw.TabPage page, @NotNull org.gtk.gobject.Value value);
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
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TabBar.ExtraDragDrop>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_tab_bar_new = Interop.downcallHandle(
            "adw_tab_bar_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_get_autohide = Interop.downcallHandle(
            "adw_tab_bar_get_autohide",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_get_end_action_widget = Interop.downcallHandle(
            "adw_tab_bar_get_end_action_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_get_expand_tabs = Interop.downcallHandle(
            "adw_tab_bar_get_expand_tabs",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_get_inverted = Interop.downcallHandle(
            "adw_tab_bar_get_inverted",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_get_is_overflowing = Interop.downcallHandle(
            "adw_tab_bar_get_is_overflowing",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_get_start_action_widget = Interop.downcallHandle(
            "adw_tab_bar_get_start_action_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_get_tabs_revealed = Interop.downcallHandle(
            "adw_tab_bar_get_tabs_revealed",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_get_view = Interop.downcallHandle(
            "adw_tab_bar_get_view",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_set_autohide = Interop.downcallHandle(
            "adw_tab_bar_set_autohide",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_tab_bar_set_end_action_widget = Interop.downcallHandle(
            "adw_tab_bar_set_end_action_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_set_expand_tabs = Interop.downcallHandle(
            "adw_tab_bar_set_expand_tabs",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_tab_bar_set_inverted = Interop.downcallHandle(
            "adw_tab_bar_set_inverted",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_tab_bar_set_start_action_widget = Interop.downcallHandle(
            "adw_tab_bar_set_start_action_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_set_view = Interop.downcallHandle(
            "adw_tab_bar_set_view",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_tab_bar_setup_extra_drop_target = Interop.downcallHandle(
            "adw_tab_bar_setup_extra_drop_target",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static boolean signalTabBarExtraDragDrop(MemoryAddress source, MemoryAddress page, MemoryAddress value, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TabBar.ExtraDragDrop) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new TabBar(source, Ownership.UNKNOWN), new org.gnome.adw.TabPage(page, Ownership.NONE), new org.gtk.gobject.Value(value, Ownership.NONE));
        }
    }
}
