package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * page in addition to state information like the <em>completed</em> and <em>committed</em>
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
 * <strong>GtkAssistant as GtkBuildable</strong><br/>
 * The {@code GtkAssistant} implementation of the {@code GtkBuildable} interface
 * exposes the {@code action_area} as internal children with the name
 * “action_area”.
 * <p>
 * To add pages to an assistant in {@code GtkBuilder}, simply add it as a
 * child to the {@code GtkAssistant} object. If you need to set per-object
 * properties, create a {@code GtkAssistantPage} object explicitly, and
 * set the child widget as a property on it.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkAssistant} has a single CSS node with the name window and style
 * class .assistant.
 */
public class Assistant extends org.gtk.gtk.Window implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkAssistant";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Assistant proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Assistant(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Assistant> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Assistant(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_assistant_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkAssistant}.
     */
    public Assistant() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Adds a widget to the action area of a {@code GtkAssistant}.
     * @param child a {@code GtkWidget}
     */
    public void addActionWidget(org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_assistant_add_action_widget.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Appends a page to the {@code assistant}.
     * @param page a {@code GtkWidget}
     * @return the index (starting at 0) of the inserted page
     */
    public int appendPage(org.gtk.gtk.Widget page) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_assistant_append_page.invokeExact(
                    handle(),
                    page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try {
            DowncallHandles.gtk_assistant_commit.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the page number of the current page.
     * @return The index (starting from 0) of the current
     *   page in the {@code assistant}, or -1 if the {@code assistant} has no pages,
     *   or no current page
     */
    public int getCurrentPage() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_assistant_get_current_page.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the number of pages in the {@code assistant}
     * @return the number of pages in the {@code assistant}
     */
    public int getNPages() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_assistant_get_n_pages.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the child widget contained in page number {@code page_num}.
     * @param pageNum the index of a page in the {@code assistant},
     *   or -1 to get the last page
     * @return the child widget, or {@code null}
     *   if {@code page_num} is out of bounds
     */
    public @Nullable org.gtk.gtk.Widget getNthPage(int pageNum) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_assistant_get_nth_page.invokeExact(
                    handle(),
                    pageNum);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns the {@code GtkAssistantPage} object for {@code child}.
     * @param child a child of {@code assistant}
     * @return the {@code GtkAssistantPage} for {@code child}
     */
    public org.gtk.gtk.AssistantPage getPage(org.gtk.gtk.Widget child) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_assistant_get_page.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.AssistantPage) Interop.register(RESULT, org.gtk.gtk.AssistantPage.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets whether {@code page} is complete.
     * @param page a page of {@code assistant}
     * @return {@code true} if {@code page} is complete.
     */
    public boolean getPageComplete(org.gtk.gtk.Widget page) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_assistant_get_page_complete.invokeExact(
                    handle(),
                    page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the title for {@code page}.
     * @param page a page of {@code assistant}
     * @return the title for {@code page}
     */
    public java.lang.String getPageTitle(org.gtk.gtk.Widget page) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_assistant_get_page_title.invokeExact(
                    handle(),
                    page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the page type of {@code page}.
     * @param page a page of {@code assistant}
     * @return the page type of {@code page}
     */
    public org.gtk.gtk.AssistantPageType getPageType(org.gtk.gtk.Widget page) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_assistant_get_page_type.invokeExact(
                    handle(),
                    page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.AssistantPageType.of(RESULT);
    }
    
    /**
     * Gets a list model of the assistant pages.
     * @return A list model of the pages.
     */
    public org.gtk.gio.ListModel getPages() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_assistant_get_pages.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gio.ListModel) Interop.register(RESULT, org.gtk.gio.ListModel.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Inserts a page in the {@code assistant} at a given position.
     * @param page a {@code GtkWidget}
     * @param position the index (starting at 0) at which to insert the page,
     *   or -1 to append the page to the {@code assistant}
     * @return the index (starting from 0) of the inserted page
     */
    public int insertPage(org.gtk.gtk.Widget page, int position) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_assistant_insert_page.invokeExact(
                    handle(),
                    page.handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try {
            DowncallHandles.gtk_assistant_next_page.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Prepends a page to the {@code assistant}.
     * @param page a {@code GtkWidget}
     * @return the index (starting at 0) of the inserted page
     */
    public int prependPage(org.gtk.gtk.Widget page) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_assistant_prepend_page.invokeExact(
                    handle(),
                    page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try {
            DowncallHandles.gtk_assistant_previous_page.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a widget from the action area of a {@code GtkAssistant}.
     * @param child a {@code GtkWidget}
     */
    public void removeActionWidget(org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_assistant_remove_action_widget.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes the {@code page_num}’s page from {@code assistant}.
     * @param pageNum the index of a page in the {@code assistant},
     *   or -1 to remove the last page
     */
    public void removePage(int pageNum) {
        try {
            DowncallHandles.gtk_assistant_remove_page.invokeExact(
                    handle(),
                    pageNum);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Switches the page to {@code page_num}.
     * <p>
     * Note that this will only be necessary in custom buttons,
     * as the {@code assistant} flow can be set with
     * gtk_assistant_set_forward_page_func().
     * @param pageNum index of the page to switch to, starting from 0.
     *   If negative, the last page will be used. If greater
     *   than the number of pages in the {@code assistant}, nothing
     *   will be done.
     */
    public void setCurrentPage(int pageNum) {
        try {
            DowncallHandles.gtk_assistant_set_current_page.invokeExact(
                    handle(),
                    pageNum);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the page forwarding function to be {@code page_func}.
     * <p>
     * This function will be used to determine what will be
     * the next page when the user presses the forward button.
     * Setting {@code page_func} to {@code null} will make the assistant to
     * use the default forward function, which just goes to the
     * next visible page.
     * @param pageFunc the {@code GtkAssistantPageFunc}, or {@code null}
     *   to use the default one
     * @param destroy destroy notifier for {@code data}
     */
    public void setForwardPageFunc(@Nullable org.gtk.gtk.AssistantPageFunc pageFunc, org.gtk.glib.DestroyNotify destroy) {
        try {
            DowncallHandles.gtk_assistant_set_forward_page_func.invokeExact(
                    handle(),
                    (Addressable) (pageFunc == null ? MemoryAddress.NULL : (Addressable) pageFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroy.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code page} contents are complete.
     * <p>
     * This will make {@code assistant} update the buttons state
     * to be able to continue the task.
     * @param page a page of {@code assistant}
     * @param complete the completeness status of the page
     */
    public void setPageComplete(org.gtk.gtk.Widget page, boolean complete) {
        try {
            DowncallHandles.gtk_assistant_set_page_complete.invokeExact(
                    handle(),
                    page.handle(),
                    Marshal.booleanToInteger.marshal(complete, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a title for {@code page}.
     * <p>
     * The title is displayed in the header area of the assistant
     * when {@code page} is the current page.
     * @param page a page of {@code assistant}
     * @param title the new title for {@code page}
     */
    public void setPageTitle(org.gtk.gtk.Widget page, java.lang.String title) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_assistant_set_page_title.invokeExact(
                        handle(),
                        page.handle(),
                        Marshal.stringToAddress.marshal(title, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the page type for {@code page}.
     * <p>
     * The page type determines the page behavior in the {@code assistant}.
     * @param page a page of {@code assistant}
     * @param type the new type for {@code page}
     */
    public void setPageType(org.gtk.gtk.Widget page, org.gtk.gtk.AssistantPageType type) {
        try {
            DowncallHandles.gtk_assistant_set_page_type.invokeExact(
                    handle(),
                    page.handle(),
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try {
            DowncallHandles.gtk_assistant_update_buttons_state.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_assistant_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Apply} callback.
     */
    @FunctionalInterface
    public interface Apply {
    
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
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceAssistant) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Apply.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Assistant.Apply> onApply(Assistant.Apply handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("apply", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Cancel} callback.
     */
    @FunctionalInterface
    public interface Cancel {
    
        /**
         * Emitted when then the cancel button is clicked.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceAssistant) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Cancel.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when then the cancel button is clicked.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Assistant.Cancel> onCancel(Assistant.Cancel handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("cancel", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Close} callback.
     */
    @FunctionalInterface
    public interface Close {
    
        /**
         * Emitted either when the close button of a summary page is clicked,
         * or when the apply button in the last page in the flow (of type
         * {@link AssistantPageType#CONFIRM}) is clicked.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceAssistant) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Close.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted either when the close button of a summary page is clicked,
     * or when the apply button in the last page in the flow (of type
     * {@link AssistantPageType#CONFIRM}) is clicked.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Assistant.Close> onClose(Assistant.Close handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("close", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Escape} callback.
     */
    @FunctionalInterface
    public interface Escape {
    
        /**
         * The action signal for the Escape binding.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceAssistant) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Escape.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * The action signal for the Escape binding.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Assistant.Escape> onEscape(Assistant.Escape handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("escape", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Prepare} callback.
     */
    @FunctionalInterface
    public interface Prepare {
    
        /**
         * Emitted when a new page is set as the assistant's current page,
         * before making the new page visible.
         * <p>
         * A handler for this signal can do any preparations which are
         * necessary before showing {@code page}.
         */
        void run(org.gtk.gtk.Widget page);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceAssistant, MemoryAddress page) {
            run((org.gtk.gtk.Widget) Interop.register(page, org.gtk.gtk.Widget.fromAddress).marshal(page, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Prepare.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a new page is set as the assistant's current page,
     * before making the new page visible.
     * <p>
     * A handler for this signal can do any preparations which are
     * necessary before showing {@code page}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Assistant.Prepare> onPrepare(Assistant.Prepare handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("prepare", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Assistant.Builder} object constructs a {@link Assistant} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Assistant.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Window.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Assistant} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Assistant}.
         * @return A new instance of {@code Assistant} with the properties 
         *         that were set in the Builder object.
         */
        public Assistant build() {
            return (Assistant) org.gtk.gobject.GObject.newWithProperties(
                Assistant.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * {@code GListModel} containing the pages.
         * @param pages The value for the {@code pages} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPages(org.gtk.gio.ListModel pages) {
            names.add("pages");
            values.add(org.gtk.gobject.Value.create(pages));
            return this;
        }
        
        /**
         * {@code true} if the assistant uses a {@code GtkHeaderBar} for action buttons
         * instead of the action-area.
         * <p>
         * For technical reasons, this property is declared as an integer
         * property, but you should only set it to {@code true} or {@code false}.
         * @param useHeaderBar The value for the {@code use-header-bar} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUseHeaderBar(int useHeaderBar) {
            names.add("use-header-bar");
            values.add(org.gtk.gobject.Value.create(useHeaderBar));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_assistant_new = Interop.downcallHandle(
                "gtk_assistant_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_assistant_add_action_widget = Interop.downcallHandle(
                "gtk_assistant_add_action_widget",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_assistant_append_page = Interop.downcallHandle(
                "gtk_assistant_append_page",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_assistant_commit = Interop.downcallHandle(
                "gtk_assistant_commit",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_assistant_get_current_page = Interop.downcallHandle(
                "gtk_assistant_get_current_page",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_assistant_get_n_pages = Interop.downcallHandle(
                "gtk_assistant_get_n_pages",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_assistant_get_nth_page = Interop.downcallHandle(
                "gtk_assistant_get_nth_page",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_assistant_get_page = Interop.downcallHandle(
                "gtk_assistant_get_page",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_assistant_get_page_complete = Interop.downcallHandle(
                "gtk_assistant_get_page_complete",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_assistant_get_page_title = Interop.downcallHandle(
                "gtk_assistant_get_page_title",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_assistant_get_page_type = Interop.downcallHandle(
                "gtk_assistant_get_page_type",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_assistant_get_pages = Interop.downcallHandle(
                "gtk_assistant_get_pages",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_assistant_insert_page = Interop.downcallHandle(
                "gtk_assistant_insert_page",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_assistant_next_page = Interop.downcallHandle(
                "gtk_assistant_next_page",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_assistant_prepend_page = Interop.downcallHandle(
                "gtk_assistant_prepend_page",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_assistant_previous_page = Interop.downcallHandle(
                "gtk_assistant_previous_page",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_assistant_remove_action_widget = Interop.downcallHandle(
                "gtk_assistant_remove_action_widget",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_assistant_remove_page = Interop.downcallHandle(
                "gtk_assistant_remove_page",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_assistant_set_current_page = Interop.downcallHandle(
                "gtk_assistant_set_current_page",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_assistant_set_forward_page_func = Interop.downcallHandle(
                "gtk_assistant_set_forward_page_func",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_assistant_set_page_complete = Interop.downcallHandle(
                "gtk_assistant_set_page_complete",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_assistant_set_page_title = Interop.downcallHandle(
                "gtk_assistant_set_page_title",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_assistant_set_page_type = Interop.downcallHandle(
                "gtk_assistant_set_page_type",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_assistant_update_buttons_state = Interop.downcallHandle(
                "gtk_assistant_update_buttons_state",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_assistant_get_type = Interop.downcallHandle(
                "gtk_assistant_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_assistant_get_type != null;
    }
}
