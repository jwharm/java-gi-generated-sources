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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Assistant(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Assistant if its GType is a (or inherits from) "GtkAssistant".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Assistant} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkAssistant", a ClassCastException will be thrown.
     */
    public static Assistant castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), Assistant.getType())) {
            return new Assistant(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkAssistant");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Adds a widget to the action area of a {@code GtkAssistant}.
     * @param child a {@code GtkWidget}
     */
    public void addActionWidget(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
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
    public int appendPage(@NotNull org.gtk.gtk.Widget page) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
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
            DowncallHandles.gtk_assistant_commit.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gtk_assistant_get_current_page.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gtk_assistant_get_n_pages.invokeExact(
                    handle());
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
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the {@code GtkAssistantPage} object for {@code child}.
     * @param child a child of {@code assistant}
     * @return the {@code GtkAssistantPage} for {@code child}
     */
    public @NotNull org.gtk.gtk.AssistantPage getPage(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_assistant_get_page.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.AssistantPage(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether {@code page} is complete.
     * @param page a page of {@code assistant}
     * @return {@code true} if {@code page} is complete.
     */
    public boolean getPageComplete(@NotNull org.gtk.gtk.Widget page) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_assistant_get_page_complete.invokeExact(
                    handle(),
                    page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the title for {@code page}.
     * @param page a page of {@code assistant}
     * @return the title for {@code page}
     */
    public @NotNull java.lang.String getPageTitle(@NotNull org.gtk.gtk.Widget page) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_assistant_get_page_title.invokeExact(
                    handle(),
                    page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the page type of {@code page}.
     * @param page a page of {@code assistant}
     * @return the page type of {@code page}
     */
    public @NotNull org.gtk.gtk.AssistantPageType getPageType(@NotNull org.gtk.gtk.Widget page) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_assistant_get_page_type.invokeExact(
                    handle(),
                    page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.AssistantPageType(RESULT);
    }
    
    /**
     * Gets a list model of the assistant pages.
     * @return A list model of the pages.
     */
    public @NotNull org.gtk.gio.ListModel getPages() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_assistant_get_pages.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Inserts a page in the {@code assistant} at a given position.
     * @param page a {@code GtkWidget}
     * @param position the index (starting at 0) at which to insert the page,
     *   or -1 to append the page to the {@code assistant}
     * @return the index (starting from 0) of the inserted page
     */
    public int insertPage(@NotNull org.gtk.gtk.Widget page, int position) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
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
            DowncallHandles.gtk_assistant_next_page.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Prepends a page to the {@code assistant}.
     * @param page a {@code GtkWidget}
     * @return the index (starting at 0) of the inserted page
     */
    public int prependPage(@NotNull org.gtk.gtk.Widget page) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
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
            DowncallHandles.gtk_assistant_previous_page.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a widget from the action area of a {@code GtkAssistant}.
     * @param child a {@code GtkWidget}
     */
    public void removeActionWidget(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
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
     */
    public void setForwardPageFunc(@Nullable org.gtk.gtk.AssistantPageFunc pageFunc) {
        try {
            DowncallHandles.gtk_assistant_set_forward_page_func.invokeExact(
                    handle(),
                    (Addressable) (pageFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbAssistantPageFunc",
                            MethodType.methodType(int.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (pageFunc == null ? MemoryAddress.NULL : Interop.registerCallback(pageFunc)),
                    Interop.cbDestroyNotifySymbol());
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
    public void setPageComplete(@NotNull org.gtk.gtk.Widget page, boolean complete) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        try {
            DowncallHandles.gtk_assistant_set_page_complete.invokeExact(
                    handle(),
                    page.handle(),
                    complete ? 1 : 0);
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
    public void setPageTitle(@NotNull org.gtk.gtk.Widget page, @NotNull java.lang.String title) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        java.util.Objects.requireNonNull(title, "Parameter 'title' must not be null");
        try {
            DowncallHandles.gtk_assistant_set_page_title.invokeExact(
                    handle(),
                    page.handle(),
                    Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the page type for {@code page}.
     * <p>
     * The page type determines the page behavior in the {@code assistant}.
     * @param page a page of {@code assistant}
     * @param type the new type for {@code page}
     */
    public void setPageType(@NotNull org.gtk.gtk.Widget page, @NotNull org.gtk.gtk.AssistantPageType type) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
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
            DowncallHandles.gtk_assistant_update_buttons_state.invokeExact(
                    handle());
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
            RESULT = (long) DowncallHandles.gtk_assistant_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Apply {
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Assistant.Apply> onApply(Assistant.Apply handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("apply"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Assistant.Callbacks.class, "signalAssistantApply",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Assistant.Apply>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Cancel {
        void signalReceived(Assistant source);
    }
    
    /**
     * Emitted when then the cancel button is clicked.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Assistant.Cancel> onCancel(Assistant.Cancel handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("cancel"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Assistant.Callbacks.class, "signalAssistantCancel",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Assistant.Cancel>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Close {
        void signalReceived(Assistant source);
    }
    
    /**
     * Emitted either when the close button of a summary page is clicked,
     * or when the apply button in the last page in the flow (of type
     * {@link AssistantPageType#CONFIRM}) is clicked.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Assistant.Close> onClose(Assistant.Close handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("close"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Assistant.Callbacks.class, "signalAssistantClose",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Assistant.Close>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Escape {
        void signalReceived(Assistant source);
    }
    
    /**
     * The action signal for the Escape binding.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Assistant.Escape> onEscape(Assistant.Escape handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("escape"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Assistant.Callbacks.class, "signalAssistantEscape",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Assistant.Escape>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Prepare {
        void signalReceived(Assistant source, @NotNull org.gtk.gtk.Widget page);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("prepare"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Assistant.Callbacks.class, "signalAssistantPrepare",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Assistant.Prepare>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Window.Build {
        
         /**
         * A {@link Assistant.Build} object constructs a {@link Assistant} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Assistant} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Assistant} using {@link Assistant#castFrom}.
         * @return A new instance of {@code Assistant} with the properties 
         *         that were set in the Build object.
         */
        public Assistant construct() {
            return Assistant.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Assistant.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * {@code GListModel} containing the pages.
         * @param pages The value for the {@code pages} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPages(org.gtk.gio.ListModel pages) {
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
        public Build setUseHeaderBar(int useHeaderBar) {
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
    
    private static class Callbacks {
        
        public static void signalAssistantApply(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Assistant.Apply) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Assistant(source, Ownership.NONE));
        }
        
        public static void signalAssistantCancel(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Assistant.Cancel) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Assistant(source, Ownership.NONE));
        }
        
        public static void signalAssistantClose(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Assistant.Close) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Assistant(source, Ownership.NONE));
        }
        
        public static void signalAssistantEscape(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Assistant.Escape) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Assistant(source, Ownership.NONE));
        }
        
        public static void signalAssistantPrepare(MemoryAddress source, MemoryAddress page, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Assistant.Prepare) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Assistant(source, Ownership.NONE), new org.gtk.gtk.Widget(page, Ownership.NONE));
        }
    }
}
