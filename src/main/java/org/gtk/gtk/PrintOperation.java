package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkPrintOperation} is the high-level, portable printing API.
 * <p>
 * It looks a bit different than other GTK dialogs such as the
 * {@code GtkFileChooser}, since some platforms don’t expose enough
 * infrastructure to implement a good print dialog. On such
 * platforms, {@code GtkPrintOperation} uses the native print dialog.
 * On platforms which do not provide a native print dialog, GTK
 * uses its own, see {@link PrintUnixDialog}.
 * <p>
 * The typical way to use the high-level printing API is to create
 * a {@code GtkPrintOperation} object with {@link PrintOperation#PrintOperation}
 * when the user selects to print. Then you set some properties on it,
 * e.g. the page size, any {@link PrintSettings} from previous print
 * operations, the number of pages, the current page, etc.
 * <p>
 * Then you start the print operation by calling {@link PrintOperation#run}.
 * It will then show a dialog, let the user select a printer and options.
 * When the user finished the dialog, various signals will be emitted on
 * the {@code GtkPrintOperation}, the main one being
 * {@code Gtk.PrintOperation::draw-page}, which you are supposed to handle
 * and render the page on the provided {@link PrintContext} using Cairo.
 * <p>
 * <h1>The high-level printing API</h1>
 * <p>
 * <pre>{@code c
 * static GtkPrintSettings *settings = NULL;
 * 
 * static void
 * do_print (void)
 * {
 *   GtkPrintOperation *print;
 *   GtkPrintOperationResult res;
 * 
 *   print = gtk_print_operation_new ();
 * 
 *   if (settings != NULL)
 *     gtk_print_operation_set_print_settings (print, settings);
 * 
 *   g_signal_connect (print, "begin_print", G_CALLBACK (begin_print), NULL);
 *   g_signal_connect (print, "draw_page", G_CALLBACK (draw_page), NULL);
 * 
 *   res = gtk_print_operation_run (print, GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG,
 *                                  GTK_WINDOW (main_window), NULL);
 * 
 *   if (res == GTK_PRINT_OPERATION_RESULT_APPLY)
 *     {
 *       if (settings != NULL)
 *         g_object_unref (settings);
 *       settings = g_object_ref (gtk_print_operation_get_print_settings (print));
 *     }
 * 
 *   g_object_unref (print);
 * }
 * }</pre>
 * <p>
 * By default {@code GtkPrintOperation} uses an external application to do
 * print preview. To implement a custom print preview, an application
 * must connect to the preview signal. The functions
 * {@link PrintOperationPreview#renderPage},
 * {@link PrintOperationPreview#endPreview} and
 * {@link PrintOperationPreview#isSelected}
 * are useful when implementing a print preview.
 */
public class PrintOperation extends org.gtk.gobject.Object implements PrintOperationPreview {

    public PrintOperation(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PrintOperation */
    public static PrintOperation castFrom(org.gtk.gobject.Object gobject) {
        return new PrintOperation(gobject.refcounted());
    }
    
    static final MethodHandle gtk_print_operation_new = Interop.downcallHandle(
        "gtk_print_operation_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_print_operation_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkPrintOperation}.
     */
    public PrintOperation() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_print_operation_cancel = Interop.downcallHandle(
        "gtk_print_operation_cancel",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Cancels a running print operation.
     * <p>
     * This function may be called from a {@code Gtk.PrintOperation::begin-print},
     * {@code Gtk.PrintOperation::draw-page}
     * signal handler to stop the currently running print operation.
     */
    public void cancel() {
        try {
            gtk_print_operation_cancel.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_draw_page_finish = Interop.downcallHandle(
        "gtk_print_operation_draw_page_finish",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Signal that drawing of particular page is complete.
     * <p>
     * It is called after completion of page drawing (e.g. drawing
     * in another thread). If {@link PrintOperation#setDeferDrawing}
     * was called before, then this function has to be called by application.
     * Otherwise it is called by GTK itself.
     */
    public void drawPageFinish() {
        try {
            gtk_print_operation_draw_page_finish.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_get_default_page_setup = Interop.downcallHandle(
        "gtk_print_operation_get_default_page_setup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the default page setup.
     */
    public PageSetup getDefaultPageSetup() {
        try {
            var RESULT = (MemoryAddress) gtk_print_operation_get_default_page_setup.invokeExact(handle());
            return new PageSetup(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_get_embed_page_setup = Interop.downcallHandle(
        "gtk_print_operation_get_embed_page_setup",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether page setup selection combos are embedded
     */
    public boolean getEmbedPageSetup() {
        try {
            var RESULT = (int) gtk_print_operation_get_embed_page_setup.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_get_error = Interop.downcallHandle(
        "gtk_print_operation_get_error",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Call this when the result of a print operation is
     * {@link PrintOperationResult#ERROR}.
     * <p>
     * It can be called either after {@link PrintOperation#run}
     * returns, or in the {@code Gtk.PrintOperation::done} signal
     * handler.
     * <p>
     * The returned {@code GError} will contain more details on what went wrong.
     */
    public void getError() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            gtk_print_operation_get_error.invokeExact(handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_get_has_selection = Interop.downcallHandle(
        "gtk_print_operation_get_has_selection",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether there is a selection.
     */
    public boolean getHasSelection() {
        try {
            var RESULT = (int) gtk_print_operation_get_has_selection.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_get_n_pages_to_print = Interop.downcallHandle(
        "gtk_print_operation_get_n_pages_to_print",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of pages that will be printed.
     * <p>
     * Note that this value is set during print preparation phase
     * ({@link PrintStatus#PREPARING}), so this function should never be
     * called before the data generation phase ({@link PrintStatus#GENERATING_DATA}).
     * You can connect to the {@code Gtk.PrintOperation::status-changed}
     * signal and call gtk_print_operation_get_n_pages_to_print() when
     * print status is {@link PrintStatus#GENERATING_DATA}.
     * <p>
     * This is typically used to track the progress of print operation.
     */
    public int getNPagesToPrint() {
        try {
            var RESULT = (int) gtk_print_operation_get_n_pages_to_print.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_get_print_settings = Interop.downcallHandle(
        "gtk_print_operation_get_print_settings",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current print settings.
     * <p>
     * Note that the return value is {@code null} until either
     * {@link PrintOperation#setPrintSettings} or
     * {@link PrintOperation#run} have been called.
     */
    public PrintSettings getPrintSettings() {
        try {
            var RESULT = (MemoryAddress) gtk_print_operation_get_print_settings.invokeExact(handle());
            return new PrintSettings(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_get_status = Interop.downcallHandle(
        "gtk_print_operation_get_status",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the status of the print operation.
     * <p>
     * Also see {@link PrintOperation#getStatusString}.
     */
    public PrintStatus getStatus() {
        try {
            var RESULT = (int) gtk_print_operation_get_status.invokeExact(handle());
            return new PrintStatus(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_get_status_string = Interop.downcallHandle(
        "gtk_print_operation_get_status_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a string representation of the status of the
     * print operation.
     * <p>
     * The string is translated and suitable for displaying
     * the print status e.g. in a {@code GtkStatusbar}.
     * <p>
     * Use {@link PrintOperation#getStatus} to obtain
     * a status value that is suitable for programmatic use.
     */
    public java.lang.String getStatusString() {
        try {
            var RESULT = (MemoryAddress) gtk_print_operation_get_status_string.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_get_support_selection = Interop.downcallHandle(
        "gtk_print_operation_get_support_selection",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the application supports print of selection
     */
    public boolean getSupportSelection() {
        try {
            var RESULT = (int) gtk_print_operation_get_support_selection.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_is_finished = Interop.downcallHandle(
        "gtk_print_operation_is_finished",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * A convenience function to find out if the print operation
     * is finished.
     * <p>
     * a print operation is finished if its status is either
     * {@link PrintStatus#FINISHED} or {@link PrintStatus#FINISHED_ABORTED}.
     * <p>
     * Note: when you enable print status tracking the print operation
     * can be in a non-finished state even after done has been called, as
     * the operation status then tracks the print job status on the printer.
     */
    public boolean isFinished() {
        try {
            var RESULT = (int) gtk_print_operation_is_finished.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_run = Interop.downcallHandle(
        "gtk_print_operation_run",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Runs the print operation.
     * <p>
     * Normally that this function does not return until the rendering
     * of all pages is complete. You can connect to the
     * {@code Gtk.PrintOperation::status-changed} signal on {@code op} to obtain
     * some information about the progress of the print operation.
     * <p>
     * Furthermore, it may use a recursive mainloop to show the print dialog.
     * <p>
     * If you set the [Gtk.PrintOperation:allow-async] property, the operation
     * will run asynchronously if this is supported on the platform. The
     * {@code Gtk.PrintOperation::done} signal will be emitted with the result
     * of the operation when the it is done (i.e. when the dialog is canceled,
     * or when the print succeeds or fails).
     * <p>
     * <pre>{@code c
     * if (settings != NULL)
     *   gtk_print_operation_set_print_settings (print, settings);
     * 
     * if (page_setup != NULL)
     *   gtk_print_operation_set_default_page_setup (print, page_setup);
     * 
     * g_signal_connect (print, "begin-print",
     *                   G_CALLBACK (begin_print), &data);
     * g_signal_connect (print, "draw-page",
     *                   G_CALLBACK (draw_page), &data);
     * 
     * res = gtk_print_operation_run (print,
     *                                GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG,
     *                                parent,
     *                                &error);
     * 
     * if (res == GTK_PRINT_OPERATION_RESULT_ERROR)
     *  {
     *    error_dialog = gtk_message_dialog_new (GTK_WINDOW (parent),
     *   			                     GTK_DIALOG_DESTROY_WITH_PARENT,
     * 					     GTK_MESSAGE_ERROR,
     * 					     GTK_BUTTONS_CLOSE,
     * 					     "Error printing file:\\n%s",
     * 					     error->message);
     *    g_signal_connect (error_dialog, "response",
     *                      G_CALLBACK (gtk_window_destroy), NULL);
     *    gtk_widget_show (error_dialog);
     *    g_error_free (error);
     *  }
     * else if (res == GTK_PRINT_OPERATION_RESULT_APPLY)
     *  {
     *    if (settings != NULL)
     * g_object_unref (settings);
     *    settings = g_object_ref (gtk_print_operation_get_print_settings (print));
     *  }
     * }</pre>
     * <p>
     * Note that gtk_print_operation_run() can only be called once on a
     * given {@code GtkPrintOperation}.
     */
    public PrintOperationResult run(PrintOperationAction action, Window parent) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gtk_print_operation_run.invokeExact(handle(), action.getValue(), parent.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PrintOperationResult(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_set_allow_async = Interop.downcallHandle(
        "gtk_print_operation_set_allow_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether gtk_print_operation_run() may return
     * before the print operation is completed.
     * <p>
     * Note that some platforms may not allow asynchronous
     * operation.
     */
    public void setAllowAsync(boolean allowAsync) {
        try {
            gtk_print_operation_set_allow_async.invokeExact(handle(), allowAsync ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_set_current_page = Interop.downcallHandle(
        "gtk_print_operation_set_current_page",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the current page.
     * <p>
     * If this is called before {@link PrintOperation#run},
     * the user will be able to select to print only the current page.
     * <p>
     * Note that this only makes sense for pre-paginated documents.
     */
    public void setCurrentPage(int currentPage) {
        try {
            gtk_print_operation_set_current_page.invokeExact(handle(), currentPage);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_set_custom_tab_label = Interop.downcallHandle(
        "gtk_print_operation_set_custom_tab_label",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the label for the tab holding custom widgets.
     */
    public void setCustomTabLabel(java.lang.String label) {
        try {
            gtk_print_operation_set_custom_tab_label.invokeExact(handle(), Interop.allocateNativeString(label).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_set_default_page_setup = Interop.downcallHandle(
        "gtk_print_operation_set_default_page_setup",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes {@code default_page_setup} the default page setup for {@code op}.
     * <p>
     * This page setup will be used by {@link PrintOperation#run},
     * but it can be overridden on a per-page basis by connecting
     * to the {@code Gtk.PrintOperation::request-page-setup} signal.
     */
    public void setDefaultPageSetup(PageSetup defaultPageSetup) {
        try {
            gtk_print_operation_set_default_page_setup.invokeExact(handle(), defaultPageSetup.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_set_defer_drawing = Interop.downcallHandle(
        "gtk_print_operation_set_defer_drawing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Sets up the {@code GtkPrintOperation} to wait for calling of
     * [method{@code Gtk}.PrintOperation.draw_page_finish from application.
     * <p>
     * This can be used for drawing page in another thread.
     * <p>
     * This function must be called in the callback of the
     * {@code Gtk.PrintOperation::draw-page} signal.
     */
    public void setDeferDrawing() {
        try {
            gtk_print_operation_set_defer_drawing.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_set_embed_page_setup = Interop.downcallHandle(
        "gtk_print_operation_set_embed_page_setup",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Embed page size combo box and orientation combo box into page setup page.
     * <p>
     * Selected page setup is stored as default page setup in {@code GtkPrintOperation}.
     */
    public void setEmbedPageSetup(boolean embed) {
        try {
            gtk_print_operation_set_embed_page_setup.invokeExact(handle(), embed ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_set_export_filename = Interop.downcallHandle(
        "gtk_print_operation_set_export_filename",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets up the {@code GtkPrintOperation} to generate a file instead
     * of showing the print dialog.
     * <p>
     * The intended use of this function is for implementing
     * “Export to PDF” actions. Currently, PDF is the only supported
     * format.
     * <p>
     * “Print to PDF” support is independent of this and is done
     * by letting the user pick the “Print to PDF” item from the list
     * of printers in the print dialog.
     */
    public void setExportFilename(java.lang.String filename) {
        try {
            gtk_print_operation_set_export_filename.invokeExact(handle(), Interop.allocateNativeString(filename).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_set_has_selection = Interop.downcallHandle(
        "gtk_print_operation_set_has_selection",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether there is a selection to print.
     * <p>
     * Application has to set number of pages to which the selection
     * will draw by {@link PrintOperation#setNPages} in a handler
     * for the {@code Gtk.PrintOperation::begin-print} signal.
     */
    public void setHasSelection(boolean hasSelection) {
        try {
            gtk_print_operation_set_has_selection.invokeExact(handle(), hasSelection ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_set_job_name = Interop.downcallHandle(
        "gtk_print_operation_set_job_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the name of the print job.
     * <p>
     * The name is used to identify the job (e.g. in monitoring
     * applications like eggcups).
     * <p>
     * If you don’t set a job name, GTK picks a default one by
     * numbering successive print jobs.
     */
    public void setJobName(java.lang.String jobName) {
        try {
            gtk_print_operation_set_job_name.invokeExact(handle(), Interop.allocateNativeString(jobName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_set_n_pages = Interop.downcallHandle(
        "gtk_print_operation_set_n_pages",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the number of pages in the document.
     * <p>
     * This must be set to a positive number before the rendering
     * starts. It may be set in a {@code Gtk.PrintOperation::begin-print}
     * signal handler.
     * <p>
     * Note that the page numbers passed to the
     * {@code Gtk.PrintOperation::request-page-setup}
     * and {@code Gtk.PrintOperation::draw-page} signals are 0-based, i.e.
     * if the user chooses to print all pages, the last ::draw-page signal
     * will be for page {@code n_pages} - 1.
     */
    public void setNPages(int nPages) {
        try {
            gtk_print_operation_set_n_pages.invokeExact(handle(), nPages);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_set_print_settings = Interop.downcallHandle(
        "gtk_print_operation_set_print_settings",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the print settings for {@code op}.
     * <p>
     * This is typically used to re-establish print settings
     * from a previous print operation, see {@link PrintOperation#run}.
     */
    public void setPrintSettings(PrintSettings printSettings) {
        try {
            gtk_print_operation_set_print_settings.invokeExact(handle(), printSettings.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_set_show_progress = Interop.downcallHandle(
        "gtk_print_operation_set_show_progress",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If {@code show_progress} is {@code true}, the print operation will show
     * a progress dialog during the print operation.
     */
    public void setShowProgress(boolean showProgress) {
        try {
            gtk_print_operation_set_show_progress.invokeExact(handle(), showProgress ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_set_support_selection = Interop.downcallHandle(
        "gtk_print_operation_set_support_selection",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether selection is supported by {@code GtkPrintOperation}.
     */
    public void setSupportSelection(boolean supportSelection) {
        try {
            gtk_print_operation_set_support_selection.invokeExact(handle(), supportSelection ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_set_track_print_status = Interop.downcallHandle(
        "gtk_print_operation_set_track_print_status",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If track_status is {@code true}, the print operation will try to continue
     * report on the status of the print job in the printer queues and printer.
     * <p>
     * This can allow your application to show things like “out of paper”
     * issues, and when the print job actually reaches the printer.
     * <p>
     * This function is often implemented using some form of polling,
     * so it should not be enabled unless needed.
     */
    public void setTrackPrintStatus(boolean trackStatus) {
        try {
            gtk_print_operation_set_track_print_status.invokeExact(handle(), trackStatus ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_set_unit = Interop.downcallHandle(
        "gtk_print_operation_set_unit",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets up the transformation for the cairo context obtained from
     * {@code GtkPrintContext} in such a way that distances are measured in
     * units of {@code unit}.
     */
    public void setUnit(Unit unit) {
        try {
            gtk_print_operation_set_unit.invokeExact(handle(), unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_operation_set_use_full_page = Interop.downcallHandle(
        "gtk_print_operation_set_use_full_page",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If {@code full_page} is {@code true}, the transformation for the cairo context
     * obtained from {@code GtkPrintContext} puts the origin at the top left
     * corner of the page.
     * <p>
     * This may not be the top left corner of the sheet, depending on page
     * orientation and the number of pages per sheet). Otherwise, the origin
     * is at the top left corner of the imageable area (i.e. inside the margins).
     */
    public void setUseFullPage(boolean fullPage) {
        try {
            gtk_print_operation_set_use_full_page.invokeExact(handle(), fullPage ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface BeginPrintHandler {
        void signalReceived(PrintOperation source, PrintContext context);
    }
    
    /**
     * Emitted after the user has finished changing print settings
     * in the dialog, before the actual rendering starts.
     * <p>
     * A typical use for ::begin-print is to use the parameters from the
     * {@link PrintContext} and paginate the document accordingly,
     * and then set the number of pages with
     * {@link PrintOperation#setNPages}.
     */
    public SignalHandle onBeginPrint(BeginPrintHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("begin-print").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationBeginPrint",
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
    public interface CreateCustomWidgetHandler {
        void signalReceived(PrintOperation source);
    }
    
    /**
     * Emitted when displaying the print dialog.
     * <p>
     * If you return a widget in a handler for this signal it will be
     * added to a custom tab in the print dialog. You typically return a
     * container widget with multiple widgets in it.
     * <p>
     * The print dialog owns the returned widget, and its lifetime is not
     * controlled by the application. However, the widget is guaranteed
     * to stay around until the {@code Gtk.PrintOperation::custom-widget-apply}
     * signal is emitted on the operation. Then you can read out any
     * information you need from the widgets.
     */
    public SignalHandle onCreateCustomWidget(CreateCustomWidgetHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("create-custom-widget").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationCreateCustomWidget",
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
    public interface CustomWidgetApplyHandler {
        void signalReceived(PrintOperation source, Widget widget);
    }
    
    /**
     * Emitted right before ::begin-print if you added
     * a custom widget in the ::create-custom-widget handler.
     * <p>
     * When you get this signal you should read the information from the
     * custom widgets, as the widgets are not guaranteed to be around at a
     * later time.
     */
    public SignalHandle onCustomWidgetApply(CustomWidgetApplyHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("custom-widget-apply").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationCustomWidgetApply",
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
    public interface DoneHandler {
        void signalReceived(PrintOperation source, PrintOperationResult result);
    }
    
    /**
     * Emitted when the print operation run has finished doing
     * everything required for printing.
     * <p>
     * {@code result} gives you information about what happened during the run.
     * If {@code result} is {@link PrintOperationResult#ERROR} then you can call
     * {@link PrintOperation#getError} for more information.
     * <p>
     * If you enabled print status tracking then
     * {@link PrintOperation#isFinished} may still return {@code false}
     * after the ::done signal was emitted.
     */
    public SignalHandle onDone(DoneHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("done").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationDone",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DrawPageHandler {
        void signalReceived(PrintOperation source, PrintContext context, int pageNr);
    }
    
    /**
     * Emitted for every page that is printed.
     * <p>
     * The signal handler must render the {@code page_nr}'s page onto the cairo
     * context obtained from {@code context} using
     * {@link PrintContext#getCairoContext}.
     * <p>
     * <pre>{@code c
     * static void
     * draw_page (GtkPrintOperation *operation,
     *            GtkPrintContext   *context,
     *            int                page_nr,
     *            gpointer           user_data)
     * {
     *   cairo_t *cr;
     *   PangoLayout *layout;
     *   double width, text_height;
     *   int layout_height;
     *   PangoFontDescription *desc;
     *   
     *   cr = gtk_print_context_get_cairo_context (context);
     *   width = gtk_print_context_get_width (context);
     *   
     *   cairo_rectangle (cr, 0, 0, width, HEADER_HEIGHT);
     *   
     *   cairo_set_source_rgb (cr, 0.8, 0.8, 0.8);
     *   cairo_fill (cr);
     *   
     *   layout = gtk_print_context_create_pango_layout (context);
     *   
     *   desc = pango_font_description_from_string ("sans 14");
     *   pango_layout_set_font_description (layout, desc);
     *   pango_font_description_free (desc);
     *   
     *   pango_layout_set_text (layout, "some text", -1);
     *   pango_layout_set_width (layout, width * PANGO_SCALE);
     *   pango_layout_set_alignment (layout, PANGO_ALIGN_CENTER);
     *      		      
     *   pango_layout_get_size (layout, NULL, &layout_height);
     *   text_height = (double)layout_height / PANGO_SCALE;
     *   
     *   cairo_move_to (cr, width / 2,  (HEADER_HEIGHT - text_height) / 2);
     *   pango_cairo_show_layout (cr, layout);
     *   
     *   g_object_unref (layout);
     * }
     * }</pre>
     * <p>
     * Use {@link PrintOperation#setUseFullPage} and
     * {@link PrintOperation#setUnit} before starting the print
     * operation to set up the transformation of the cairo context
     * according to your needs.
     */
    public SignalHandle onDrawPage(DrawPageHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("draw-page").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationDrawPage",
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
    public interface EndPrintHandler {
        void signalReceived(PrintOperation source, PrintContext context);
    }
    
    /**
     * Emitted after all pages have been rendered.
     * <p>
     * A handler for this signal can clean up any resources that have
     * been allocated in the {@code Gtk.PrintOperation::begin-print} handler.
     */
    public SignalHandle onEndPrint(EndPrintHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("end-print").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationEndPrint",
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
    public interface PaginateHandler {
        boolean signalReceived(PrintOperation source, PrintContext context);
    }
    
    /**
     * Emitted after the ::begin-print signal, but before the actual rendering
     * starts.
     * <p>
     * It keeps getting emitted until a connected signal handler returns {@code true}.
     * <p>
     * The ::paginate signal is intended to be used for paginating a document
     * in small chunks, to avoid blocking the user interface for a long
     * time. The signal handler should update the number of pages using
     * {@link PrintOperation#setNPages}, and return {@code true} if the document
     * has been completely paginated.
     * <p>
     * If you don't need to do pagination in chunks, you can simply do
     * it all in the ::begin-print handler, and set the number of pages
     * from there.
     */
    public SignalHandle onPaginate(PaginateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("paginate").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationPaginate",
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
    public interface PreviewHandler {
        boolean signalReceived(PrintOperation source, PrintOperationPreview preview, PrintContext context, Window parent);
    }
    
    /**
     * Gets emitted when a preview is requested from the native dialog.
     * <p>
     * The default handler for this signal uses an external viewer
     * application to preview.
     * <p>
     * To implement a custom print preview, an application must return
     * {@code true} from its handler for this signal. In order to use the
     * provided {@code context} for the preview implementation, it must be
     * given a suitable cairo context with
     * {@link PrintContext#setCairoContext}.
     * <p>
     * The custom preview implementation can use
     * {@link PrintOperationPreview#isSelected} and
     * {@link PrintOperationPreview#renderPage} to find pages which
     * are selected for print and render them. The preview must be
     * finished by calling {@link PrintOperationPreview#endPreview}
     * (typically in response to the user clicking a close button).
     */
    public SignalHandle onPreview(PreviewHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("preview").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationPreview",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RequestPageSetupHandler {
        void signalReceived(PrintOperation source, PrintContext context, int pageNr, PageSetup setup);
    }
    
    /**
     * Emitted once for every page that is printed.
     * <p>
     * This gives the application a chance to modify the page setup.
     * Any changes done to {@code setup} will be in force only for printing
     * this page.
     */
    public SignalHandle onRequestPageSetup(RequestPageSetupHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("request-page-setup").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationRequestPageSetup",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface StatusChangedHandler {
        void signalReceived(PrintOperation source);
    }
    
    /**
     * Emitted at between the various phases of the print operation.
     * <p>
     * See {@code Gtk.PrintStatus} for the phases that are being discriminated.
     * Use {@link PrintOperation#getStatus} to find out the current
     * status.
     */
    public SignalHandle onStatusChanged(StatusChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("status-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationStatusChanged",
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
    public interface UpdateCustomWidgetHandler {
        void signalReceived(PrintOperation source, Widget widget, PageSetup setup, PrintSettings settings);
    }
    
    /**
     * Emitted after change of selected printer.
     * <p>
     * The actual page setup and print settings are passed to the custom
     * widget, which can actualize itself according to this change.
     */
    public SignalHandle onUpdateCustomWidget(UpdateCustomWidgetHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("update-custom-widget").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintOperation.Callbacks.class, "signalPrintOperationUpdateCustomWidget",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalPrintOperationBeginPrint(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (PrintOperation.BeginPrintHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new PrintOperation(Refcounted.get(source)), new PrintContext(Refcounted.get(context, false)));
        }
        
        public static void signalPrintOperationCreateCustomWidget(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (PrintOperation.CreateCustomWidgetHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new PrintOperation(Refcounted.get(source)));
        }
        
        public static void signalPrintOperationCustomWidgetApply(MemoryAddress source, MemoryAddress widget, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (PrintOperation.CustomWidgetApplyHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new PrintOperation(Refcounted.get(source)), new Widget(Refcounted.get(widget, false)));
        }
        
        public static void signalPrintOperationDone(MemoryAddress source, int result, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (PrintOperation.DoneHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new PrintOperation(Refcounted.get(source)), new PrintOperationResult(result));
        }
        
        public static void signalPrintOperationDrawPage(MemoryAddress source, MemoryAddress context, int pageNr, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (PrintOperation.DrawPageHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new PrintOperation(Refcounted.get(source)), new PrintContext(Refcounted.get(context, false)), pageNr);
        }
        
        public static void signalPrintOperationEndPrint(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (PrintOperation.EndPrintHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new PrintOperation(Refcounted.get(source)), new PrintContext(Refcounted.get(context, false)));
        }
        
        public static boolean signalPrintOperationPaginate(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (PrintOperation.PaginateHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new PrintOperation(Refcounted.get(source)), new PrintContext(Refcounted.get(context, false)));
        }
        
        public static boolean signalPrintOperationPreview(MemoryAddress source, MemoryAddress preview, MemoryAddress context, MemoryAddress parent, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (PrintOperation.PreviewHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new PrintOperation(Refcounted.get(source)), new PrintOperationPreview.PrintOperationPreviewImpl(Refcounted.get(preview, false)), new PrintContext(Refcounted.get(context, false)), new Window(Refcounted.get(parent, false)));
        }
        
        public static void signalPrintOperationRequestPageSetup(MemoryAddress source, MemoryAddress context, int pageNr, MemoryAddress setup, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (PrintOperation.RequestPageSetupHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new PrintOperation(Refcounted.get(source)), new PrintContext(Refcounted.get(context, false)), pageNr, new PageSetup(Refcounted.get(setup, false)));
        }
        
        public static void signalPrintOperationStatusChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (PrintOperation.StatusChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new PrintOperation(Refcounted.get(source)));
        }
        
        public static void signalPrintOperationUpdateCustomWidget(MemoryAddress source, MemoryAddress widget, MemoryAddress setup, MemoryAddress settings, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (PrintOperation.UpdateCustomWidgetHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new PrintOperation(Refcounted.get(source)), new Widget(Refcounted.get(widget, false)), new PageSetup(Refcounted.get(setup, false)), new PrintSettings(Refcounted.get(settings, false)));
        }
        
    }
}