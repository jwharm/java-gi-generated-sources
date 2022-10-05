package org.gtk.gtk;

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

    public Assistant(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Assistant */
    public static Assistant castFrom(org.gtk.gobject.Object gobject) {
        return new Assistant(gobject.refcounted());
    }
    
    static final MethodHandle gtk_assistant_new = Interop.downcallHandle(
        "gtk_assistant_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_assistant_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkAssistant}.
     */
    public Assistant() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_assistant_add_action_widget = Interop.downcallHandle(
        "gtk_assistant_add_action_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a widget to the action area of a {@code GtkAssistant}.
     */
    public void addActionWidget(Widget child) {
        try {
            gtk_assistant_add_action_widget.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_append_page = Interop.downcallHandle(
        "gtk_assistant_append_page",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends a page to the {@code assistant}.
     */
    public int appendPage(Widget page) {
        try {
            var RESULT = (int) gtk_assistant_append_page.invokeExact(handle(), page.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_commit = Interop.downcallHandle(
        "gtk_assistant_commit",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
        try {
            gtk_assistant_commit.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_get_current_page = Interop.downcallHandle(
        "gtk_assistant_get_current_page",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the page number of the current page.
     */
    public int getCurrentPage() {
        try {
            var RESULT = (int) gtk_assistant_get_current_page.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_get_n_pages = Interop.downcallHandle(
        "gtk_assistant_get_n_pages",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of pages in the {@code assistant}
     */
    public int getNPages() {
        try {
            var RESULT = (int) gtk_assistant_get_n_pages.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_get_nth_page = Interop.downcallHandle(
        "gtk_assistant_get_nth_page",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the child widget contained in page number {@code page_num}.
     */
    public Widget getNthPage(int pageNum) {
        try {
            var RESULT = (MemoryAddress) gtk_assistant_get_nth_page.invokeExact(handle(), pageNum);
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_get_page = Interop.downcallHandle(
        "gtk_assistant_get_page",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GtkAssistantPage} object for {@code child}.
     */
    public AssistantPage getPage(Widget child) {
        try {
            var RESULT = (MemoryAddress) gtk_assistant_get_page.invokeExact(handle(), child.handle());
            return new AssistantPage(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_get_page_complete = Interop.downcallHandle(
        "gtk_assistant_get_page_complete",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code page} is complete.
     */
    public boolean getPageComplete(Widget page) {
        try {
            var RESULT = (int) gtk_assistant_get_page_complete.invokeExact(handle(), page.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_get_page_title = Interop.downcallHandle(
        "gtk_assistant_get_page_title",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the title for {@code page}.
     */
    public java.lang.String getPageTitle(Widget page) {
        try {
            var RESULT = (MemoryAddress) gtk_assistant_get_page_title.invokeExact(handle(), page.handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_get_page_type = Interop.downcallHandle(
        "gtk_assistant_get_page_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the page type of {@code page}.
     */
    public AssistantPageType getPageType(Widget page) {
        try {
            var RESULT = (int) gtk_assistant_get_page_type.invokeExact(handle(), page.handle());
            return new AssistantPageType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_get_pages = Interop.downcallHandle(
        "gtk_assistant_get_pages",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a list model of the assistant pages.
     */
    public org.gtk.gio.ListModel getPages() {
        try {
            var RESULT = (MemoryAddress) gtk_assistant_get_pages.invokeExact(handle());
            return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_insert_page = Interop.downcallHandle(
        "gtk_assistant_insert_page",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Inserts a page in the {@code assistant} at a given position.
     */
    public int insertPage(Widget page, int position) {
        try {
            var RESULT = (int) gtk_assistant_insert_page.invokeExact(handle(), page.handle(), position);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_next_page = Interop.downcallHandle(
        "gtk_assistant_next_page",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
        try {
            gtk_assistant_next_page.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_prepend_page = Interop.downcallHandle(
        "gtk_assistant_prepend_page",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prepends a page to the {@code assistant}.
     */
    public int prependPage(Widget page) {
        try {
            var RESULT = (int) gtk_assistant_prepend_page.invokeExact(handle(), page.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_previous_page = Interop.downcallHandle(
        "gtk_assistant_previous_page",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
        try {
            gtk_assistant_previous_page.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_remove_action_widget = Interop.downcallHandle(
        "gtk_assistant_remove_action_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a widget from the action area of a {@code GtkAssistant}.
     */
    public void removeActionWidget(Widget child) {
        try {
            gtk_assistant_remove_action_widget.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_remove_page = Interop.downcallHandle(
        "gtk_assistant_remove_page",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the {@code page_num}’s page from {@code assistant}.
     */
    public void removePage(int pageNum) {
        try {
            gtk_assistant_remove_page.invokeExact(handle(), pageNum);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_set_current_page = Interop.downcallHandle(
        "gtk_assistant_set_current_page",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Switches the page to {@code page_num}.
     * <p>
     * Note that this will only be necessary in custom buttons,
     * as the {@code assistant} flow can be set with
     * gtk_assistant_set_forward_page_func().
     */
    public void setCurrentPage(int pageNum) {
        try {
            gtk_assistant_set_current_page.invokeExact(handle(), pageNum);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_set_forward_page_func = Interop.downcallHandle(
        "gtk_assistant_set_forward_page_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
            gtk_assistant_set_forward_page_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbAssistantPageFunc",
                            MethodType.methodType(int.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(pageFunc.hashCode(), pageFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_set_page_complete = Interop.downcallHandle(
        "gtk_assistant_set_page_complete",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code page} contents are complete.
     * <p>
     * This will make {@code assistant} update the buttons state
     * to be able to continue the task.
     */
    public void setPageComplete(Widget page, boolean complete) {
        try {
            gtk_assistant_set_page_complete.invokeExact(handle(), page.handle(), complete ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_set_page_title = Interop.downcallHandle(
        "gtk_assistant_set_page_title",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a title for {@code page}.
     * <p>
     * The title is displayed in the header area of the assistant
     * when {@code page} is the current page.
     */
    public void setPageTitle(Widget page, java.lang.String title) {
        try {
            gtk_assistant_set_page_title.invokeExact(handle(), page.handle(), Interop.allocateNativeString(title).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_set_page_type = Interop.downcallHandle(
        "gtk_assistant_set_page_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the page type for {@code page}.
     * <p>
     * The page type determines the page behavior in the {@code assistant}.
     */
    public void setPageType(Widget page, AssistantPageType type) {
        try {
            gtk_assistant_set_page_type.invokeExact(handle(), page.handle(), type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_assistant_update_buttons_state = Interop.downcallHandle(
        "gtk_assistant_update_buttons_state",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
        try {
            gtk_assistant_update_buttons_state.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("apply").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Assistant.Callbacks.class, "signalAssistantApply",
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
    public interface CancelHandler {
        void signalReceived(Assistant source);
    }
    
    /**
     * Emitted when then the cancel button is clicked.
     */
    public SignalHandle onCancel(CancelHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("cancel").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Assistant.Callbacks.class, "signalAssistantCancel",
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("close").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Assistant.Callbacks.class, "signalAssistantClose",
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
    public interface EscapeHandler {
        void signalReceived(Assistant source);
    }
    
    /**
     * The action signal for the Escape binding.
     */
    public SignalHandle onEscape(EscapeHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("escape").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Assistant.Callbacks.class, "signalAssistantEscape",
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("prepare").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Assistant.Callbacks.class, "signalAssistantPrepare",
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
    
        public static void signalAssistantApply(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Assistant.ApplyHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Assistant(Refcounted.get(source)));
        }
        
        public static void signalAssistantCancel(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Assistant.CancelHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Assistant(Refcounted.get(source)));
        }
        
        public static void signalAssistantClose(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Assistant.CloseHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Assistant(Refcounted.get(source)));
        }
        
        public static void signalAssistantEscape(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Assistant.EscapeHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Assistant(Refcounted.get(source)));
        }
        
        public static void signalAssistantPrepare(MemoryAddress source, MemoryAddress page, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Assistant.PrepareHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Assistant(Refcounted.get(source)), new Widget(Refcounted.get(page, false)));
        }
        
    }
}
