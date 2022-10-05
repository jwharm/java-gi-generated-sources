package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A dynamic tabbed container.
 * <p>
 * {@code AdwTabView} is a container which shows one child at a time. While it
 * provides keyboard shortcuts for switching between pages, it does not provide
 * a visible tab bar and relies on external widgets for that, such as
 * {@link TabBar}.
 * <p>
 * {@code AdwTabView} maintains a {@link TabPage} object for each page, which holds
 * additional per-page properties. You can obtain the {@code AdwTabPage} for a page
 * with {@link TabView#getPage}, and as the return value for
 * {@link TabView#append} and other functions for adding children.
 * <p>
 * {@code AdwTabView} only aims to be useful for dynamic tabs in multi-window
 * document-based applications, such as web browsers, file managers, text
 * editors or terminals. It does not aim to replace {@link org.gtk.gtk.Notebook} for use
 * cases such as tabbed dialogs.
 * <p>
 * As such, it does not support disabling page reordering or detaching.
 * <p>
 * {@code AdwTabView} adds the following shortcuts in the managed scope:
 * <p>
 * * &lt;kbd>Ctrl</kbd>+<kbd>Page Up</kbd&gt; - switch to the previous page
 * * &lt;kbd>Ctrl</kbd>+<kbd>Page Down</kbd&gt; - switch to the next page
 * * &lt;kbd>Ctrl</kbd>+<kbd>Home</kbd&gt; - switch to the first page
 * * &lt;kbd>Ctrl</kbd>+<kbd>End</kbd&gt; - switch to the last page
 * * &lt;kbd>Ctrl</kbd>+<kbd>Shift</kbd>+<kbd>Page Up</kbd&gt; - move the current page
 *     backward
 * * &lt;kbd>Ctrl</kbd>+<kbd>Shift</kbd>+<kbd>Page Down</kbd&gt; - move the current
 *     page forward
 * * &lt;kbd>Ctrl</kbd>+<kbd>Shift</kbd>+<kbd>Home</kbd&gt; - move the current page at
 *     the start
 * * &lt;kbd>Ctrl</kbd>+<kbd>Shift</kbd>+<kbd>End</kbd&gt; - move the current page at
 *      the end
 * * &lt;kbd>Ctrl</kbd>+<kbd>Tab</kbd&gt; - switch to the next page, with looping
 * * &lt;kbd>Ctrl</kbd>+<kbd>Shift</kbd>+<kbd>Tab</kbd&gt; - switch to the previous
 *     page, with looping
 * * &lt;kbd>Alt</kbd>+<kbd>1</kbd>⋯<kbd>9</kbd&gt; - switch to pages 1-9
 * * &lt;kbd>Alt</kbd>+<kbd>0</kbd&gt; - switch to page 10
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwTabView} has a main CSS node with the name {@code tabview}.
 */
public class TabView extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public TabView(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TabView */
    public static TabView castFrom(org.gtk.gobject.Object gobject) {
        return new TabView(gobject.refcounted());
    }
    
    static final MethodHandle adw_tab_view_new = Interop.downcallHandle(
        "adw_tab_view_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_tab_view_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwTabView}.
     */
    public TabView() {
        super(constructNew());
    }
    
    static final MethodHandle adw_tab_view_add_page = Interop.downcallHandle(
        "adw_tab_view_add_page",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code child} to {@code self} with {@code parent} as the parent.
     * <p>
     * This function can be used to automatically position new pages, and to select
     * the correct page when this page is closed while being selected (see
     * {@link TabView#closePage}).
     * <p>
     * If {@code parent} is {@code NULL}, this function is equivalent to {@link TabView#append}.
     */
    public TabPage addPage(org.gtk.gtk.Widget child, TabPage parent) {
        try {
            var RESULT = (MemoryAddress) adw_tab_view_add_page.invokeExact(handle(), child.handle(), parent.handle());
            return new TabPage(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_append = Interop.downcallHandle(
        "adw_tab_view_append",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts {@code child} as the last non-pinned page.
     */
    public TabPage append(org.gtk.gtk.Widget child) {
        try {
            var RESULT = (MemoryAddress) adw_tab_view_append.invokeExact(handle(), child.handle());
            return new TabPage(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_append_pinned = Interop.downcallHandle(
        "adw_tab_view_append_pinned",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts {@code child} as the last pinned page.
     */
    public TabPage appendPinned(org.gtk.gtk.Widget child) {
        try {
            var RESULT = (MemoryAddress) adw_tab_view_append_pinned.invokeExact(handle(), child.handle());
            return new TabPage(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_close_other_pages = Interop.downcallHandle(
        "adw_tab_view_close_other_pages",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Requests to close all pages other than {@code page}.
     */
    public void closeOtherPages(TabPage page) {
        try {
            adw_tab_view_close_other_pages.invokeExact(handle(), page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_close_page = Interop.downcallHandle(
        "adw_tab_view_close_page",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Requests to close {@code page}.
     * <p>
     * Calling this function will result in the {@code TabView::close-page} signal
     * being emitted for {@code page}. Closing the page can then be confirmed or
     * denied via {@link TabView#closePageFinish}.
     * <p>
     * If the page is waiting for a {@link TabView#closePageFinish} call, this
     * function will do nothing.
     * <p>
     * The default handler for {@code TabView::close-page} will immediately confirm
     * closing the page if it's non-pinned, or reject it if it's pinned. This
     * behavior can be changed by registering your own handler for that signal.
     * <p>
     * If {@code page} was selected, another page will be selected instead:
     * <p>
     * If the {@code TabPage:parent} value is {@code NULL}, the next page will be
     * selected when possible, or if the page was already last, the previous page
     * will be selected instead.
     * <p>
     * If it's not {@code NULL}, the previous page will be selected if it's a descendant
     * (possibly indirect) of the parent. If both the previous page and the parent
     * are pinned, the parent will be selected instead.
     */
    public void closePage(TabPage page) {
        try {
            adw_tab_view_close_page.invokeExact(handle(), page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_close_page_finish = Interop.downcallHandle(
        "adw_tab_view_close_page_finish",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Completes a {@link TabView#closePage} call for {@code page}.
     * <p>
     * If {@code confirm} is {@code TRUE}, {@code page} will be closed. If it's {@code FALSE}, it will be
     * reverted to its previous state and {@link TabView#closePage} can be called
     * for it again.
     * <p>
     * This function should not be called unless a custom handler for
     * {@code TabView::close-page} is used.
     */
    public void closePageFinish(TabPage page, boolean confirm) {
        try {
            adw_tab_view_close_page_finish.invokeExact(handle(), page.handle(), confirm ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_close_pages_after = Interop.downcallHandle(
        "adw_tab_view_close_pages_after",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Requests to close all pages after {@code page}.
     */
    public void closePagesAfter(TabPage page) {
        try {
            adw_tab_view_close_pages_after.invokeExact(handle(), page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_close_pages_before = Interop.downcallHandle(
        "adw_tab_view_close_pages_before",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Requests to close all pages before {@code page}.
     */
    public void closePagesBefore(TabPage page) {
        try {
            adw_tab_view_close_pages_before.invokeExact(handle(), page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_get_default_icon = Interop.downcallHandle(
        "adw_tab_view_get_default_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default icon of {@code self}.
     */
    public org.gtk.gio.Icon getDefaultIcon() {
        try {
            var RESULT = (MemoryAddress) adw_tab_view_get_default_icon.invokeExact(handle());
            return new org.gtk.gio.Icon.IconImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_get_is_transferring_page = Interop.downcallHandle(
        "adw_tab_view_get_is_transferring_page",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Whether a page is being transferred.
     */
    public boolean getIsTransferringPage() {
        try {
            var RESULT = (int) adw_tab_view_get_is_transferring_page.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_get_menu_model = Interop.downcallHandle(
        "adw_tab_view_get_menu_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the tab context menu model for {@code self}.
     */
    public org.gtk.gio.MenuModel getMenuModel() {
        try {
            var RESULT = (MemoryAddress) adw_tab_view_get_menu_model.invokeExact(handle());
            return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_get_n_pages = Interop.downcallHandle(
        "adw_tab_view_get_n_pages",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of pages in {@code self}.
     */
    public int getNPages() {
        try {
            var RESULT = (int) adw_tab_view_get_n_pages.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_get_n_pinned_pages = Interop.downcallHandle(
        "adw_tab_view_get_n_pinned_pages",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of pinned pages in {@code self}.
     */
    public int getNPinnedPages() {
        try {
            var RESULT = (int) adw_tab_view_get_n_pinned_pages.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_get_nth_page = Interop.downcallHandle(
        "adw_tab_view_get_nth_page",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the {@link TabPage} representing the child at {@code position}.
     */
    public TabPage getNthPage(int position) {
        try {
            var RESULT = (MemoryAddress) adw_tab_view_get_nth_page.invokeExact(handle(), position);
            return new TabPage(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_get_page = Interop.downcallHandle(
        "adw_tab_view_get_page",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link TabPage} object representing {@code child}.
     */
    public TabPage getPage(org.gtk.gtk.Widget child) {
        try {
            var RESULT = (MemoryAddress) adw_tab_view_get_page.invokeExact(handle(), child.handle());
            return new TabPage(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_get_page_position = Interop.downcallHandle(
        "adw_tab_view_get_page_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the position of {@code page} in {@code self}, starting from 0.
     */
    public int getPagePosition(TabPage page) {
        try {
            var RESULT = (int) adw_tab_view_get_page_position.invokeExact(handle(), page.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_get_pages = Interop.downcallHandle(
        "adw_tab_view_get_pages",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a {@code Gio.ListModel} that contains the pages of {@code self}.
     * <p>
     * This can be used to keep an up-to-date view. The model also implements
     * {@code Gtk.SelectionModel} and can be used to track and change the selected
     * page.
     */
    public org.gtk.gtk.SelectionModel getPages() {
        try {
            var RESULT = (MemoryAddress) adw_tab_view_get_pages.invokeExact(handle());
            return new org.gtk.gtk.SelectionModel.SelectionModelImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_get_selected_page = Interop.downcallHandle(
        "adw_tab_view_get_selected_page",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the currently selected page in {@code self}.
     */
    public TabPage getSelectedPage() {
        try {
            var RESULT = (MemoryAddress) adw_tab_view_get_selected_page.invokeExact(handle());
            return new TabPage(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_insert = Interop.downcallHandle(
        "adw_tab_view_insert",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Inserts a non-pinned page at {@code position}.
     * <p>
     * It's an error to try to insert a page before a pinned page, in that case
     * {@link TabView#insertPinned} should be used instead.
     */
    public TabPage insert(org.gtk.gtk.Widget child, int position) {
        try {
            var RESULT = (MemoryAddress) adw_tab_view_insert.invokeExact(handle(), child.handle(), position);
            return new TabPage(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_insert_pinned = Interop.downcallHandle(
        "adw_tab_view_insert_pinned",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Inserts a pinned page at {@code position}.
     * <p>
     * It's an error to try to insert a pinned page after a non-pinned page, in
     * that case {@link TabView#insert} should be used instead.
     */
    public TabPage insertPinned(org.gtk.gtk.Widget child, int position) {
        try {
            var RESULT = (MemoryAddress) adw_tab_view_insert_pinned.invokeExact(handle(), child.handle(), position);
            return new TabPage(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_prepend = Interop.downcallHandle(
        "adw_tab_view_prepend",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts {@code child} as the first non-pinned page.
     */
    public TabPage prepend(org.gtk.gtk.Widget child) {
        try {
            var RESULT = (MemoryAddress) adw_tab_view_prepend.invokeExact(handle(), child.handle());
            return new TabPage(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_prepend_pinned = Interop.downcallHandle(
        "adw_tab_view_prepend_pinned",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts {@code child} as the first pinned page.
     */
    public TabPage prependPinned(org.gtk.gtk.Widget child) {
        try {
            var RESULT = (MemoryAddress) adw_tab_view_prepend_pinned.invokeExact(handle(), child.handle());
            return new TabPage(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_reorder_backward = Interop.downcallHandle(
        "adw_tab_view_reorder_backward",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reorders {@code page} to before its previous page if possible.
     */
    public boolean reorderBackward(TabPage page) {
        try {
            var RESULT = (int) adw_tab_view_reorder_backward.invokeExact(handle(), page.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_reorder_first = Interop.downcallHandle(
        "adw_tab_view_reorder_first",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reorders {@code page} to the first possible position.
     */
    public boolean reorderFirst(TabPage page) {
        try {
            var RESULT = (int) adw_tab_view_reorder_first.invokeExact(handle(), page.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_reorder_forward = Interop.downcallHandle(
        "adw_tab_view_reorder_forward",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reorders {@code page} to after its next page if possible.
     */
    public boolean reorderForward(TabPage page) {
        try {
            var RESULT = (int) adw_tab_view_reorder_forward.invokeExact(handle(), page.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_reorder_last = Interop.downcallHandle(
        "adw_tab_view_reorder_last",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reorders {@code page} to the last possible position.
     */
    public boolean reorderLast(TabPage page) {
        try {
            var RESULT = (int) adw_tab_view_reorder_last.invokeExact(handle(), page.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_reorder_page = Interop.downcallHandle(
        "adw_tab_view_reorder_page",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Reorders {@code page} to {@code position}.
     * <p>
     * It's a programmer error to try to reorder a pinned page after a non-pinned
     * one, or a non-pinned page before a pinned one.
     */
    public boolean reorderPage(TabPage page, int position) {
        try {
            var RESULT = (int) adw_tab_view_reorder_page.invokeExact(handle(), page.handle(), position);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_select_next_page = Interop.downcallHandle(
        "adw_tab_view_select_next_page",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Selects the page after the currently selected page.
     * <p>
     * If the last page was already selected, this function does nothing.
     */
    public boolean selectNextPage() {
        try {
            var RESULT = (int) adw_tab_view_select_next_page.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_select_previous_page = Interop.downcallHandle(
        "adw_tab_view_select_previous_page",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Selects the page before the currently selected page.
     * <p>
     * If the first page was already selected, this function does nothing.
     */
    public boolean selectPreviousPage() {
        try {
            var RESULT = (int) adw_tab_view_select_previous_page.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_set_default_icon = Interop.downcallHandle(
        "adw_tab_view_set_default_icon",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the default page icon for {@code self}.
     */
    public void setDefaultIcon(org.gtk.gio.Icon defaultIcon) {
        try {
            adw_tab_view_set_default_icon.invokeExact(handle(), defaultIcon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_set_menu_model = Interop.downcallHandle(
        "adw_tab_view_set_menu_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the tab context menu model for {@code self}.
     */
    public void setMenuModel(org.gtk.gio.MenuModel menuModel) {
        try {
            adw_tab_view_set_menu_model.invokeExact(handle(), menuModel.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_set_page_pinned = Interop.downcallHandle(
        "adw_tab_view_set_page_pinned",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Pins or unpins {@code page}.
     * <p>
     * Pinned pages are guaranteed to be placed before all non-pinned pages; at any
     * given moment the first {@code TabView:n-pinned-pages} pages in {@code self} are
     * guaranteed to be pinned.
     * <p>
     * When a page is pinned or unpinned, it's automatically reordered: pinning a
     * page moves it after other pinned pages; unpinning a page moves it before
     * other non-pinned pages.
     * <p>
     * Pinned pages can still be reordered between each other.
     * <p>
     * {@link TabBar} will display pinned pages in a compact form, never showing the
     * title or close button, and only showing a single icon, selected in the
     * following order:
     * <p>
     * 1. {@code TabPage:indicator-icon}
     * 2. A spinner if {@code TabPage:loading} is {@code TRUE}
     * 3. {@code TabPage:icon}
     * 4. {@code TabView:default-icon}
     * <p>
     * Pinned pages cannot be closed by default, see {@code TabView::close-page}
     * for how to override that behavior.
     * <p>
     * Changes the value of the {@code TabPage:pinned} property.
     */
    public void setPagePinned(TabPage page, boolean pinned) {
        try {
            adw_tab_view_set_page_pinned.invokeExact(handle(), page.handle(), pinned ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_set_selected_page = Interop.downcallHandle(
        "adw_tab_view_set_selected_page",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the currently selected page in {@code self}.
     */
    public void setSelectedPage(TabPage selectedPage) {
        try {
            adw_tab_view_set_selected_page.invokeExact(handle(), selectedPage.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_tab_view_transfer_page = Interop.downcallHandle(
        "adw_tab_view_transfer_page",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Transfers {@code page} from {@code self} to {@code other_view}.
     * <p>
     * The {@code page} object will be reused.
     * <p>
     * It's a programmer error to try to insert a pinned page after a non-pinned
     * one, or a non-pinned page before a pinned one.
     */
    public void transferPage(TabPage page, TabView otherView, int position) {
        try {
            adw_tab_view_transfer_page.invokeExact(handle(), page.handle(), otherView.handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ClosePageHandler {
        boolean signalReceived(TabView source, TabPage page);
    }
    
    /**
     * Emitted after {@code page.
     * 
     * The handler is expected to call [method@TabView.close_page_finish} to
     * confirm or reject the closing.
     * <p>
     * The default handler will immediately confirm closing for non-pinned pages,
     * or reject it for pinned pages, equivalent to the following example:
     * <p>
     * <pre>{@code c
     * static gboolean
     * close_page_cb (AdwTabView *view,
     *                AdwTabPage *page,
     *                gpointer    user_data)
     * {
     *   adw_tab_view_close_page_finish (view, page, !adw_tab_page_get_pinned (page));
     * 
     *   return GDK_EVENT_STOP;
     * }
     * }</pre>
     * <p>
     * The {@link TabView#closePageFinish} call doesn't have to happen inside
     * the handler, so can be used to do asynchronous checks before confirming the
     * closing.
     * <p>
     * A typical reason to connect to this signal is to show a confirmation dialog
     * for closing a tab.
     */
    public SignalHandle onClosePage(ClosePageHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("close-page").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TabView.Callbacks.class, "signalTabViewClosePage",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CreateWindowHandler {
        void signalReceived(TabView source);
    }
    
    /**
     * Emitted when a tab should be transferred into a new window.
     * <p>
     * This can happen after a tab has been dropped on desktop.
     * <p>
     * The signal handler is expected to create a new window, position it as
     * needed and return its {@code AdwTabView} that the page will be transferred into.
     */
    public SignalHandle onCreateWindow(CreateWindowHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("create-window").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TabView.Callbacks.class, "signalTabViewCreateWindow",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface IndicatorActivatedHandler {
        void signalReceived(TabView source, TabPage page);
    }
    
    /**
     * Emitted after the indicator icon on {@code page} has been activated.
     * <p>
     * See {@code TabPage:indicator-icon} and
     * {@code TabPage:indicator-activatable}.
     */
    public SignalHandle onIndicatorActivated(IndicatorActivatedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("indicator-activated").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TabView.Callbacks.class, "signalTabViewIndicatorActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PageAttachedHandler {
        void signalReceived(TabView source, TabPage page, int position);
    }
    
    /**
     * Emitted when a page has been created or transferred to {@code self}.
     * <p>
     * A typical reason to connect to this signal would be to connect to page
     * signals for things such as updating window title.
     */
    public SignalHandle onPageAttached(PageAttachedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("page-attached").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TabView.Callbacks.class, "signalTabViewPageAttached",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PageDetachedHandler {
        void signalReceived(TabView source, TabPage page, int position);
    }
    
    /**
     * Emitted when a page has been removed or transferred to another view.
     * <p>
     * A typical reason to connect to this signal would be to disconnect signal
     * handlers connected in the {@code TabView::page-attached} handler.
     * <p>
     * It is important not to try and destroy the page child in the handler of
     * this function as the child might merely be moved to another window; use
     * child dispose handler for that or do it in sync with your
     * {@link TabView#closePageFinish} calls.
     */
    public SignalHandle onPageDetached(PageDetachedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("page-detached").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TabView.Callbacks.class, "signalTabViewPageDetached",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PageReorderedHandler {
        void signalReceived(TabView source, TabPage page, int position);
    }
    
    /**
     * Emitted after {@code page} has been reordered to {@code position}.
     */
    public SignalHandle onPageReordered(PageReorderedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("page-reordered").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TabView.Callbacks.class, "signalTabViewPageReordered",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SetupMenuHandler {
        void signalReceived(TabView source, TabPage page);
    }
    
    /**
     * Emitted when a context menu is opened or closed for {@code page}.
     * <p>
     * If the menu has been closed, {@code page} will be set to {@code NULL}.
     * <p>
     * It can be used to set up menu actions before showing the menu, for example
     * disable actions not applicable to {@code page}.
     */
    public SignalHandle onSetupMenu(SetupMenuHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("setup-menu").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TabView.Callbacks.class, "signalTabViewSetupMenu",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static boolean signalTabViewClosePage(MemoryAddress source, MemoryAddress page, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TabView.ClosePageHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new TabView(Refcounted.get(source)), new TabPage(Refcounted.get(page, false)));
        }
        
        public static void signalTabViewCreateWindow(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TabView.CreateWindowHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TabView(Refcounted.get(source)));
        }
        
        public static void signalTabViewIndicatorActivated(MemoryAddress source, MemoryAddress page, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TabView.IndicatorActivatedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TabView(Refcounted.get(source)), new TabPage(Refcounted.get(page, false)));
        }
        
        public static void signalTabViewPageAttached(MemoryAddress source, MemoryAddress page, int position, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TabView.PageAttachedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TabView(Refcounted.get(source)), new TabPage(Refcounted.get(page, false)), position);
        }
        
        public static void signalTabViewPageDetached(MemoryAddress source, MemoryAddress page, int position, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TabView.PageDetachedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TabView(Refcounted.get(source)), new TabPage(Refcounted.get(page, false)), position);
        }
        
        public static void signalTabViewPageReordered(MemoryAddress source, MemoryAddress page, int position, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TabView.PageReorderedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TabView(Refcounted.get(source)), new TabPage(Refcounted.get(page, false)), position);
        }
        
        public static void signalTabViewSetupMenu(MemoryAddress source, MemoryAddress page, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TabView.SetupMenuHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TabView(Refcounted.get(source)), new TabPage(Refcounted.get(page, false)));
        }
        
    }
}
