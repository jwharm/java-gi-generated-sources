package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkPrinter} object represents a printer.
 * <p>
 * You only need to deal directly with printers if you use the
 * non-portable {@link PrintUnixDialog} API.
 * <p>
 * A {@code GtkPrinter} allows to get status information about the printer,
 * such as its description, its location, the number of queued jobs,
 * etc. Most importantly, a {@code GtkPrinter} object can be used to create
 * a {@link PrintJob} object, which lets you print to the printer.
 */
public class Printer extends org.gtk.gobject.Object {

    public Printer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Printer */
    public static Printer castFrom(org.gtk.gobject.Object gobject) {
        return new Printer(gobject.refcounted());
    }
    
    static final MethodHandle gtk_printer_new = Interop.downcallHandle(
        "gtk_printer_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(java.lang.String name, PrintBackend backend, boolean virtual) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_printer_new.invokeExact(Interop.allocateNativeString(name).handle(), backend.handle(), virtual ? 1 : 0), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkPrinter}.
     */
    public Printer(java.lang.String name, PrintBackend backend, boolean virtual) {
        super(constructNew(name, backend, virtual));
    }
    
    static final MethodHandle gtk_printer_accepts_pdf = Interop.downcallHandle(
        "gtk_printer_accepts_pdf",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the printer accepts input in
     * PDF format.
     */
    public boolean acceptsPdf() {
        try {
            var RESULT = (int) gtk_printer_accepts_pdf.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_accepts_ps = Interop.downcallHandle(
        "gtk_printer_accepts_ps",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the printer accepts input in
     * PostScript format.
     */
    public boolean acceptsPs() {
        try {
            var RESULT = (int) gtk_printer_accepts_ps.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_compare = Interop.downcallHandle(
        "gtk_printer_compare",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares two printers.
     */
    public int compare(Printer b) {
        try {
            var RESULT = (int) gtk_printer_compare.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_get_backend = Interop.downcallHandle(
        "gtk_printer_get_backend",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the backend of the printer.
     */
    public PrintBackend getBackend() {
        try {
            var RESULT = (MemoryAddress) gtk_printer_get_backend.invokeExact(handle());
            return new PrintBackend(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_get_capabilities = Interop.downcallHandle(
        "gtk_printer_get_capabilities",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the printer’s capabilities.
     * <p>
     * This is useful when you’re using {@code GtkPrintUnixDialog}’s
     * manual-capabilities setting and need to know which settings
     * the printer can handle and which you must handle yourself.
     * <p>
     * This will return 0 unless the printer’s details are
     * available, see {@link Printer#hasDetails} and
     * {@link Printer#requestDetails}.
     */
    public PrintCapabilities getCapabilities() {
        try {
            var RESULT = (int) gtk_printer_get_capabilities.invokeExact(handle());
            return new PrintCapabilities(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_get_default_page_size = Interop.downcallHandle(
        "gtk_printer_get_default_page_size",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns default page size of {@code printer}.
     */
    public PageSetup getDefaultPageSize() {
        try {
            var RESULT = (MemoryAddress) gtk_printer_get_default_page_size.invokeExact(handle());
            return new PageSetup(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_get_description = Interop.downcallHandle(
        "gtk_printer_get_description",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the description of the printer.
     */
    public java.lang.String getDescription() {
        try {
            var RESULT = (MemoryAddress) gtk_printer_get_description.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_get_hard_margins = Interop.downcallHandle(
        "gtk_printer_get_hard_margins",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieve the hard margins of {@code printer}.
     * <p>
     * These are the margins that define the area at the borders
     * of the paper that the printer cannot print to.
     * <p>
     * Note: This will not succeed unless the printer’s details are
     * available, see {@link Printer#hasDetails} and
     * {@link Printer#requestDetails}.
     */
    public boolean getHardMargins(PointerDouble top, PointerDouble bottom, PointerDouble left, PointerDouble right) {
        try {
            var RESULT = (int) gtk_printer_get_hard_margins.invokeExact(handle(), top.handle(), bottom.handle(), left.handle(), right.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_get_hard_margins_for_paper_size = Interop.downcallHandle(
        "gtk_printer_get_hard_margins_for_paper_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieve the hard margins of {@code printer} for {@code paper_size}.
     * <p>
     * These are the margins that define the area at the borders
     * of the paper that the printer cannot print to.
     * <p>
     * Note: This will not succeed unless the printer’s details are
     * available, see {@link Printer#hasDetails} and
     * {@link Printer#requestDetails}.
     */
    public boolean getHardMarginsForPaperSize(PaperSize paperSize, PointerDouble top, PointerDouble bottom, PointerDouble left, PointerDouble right) {
        try {
            var RESULT = (int) gtk_printer_get_hard_margins_for_paper_size.invokeExact(handle(), paperSize.handle(), top.handle(), bottom.handle(), left.handle(), right.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_get_icon_name = Interop.downcallHandle(
        "gtk_printer_get_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the icon to use for the printer.
     */
    public java.lang.String getIconName() {
        try {
            var RESULT = (MemoryAddress) gtk_printer_get_icon_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_get_job_count = Interop.downcallHandle(
        "gtk_printer_get_job_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of jobs currently queued on the printer.
     */
    public int getJobCount() {
        try {
            var RESULT = (int) gtk_printer_get_job_count.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_get_location = Interop.downcallHandle(
        "gtk_printer_get_location",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a description of the location of the printer.
     */
    public java.lang.String getLocation() {
        try {
            var RESULT = (MemoryAddress) gtk_printer_get_location.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_get_name = Interop.downcallHandle(
        "gtk_printer_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the name of the printer.
     */
    public java.lang.String getName() {
        try {
            var RESULT = (MemoryAddress) gtk_printer_get_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_get_state_message = Interop.downcallHandle(
        "gtk_printer_get_state_message",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the state message describing the current state
     * of the printer.
     */
    public java.lang.String getStateMessage() {
        try {
            var RESULT = (MemoryAddress) gtk_printer_get_state_message.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_has_details = Interop.downcallHandle(
        "gtk_printer_has_details",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the printer details are available.
     */
    public boolean hasDetails() {
        try {
            var RESULT = (int) gtk_printer_has_details.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_is_accepting_jobs = Interop.downcallHandle(
        "gtk_printer_is_accepting_jobs",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the printer is accepting jobs
     */
    public boolean isAcceptingJobs() {
        try {
            var RESULT = (int) gtk_printer_is_accepting_jobs.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_is_active = Interop.downcallHandle(
        "gtk_printer_is_active",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the printer is currently active (i.e.
     * accepts new jobs).
     */
    public boolean isActive() {
        try {
            var RESULT = (int) gtk_printer_is_active.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_is_default = Interop.downcallHandle(
        "gtk_printer_is_default",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the printer is the default printer.
     */
    public boolean isDefault() {
        try {
            var RESULT = (int) gtk_printer_is_default.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_is_paused = Interop.downcallHandle(
        "gtk_printer_is_paused",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the printer is currently paused.
     * <p>
     * A paused printer still accepts jobs, but it is not
     * printing them.
     */
    public boolean isPaused() {
        try {
            var RESULT = (int) gtk_printer_is_paused.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_is_virtual = Interop.downcallHandle(
        "gtk_printer_is_virtual",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the printer is virtual (i.e. does not
     * represent actual printer hardware, but something like
     * a CUPS class).
     */
    public boolean isVirtual() {
        try {
            var RESULT = (int) gtk_printer_is_virtual.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_list_papers = Interop.downcallHandle(
        "gtk_printer_list_papers",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Lists all the paper sizes {@code printer} supports.
     * <p>
     * This will return and empty list unless the printer’s details
     * are available, see {@link Printer#hasDetails} and
     * {@link Printer#requestDetails}.
     */
    public org.gtk.glib.List listPapers() {
        try {
            var RESULT = (MemoryAddress) gtk_printer_list_papers.invokeExact(handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_printer_request_details = Interop.downcallHandle(
        "gtk_printer_request_details",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Requests the printer details.
     * <p>
     * When the details are available, the
     * {@code Gtk.Printer::details-acquired} signal
     * will be emitted on {@code printer}.
     */
    public void requestDetails() {
        try {
            gtk_printer_request_details.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DetailsAcquiredHandler {
        void signalReceived(Printer source, boolean success);
    }
    
    /**
     * Emitted in response to a request for detailed information
     * about a printer from the print backend.
     * <p>
     * The {@code success} parameter indicates if the information was
     * actually obtained.
     */
    public SignalHandle onDetailsAcquired(DetailsAcquiredHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("details-acquired").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Printer.Callbacks.class, "signalPrinterDetailsAcquired",
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
    
    public static class Callbacks {
    
        public static void signalPrinterDetailsAcquired(MemoryAddress source, int success, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Printer.DetailsAcquiredHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Printer(Refcounted.get(source)), success != 0);
        }
        
    }
}
