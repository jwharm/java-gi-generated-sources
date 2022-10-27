package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * with {@code TabView#getPage}, and as the return value for
 * {@code TabView#append} and other functions for adding children.
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
 * * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Page Up&lt;/kbd&gt; - switch to the previous page
 * * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Page Down&lt;/kbd&gt; - switch to the next page
 * * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Home&lt;/kbd&gt; - switch to the first page
 * * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;End&lt;/kbd&gt; - switch to the last page
 * * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Shift&lt;/kbd&gt;+&lt;kbd&gt;Page Up&lt;/kbd&gt; - move the current page
 *     backward
 * * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Shift&lt;/kbd&gt;+&lt;kbd&gt;Page Down&lt;/kbd&gt; - move the current
 *     page forward
 * * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Shift&lt;/kbd&gt;+&lt;kbd&gt;Home&lt;/kbd&gt; - move the current page at
 *     the start
 * * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Shift&lt;/kbd&gt;+&lt;kbd&gt;End&lt;/kbd&gt; - move the current page at
 *      the end
 * * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Tab&lt;/kbd&gt; - switch to the next page, with looping
 * * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Shift&lt;/kbd&gt;+&lt;kbd&gt;Tab&lt;/kbd&gt; - switch to the previous
 *     page, with looping
 * * &lt;kbd&gt;Alt&lt;/kbd&gt;+&lt;kbd&gt;1&lt;/kbd&gt;⋯&lt;kbd&gt;9&lt;/kbd&gt; - switch to pages 1-9
 * * &lt;kbd&gt;Alt&lt;/kbd&gt;+&lt;kbd&gt;0&lt;/kbd&gt; - switch to page 10
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwTabView} has a main CSS node with the name {@code tabview}.
 * @version 1.0
 */
public class TabView extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
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
    
    public TabView(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TabView */
    public static TabView castFrom(org.gtk.gobject.Object gobject) {
        return new TabView(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_tab_view_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwTabView}.
     */
    public TabView() {
        super(constructNew());
    }
    
    /**
     * Adds {@code child} to {@code self} with {@code parent} as the parent.
     * <p>
     * This function can be used to automatically position new pages, and to select
     * the correct page when this page is closed while being selected (see
     * {@code TabView#closePage}).
     * <p>
     * If {@code parent} is {@code NULL}, this function is equivalent to {@code TabView#append}.
     * @param child a widget to add
     * @param parent a parent page for {@code child}
     * @return the page object representing {@code child}
     */
    public @NotNull org.gnome.adw.TabPage addPage(@NotNull org.gtk.gtk.Widget child, @Nullable org.gnome.adw.TabPage parent) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNullElse(parent, MemoryAddress.NULL);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_view_add_page.invokeExact(handle(), child.handle(), parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.TabPage(Refcounted.get(RESULT, false));
    }
    
    /**
     * Inserts {@code child} as the last non-pinned page.
     * @param child a widget to add
     * @return the page object representing {@code child}
     */
    public @NotNull org.gnome.adw.TabPage append(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_view_append.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.TabPage(Refcounted.get(RESULT, false));
    }
    
    /**
     * Inserts {@code child} as the last pinned page.
     * @param child a widget to add
     * @return the page object representing {@code child}
     */
    public @NotNull org.gnome.adw.TabPage appendPinned(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_view_append_pinned.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.TabPage(Refcounted.get(RESULT, false));
    }
    
    /**
     * Requests to close all pages other than {@code page}.
     * @param page a page of {@code self}
     */
    public void closeOtherPages(@NotNull org.gnome.adw.TabPage page) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        try {
            DowncallHandles.adw_tab_view_close_other_pages.invokeExact(handle(), page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Requests to close {@code page}.
     * <p>
     * Calling this function will result in the {@code TabView::close-page} signal
     * being emitted for {@code page}. Closing the page can then be confirmed or
     * denied via {@code TabView#closePageFinish}.
     * <p>
     * If the page is waiting for a {@code TabView#closePageFinish} call, this
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
     * @param page a page of {@code self}
     */
    public void closePage(@NotNull org.gnome.adw.TabPage page) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        try {
            DowncallHandles.adw_tab_view_close_page.invokeExact(handle(), page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Completes a {@code TabView#closePage} call for {@code page}.
     * <p>
     * If {@code confirm} is {@code TRUE}, {@code page} will be closed. If it's {@code FALSE}, it will be
     * reverted to its previous state and {@code TabView#closePage} can be called
     * for it again.
     * <p>
     * This function should not be called unless a custom handler for
     * {@code TabView::close-page} is used.
     * @param page a page of {@code self}
     * @param confirm whether to confirm or deny closing {@code page}
     */
    public void closePageFinish(@NotNull org.gnome.adw.TabPage page, boolean confirm) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        try {
            DowncallHandles.adw_tab_view_close_page_finish.invokeExact(handle(), page.handle(), confirm ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Requests to close all pages after {@code page}.
     * @param page a page of {@code self}
     */
    public void closePagesAfter(@NotNull org.gnome.adw.TabPage page) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        try {
            DowncallHandles.adw_tab_view_close_pages_after.invokeExact(handle(), page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Requests to close all pages before {@code page}.
     * @param page a page of {@code self}
     */
    public void closePagesBefore(@NotNull org.gnome.adw.TabPage page) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        try {
            DowncallHandles.adw_tab_view_close_pages_before.invokeExact(handle(), page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the default icon of {@code self}.
     * @return the default icon of {@code self}.
     */
    public @NotNull org.gtk.gio.Icon getDefaultIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_view_get_default_icon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Icon.IconImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Whether a page is being transferred.
     * @return whether a page is being transferred
     */
    public boolean getIsTransferringPage() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_view_get_is_transferring_page.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the tab context menu model for {@code self}.
     * @return the tab context menu model for {@code self}
     */
    public @Nullable org.gtk.gio.MenuModel getMenuModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_view_get_menu_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the number of pages in {@code self}.
     * @return the number of pages in {@code self}
     */
    public int getNPages() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_view_get_n_pages.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the number of pinned pages in {@code self}.
     * @return the number of pinned pages in {@code self}
     */
    public int getNPinnedPages() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_view_get_n_pinned_pages.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@link TabPage} representing the child at {@code position}.
     * @param position the index of the page in {@code self}, starting from 0
     * @return the page object at {@code position}
     */
    public @NotNull org.gnome.adw.TabPage getNthPage(int position) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_view_get_nth_page.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.TabPage(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the {@link TabPage} object representing {@code child}.
     * @param child a child in {@code self}
     * @return the page object for {@code child}
     */
    public @NotNull org.gnome.adw.TabPage getPage(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_view_get_page.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.TabPage(Refcounted.get(RESULT, false));
    }
    
    /**
     * Finds the position of {@code page} in {@code self}, starting from 0.
     * @param page a page of {@code self}
     * @return the position of {@code page} in {@code self}
     */
    public int getPagePosition(@NotNull org.gnome.adw.TabPage page) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_view_get_page_position.invokeExact(handle(), page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a {@code Gio.ListModel} that contains the pages of {@code self}.
     * <p>
     * This can be used to keep an up-to-date view. The model also implements
     * {@code Gtk.SelectionModel} and can be used to track and change the selected
     * page.
     * @return a {@code GtkSelectionModel} for the pages of {@code self}
     */
    public @NotNull org.gtk.gtk.SelectionModel getPages() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_view_get_pages.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.SelectionModel.SelectionModelImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets the currently selected page in {@code self}.
     * @return the selected page
     */
    public @Nullable org.gnome.adw.TabPage getSelectedPage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_view_get_selected_page.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.TabPage(Refcounted.get(RESULT, false));
    }
    
    /**
     * Inserts a non-pinned page at {@code position}.
     * <p>
     * It's an error to try to insert a page before a pinned page, in that case
     * {@code TabView#insertPinned} should be used instead.
     * @param child a widget to add
     * @param position the position to add {@code child} at, starting from 0
     * @return the page object representing {@code child}
     */
    public @NotNull org.gnome.adw.TabPage insert(@NotNull org.gtk.gtk.Widget child, int position) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_view_insert.invokeExact(handle(), child.handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.TabPage(Refcounted.get(RESULT, false));
    }
    
    /**
     * Inserts a pinned page at {@code position}.
     * <p>
     * It's an error to try to insert a pinned page after a non-pinned page, in
     * that case {@code TabView#insert} should be used instead.
     * @param child a widget to add
     * @param position the position to add {@code child} at, starting from 0
     * @return the page object representing {@code child}
     */
    public @NotNull org.gnome.adw.TabPage insertPinned(@NotNull org.gtk.gtk.Widget child, int position) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_view_insert_pinned.invokeExact(handle(), child.handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.TabPage(Refcounted.get(RESULT, false));
    }
    
    /**
     * Inserts {@code child} as the first non-pinned page.
     * @param child a widget to add
     * @return the page object representing {@code child}
     */
    public @NotNull org.gnome.adw.TabPage prepend(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_view_prepend.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.TabPage(Refcounted.get(RESULT, false));
    }
    
    /**
     * Inserts {@code child} as the first pinned page.
     * @param child a widget to add
     * @return the page object representing {@code child}
     */
    public @NotNull org.gnome.adw.TabPage prependPinned(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_tab_view_prepend_pinned.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.TabPage(Refcounted.get(RESULT, false));
    }
    
    /**
     * Reorders {@code page} to before its previous page if possible.
     * @param page a page of {@code self}
     * @return whether {@code page} was moved
     */
    public boolean reorderBackward(@NotNull org.gnome.adw.TabPage page) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_view_reorder_backward.invokeExact(handle(), page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Reorders {@code page} to the first possible position.
     * @param page a page of {@code self}
     * @return whether {@code page} was moved
     */
    public boolean reorderFirst(@NotNull org.gnome.adw.TabPage page) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_view_reorder_first.invokeExact(handle(), page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Reorders {@code page} to after its next page if possible.
     * @param page a page of {@code self}
     * @return whether {@code page} was moved
     */
    public boolean reorderForward(@NotNull org.gnome.adw.TabPage page) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_view_reorder_forward.invokeExact(handle(), page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Reorders {@code page} to the last possible position.
     * @param page a page of {@code self}
     * @return whether {@code page} was moved
     */
    public boolean reorderLast(@NotNull org.gnome.adw.TabPage page) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_view_reorder_last.invokeExact(handle(), page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Reorders {@code page} to {@code position}.
     * <p>
     * It's a programmer error to try to reorder a pinned page after a non-pinned
     * one, or a non-pinned page before a pinned one.
     * @param page a page of {@code self}
     * @param position the position to insert the page at, starting at 0
     * @return whether {@code page} was moved
     */
    public boolean reorderPage(@NotNull org.gnome.adw.TabPage page, int position) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_view_reorder_page.invokeExact(handle(), page.handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Selects the page after the currently selected page.
     * <p>
     * If the last page was already selected, this function does nothing.
     * @return whether the selected page was changed
     */
    public boolean selectNextPage() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_view_select_next_page.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Selects the page before the currently selected page.
     * <p>
     * If the first page was already selected, this function does nothing.
     * @return whether the selected page was changed
     */
    public boolean selectPreviousPage() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_tab_view_select_previous_page.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the default page icon for {@code self}.
     * @param defaultIcon the default icon
     */
    public void setDefaultIcon(@NotNull org.gtk.gio.Icon defaultIcon) {
        java.util.Objects.requireNonNull(defaultIcon, "Parameter 'defaultIcon' must not be null");
        try {
            DowncallHandles.adw_tab_view_set_default_icon.invokeExact(handle(), defaultIcon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the tab context menu model for {@code self}.
     * @param menuModel a menu model
     */
    public void setMenuModel(@Nullable org.gtk.gio.MenuModel menuModel) {
        java.util.Objects.requireNonNullElse(menuModel, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_tab_view_set_menu_model.invokeExact(handle(), menuModel.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param page a page of {@code self}
     * @param pinned whether {@code page} should be pinned
     */
    public void setPagePinned(@NotNull org.gnome.adw.TabPage page, boolean pinned) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        try {
            DowncallHandles.adw_tab_view_set_page_pinned.invokeExact(handle(), page.handle(), pinned ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the currently selected page in {@code self}.
     * @param selectedPage a page in {@code self}
     */
    public void setSelectedPage(@NotNull org.gnome.adw.TabPage selectedPage) {
        java.util.Objects.requireNonNull(selectedPage, "Parameter 'selectedPage' must not be null");
        try {
            DowncallHandles.adw_tab_view_set_selected_page.invokeExact(handle(), selectedPage.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Transfers {@code page} from {@code self} to {@code other_view}.
     * <p>
     * The {@code page} object will be reused.
     * <p>
     * It's a programmer error to try to insert a pinned page after a non-pinned
     * one, or a non-pinned page before a pinned one.
     * @param page a page of {@code self}
     * @param otherView the tab view to transfer the page to
     * @param position the position to insert the page at, starting at 0
     */
    public void transferPage(@NotNull org.gnome.adw.TabPage page, @NotNull org.gnome.adw.TabView otherView, int position) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        java.util.Objects.requireNonNull(otherView, "Parameter 'otherView' must not be null");
        try {
            DowncallHandles.adw_tab_view_transfer_page.invokeExact(handle(), page.handle(), otherView.handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ClosePage {
        boolean signalReceived(TabView source, @NotNull org.gnome.adw.TabPage page);
    }
    
    /**
     * Emitted after {@code TabView#closePage} has been called for {@code page}.
     * <p>
     * The handler is expected to call {@code TabView#closePageFinish} to
     * confirm or reject the closing.
     * <p>
     * The default handler will immediately confirm closing for non-pinned pages,
     * or reject it for pinned pages, equivalent to the following example:
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
     * The {@code TabView#closePageFinish} call doesn't have to happen inside
     * the handler, so can be used to do asynchronous checks before confirming the
     * closing.
     * <p>
     * A typical reason to connect to this signal is to show a confirmation dialog
     * for closing a tab.
     */
    public Signal<TabView.ClosePage> onClosePage(TabView.ClosePage handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("close-page"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TabView.Callbacks.class, "signalTabViewClosePage",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TabView.ClosePage>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CreateWindow {
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
    public Signal<TabView.CreateWindow> onCreateWindow(TabView.CreateWindow handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("create-window"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TabView.Callbacks.class, "signalTabViewCreateWindow",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TabView.CreateWindow>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface IndicatorActivated {
        void signalReceived(TabView source, @NotNull org.gnome.adw.TabPage page);
    }
    
    /**
     * Emitted after the indicator icon on {@code page} has been activated.
     * <p>
     * See {@code TabPage:indicator-icon} and
     * {@code TabPage:indicator-activatable}.
     */
    public Signal<TabView.IndicatorActivated> onIndicatorActivated(TabView.IndicatorActivated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("indicator-activated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TabView.Callbacks.class, "signalTabViewIndicatorActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TabView.IndicatorActivated>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PageAttached {
        void signalReceived(TabView source, @NotNull org.gnome.adw.TabPage page, int position);
    }
    
    /**
     * Emitted when a page has been created or transferred to {@code self}.
     * <p>
     * A typical reason to connect to this signal would be to connect to page
     * signals for things such as updating window title.
     */
    public Signal<TabView.PageAttached> onPageAttached(TabView.PageAttached handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("page-attached"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TabView.Callbacks.class, "signalTabViewPageAttached",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TabView.PageAttached>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PageDetached {
        void signalReceived(TabView source, @NotNull org.gnome.adw.TabPage page, int position);
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
     * {@code TabView#closePageFinish} calls.
     */
    public Signal<TabView.PageDetached> onPageDetached(TabView.PageDetached handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("page-detached"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TabView.Callbacks.class, "signalTabViewPageDetached",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TabView.PageDetached>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PageReordered {
        void signalReceived(TabView source, @NotNull org.gnome.adw.TabPage page, int position);
    }
    
    /**
     * Emitted after {@code page} has been reordered to {@code position}.
     */
    public Signal<TabView.PageReordered> onPageReordered(TabView.PageReordered handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("page-reordered"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TabView.Callbacks.class, "signalTabViewPageReordered",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TabView.PageReordered>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SetupMenu {
        void signalReceived(TabView source, @Nullable org.gnome.adw.TabPage page);
    }
    
    /**
     * Emitted when a context menu is opened or closed for {@code page}.
     * <p>
     * If the menu has been closed, {@code page} will be set to {@code NULL}.
     * <p>
     * It can be used to set up menu actions before showing the menu, for example
     * disable actions not applicable to {@code page}.
     */
    public Signal<TabView.SetupMenu> onSetupMenu(TabView.SetupMenu handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("setup-menu"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TabView.Callbacks.class, "signalTabViewSetupMenu",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TabView.SetupMenu>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_tab_view_new = Interop.downcallHandle(
            "adw_tab_view_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_add_page = Interop.downcallHandle(
            "adw_tab_view_add_page",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_append = Interop.downcallHandle(
            "adw_tab_view_append",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_append_pinned = Interop.downcallHandle(
            "adw_tab_view_append_pinned",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_close_other_pages = Interop.downcallHandle(
            "adw_tab_view_close_other_pages",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_close_page = Interop.downcallHandle(
            "adw_tab_view_close_page",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_close_page_finish = Interop.downcallHandle(
            "adw_tab_view_close_page_finish",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_tab_view_close_pages_after = Interop.downcallHandle(
            "adw_tab_view_close_pages_after",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_close_pages_before = Interop.downcallHandle(
            "adw_tab_view_close_pages_before",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_get_default_icon = Interop.downcallHandle(
            "adw_tab_view_get_default_icon",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_get_is_transferring_page = Interop.downcallHandle(
            "adw_tab_view_get_is_transferring_page",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_get_menu_model = Interop.downcallHandle(
            "adw_tab_view_get_menu_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_get_n_pages = Interop.downcallHandle(
            "adw_tab_view_get_n_pages",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_get_n_pinned_pages = Interop.downcallHandle(
            "adw_tab_view_get_n_pinned_pages",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_get_nth_page = Interop.downcallHandle(
            "adw_tab_view_get_nth_page",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_tab_view_get_page = Interop.downcallHandle(
            "adw_tab_view_get_page",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_get_page_position = Interop.downcallHandle(
            "adw_tab_view_get_page_position",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_get_pages = Interop.downcallHandle(
            "adw_tab_view_get_pages",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_get_selected_page = Interop.downcallHandle(
            "adw_tab_view_get_selected_page",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_insert = Interop.downcallHandle(
            "adw_tab_view_insert",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_tab_view_insert_pinned = Interop.downcallHandle(
            "adw_tab_view_insert_pinned",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_tab_view_prepend = Interop.downcallHandle(
            "adw_tab_view_prepend",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_prepend_pinned = Interop.downcallHandle(
            "adw_tab_view_prepend_pinned",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_reorder_backward = Interop.downcallHandle(
            "adw_tab_view_reorder_backward",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_reorder_first = Interop.downcallHandle(
            "adw_tab_view_reorder_first",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_reorder_forward = Interop.downcallHandle(
            "adw_tab_view_reorder_forward",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_reorder_last = Interop.downcallHandle(
            "adw_tab_view_reorder_last",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_reorder_page = Interop.downcallHandle(
            "adw_tab_view_reorder_page",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_tab_view_select_next_page = Interop.downcallHandle(
            "adw_tab_view_select_next_page",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_select_previous_page = Interop.downcallHandle(
            "adw_tab_view_select_previous_page",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_set_default_icon = Interop.downcallHandle(
            "adw_tab_view_set_default_icon",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_set_menu_model = Interop.downcallHandle(
            "adw_tab_view_set_menu_model",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_set_page_pinned = Interop.downcallHandle(
            "adw_tab_view_set_page_pinned",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_tab_view_set_selected_page = Interop.downcallHandle(
            "adw_tab_view_set_selected_page",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_tab_view_transfer_page = Interop.downcallHandle(
            "adw_tab_view_transfer_page",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
    
    private static class Callbacks {
        
        public static boolean signalTabViewClosePage(MemoryAddress source, MemoryAddress page, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TabView.ClosePage) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new TabView(Refcounted.get(source)), new org.gnome.adw.TabPage(Refcounted.get(page, false)));
        }
        
        public static void signalTabViewCreateWindow(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TabView.CreateWindow) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TabView(Refcounted.get(source)));
        }
        
        public static void signalTabViewIndicatorActivated(MemoryAddress source, MemoryAddress page, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TabView.IndicatorActivated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TabView(Refcounted.get(source)), new org.gnome.adw.TabPage(Refcounted.get(page, false)));
        }
        
        public static void signalTabViewPageAttached(MemoryAddress source, MemoryAddress page, int position, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TabView.PageAttached) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TabView(Refcounted.get(source)), new org.gnome.adw.TabPage(Refcounted.get(page, false)), position);
        }
        
        public static void signalTabViewPageDetached(MemoryAddress source, MemoryAddress page, int position, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TabView.PageDetached) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TabView(Refcounted.get(source)), new org.gnome.adw.TabPage(Refcounted.get(page, false)), position);
        }
        
        public static void signalTabViewPageReordered(MemoryAddress source, MemoryAddress page, int position, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TabView.PageReordered) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TabView(Refcounted.get(source)), new org.gnome.adw.TabPage(Refcounted.get(page, false)), position);
        }
        
        public static void signalTabViewSetupMenu(MemoryAddress source, MemoryAddress page, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TabView.SetupMenu) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TabView(Refcounted.get(source)), new org.gnome.adw.TabPage(Refcounted.get(page, false)));
        }
    }
}
