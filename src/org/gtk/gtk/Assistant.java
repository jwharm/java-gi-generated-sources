package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkAssistant` is used to represent a complex as a series of steps.
 * 
 * ![An example GtkAssistant](assistant.png)
 * 
 * Each step consists of one or more pages. `GtkAssistant` guides the user
 * through the pages, and controls the page flow to collect the data needed
 * for the operation.
 * 
 * `GtkAssistant` handles which buttons to show and to make sensitive based
 * on page sequence knowledge and the [enum@Gtk.AssistantPageType] of each
 * page in addition to state information like the *completed* and *committed*
 * page statuses.
 * 
 * If you have a case that doesn’t quite fit in `GtkAssistant`s way of
 * handling buttons, you can use the %GTK_ASSISTANT_PAGE_CUSTOM page
 * type and handle buttons yourself.
 * 
 * `GtkAssistant` maintains a `GtkAssistantPage` object for each added
 * child, which holds additional per-child properties. You
 * obtain the `GtkAssistantPage` for a child with [method@Gtk.Assistant.get_page].
 * 
 * # GtkAssistant as GtkBuildable
 * 
 * The `GtkAssistant` implementation of the `GtkBuildable` interface
 * exposes the @action_area as internal children with the name
 * “action_area”.
 * 
 * To add pages to an assistant in `GtkBuilder`, simply add it as a
 * child to the `GtkAssistant` object. If you need to set per-object
 * properties, create a `GtkAssistantPage` object explicitly, and
 * set the child widget as a property on it.
 * 
 * # CSS nodes
 * 
 * `GtkAssistant` has a single CSS node with the name window and style
 * class .assistant.
 */
public class Assistant extends Window implements Accessible, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public Assistant(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Assistant */
    public static Assistant castFrom(org.gtk.gobject.Object gobject) {
        return new Assistant(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkAssistant`.
     */
    public Assistant() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_new(), false));
    }
    
    /**
     * Adds a widget to the action area of a `GtkAssistant`.
     */
    public void addActionWidget(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_add_action_widget(HANDLE(), child.HANDLE());
    }
    
    /**
     * Appends a page to the @assistant.
     */
    public int appendPage(Widget page) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_append_page(HANDLE(), page.HANDLE());
        return RESULT;
    }
    
    /**
     * Erases the visited page history.
     * 
     * GTK will then hide the back button on the current page,
     * and removes the cancel button from subsequent pages.
     * 
     * Use this when the information provided up to the current
     * page is hereafter deemed permanent and cannot be modified
     * or undone. For example, showing a progress page to track
     * a long-running, unreversible operation after the user has
     * clicked apply on a confirmation page.
     */
    public void commit() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_commit(HANDLE());
    }
    
    /**
     * Returns the page number of the current page.
     */
    public int getCurrentPage() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_get_current_page(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the number of pages in the @assistant
     */
    public int getNPages() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_get_n_pages(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the child widget contained in page number @page_num.
     */
    public Widget getNthPage(int pageNum) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_get_nth_page(HANDLE(), pageNum);
        return new Widget(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns the `GtkAssistantPage` object for @child.
     */
    public AssistantPage getPage(Widget child) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_get_page(HANDLE(), child.HANDLE());
        return new AssistantPage(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets whether @page is complete.
     */
    public boolean getPageComplete(Widget page) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_get_page_complete(HANDLE(), page.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the title for @page.
     */
    public java.lang.String getPageTitle(Widget page) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_get_page_title(HANDLE(), page.HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the page type of @page.
     */
    public AssistantPageType getPageType(Widget page) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_get_page_type(HANDLE(), page.HANDLE());
        return AssistantPageType.fromValue(RESULT);
    }
    
    /**
     * Gets a list model of the assistant pages.
     */
    public org.gtk.gio.ListModel getPages() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_get_pages(HANDLE());
        return new org.gtk.gio.ListModel.ListModelImpl(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Inserts a page in the @assistant at a given position.
     */
    public int insertPage(Widget page, int position) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_insert_page(HANDLE(), page.HANDLE(), position);
        return RESULT;
    }
    
    /**
     * Navigate to the next page.
     * 
     * It is a programming error to call this function when
     * there is no next page.
     * 
     * This function is for use when creating pages of the
     * %GTK_ASSISTANT_PAGE_CUSTOM type.
     */
    public void nextPage() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_next_page(HANDLE());
    }
    
    /**
     * Prepends a page to the @assistant.
     */
    public int prependPage(Widget page) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_prepend_page(HANDLE(), page.HANDLE());
        return RESULT;
    }
    
    /**
     * Navigate to the previous visited page.
     * 
     * It is a programming error to call this function when
     * no previous page is available.
     * 
     * This function is for use when creating pages of the
     * %GTK_ASSISTANT_PAGE_CUSTOM type.
     */
    public void previousPage() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_previous_page(HANDLE());
    }
    
    /**
     * Removes a widget from the action area of a `GtkAssistant`.
     */
    public void removeActionWidget(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_remove_action_widget(HANDLE(), child.HANDLE());
    }
    
    /**
     * Removes the @page_num’s page from @assistant.
     */
    public void removePage(int pageNum) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_remove_page(HANDLE(), pageNum);
    }
    
    /**
     * Switches the page to @page_num.
     * 
     * Note that this will only be necessary in custom buttons,
     * as the @assistant flow can be set with
     * gtk_assistant_set_forward_page_func().
     */
    public void setCurrentPage(int pageNum) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_set_current_page(HANDLE(), pageNum);
    }
    
    /**
     * Sets whether @page contents are complete.
     * 
     * This will make @assistant update the buttons state
     * to be able to continue the task.
     */
    public void setPageComplete(Widget page, boolean complete) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_set_page_complete(HANDLE(), page.HANDLE(), complete ? 1 : 0);
    }
    
    /**
     * Sets a title for @page.
     * 
     * The title is displayed in the header area of the assistant
     * when @page is the current page.
     */
    public void setPageTitle(Widget page, java.lang.String title) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_set_page_title(HANDLE(), page.HANDLE(), Interop.getAllocator().allocateUtf8String(title));
    }
    
    /**
     * Sets the page type for @page.
     * 
     * The page type determines the page behavior in the @assistant.
     */
    public void setPageType(Widget page, AssistantPageType type) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_set_page_type(HANDLE(), page.HANDLE(), type.getValue());
    }
    
    /**
     * Forces @assistant to recompute the buttons state.
     * 
     * GTK automatically takes care of this in most situations,
     * e.g. when the user goes to a different page, or when the
     * visibility or completeness of a page changes.
     * 
     * One situation where it can be necessary to call this
     * function is when changing a value on the current page
     * affects the future page flow of the assistant.
     */
    public void updateButtonsState() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_update_buttons_state(HANDLE());
    }
    
    @FunctionalInterface
    public interface ApplyHandler {
        void signalReceived(Assistant source);
    }
    
    /**
     * Emitted when the apply button is clicked.
     * 
     * The default behavior of the `GtkAssistant` is to switch to the page
     * after the current page, unless the current page is the last one.
     * 
     * A handler for the ::apply signal should carry out the actions for
     * which the wizard has collected data. If the action takes a long time
     * to complete, you might consider putting a page of type
     * %GTK_ASSISTANT_PAGE_PROGRESS after the confirmation page and handle
     * this operation within the [signal@Gtk.Assistant::prepare] signal of
     * the progress page.
     */
    public void onApply(ApplyHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAssistantApply", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("apply"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface CancelHandler {
        void signalReceived(Assistant source);
    }
    
    /**
     * Emitted when then the cancel button is clicked.
     */
    public void onCancel(CancelHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAssistantCancel", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("cancel"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface CloseHandler {
        void signalReceived(Assistant source);
    }
    
    /**
     * Emitted either when the close button of a summary page is clicked,
     * or when the apply button in the last page in the flow (of type
     * %GTK_ASSISTANT_PAGE_CONFIRM) is clicked.
     */
    public void onClose(CloseHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAssistantClose", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("close"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface EscapeHandler {
        void signalReceived(Assistant source);
    }
    
    /**
     * The action signal for the Escape binding.
     */
    public void onEscape(EscapeHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAssistantEscape", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("escape"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PrepareHandler {
        void signalReceived(Assistant source, Widget page);
    }
    
    /**
     * Emitted when a new page is set as the assistant's current page,
     * before making the new page visible.
     * 
     * A handler for this signal can do any preparations which are
     * necessary before showing @page.
     */
    public void onPrepare(PrepareHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAssistantPrepare", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("prepare"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
