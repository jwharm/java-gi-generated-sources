package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwTabBar} has a single CSS node with name {@code tabbar}.
 */
public class TabBar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public TabBar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TabBar */
    public static TabBar castFrom(org.gtk.gobject.Object gobject) {
        return new TabBar(gobject.refcounted());
    }
    
    static final MethodHandle adw_tab_bar_new = Interop.downcallHandle(
        "adw_tab_bar_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_tab_bar_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwTabBar}.
     */
    public TabBar() {
        super(constructNew());
    }
    
    static final MethodHandle adw_tab_bar_get_autohide = Interop.downcallHandle(
        "adw_tab_bar_get_autohide",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the tabs automatically hide.
     */
    public boolean getAutohide() {
        try {
            var RESULT = (int) adw_tab_bar_get_autohide.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_bar_get_end_action_widget = Interop.downcallHandle(
        "adw_tab_bar_get_end_action_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the widget shown after the tabs.
     */
    public org.gtk.gtk.Widget getEndActionWidget() {
        try {
            var RESULT = (MemoryAddress) adw_tab_bar_get_end_action_widget.invokeExact(handle());
            return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_bar_get_expand_tabs = Interop.downcallHandle(
        "adw_tab_bar_get_expand_tabs",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether tabs expand to full width.
     */
    public boolean getExpandTabs() {
        try {
            var RESULT = (int) adw_tab_bar_get_expand_tabs.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_bar_get_inverted = Interop.downcallHandle(
        "adw_tab_bar_get_inverted",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether tabs use inverted layout.
     */
    public boolean getInverted() {
        try {
            var RESULT = (int) adw_tab_bar_get_inverted.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_bar_get_is_overflowing = Interop.downcallHandle(
        "adw_tab_bar_get_is_overflowing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} is overflowing.
     */
    public boolean getIsOverflowing() {
        try {
            var RESULT = (int) adw_tab_bar_get_is_overflowing.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_bar_get_start_action_widget = Interop.downcallHandle(
        "adw_tab_bar_get_start_action_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the widget shown before the tabs.
     */
    public org.gtk.gtk.Widget getStartActionWidget() {
        try {
            var RESULT = (MemoryAddress) adw_tab_bar_get_start_action_widget.invokeExact(handle());
            return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_bar_get_tabs_revealed = Interop.downcallHandle(
        "adw_tab_bar_get_tabs_revealed",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the tabs are currently revealed.
     */
    public boolean getTabsRevealed() {
        try {
            var RESULT = (int) adw_tab_bar_get_tabs_revealed.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_bar_get_view = Interop.downcallHandle(
        "adw_tab_bar_get_view",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the tab view {@code self} controls.
     */
    public TabView getView() {
        try {
            var RESULT = (MemoryAddress) adw_tab_bar_get_view.invokeExact(handle());
            return new TabView(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_bar_set_autohide = Interop.downcallHandle(
        "adw_tab_bar_set_autohide",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the tabs automatically hide.
     */
    public void setAutohide(boolean autohide) {
        try {
            adw_tab_bar_set_autohide.invokeExact(handle(), autohide ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_bar_set_end_action_widget = Interop.downcallHandle(
        "adw_tab_bar_set_end_action_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the widget to show after the tabs.
     */
    public void setEndActionWidget(org.gtk.gtk.Widget widget) {
        try {
            adw_tab_bar_set_end_action_widget.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_bar_set_expand_tabs = Interop.downcallHandle(
        "adw_tab_bar_set_expand_tabs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether tabs expand to full width.
     */
    public void setExpandTabs(boolean expandTabs) {
        try {
            adw_tab_bar_set_expand_tabs.invokeExact(handle(), expandTabs ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_bar_set_inverted = Interop.downcallHandle(
        "adw_tab_bar_set_inverted",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether tabs tabs use inverted layout.
     */
    public void setInverted(boolean inverted) {
        try {
            adw_tab_bar_set_inverted.invokeExact(handle(), inverted ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_bar_set_start_action_widget = Interop.downcallHandle(
        "adw_tab_bar_set_start_action_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the widget to show before the tabs.
     */
    public void setStartActionWidget(org.gtk.gtk.Widget widget) {
        try {
            adw_tab_bar_set_start_action_widget.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_bar_set_view = Interop.downcallHandle(
        "adw_tab_bar_set_view",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the tab view {@code self} controls.
     */
    public void setView(TabView view) {
        try {
            adw_tab_bar_set_view.invokeExact(handle(), view.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_bar_setup_extra_drop_target = Interop.downcallHandle(
        "adw_tab_bar_setup_extra_drop_target",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
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
     */
    public void setupExtraDropTarget(org.gtk.gdk.DragAction actions, org.gtk.gobject.Type[] types, long nTypes) {
        try {
            adw_tab_bar_setup_extra_drop_target.invokeExact(handle(), actions.getValue(), Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(types)).handle(), nTypes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ExtraDragDropHandler {
        boolean signalReceived(TabBar source, TabPage page, org.gtk.gobject.Value value);
    }
    
    /**
     * This signal is emitted when content is dropped onto a tab.
     * <p>
     * The content must be of one of the types set up via
     * {@link TabBar#setupExtraDropTarget}.
     * <p>
     * See {@code Gtk.DropTarget::drop}.
     */
    public SignalHandle onExtraDragDrop(ExtraDragDropHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("extra-drag-drop").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TabBar.Callbacks.class, "signalTabBarExtraDragDrop",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static boolean signalTabBarExtraDragDrop(MemoryAddress source, MemoryAddress page, MemoryAddress value, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TabBar.ExtraDragDropHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new TabBar(Refcounted.get(source)), new TabPage(Refcounted.get(page, false)), new org.gtk.gobject.Value(Refcounted.get(value, false)));
        }
        
    }
}