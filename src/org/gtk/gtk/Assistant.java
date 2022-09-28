package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkAssistant} is used to represent a complex as a series of steps.
 * <p>
 * <img src="./doc-files/assistant.png" alt="An example GtkAssistant">
 * <p>
 * Each step consists of one or more pages. {@code GtkAssistant} guides the user
 * through the pages, and controls the page flow to collect the data needed
 * for the operation.
 * <p>
 * {@code GtkAssistant} handles which buttons to show and to make sensitive based
 * on page sequence knowledge and the {@code Gtk.AssistantPageType} of each
 * page in addition to state information like the <strong>completed* and *committed</strong>
 * page statuses.
 * <p>
 * If you have a case that doesn’t quite fit in {@code GtkAssistant}s way of
 * handling buttons, you can use the {@link AssistantPageType#CUSTOM} page
 * type and handle buttons yourself.
 * <p>
 * {@code GtkAssistant} maintains a {@code GtkAssistantPage} object for each added
 * child, which holds additional per-child properties. You
 * obtain the {@code GtkAssistantPage} for a child with {@link Assistant#getPage}.
 * <p>
 * <h1>GtkAssistant as GtkBuildable</h1>
 * <p>
 * The {@code GtkAssistant} implementation of the {@code GtkBuildable} interface
 * exposes the {@code action_area} as internal children with the name
 * “action_area”.
 * <p>
 * To add pages to an assistant in {@code GtkBuilder}, simply add it as a
 * child to the {@code GtkAssistant} object. If you need to set per-object
 * properties, create a {@code GtkAssistantPage} object explicitly, and
 * set the child widget as a property on it.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * {@code GtkAssistant} has a single CSS node with the name window and style
 * class .assistant.
 */
public class Assistant extends Window implements Accessible, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public Assistant(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Assistant */
    public static Assistant castFrom(org.gtk.gobject.Object gobject) {
        return new Assistant(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_assistant_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkAssistant}.
     */
    public Assistant() {
        super(constructNew());
    }
    
    /**
     * Adds a widget to the action area of a {@code GtkAssistant}.
     */
    public void addActionWidget(Widget child) {
        gtk_h.gtk_assistant_add_action_widget(handle(), child.handle());
    }
    
    /**
     * Appends a page to the {@code assistant}.
     */
    public int appendPage(Widget page) {
        var RESULT = gtk_h.gtk_assistant_append_page(handle(), page.handle());
        return RESULT;
    }
    
    /**
     * Erases the visited page history.
     * <p>
     * GTK will then hide the back button on the current page,
     * and removes the cancel button from subsequent pages.
     * <p>
     * Use this when the information provided up to the current
     * page is hereafter deemed permanent and cannot be modified
     * or undone. For example, showing a progress page to track
     * a long-running, unreversible operation after the user has
     * clicked apply on a confirmation page.
     */
    public void commit() {
        gtk_h.gtk_assistant_commit(handle());
    }
    
    /**
     * Returns the page number of the current page.
     */
    public int getCurrentPage() {
        var RESULT = gtk_h.gtk_assistant_get_current_page(handle());
        return RESULT;
    }
    
    /**
     * Returns the number of pages in the {@code assistant}
     */
    public int getNPages() {
        var RESULT = gtk_h.gtk_assistant_get_n_pages(handle());
        return RESULT;
    }
    
    /**
     * Returns the child widget contained in page number {@code page_num}.
     */
    public Widget getNthPage(int pageNum) {
        var RESULT = gtk_h.gtk_assistant_get_nth_page(handle(), pageNum);
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns the {@code GtkAssistantPage} object for {@code child}.
     */
    public AssistantPage getPage(Widget child) {
        var RESULT = gtk_h.gtk_assistant_get_page(handle(), child.handle());
        return new AssistantPage(References.get(RESULT, false));
    }
    
    /**
     * Gets whether {@code page} is complete.
     */
    public boolean getPageComplete(Widget page) {
        var RESULT = gtk_h.gtk_assistant_get_page_complete(handle(), page.handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the title for {@code page}.
     */
    public java.lang.String getPageTitle(Widget page) {
        var RESULT = gtk_h.gtk_assistant_get_page_title(handle(), page.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the page type of {@code page}.
     */
    public AssistantPageType getPageType(Widget page) {
        var RESULT = gtk_h.gtk_assistant_get_page_type(handle(), page.handle());
        return new AssistantPageType(RESULT);
    }
    
    /**
     * Gets a list model of the assistant pages.
     */
    public org.gtk.gio.ListModel getPages() {
        var RESULT = gtk_h.gtk_assistant_get_pages(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, true));
    }
    
    /**
     * Inserts a page in the {@code assistant} at a given position.
     */
    public int insertPage(Widget page, int position) {
        var RESULT = gtk_h.gtk_assistant_insert_page(handle(), page.handle(), position);
        return RESULT;
    }
    
    /**
     * Navigate to the next page.
     * <p>
     * It is a programming error to call this function when
     * there is no next page.
     * <p>
     * This function is for use when creating pages of the
     * {@link AssistantPageType#CUSTOM} type.
     */
    public void nextPage() {
        gtk_h.gtk_assistant_next_page(handle());
    }
    
    /**
     * Prepends a page to the {@code assistant}.
     */
    public int prependPage(Widget page) {
        var RESULT = gtk_h.gtk_assistant_prepend_page(handle(), page.handle());
        return RESULT;
    }
    
    /**
     * Navigate to the previous visited page.
     * <p>
     * It is a programming error to call this function when
     * no previous page is available.
     * <p>
     * This function is for use when creating pages of the
     * {@link AssistantPageType#CUSTOM} type.
     */
    public void previousPage() {
        gtk_h.gtk_assistant_previous_page(handle());
    }
    
    /**
     * Removes a widget from the action area of a {@code GtkAssistant}.
     */
    public void removeActionWidget(Widget child) {
        gtk_h.gtk_assistant_remove_action_widget(handle(), child.handle());
    }
    
    /**
     * Removes the {@code page_num}’s page from {@code assistant}.
     */
    public void removePage(int pageNum) {
        gtk_h.gtk_assistant_remove_page(handle(), pageNum);
    }
    
    /**
     * Switches the page to {@code page_num}.
     * <p>
     * Note that this will only be necessary in custom buttons,
     * as the {@code assistant} flow can be set with
     * gtk_assistant_set_forward_page_func().
     */
    public void setCurrentPage(int pageNum) {
        gtk_h.gtk_assistant_set_current_page(handle(), pageNum);
    }
    
    /**
     * Sets the page forwarding function to be {@code page_func}.
     * <p>
     * This function will be used to determine what will be
     * the next page when the user presses the forward button.
     * Setting {@code page_func} to {@code null} will make the assistant to
     * use the default forward function, which just goes to the
     * next visible page.
     */
    public void setForwardPageFunc(AssistantPageFunc pageFunc) {
        try {
            gtk_h.gtk_assistant_set_forward_page_func(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbAssistantPageFunc",
                            MethodType.methodType(int.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(pageFunc.hashCode(), pageFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets whether {@code page} contents are complete.
     * <p>
     * This will make {@code assistant} update the buttons state
     * to be able to continue the task.
     */
    public void setPageComplete(Widget page, boolean complete) {
        gtk_h.gtk_assistant_set_page_complete(handle(), page.handle(), complete ? 1 : 0);
    }
    
    /**
     * Sets a title for {@code page}.
     * <p>
     * The title is displayed in the header area of the assistant
     * when {@code page} is the current page.
     */
    public void setPageTitle(Widget page, java.lang.String title) {
        gtk_h.gtk_assistant_set_page_title(handle(), page.handle(), Interop.allocateNativeString(title).handle());
    }
    
    /**
     * Sets the page type for {@code page}.
     * <p>
     * The page type determines the page behavior in the {@code assistant}.
     */
    public void setPageType(Widget page, AssistantPageType type) {
        gtk_h.gtk_assistant_set_page_type(handle(), page.handle(), type.getValue());
    }
    
    /**
     * Forces {@code assistant} to recompute the buttons state.
     * <p>
     * GTK automatically takes care of this in most situations,
     * e.g. when the user goes to a different page, or when the
     * visibility or completeness of a page changes.
     * <p>
     * One situation where it can be necessary to call this
     * function is when changing a value on the current page
     * affects the future page flow of the assistant.
     */
    public void updateButtonsState() {
        gtk_h.gtk_assistant_update_buttons_state(handle());
    }
    
    @FunctionalInterface
    public interface ApplyHandler {
        void signalReceived(Assistant source);
    }
    
    /**
     * Emitted when the apply button is clicked.
     * <p>
     * The default behavior of the {@code GtkAssistant} is to switch to the page
     * after the current page, unless the current page is the last one.
     * <p>
     * A handler for the ::apply signal should carry out the actions for
     * which the wizard has collected data. If the action takes a long time
     * to complete, you might consider putting a page of type
     * {@link AssistantPageType#PROGRESS} after the confirmation page and handle
     * this operation within the {@code Gtk.Assistant::prepare} signal of
     * the progress page.
     */
    public SignalHandle onApply(ApplyHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("apply").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Assistant.Callbacks.class, "signalAssistantApply",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
    public SignalHandle onCancel(CancelHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("cancel").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Assistant.Callbacks.class, "signalAssistantCancel",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
     * {@link AssistantPageType#CONFIRM}) is clicked.
     */
    public SignalHandle onClose(CloseHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("close").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Assistant.Callbacks.class, "signalAssistantClose",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
    public SignalHandle onEscape(EscapeHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("escape").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Assistant.Callbacks.class, "signalAssistantEscape",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
     * <p>
     * A handler for this signal can do any preparations which are
     * necessary before showing {@code page}.
     */
    public SignalHandle onPrepare(PrepareHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("prepare").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Assistant.Callbacks.class, "signalAssistantPrepare",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalAssistantApply(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Assistant.ApplyHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Assistant(References.get(source)));
        }
        
        public static void signalAssistantCancel(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Assistant.CancelHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Assistant(References.get(source)));
        }
        
        public static void signalAssistantClose(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Assistant.CloseHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Assistant(References.get(source)));
        }
        
        public static void signalAssistantEscape(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Assistant.EscapeHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Assistant(References.get(source)));
        }
        
        public static void signalAssistantPrepare(MemoryAddress source, MemoryAddress page, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Assistant.PrepareHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Assistant(References.get(source)), new Widget(References.get(page, false)));
        }
        
    }
}
